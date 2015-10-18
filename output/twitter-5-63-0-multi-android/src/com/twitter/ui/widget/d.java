// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.animation.Interpolator;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.view.animation.Transformation;
import android.view.animation.Animation;

class d extends Animation
{
    public int a;
    public int b;
    final /* synthetic */ CircleImageView c;
    
    private d(final CircleImageView c) {
        this.c = c;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        this.c.a(this.a, this.b, n);
    }
}
