// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.internal.android.widget.FixedSizeImageView;
import com.twitter.internal.android.util.Size;
import android.graphics.drawable.Drawable;
import com.twitter.library.util.b;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.Animatable;
import android.graphics.Bitmap;
import android.content.res.TypedArray;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class MediaImageView extends BaseMediaImageView
{
    private ImageView c;
    private ImageView d;
    private boolean e;
    private float f;
    
    public MediaImageView(final Context context) {
        this(context, null, false);
    }
    
    public MediaImageView(final Context context, final AttributeSet set) {
        this(context, set, kv.mediaImageViewStyle);
    }
    
    public MediaImageView(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, null, false);
    }
    
    protected MediaImageView(final Context context, final AttributeSet set, final int n, final ImageView c, final boolean b) {
        super(context, set, n);
        if (c != null) {
            this.addView((View)c);
        }
        this.c = c;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.MediaImageView, n, 0);
        this.e = obtainStyledAttributes.getBoolean(li.MediaImageView_fadeIn, false);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(li.MediaImageView_singleImageView, b);
        this.f = obtainStyledAttributes.getFloat(li.MediaImageView_scaleFactor, 1.0f);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            this.d = this.c;
            return;
        }
        this.addView((View)(this.d = new ImageView(context)));
    }
    
    public MediaImageView(final Context context, final ImageView imageView, final boolean b) {
        this(context, null, kv.mediaImageViewStyle, imageView, b);
        this.k();
    }
    
    @Override
    protected void a(final Bitmap bitmap, final boolean b) {
        final Drawable drawable = this.d.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable)drawable).stop();
        }
        ImageView$ScaleType scaleType = null;
        switch (com.twitter.library.media.widget.m.a[this.a.ordinal()]) {
            default: {
                scaleType = ImageView$ScaleType.CENTER_CROP;
                break;
            }
            case 1: {
                scaleType = ImageView$ScaleType.CENTER_INSIDE;
                break;
            }
            case 2: {
                scaleType = ImageView$ScaleType.FIT_CENTER;
                break;
            }
        }
        this.c.setScaleType(scaleType);
        if (!this.e || b) {
            this.d.setVisibility(4);
            this.c.setVisibility(0);
            this.c.setImageBitmap(bitmap);
            return;
        }
        if (this.c.getVisibility() == 0) {
            b.a(this.c, bitmap);
            return;
        }
        this.c.setImageBitmap(bitmap);
        b.a((View)this.d, (View)this.c);
    }
    
    @Override
    protected void b(final Drawable imageDrawable) {
        final Drawable drawable = this.d.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable)drawable).stop();
        }
        this.c.setVisibility(4);
        this.c.setImageDrawable((Drawable)null);
        this.d.setVisibility(0);
        this.d.setScaleType(ImageView$ScaleType.CENTER);
        this.d.setImageDrawable(imageDrawable);
        if (imageDrawable instanceof Animatable) {
            ((Animatable)imageDrawable).start();
        }
    }
    
    @Override
    public Size getImageSize() {
        return Size.a((View)this.c).a(this.f);
    }
    
    public ImageView getImageView() {
        return this.c;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (this.d != null && drawable == this.d.getDrawable()) {
            this.d.invalidate();
            return;
        }
        super.invalidateDrawable(drawable);
    }
    
    protected void k() {
        if (this.c == null) {
            final ImageView c = (ImageView)this.findViewById(la.image);
            if (c == null) {
                this.addView((View)(this.c = this.l()));
            }
            else {
                this.c = c;
            }
            if (this.d == null) {
                this.d = this.c;
            }
        }
        this.d();
    }
    
    protected ImageView l() {
        return new FixedSizeImageView(this.getContext());
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.k();
    }
    
    public void setFadeIn(final boolean e) {
        this.e = e;
    }
    
    public void setScaleFactor(final float f) {
        this.f = f;
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || this.d.getDrawable() == drawable;
    }
}
