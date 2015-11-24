// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import android.graphics.RectF;
import android.graphics.PointF;

public class j extends g
{
    public static float a(final PointF pointF, final float n, final float n2) {
        return g.a(pointF.x - n, pointF.y - n2);
    }
    
    public static float a(final RectF rectF, final RectF rectF2, final boolean b) {
        if (b) {
            return Math.min(rectF2.height() / rectF.height(), rectF2.width() / rectF.width());
        }
        return Math.max(rectF2.height() / rectF.height(), rectF2.width() / rectF.width());
    }
    
    public static float a(final Size size, final Size size2, final boolean b) {
        return a(size.g(), size2.g(), b);
    }
    
    public static Rect a(final Rect rect, final int n, final int n2) {
        return new Rect(n + rect.left, n2 + rect.top, n + rect.right, n2 + rect.bottom);
    }
    
    public static Rect a(final Rect rect, final Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            return rect;
        }
        final RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        return a(rectF);
    }
    
    public static Rect a(final Rect rect, final Rect rect2) {
        final Rect rect3 = new Rect();
        rect3.setIntersect(rect, rect2);
        return rect3;
    }
    
    public static Rect a(final RectF rectF) {
        final Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }
    
    public static RectF a(final RectF rectF, final float n, final float n2) {
        return new RectF(n * rectF.left, n2 * rectF.top, n * rectF.right, n2 * rectF.bottom);
    }
    
    public static RectF a(final RectF rectF, final Size size) {
        return a(rectF, size.a(), size.b());
    }
    
    public static float b(final Rect rect, final Rect rect2) {
        return g.a(rect.exactCenterX() - rect2.exactCenterX(), rect.exactCenterY() - rect2.exactCenterY());
    }
    
    public static RectF b(final RectF rectF, final Size size) {
        return a(rectF, 1.0f / size.a(), 1.0f / size.b());
    }
}
