// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.support.v4.view.ViewCompat;
import java.util.Iterator;
import android.view.View$MeasureSpec;
import android.view.View;
import com.twitter.library.av.ak;
import java.util.LinkedList;
import android.view.animation.OvershootInterpolator;
import android.view.ViewGroup;
import android.graphics.Point;
import java.util.List;
import android.view.animation.Interpolator;

public class b implements g
{
    Interpolator a;
    int b;
    private e c;
    private d d;
    private List e;
    private Point f;
    private int g;
    private float h;
    private ViewGroup i;
    private f j;
    
    public b() {
        this.a = (Interpolator)new OvershootInterpolator();
        this.b = 0;
        this.e = new LinkedList();
        this.f = new Point();
        this.g = 0;
        this.h = 1.0f;
    }
    
    private int a(final Point point) {
        return this.a(point, ak.a, ak.b);
    }
    
    private int a(final Point point, final ak ak, final ak ak2) {
        if (this.h == 1.0f) {
            return ak.a(point, point).x;
        }
        if (this.h == 0.0f) {
            return ak2.a(point, point).x;
        }
        final int x = ak.a(point, point).x;
        final int x2 = ak2.a(point, point).x;
        return (int)(x2 + (x - x2) * this.h);
    }
    
    private boolean a(final int n, final Point point) {
        return Math.abs(this.b(this.b, point) - n) < 1.0f;
    }
    
    private float b(final int n, final Point point) {
        return n / (0.5f * (this.a(point) + this.b(point)));
    }
    
    private int b(final Point point) {
        return this.a(point, ak.a, ak.c);
    }
    
    private int c(final Point point) {
        return (int)Math.ceil(this.d(point));
    }
    
    private float d(final Point point) {
        final int n = (point.x - this.a(point)) / 2;
        if (n > 0) {
            return n / this.b(point);
        }
        return 0.0f;
    }
    
    public float a() {
        return this.h;
    }
    
    public int a(final ViewGroup viewGroup, final f f, final int n) {
        if (this.c != null) {
            this.c.a();
            this.c = null;
        }
        return this.b(viewGroup, f, n);
    }
    
    public void a(final float h) {
        this.h = h;
        if (this.i != null && this.j != null) {
            this.a(this.i, this.j);
        }
    }
    
    public void a(final ViewGroup i, final f j) {
        this.i = i;
        this.j = j;
        final int childCount = i.getChildCount();
        this.f.set(i.getWidth(), i.getHeight());
        final float b = this.b(this.b, this.f);
        final int round = Math.round(b);
        int k = Math.max(0, round - 1 - this.c(this.f));
        final int min = Math.min(-1 + j.a(), 1 + (round + this.c(this.f)));
        this.e.clear();
        for (int l = 0; l < childCount; ++l) {
            final View child = i.getChildAt(l);
            final int a = j.a(child);
            if (a < k || a > min) {
                this.e.add(child);
            }
        }
        for (final View view : this.e) {
            i.removeView(view);
            j.b(view);
        }
        final int a2 = this.a(this.f);
        final int b2 = this.b(this.f);
        while (k <= min) {
            final View a3 = j.a(i, k, this);
            if (a3.getParent() == null) {
                i.addView(a3);
            }
            if (this.a(k, this.f)) {}
            final float n = k - b;
            final int n2 = (a2 + b2) / 2;
            int n4;
            if (Math.abs(n) >= 1.0f) {
                float n3;
                if (n < 0.0f) {
                    n3 = -n2 + (n + 1.0f) * b2;
                }
                else {
                    n3 = n2 + (n - 1.0f) * b2;
                }
                n4 = (int)n3;
            }
            else {
                n4 = (int)(n * n2);
            }
            a3.measure(View$MeasureSpec.makeMeasureSpec(this.f.x, 1073741824), View$MeasureSpec.makeMeasureSpec(this.f.y, 1073741824));
            a3.layout(n4, 0, n4 + this.f.x, this.f.y);
            ++k;
        }
    }
    
    public void a(final ViewGroup viewGroup, final f f, final int n, final int n2) {
        this.f.set(viewGroup.getWidth(), viewGroup.getHeight());
        final float b = this.b(this.b, this.f);
        int round;
        if (Math.abs(n) > (int)(0.3f * this.f.x)) {
            double n3;
            if (n < 0) {
                n3 = Math.floor(b);
            }
            else {
                n3 = Math.ceil(b);
            }
            round = (int)n3;
        }
        else {
            round = Math.round(b);
        }
        final int n4 = Math.min(-1 + f.a(), Math.max(0, round)) * (this.b(this.f) + this.a(this.f)) / 2;
        if (this.c != null) {
            this.c.a();
        }
        ViewCompat.postOnAnimation((View)viewGroup, this.c = new e(this, viewGroup, f, n4, null));
    }
    
    public void a(final d d) {
        this.d = d;
    }
    
    @Override
    public void a(final j j, final int n) {
        j.a(this.b() == n);
    }
    
    public int b() {
        return this.g;
    }
    
    int b(final ViewGroup viewGroup, final f f, int n) {
        this.f.set(viewGroup.getWidth(), viewGroup.getHeight());
        final float b = this.b(this.b, this.f);
        if ((b >= -1 + f.a() && n > 0) || (b <= 0.0f && n < 0)) {
            n /= 3;
        }
        this.b += n;
        this.a(viewGroup, f);
        return n;
    }
}
