// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;

class ac
{
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    final /* synthetic */ MedianCutQuantizer k;
    
    ac(final MedianCutQuantizer k, final int a, final int b, final int c) {
        this.k = k;
        this.a = 0;
        this.b = -1;
        this.d = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.b();
    }
    
    int a() {
        return this.b - this.a;
    }
    
    int a(final MedianCutQuantizer$ColorDimension medianCutQuantizer$ColorDimension) {
        Arrays.sort(this.k.b, this.a, 1 + this.b, medianCutQuantizer$ColorDimension.comparator);
        final int n = this.d / 2;
        int i = this.a;
        int n2 = 0;
        while (i < this.b) {
            n2 += this.k.b[i].d;
            if (n2 >= n) {
                break;
            }
            ++i;
        }
        return i;
    }
    
    void b() {
        this.e = 255;
        this.f = 0;
        this.g = 255;
        this.h = 0;
        this.i = 255;
        this.j = 0;
        this.d = 0;
        for (int i = this.a; i <= this.b; ++i) {
            final ae ae = this.k.b[i];
            this.d += ae.d;
            final int a = ae.a;
            final int b = ae.b;
            final int c = ae.c;
            if (a > this.f) {
                this.f = a;
            }
            if (a < this.e) {
                this.e = a;
            }
            if (b > this.h) {
                this.h = b;
            }
            if (b < this.g) {
                this.g = b;
            }
            if (c > this.j) {
                this.j = c;
            }
            if (c < this.i) {
                this.i = c;
            }
        }
    }
    
    ac c() {
        if (this.a() < 2) {
            return null;
        }
        final int a = this.a(this.d());
        final int c = 1 + this.c;
        final ac ac = new ac(this.k, a + 1, this.b, c);
        this.b = a;
        this.c = c;
        this.b();
        return ac;
    }
    
    MedianCutQuantizer$ColorDimension d() {
        final int n = this.f - this.e;
        final int n2 = this.h - this.g;
        final int n3 = this.j - this.i;
        if (n3 >= n && n3 >= n2) {
            return MedianCutQuantizer$ColorDimension.c;
        }
        if (n2 >= n && n2 >= n3) {
            return MedianCutQuantizer$ColorDimension.b;
        }
        return MedianCutQuantizer$ColorDimension.a;
    }
    
    ae e() {
        int n = 0;
        int i = this.a;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (i <= this.b) {
            final ae ae = this.k.b[i];
            final int d = ae.d;
            n4 += d * ae.a;
            n3 += d * ae.b;
            n2 += d * ae.c;
            n += d;
            ++i;
        }
        final double n5 = n;
        return new ae((int)(0.5 + n4 / n5), (int)(0.5 + n3 / n5), (int)(0.5 + n2 / n5), n);
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " lower=" + this.a + " upper=" + this.b + " count=" + this.d + " level=" + this.c + " rmin=" + this.e + " rmax=" + this.f + " gmin=" + this.g + " gmax=" + this.h + " bmin=" + this.i + " bmax=" + this.j + " bmin=" + this.i + " bmax=" + this.j;
    }
}
