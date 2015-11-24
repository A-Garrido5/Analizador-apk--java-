// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.twitter.library.util.b;
import android.view.animation.LinearInterpolator;
import com.twitter.android.moments.ui.a;
import android.animation.Animator$AnimatorListener;
import com.twitter.internal.android.util.Size;
import com.twitter.android.moments.ui.FillCropFrameLayout;
import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class v extends AnimatorListenerAdapter
{
    final /* synthetic */ u a;
    
    v(final u a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.e = false;
    }
}
