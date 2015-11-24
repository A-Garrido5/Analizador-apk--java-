// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import com.twitter.library.api.MediaVideoVariant;
import java.util.Comparator;

final class g implements Comparator
{
    public int a(final MediaVideoVariant mediaVideoVariant, final MediaVideoVariant mediaVideoVariant2) {
        return mediaVideoVariant2.bitrate - mediaVideoVariant.bitrate;
    }
}
