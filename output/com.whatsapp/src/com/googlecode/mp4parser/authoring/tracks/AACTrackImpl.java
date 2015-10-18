// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.nio.MappedByteBuffer;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.channels.FileChannel;
import java.io.EOFException;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.util.ChannelHelper;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Date;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import java.util.LinkedList;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.List;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import java.util.Map;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class AACTrackImpl extends AbstractTrack
{
    static Map<Integer, String> audioObjectTypes;
    public static Map<Integer, Integer> samplingFrequencyIndexMap;
    long avgBitRate;
    int bufferSizeDB;
    AdtsHeader firstHeader;
    private String lang;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    List<TimeToSampleBox.Entry> stts;
    TrackMetaData trackMetaData;
    
    static {
        (AACTrackImpl.audioObjectTypes = new HashMap<Integer, String>()).put(1, "AAC Main");
        AACTrackImpl.audioObjectTypes.put(2, "AAC LC (Low Complexity)");
        AACTrackImpl.audioObjectTypes.put(3, "AAC SSR (Scalable Sample Rate)");
        AACTrackImpl.audioObjectTypes.put(4, "AAC LTP (Long Term Prediction)");
        AACTrackImpl.audioObjectTypes.put(5, "SBR (Spectral Band Replication)");
        AACTrackImpl.audioObjectTypes.put(6, "AAC Scalable");
        AACTrackImpl.audioObjectTypes.put(7, "TwinVQ");
        AACTrackImpl.audioObjectTypes.put(8, "CELP (Code Excited Linear Prediction)");
        AACTrackImpl.audioObjectTypes.put(9, "HXVC (Harmonic Vector eXcitation Coding)");
        AACTrackImpl.audioObjectTypes.put(10, "Reserved");
        AACTrackImpl.audioObjectTypes.put(11, "Reserved");
        AACTrackImpl.audioObjectTypes.put(12, "TTSI (Text-To-Speech Interface)");
        AACTrackImpl.audioObjectTypes.put(13, "Main Synthesis");
        AACTrackImpl.audioObjectTypes.put(14, "Wavetable Synthesis");
        AACTrackImpl.audioObjectTypes.put(15, "General MIDI");
        AACTrackImpl.audioObjectTypes.put(16, "Algorithmic Synthesis and Audio Effects");
        AACTrackImpl.audioObjectTypes.put(17, "ER (Error Resilient) AAC LC");
        AACTrackImpl.audioObjectTypes.put(18, "Reserved");
        AACTrackImpl.audioObjectTypes.put(19, "ER AAC LTP");
        AACTrackImpl.audioObjectTypes.put(20, "ER AAC Scalable");
        AACTrackImpl.audioObjectTypes.put(21, "ER TwinVQ");
        AACTrackImpl.audioObjectTypes.put(22, "ER BSAC (Bit-Sliced Arithmetic Coding)");
        AACTrackImpl.audioObjectTypes.put(23, "ER AAC LD (Low Delay)");
        AACTrackImpl.audioObjectTypes.put(24, "ER CELP");
        AACTrackImpl.audioObjectTypes.put(25, "ER HVXC");
        AACTrackImpl.audioObjectTypes.put(26, "ER HILN (Harmonic and Individual Lines plus Noise)");
        AACTrackImpl.audioObjectTypes.put(27, "ER Parametric");
        AACTrackImpl.audioObjectTypes.put(28, "SSC (SinuSoidal Coding)");
        AACTrackImpl.audioObjectTypes.put(29, "PS (Parametric Stereo)");
        AACTrackImpl.audioObjectTypes.put(30, "MPEG Surround");
        AACTrackImpl.audioObjectTypes.put(31, "(Escape value)");
        AACTrackImpl.audioObjectTypes.put(32, "Layer-1");
        AACTrackImpl.audioObjectTypes.put(33, "Layer-2");
        AACTrackImpl.audioObjectTypes.put(34, "Layer-3");
        AACTrackImpl.audioObjectTypes.put(35, "DST (Direct Stream Transfer)");
        AACTrackImpl.audioObjectTypes.put(36, "ALS (Audio Lossless)");
        AACTrackImpl.audioObjectTypes.put(37, "SLS (Scalable LosslesS)");
        AACTrackImpl.audioObjectTypes.put(38, "SLS non-core");
        AACTrackImpl.audioObjectTypes.put(39, "ER AAC ELD (Enhanced Low Delay)");
        AACTrackImpl.audioObjectTypes.put(40, "SMR (Symbolic Music Representation) Simple");
        AACTrackImpl.audioObjectTypes.put(41, "SMR Main");
        AACTrackImpl.audioObjectTypes.put(42, "USAC (Unified Speech and Audio Coding) (no SBR)");
        AACTrackImpl.audioObjectTypes.put(43, "SAOC (Spatial Audio Object Coding)");
        AACTrackImpl.audioObjectTypes.put(44, "LD MPEG Surround");
        AACTrackImpl.audioObjectTypes.put(45, "USAC");
        (AACTrackImpl.samplingFrequencyIndexMap = new HashMap<Integer, Integer>()).put(96000, 0);
        AACTrackImpl.samplingFrequencyIndexMap.put(88200, 1);
        AACTrackImpl.samplingFrequencyIndexMap.put(64000, 2);
        AACTrackImpl.samplingFrequencyIndexMap.put(48000, 3);
        AACTrackImpl.samplingFrequencyIndexMap.put(44100, 4);
        AACTrackImpl.samplingFrequencyIndexMap.put(32000, 5);
        AACTrackImpl.samplingFrequencyIndexMap.put(24000, 6);
        AACTrackImpl.samplingFrequencyIndexMap.put(22050, 7);
        AACTrackImpl.samplingFrequencyIndexMap.put(16000, 8);
        AACTrackImpl.samplingFrequencyIndexMap.put(12000, 9);
        AACTrackImpl.samplingFrequencyIndexMap.put(11025, 10);
        AACTrackImpl.samplingFrequencyIndexMap.put(8000, 11);
        AACTrackImpl.samplingFrequencyIndexMap.put(0, 96000);
        AACTrackImpl.samplingFrequencyIndexMap.put(1, 88200);
        AACTrackImpl.samplingFrequencyIndexMap.put(2, 64000);
        AACTrackImpl.samplingFrequencyIndexMap.put(3, 48000);
        AACTrackImpl.samplingFrequencyIndexMap.put(4, 44100);
        AACTrackImpl.samplingFrequencyIndexMap.put(5, 32000);
        AACTrackImpl.samplingFrequencyIndexMap.put(6, 24000);
        AACTrackImpl.samplingFrequencyIndexMap.put(7, 22050);
        AACTrackImpl.samplingFrequencyIndexMap.put(8, 16000);
        AACTrackImpl.samplingFrequencyIndexMap.put(9, 12000);
        AACTrackImpl.samplingFrequencyIndexMap.put(10, 11025);
        AACTrackImpl.samplingFrequencyIndexMap.put(11, 8000);
    }
    
    public AACTrackImpl(final ReadableByteChannel readableByteChannel) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.lang = "und";
        this.parse(readableByteChannel);
    }
    
    public AACTrackImpl(final ReadableByteChannel readableByteChannel, final String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.lang = "und";
        this.lang = lang;
        this.parse(readableByteChannel);
    }
    
    private void parse(final ReadableByteChannel readableByteChannel) throws IOException {
        this.stts = new LinkedList<TimeToSampleBox.Entry>();
        this.samples = new LinkedList<Sample>();
        this.firstHeader = this.readSamples(readableByteChannel);
        final double n = this.firstHeader.sampleRate / 1024.0;
        final double n2 = this.samples.size() / n;
        long n3 = 0L;
        final LinkedList<Integer> list = new LinkedList<Integer>();
        final Iterator<Sample> iterator = this.samples.iterator();
        while (iterator.hasNext()) {
            final int n4 = (int)iterator.next().remaining();
            n3 += n4;
            list.add(n4);
            while (list.size() > n) {
                list.pop();
            }
            if (list.size() == (int)n) {
                int n5 = 0;
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    n5 += iterator2.next();
                }
                final double n6 = n * (8.0 * n5 / list.size());
                if (n6 <= this.maxBitRate) {
                    continue;
                }
                this.maxBitRate = (int)n6;
            }
        }
        this.avgBitRate = (int)(8L * n3 / n2);
        this.bufferSizeDB = 1536;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        final AudioSampleEntry audioSampleEntry = new AudioSampleEntry("mp4a");
        audioSampleEntry.setChannelCount(2);
        audioSampleEntry.setSampleRate(this.firstHeader.sampleRate);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        final ESDescriptorBox esDescriptorBox = new ESDescriptorBox();
        final ESDescriptor esDescriptor = new ESDescriptor();
        esDescriptor.setEsId(0);
        final SLConfigDescriptor slConfigDescriptor = new SLConfigDescriptor();
        slConfigDescriptor.setPredefined(2);
        esDescriptor.setSlConfigDescriptor(slConfigDescriptor);
        final DecoderConfigDescriptor decoderConfigDescriptor = new DecoderConfigDescriptor();
        decoderConfigDescriptor.setObjectTypeIndication(64);
        decoderConfigDescriptor.setStreamType(5);
        decoderConfigDescriptor.setBufferSizeDB(this.bufferSizeDB);
        decoderConfigDescriptor.setMaxBitRate(this.maxBitRate);
        decoderConfigDescriptor.setAvgBitRate(this.avgBitRate);
        final AudioSpecificConfig audioSpecificInfo = new AudioSpecificConfig();
        audioSpecificInfo.setAudioObjectType(2);
        audioSpecificInfo.setSamplingFrequencyIndex(this.firstHeader.sampleFrequencyIndex);
        audioSpecificInfo.setChannelConfiguration(this.firstHeader.channelconfig);
        decoderConfigDescriptor.setAudioSpecificInfo(audioSpecificInfo);
        esDescriptor.setDecoderConfigDescriptor(decoderConfigDescriptor);
        esDescriptorBox.setData(esDescriptor.serialize());
        audioSampleEntry.addBox(esDescriptorBox);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(this.lang);
        this.trackMetaData.setVolume(1.0f);
        this.trackMetaData.setTimescale(this.firstHeader.sampleRate);
    }
    
    private AdtsHeader readADTSHeader(final ReadableByteChannel readableByteChannel) throws IOException {
        AdtsHeader adtsHeader = new AdtsHeader();
        final ByteBuffer allocate = ByteBuffer.allocate(7);
        BitReaderBuffer bitReaderBuffer = null;
        Label_0066: {
            try {
                ChannelHelper.readFully(readableByteChannel, allocate);
                bitReaderBuffer = new BitReaderBuffer((ByteBuffer)allocate.rewind());
                if (bitReaderBuffer.readBits(12) != 4095) {
                    throw new IOException("Expected Start Word 0xfff");
                }
                break Label_0066;
            }
            catch (EOFException ex) {
                adtsHeader = null;
            }
            return adtsHeader;
        }
        adtsHeader.mpegVersion = bitReaderBuffer.readBits(1);
        adtsHeader.layer = bitReaderBuffer.readBits(2);
        adtsHeader.protectionAbsent = bitReaderBuffer.readBits(1);
        adtsHeader.profile = 1 + bitReaderBuffer.readBits(2);
        adtsHeader.sampleFrequencyIndex = bitReaderBuffer.readBits(4);
        adtsHeader.sampleRate = AACTrackImpl.samplingFrequencyIndexMap.get(adtsHeader.sampleFrequencyIndex);
        bitReaderBuffer.readBits(1);
        adtsHeader.channelconfig = bitReaderBuffer.readBits(3);
        adtsHeader.original = bitReaderBuffer.readBits(1);
        adtsHeader.home = bitReaderBuffer.readBits(1);
        adtsHeader.copyrightedStream = bitReaderBuffer.readBits(1);
        adtsHeader.copyrightStart = bitReaderBuffer.readBits(1);
        adtsHeader.frameLength = bitReaderBuffer.readBits(13);
        adtsHeader.bufferFullness = bitReaderBuffer.readBits(11);
        adtsHeader.numAacFramesPerAdtsFrame = 1 + bitReaderBuffer.readBits(2);
        if (adtsHeader.numAacFramesPerAdtsFrame != 1) {
            throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        if (adtsHeader.protectionAbsent == 0) {
            readableByteChannel.read(ByteBuffer.allocate(2));
            return adtsHeader;
        }
        return adtsHeader;
    }
    
    private AdtsHeader readSamples(final ReadableByteChannel readableByteChannel) throws IOException {
        AdtsHeader adtsHeader = null;
        while (true) {
            final AdtsHeader adtsHeader2 = this.readADTSHeader(readableByteChannel);
            if (adtsHeader2 == null) {
                break;
            }
            if (adtsHeader == null) {
                adtsHeader = adtsHeader2;
            }
            if (readableByteChannel instanceof FileChannel) {
                final MappedByteBuffer map = ((FileChannel)readableByteChannel).map(FileChannel.MapMode.READ_ONLY, ((FileChannel)readableByteChannel).position(), adtsHeader2.frameLength - adtsHeader2.getSize());
                this.samples.add(new SampleImpl(map));
                ((FileChannel)readableByteChannel).position(((FileChannel)readableByteChannel).position() + adtsHeader2.frameLength - adtsHeader2.getSize());
                map.rewind();
            }
            else {
                final ByteBuffer allocate = ByteBuffer.allocate(adtsHeader2.frameLength - adtsHeader2.getSize());
                readableByteChannel.read(allocate);
                this.samples.add(new SampleImpl(allocate));
                allocate.rewind();
            }
            this.stts.add(new TimeToSampleBox.Entry(1L, 1024L));
        }
        return adtsHeader;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.stts;
    }
    
    @Override
    public String getHandler() {
        return "soun";
    }
    
    @Override
    public Box getMediaHeaderBox() {
        return new SoundMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.samples;
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }
    
    @Override
    public long[] getSyncSamples() {
        return null;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
    
    @Override
    public String toString() {
        return "AACTrackImpl{sampleRate=" + this.firstHeader.sampleRate + ", channelconfig=" + this.firstHeader.channelconfig + '}';
    }
    
    class AdtsHeader
    {
        int bufferFullness;
        int channelconfig;
        int copyrightStart;
        int copyrightedStream;
        int frameLength;
        int home;
        int layer;
        int mpegVersion;
        int numAacFramesPerAdtsFrame;
        int original;
        int profile;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        
        int getSize() {
            int n;
            if (this.protectionAbsent == 0) {
                n = 2;
            }
            else {
                n = 0;
            }
            return n + 7;
        }
    }
}
