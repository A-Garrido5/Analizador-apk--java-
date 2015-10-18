// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import java.util.Iterator;
import com.coremedia.iso.boxes.SampleTableBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.Box;
import java.util.LinkedList;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.util.Collection;
import java.util.ArrayList;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;

public class Mp4TrackImpl extends AbstractTrack
{
    private List<CompositionTimeToSample.Entry> compositionTimeEntries;
    private List<TimeToSampleBox.Entry> decodingTimeEntries;
    private String handler;
    private AbstractMediaHeaderBox mihd;
    private List<SampleDependencyTypeBox.Entry> sampleDependencies;
    private SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    private long[] syncSamples;
    private TrackMetaData trackMetaData;
    
    public Mp4TrackImpl(final TrackBox trackBox, final IsoFile... array) {
        this.syncSamples = new long[0];
        this.trackMetaData = new TrackMetaData();
        final long trackId = trackBox.getTrackHeaderBox().getTrackId();
        this.samples = new SampleList(trackBox, array);
        final SampleTableBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        this.handler = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        this.mihd = trackBox.getMediaBox().getMediaInformationBox().getMediaHeaderBox();
        this.decodingTimeEntries = new ArrayList<TimeToSampleBox.Entry>();
        this.compositionTimeEntries = new ArrayList<CompositionTimeToSample.Entry>();
        this.sampleDependencies = new ArrayList<SampleDependencyTypeBox.Entry>();
        this.decodingTimeEntries.addAll((Collection<? extends TimeToSampleBox.Entry>)sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            this.compositionTimeEntries.addAll((Collection<? extends CompositionTimeToSample.Entry>)sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            this.sampleDependencies.addAll((Collection<? extends SampleDependencyTypeBox.Entry>)sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            this.syncSamples = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        this.sampleDescriptionBox = sampleTableBox.getSampleDescriptionBox();
        final List<MovieExtendsBox> boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            final Iterator<MovieExtendsBox> iterator = boxes.iterator();
            while (iterator.hasNext()) {
                for (final TrackExtendsBox trackExtendsBox : iterator.next().getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        final LinkedList<Long> list = new LinkedList<Long>();
                        long n = 1L;
                        final Iterator<MovieFragmentBox> iterator3 = ((Box)trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
                        while (iterator3.hasNext()) {
                            for (final TrackFragmentBox trackFragmentBox : iterator3.next().getBoxes(TrackFragmentBox.class)) {
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    for (final TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {
                                        final TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox)trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        boolean b = true;
                                        for (final TrackRunBox.Entry entry : trackRunBox.getEntries()) {
                                            if (trackRunBox.isSampleDurationPresent()) {
                                                if (this.decodingTimeEntries.size() == 0 || this.decodingTimeEntries.get(-1 + this.decodingTimeEntries.size()).getDelta() != entry.getSampleDuration()) {
                                                    this.decodingTimeEntries.add(new TimeToSampleBox.Entry(1L, entry.getSampleDuration()));
                                                }
                                                else {
                                                    final TimeToSampleBox.Entry entry2 = this.decodingTimeEntries.get(-1 + this.decodingTimeEntries.size());
                                                    entry2.setCount(1L + entry2.getCount());
                                                }
                                            }
                                            else if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                this.decodingTimeEntries.add(new TimeToSampleBox.Entry(1L, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                            }
                                            else {
                                                this.decodingTimeEntries.add(new TimeToSampleBox.Entry(1L, trackExtendsBox.getDefaultSampleDuration()));
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (this.compositionTimeEntries.size() == 0 || this.compositionTimeEntries.get(-1 + this.compositionTimeEntries.size()).getOffset() != entry.getSampleCompositionTimeOffset()) {
                                                    this.compositionTimeEntries.add(new CompositionTimeToSample.Entry(1, CastUtils.l2i(entry.getSampleCompositionTimeOffset())));
                                                }
                                                else {
                                                    final CompositionTimeToSample.Entry entry3 = this.compositionTimeEntries.get(-1 + this.compositionTimeEntries.size());
                                                    entry3.setCount(1 + entry3.getCount());
                                                }
                                            }
                                            SampleFlags sampleFlags;
                                            if (trackRunBox.isSampleFlagsPresent()) {
                                                sampleFlags = entry.getSampleFlags();
                                            }
                                            else if (b && trackRunBox.isFirstSampleFlagsPresent()) {
                                                sampleFlags = trackRunBox.getFirstSampleFlags();
                                            }
                                            else if (trackFragmentHeaderBox.hasDefaultSampleFlags()) {
                                                sampleFlags = trackFragmentHeaderBox.getDefaultSampleFlags();
                                            }
                                            else {
                                                sampleFlags = trackExtendsBox.getDefaultSampleFlags();
                                            }
                                            if (sampleFlags != null && !sampleFlags.isSampleIsDifferenceSample()) {
                                                list.add(n);
                                            }
                                            ++n;
                                            b = false;
                                        }
                                    }
                                }
                            }
                        }
                        final long[] syncSamples = this.syncSamples;
                        System.arraycopy(syncSamples, 0, this.syncSamples = new long[this.syncSamples.length + list.size()], 0, syncSamples.length);
                        final Iterator<Object> iterator7 = list.iterator();
                        int length = syncSamples.length;
                        while (iterator7.hasNext()) {
                            final Long n2 = iterator7.next();
                            final long[] syncSamples2 = this.syncSamples;
                            final int n3 = length + 1;
                            syncSamples2[length] = n2;
                            length = n3;
                        }
                    }
                }
            }
        }
        final MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        final TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        this.setEnabled(trackHeaderBox.isEnabled());
        this.setInMovie(trackHeaderBox.isInMovie());
        this.setInPoster(trackHeaderBox.isInPoster());
        this.setInPreview(trackHeaderBox.isInPreview());
        this.trackMetaData.setTrackId(trackHeaderBox.getTrackId());
        this.trackMetaData.setCreationTime(mediaHeaderBox.getCreationTime());
        this.trackMetaData.setLanguage(mediaHeaderBox.getLanguage());
        this.trackMetaData.setModificationTime(mediaHeaderBox.getModificationTime());
        this.trackMetaData.setTimescale(mediaHeaderBox.getTimescale());
        this.trackMetaData.setHeight(trackHeaderBox.getHeight());
        this.trackMetaData.setWidth(trackHeaderBox.getWidth());
        this.trackMetaData.setLayer(trackHeaderBox.getLayer());
        this.trackMetaData.setMatrix(trackHeaderBox.getMatrix());
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.compositionTimeEntries;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.decodingTimeEntries;
    }
    
    @Override
    public String getHandler() {
        return this.handler;
    }
    
    @Override
    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return this.mihd;
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sampleDependencies;
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
        return this.syncSamples;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
    
    @Override
    public String toString() {
        return "Mp4TrackImpl{handler='" + this.handler + '\'' + '}';
    }
}
