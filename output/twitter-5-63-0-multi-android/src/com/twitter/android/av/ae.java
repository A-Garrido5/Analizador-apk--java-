// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.graphics.PointF;
import java.util.Iterator;
import com.twitter.library.util.b;
import android.view.View;
import com.twitter.android.widget.bw;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class ae
{
    private int a;
    private Interpolator b;
    private Interpolator c;
    private Interpolator d;
    private int e;
    private int f;
    private int g;
    
    public ae(final Interpolator b, final Interpolator c, final int e, final int f) {
        this.a = 0;
        this.d = (Interpolator)new DecelerateInterpolator();
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = Math.min(this.e, this.f) / 2;
    }
    
    public void a(final bw bw, final float n, final float n2) {
        if (this.a == 0) {
            return;
        }
        this.a = 0;
        final Iterator<View> iterator = bw.getHideableViews().iterator();
        while (iterator.hasNext()) {
            com.twitter.library.util.b.b(iterator.next(), 1.0f, this.g, this.d);
        }
        final View contentView = bw.getContentView();
        contentView.setPivotX(0.0f);
        contentView.setPivotY(0.0f);
        com.twitter.library.util.b.a(contentView, n, n2, this.e, this.b);
    }
    
    public void a(final bw bw, final PointF pointF) {
        this.a = 1;
        final View contentView = bw.getContentView();
        final float n = pointF.x / contentView.getWidth();
        contentView.setScaleX(n);
        contentView.setScaleY(n);
        final Iterator<View> iterator = bw.getHideableViews().iterator();
        while (iterator.hasNext()) {
            iterator.next().setAlpha(0.0f);
        }
    }
    
    public void b(final bw bw, final PointF pointF) {
        if (this.a == 1) {
            return;
        }
        this.a = 1;
        final Iterator<View> iterator = (Iterator<View>)bw.getHideableViews().iterator();
        while (iterator.hasNext()) {
            com.twitter.library.util.b.b(iterator.next(), 0.0f, this.g, this.d);
        }
        final View contentView = bw.getContentView();
        final float n = pointF.x / contentView.getWidth();
        final float n2 = pointF.y / contentView.getWidth();
        contentView.setPivotX(0.0f);
        contentView.setPivotY(0.0f);
        com.twitter.library.util.b.a(contentView, n, n2, this.f, this.c);
    }
    
    public void c(final bw bw, final PointF pointF) {
        final View contentView = bw.getContentView();
        this.a(bw, pointF.x / contentView.getWidth(), pointF.y / contentView.getHeight());
    }
}
