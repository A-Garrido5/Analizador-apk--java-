// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.twitter.internal.android.util.Size;
import android.content.res.TypedArray;
import com.twitter.library.util.bq;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class BackgroundImageView extends BaseMediaImageView
{
    private final Drawable c;
    private final Drawable d;
    private final int e;
    private final int f;
    
    public BackgroundImageView(final Context context) {
        this(context, null);
    }
    
    public BackgroundImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public BackgroundImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BackgroundImageView, n, 0);
        this.e = (int)(255.0f * obtainStyledAttributes.getFloat(li.BackgroundImageView_filterMaxOpacity, 1.0f));
        (this.d = (Drawable)new ColorDrawable(obtainStyledAttributes.getColor(li.BackgroundImageView_filterColor, -16777216))).setAlpha(0);
        this.f = obtainStyledAttributes.getInt(li.BackgroundImageView_crossfadeDuration, 0);
        while (true) {
            try {
                final Drawable drawable = obtainStyledAttributes.getDrawable(li.BackgroundImageView_overlayDrawable);
                this.c = drawable;
                obtainStyledAttributes.recycle();
                this.setScaleType(BaseMediaImageView$ScaleType.b);
                this.d();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                bq.a(outOfMemoryError);
                final Drawable drawable = null;
                continue;
            }
            break;
        }
    }
    
    @Override
    protected void a(final int n) {
        this.setBackgroundDrawable(this.getResources().getDrawable(n));
    }
    
    @Override
    protected void a(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    @Override
    protected void b(final Drawable layeredBackground) {
        this.setLayeredBackground(layeredBackground);
    }
    
    @Override
    public Size getImageSize() {
        return Size.a((View)this);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        if (this.d != null) {
            this.d.setBounds(0, 0, measuredWidth, measuredHeight);
        }
        if (this.c != null) {
            final int intrinsicHeight = this.c.getIntrinsicHeight();
            if (intrinsicHeight < measuredHeight) {
                this.c.setBounds(0, measuredHeight - intrinsicHeight, measuredWidth, measuredHeight);
            }
        }
    }
    
    public void setBackgroundAlpha(final float n) {
        this.d.setAlpha((int)(n * this.e));
    }
    
    public void setLayeredBackground(final Drawable drawable) {
        Object backgroundDrawable;
        if (drawable == null) {
            backgroundDrawable = null;
        }
        else if (this.c == null) {
            backgroundDrawable = new LayerDrawable(new Drawable[] { drawable, this.d });
        }
        else {
            backgroundDrawable = new LayerDrawable(new Drawable[] { drawable, this.c, this.d });
        }
        if (this.f > 0) {
            final TransitionDrawable backgroundDrawable2 = new TransitionDrawable(new Drawable[] { this.getBackground(), backgroundDrawable });
            backgroundDrawable2.setCrossFadeEnabled(true);
            this.setBackgroundDrawable((Drawable)backgroundDrawable2);
            backgroundDrawable2.startTransition(this.f);
            return;
        }
        this.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
}
