// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View;
import android.view.animation.Interpolator;
import com.twitter.library.util.b;
import android.graphics.Rect;
import android.graphics.Point;
import android.view.animation.OvershootInterpolator;

class x
{
    private final OvershootInterpolator a;
    private final ExpandableVideoPlayerView b;
    private Point c;
    private int d;
    
    public x(final ExpandableVideoPlayerView b) {
        this.a = new OvershootInterpolator();
        this.c = new Point();
        this.d = 299;
        this.b = b;
    }
    
    public void a(final ak ak, final Point point, final boolean b) {
        float scaleY = 1.0f;
        final View view = this.b.getVideoThumbView().getView();
        final View videoViewContainer = this.b.getVideoViewContainer();
        View view2;
        if (this.b.getChromeView() != null) {
            view2 = this.b.getChromeView().getView();
        }
        else {
            view2 = null;
        }
        final Rect rect = new Rect();
        final Point a = ak.a(point, this.b.getVideoSize());
        final Point a2 = ak.b.a(this.c, this.c);
        final Point a3 = ak.c.a(this.c, this.c);
        rect.left = (point.x - a.x) / 2;
        rect.right = rect.left + a.x;
        rect.top = (point.y - a.y) / 2;
        rect.bottom = rect.top + a.y;
        float scaleX;
        if (ak == ak.c) {
            scaleX = a3.x / a2.x;
            scaleY = a3.y / a2.y;
        }
        else {
            scaleX = scaleY;
        }
        if (!b) {
            videoViewContainer.setLeft(rect.left);
            videoViewContainer.setTop(rect.top);
            videoViewContainer.setRight(rect.right);
            videoViewContainer.setBottom(rect.bottom);
            if (view2 != null) {
                view2.setLeft(rect.left);
                view2.setTop(rect.top);
                view2.setRight(rect.right);
                view2.setBottom(rect.bottom);
            }
            view.setScaleX(scaleX);
            view.setScaleY(scaleY);
            return;
        }
        b.a(videoViewContainer, rect, this.d, (Interpolator)this.a);
        if (view2 != null) {
            b.a(view2, rect, this.d, (Interpolator)this.a);
        }
        b.a(view, scaleX, scaleY, this.d, (Interpolator)this.a);
    }
    
    public void a(final ak ak, final boolean b) {
        this.c.set(this.b.getWidth(), this.b.getHeight());
        this.a(ak, this.c, b);
    }
}
