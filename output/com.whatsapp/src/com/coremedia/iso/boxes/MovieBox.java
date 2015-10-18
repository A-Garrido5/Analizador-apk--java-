// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import java.util.List;
import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MovieBox extends AbstractContainerBox
{
    public static final String TYPE = "moov";
    
    public MovieBox() {
        super("moov");
    }
    
    public MovieHeaderBox getMovieHeaderBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof MovieHeaderBox) {
                return (MovieHeaderBox)box;
            }
        }
        return null;
    }
    
    public int getTrackCount() {
        return this.getBoxes(TrackBox.class).size();
    }
    
    public long[] getTrackNumbers() {
        final List<TrackBox> boxes = this.getBoxes(TrackBox.class);
        final long[] array = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); ++i) {
            array[i] = boxes.get(i).getTrackHeaderBox().getTrackId();
        }
        return array;
    }
}
