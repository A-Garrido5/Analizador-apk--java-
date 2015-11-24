// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import com.twitter.library.media.manager.ResourceResponse$ResourceSource;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.j;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.o;
import com.twitter.library.media.util.r;
import com.twitter.library.media.manager.m;
import com.twitter.library.widget.AspectRatioFrameLayout;

public abstract class BaseMediaImageView extends AspectRatioFrameLayout implements m, r
{
    protected BaseMediaImageView$ScaleType a;
    private final o c;
    private k d;
    private al e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Drawable i;
    private int j;
    private e k;
    private d l;
    private boolean m;
    private boolean n;
    
    public BaseMediaImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BaseMediaImageView, n, 0);
        this.i = obtainStyledAttributes.getDrawable(li.BaseMediaImageView_defaultDrawable);
        this.j = obtainStyledAttributes.getResourceId(li.BaseMediaImageView_errorDrawable, 0);
        if (!this.isInEditMode()) {
            (this.c = new o(this.getContext())).a(obtainStyledAttributes.getString(li.BaseMediaImageView_imageType));
        }
        else {
            this.c = null;
        }
        this.f = obtainStyledAttributes.getBoolean(li.BaseMediaImageView_updateOnResize, false);
        final int int1 = obtainStyledAttributes.getInt(li.BaseMediaImageView_scaleType, 0);
        BaseMediaImageView$ScaleType a;
        if (int1 == 0) {
            a = BaseMediaImageView$ScaleType.a;
        }
        else if (int1 == 2) {
            a = BaseMediaImageView$ScaleType.c;
        }
        else {
            a = BaseMediaImageView$ScaleType.b;
        }
        this.a = a;
        obtainStyledAttributes.recycle();
    }
    
    private j b(final k k) {
        if (k != null) {
            ((k)k.a(this.getImageSize()).b(this.g)).a(this.a.decoderScaleType);
            if (this.l != null) {
                k.a(this.l.a(this));
            }
            final j a = k.a();
            this.e = a.v();
            a.a(this);
            return a;
        }
        this.e = null;
        return null;
    }
    
    private void g() {
        boolean b = true;
        if (this.c != null) {
            final Size imageSize = this.getImageSize();
            final j a = this.c.a();
            final boolean b2 = (this.m || this.c.b()) && b;
            if (this.getVisibility() != 8 && !imageSize.c() && a != null && (!b2 || (this.f && !imageSize.d(a.e())))) {
                this.c.a(this.b(this.d));
                final o c = this.c;
                if (this.n || this.g) {
                    b = false;
                }
                c.a(b);
            }
        }
    }
    
    protected void a(final int n) {
        this.b(this.getResources().getDrawable(n));
    }
    
    protected void a(final Bitmap bitmap, final boolean b) {
        this.b((Drawable)new BitmapDrawable(this.getResources(), bitmap));
    }
    
    protected void a(final Drawable drawable) {
        this.b(drawable);
    }
    
    public void a(final p p) {
        final Bitmap bitmap = (Bitmap)p.c();
        this.m = (bitmap != null || !this.g);
        if (this.m) {
            this.h = false;
            if (bitmap != null) {
                final ResourceResponse$ResourceSource d = p.d();
                final ResourceResponse$ResourceSource b = ResourceResponse$ResourceSource.b;
                boolean b2 = false;
                if (d == b) {
                    b2 = true;
                }
                this.a(bitmap, b2);
                this.n = true;
            }
            else {
                if (this.j != 0) {
                    this.a(this.j);
                }
                else {
                    this.d();
                }
                this.n = false;
            }
            if (this.e != null) {
                this.e.a(p);
            }
            if (this.k != null) {
                this.k.a(this, bitmap);
            }
        }
    }
    
    public boolean a() {
        return this.n;
    }
    
    public boolean a(final k k) {
        return this.a(k, true);
    }
    
    public boolean a(final k d, final boolean b) {
        this.d = d;
        final boolean a = this.c.a(this.b(d));
        if (a) {
            if (b) {
                this.d();
            }
            this.m = false;
        }
        this.e();
        return a;
    }
    
    protected abstract void b(final Drawable p0);
    
    public boolean b() {
        return this.c == null || this.c.c();
    }
    
    public void c() {
        this.measure(View$MeasureSpec.makeMeasureSpec(0, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 1073741824));
        this.layout(0, 0, 0, 0);
        this.requestLayout();
    }
    
    protected void d() {
        this.a(this.i);
        this.n = false;
        this.m = false;
        this.h = true;
    }
    
    @Override
    public void e() {
        if (!this.n) {
            this.m = false;
        }
        this.g();
    }
    
    @Override
    public void f() {
        this.d();
        this.b();
        this.c.d();
    }
    
    public Drawable getDefaultDrawable() {
        return this.i;
    }
    
    public j getImageRequest() {
        return this.c.a();
    }
    
    public o getImageRequester() {
        com.twitter.util.d.d();
        return this.c;
    }
    
    public abstract Size getImageSize();
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f();
        this.c();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.g();
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        int n3 = 1;
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        int n4;
        if (layoutParams.width == -2) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (layoutParams.height != -2) {
            n3 = 0;
        }
        if ((n4 != 0 || n3 != 0) && ((n4 != 0 && n3 != 0) || this.b <= 0.0f) && View$MeasureSpec.getSize(n) != 0 && View$MeasureSpec.getSize(n2) != 0) {
            throw new IllegalStateException("Image view measures can't be determined");
        }
        super.onMeasure(n, n2);
    }
    
    public void setCroppingRectProvider(final d l) {
        this.l = l;
    }
    
    public void setDefaultDrawable(final Drawable i) {
        if (this.i != i) {
            this.i = i;
            if (this.h) {
                this.d();
            }
        }
    }
    
    public void setErrorDrawableId(final int j) {
        this.j = j;
    }
    
    public void setFromMemoryOnly(final boolean g) {
        if (this.g != g && !(this.g = g)) {
            this.g();
        }
    }
    
    public void setImageType(final String s) {
        this.c.a(s);
    }
    
    public void setOnImageLoadedListener(final e k) {
        this.k = k;
    }
    
    public void setScaleType(final BaseMediaImageView$ScaleType a) {
        if (this.a != a) {
            this.a = a;
            this.m = false;
            this.b();
            this.g();
        }
    }
    
    public void setUpdateOnResize(final boolean f) {
        this.f = f;
    }
}
