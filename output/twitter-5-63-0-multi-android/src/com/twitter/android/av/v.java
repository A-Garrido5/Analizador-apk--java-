// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.animation.Animator;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.animation.ObjectAnimator;
import java.util.Random;
import android.animation.Animator$AnimatorListener;

class v implements Animator$AnimatorListener
{
    public int a;
    public float b;
    public int c;
    private final Random d;
    private final int e;
    private final float f;
    private ObjectAnimator g;
    private boolean h;
    
    public v(final int e, final float f) {
        this.a = 1;
        this.b = 1.0f;
        this.c = -1;
        this.d = new Random();
        this.e = e;
        this.f = f;
    }
    
    private float c() {
        return (this.e - this.f) * (0.5f + 0.5f * this.d.nextFloat());
    }
    
    public void a() {
        if (this.g != null) {
            this.g.cancel();
        }
    }
    
    public void a(final Canvas canvas, final Paint paint) {
        canvas.drawLine(0.0f, 0.0f, 0.0f, -this.b, paint);
    }
    
    public void b() {
        float n;
        int n2;
        if (this.a == 1) {
            this.a = 0;
            n = this.b + this.c();
            n2 = (int)(199.0f * (0.66f + 0.33f * this.d.nextFloat()));
        }
        else {
            this.a = 1;
            n = this.b - this.c();
            n2 = (int)(666.0f * (0.5f + 0.5f * this.d.nextFloat()));
        }
        (this.g = ObjectAnimator.ofFloat((Object)this, "height", new float[] { this.b, (float)(int)Math.max(1.0f, Math.min(this.e - this.f, n)) }).setDuration((long)n2)).addListener((Animator$AnimatorListener)this);
        this.g.start();
        this.h = false;
    }
    
    public void onAnimationCancel(final Animator animator) {
        this.h = true;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (!this.h) {
            this.b();
        }
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
