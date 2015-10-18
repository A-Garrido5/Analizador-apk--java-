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
import java.util.ArrayList;
import com.googlecode.mp4parser.util.CastUtils;
import java.util.logging.Level;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.TrackBox;
import java.util.Date;
import com.coremedia.iso.boxes.MovieHeaderBox;
import java.util.LinkedList;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.googlecode.mp4parser.util.Path;
import java.util.Map;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.BasicContainer;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import java.util.Iterator;
import com.coremedia.iso.boxes.TimeToSampleBox;
import java.util.HashSet;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.List;
import com.googlecode.mp4parser.authoring.Track;
import java.util.HashMap;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import java.util.Set;
import java.util.logging.Logger;

public class DefaultMp4Builder implements Mp4Builder
{
    private static Logger LOG;
    Set<StaticChunkOffsetBox> chunkOffsetBoxes;
    private FragmentIntersectionFinder intersectionFinder;
    HashMap<Track, List<Sample>> track2Sample;
    HashMap<Track, long[]> track2SampleSizes;
    
    static {
        DefaultMp4Builder.LOG = Logger.getLogger(DefaultMp4Builder.class.getName());
    }
    
    public DefaultMp4Builder() {
        this.chunkOffsetBoxes = new HashSet<StaticChunkOffsetBox>();
        this.track2Sample = new HashMap<Track, List<Sample>>();
        this.track2SampleSizes = new HashMap<Track, long[]>();
        this.intersectionFinder = new TwoSecondIntersectionFinder();
    }
    
    public static long gcd(final long n, final long n2) {
        if (n2 == 0L) {
            return n;
        }
        return gcd(n2, n % n2);
    }
    
    protected static long getDuration(final Track track) {
        long n = 0L;
        for (final TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            n += entry.getCount() * entry.getDelta();
        }
        return n;
    }
    
