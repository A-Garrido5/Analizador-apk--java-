// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import java.util.Iterator;
import com.googlecode.mp4parser.AbstractContainerBox;

public class SampleTableBox extends AbstractContainerBox
{
    public static final String TYPE = "stbl";
    
    public SampleTableBox() {
        super("stbl");
    }
    
    public ChunkOffsetBox getChunkOffsetBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox)box;
            }
        }
        return null;
    }
    
    public CompositionTimeToSample getCompositionTimeToSample() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample)box;
            }
        }
        return null;
    }
    
    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox)box;
            }
        }
        return null;
    }
    
    public SampleDescriptionBox getSampleDescriptionBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox)box;
            }
        }
        return null;
    }
    
    public SampleSizeBox getSampleSizeBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof SampleSizeBox) {
                return (SampleSizeBox)box;
            }
        }
        return null;
    }
    
    public SampleToChunkBox getSampleToChunkBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof SampleToChunkBox) {
                return (SampleToChunkBox)box;
            }
        }
        return null;
    }
    
    public SyncSampleBox getSyncSampleBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof SyncSampleBox) {
                return (SyncSampleBox)box;
            }
        }
        return null;
    }
    
    public TimeToSampleBox getTimeToSampleBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof TimeToSampleBox) {
                return (TimeToSampleBox)box;
            }
        }
        return null;
    }
}
