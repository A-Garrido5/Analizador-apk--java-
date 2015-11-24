// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.content.Context;

public class FilterPreviewView extends GLTextureView
{
    protected b a;
    private Context b;
    private int c;
    private a d;
    private d e;
    
    public FilterPreviewView(final Context b) {
        super(b);
        this.b = b;
    }
    
    public FilterPreviewView(final Context b, final AttributeSet set) {
        super(b, set);
        this.b = b;
    }
    
    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }
    
    public void a(final int n) {
    }
    
    public void a(final Bitmap bitmap, final boolean b) {
        if (this.a != null) {
            this.a.a(bitmap, b);
            this.b();
        }
    }
    
    public void a(final Filters filters, final a d) {
        this.d = d;
        this.setEGLContextClientVersion(2);
        this.setEGLContextFactory(new f(this.d));
        this.setEGLConfigChooser(new e());
        this.setRenderer(this.a = new b());
        this.a.a(this.b, filters);
        this.setRenderMode(0);
        this.a.a(this.e);
    }
    
    public float getFilterIntensity() {
        if (this.a != null) {
            return this.a.d();
        }
        return 0.0f;
    }
    
    public float getVignetteSize() {
        if (this.a != null) {
            return this.a.c();
        }
        return 0.0f;
    }
    
    public void setFilterId(final int c) {
        if (this.a != null) {
            this.c = c;
            this.a.a(c);
            this.a.b(-1);
            this.b();
        }
    }
    
    public void setFilterIntensity(final float n) {
        if (this.a != null) {
            this.a.c(n);
            this.b();
        }
    }
    
    public void setFilterRenderListener(final d e) {
        if (this.a != null) {
            this.a.a(e);
        }
        this.e = e;
    }
}
