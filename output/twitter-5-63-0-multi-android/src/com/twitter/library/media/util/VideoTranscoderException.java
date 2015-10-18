// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

public class VideoTranscoderException extends RuntimeException
{
    private static final long serialVersionUID = 222070577861437303L;
    public final int framesRead;
    public final int framesSaved;
    public final int framesTransferred;
    public final int transcoderState;
    
    public VideoTranscoderException(final String s) {
        this(s, null);
    }
    
    public VideoTranscoderException(final String s, final Exception ex) {
        this(s, ex, -1, 0, 0, 0);
    }
    
    public VideoTranscoderException(final String s, final Exception ex, final int transcoderState, final int framesRead, final int framesTransferred, final int framesSaved) {
        super(s, ex);
        this.transcoderState = transcoderState;
        this.framesRead = framesRead;
        this.framesTransferred = framesTransferred;
        this.framesSaved = framesSaved;
    }
}
