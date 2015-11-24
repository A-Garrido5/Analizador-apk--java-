// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.android.media.camera.z;
import android.graphics.Rect;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.OvershootInterpolator;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class as extends f
{
    final /* synthetic */ VideoEditGarbageCanView a;
    
    as(final VideoEditGarbageCanView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.d.setVisibility(8);
        if (this.a.f == 0) {
            this.a.a.setVisibility(4);
        }
    }
}
