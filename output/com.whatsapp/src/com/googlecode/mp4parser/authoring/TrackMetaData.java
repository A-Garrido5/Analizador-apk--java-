// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;

public class TrackMetaData implements Cloneable
{
    private Date creationTime;
    private int group;
    private double height;
    private String language;
    int layer;
    private Matrix matrix;
    private Date modificationTime;
    private long timescale;
    private long trackId;
    private float volume;
    private double width;
    
    public TrackMetaData() {
        this.modificationTime = new Date();
        this.creationTime = new Date();
        this.matrix = Matrix.ROTATE_0;
        this.trackId = 1L;
        this.group = 0;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    
    public Date getCreationTime() {
        return this.creationTime;
    }
    
    public int getGroup() {
        return this.group;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public String getLanguage() {
        return this.language;
    }
    
    public int getLayer() {
        return this.layer;
    }
    
    public Matrix getMatrix() {
        return this.matrix;
    }
    
    public Date getModificationTime() {
        return this.modificationTime;
    }
    
    public long getTimescale() {
        return this.timescale;
    }
    
    public long getTrackId() {
        return this.trackId;
    }
    
    public float getVolume() {
        return this.volume;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setCreationTime(final Date creationTime) {
        this.creationTime = creationTime;
    }
    
    public void setGroup(final int group) {
        this.group = group;
    }
    
    public void setHeight(final double height) {
        this.height = height;
    }
    
    public void setLanguage(final String language) {
        this.language = language;
    }
    
    public void setLayer(final int layer) {
        this.layer = layer;
    }
    
    public void setMatrix(final Matrix matrix) {
        this.matrix = matrix;
    }
    
    public void setModificationTime(final Date modificationTime) {
        this.modificationTime = modificationTime;
    }
    
    public void setTimescale(final long timescale) {
        this.timescale = timescale;
    }
    
    public void setTrackId(final long trackId) {
        this.trackId = trackId;
    }
    
    public void setVolume(final float volume) {
        this.volume = volume;
    }
    
    public void setWidth(final double width) {
        this.width = width;
    }
}
