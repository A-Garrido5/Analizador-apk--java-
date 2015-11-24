// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.view.animation.Animation$AnimationListener;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.View;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Transformation;
import android.view.animation.Animation;

class j extends Animation
{
    final /* synthetic */ m a;
    final /* synthetic */ f b;
    
    j(final f b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        final float n2 = (float)Math.toRadians(this.a.c() / (6.283185307179586 * this.a.h()));
        final float f = this.a.f();
        final float e = this.a.e();
        final float i = this.a.i();
        this.a.c(f + (0.8f - n2) * com.twitter.ui.widget.f.c.getInterpolation(n));
        this.a.b(e + 0.8f * com.twitter.ui.widget.f.b.getInterpolation(n));
        this.a.d(i + 0.25f * n);
        this.b.c(144.0f * n + 720.0f * (this.b.m / 5.0f));
    }
}
