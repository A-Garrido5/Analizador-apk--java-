// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class f implements Animation$AnimationListener
{
    final boolean a;
    final Runnable b;
    final FloatingChildLayout c;
    
    f(final FloatingChildLayout c, final boolean a, final Runnable b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (this.a) {
            if (FloatingChildLayout.b(this.c) != 3) {
                return;
            }
            FloatingChildLayout.a(this.c, 4);
            if (this.b == null) {
                return;
            }
            this.b.run();
            if (!Log.l) {
                return;
            }
        }
        if (FloatingChildLayout.b(this.c) == 1) {
            FloatingChildLayout.a(this.c, 2);
            if (this.b != null) {
                this.b.run();
            }
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
