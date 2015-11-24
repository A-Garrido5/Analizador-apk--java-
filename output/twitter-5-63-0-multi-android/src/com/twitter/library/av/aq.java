// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View;
import android.graphics.Rect;
import android.graphics.Point;

public abstract class aq
{
    static Point b(final int n, final int n2, final int n3, final int n4) {
        final Point point = new Point(n, n2);
        final float n5 = 1.0f / n4;
        final float n6 = n;
        final float n7 = n2;
        if (Float.compare(n5 * n3, n6 / n7) != 0) {
            final float min = Math.min(n6 / n3, n5 * n7);
            point.x = Math.round(min * n3);
            point.y = Math.round(min * n4);
        }
        return point;
    }
    
    public Rect a(int n, int n2, int n3, int n4) {
        final int videoWidth = this.b().getVideoWidth();
        final int videoHeight = this.b().getVideoHeight();
        if (videoWidth > 0 && videoHeight > 0) {
            final int n5 = n3 - n;
            final int n6 = n4 - n2;
            final Point b = b(n5, n6, videoWidth, videoHeight);
            if (b.x < n5) {
                final int n7 = (n5 - b.x) / 2;
                n += n7;
                n3 -= n7;
            }
            if (b.y < n6) {
                final int n8 = (n6 - b.y) / 2;
                n2 += n8;
                n4 -= n8;
            }
        }
        return new Rect(n, n2, n3, n4);
    }
    
    public abstract View a();
    
    public void a(final int n, final int n2) {
        this.b().a(n, n2);
    }
    
    public abstract void a(final boolean p0);
    
    protected abstract ad b();
}
