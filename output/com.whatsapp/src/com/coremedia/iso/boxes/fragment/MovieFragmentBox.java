// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import java.nio.channels.FileChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MovieFragmentBox extends AbstractContainerBox
{
    public static final String TYPE = "moof";
    
    public MovieFragmentBox() {
        super("moof");
    }
    
    public FileChannel getFileChannel() {
        return this.fileChannel;
    }
    
    public List<Long> getSyncSamples(final SampleDependencyTypeBox sampleDependencyTypeBox) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final List<SampleDependencyTypeBox.Entry> entries = sampleDependencyTypeBox.getEntries();
        long n = 1L;
        final Iterator<SampleDependencyTypeBox.Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            if (((SampleDependencyTypeBox.Entry)iterator.next()).getSampleDependsOn() == 2) {
                list.add(n);
            }
            ++n;
        }
        return list;
    }
    
    public int getTrackCount() {
        return this.getBoxes(TrackFragmentBox.class, false).size();
    }
    
    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
        return this.getBoxes(TrackFragmentHeaderBox.class, true);
    }
    
    public long[] getTrackNumbers() {
        final List<TrackFragmentBox> boxes = this.getBoxes(TrackFragmentBox.class, false);
        final long[] array = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); ++i) {
            array[i] = boxes.get(i).getTrackFragmentHeaderBox().getTrackId();
        }
        return array;
    }
    
    public List<TrackRunBox> getTrackRunBoxes() {
        return this.getBoxes(TrackRunBox.class, true);
    }
}
