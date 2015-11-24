// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.internal.network.l;
import android.graphics.Bitmap;
import com.twitter.library.media.model.MediaFile;

public class p extends ResourceResponse
{
    private final MediaFile a;
    
    public p(final j j, final MediaFile a, final Bitmap bitmap, final ResourceResponse$ResourceSource resourceResponse$ResourceSource, final l l) {
        super(j, bitmap, resourceResponse$ResourceSource, l);
        this.a = a;
    }
    
    public MediaFile a() {
        return this.a;
    }
}
