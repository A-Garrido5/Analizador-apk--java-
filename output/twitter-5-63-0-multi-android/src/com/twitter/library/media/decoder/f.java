// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.decoder;

import android.graphics.Matrix;
import com.twitter.util.j;
import android.graphics.Rect;
import android.graphics.RectF;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.internal.android.util.Size;

class f
{
    private Size a;
    private ImageOrientation b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private RectF h;
    private Size i;
    private int j;
    
    f() {
        this.a = Size.a;
        this.b = ImageOrientation.a;
        this.i = Size.a;
    }
    
    private static Rect a(final Rect rect, final float n) {
        final int width = rect.width();
        final int height = rect.height();
        final float n2 = width / height;
        if (n == 0.0f || n2 == 0.0f || n == n2) {
            return rect;
        }
        if (n < n2) {
            final int n3 = (int)(n * height);
            final int n4 = rect.left + (width - n3) / 2;
            return new Rect(n4, rect.top, n3 + n4, rect.bottom);
        }
        final int n5 = (int)(width / n);
        final int n6 = rect.top + (height - n5) / 2;
        return new Rect(rect.left, n6, rect.right, n5 + n6);
    }
    
    private float d() {
        final float e = this.a.e();
        if (this.b.degrees % 180 == 0) {
            return e;
        }
        return 1.0f / e;
    }
    
    private g i(final Size size) {
        final Size a = this.b.a(this.d(size));
        int n;
        int n2;
        if (a.a(this.a) ^ this.c) {
            n = a.a();
            n2 = this.a.a();
        }
        else {
            n = a.b();
            n2 = this.a.b();
        }
        final Size a2 = a.a(n2 / n);
        Size size2;
        if (!this.i.c() && !this.i.b(a2)) {
            size2 = a2.c(this.i);
        }
        else {
            size2 = a2;
        }
        if (this.j > 0) {
            final int n3 = size2.a() * size2.b();
            if (n3 > this.j) {
                size2 = size2.a((float)Math.sqrt(this.j / n3));
            }
        }
        if (a2 != size2) {
            n2 = n * size2.a() / a.a();
        }
        return new g(n, n2);
    }
    
    public Size a() {
        return this.a;
    }
    
    public f a(final int j) {
        this.j = j;
        return this;
    }
    
    public f a(final RectF h) {
        this.h = h;
        return this;
    }
    
    public f a(final Size a) {
        this.a = a;
        return this;
    }
    
    public f a(final ImageOrientation b) {
        this.b = b;
        return this;
    }
    
    public f a(final boolean c) {
        this.c = c;
        return this;
    }
    
    public RectF b() {
        return this.h;
    }
    
    public f b(final Size i) {
        this.i = i;
        return this;
    }
    
    public f b(final boolean d) {
        this.d = d;
        return this;
    }
    
    public Rect c(final Size size) {
        Rect rect;
        if (this.h == null || this.h.isEmpty()) {
            rect = size.f();
        }
        else {
            rect = com.twitter.util.j.a(com.twitter.util.j.a(this.b.b().a(this.h, 0.5f, 0.5f), size));
        }
        if (this.d) {
            rect = a(rect, this.d());
        }
        return rect;
    }
    
    public f c(final boolean e) {
        this.e = e;
        return this;
    }
    
    public boolean c() {
        return !this.a.c();
    }
    
    public Size d(Size size) {
        if (this.h != null && !this.h.isEmpty()) {
            if (this.b.degrees % 180 == 0) {
                size = size.b(this.h.width(), this.h.height());
            }
            else {
                size = size.b(this.h.height(), this.h.width());
            }
        }
        if (this.d) {
            size = size.b(this.d());
        }
        return size;
    }
    
    public f d(final boolean f) {
        this.f = f;
        return this;
    }
    
    public int e(final Size size) {
        int n = 1;
        if (this.c()) {
            final g i = this.i(size);
            int b = i.b;
            if (!this.e) {
                b *= 2;
            }
            int n2;
            for (int j = i.a; j >= b; j /= 2, n = n2) {
                n2 = n * 2;
            }
        }
        return n;
    }
    
    public f e(final boolean g) {
        this.g = g;
        return this;
    }
    
    public float f(final Size size) {
        float n;
        if (!this.c()) {
            n = 1.0f;
        }
        else {
            final g i = this.i(size);
            n = i.b / i.a;
            if (!this.g) {
                return Math.min(n, 1.0f);
            }
        }
        return n;
    }
    
    public Matrix g(final Size size) {
        final Matrix a = this.b.a();
        if (this.f) {
            final float f = this.f(size);
            if (f != 1.0f) {
                a.postScale(f, f);
            }
        }
        return a;
    }
    
    public Size h(final Size size) {
        final Size d = this.d(size);
        final int e = this.e(size);
        int a = d.a();
        int b = d.b();
        for (int n = 1; n < e && n <= 8; n *= 2) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        final int n2 = e * a / d.a();
        final Size a2 = Size.a(a / n2, b / n2);
        return Size.a(com.twitter.util.j.a(a2.f(), this.g(a2)));
    }
}
