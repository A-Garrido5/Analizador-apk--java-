// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.graphics.Point;

public class ak
{
    public static ak a;
    public static ak b;
    public static ak c;
    private int d;
    private float e;
    private Point f;
    
    static {
        ak.a = new ak(11, 1.0f);
        ak.b = new ak(12, 0.5f);
        ak.c = new ak(13, 0.33f);
    }
    
    public ak(final int d, final float e) {
        this.f = new Point();
        this.d = d;
        this.e = e;
    }
    
    public Point a(final Point point, final Point point2) {
        float n = 1.7777778f;
        float n2;
        if (point2.x != 0 && point2.y != 0) {
            n2 = point2.x / point2.y;
        }
        else {
            n2 = n;
        }
        if (point.x != 0 && point.y != 0) {
            n = point.x / point.y;
        }
        switch (this.d) {
            default: {
                if (n2 > n) {
                    this.f.x = (int)(point.x * this.e);
                    this.f.y = (int)(this.f.x / n2);
                    break;
                }
                this.f.y = (int)(point.y * this.e);
                this.f.x = (int)(n2 * this.f.y);
                break;
            }
            case 12:
            case 13: {
                this.f.x = (int)(Math.min(point.x, point.y) * this.e);
                this.f.y = this.f.x;
                break;
            }
        }
        return this.f;
    }
}
