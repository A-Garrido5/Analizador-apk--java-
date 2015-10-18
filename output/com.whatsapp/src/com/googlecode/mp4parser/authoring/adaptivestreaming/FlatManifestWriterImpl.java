// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.googlecode.mp4parser.authoring.Movie;
import org.w3c.dom.Document;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.authoring.Sample;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import java.util.logging.Logger;

public class FlatManifestWriterImpl extends AbstractManifestWriter
{
    private static final Logger LOG;
    
    static {
        LOG = Logger.getLogger(FlatManifestWriterImpl.class.getName());
    }
    
    protected FlatManifestWriterImpl(final FragmentIntersectionFinder fragmentIntersectionFinder) {
        super(fragmentIntersectionFinder);
    }
    
    private AudioQuality getAacAudioQuality(final Track track, final AudioSampleEntry audioSampleEntry) {
        final AudioQuality audioQuality = new AudioQuality();
        final AudioSpecificConfig audioSpecificInfo = audioSampleEntry.getBoxes(ESDescriptorBox.class).get(0).getEsDescriptor().getDecoderConfigDescriptor().getAudioSpecificInfo();
        if (audioSpecificInfo.getSbrPresentFlag() == 1) {
            audioQuality.fourCC = "AACH";
        }
        else if (audioSpecificInfo.getPsPresentFlag() == 1) {
            audioQuality.fourCC = "AACP";
        }
        else {
            audioQuality.fourCC = "AACL";
        }
        audioQuality.bitrate = this.getBitrate(track);
        audioQuality.audioTag = 255;
        audioQuality.samplingRate = audioSampleEntry.getSampleRate();
        audioQuality.channels = audioSampleEntry.getChannelCount();
        audioQuality.bitPerSample = audioSampleEntry.getSampleSize();
        audioQuality.packetSize = 4;
        audioQuality.codecPrivateData = this.getAudioCodecPrivateData(audioSpecificInfo);
        return audioQuality;
    }
    
    private String getAudioCodecPrivateData(final AudioSpecificConfig audioSpecificConfig) {
        return Hex.encodeHex(audioSpecificConfig.getConfigBytes());
    }
    
    private AudioQuality getAudioQuality(final Track track, final AudioSampleEntry audioSampleEntry) {
        if (this.getFormat(audioSampleEntry).equals("mp4a")) {
            return this.getAacAudioQuality(track, audioSampleEntry);
        }
        if (this.getFormat(audioSampleEntry).equals("ec-3")) {
            return this.getEc3AudioQuality(track, audioSampleEntry);
        }
        if (this.getFormat(audioSampleEntry).startsWith("dts")) {
            return this.getDtsAudioQuality(track, audioSampleEntry);
        }
        throw new InternalError("I don't know what to do with audio of type " + this.getFormat(audioSampleEntry));
    }
    
