// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.authoring.Sample;
import java.io.IOException;
import java.util.Arrays;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.authoring.Movie;
import java.util.Iterator;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import java.util.logging.Logger;

public abstract class AbstractManifestWriter implements ManifestWriter
{
    private static final Logger LOG;
    protected long[] audioFragmentsDurations;
    private FragmentIntersectionFinder intersectionFinder;
    protected long[] videoFragmentsDurations;
    
    static {
        LOG = Logger.getLogger(AbstractManifestWriter.class.getName());
    }
    
    protected AbstractManifestWriter(final FragmentIntersectionFinder intersectionFinder) {
        this.intersectionFinder = intersectionFinder;
    }
    
    protected static long getDuration(final Track track) {
        long n = 0L;
        for (final TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            n += entry.getCount() * entry.getDelta();
        }
        return n;
    }
    
    @Override
    public long[] calculateFragmentDurations(final Track track, final Movie movie) {
        final long[] sampleNumbers = this.intersectionFinder.sampleNumbers(track, movie);
        final long[] array = new long[sampleNumbers.length];
        int n = 0;
        int i = 1;
        for (final TimeToSampleBox.Entry entry : track.getDecodingTimeEntries()) {
            while (i < i + CastUtils.l2i(entry.getCount())) {
                if (n != -1 + sampleNumbers.length && i == sampleNumbers[n + 1]) {
                    ++n;
                }
                array[n] += entry.getDelta();
                ++i;
            }
        }
        return array;
    }
    
    protected long[] checkFragmentsAlign(final long[] array, final long[] array2) throws IOException {
        if (array != null && array.length != 0) {
            final long[] array3 = new long[-1 + array.length];
            System.arraycopy(array, 0, array3, 0, -1 + array.length);
            final long[] array4 = new long[-1 + array2.length];
            System.arraycopy(array2, 0, array4, 0, -1 + array2.length);
            if (!Arrays.equals(array4, array3)) {
                String s = String.valueOf(new StringBuilder(String.valueOf("")).append(array.length).toString()) + "Reference     :  [";
                for (int length = array.length, i = 0; i < length; ++i) {
                    s = String.valueOf(s) + String.format("%10d,", array[i]);
                }
                AbstractManifestWriter.LOG.warning(String.valueOf(s) + "]");
                String s2 = String.valueOf(new StringBuilder(String.valueOf("")).append(array2.length).toString()) + "Current       :  [";
                for (int length2 = array2.length, j = 0; j < length2; ++j) {
                    s2 = String.valueOf(s2) + String.format("%10d,", array2[j]);
                }
                AbstractManifestWriter.LOG.warning(String.valueOf(s2) + "]");
                throw new IOException("Track does not have the same fragment borders as its predecessor.");
            }
        }
        return array2;
    }
    
    @Override
    public long getBitrate(final Track track) {
        long n = 0L;
        final Iterator<Sample> iterator = track.getSamples().iterator();
        while (iterator.hasNext()) {
            n += iterator.next().remaining();
        }
        return n * 8L / (getDuration(track) / track.getTrackMetaData().getTimescale());
    }
    
    protected String getFormat(final AbstractSampleEntry abstractSampleEntry) {
        String s = abstractSampleEntry.getType();
        if (s.equals("encv") || s.equals("enca") || s.equals("encv")) {
            s = abstractSampleEntry.getBoxes(OriginalFormatBox.class, true).get(0).getDataFormat();
        }
        return s;
    }
}
