// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

public class TranscoderException extends Exception
{
    private final boolean mIsFatal;
    
    public TranscoderException(final boolean mIsFatal, final String s, final Throwable t) {
        super(s, t);
        this.mIsFatal = mIsFatal;
    }
    
    public boolean a() {
        return this.mIsFatal;
    }
}
