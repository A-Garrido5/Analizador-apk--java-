// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Point;

public class bi
{
    public Point a;
    public Point b;
    public int c;
    public int d;
    public int e;
    public Rect f;
    public Rect g;
    public boolean h;
    public boolean i;
    public boolean j;
    
    public bi(final int n, final int n2) {
        this.c = 1;
        this.d = 0;
        this.e = 0;
        this.f = new Rect();
        this.g = new Rect();
        this.h = true;
        this.i = true;
        this.j = true;
        this.a = new Point(n, n2);
        this.b = new Point(this.a);
    }
    
    private PointF a(final int n, final Point point, final Rect rect, final Rect rect2) {
        if (point.x < 0 || point.y < 0) {
            throw new IllegalArgumentException("Only fixed size views are currently supported.");
        }
        int n2 = 0;
        int n3 = 0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("DockLayoutParams.logicalPosition needs to be one of BOTTOM_LEFT or BOTTOM_RIGHT. See " + this.getClass().getSimpleName());
            }
            case 0: {
                n2 = rect.left + rect2.left;
                n3 = rect.bottom - point.y - rect2.bottom;
                break;
            }
            case 1: {
                n2 = rect.right - point.x - rect2.right;
                n3 = rect.bottom - point.y - rect2.bottom;
                break;
            }
        }
        return new PointF((float)n2, (float)n3);
    }
    
    public PointF a(final Rect rect) {
        return this.a(this.c, this.a, rect, this.f);
    }
    
    public boolean a(final PointF pointF, final Rect rect) {
        if (this.i) {
            final PointF b = this.b(rect);
            final float n = b.x + this.b.x / 2;
            final float n2 = b.y + this.b.y / 2;
            final float n3 = pointF.x + this.a.x / 2;
            final float n4 = pointF.y + this.a.y / 2;
            final float abs = Math.abs(n3 - n);
            final float abs2 = Math.abs(n4 - n2);
            final float n5 = 1.0f * ((this.b.x + this.a.x) / 2);
            final float n6 = 1.0f * ((this.b.y + this.a.y) / 2);
            if (abs < n5 && abs2 < n6) {
                return true;
            }
        }
        return false;
    }
    
    public PointF b(final Rect rect) {
        return this.a(this.d, this.b, rect, this.g);
    }
}
