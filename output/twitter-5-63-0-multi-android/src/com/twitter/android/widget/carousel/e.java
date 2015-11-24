// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import java.util.Iterator;
import android.view.View$MeasureSpec;
import com.twitter.library.av.ak;
import java.util.LinkedList;
import android.view.animation.OvershootInterpolator;
import android.graphics.Point;
import java.util.List;
import android.view.animation.Interpolator;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.ViewGroup;

class e implements Runnable
{
    final /* synthetic */ b a;
    private ViewGroup b;
    private f c;
    private boolean d;
    private ScrollerCompat e;
    
    private e(final b a, final ViewGroup b, final f c, final int n) {
        this.a = a;
        this.d = false;
        this.b = b;
        this.c = c;
        (this.e = ScrollerCompat.create(b.getContext(), a.a)).startScroll(a.b, 0, n - a.b, 0, 199);
    }
    
    public void a() {
        this.d = true;
        this.e.abortAnimation();
    }
    
    @Override
    public void run() {
        if (this.d) {
            return;
        }
        this.a.f.set(this.b.getWidth(), this.b.getHeight());
        this.e.computeScrollOffset();
        this.a.b(this.b, this.c, this.e.getCurrX() - this.a.b);
        if (this.e.isFinished()) {
            final int b = this.a.g;
            this.a.g = Math.round(this.a.b(this.a.b, this.a.f));
            if (this.a.d != null) {
                this.a.d.a(this.a, this.a.g);
                this.a.d.a(this.a, this.a.g, b);
            }
            this.a();
            return;
        }
        ViewCompat.postOnAnimation((View)this.b, this);
    }
}
