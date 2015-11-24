// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

class r implements Runnable
{
    final FloatingChildLayout a;
    
    r(final FloatingChildLayout a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (FloatingChildLayout.c()) {
            FloatingChildLayout.a(this.a).setDuration((long)FloatingChildLayout.d(this.a)).start();
            if (!Log.l) {
                return;
            }
        }
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setDuration((long)FloatingChildLayout.d(this.a));
        ((Animation)alphaAnimation).setFillAfter(true);
        this.a.setBackgroundColor(2130706432);
        this.a.startAnimation((Animation)alphaAnimation);
    }
}
