// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.decoder.ImageDecoder$ScaleType;

public enum BaseMediaImageView$ScaleType
{
    a("FIT", 0, ImageDecoder$ScaleType.a), 
    b("FILL", 1, ImageDecoder$ScaleType.c), 
    c("CENTER_INSIDE", 2, ImageDecoder$ScaleType.a);
    
    public final ImageDecoder$ScaleType decoderScaleType;
    
    private BaseMediaImageView$ScaleType(final String s, final int n, final ImageDecoder$ScaleType decoderScaleType) {
        this.decoderScaleType = decoderScaleType;
    }
}
