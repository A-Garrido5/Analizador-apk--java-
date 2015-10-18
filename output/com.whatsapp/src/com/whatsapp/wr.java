// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;
import android.view.animation.ScaleAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;

class wr implements Runnable
{
    final ahl a;
    private int b;
    private Animation[] c;
    
    wr(final ahl a) {
        this.a = a;
        this.b = 0;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        if (this.c == null) {
            this.c = new Animation[ahl.a(this.a).length];
            int n;
            for (int j = 0; j < ahl.d(this.a).length; j = n) {
                final AnimationSet set = new AnimationSet(true);
                set.addAnimation((Animation)new AlphaAnimation(1.0f, 0.5f));
                set.addAnimation((Animation)new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f));
                (this.c[j] = (Animation)set).setDuration(400L);
                this.c[j].setFillAfter(true);
                n = j + 1;
                if (i) {
                    break;
                }
            }
        }
        if (ahl.b(this.a) == 1) {
            if (this.b < ahl.d(this.a).length) {
                this.c[this.b].reset();
                ahl.d(this.a)[this.b].startAnimation(this.c[this.b]);
            }
            this.b = (1 + this.b) % ahl.d(this.a).length;
            final Handler c = ahl.c(this.a);
            long n2;
            if (this.b == 0) {
                n2 = 800L;
            }
            else {
                n2 = 100L;
            }
            c.postDelayed((Runnable)this, n2);
        }
    }
}
