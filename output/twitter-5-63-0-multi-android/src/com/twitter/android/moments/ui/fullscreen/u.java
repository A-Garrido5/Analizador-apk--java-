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

class u
{
    private final View a;
    private final FillCropFrameLayout b;
    private Size c;
    private final Animator$AnimatorListener d;
    private boolean e;
    
    u(final FillCropFrameLayout b, final View a) {
        this.d = (Animator$AnimatorListener)new v(this);
        this.b = b;
        this.a = a;
    }
    
    public void a() {
        if (this.c != null) {
            this.e = true;
            com.twitter.library.util.b.a(this.a, this.b.getConstraint(), com.twitter.android.moments.ui.a.a(this.c, Size.a((View)this.b)), 200, (Interpolator)new LinearInterpolator()).setListener(this.d).start();
        }
    }
    
    public void a(final Size c, final Rect rect) {
        this.b.a(c, rect);
        this.c = c;
    }
    
    public void b() {
        this.e = true;
        this.a.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200L).setListener(this.d).start();
    }
}
