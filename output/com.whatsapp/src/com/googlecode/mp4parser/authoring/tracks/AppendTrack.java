// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.Collection;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import java.util.LinkedList;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import java.util.List;
import java.util.Collections;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import java.util.Iterator;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import java.io.IOException;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.authoring.Track;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class AppendTrack extends AbstractTrack
{
    private static Logger LOG;
    SampleDescriptionBox stsd;
    Track[] tracks;
    
    static {
        AppendTrack.LOG = Logger.getLogger(AppendTrack.class);
    }
    
    public AppendTrack(final Track... tracks) throws IOException {
        this.tracks = tracks;
        for (final Track track : tracks) {
            if (this.stsd == null) {
                (this.stsd = new SampleDescriptionBox()).addBox(track.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            }
            else {
                this.stsd = this.mergeStsds(this.stsd, track.getSampleDescriptionBox());
            }
        }
    }
    
    private AudioSampleEntry mergeAudioSampleEntries(final AudioSampleEntry audioSampleEntry, final AudioSampleEntry audioSampleEntry2) {
        final AudioSampleEntry audioSampleEntry3 = new AudioSampleEntry(audioSampleEntry2.getType());
        if (audioSampleEntry.getBytesPerFrame() != audioSampleEntry2.getBytesPerFrame()) {
            return null;
        }
        AppendTrack.LOG.logError("BytesPerFrame differ");
        audioSampleEntry3.setBytesPerFrame(audioSampleEntry.getBytesPerFrame());
        if (audioSampleEntry.getBytesPerPacket() != audioSampleEntry2.getBytesPerPacket()) {
            return null;
        }
        audioSampleEntry3.setBytesPerPacket(audioSampleEntry.getBytesPerPacket());
        if (audioSampleEntry.getBytesPerSample() != audioSampleEntry2.getBytesPerSample()) {
            return null;
        }
        AppendTrack.LOG.logError("BytesPerSample differ");
        audioSampleEntry3.setBytesPerSample(audioSampleEntry.getBytesPerSample());
        if (audioSampleEntry.getChannelCount() != audioSampleEntry2.getChannelCount()) {
            return null;
        }
        AppendTrack.LOG.logError("ChannelCount differ");
        audioSampleEntry3.setChannelCount(audioSampleEntry.getChannelCount());
        if (audioSampleEntry.getPacketSize() != audioSampleEntry2.getPacketSize()) {
            return null;
        }
        audioSampleEntry3.setPacketSize(audioSampleEntry.getPacketSize());
        if (audioSampleEntry.getCompressionId() != audioSampleEntry2.getCompressionId()) {
            return null;
        }
        audioSampleEntry3.setCompressionId(audioSampleEntry.getCompressionId());
        if (audioSampleEntry.getSampleRate() != audioSampleEntry2.getSampleRate()) {
            return null;
        }
        audioSampleEntry3.setSampleRate(audioSampleEntry.getSampleRate());
        if (audioSampleEntry.getSampleSize() != audioSampleEntry2.getSampleSize()) {
            return null;
        }
        audioSampleEntry3.setSampleSize(audioSampleEntry.getSampleSize());
        if (audioSampleEntry.getSamplesPerPacket() != audioSampleEntry2.getSamplesPerPacket()) {
            return null;
        }
        audioSampleEntry3.setSamplesPerPacket(audioSampleEntry.getSamplesPerPacket());
        if (audioSampleEntry.getSoundVersion() != audioSampleEntry2.getSoundVersion()) {
            return null;
        }
        audioSampleEntry3.setSoundVersion(audioSampleEntry.getSoundVersion());
        if (Arrays.equals(audioSampleEntry.getSoundVersion2Data(), audioSampleEntry2.getSoundVersion2Data())) {
            audioSampleEntry3.setSoundVersion2Data(audioSampleEntry.getSoundVersion2Data());
            if (audioSampleEntry.getBoxes().size() == audioSampleEntry2.getBoxes().size()) {
                final Iterator<Box> iterator = audioSampleEntry.getBoxes().iterator();
                final Iterator<Box> iterator2 = audioSampleEntry2.getBoxes().iterator();
                while (iterator.hasNext()) {
                    final Box box = iterator.next();
                    final Box box2 = iterator2.next();
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        box.getBox(Channels.newChannel(byteArrayOutputStream));
                        box2.getBox(Channels.newChannel(byteArrayOutputStream2));
                        if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                            audioSampleEntry3.addBox(box);
                            continue;
                        }
                    }
                    catch (IOException ex) {
                        AppendTrack.LOG.logWarn(ex.getMessage());
                        return null;
                    }
                    if ("esds".equals(box.getType()) && "esds".equals(box2.getType())) {
                        final ESDescriptorBox esDescriptorBox = (ESDescriptorBox)box;
                        esDescriptorBox.setDescriptor(this.mergeDescriptors(esDescriptorBox.getEsDescriptor(), ((ESDescriptorBox)box2).getEsDescriptor()));
                        audioSampleEntry3.addBox(box);
                    }
                }
            }
            return audioSampleEntry3;
        }
        return null;
    }
    
    private ESDescriptor mergeDescriptors(final BaseDescriptor baseDescriptor, final BaseDescriptor baseDescriptor2) {
        if (baseDescriptor instanceof ESDescriptor && baseDescriptor2 instanceof ESDescriptor) {
            ESDescriptor esDescriptor = (ESDescriptor)baseDescriptor;
            final ESDescriptor esDescriptor2 = (ESDescriptor)baseDescriptor2;
            if (esDescriptor.getURLFlag() != esDescriptor2.getURLFlag()) {
                esDescriptor = null;
            }
            else {
                esDescriptor.getURLLength();
                esDescriptor2.getURLLength();
                if (esDescriptor.getDependsOnEsId() != esDescriptor2.getDependsOnEsId()) {
                    return null;
                }
                if (esDescriptor.getEsId() != esDescriptor2.getEsId()) {
                    return null;
                }
                if (esDescriptor.getoCREsId() != esDescriptor2.getoCREsId()) {
                    return null;
                }
                if (esDescriptor.getoCRstreamFlag() != esDescriptor2.getoCRstreamFlag()) {
                    return null;
                }
                if (esDescriptor.getRemoteODFlag() != esDescriptor2.getRemoteODFlag()) {
                    return null;
                }
                if (esDescriptor.getStreamDependenceFlag() != esDescriptor2.getStreamDependenceFlag()) {
                    return null;
                }
                esDescriptor.getStreamPriority();
                esDescriptor2.getStreamPriority();
                if (esDescriptor.getURLString() != null) {
                    esDescriptor.getURLString().equals(esDescriptor2.getURLString());
                }
                else {
                    esDescriptor2.getURLString();
                }
                Label_0253: {
                    if (esDescriptor.getDecoderConfigDescriptor() != null) {
                        if (esDescriptor.getDecoderConfigDescriptor().equals(esDescriptor2.getDecoderConfigDescriptor())) {
                            break Label_0253;
                        }
                    }
                    else if (esDescriptor2.getDecoderConfigDescriptor() == null) {
                        break Label_0253;
                    }
                    final DecoderConfigDescriptor decoderConfigDescriptor = esDescriptor.getDecoderConfigDescriptor();
                    final DecoderConfigDescriptor decoderConfigDescriptor2 = esDescriptor2.getDecoderConfigDescriptor();
                    if (decoderConfigDescriptor.getAudioSpecificInfo() != null && decoderConfigDescriptor2.getAudioSpecificInfo() != null && !decoderConfigDescriptor.getAudioSpecificInfo().equals(decoderConfigDescriptor2.getAudioSpecificInfo())) {
                        return null;
                    }
                    if (decoderConfigDescriptor.getAvgBitRate() != decoderConfigDescriptor2.getAvgBitRate()) {
                        decoderConfigDescriptor.setAvgBitRate((decoderConfigDescriptor.getAvgBitRate() + decoderConfigDescriptor2.getAvgBitRate()) / 2L);
                    }
                    decoderConfigDescriptor.getBufferSizeDB();
                    decoderConfigDescriptor2.getBufferSizeDB();
                    Label_0359: {
                        if (decoderConfigDescriptor.getDecoderSpecificInfo() != null) {
                            if (decoderConfigDescriptor.getDecoderSpecificInfo().equals(decoderConfigDescriptor2.getDecoderSpecificInfo())) {
                                break Label_0359;
                            }
                        }
                        else if (decoderConfigDescriptor2.getDecoderSpecificInfo() == null) {
                            break Label_0359;
                        }
                        return null;
                    }
                    if (decoderConfigDescriptor.getMaxBitRate() != decoderConfigDescriptor2.getMaxBitRate()) {
                        decoderConfigDescriptor.setMaxBitRate(Math.max(decoderConfigDescriptor.getMaxBitRate(), decoderConfigDescriptor2.getMaxBitRate()));
                    }
                    if (!decoderConfigDescriptor.getProfileLevelIndicationDescriptors().equals(decoderConfigDescriptor2.getProfileLevelIndicationDescriptors())) {
                        return null;
                    }
                    if (decoderConfigDescriptor.getObjectTypeIndication() != decoderConfigDescriptor2.getObjectTypeIndication()) {
                        return null;
                    }
                    if (decoderConfigDescriptor.getStreamType() != decoderConfigDescriptor2.getStreamType()) {
                        return null;
                    }
                    if (decoderConfigDescriptor.getUpStream() != decoderConfigDescriptor2.getUpStream()) {
                        return null;
                    }
                }
                Label_0464: {
                    if (esDescriptor.getOtherDescriptors() != null) {
                        if (esDescriptor.getOtherDescriptors().equals(esDescriptor2.getOtherDescriptors())) {
                            break Label_0464;
                        }
                    }
                    else if (esDescriptor2.getOtherDescriptors() == null) {
                        break Label_0464;
                    }
                    return null;
                }
                if (esDescriptor.getSlConfigDescriptor() != null) {
                    if (esDescriptor.getSlConfigDescriptor().equals(esDescriptor2.getSlConfigDescriptor())) {
                        return esDescriptor;
                    }
                }
                else if (esDescriptor2.getSlConfigDescriptor() == null) {
                    return esDescriptor;
                }
                return null;
            }
            return esDescriptor;
        }
        AppendTrack.LOG.logError("I can only merge ESDescriptors");
        return null;
    }
    
    private SampleEntry mergeSampleEntry(final SampleEntry sampleEntry, final SampleEntry sampleEntry2) {
        if (sampleEntry.getType().equals(sampleEntry2.getType())) {
            if (sampleEntry instanceof VisualSampleEntry && sampleEntry2 instanceof VisualSampleEntry) {
                return this.mergeVisualSampleEntry((VisualSampleEntry)sampleEntry, (VisualSampleEntry)sampleEntry2);
            }
            if (sampleEntry instanceof AudioSampleEntry && sampleEntry2 instanceof AudioSampleEntry) {
                return this.mergeAudioSampleEntries((AudioSampleEntry)sampleEntry, (AudioSampleEntry)sampleEntry2);
            }
        }
        return null;
    }
    
    private SampleDescriptionBox mergeStsds(final SampleDescriptionBox sampleDescriptionBox, final SampleDescriptionBox sampleDescriptionBox2) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sampleDescriptionBox.getBox(Channels.newChannel(byteArrayOutputStream));
            sampleDescriptionBox2.getBox(Channels.newChannel(byteArrayOutputStream2));
            if (!Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                final SampleEntry mergeSampleEntry = this.mergeSampleEntry(sampleDescriptionBox.getBoxes(SampleEntry.class).get(0), sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                if (mergeSampleEntry == null) {
                    throw new IOException("Cannot merge " + sampleDescriptionBox.getBoxes(SampleEntry.class).get(0) + " and " + sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                }
                sampleDescriptionBox.setBoxes((List<Box>)Collections.singletonList(mergeSampleEntry));
            }
            return sampleDescriptionBox;
        }
        catch (IOException ex) {
            AppendTrack.LOG.logError(ex.getMessage());
            return null;
        }
        throw new IOException("Cannot merge " + sampleDescriptionBox.getBoxes(SampleEntry.class).get(0) + " and " + sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
    }
    
    private VisualSampleEntry mergeVisualSampleEntry(final VisualSampleEntry visualSampleEntry, final VisualSampleEntry visualSampleEntry2) {
        final VisualSampleEntry visualSampleEntry3 = new VisualSampleEntry();
        if (visualSampleEntry.getHorizresolution() != visualSampleEntry2.getHorizresolution()) {
            AppendTrack.LOG.logError("Horizontal Resolution differs");
            return null;
        }
        visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
        visualSampleEntry3.setCompressorname(visualSampleEntry.getCompressorname());
        if (visualSampleEntry.getDepth() != visualSampleEntry2.getDepth()) {
            AppendTrack.LOG.logError("Depth differs");
            return null;
        }
        visualSampleEntry3.setDepth(visualSampleEntry.getDepth());
        if (visualSampleEntry.getFrameCount() != visualSampleEntry2.getFrameCount()) {
            AppendTrack.LOG.logError("frame count differs");
            return null;
        }
        visualSampleEntry3.setFrameCount(visualSampleEntry.getFrameCount());
        if (visualSampleEntry.getHeight() != visualSampleEntry2.getHeight()) {
            AppendTrack.LOG.logError("height differs");
            return null;
        }
        visualSampleEntry3.setHeight(visualSampleEntry.getHeight());
        if (visualSampleEntry.getWidth() != visualSampleEntry2.getWidth()) {
            AppendTrack.LOG.logError("width differs");
            return null;
        }
        visualSampleEntry3.setWidth(visualSampleEntry.getWidth());
        if (visualSampleEntry.getVertresolution() != visualSampleEntry2.getVertresolution()) {
            AppendTrack.LOG.logError("vert resolution differs");
            return null;
        }
        visualSampleEntry3.setVertresolution(visualSampleEntry.getVertresolution());
        if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
            visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
            if (visualSampleEntry.getBoxes().size() == visualSampleEntry2.getBoxes().size()) {
                final Iterator<Box> iterator = visualSampleEntry.getBoxes().iterator();
                final Iterator<Box> iterator2 = visualSampleEntry2.getBoxes().iterator();
                while (iterator.hasNext()) {
                    final Box box = iterator.next();
                    final Box box2 = iterator2.next();
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        box.getBox(Channels.newChannel(byteArrayOutputStream));
                        box2.getBox(Channels.newChannel(byteArrayOutputStream2));
                        if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                            visualSampleEntry3.addBox(box);
                            continue;
                        }
                    }
                    catch (IOException ex) {
                        AppendTrack.LOG.logWarn(ex.getMessage());
                        return null;
                    }
                    if (box instanceof AbstractDescriptorBox && box2 instanceof AbstractDescriptorBox) {
                        ((AbstractDescriptorBox)box).setDescriptor(this.mergeDescriptors(((AbstractDescriptorBox)box).getDescriptor(), ((AbstractDescriptorBox)box2).getDescriptor()));
                        visualSampleEntry3.addBox(box);
                    }
                }
            }
            return visualSampleEntry3;
        }
        AppendTrack.LOG.logError("horizontal resolution differs");
        return null;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        if (this.tracks[0].getCompositionTimeEntries() != null && !this.tracks[0].getCompositionTimeEntries().isEmpty()) {
            final LinkedList<int[]> list = new LinkedList<int[]>();
            final Track[] tracks = this.tracks;
            for (int length = tracks.length, i = 0; i < length; ++i) {
                list.add(CompositionTimeToSample.blowupCompositionTimes(tracks[i].getCompositionTimeEntries()));
            }
            final LinkedList<CompositionTimeToSample.Entry> list2 = new LinkedList<CompositionTimeToSample.Entry>();
            for (final int[] array : list) {
                for (final int n : array) {
                    if (list2.isEmpty() || list2.getLast().getOffset() != n) {
                        list2.add(new CompositionTimeToSample.Entry(1, n));
                    }
                    else {
                        final CompositionTimeToSample.Entry entry = list2.getLast();
                        entry.setCount(1 + entry.getCount());
                    }
                }
            }
            return list2;
        }
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        if (this.tracks[0].getDecodingTimeEntries() != null && !this.tracks[0].getDecodingTimeEntries().isEmpty()) {
            final LinkedList<long[]> list = new LinkedList<long[]>();
            final Track[] tracks = this.tracks;
            for (int length = tracks.length, i = 0; i < length; ++i) {
                list.add(TimeToSampleBox.blowupTimeToSamples(tracks[i].getDecodingTimeEntries()));
            }
            final LinkedList<TimeToSampleBox.Entry> list2 = new LinkedList<TimeToSampleBox.Entry>();
            for (final long[] array : list) {
                for (final long n : array) {
                    if (list2.isEmpty() || list2.getLast().getDelta() != n) {
                        list2.add(new TimeToSampleBox.Entry(1L, n));
                    }
                    else {
                        final TimeToSampleBox.Entry entry = list2.getLast();
                        entry.setCount(1L + entry.getCount());
                    }
                }
            }
            return list2;
        }
        return null;
    }
    
    @Override
    public String getHandler() {
        return this.tracks[0].getHandler();
    }
    
    @Override
    public Box getMediaHeaderBox() {
        return this.tracks[0].getMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        int i = 0;
        if (this.tracks[0].getSampleDependencies() != null && !this.tracks[0].getSampleDependencies().isEmpty()) {
            final LinkedList<Object> list = (LinkedList<Object>)new LinkedList<SampleDependencyTypeBox.Entry>();
            for (Track[] tracks = this.tracks; i < tracks.length; ++i) {
                list.addAll(tracks[i].getSampleDependencies());
            }
            return (List<SampleDependencyTypeBox.Entry>)list;
        }
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }
    
    @Override
    public List<Sample> getSamples() {
        final ArrayList<Sample> list = new ArrayList<Sample>();
        final Track[] tracks = this.tracks;
        for (int length = tracks.length, i = 0; i < length; ++i) {
            list.addAll(tracks[i].getSamples());
        }
        return list;
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.tracks[0].getSubsampleInformationBox();
    }
    
    @Override
    public long[] getSyncSamples() {
        if (this.tracks[0].getSyncSamples() != null && this.tracks[0].getSyncSamples().length > 0) {
            int n = 0;
            final Track[] tracks = this.tracks;
            for (int length = tracks.length, i = 0; i < length; ++i) {
                n += tracks[i].getSyncSamples().length;
            }
            final long[] array = new long[n];
            int n2 = 0;
            long n3 = 0L;
            final Track[] tracks2 = this.tracks;
            int n4;
            for (int length2 = tracks2.length, j = 0; j < length2; ++j, n2 = n4) {
                final Track track = tracks2[j];
                final long[] syncSamples = track.getSyncSamples();
                final int length3 = syncSamples.length;
                int k = 0;
                n4 = n2;
                while (k < length3) {
                    final long n5 = syncSamples[k];
                    final int n6 = n4 + 1;
                    array[n4] = n3 + n5;
                    ++k;
                    n4 = n6;
                }
                n3 += track.getSamples().size();
            }
            return array;
        }
        return null;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.tracks[0].getTrackMetaData();
    }
}
