// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.SampleSizeBox;
import java.io.IOException;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.boxes.SampleToChunkBox;
import java.util.Iterator;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.AbstractList;

public class DefaultMp4SampleList extends AbstractList<Sample>
{
    Container topLevel;
    TrackBox trackBox;
    
    public DefaultMp4SampleList(final long n, final Container topLevel) {
        this.trackBox = null;
        this.topLevel = topLevel;
        for (final TrackBox trackBox : topLevel.getBoxes(MovieBox.class).get(0).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == n) {
                this.trackBox = trackBox;
            }
        }
        if (this.trackBox == null) {
            throw new RuntimeException("This MP4 does not contain track " + n);
        }
    }
    
    @Override
    public Sample get(final int n) {
        if (n >= this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount()) {
            throw new IndexOutOfBoundsException();
        }
        final Iterator<SampleToChunkBox.Entry> iterator = this.trackBox.getSampleTableBox().getSampleToChunkBox().getEntries().iterator();
        final SampleToChunkBox.Entry entry = iterator.next();
        long n2 = 0L;
        long n3 = 0L;
        long n4 = entry.getFirstChunk();
        long n5 = entry.getSamplesPerChunk();
        int n6 = 1;
        final int n7 = n + 1;
    Label_0134_Outer:
        while (true) {
            ++n2;
            Label_0245: {
                if (n2 == n4) {
                    n3 = n5;
                    if (!iterator.hasNext()) {
                        break Label_0245;
                    }
                    final SampleToChunkBox.Entry entry2 = iterator.next();
                    n5 = entry2.getSamplesPerChunk();
                    n4 = entry2.getFirstChunk();
                }
            Label_0198_Outer:
                while (true) {
                    n6 += (int)n3;
                    if (n6 <= n7) {
                        continue Label_0134_Outer;
                    }
                    final int n8 = (int)(n6 - n3);
                    long n9 = this.trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets()[CastUtils.l2i(n2 - 1L)];
                    final SampleSizeBox sampleSizeBox = this.trackBox.getSampleTableBox().getSampleSizeBox();
                    int n10 = n8;
                    while (true) {
                        Label_0258: {
                            if (n10 < n7) {
                                break Label_0258;
                            }
                            try {
                                return new SampleImpl(this.topLevel.getByteBuffer(n9, sampleSizeBox.getSampleSizeAtIndex(n10 - 1)));
                                n5 = -1L;
                                n4 = Long.MAX_VALUE;
                                continue Label_0198_Outer;
                                final int n11 = n10 + 1;
                                n9 += sampleSizeBox.getSampleSizeAtIndex(n10 - 1);
                                n10 = n11;
                                continue;
                            }
                            catch (IOException ex) {
                                return null;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public int size() {
        return CastUtils.l2i(this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
