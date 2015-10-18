// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

public abstract class AbstractTrack implements Track
{
    private boolean enabled;
    private boolean inMovie;
    private boolean inPoster;
    private boolean inPreview;
    
    public AbstractTrack() {
        this.enabled = true;
        this.inMovie = true;
        this.inPreview = true;
        this.inPoster = true;
    }
    
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
    
    @Override
    public boolean isInMovie() {
        return this.inMovie;
    }
    
    @Override
    public boolean isInPoster() {
        return this.inPoster;
    }
    
    @Override
    public boolean isInPreview() {
        return this.inPreview;
    }
    
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
    
    public void setInMovie(final boolean inMovie) {
        this.inMovie = inMovie;
    }
    
    public void setInPoster(final boolean inPoster) {
        this.inPoster = inPoster;
    }
    
    public void setInPreview(final boolean inPreview) {
        this.inPreview = inPreview;
    }
}
