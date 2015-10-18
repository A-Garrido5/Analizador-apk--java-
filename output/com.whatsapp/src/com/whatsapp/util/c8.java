// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Paint;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class c8 extends AnimatorListenerAdapter
{
    final boolean a;
    final FloatingChildLayout b;
    final Runnable c;
    
    c8(final FloatingChildLayout b, final boolean a, final Runnable c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public void onAnimationEnd(final Animator animator) {
        FloatingChildLayout.c(this.b).setLayerType(0, (Paint)null);
        if (this.a) {
            if (FloatingChildLayout.b(this.b) != 3) {
                return;
            }
            FloatingChildLayout.a(this.b, 4);
            if (this.c == null) {
                return;
            }
            this.c.run();
            if (!Log.l) {
                return;
            }
        }
        if (FloatingChildLayout.b(this.b) == 1) {
            FloatingChildLayout.a(this.b, 2);
            if (this.c != null) {
                this.c.run();
            }
        }
    }
}
