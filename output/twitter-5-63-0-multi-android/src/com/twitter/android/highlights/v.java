// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.animation.AccelerateInterpolator;
import android.animation.AnimatorSet$Builder;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;
import java.util.HashMap;
import android.animation.ObjectAnimator;
import com.twitter.android.widget.highlights.StoriesViewPager;
import java.util.ArrayList;
import android.content.res.Resources;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import android.animation.ValueAnimator;
import java.util.Iterator;
import android.view.View;
import android.graphics.Paint;
import android.animation.Animator;
import java.lang.ref.WeakReference;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;

class v implements Animator$AnimatorListener, ValueAnimator$AnimatorUpdateListener
{
    private final t a;
    private final u b;
    private final WeakReference c;
    
    public v(final t a, final u b, final WeakReference c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onAnimationCancel(final Animator animator) {
        animator.removeAllListeners();
    }
    
    public void onAnimationEnd(final Animator animator) {
        animator.removeAllListeners();
        this.b.b.setLayerType(0, (Paint)null);
        final Iterator<View> iterator = this.b.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().setLayerType(0, (Paint)null);
        }
        final Iterator<View> iterator2 = this.b.d.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().setLayerType(0, (Paint)null);
        }
        if (this.a.j == 0) {
            this.a.j = 2;
            if (this.c != null) {
                final w w = (w)this.c.get();
                if (w != null) {
                    w.c();
                }
            }
        }
        else if (this.a.j == 3 && this.c != null) {
            final w w2 = (w)this.c.get();
            if (w2 != null) {
                w2.d();
            }
        }
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
    }
}
