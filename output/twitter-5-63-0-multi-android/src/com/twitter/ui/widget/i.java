// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
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
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class i implements Animation$AnimationListener
{
    final /* synthetic */ m a;
    final /* synthetic */ f b;
    
    i(final f b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (this.b.q) {
            this.a.a();
            this.a.j();
            this.a.a(false);
            this.b.k.startAnimation(this.b.l);
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
