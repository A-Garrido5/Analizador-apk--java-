// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import com.twitter.util.g;
import android.widget.ProgressBar;
import android.os.Handler;

public class ed implements Runnable
{
    private final Handler a;
    private final ProgressBar b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    
    public ed(final Handler a, final ProgressBar b, final nz nz, final boolean d, final boolean e, final boolean f) {
        this.a = a;
        this.b = b;
        this.c = nz.c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private void a(final int n) {
        if (this.d) {
            this.b.setProgress(n);
            return;
        }
        this.b.setSecondaryProgress(n);
    }
    
    private boolean a() {
        if (this.e) {
            int n;
            if (this.d) {
                n = this.b.getSecondaryProgress();
            }
            else {
                n = this.b.getProgress();
            }
            if (n <= 0 || n >= 10000) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void run() {
        final int a = g.a(this.c, 0, 10000);
        if (a == 0) {
            this.a(a);
            if (this.a()) {
                this.b.setVisibility(8);
            }
            return;
        }
        this.b.setVisibility(0);
        this.b.setAlpha(1.0f);
        String s;
        if (this.d) {
            s = "progress";
        }
        else {
            s = "secondaryProgress";
        }
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)this.b, s, new int[] { a });
        ofInt.setDuration(200L);
        ofInt.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        if (a == 10000) {
            if (this.a()) {
                ofInt.addListener((Animator$AnimatorListener)new ee(this.a, this.b));
            }
            else if (this.f) {
                ofInt.addListener((Animator$AnimatorListener)new ef(this.a, this.b, this.d, 0));
            }
        }
        ofInt.start();
    }
}