    private static long sum(final int[] array) {
        long n = 0L;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i];
        }
        return n;
    }
    
    private static long sum(final long[] array) {
        long n = 0L;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i];
        }
        return n;
    }
    
    @Override
    public Container build(final Movie movie) {
        DefaultMp4Builder.LOG.fine("Creating movie " + movie);
        for (final Track track : movie.getTracks()) {
            final List<Sample> samples = track.getSamples();
            this.putSamples(track, samples);
            final long[] array = new long[samples.size()];
            for (int i = 0; i < array.length; ++i) {
                array[i] = samples.get(i).remaining();
            }
            this.track2SampleSizes.put(track, array);
        }
        final BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(this.createFileTypeBox(movie));
        final HashMap<Track, int[]> hashMap = new HashMap<Track, int[]>();
        for (final Track track2 : movie.getTracks()) {
            hashMap.put(track2, this.getChunkSizes(track2, movie));
        }
        final MovieBox movieBox = this.createMovieBox(movie, hashMap);
        basicContainer.addBox(movieBox);
        final List<Box> paths = Path.getPaths((Box)movieBox, "trak/mdia/minf/stbl/stsz");
        long n = 0L;
        final Iterator<Box> iterator3 = paths.iterator();
        while (iterator3.hasNext()) {
            n += sum(((SampleSizeBox)iterator3.next()).getSampleSizes());
        }
        final InterleaveChunkMdat interleaveChunkMdat = new InterleaveChunkMdat(movie, (Map)hashMap, n, (InterleaveChunkMdat)null);
        basicContainer.addBox(interleaveChunkMdat);
        final long dataOffset = interleaveChunkMdat.getDataOffset();
        final Iterator<StaticChunkOffsetBox> iterator4 = this.chunkOffsetBoxes.iterator();
        while (iterator4.hasNext()) {
            final long[] chunkOffsets = iterator4.next().getChunkOffsets();
            for (int j = 0; j < chunkOffsets.length; ++j) {
                chunkOffsets[j] += dataOffset;
            }
        }
        return basicContainer;
    }
    
    protected FileTypeBox createFileTypeBox(final Movie movie) {
        final LinkedList<String> list = new LinkedList<String>();
        list.add("isom");
        list.add("iso2");
        list.add("avc1");
        return new FileTypeBox("isom", 0L, list);
    }
    
    protected MovieBox createMovieBox(final Movie movie, final Map<Track, int[]> map) {
        final MovieBox movieBox = new MovieBox();
        final MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(movie.getMatrix());
        final long timescale = this.getTimescale(movie);
        long duration = 0L;
        for (final Track track : movie.getTracks()) {
            final long n = timescale * getDuration(track) / track.getTrackMetaData().getTimescale();
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
        movieBox.addBox(movieHeaderBox);
        final Iterator<Track> iterator3 = movie.getTracks().iterator();
        while (iterator3.hasNext()) {
            movieBox.addBox(this.createTrackBox(iterator3.next(), movie, map));
        }
        final Box udta = this.createUdta(movie);
        if (udta != null) {
            movieBox.addBox(udta);
        }
        return movieBox;
    }
    
    protected TrackBox createTrackBox(final Track track, final Movie movie, final Map<Track, int[]> map) {
        final TrackBox trackBox = new TrackBox();
        final TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(track.isEnabled());
        trackHeaderBox.setInMovie(track.isInMovie());
        trackHeaderBox.setInPreview(track.isInPreview());
        trackHeaderBox.setInPoster(track.isInPoster());
        trackHeaderBox.setMatrix(track.getTrackMetaData().getMatrix());
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        trackHeaderBox.setDuration(getDuration(track) * this.getTimescale(movie) / track.getTrackMetaData().getTimescale());
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        trackBox.addBox(trackHeaderBox);
        final MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        final MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setDuration(getDuration(track));
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        mediaBox.addBox(mediaHeaderBox);
        final HandlerBox handlerBox = new HandlerBox();
        mediaBox.addBox(handlerBox);
        handlerBox.setHandlerType(track.getHandler());
        final MediaInformationBox mediaInformationBox = new MediaInformationBox();
        mediaInformationBox.addBox(track.getMediaHeaderBox());
        final DataInformationBox dataInformationBox = new DataInformationBox();
        final DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        final DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        final SampleTableBox sampleTableBox = new SampleTableBox();
        sampleTableBox.addBox(track.getSampleDescriptionBox());
        final List<TimeToSampleBox.Entry> decodingTimeEntries = track.getDecodingTimeEntries();
        if (decodingTimeEntries != null && !decodingTimeEntries.isEmpty()) {
            final TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
            timeToSampleBox.setEntries(decodingTimeEntries);
            sampleTableBox.addBox(timeToSampleBox);
        }
        final List<CompositionTimeToSample.Entry> compositionTimeEntries = track.getCompositionTimeEntries();
        if (compositionTimeEntries != null && !compositionTimeEntries.isEmpty()) {
            final CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
            compositionTimeToSample.setEntries(compositionTimeEntries);
            sampleTableBox.addBox(compositionTimeToSample);
        }
        final long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            final SyncSampleBox syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(syncSamples);
            sampleTableBox.addBox(syncSampleBox);
        }
        if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty()) {
            final SampleDependencyTypeBox sampleDependencyTypeBox = new SampleDependencyTypeBox();
            sampleDependencyTypeBox.setEntries(track.getSampleDependencies());
            sampleTableBox.addBox(sampleDependencyTypeBox);
        }
        final int[] array = map.get(track);
        final SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList<SampleToChunkBox.Entry>());
        long n = -2147483648L;
        for (int i = 0; i < array.length; ++i) {
            if (n != array[i]) {
                sampleToChunkBox.getEntries().add(new SampleToChunkBox.Entry(i + 1, array[i], 1L));
                n = array[i];
            }
        }
        sampleTableBox.addBox(sampleToChunkBox);
        final SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.track2SampleSizes.get(track));
        sampleTableBox.addBox(sampleSizeBox);
        final StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
        this.chunkOffsetBoxes.add(staticChunkOffsetBox);
        long n2 = 0L;
        final long[] chunkOffsets = new long[array.length];
        if (DefaultMp4Builder.LOG.isLoggable(Level.FINE)) {
            DefaultMp4Builder.LOG.fine("Calculating chunk offsets for track_" + track.getTrackMetaData().getTrackId());
        }
        for (int j = 0; j < array.length; ++j) {
            if (DefaultMp4Builder.LOG.isLoggable(Level.FINER)) {
                DefaultMp4Builder.LOG.finer("Calculating chunk offsets for track_" + track.getTrackMetaData().getTrackId() + " chunk " + j);
            }
            for (final Track track2 : movie.getTracks()) {
                if (DefaultMp4Builder.LOG.isLoggable(Level.FINEST)) {
                    DefaultMp4Builder.LOG.finest("Adding offsets of track_" + track2.getTrackMetaData().getTrackId());
                }
                final int[] array2 = map.get(track2);
                long n3 = 0L;
                for (int k = 0; k < j; ++k) {
                    n3 += array2[k];
                }
                if (track2 == track) {
                    chunkOffsets[j] = n2;
                }
                for (int l2i = CastUtils.l2i(n3); l2i < n3 + array2[j]; ++l2i) {
                    n2 += this.track2SampleSizes.get(track2)[l2i];
                }
            }
        }
        staticChunkOffsetBox.setChunkOffsets(chunkOffsets);
        sampleTableBox.addBox(staticChunkOffsetBox);
        mediaInformationBox.addBox(sampleTableBox);
        mediaBox.addBox(mediaInformationBox);
        return trackBox;
    }
    
    protected Box createUdta(final Movie movie) {
        return null;
    }
    
    int[] getChunkSizes(final Track track, final Movie movie) {
        final long[] sampleNumbers = this.intersectionFinder.sampleNumbers(track, movie);
        final int[] array = new int[sampleNumbers.length];
        for (int i = 0; i < sampleNumbers.length; ++i) {
            final long n = sampleNumbers[i] - 1L;
            long n2;
            if (sampleNumbers.length == i + 1) {
                n2 = track.getSamples().size();
            }
            else {
                n2 = sampleNumbers[i + 1] - 1L;
            }
            array[i] = CastUtils.l2i(n2 - n);
        }
        assert this.track2Sample.get(track).size() == sum(array) : "The number of samples and the sum of all chunk lengths must be equal";
        return array;
    }
    
    public long getTimescale(final Movie movie) {
        long n = movie.getTracks().iterator().next().getTrackMetaData().getTimescale();
        final Iterator<Track> iterator = movie.getTracks().iterator();
        while (iterator.hasNext()) {
            n = gcd(iterator.next().getTrackMetaData().getTimescale(), n);
        }
        return n;
    }
    
    protected List<Sample> putSamples(final Track track, final List<Sample> list) {
        return this.track2Sample.put(track, list);
    }
    
    public void setIntersectionFinder(final FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }
    
    private class InterleaveChunkMdat implements Box
    {
        List<List<Sample>> chunkList;
        long contentSize;
        Container parent;
        List<Track> tracks;
        
        private InterleaveChunkMdat(final Movie movie, final Map<Track, int[]> map, final long contentSize) {
            this.chunkList = new ArrayList<List<Sample>>();
            this.contentSize = contentSize;
            this.tracks = movie.getTracks();
            for (int i = 0; i < map.values().iterator().next().length; ++i) {
                for (final Track track : this.tracks) {
                    final int[] array = map.get(track);
                    long n = 0L;
                    for (int j = 0; j < i; ++j) {
                        n += array[j];
                    }
                    this.chunkList.add(DefaultMp4Builder.this.track2Sample.get(track).subList(CastUtils.l2i(n), CastUtils.l2i(n + array[i])));
                }
            }
        }
        
        private boolean isSmallBox(final long n) {
            return 8L + n < 4294967296L;
        }
        
        @Override
        public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
            final ByteBuffer allocate = ByteBuffer.allocate(16);
            final long size = this.getSize();
            if (this.isSmallBox(size)) {
                IsoTypeWriter.writeUInt32(allocate, size);
            }
            else {
                IsoTypeWriter.writeUInt32(allocate, 1L);
            }
            allocate.put(IsoFile.fourCCtoBytes("mdat"));
            if (this.isSmallBox(size)) {
                allocate.put(new byte[8]);
            }
            else {
                IsoTypeWriter.writeUInt64(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            final Iterator<List<Sample>> iterator = this.chunkList.iterator();
            while (iterator.hasNext()) {
                final Iterator<Sample> iterator2 = iterator.next().iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().writeTo(writableByteChannel);
                }
            }
        }
        
        public long getDataOffset() {
            Object parent = this;
            long n = 16L;
            while (parent instanceof Box) {
                for (final Box box : ((InterleaveChunkMdat)parent).getParent().getBoxes()) {
                    if (parent == box) {
                        break;
                    }
                    n += box.getSize();
                }
                parent = ((InterleaveChunkMdat)parent).getParent();
            }
            return n;
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
            return 16L + this.contentSize;
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
