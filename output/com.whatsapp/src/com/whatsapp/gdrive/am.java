// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.Handler;
import android.view.animation.ScaleAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.view.animation.Animation;

class am implements Runnable
{
    private Animation[] a;
    final int[] b;
    private int c;
    final GoogleDriveActivity d;
    final ImageView[] e;
    
    am(final GoogleDriveActivity d, final int[] b, final ImageView[] e) {
        this.d = d;
        this.b = b;
        this.e = e;
        this.c = 0;
    }
    
    @Override
    public void run() {
        final int f = GoogleDriveService.F;
        if (this.a == null) {
            this.a = new Animation[this.b.length];
            int n;
            for (int i = 0; i < this.e.length; i = n) {
                final AnimationSet set = new AnimationSet(true);
                set.addAnimation((Animation)new AlphaAnimation(1.0f, 0.5f));
                set.addAnimation((Animation)new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f));
                (this.a[i] = (Animation)set).setDuration(400L);
                this.a[i].setFillAfter(true);
                n = i + 1;
                if (f != 0) {
                    break;
                }
            }
        }
        if (this.c < this.e.length) {
            this.a[this.c].reset();
            this.e[this.c].startAnimation(this.a[this.c]);
        }
        this.c = (1 + this.c) % this.e.length;
        final Handler j = GoogleDriveActivity.j(this.d);
        long n2;
        if (this.c == 0) {
            n2 = 800L;
        }
        else {
            n2 = 100L;
        }
        j.postDelayed((Runnable)this, n2);
    }
}
