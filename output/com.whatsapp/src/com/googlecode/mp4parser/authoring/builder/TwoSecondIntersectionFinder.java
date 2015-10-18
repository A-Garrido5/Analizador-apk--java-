// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.builder;

import java.util.List;
import java.util.Arrays;
import com.googlecode.mp4parser.authoring.Movie;
import java.util.Iterator;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Track;

public class TwoSecondIntersectionFinder implements FragmentIntersectionFinder
{
    private int fragmentLength;
    
    public TwoSecondIntersectionFinder() {
        this.fragmentLength = 2;
    }
    
    public TwoSecondIntersectionFinder(final int fragmentLength) {
        this.fragmentLength = 2;
        this.fragmentLength = fragmentLength;
    }
    
    protected long getDuration(final Track track) {
        long n = 0L;
        for (final TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            n += entry.getCount() * entry.getDelta();
        }
        return n;
    }
    
    @Override
    public long[] sampleNumbers(final Track track, final Movie movie) {
        final List<TimeToSampleBox.Entry> decodingTimeEntries = track.getDecodingTimeEntries();
        double n = 0.0;
        for (final Track track2 : movie.getTracks()) {
            final double n2 = this.getDuration(track2) / track2.getTrackMetaData().getTimescale();
            if (n < n2) {
                n = n2;
            }
        }
        int n3 = -1 + (int)Math.ceil(n / this.fragmentLength);
        if (n3 < 1) {
            n3 = 1;
        }
        final long[] array = new long[n3];
        Arrays.fill(array, -1L);
        array[0] = 1L;
        long n4 = 0L;
        int n5 = 0;
        for (final TimeToSampleBox.Entry entry : decodingTimeEntries) {
            int n8;
            for (int n6 = 0; n6 < entry.getCount(); ++n6, n5 = n8) {
                final int n7 = 1 + (int)(n4 / track.getTrackMetaData().getTimescale() / this.fragmentLength);
                if (n7 >= array.length) {
                    break;
                }
                n8 = n5 + 1;
                array[n7] = n5 + 1;
                n4 += entry.getDelta();
            }
        }
        long n9 = n5 + 1;
        for (int i = -1 + array.length; i >= 0; --i) {
            if (array[i] == -1L) {
                array[i] = n9;
            }
            n9 = array[i];
        }
        return array;
    }
}
