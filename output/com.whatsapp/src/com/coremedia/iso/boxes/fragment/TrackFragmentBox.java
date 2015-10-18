// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.AbstractContainerBox;

public class TrackFragmentBox extends AbstractContainerBox
{
    public static final String TYPE = "traf";
    
    public TrackFragmentBox() {
        super("traf");
    }
    
    @DoNotParseDetail
    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox)box;
            }
        }
        return null;
    }
}
