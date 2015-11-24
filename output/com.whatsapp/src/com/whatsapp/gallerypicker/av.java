// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.AnimationSet;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class av implements ViewTreeObserver$OnPreDrawListener
{
    final ai a;
    
    av(final ai a) {
        this.a = a;
    }
    
    public boolean onPreDraw() {
        this.a.e.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        if (this.a.e.getParent() instanceof View) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            long n = 0L;
            Label_0111: {
                if (uptimeMillis < u.b(this.a.a)) {
                    n = u.b(this.a.a) - uptimeMillis;
                    u.a(this.a.a, 40L + u.b(this.a.a));
                    if (MediaGalleryBase.v == 0) {
                        break Label_0111;
                    }
                }
                u.a(this.a.a, uptimeMillis + 40L);
            }
            final long startOffset = n;
            final View view = (View)this.a.e.getParent();
            final AnimationSet set = new AnimationSet(false);
            final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.25f, 1, 0.0f);
            ((Animation)translateAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
            final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            ((Animation)alphaAnimation).setInterpolator((Interpolator)new az(this));
            set.addAnimation((Animation)translateAnimation);
            set.addAnimation((Animation)alphaAnimation);
            set.setDuration(160L);
            set.setStartOffset(startOffset);
            set.setFillBefore(true);
            set.setFillAfter(true);
            view.startAnimation((Animation)set);
        }
        return true;
    }
}