    private byte[] getAvcCodecPrivateData(final AvcConfigurationBox avcConfigurationBox) {
        while (true) {
            final List<byte[]> sequenceParameterSets = avcConfigurationBox.getSequenceParameterSets();
            final List<byte[]> pictureParameterSets = avcConfigurationBox.getPictureParameterSets();
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                Iterator<byte[]> iterator2;
                try {
                    byteArrayOutputStream.write(new byte[] { 0, 0, 0, 1 });
                    final Iterator<byte[]> iterator = sequenceParameterSets.iterator();
                    while (iterator.hasNext()) {
                        byteArrayOutputStream.write(iterator.next());
                    }
                    byteArrayOutputStream.write(new byte[] { 0, 0, 0, 1 });
                    iterator2 = pictureParameterSets.iterator();
                    if (!iterator2.hasNext()) {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
                catch (IOException ex) {
                    throw new RuntimeException("ByteArrayOutputStream do not throw IOException ?!?!?");
                }
                byteArrayOutputStream.write(iterator2.next());
                continue;
            }
        }
    }
    
    private AudioQuality getDtsAudioQuality(final Track track, final AudioSampleEntry audioSampleEntry) {
        final DTSSpecificBox dtsSpecificBox = audioSampleEntry.getBoxes(DTSSpecificBox.class).get(0);
        if (dtsSpecificBox == null) {
            throw new RuntimeException("DTS track misses DTSSpecificBox!");
        }
        final ByteBuffer allocate = ByteBuffer.allocate(22);
        final int frameDuration = dtsSpecificBox.getFrameDuration();
        int n = 0;
        switch (frameDuration) {
            case 0: {
                n = 512;
                break;
            }
            case 1: {
                n = 1024;
                break;
            }
            case 2: {
                n = 2048;
                break;
            }
            case 3: {
                n = 4096;
                break;
            }
        }
        allocate.put((byte)(n & 0xFF));
        allocate.put((byte)(n >>> 8));
        final int n2 = this.getNumChannelsAndMask(dtsSpecificBox)[1];
        allocate.put((byte)(n2 & 0xFF));
        allocate.put((byte)(n2 >>> 8));
        allocate.put((byte)(n2 >>> 16));
        allocate.put((byte)(n2 >>> 24));
        allocate.put(new byte[] { -82, -28, -65, 94, 97, 94, 65, -121, -110, -4, -92, -127, 38, -103, 2, 17 });
        final ByteBuffer allocate2 = ByteBuffer.allocate(8);
        allocate2.put((byte)dtsSpecificBox.getStreamConstruction());
        final int channelLayout = dtsSpecificBox.getChannelLayout();
        allocate2.put((byte)(channelLayout & 0xFF));
        allocate2.put((byte)(channelLayout >>> 8));
        allocate2.put((byte)(channelLayout >>> 16));
        allocate2.put((byte)(channelLayout >>> 24));
        allocate2.put((byte)((byte)(dtsSpecificBox.getMultiAssetFlag() << 1) | dtsSpecificBox.getLBRDurationMod()));
        allocate2.put(new byte[2]);
        final AudioQuality audioQuality = new AudioQuality();
        audioQuality.fourCC = this.getFormat(audioSampleEntry);
        audioQuality.bitrate = dtsSpecificBox.getAvgBitRate();
        audioQuality.audioTag = 65534;
        audioQuality.samplingRate = dtsSpecificBox.getDTSSamplingFrequency();
        audioQuality.channels = this.getNumChannelsAndMask(dtsSpecificBox)[0];
        audioQuality.bitPerSample = 16;
        audioQuality.packetSize = (int)track.getSamples().get(0).remaining();
        audioQuality.codecPrivateData = String.valueOf(Hex.encodeHex(allocate.array())) + Hex.encodeHex(allocate2.array());
        return audioQuality;
    }
    
    private AudioQuality getEc3AudioQuality(final Track track, final AudioSampleEntry audioSampleEntry) {
        final EC3SpecificBox ec3SpecificBox = audioSampleEntry.getBoxes(EC3SpecificBox.class).get(0);
        if (ec3SpecificBox == null) {
            throw new RuntimeException("EC-3 track misses EC3SpecificBox!");
        }
        int n = 0;
        int n2 = 0;
        byte b = 0;
        byte b2 = 0;
        for (final EC3SpecificBox.Entry entry : ec3SpecificBox.getEntries()) {
            switch (entry.acmod) {
                case 0: {
                    final short n3 = (short)(n + 2);
                    throw new RuntimeException("Smooth Streaming doesn't support DDP 1+1 mode");
                }
                case 1: {
                    n = (short)(n + 1);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process.getdWChannelMaskFirstByte();
                        b2 |= process.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= 0x20;
                    break;
                }
                case 2: {
                    n = (short)(n + 2);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process2 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process2.getdWChannelMaskFirstByte();
                        b2 |= process2.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)192;
                    break;
                }
                case 3: {
                    n = (short)(n + 3);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process3 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process3.getdWChannelMaskFirstByte();
                        b2 |= process3.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)224;
                    break;
                }
                case 4: {
                    n = (short)(n + 3);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process4 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process4.getdWChannelMaskFirstByte();
                        b2 |= process4.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)192;
                    b2 |= (byte)128;
                    break;
                }
                case 5: {
                    n = (short)(n + 4);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process5 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process5.getdWChannelMaskFirstByte();
                        b2 |= process5.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)224;
                    b2 |= (byte)128;
                    break;
                }
                case 6: {
                    n = (short)(n + 4);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process6 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process6.getdWChannelMaskFirstByte();
                        b2 |= process6.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)204;
                    break;
                }
                case 7: {
                    n = (short)(n + 5);
                    if (entry.num_dep_sub > 0) {
                        final DependentSubstreamMask process7 = new DependentSubstreamMask(b, b2, entry).process();
                        b |= process7.getdWChannelMaskFirstByte();
                        b2 |= process7.getdWChannelMaskSecondByte();
                        break;
                    }
                    b |= (byte)236;
                    break;
                }
            }
            if (entry.lfeon == 1) {
                n2 = (short)(n2 + 1);
                b |= 0x10;
            }
        }
        final ByteBuffer allocate = ByteBuffer.allocate(22);
        allocate.put(new byte[] { 0, 6 });
        allocate.put(b);
        allocate.put(b2);
        allocate.put(new byte[2]);
        allocate.put(new byte[] { -81, -121, -5, -89, 2, 45, -5, 66, -92, -44, 5, -51, -109, -124, 59, -35 });
        final ByteBuffer allocate2 = ByteBuffer.allocate((int)ec3SpecificBox.getContentSize());
        ec3SpecificBox.getContent(allocate2);
        final AudioQuality audioQuality = new AudioQuality();
        audioQuality.fourCC = "EC-3";
        audioQuality.bitrate = this.getBitrate(track);
        audioQuality.audioTag = 65534;
        audioQuality.samplingRate = audioSampleEntry.getSampleRate();
        audioQuality.channels = n + n2;
        audioQuality.bitPerSample = 16;
        audioQuality.packetSize = (int)track.getSamples().get(0).remaining();
        audioQuality.codecPrivateData = String.valueOf(Hex.encodeHex(allocate.array())) + Hex.encodeHex(allocate2.array());
        return audioQuality;
    }
    
    private int[] getNumChannelsAndMask(final DTSSpecificBox dtsSpecificBox) {
        final int channelLayout = dtsSpecificBox.getChannelLayout();
        final int n = channelLayout & 0x1;
        int n2 = 0;
        int n3 = 0;
        if (n == 1) {
            n3 = 0 + 1;
            n2 = (0x0 | 0x4);
        }
        if ((channelLayout & 0x2) == 0x2) {
            n3 += 2;
            n2 = (0x2 | (n2 | 0x1));
        }
        if ((channelLayout & 0x4) == 0x4) {
            n3 += 2;
            n2 = (0x20 | (n2 | 0x10));
        }
        if ((channelLayout & 0x8) == 0x8) {
            ++n3;
            n2 |= 0x8;
        }
        if ((channelLayout & 0x10) == 0x10) {
            ++n3;
            n2 |= 0x100;
        }
        if ((channelLayout & 0x20) == 0x20) {
            n3 += 2;
            n2 = (0x4000 | (n2 | 0x1000));
        }
        if ((channelLayout & 0x40) == 0x40) {
            n3 += 2;
            n2 = (0x20 | (n2 | 0x10));
        }
        if ((channelLayout & 0x80) == 0x80) {
            ++n3;
            n2 |= 0x2000;
        }
        if ((channelLayout & 0x100) == 0x100) {
            ++n3;
            n2 |= 0x800;
        }
        if ((channelLayout & 0x200) == 0x200) {
            n3 += 2;
            n2 = (0x80 | (n2 | 0x40));
        }
        if ((channelLayout & 0x400) == 0x400) {
            n3 += 2;
            n2 = (0x400 | (n2 | 0x200));
        }
        if ((channelLayout & 0x800) == 0x800) {
            n3 += 2;
            n2 = (0x20 | (n2 | 0x10));
        }
        if ((channelLayout & 0x1000) == 0x1000) {
            ++n3;
            n2 |= 0x8;
        }
        if ((channelLayout & 0x2000) == 0x2000) {
            n3 += 2;
            n2 = (0x20 | (n2 | 0x10));
        }
        if ((channelLayout & 0x4000) == 0x4000) {
            ++n3;
            n2 |= 0x10000;
        }
        if ((channelLayout & 0x8000) == 0x8000) {
            n3 += 2;
            n2 = (0x20000 | (n2 | 0x8000));
        }
        if ((channelLayout & 0x10000) == 0x10000) {
            ++n3;
        }
        if ((channelLayout & 0x20000) == 0x20000) {
            n3 += 2;
        }
        return new int[] { n3, n2 };
    }
    
    private VideoQuality getVideoQuality(final Track track, final VisualSampleEntry visualSampleEntry) {
        if ("avc1".equals(this.getFormat(visualSampleEntry))) {
            final AvcConfigurationBox avcConfigurationBox = visualSampleEntry.getBoxes(AvcConfigurationBox.class).get(0);
            final VideoQuality videoQuality = new VideoQuality();
            videoQuality.bitrate = this.getBitrate(track);
            videoQuality.codecPrivateData = Hex.encodeHex(this.getAvcCodecPrivateData(avcConfigurationBox));
            videoQuality.fourCC = "AVC1";
            videoQuality.width = visualSampleEntry.getWidth();
            videoQuality.height = visualSampleEntry.getHeight();
            videoQuality.nalLength = 1 + avcConfigurationBox.getLengthSizeMinusOne();
            return videoQuality;
        }
        throw new InternalError("I don't know how to handle video of type " + this.getFormat(visualSampleEntry));
    }
    
    protected Document customizeManifest(final Document document) {
        return document;
    }
    
    @Override
    public String getManifest(final Movie p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/LinkedList;
        //     3: dup            
        //     4: invokespecial   java/util/LinkedList.<init>:()V
        //     7: astore_2       
        //     8: ldc2_w          -1
        //    11: lstore_3       
        //    12: new             Ljava/util/LinkedList;
        //    15: dup            
        //    16: invokespecial   java/util/LinkedList.<init>:()V
        //    19: astore          5
        //    21: ldc2_w          -1
        //    24: lstore          6
        //    26: aload_1        
        //    27: invokevirtual   com/googlecode/mp4parser/authoring/Movie.getTracks:()Ljava/util/List;
        //    30: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    35: astore          8
        //    37: aload           8
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifne            483
        //    47: invokestatic    javax/xml/parsers/DocumentBuilderFactory.newInstance:()Ljavax/xml/parsers/DocumentBuilderFactory;
        //    50: astore          12
        //    52: aload           12
        //    54: invokevirtual   javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder:()Ljavax/xml/parsers/DocumentBuilder;
        //    57: astore          15
        //    59: aload           15
        //    61: invokevirtual   javax/xml/parsers/DocumentBuilder.newDocument:()Lorg/w3c/dom/Document;
        //    64: astore          16
        //    66: aload           16
        //    68: ldc_w           "SmoothStreamingMedia"
        //    71: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //    76: astore          17
        //    78: aload           16
        //    80: aload           17
        //    82: invokeinterface org/w3c/dom/Document.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //    87: pop            
        //    88: aload           17
        //    90: ldc_w           "MajorVersion"
        //    93: ldc_w           "2"
        //    96: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   101: aload           17
        //   103: ldc_w           "MinorVersion"
        //   106: ldc_w           "1"
        //   109: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   114: aload           17
        //   116: ldc_w           "Duration"
        //   119: ldc_w           "0"
        //   122: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   127: aload           17
        //   129: aload           16
        //   131: getstatic       com/googlecode/mp4parser/Version.VERSION:Ljava/lang/String;
        //   134: invokeinterface org/w3c/dom/Document.createComment:(Ljava/lang/String;)Lorg/w3c/dom/Comment;
        //   139: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //   144: pop            
        //   145: aload           16
        //   147: ldc_w           "StreamIndex"
        //   150: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //   155: astore          20
        //   157: aload           20
        //   159: ldc_w           "Type"
        //   162: ldc_w           "video"
        //   165: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   170: aload           20
        //   172: ldc_w           "TimeScale"
        //   175: lload_3        
        //   176: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   179: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   184: aload           20
        //   186: ldc_w           "Chunks"
        //   189: aload_0        
        //   190: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.videoFragmentsDurations:[J
        //   193: arraylength    
        //   194: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   197: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   202: aload           20
        //   204: ldc_w           "Url"
        //   207: ldc_w           "video/{bitrate}/{start time}"
        //   210: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   215: aload           20
        //   217: ldc_w           "QualityLevels"
        //   220: aload_2        
        //   221: invokevirtual   java/util/LinkedList.size:()I
        //   224: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   227: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   232: aload           17
        //   234: aload           20
        //   236: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //   241: pop            
        //   242: iconst_0       
        //   243: istore          22
        //   245: iload           22
        //   247: aload_2        
        //   248: invokevirtual   java/util/LinkedList.size:()I
        //   251: if_icmplt       726
        //   254: iconst_0       
        //   255: istore          26
        //   257: iload           26
        //   259: aload_0        
        //   260: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.videoFragmentsDurations:[J
        //   263: arraylength    
        //   264: if_icmplt       884
        //   267: aload_0        
        //   268: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //   271: ifnull          399
        //   274: aload           16
        //   276: ldc_w           "StreamIndex"
        //   279: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //   284: astore          38
        //   286: aload           38
        //   288: ldc_w           "Type"
        //   291: ldc_w           "audio"
        //   294: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   299: aload           38
        //   301: ldc_w           "TimeScale"
        //   304: lload           6
        //   306: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   309: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   314: aload           38
        //   316: ldc_w           "Chunks"
        //   319: aload_0        
        //   320: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //   323: arraylength    
        //   324: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   327: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   332: aload           38
        //   334: ldc_w           "Url"
        //   337: ldc_w           "audio/{bitrate}/{start time}"
        //   340: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   345: aload           38
        //   347: ldc_w           "QualityLevels"
        //   350: aload           5
        //   352: invokevirtual   java/util/LinkedList.size:()I
        //   355: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   358: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   363: aload           17
        //   365: aload           38
        //   367: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //   372: pop            
        //   373: iconst_0       
        //   374: istore          40
        //   376: iload           40
        //   378: aload           5
        //   380: invokevirtual   java/util/LinkedList.size:()I
        //   383: if_icmplt       947
        //   386: iconst_0       
        //   387: istore          44
        //   389: iload           44
        //   391: aload_0        
        //   392: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //   395: arraylength    
        //   396: if_icmplt       1140
        //   399: aload           16
        //   401: iconst_1       
        //   402: invokeinterface org/w3c/dom/Document.setXmlStandalone:(Z)V
        //   407: new             Ljavax/xml/transform/dom/DOMSource;
        //   410: dup            
        //   411: aload_0        
        //   412: aload           16
        //   414: invokevirtual   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.customizeManifest:(Lorg/w3c/dom/Document;)Lorg/w3c/dom/Document;
        //   417: invokespecial   javax/xml/transform/dom/DOMSource.<init>:(Lorg/w3c/dom/Node;)V
        //   420: astore          29
        //   422: new             Ljava/io/StringWriter;
        //   425: dup            
        //   426: invokespecial   java/io/StringWriter.<init>:()V
        //   429: astore          30
        //   431: new             Ljavax/xml/transform/stream/StreamResult;
        //   434: dup            
        //   435: aload           30
        //   437: invokespecial   javax/xml/transform/stream/StreamResult.<init>:(Ljava/io/Writer;)V
        //   440: astore          31
        //   442: invokestatic    javax/xml/transform/TransformerFactory.newInstance:()Ljavax/xml/transform/TransformerFactory;
        //   445: astore          32
        //   447: aload           32
        //   449: invokevirtual   javax/xml/transform/TransformerFactory.newTransformer:()Ljavax/xml/transform/Transformer;
        //   452: astore          37
        //   454: aload           37
        //   456: ldc_w           "indent"
        //   459: ldc_w           "yes"
        //   462: invokevirtual   javax/xml/transform/Transformer.setOutputProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   465: aload           37
        //   467: aload           29
        //   469: aload           31
        //   471: invokevirtual   javax/xml/transform/Transformer.transform:(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
        //   474: aload           30
        //   476: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //   479: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   482: areturn        
        //   483: aload           8
        //   485: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   490: checkcast       Lcom/googlecode/mp4parser/authoring/Track;
        //   493: astore          9
        //   495: aload           9
        //   497: invokeinterface com/googlecode/mp4parser/authoring/Track.getMediaHeaderBox:()Lcom/coremedia/iso/boxes/Box;
        //   502: instanceof      Lcom/coremedia/iso/boxes/VideoMediaHeaderBox;
        //   505: ifeq            570
        //   508: aload_0        
        //   509: aload_0        
        //   510: aload_0        
        //   511: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.videoFragmentsDurations:[J
        //   514: aload_0        
        //   515: aload           9
        //   517: aload_1        
        //   518: invokevirtual   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.calculateFragmentDurations:(Lcom/googlecode/mp4parser/authoring/Track;Lcom/googlecode/mp4parser/authoring/Movie;)[J
        //   521: invokevirtual   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.checkFragmentsAlign:([J[J)[J
        //   524: putfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.videoFragmentsDurations:[J
        //   527: aload_2        
        //   528: aload_0        
        //   529: aload           9
        //   531: aload           9
        //   533: invokeinterface com/googlecode/mp4parser/authoring/Track.getSampleDescriptionBox:()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
        //   538: invokevirtual   com/coremedia/iso/boxes/SampleDescriptionBox.getSampleEntry:()Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;
        //   541: checkcast       Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;
        //   544: invokespecial   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.getVideoQuality:(Lcom/googlecode/mp4parser/authoring/Track;Lcom/coremedia/iso/boxes/sampleentry/VisualSampleEntry;)Lcom/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality;
        //   547: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   550: pop            
        //   551: lload_3        
        //   552: ldc2_w          -1
        //   555: lcmp           
        //   556: ifne            651
        //   559: aload           9
        //   561: invokeinterface com/googlecode/mp4parser/authoring/Track.getTrackMetaData:()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
        //   566: invokevirtual   com/googlecode/mp4parser/authoring/TrackMetaData.getTimescale:()J
        //   569: lstore_3       
        //   570: aload           9
        //   572: invokeinterface com/googlecode/mp4parser/authoring/Track.getMediaHeaderBox:()Lcom/coremedia/iso/boxes/Box;
        //   577: instanceof      Lcom/coremedia/iso/boxes/SoundMediaHeaderBox;
        //   580: ifeq            37
        //   583: aload_0        
        //   584: aload_0        
        //   585: aload_0        
        //   586: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //   589: aload_0        
        //   590: aload           9
        //   592: aload_1        
        //   593: invokevirtual   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.calculateFragmentDurations:(Lcom/googlecode/mp4parser/authoring/Track;Lcom/googlecode/mp4parser/authoring/Movie;)[J
        //   596: invokevirtual   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.checkFragmentsAlign:([J[J)[J
        //   599: putfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //   602: aload           5
        //   604: aload_0        
        //   605: aload           9
        //   607: aload           9
        //   609: invokeinterface com/googlecode/mp4parser/authoring/Track.getSampleDescriptionBox:()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
        //   614: invokevirtual   com/coremedia/iso/boxes/SampleDescriptionBox.getSampleEntry:()Lcom/coremedia/iso/boxes/sampleentry/AbstractSampleEntry;
        //   617: checkcast       Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;
        //   620: invokespecial   com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.getAudioQuality:(Lcom/googlecode/mp4parser/authoring/Track;Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;)Lcom/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality;
        //   623: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   626: pop            
        //   627: lload           6
        //   629: ldc2_w          -1
        //   632: lcmp           
        //   633: ifne            680
        //   636: aload           9
        //   638: invokeinterface com/googlecode/mp4parser/authoring/Track.getTrackMetaData:()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
        //   643: invokevirtual   com/googlecode/mp4parser/authoring/TrackMetaData.getTimescale:()J
        //   646: lstore          6
        //   648: goto            37
        //   651: getstatic       com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.$assertionsDisabled:Z
        //   654: ifne            570
        //   657: lload_3        
        //   658: aload           9
        //   660: invokeinterface com/googlecode/mp4parser/authoring/Track.getTrackMetaData:()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
        //   665: invokevirtual   com/googlecode/mp4parser/authoring/TrackMetaData.getTimescale:()J
        //   668: lcmp           
        //   669: ifeq            570
        //   672: new             Ljava/lang/AssertionError;
        //   675: dup            
        //   676: invokespecial   java/lang/AssertionError.<init>:()V
        //   679: athrow         
        //   680: getstatic       com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.$assertionsDisabled:Z
        //   683: ifne            37
        //   686: lload           6
        //   688: aload           9
        //   690: invokeinterface com/googlecode/mp4parser/authoring/Track.getTrackMetaData:()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
        //   695: invokevirtual   com/googlecode/mp4parser/authoring/TrackMetaData.getTimescale:()J
        //   698: lcmp           
        //   699: ifeq            37
        //   702: new             Ljava/lang/AssertionError;
        //   705: dup            
        //   706: invokespecial   java/lang/AssertionError.<init>:()V
        //   709: athrow         
        //   710: astore          13
        //   712: new             Ljava/io/IOException;
        //   715: dup            
        //   716: aload           13
        //   718: invokespecial   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //   721: astore          14
        //   723: aload           14
        //   725: athrow         
        //   726: aload_2        
        //   727: iload           22
        //   729: invokevirtual   java/util/LinkedList.get:(I)Ljava/lang/Object;
        //   732: checkcast       Lcom/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality;
        //   735: astore          23
        //   737: aload           16
        //   739: ldc_w           "QualityLevel"
        //   742: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //   747: astore          24
        //   749: aload           24
        //   751: ldc_w           "Index"
        //   754: iload           22
        //   756: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   759: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   764: aload           24
        //   766: ldc_w           "Bitrate"
        //   769: aload           23
        //   771: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.bitrate:J
        //   774: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   777: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   782: aload           24
        //   784: ldc_w           "FourCC"
        //   787: aload           23
        //   789: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.fourCC:Ljava/lang/String;
        //   792: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   797: aload           24
        //   799: ldc_w           "MaxWidth"
        //   802: aload           23
        //   804: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.width:I
        //   807: i2l            
        //   808: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   811: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   816: aload           24
        //   818: ldc_w           "MaxHeight"
        //   821: aload           23
        //   823: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.height:I
        //   826: i2l            
        //   827: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   830: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   835: aload           24
        //   837: ldc_w           "CodecPrivateData"
        //   840: aload           23
        //   842: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.codecPrivateData:Ljava/lang/String;
        //   845: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   850: aload           24
        //   852: ldc_w           "NALUnitLengthField"
        //   855: aload           23
        //   857: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/VideoQuality.nalLength:I
        //   860: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   863: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   868: aload           20
        //   870: aload           24
        //   872: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //   877: pop            
        //   878: iinc            22, 1
        //   881: goto            245
        //   884: aload           16
        //   886: ldc_w           "c"
        //   889: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //   894: astore          27
        //   896: aload           27
        //   898: ldc_w           "n"
        //   901: iload           26
        //   903: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   906: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   911: aload           27
        //   913: ldc_w           "d"
        //   916: aload_0        
        //   917: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.videoFragmentsDurations:[J
        //   920: iload           26
        //   922: laload         
        //   923: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   926: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   931: aload           20
        //   933: aload           27
        //   935: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //   940: pop            
        //   941: iinc            26, 1
        //   944: goto            257
        //   947: aload           5
        //   949: iload           40
        //   951: invokevirtual   java/util/LinkedList.get:(I)Ljava/lang/Object;
        //   954: checkcast       Lcom/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality;
        //   957: astore          41
        //   959: aload           16
        //   961: ldc_w           "QualityLevel"
        //   964: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //   969: astore          42
        //   971: aload           42
        //   973: ldc_w           "Index"
        //   976: iload           40
        //   978: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   981: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //   986: aload           42
        //   988: ldc_w           "FourCC"
        //   991: aload           41
        //   993: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.fourCC:Ljava/lang/String;
        //   996: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1001: aload           42
        //  1003: ldc_w           "Bitrate"
        //  1006: aload           41
        //  1008: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.bitrate:J
        //  1011: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //  1014: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1019: aload           42
        //  1021: ldc_w           "AudioTag"
        //  1024: aload           41
        //  1026: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.audioTag:I
        //  1029: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1032: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1037: aload           42
        //  1039: ldc_w           "SamplingRate"
        //  1042: aload           41
        //  1044: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.samplingRate:J
        //  1047: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //  1050: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1055: aload           42
        //  1057: ldc_w           "Channels"
        //  1060: aload           41
        //  1062: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.channels:I
        //  1065: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1068: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1073: aload           42
        //  1075: ldc_w           "BitsPerSample"
        //  1078: aload           41
        //  1080: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.bitPerSample:I
        //  1083: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1086: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1091: aload           42
        //  1093: ldc_w           "PacketSize"
        //  1096: aload           41
        //  1098: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.packetSize:I
        //  1101: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1104: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1109: aload           42
        //  1111: ldc_w           "CodecPrivateData"
        //  1114: aload           41
        //  1116: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/AudioQuality.codecPrivateData:Ljava/lang/String;
        //  1119: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1124: aload           38
        //  1126: aload           42
        //  1128: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //  1133: pop            
        //  1134: iinc            40, 1
        //  1137: goto            376
        //  1140: aload           16
        //  1142: ldc_w           "c"
        //  1145: invokeinterface org/w3c/dom/Document.createElement:(Ljava/lang/String;)Lorg/w3c/dom/Element;
        //  1150: astore          45
        //  1152: aload           45
        //  1154: ldc_w           "n"
        //  1157: iload           44
        //  1159: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1162: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1167: aload           45
        //  1169: ldc_w           "d"
        //  1172: aload_0        
        //  1173: getfield        com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.audioFragmentsDurations:[J
        //  1176: iload           44
        //  1178: laload         
        //  1179: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //  1182: invokeinterface org/w3c/dom/Element.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1187: aload           38
        //  1189: aload           45
        //  1191: invokeinterface org/w3c/dom/Element.appendChild:(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
        //  1196: pop            
        //  1197: iinc            44, 1
        //  1200: goto            389
        //  1203: astore          35
        //  1205: new             Ljava/io/IOException;
        //  1208: dup            
        //  1209: aload           35
        //  1211: invokespecial   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //  1214: astore          36
        //  1216: aload           36
        //  1218: athrow         
        //  1219: astore          33
        //  1221: new             Ljava/io/IOException;
        //  1224: dup            
        //  1225: aload           33
        //  1227: invokespecial   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //  1230: astore          34
        //  1232: aload           34
        //  1234: athrow         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                   
        //  -----  -----  -----  -----  -------------------------------------------------------
        //  52     59     710    726    Ljavax/xml/parsers/ParserConfigurationException;
        //  447    474    1203   1219   Ljavax/xml/transform/TransformerConfigurationException;
        //  447    474    1219   1235   Ljavax/xml/transform/TransformerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0483:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private class DependentSubstreamMask
    {
        private byte dWChannelMaskFirstByte;
        private byte dWChannelMaskSecondByte;
        private EC3SpecificBox.Entry entry;
        
        public DependentSubstreamMask(final byte dwChannelMaskFirstByte, final byte dwChannelMaskSecondByte, final EC3SpecificBox.Entry entry) {
            this.dWChannelMaskFirstByte = dwChannelMaskFirstByte;
            this.dWChannelMaskSecondByte = dwChannelMaskSecondByte;
            this.entry = entry;
        }
        
        public byte getdWChannelMaskFirstByte() {
            return this.dWChannelMaskFirstByte;
        }
        
        public byte getdWChannelMaskSecondByte() {
            return this.dWChannelMaskSecondByte;
        }
        
        public DependentSubstreamMask process() {
            switch (this.entry.chan_loc) {
                default: {
                    return this;
                }
                case 0: {
                    this.dWChannelMaskFirstByte |= 0x3;
                    return this;
                }
                case 1: {
                    this.dWChannelMaskFirstByte |= 0xC;
                    return this;
                }
                case 2: {
                    this.dWChannelMaskSecondByte |= (byte)128;
                    return this;
                }
                case 3: {
                    this.dWChannelMaskSecondByte |= 0x8;
                    return this;
                }
                case 6: {
                    this.dWChannelMaskSecondByte |= 0x5;
                    return this;
                }
                case 7: {
                    this.dWChannelMaskSecondByte |= 0x2;
                    return this;
                }
            }
        }
    }
}
