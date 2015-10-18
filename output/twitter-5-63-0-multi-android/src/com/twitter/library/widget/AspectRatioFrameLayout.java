// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import com.twitter.internal.android.util.Size;
import com.twitter.util.g;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class AspectRatioFrameLayout extends FrameLayout
{
    private float a;
    protected float b;
    private float c;
    private int d;
    private int e;
    private int f;
    
    public AspectRatioFrameLayout(final Context context) {
        super(context);
        this.f = 0;
    }
    
    public AspectRatioFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AspectRatioFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.AspectRatioFrameLayout, n, 0);
        this.b = obtainStyledAttributes.getFloat(li.AspectRatioFrameLayout_aspect_ratio, 0.0f);
        this.a = obtainStyledAttributes.getFloat(li.AspectRatioFrameLayout_min_aspect_ratio, 0.0f);
        this.c = obtainStyledAttributes.getFloat(li.AspectRatioFrameLayout_max_aspect_ratio, 0.0f);
        this.d = obtainStyledAttributes.getDimensionPixelSize(li.AspectRatioFrameLayout_max_width, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.AspectRatioFrameLayout_max_height, 0);
        this.f = obtainStyledAttributes.getInteger(li.AspectRatioFrameLayout_scaleMode, 0);
        obtainStyledAttributes.recycle();
    }
    
    private float getClampedAspectRatio() {
        float n;
        if (this.c != 0.0f) {
            n = this.c;
        }
        else {
            n = this.b;
        }
        return g.a(this.b, this.a, n);
    }
    
    public float getAspectRatio() {
        return this.b;
    }
    
    public float getMaxAspectRatio() {
        return this.c;
    }
    
    protected void onMeasure(final int n, final int n2) {
        int n3 = 1;
        if (this.f == n3 || this.b <= 0.0f) {
            super.onMeasure(n, n2);
            return;
        }
        final float clampedAspectRatio = this.getClampedAspectRatio();
        if (this.f == 2) {
            super.onMeasure(n, n2);
            final Size b = Size.a(this.getMeasuredWidth(), this.getMeasuredHeight()).b(this.b);
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(b.a(), 1073741824), View$MeasureSpec.makeMeasureSpec(b.b(), 1073741824));
            return;
        }
        final int f = this.f;
        int n4 = 0;
        Label_0138: {
            switch (f) {
                default: {
                    n3 = 0;
                    break Label_0138;
                }
                case 0: {
                    final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                    int n5;
                    if (layoutParams.width == -2) {
                        n5 = n3;
                    }
                    else {
                        n5 = 0;
                    }
                    if (layoutParams.height != -2) {
                        n3 = 0;
                    }
                    n4 = n3;
                    n3 = n5;
                    break Label_0138;
                }
                case 4: {
                    n4 = n3;
                    n3 = 0;
                }
                case 3: {
                    if (n3 == n4) {
                        super.onMeasure(n, n2);
                        return;
                    }
                    int d;
                    int n8;
                    if (n4 != 0) {
                        int n6;
                        if (View$MeasureSpec.getMode(n) == 1073741824) {
                            n6 = View$MeasureSpec.getSize(n);
                        }
                        else {
                            super.onMeasure(n, n2);
                            n6 = this.getMeasuredWidth();
                        }
                        final int n7 = (int)(n6 / clampedAspectRatio);
                        d = n6;
                        n8 = n7;
                    }
                    else {
                        if (View$MeasureSpec.getMode(n2) == 1073741824) {
                            n8 = View$MeasureSpec.getSize(n2);
                        }
                        else {
                            super.onMeasure(n, n2);
                            n8 = this.getMeasuredHeight();
                        }
                        d = (int)(clampedAspectRatio * n8);
                    }
                    if (this.d > 0 && this.d < d) {
                        d = this.d;
                        n8 = (int)(d / clampedAspectRatio);
                    }
                    if (this.e > 0 && this.e < n8) {
                        n8 = this.e;
                        d = (int)(clampedAspectRatio * n8);
                    }
                    super.onMeasure(View$MeasureSpec.makeMeasureSpec(d, 1073741824), View$MeasureSpec.makeMeasureSpec(n8, 1073741824));
                }
            }
        }
    }
    
    public void setAspectRatio(final float b) {
        if (this.b != b) {
            this.b = b;
            this.requestLayout();
        }
    }
    
    public void setMaxAspectRatio(final float c) {
        final float clampedAspectRatio = this.getClampedAspectRatio();
        this.c = c;
        if (clampedAspectRatio != this.getClampedAspectRatio()) {
            this.requestLayout();
        }
    }
    
    public void setMinAspectRatio(final float a) {
        final float clampedAspectRatio = this.getClampedAspectRatio();
        this.a = a;
        if (clampedAspectRatio != this.getClampedAspectRatio()) {
            this.requestLayout();
        }
    }
    
    public void setScaleMode(final int f) {
        if (this.f != f) {
            this.f = f;
            this.requestLayout();
        }
    }
}
