// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.internal.android.util.Size;
import android.graphics.drawable.Drawable;
import android.widget.ImageView$ScaleType;
import android.view.View;
import com.twitter.internal.android.widget.FixedSizeImageView;
import com.twitter.media.filters.g;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.media.filters.d;
import com.twitter.media.filters.Filters;
import android.graphics.Bitmap;
import com.twitter.media.filters.FilterPreviewView;
import android.widget.ImageView;

public class FilteredImageView extends BaseMediaImageView
{
    private final ImageView c;
    private int d;
    private boolean e;
    private FilterPreviewView f;
    private Bitmap g;
    private boolean h;
    private Filters i;
    private d j;
    
    public FilteredImageView(final Context context) {
        this(context, null);
    }
    
    public FilteredImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FilteredImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final boolean a = com.twitter.media.filters.g.a(context);
        this.addView((View)(this.c = new FixedSizeImageView(context)));
        if (a) {
            (this.f = new FilterPreviewView(context)).setFilterRenderListener(this.j);
            this.f.setVisibility(8);
        }
    }
    
    public void a(final int d, final boolean e) {
        if (this.f != null) {
            this.d = d;
            this.f.setFilterId(this.d);
            if (this.e != e && this.g != null) {
                this.e = e;
                this.f.a(this.g, this.e);
            }
        }
    }
    
    @Override
    protected void a(final Bitmap g, final boolean b) {
        this.g = g;
        if (this.f == null) {
            this.c.setScaleType(ImageView$ScaleType.FIT_CENTER);
            super.a(g, b);
            return;
        }
        this.f.setVisibility(0);
        if (this.f.getParent() == null) {
            return;
        }
        this.f.a(g, this.e);
    }
    
    @Override
    protected void b(final Drawable imageDrawable) {
        this.g = null;
        this.c.setVisibility(0);
        this.c.setScaleType(ImageView$ScaleType.CENTER);
        this.c.setImageDrawable(imageDrawable);
        if (this.f != null) {
            this.f.setVisibility(8);
        }
    }
    
    public void g() {
        if (this.f != null && this.h) {
            this.f.c();
        }
    }
    
    public float getFilterIntensity() {
        if (this.f != null) {
            return this.f.getFilterIntensity();
        }
        return 1.0f;
    }
    
    public Filters getFilters() {
        return this.i;
    }
    
    @Override
    public Size getImageSize() {
        return Size.a((View)this.c);
    }
    
    public void h() {
        if (this.f != null && this.h) {
            this.f.d();
        }
    }
    
    public void i() {
        if (this.f != null) {
            this.f.a();
        }
    }
    
    public void setFilterIntensity(final float filterIntensity) {
        if (this.f != null) {
            this.f.setFilterIntensity(filterIntensity);
        }
    }
    
    public void setFilterRenderListener(final d d) {
        if (this.f != null) {
            this.f.setFilterRenderListener(d);
        }
        this.j = d;
    }
    
    public void setFilters(final Filters i) {
        if (this.f == null) {
            return;
        }
        this.f.a(i, i.c());
        this.f.setPreserveEGLContextOnPause(true);
        this.addView((View)this.f);
        if (this.g != null) {
            this.f.a(this.g, this.e);
        }
        this.h = true;
        this.i = i;
    }
}
