// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class TrackBox extends AbstractContainerBox
{
    public static final String TYPE = "trak";
    
    public TrackBox() {
        super("trak");
    }
    
    public MediaBox getMediaBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof MediaBox) {
                return (MediaBox)box;
            }
        }
        return null;
    }
    
    public SampleTableBox getSampleTableBox() {
        final MediaBox mediaBox = this.getMediaBox();
        if (mediaBox != null) {
            final MediaInformationBox mediaInformationBox = mediaBox.getMediaInformationBox();
            if (mediaInformationBox != null) {
                return mediaInformationBox.getSampleTableBox();
            }
        }
        return null;
    }
    
    public TrackHeaderBox getTrackHeaderBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof TrackHeaderBox) {
                return (TrackHeaderBox)box;
            }
        }
        return null;
    }
}
