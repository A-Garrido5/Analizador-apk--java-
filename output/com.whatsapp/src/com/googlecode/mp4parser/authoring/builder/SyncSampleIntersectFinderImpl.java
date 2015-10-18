// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import java.util.Arrays;
import com.coremedia.iso.boxes.TimeToSampleBox;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import com.googlecode.mp4parser.util.Math;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.Movie;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SyncSampleIntersectFinderImpl implements FragmentIntersectionFinder
{
    private static Logger LOG;
    private static Map<CacheTuple, long[]> getSampleNumbersCache;
    private static Map<CacheTuple, long[]> getTimesCache;
    private final int minFragmentDurationSeconds;
    
    static {
        SyncSampleIntersectFinderImpl.LOG = Logger.getLogger(SyncSampleIntersectFinderImpl.class.getName());
        SyncSampleIntersectFinderImpl.getTimesCache = new ConcurrentHashMap<CacheTuple, long[]>();
        SyncSampleIntersectFinderImpl.getSampleNumbersCache = new ConcurrentHashMap<CacheTuple, long[]>();
    }
    
    public SyncSampleIntersectFinderImpl() {
        this.minFragmentDurationSeconds = 0;
    }
    
    public SyncSampleIntersectFinderImpl(final int minFragmentDurationSeconds) {
        this.minFragmentDurationSeconds = minFragmentDurationSeconds;
    }
    
    private static long calculateTracktimesScalingFactor(final Movie movie, final Track track) {
        long lcm = 1L;
        for (final Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler()) && track2.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale()) {
                lcm = Math.lcm(lcm, track2.getTrackMetaData().getTimescale());
            }
        }
        return lcm;
    }
    
    public static List<long[]> getSyncSamplesTimestamps(final Movie movie, final Track track) {
        final LinkedList<long[]> list = new LinkedList<long[]>();
        for (final Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler())) {
                final long[] syncSamples = track2.getSyncSamples();
                if (syncSamples == null || syncSamples.length <= 0) {
                    continue;
                }
                list.add(getTimes(track2, movie));
            }
        }
        return list;
    }
    
    private static long[] getTimes(final Track track, final Movie movie) {
        final CacheTuple cacheTuple = new CacheTuple(track, movie);
        final long[] array = SyncSampleIntersectFinderImpl.getTimesCache.get(cacheTuple);
        if (array != null) {
            return array;
        }
        final long[] syncSamples = track.getSyncSamples();
        final long[] array2 = new long[syncSamples.length];
        final LinkedList<Object> list = new LinkedList<Object>(track.getDecodingTimeEntries());
        int n = 1;
        long n2 = 0L;
        long delta = 0L;
        int n3 = 0;
        long n4 = 0L;
        final long calculateTracktimesScalingFactor = calculateTracktimesScalingFactor(movie, track);
        while (n <= syncSamples[-1 + syncSamples.length]) {
            final int n5 = n + 1;
            if (n == syncSamples[n3]) {
                final int n6 = n3 + 1;
                array2[n3] = n2 * calculateTracktimesScalingFactor;
                n3 = n6;
            }
            final long n7 = n4 - 1L;
            if (n4 == 0L) {
                final TimeToSampleBox.Entry entry = list.poll();
                n4 = entry.getCount() - 1L;
                delta = entry.getDelta();
            }
            else {
                n4 = n7;
            }
            n2 += delta;
            n = n5;
        }
        SyncSampleIntersectFinderImpl.getTimesCache.put(cacheTuple, array2);
        return array2;
    }
    
    public long[] getCommonIndices(final long[] array, final long[] array2, final long n, final long[]... array3) {
        final LinkedList<Object> list = new LinkedList<Object>();
        final LinkedList<Long> list2 = new LinkedList<Long>();
        for (int i = 0; i < array2.length; ++i) {
            boolean b = true;
            for (int length = array3.length, j = 0; j < length; ++j) {
                boolean b2;
                if (Arrays.binarySearch(array3[j], array2[i]) >= 0) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                b &= b2;
            }
            if (b) {
                list.add(array[i]);
                list2.add(array2[i]);
            }
        }
        if (list.size() < 0.25 * array.length) {
            String s = String.valueOf("") + String.format("%5d - Common:  [", list.size());
            final Iterator<Long> iterator = list.iterator();
            while (iterator.hasNext()) {
                s = String.valueOf(s) + String.format("%10d,", iterator.next());
            }
            SyncSampleIntersectFinderImpl.LOG.warning(String.valueOf(s) + "]");
            String s2 = String.valueOf("") + String.format("%5d - In    :  [", array.length);
            for (int length2 = array.length, k = 0; k < length2; ++k) {
                s2 = String.valueOf(s2) + String.format("%10d,", array[k]);
            }
            SyncSampleIntersectFinderImpl.LOG.warning(String.valueOf(s2) + "]");
            SyncSampleIntersectFinderImpl.LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        if (list.size() < 0.5 * array.length) {
            SyncSampleIntersectFinderImpl.LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        }
        else if (list.size() < array.length) {
            SyncSampleIntersectFinderImpl.LOG.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + list.size() + " vs. " + array.length);
        }
        List<E> list3 = (List<E>)new LinkedList<Long>();
        if (this.minFragmentDurationSeconds > 0) {
            long n2 = -1L;
            final Iterator<Long> iterator2 = list.iterator();
            final Iterator<Object> iterator3 = list2.iterator();
            while (iterator2.hasNext() && iterator3.hasNext()) {
                final long longValue = iterator2.next();
                final long longValue2 = iterator3.next();
                if (n2 == -1L || (longValue2 - n2) / n >= this.minFragmentDurationSeconds) {
                    list3.add(longValue);
                    n2 = longValue2;
                }
            }
        }
        else {
            list3 = (List<E>)list;
        }
        final long[] array4 = new long[list3.size()];
        for (int l = 0; l < array4.length; ++l) {
            array4[l] = (long)list3.get(l);
        }
        return array4;
    }
    
    @Override
    public long[] sampleNumbers(final Track track, final Movie movie) {
        final CacheTuple cacheTuple = new CacheTuple(track, movie);
        final long[] array = SyncSampleIntersectFinderImpl.getSampleNumbersCache.get(cacheTuple);
        if (array != null) {
            return array;
        }
        if ("vide".equals(track.getHandler())) {
            if (track.getSyncSamples() != null && track.getSyncSamples().length > 0) {
                final List<long[]> syncSamplesTimestamps = getSyncSamplesTimestamps(movie, track);
                final long[] commonIndices = this.getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), (long[][])syncSamplesTimestamps.toArray(new long[syncSamplesTimestamps.size()][]));
                SyncSampleIntersectFinderImpl.getSampleNumbersCache.put(cacheTuple, commonIndices);
                return commonIndices;
            }
            throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
        }
        else {
            if (!"soun".equals(track.getHandler())) {
                for (final Track track2 : movie.getTracks()) {
                    if (track2.getSyncSamples() != null && track2.getSyncSamples().length > 0) {
                        final long[] sampleNumbers = this.sampleNumbers(track2, movie);
                        final int size = track2.getSamples().size();
                        final long[] array2 = new long[sampleNumbers.length];
                        final double n = track.getSamples().size() / size;
                        for (int i = 0; i < array2.length; ++i) {
                            array2[i] = 1L + (long)java.lang.Math.ceil(n * (sampleNumbers[i] - 1L));
                        }
                        SyncSampleIntersectFinderImpl.getSampleNumbersCache.put(cacheTuple, array2);
                        return array2;
                    }
                }
                throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
            }
            Track track3 = null;
            for (final Track track4 : movie.getTracks()) {
                if (track4.getSyncSamples() != null && "vide".equals(track4.getHandler()) && track4.getSyncSamples().length > 0) {
                    track3 = track4;
                }
            }
            if (track3 == null) {
                throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
            }
            final long[] sampleNumbers2 = this.sampleNumbers(track3, movie);
            final int size2 = track3.getSamples().size();
            final long[] array3 = new long[sampleNumbers2.length];
            long sampleRate = 192000L;
            for (final Track track5 : movie.getTracks()) {
                if ("soun".equals(track5.getHandler())) {
                    final AudioSampleEntry audioSampleEntry = (AudioSampleEntry)track5.getSampleDescriptionBox().getSampleEntry();
                    if (audioSampleEntry.getSampleRate() < sampleRate) {
                        sampleRate = audioSampleEntry.getSampleRate();
                        final double n2 = track5.getSamples().size() / size2;
                        final long delta = track5.getDecodingTimeEntries().get(0).getDelta();
                        for (int j = 0; j < array3.length; ++j) {
                            array3[j] = (long)java.lang.Math.ceil(n2 * (sampleNumbers2[j] - 1L) * delta);
                        }
                        break;
                    }
                    continue;
                }
            }
            final AudioSampleEntry audioSampleEntry2 = (AudioSampleEntry)track.getSampleDescriptionBox().getSampleEntry();
            final long delta2 = track.getDecodingTimeEntries().get(0).getDelta();
            final double n3 = audioSampleEntry2.getSampleRate() / sampleRate;
            if (n3 != java.lang.Math.rint(n3)) {
                throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
            }
            for (int k = 0; k < array3.length; ++k) {
                array3[k] = (long)(1.0 + n3 * array3[k] / delta2);
            }
            SyncSampleIntersectFinderImpl.getSampleNumbersCache.put(cacheTuple, array3);
            return array3;
        }
    }
    
    public static class CacheTuple
    {
        Movie movie;
        Track track;
        
        public CacheTuple(final Track track, final Movie movie) {
            this.track = track;
            this.movie = movie;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final CacheTuple cacheTuple = (CacheTuple)o;
                Label_0059: {
                    if (this.movie != null) {
                        if (this.movie.equals(cacheTuple.movie)) {
                            break Label_0059;
                        }
                    }
                    else if (cacheTuple.movie == null) {
                        break Label_0059;
                    }
                    return false;
                }
                if (this.track != null) {
                    if (this.track.equals(cacheTuple.track)) {
                        return true;
                    }
                }
                else if (cacheTuple.track == null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            int hashCode;
            if (this.track != null) {
                hashCode = this.track.hashCode();
            }
            else {
                hashCode = 0;
            }
            final int n = hashCode * 31;
            final Movie movie = this.movie;
            int hashCode2 = 0;
            if (movie != null) {
                hashCode2 = this.movie.hashCode();
            }
            return n + hashCode2;
        }
    }
}
