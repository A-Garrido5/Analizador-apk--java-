// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import android.graphics.Bitmap$Config;
import android.graphics.RectF;
import com.twitter.library.media.decoder.ImageDecoder$ScaleType;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.MediaFile;

public class k extends ak
{
    public final MediaFile a;
    public n b;
    public Size c;
    public ImageDecoder$ScaleType d;
    public RectF e;
    public int f;
    public boolean g;
    public l h;
    public Bitmap$Config i;
    public String j;
    public int k;
    
    public k(final MediaFile a) {
        super(a.b().toString());
        this.a = a;
        this.c = a.size;
    }
    
    public k(final String s) {
        super(s);
        this.a = null;
    }
    
    public j a() {
        return new j(this);
    }
    
    public k a(final int f) {
        this.f = f;
        return this;
    }
    
    public k a(final Bitmap$Config i) {
        this.i = i;
        return this;
    }
    
    public k a(final RectF e) {
        this.e = e;
        return this;
    }
    
    public k a(final Size c) {
        this.c = c;
        return this;
    }
    
    public k a(final ImageDecoder$ScaleType d) {
        this.d = d;
        return this;
    }
    
    public k a(final l h) {
        this.h = h;
        return this;
    }
    
    public k a(final n b) {
        this.b = b;
        return this;
    }
    
    public k a(final String j) {
        this.j = j;
        return this;
    }
    
    public k a(final boolean g) {
        this.g = g;
        return this;
    }
    
    public k b(final int k) {
        this.k = k;
        return this;
    }
}
