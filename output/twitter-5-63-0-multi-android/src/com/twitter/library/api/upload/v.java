// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.util.concurrent.ObservablePromise;
import com.twitter.library.media.model.MediaFile;

public class v implements i
{
    private final MediaFile a;
    
    public v(final MediaFile a) {
        this.a = a;
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public com.twitter.util.concurrent.i c() {
        return ObservablePromise.a((Object)null);
    }
    
    @Override
    public MediaFile d() {
        return this.a;
    }
}
