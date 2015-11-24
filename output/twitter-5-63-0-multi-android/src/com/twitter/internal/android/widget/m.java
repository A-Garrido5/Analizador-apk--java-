// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.animation.Interpolator;
import android.content.Context;
import android.support.v4.widget.ScrollerCompat;

class m implements Runnable
{
    final /* synthetic */ HiddenDrawerLayout a;
    private final ScrollerCompat b;
    private final ScrollerCompat c;
    private ScrollerCompat d;
    private int e;
    private int f;
    
    m(final HiddenDrawerLayout a, final Context context, final Interpolator interpolator, final Interpolator interpolator2) {
        this.a = a;
        if (interpolator == null && interpolator2 == null) {
            final ScrollerCompat create = ScrollerCompat.create(context);
            this.c = create;
            this.b = create;
        }
        else {
            if (interpolator != null) {
                this.b = ScrollerCompat.create(context, interpolator);
            }
            else {
                this.b = ScrollerCompat.create(context);
            }
            if (interpolator != null) {
                this.c = ScrollerCompat.create(context, interpolator2);
            }
            else {
                this.c = ScrollerCompat.create(context);
            }
        }
        this.f = 200;
    }
    
    private void a(final int n, final int n2) {
        if (n2 > 0) {
            this.d.startScroll(0, 0, 0, n, n2);
            this.a.post((Runnable)this);
            return;
        }
        boolean b = false;
        if (n > 0) {
            b = true;
        }
        if (!b) {
            this.c(n);
        }
        this.a(b);
        this.a.invalidate();
    }
    
    private void a(final boolean b) {
        this.e = 0;
        if (b) {
            this.a.f = 0.0f;
            this.a.i = 4;
            this.a.a();
            this.a.c();
            if (this.a.e != null) {
                this.a.e.a();
            }
        }
        else {
            this.a.e();
            this.a.i = 3;
            if (this.a.e != null) {
                this.a.e.b();
            }
        }
    }
    
    private void c(int n) {
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)this.a.d.getLayoutParams();
        if (this.a.b) {
            if (this.a.a == 1) {
                n = -n;
            }
            rectLayoutParams.b += n;
            rectLayoutParams.d += n;
            this.a.d.offsetTopAndBottom(n);
            return;
        }
        if (this.a.a == 3) {
            n = -n;
        }
        rectLayoutParams.a += n;
        rectLayoutParams.c += n;
        this.a.d.offsetLeftAndRight(n);
    }
    
    void a(final int f) {
        this.f = f;
    }
    
    void b(final int n) {
        this.d = this.c;
        this.a(this.f, n);
    }
    
    @Override
    public void run() {
        final ScrollerCompat d = this.d;
        final boolean computeScrollOffset = d.computeScrollOffset();
        final int currY = d.getCurrY();
        final int n = this.e - currY;
        final boolean b = currY > 0;
        this.c(n);
        if (computeScrollOffset) {
            this.e = currY;
            this.a.e();
            this.a.post((Runnable)this);
        }
        else {
            this.a(b);
        }
        this.a.invalidate();
    }
}
