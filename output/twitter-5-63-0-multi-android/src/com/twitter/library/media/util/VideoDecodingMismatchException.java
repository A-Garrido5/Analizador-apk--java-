// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

class VideoDecodingMismatchException extends VideoTranscoderException
{
    public final int expectedHeight;
    public final int expectedWidth;
    public final int receivedHeight;
    public final int receivedWidth;
    
    public VideoDecodingMismatchException(final int receivedWidth, final int receivedHeight, final int expectedWidth, final int expectedHeight) {
        super(String.format("Mismatch between video track width/height (%dx%d) and header (%dx%d)", receivedWidth, receivedHeight, expectedWidth, expectedHeight));
        this.receivedWidth = receivedWidth;
        this.receivedHeight = receivedHeight;
        this.expectedWidth = expectedWidth;
        this.expectedHeight = expectedHeight;
    }
}
