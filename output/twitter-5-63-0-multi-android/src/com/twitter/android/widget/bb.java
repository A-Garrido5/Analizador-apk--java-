// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.PointF;
import android.graphics.Rect;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;

public class bb extends be
{
    private final Interpolator a;
    private final int b;
    private View c;
    private boolean d;
    
    public bb(final Context context, final ap ap, final int n) {
        this(context, ap, View.inflate(context, n, (ViewGroup)null));
    }
    
    bb(final Context context, final ap ap, final View view) {
        float scaleY = 1.25f;
        super(context, ap);
        this.a = (Interpolator)new OvershootInterpolator();
        this.b = this.g().getResources().getInteger(17694720);
        this.c = view.findViewById(2131886657);
        if (this.c != null) {
            final View c = this.c;
            float alpha;
            if (this.d) {
                alpha = 1.0f;
            }
            else {
                alpha = 0.8f;
            }
            c.setAlpha(alpha);
            final View c2 = this.c;
            float scaleX;
            if (this.d) {
                scaleX = scaleY;
            }
            else {
                scaleX = 1.0f;
            }
            c2.setScaleX(scaleX);
            final View c3 = this.c;
            if (!this.d) {
                scaleY = 1.0f;
            }
            c3.setScaleY(scaleY);
        }
        this.e().addView(view);
        this.a(this.d);
    }
    
    private void a(final float n, final float n2) {
        this.e().animate().alpha(n).setDuration((long)this.b).setInterpolator((TimeInterpolator)this.a);
        if (this.c != null) {
            this.c.animate().scaleX(n2).scaleY(n2).alpha(n).setDuration((long)this.b).setInterpolator((TimeInterpolator)this.a);
        }
    }
    
    public void a(final Rect rect) {
        final AnimatableParams a = this.a();
        if (!a.a(rect)) {
            a.b().set(this.c(rect));
        }
        a.d(a.a());
    }
    
    public void a(final boolean d) {
        if (this.d != d) {
            if (d) {
                this.a(1.0f, 1.25f);
            }
            else {
                this.a(0.8f, 1.0f);
            }
        }
        this.d = d;
    }
    
    public void b(final Rect rect) {
        this.a().d(this.c(rect));
    }
    
    public PointF c(final Rect rect) {
        final AnimatableParams a = this.a();
        int n;
        if (a.a().x > rect.width() / 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        float n2;
        if (n != 0) {
            n2 = 1 + (rect.width() + a.width);
        }
        else {
            n2 = -1 + -a.width;
        }
        return new PointF(n2, a.a().y);
    }
}
