// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Comparator;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.Queue;
import java.util.Collections;
import java.util.Arrays;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.ArrayList;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import java.util.Collection;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.SampleTableBox;
import java.util.Date;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.MovieBox;
import java.util.Map;
import java.util.HashMap;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import java.util.List;
import com.coremedia.iso.boxes.FileTypeBox;
import java.util.LinkedList;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.DataInformationBox;
import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.BasicContainer;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.Movie;
import java.util.logging.Logger;

public class FragmentedMp4Builder implements Mp4Builder
{
    private static final Logger LOG;
    protected FragmentIntersectionFinder intersectionFinder;
    
    static {
        LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());
    }
    
    public FragmentedMp4Builder() {
        this.intersectionFinder = new SyncSampleIntersectFinderImpl();
    }
    
    private long getTrackDuration(final Movie movie, final Track track) {
        return this.getDuration(track) * movie.getTimescale() / track.getTrackMetaData().getTimescale();
    }
    
    @Override
    public Container build(final Movie movie) {
        FragmentedMp4Builder.LOG.fine("Creating movie " + movie);
        final BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(this.createFtyp(movie));
        basicContainer.addBox(this.createMoov(movie));
        final Iterator<Box> iterator = this.createMoofMdat(movie).iterator();
        while (iterator.hasNext()) {
            basicContainer.addBox(iterator.next());
        }
        basicContainer.addBox(this.createMfra(movie, basicContainer));
        return basicContainer;
    }
    
    protected DataInformationBox createDinf(final Movie movie, final Track track) {
        final DataInformationBox dataInformationBox = new DataInformationBox();
        final DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        final DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }
    
    public Box createFtyp(final Movie movie) {
        final LinkedList<String> list = new LinkedList<String>();
        list.add("isom");
        list.add("iso2");
        list.add("avc1");
        return new FileTypeBox("isom", 0L, list);
    }
    
    protected Box createMdat(final long n, final long n2, final Track track, final int n3) {
        return new Mdat(n, n2, track, n3);
    }
    
    protected Box createMdhd(final Movie movie, final Track track) {
        final MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setDuration(this.getDuration(track));
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        return mediaHeaderBox;
    }
    
    protected Box createMdia(final Track track, final Movie movie) {
        final MediaBox mediaBox = new MediaBox();
        mediaBox.addBox(this.createMdhd(movie, track));
        mediaBox.addBox(this.createMdiaHdlr(track, movie));
        mediaBox.addBox(this.createMinf(track, movie));
        return mediaBox;
    }
    
    protected Box createMdiaHdlr(final Track track, final Movie movie) {
        final HandlerBox handlerBox = new HandlerBox();
        handlerBox.setHandlerType(track.getHandler());
        return handlerBox;
    }
    
    protected Box createMfhd(final long n, final long n2, final Track track, final int n3) {
        final MovieFragmentHeaderBox movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber(n3);
        return movieFragmentHeaderBox;
    }
    
    protected Box createMfra(final Movie movie, final Container container) {
        final MovieFragmentRandomAccessBox movieFragmentRandomAccessBox = new MovieFragmentRandomAccessBox();
        final Iterator<Track> iterator = movie.getTracks().iterator();
        while (iterator.hasNext()) {
            movieFragmentRandomAccessBox.addBox(this.createTfra(iterator.next(), container));
        }
        final MovieFragmentRandomAccessOffsetBox movieFragmentRandomAccessOffsetBox = new MovieFragmentRandomAccessOffsetBox();
        movieFragmentRandomAccessBox.addBox(movieFragmentRandomAccessOffsetBox);
        movieFragmentRandomAccessOffsetBox.setMfraSize(movieFragmentRandomAccessBox.getSize());
        return movieFragmentRandomAccessBox;
    }
    
    protected Box createMinf(final Track track, final Movie movie) {
        final MediaInformationBox mediaInformationBox = new MediaInformationBox();
        mediaInformationBox.addBox(track.getMediaHeaderBox());
        mediaInformationBox.addBox(this.createDinf(movie, track));
        mediaInformationBox.addBox(this.createStbl(movie, track));
        return mediaInformationBox;
    }
    
    protected Box createMoof(final long n, final long n2, final Track track, final int n3) {
        final MovieFragmentBox movieFragmentBox = new MovieFragmentBox();
        movieFragmentBox.addBox(this.createMfhd(n, n2, track, n3));
        movieFragmentBox.addBox(this.createTraf(n, n2, track, n3));
        final TrackRunBox trackRunBox = movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int)(8L + movieFragmentBox.getSize()));
        return movieFragmentBox;
    }
    
    protected List<Box> createMoofMdat(final Movie movie) {
        final LinkedList<Box> list = new LinkedList<Box>();
        final HashMap<Track, long[]> hashMap = new HashMap<Track, long[]>();
        int max = 0;
        for (final Track track : movie.getTracks()) {
            final long[] sampleNumbers = this.intersectionFinder.sampleNumbers(track, movie);
            hashMap.put(track, sampleNumbers);
            max = Math.max(max, sampleNumbers.length);
        }
        int n = 1;
        for (int i = 0; i < max; ++i) {
            for (final Track track2 : this.sortTracksInSequence(movie.getTracks(), i, hashMap)) {
                if (this.getAllowedHandlers().isEmpty() || this.getAllowedHandlers().contains(track2.getHandler())) {
                    final long[] array = hashMap.get(track2);
                    if (i >= array.length) {
                        continue;
                    }
                    final long n2 = array[i];
                    long n3;
                    if (i + 1 < array.length) {
                        n3 = array[i + 1];
                    }
                    else {
                        n3 = 1 + track2.getSamples().size();
                    }
                    if (n2 == n3) {
                        continue;
                    }
                    list.add(this.createMoof(n2, n3, track2, n));
                    final int n4 = n + 1;
                    list.add(this.createMdat(n2, n3, track2, n));
                    n = n4;
                }
            }
        }
        return list;
    }
    
    protected Box createMoov(final Movie movie) {
        final MovieBox movieBox = new MovieBox();
        movieBox.addBox(this.createMvhd(movie));
        movieBox.addBox(this.createMvex(movie));
        final Iterator<Track> iterator = movie.getTracks().iterator();
        while (iterator.hasNext()) {
            movieBox.addBox(this.createTrak(iterator.next(), movie));
        }
        return movieBox;
    }
    
    protected Box createMvex(final Movie movie) {
        final MovieExtendsBox movieExtendsBox = new MovieExtendsBox();
        final MovieExtendsHeaderBox movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        final Iterator<Track> iterator = movie.getTracks().iterator();
        while (iterator.hasNext()) {
            final long trackDuration = this.getTrackDuration(movie, iterator.next());
            if (movieExtendsHeaderBox.getFragmentDuration() < trackDuration) {
                movieExtendsHeaderBox.setFragmentDuration(trackDuration);
            }
        }
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        final Iterator<Track> iterator2 = movie.getTracks().iterator();
        while (iterator2.hasNext()) {
            movieExtendsBox.addBox(this.createTrex(movie, iterator2.next()));
        }
        return movieExtendsBox;
    }
    
    protected Box createMvhd(final Movie movie) {
        final MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        final long timescale = movie.getTimescale();
        long duration = 0L;
        for (final Track track : movie.getTracks()) {
            final long n = timescale * this.getDuration(track) / track.getTrackMetaData().getTimescale();
            if (n > duration) {
                duration = n;
            }
        }
        movieHeaderBox.setDuration(duration);
        movieHeaderBox.setTimescale(timescale);
        long trackId = 0L;
        for (final Track track2 : movie.getTracks()) {
            if (trackId < track2.getTrackMetaData().getTrackId()) {
                trackId = track2.getTrackMetaData().getTrackId();
            }
        }
        movieHeaderBox.setNextTrackId(trackId + 1L);
        return movieHeaderBox;
    }
    
    protected Box createStbl(final Movie movie, final Track track) {
        final SampleTableBox sampleTableBox = new SampleTableBox();
        sampleTableBox.addBox(track.getSampleDescriptionBox());
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }
    
    protected Box createTfhd(final long n, final long n2, final Track track, final int n3) {
        final TrackFragmentHeaderBox trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new SampleFlags());
        trackFragmentHeaderBox.setBaseDataOffset(-1L);
        trackFragmentHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        return trackFragmentHeaderBox;
    }
    
    protected Box createTfra(final Track track, final Container container) {
        final TrackFragmentRandomAccessBox trackFragmentRandomAccessBox = new TrackFragmentRandomAccessBox();
        trackFragmentRandomAccessBox.setVersion(1);
        final LinkedList<TrackFragmentRandomAccessBox.Entry> entries = new LinkedList<TrackFragmentRandomAccessBox.Entry>();
        long n = 0L;
        long n2 = 0L;
        for (final Box box : container.getBoxes()) {
            if (box instanceof MovieFragmentBox) {
                final List<TrackFragmentBox> boxes = ((MovieFragmentBox)box).getBoxes(TrackFragmentBox.class);
                for (int i = 0; i < boxes.size(); ++i) {
                    final TrackFragmentBox trackFragmentBox = boxes.get(i);
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId()) {
                        final List<TrackRunBox> boxes2 = trackFragmentBox.getBoxes(TrackRunBox.class);
                        for (int j = 0; j < boxes2.size(); ++j) {
                            final LinkedList<Object> list = new LinkedList<Object>();
                            final TrackRunBox trackRunBox = boxes2.get(j);
                            for (int k = 0; k < trackRunBox.getEntries().size(); ++k) {
                                final TrackRunBox.Entry entry = trackRunBox.getEntries().get(k);
                                SampleFlags sampleFlags = null;
                                if (k == 0 && trackRunBox.isFirstSampleFlagsPresent()) {
                                    sampleFlags = trackRunBox.getFirstSampleFlags();
                                }
                                else if (trackRunBox.isSampleFlagsPresent()) {
                                    sampleFlags = entry.getSampleFlags();
                                }
                                else {
                                    BasicContainer basicContainer = null;
                                    for (final Box box2 : container.getBoxes()) {
                                        if (box2 instanceof MovieBox) {
                                            basicContainer = (MovieBox)box2;
                                        }
                                    }
                                    final Iterator<MovieExtendsBox> iterator3 = basicContainer.getBoxes(MovieExtendsBox.class).iterator();
                                    while (iterator3.hasNext()) {
                                        for (final TrackExtendsBox trackExtendsBox : iterator3.next().getBoxes(TrackExtendsBox.class)) {
                                            if (trackExtendsBox.getTrackId() == track.getTrackMetaData().getTrackId()) {
                                                sampleFlags = trackExtendsBox.getDefaultSampleFlags();
                                            }
                                        }
                                    }
                                }
                                if (sampleFlags == null) {
                                    throw new RuntimeException("Could not find any SampleFlags to indicate random access or not");
                                }
                                if (sampleFlags.getSampleDependsOn() == 2) {
                                    list.add(new TrackFragmentRandomAccessBox.Entry(n2, n, i + 1, j + 1, k + 1));
                                }
                                n2 += entry.getSampleDuration();
                            }
                            if (list.size() == trackRunBox.getEntries().size() && trackRunBox.getEntries().size() > 0) {
                                entries.add((TrackFragmentRandomAccessBox.Entry)list.get(0));
                            }
                            else {
                                entries.addAll((Collection<?>)list);
                            }
                        }
                    }
                }
            }
            n += box.getSize();
        }
        trackFragmentRandomAccessBox.setEntries(entries);
        trackFragmentRandomAccessBox.setTrackId(track.getTrackMetaData().getTrackId());
        return trackFragmentRandomAccessBox;
    }
    
    protected Box createTkhd(final Movie movie, final Track track) {
        final TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setVersion(1);
        final boolean enabled = track.isEnabled();
        int flags = 0;
        if (enabled) {
            flags = 0 + 1;
        }
        if (track.isInMovie()) {
            flags += 2;
        }
        if (track.isInPreview()) {
            flags += 4;
        }
        if (track.isInPoster()) {
            flags += 8;
        }
        trackHeaderBox.setFlags(flags);
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        trackHeaderBox.setDuration(this.getTrackDuration(movie, track));
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        return trackHeaderBox;
    }
    
    protected Box createTraf(final long n, final long n2, final Track track, final int n3) {
        final TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        trackFragmentBox.addBox(this.createTfhd(n, n2, track, n3));
        final Iterator<? extends Box> iterator = this.createTruns(n, n2, track, n3).iterator();
        while (iterator.hasNext()) {
            trackFragmentBox.addBox((Box)iterator.next());
        }
        return trackFragmentBox;
    }
    
    protected Box createTrak(final Track track, final Movie movie) {
        FragmentedMp4Builder.LOG.fine("Creating Track " + track);
        final TrackBox trackBox = new TrackBox();
        trackBox.addBox(this.createTkhd(movie, track));
        trackBox.addBox(this.createMdia(track, movie));
        return trackBox;
    }
    
    protected Box createTrex(final Movie movie, final Track track) {
        final TrackExtendsBox trackExtendsBox = new TrackExtendsBox();
        trackExtendsBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackExtendsBox.setDefaultSampleDescriptionIndex(1L);
        trackExtendsBox.setDefaultSampleDuration(0L);
        trackExtendsBox.setDefaultSampleSize(0L);
        final SampleFlags defaultSampleFlags = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler())) {
            defaultSampleFlags.setSampleDependsOn(2);
            defaultSampleFlags.setSampleIsDependedOn(2);
        }
        trackExtendsBox.setDefaultSampleFlags(defaultSampleFlags);
        return trackExtendsBox;
    }
    
    protected List<? extends Box> createTruns(final long n, final long n2, final Track track, final int n3) {
        final TrackRunBox trackRunBox = new TrackRunBox();
        final long[] sampleSizes = this.getSampleSizes(n, n2, track, n3);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        final ArrayList<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(CastUtils.l2i(n2 - n));
        LinkedList<TimeToSampleBox.Entry> list;
        long n4;
        long n5;
        for (list = new LinkedList<TimeToSampleBox.Entry>((Collection<? extends TimeToSampleBox.Entry>)track.getDecodingTimeEntries()), n4 = n - 1L, n5 = ((TimeToSampleBox.Entry)list.peek()).getCount(); n4 > n5; n5 = ((TimeToSampleBox.Entry)list.peek()).getCount()) {
            n4 -= n5;
            list.remove();
        }
        long count = n5 - n4;
        Queue<CompositionTimeToSample.Entry> queue;
        if (track.getCompositionTimeEntries() != null && track.getCompositionTimeEntries().size() > 0) {
            queue = new LinkedList<CompositionTimeToSample.Entry>(track.getCompositionTimeEntries());
        }
        else {
            queue = null;
        }
        int count2;
        if (queue != null) {
            count2 = queue.peek().getCount();
        }
        else {
            count2 = -1;
        }
        long n6 = count2;
        trackRunBox.setSampleCompositionTimeOffsetPresent(n6 > 0L);
        for (long n7 = 1L; n7 < n; ++n7) {
            if (queue != null) {
                --n6;
                if (n6 == 0L && queue.size() > 1) {
                    queue.remove();
                    n6 = queue.element().getCount();
                }
            }
        }
        final boolean sampleFlagsPresent = (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty()) || (track.getSyncSamples() != null && track.getSyncSamples().length != 0);
        trackRunBox.setSampleFlagsPresent(sampleFlagsPresent);
        for (int i = 0; i < sampleSizes.length; ++i) {
            final TrackRunBox.Entry entry = new TrackRunBox.Entry();
            entry.setSampleSize(sampleSizes[i]);
            if (sampleFlagsPresent) {
                final SampleFlags sampleFlags = new SampleFlags();
                if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty()) {
                    final SampleDependencyTypeBox.Entry entry2 = track.getSampleDependencies().get(i);
                    sampleFlags.setSampleDependsOn(entry2.getSampleDependsOn());
                    sampleFlags.setSampleIsDependedOn(entry2.getSampleIsDependentOn());
                    sampleFlags.setSampleHasRedundancy(entry2.getSampleHasRedundancy());
                }
                if (track.getSyncSamples() != null && track.getSyncSamples().length > 0) {
                    if (Arrays.binarySearch(track.getSyncSamples(), n + i) >= 0) {
                        sampleFlags.setSampleIsDifferenceSample(false);
                        sampleFlags.setSampleDependsOn(2);
                    }
                    else {
                        sampleFlags.setSampleIsDifferenceSample(true);
                        sampleFlags.setSampleDependsOn(1);
                    }
                }
                entry.setSampleFlags(sampleFlags);
            }
            entry.setSampleDuration(((TimeToSampleBox.Entry)list.peek()).getDelta());
            --count;
            if (count == 0L && list.size() > 1) {
                list.remove();
                count = ((TimeToSampleBox.Entry)list.peek()).getCount();
            }
            if (queue != null) {
                entry.setSampleCompositionTimeOffset(queue.peek().getOffset());
                --n6;
                if (n6 == 0L && queue.size() > 1) {
                    queue.remove();
                    n6 = queue.element().getCount();
                }
            }
            entries.add(entry);
        }
        trackRunBox.setEntries(entries);
        return Collections.singletonList((Box)trackRunBox);
    }
    
    public List<String> getAllowedHandlers() {
        return Arrays.asList("soun", "vide");
    }
    
    protected long getDuration(final Track track) {
        long n = 0L;
        for (final TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            n += entry.getCount() * entry.getDelta();
        }
        return n;
    }
    
    public FragmentIntersectionFinder getFragmentIntersectionFinder() {
        return this.intersectionFinder;
    }
    
    protected long[] getSampleSizes(final long n, final long n2, final Track track, final int n3) {
        final List<Sample> samples = this.getSamples(n, n2, track, n3);
        final long[] array = new long[samples.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = samples.get(i).remaining();
        }
        return array;
    }
    
    protected List<Sample> getSamples(final long n, final long n2, final Track track, final int n3) {
        return track.getSamples().subList(-1 + CastUtils.l2i(n), -1 + CastUtils.l2i(n2));
    }
    
    public void setIntersectionFinder(final FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }
    
    protected List<Track> sortTracksInSequence(final List<Track> list, final int n, final Map<Track, long[]> map) {
        final LinkedList<Object> list2 = new LinkedList<Object>(list);
        Collections.sort(list2, (Comparator<? super Object>)new Comparator<Track>() {
            @Override
            public int compare(final Track track, final Track track2) {
                final long n = ((long[])map.get(track))[n];
                final long n2 = ((long[])map.get(track2))[n];
                final long[] blowupTimeToSamples = TimeToSampleBox.blowupTimeToSamples(track.getDecodingTimeEntries());
                final long[] blowupTimeToSamples2 = TimeToSampleBox.blowupTimeToSamples(track2.getDecodingTimeEntries());
                long n3 = 0L;
                long n4 = 0L;
                for (int n5 = 1; n5 < n; ++n5) {
                    n3 += blowupTimeToSamples[n5 - 1];
                }
                for (int n6 = 1; n6 < n2; ++n6) {
                    n4 += blowupTimeToSamples2[n6 - 1];
                }
                return (int)(100.0 * (n3 / track.getTrackMetaData().getTimescale() - n4 / track2.getTrackMetaData().getTimescale()));
            }
        });
        return (List<Track>)list2;
    }
    
    class Mdat implements Box
    {
        Container parent;
        private final /* synthetic */ long val$endSample;
        private final /* synthetic */ int val$i;
        private final /* synthetic */ long val$startSample;
        private final /* synthetic */ Track val$track;
        
        Mdat(final long val$startSample, final long val$endSample, final Track val$track, final int val$i) {
            this.val$startSample = val$startSample;
            this.val$endSample = val$endSample;
            this.val$track = val$track;
            this.val$i = val$i;
        }
        
        @Override
        public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
            final ByteBuffer allocate = ByteBuffer.allocate(8);
            IsoTypeWriter.writeUInt32(allocate, CastUtils.l2i(this.getSize()));
            allocate.put(IsoFile.fourCCtoBytes(this.getType()));
            allocate.rewind();
            writableByteChannel.write(allocate);
            final Iterator<Sample> iterator = FragmentedMp4Builder.this.getSamples(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
            while (iterator.hasNext()) {
                iterator.next().writeTo(writableByteChannel);
            }
        }
        
        @Override
        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }
        
        @Override
        public Container getParent() {
            return this.parent;
        }
        
        @Override
        public long getSize() {
            long n = 8L;
            final Iterator<Sample> iterator = FragmentedMp4Builder.this.getSamples(this.val$startSample, this.val$endSample, this.val$track, this.val$i).iterator();
            while (iterator.hasNext()) {
                n += iterator.next().remaining();
            }
            return n;
        }
        
        @Override
        public String getType() {
            return "mdat";
        }
        
        @Override
        public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        }
        
        @Override
        public void setParent(final Container parent) {
            this.parent = parent;
        }
    }
}
