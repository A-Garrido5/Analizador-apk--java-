// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.samples;

import java.io.IOException;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import java.util.LinkedList;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import java.util.List;
import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.util.Path;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.AbstractList;

public class FragmentedMp4SampleList extends AbstractList<Sample>
{
    IsoFile[] fragments;
    Container topLevel;
    TrackBox trackBox;
    TrackExtendsBox trex;
    
    public FragmentedMp4SampleList(final long n, final Container topLevel, final IsoFile... fragments) {
        this.trackBox = null;
        this.trex = null;
        this.topLevel = topLevel;
        this.fragments = fragments;
        for (final TrackBox trackBox : topLevel.getBoxes(MovieBox.class).get(0).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == n) {
                this.trackBox = trackBox;
            }
        }
        if (this.trackBox == null) {
            throw new RuntimeException("This MP4 does not contain track " + n);
        }
        for (final Box box : Path.getPaths(topLevel, "moov/mvex/trex")) {
            if (((TrackExtendsBox)box).getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                this.trex = (TrackExtendsBox)box;
            }
        }
    }
    
    private List<TrackFragmentBox> allFragments() {
        final LinkedList<TrackFragmentBox> list = new LinkedList<TrackFragmentBox>();
        final Iterator<MovieFragmentBox> iterator = this.topLevel.getBoxes(MovieFragmentBox.class).iterator();
        while (iterator.hasNext()) {
            for (final TrackFragmentBox trackFragmentBox : iterator.next().getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                    list.add(trackFragmentBox);
                }
            }
        }
        if (this.fragments != null) {
            final IsoFile[] fragments = this.fragments;
            for (int length = fragments.length, i = 0; i < length; ++i) {
                final Iterator<MovieFragmentBox> iterator3 = fragments[i].getBoxes(MovieFragmentBox.class).iterator();
                while (iterator3.hasNext()) {
                    for (final TrackFragmentBox trackFragmentBox2 : iterator3.next().getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                            list.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        return list;
    }
    
    private int getTrafSize(final TrackFragmentBox trackFragmentBox) {
        return CastUtils.l2i(trackFragmentBox.getBoxes(TrackRunBox.class).get(0).getSampleCount());
    }
    
    @Override
    public Sample get(final int n) {
        int n2 = 1;
        final int n3 = n + 1;
        for (final TrackFragmentBox trackFragmentBox : this.allFragments()) {
            final int trafSize = this.getTrafSize(trackFragmentBox);
            if (n3 >= n2 && n3 < n2 + trafSize) {
                final int n4 = n3 - n2;
                final MovieFragmentBox movieFragmentBox = (MovieFragmentBox)trackFragmentBox.getParent();
                final TrackRunBox trackRunBox = trackFragmentBox.getBoxes(TrackRunBox.class).get(0);
                long n5 = 0L;
                if (trackRunBox.isDataOffsetPresent()) {
                    n5 += trackRunBox.getDataOffset();
                }
                final List<TrackRunBox.Entry> entries = trackRunBox.getEntries();
                Label_0210: {
                    if (!trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                        break Label_0210;
                    }
                    long n6 = n5 + trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                Label_0151_Outer:
                    while (true) {
                        int n7 = 0;
                        long n8;
                        Block_9_Outer:Label_0251_Outer:
                        while (true) {
                            Label_0223: {
                                if (n7 < n4) {
                                    break Label_0223;
                                }
                                Label_0316: {
                                    if (!trackRunBox.isSampleSizePresent()) {
                                        break Label_0316;
                                    }
                                    n8 = ((TrackRunBox.Entry)entries.get(n4)).getSampleSize();
                                    try {
                                        return new SampleImpl(((IsoFile)movieFragmentBox.getParent()).getByteBuffer(n6, n8));
                                        Label_0357: {
                                            n8 = this.trex.getDefaultSampleSize();
                                        }
                                        return new SampleImpl(((IsoFile)movieFragmentBox.getParent()).getByteBuffer(n6, n8));
                                        // iftrue(Label_0257:, !trackRunBox.isSampleSizePresent())
                                        while (true) {
                                            while (true) {
                                                n6 += ((TrackRunBox.Entry)entries.get(n7)).getSampleSize();
                                                ++n7;
                                                continue Block_9_Outer;
                                                continue Label_0251_Outer;
                                            }
                                            Label_0257:
                                            Block_10: {
                                                break Block_10;
                                                Label_0284:
                                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                                                n6 = n5 + movieFragmentBox.getOffset();
                                                continue Label_0151_Outer;
                                                Label_0340:
                                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                                            }
                                            n6 += trackFragmentBox.getTrackFragmentHeaderBox().getDefaultSampleSize();
                                            continue;
                                            n8 = trackFragmentBox.getTrackFragmentHeaderBox().getDefaultSampleSize();
                                            return new SampleImpl(((IsoFile)movieFragmentBox.getParent()).getByteBuffer(n6, n8));
                                            Label_0301:
                                            n6 += this.trex.getDefaultSampleSize();
                                            continue;
                                        }
                                    }
                                    // iftrue(Label_0284:, !trackFragmentBox.getTrackFragmentHeaderBox().hasDefaultSampleSize())
                                    // iftrue(Label_0301:, this.trex != null)
                                    // iftrue(Label_0357:, this.trex != null)
                                    // iftrue(Label_0340:, !trackFragmentBox.getTrackFragmentHeaderBox().hasDefaultSampleSize())
                                    catch (IOException ex) {
                                        return null;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            n2 += trafSize;
        }
        return null;
    }
    
    @Override
    public int size() {
        int n = 0;
        final Iterator<MovieFragmentBox> iterator = this.topLevel.getBoxes(MovieFragmentBox.class).iterator();
        while (iterator.hasNext()) {
            for (final TrackFragmentBox trackFragmentBox : iterator.next().getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                    n += (int)trackFragmentBox.getBoxes(TrackRunBox.class).get(0).getSampleCount();
                }
            }
        }
        final IsoFile[] fragments = this.fragments;
        for (int length = fragments.length, i = 0; i < length; ++i) {
            final Iterator<MovieFragmentBox> iterator3 = fragments[i].getBoxes(MovieFragmentBox.class).iterator();
            while (iterator3.hasNext()) {
                for (final TrackFragmentBox trackFragmentBox2 : iterator3.next().getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                        n += (int)trackFragmentBox2.getBoxes(TrackRunBox.class).get(0).getSampleCount();
                    }
                }
            }
        }
        return n;
    }
}
