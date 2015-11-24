// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import com.whatsapp.DialogToastActivity;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.View;
import android.graphics.Matrix;
import android.graphics.Rect;

class g
{
    Rect a;
    private float b;
    Matrix c;
    private int d;
    View e;
    private final Paint f;
    private final Paint g;
    boolean h;
    private boolean i;
    private boolean j;
    RectF k;
    private b l;
    private RectF m;
    private final Paint n;
    
    public g(final View e) {
        this.l = com.whatsapp.wallpaper.b.None;
        this.j = false;
        this.i = false;
        this.n = new Paint();
        this.f = new Paint();
        this.g = new Paint();
        this.e = e;
    }
    
    private Rect a() {
        final RectF rectF = new RectF(this.k.left, this.k.top, this.k.right, this.k.bottom);
        this.c.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    
    private void d() {
    }
    
    public int a(final float n, final float n2) {
        final boolean h = ImageViewTouchBase.h;
        final Rect a = this.a();
        final float n3 = 20.0f * this.e.getResources().getDisplayMetrics().density;
        int n8 = 0;
        if (this.i) {
            final float n4 = n - a.centerX();
            final float n5 = n2 - a.centerY();
            final int n6 = (int)Math.sqrt(n4 * n4 + n5 * n5);
            final int n7 = this.a.width() / 2;
            Label_0171: {
                if (Math.abs(n6 - n7) <= n3) {
                    if (Math.abs(n5) > Math.abs(n4)) {
                        if (n5 < 0.0f) {
                            n8 = 8;
                            if (!h) {
                                break Label_0171;
                            }
                        }
                        n8 = 16;
                        if (!h) {
                            break Label_0171;
                        }
                    }
                    if (n4 < 0.0f) {
                        n8 = 2;
                        if (!h) {
                            break Label_0171;
                        }
                    }
                    n8 = 4;
                    if (!h) {
                        break Label_0171;
                    }
                }
                if (n6 >= n7 || h) {
                    n8 = 1;
                }
                else {
                    n8 = 32;
                }
            }
            if (!h) {
                return n8;
            }
        }
        else {
            n8 = 1;
        }
        boolean b;
        if (n2 >= a.top - n3 && n2 < n3 + a.bottom) {
            b = true;
        }
        else {
            b = false;
        }
        final float n9 = fcmpl(n, a.left - n3);
        boolean b2 = false;
        if (n9 >= 0) {
            final float n10 = fcmpg(n, n3 + a.right);
            b2 = false;
            if (n10 < 0) {
                b2 = true;
            }
        }
        if (Math.abs(a.left - n) < n3 && b) {
            n8 |= 0x2;
        }
        if (Math.abs(a.right - n) < n3 && b) {
            n8 |= 0x4;
        }
        if (Math.abs(a.top - n2) < n3 && b2) {
            n8 |= 0x8;
        }
        if (Math.abs(a.bottom - n2) < n3 && b2) {
            n8 |= 0x10;
        }
        if (n8 == 1 && a.contains((int)n, (int)n2)) {
            n8 = 32;
        }
        return n8;
    }
    
    void a(final int n, final float n2, final float n3) {
        final boolean h = ImageViewTouchBase.h;
        final Rect a = this.a();
        if (n != 1) {
            if (n == 32) {
                final RectF rectF = new RectF(a);
                rectF.offset(n2, n3);
                final Matrix matrix = new Matrix();
                if (this.c.invert(matrix)) {
                    matrix.mapRect(rectF);
                }
                this.b(rectF.left - this.k.left, rectF.top - this.k.top);
                if (!h) {
                    return;
                }
            }
            final float[] array = { n2, n3 };
            final Matrix matrix2 = new Matrix();
            if (this.c.invert(matrix2)) {
                matrix2.mapVectors(array);
            }
            final float n4 = array[0];
            final float n5 = array[1];
            int n6 = 0;
            Label_0277: {
                if ((n & 0x8) != 0x0) {
                    final float[] array2 = { 0.0f, 1.0f };
                    matrix2.mapVectors(array2);
                    if (array2[0] > 0.0f && array2[1] == 0.0f) {
                        n6 = 3;
                        if (!h) {
                            break Label_0277;
                        }
                    }
                    else {
                        n6 = 1;
                    }
                    if (array2[0] == 0.0f && array2[1] < 0.0f) {
                        n6 |= 0x10;
                        if (!h) {
                            break Label_0277;
                        }
                    }
                    if (array2[0] < 0.0f && array2[1] == 0.0f) {
                        n6 |= 0x4;
                        if (!h) {
                            break Label_0277;
                        }
                    }
                    n6 |= 0x8;
                }
                else {
                    n6 = 1;
                }
            }
            Label_0400: {
                if ((n & 0x10) != 0x0) {
                    final float[] array3 = { 0.0f, -1.0f };
                    matrix2.mapVectors(array3);
                    if (array3[0] > 0.0f && array3[1] == 0.0f) {
                        n6 |= 0x2;
                        if (!h) {
                            break Label_0400;
                        }
                    }
                    if (array3[0] == 0.0f && array3[1] > 0.0f) {
                        n6 |= 0x8;
                        if (!h) {
                            break Label_0400;
                        }
                    }
                    if (array3[0] < 0.0f && array3[1] == 0.0f) {
                        n6 |= 0x4;
                        if (!h) {
                            break Label_0400;
                        }
                    }
                    n6 |= 0x10;
                }
            }
            Label_0521: {
                if ((n & 0x4) != 0x0) {
                    final float[] array4 = { 1.0f, 0.0f };
                    matrix2.mapVectors(array4);
                    if (array4[0] == 0.0f && array4[1] < 0.0f) {
                        n6 |= 0x8;
                        if (!h) {
                            break Label_0521;
                        }
                    }
                    if (array4[0] < 0.0f && array4[1] == 0.0f) {
                        n6 |= 0x2;
                        if (!h) {
                            break Label_0521;
                        }
                    }
                    if (array4[0] == 0.0f && array4[1] > 0.0f) {
                        n6 |= 0x10;
                        if (!h) {
                            break Label_0521;
                        }
                    }
                    n6 |= 0x4;
                }
            }
            Label_0643: {
                if ((n & 0x2) != 0x0) {
                    final float[] array5 = { -1.0f, 0.0f };
                    matrix2.mapVectors(array5);
                    if (array5[0] == 0.0f && array5[1] < 0.0f) {
                        n6 |= 0x8;
                        if (!h) {
                            break Label_0643;
                        }
                    }
                    if (array5[0] > 0.0f && array5[1] == 0.0f) {
                        n6 |= 0x4;
                        if (!h) {
                            break Label_0643;
                        }
                    }
                    if (array5[0] == 0.0f && array5[1] > 0.0f) {
                        n6 |= 0x10;
                        if (!h) {
                            break Label_0643;
                        }
                    }
                    n6 |= 0x2;
                }
            }
            this.b(n6, n4, n5);
        }
    }
    
    protected void a(final Canvas canvas) {
        final boolean h = ImageViewTouchBase.h;
        final Path path = new Path();
        final float density = this.e.getResources().getDisplayMetrics().density;
        this.g.setStrokeWidth(0.5f + density);
        final Rect rect = new Rect();
        this.e.getDrawingRect(rect);
        Label_0711: {
            if (this.i) {
                final float n = this.a.width();
                path.addCircle(this.a.left + n / 2.0f, this.a.top + this.a.height() / 2.0f, n / 2.0f, Path$Direction.CW);
                this.g.setColor(-1112874);
                if (!h) {
                    break Label_0711;
                }
                DialogToastActivity.h = !DialogToastActivity.h;
            }
            path.addRect(new RectF(this.a), Path$Direction.CW);
            this.g.setColor(1728053247);
            final Rect rect2 = new Rect();
            rect2.set(rect);
            rect2.right = this.a.left;
            Paint paint;
            if (this.c()) {
                paint = this.n;
            }
            else {
                paint = this.f;
            }
            canvas.drawRect(rect2, paint);
            rect2.set(rect);
            rect2.right = this.a.right;
            rect2.left = this.a.left;
            rect2.bottom = this.a.top;
            Paint paint2;
            if (this.c()) {
                paint2 = this.n;
            }
            else {
                paint2 = this.f;
            }
            canvas.drawRect(rect2, paint2);
            rect2.set(rect);
            rect2.right = this.a.right;
            rect2.left = this.a.left;
            rect2.top = this.a.bottom;
            Paint paint3;
            if (this.c()) {
                paint3 = this.n;
            }
            else {
                paint3 = this.f;
            }
            canvas.drawRect(rect2, paint3);
            rect2.set(rect);
            rect2.left = this.a.right;
            Paint paint4;
            if (this.c()) {
                paint4 = this.n;
            }
            else {
                paint4 = this.f;
            }
            canvas.drawRect(rect2, paint4);
            final int round = Math.round(density);
            final int n2 = round + this.a.left;
            final int n3 = this.a.right - round;
            final int n4 = round + this.a.top;
            final int n5 = this.a.bottom - round;
            canvas.drawLine((float)n2, (float)(this.a.top + (this.a.bottom - this.a.top) / 3), (float)n3, (float)(this.a.top + (this.a.bottom - this.a.top) / 3), this.g);
            canvas.drawLine((float)n2, (float)(this.a.bottom - (this.a.bottom - this.a.top) / 3), (float)n3, (float)(this.a.bottom - (this.a.bottom - this.a.top) / 3), this.g);
            canvas.drawLine((float)(this.a.left + (this.a.right - this.a.left) / 3), (float)n4, (float)(this.a.left + (this.a.right - this.a.left) / 3), (float)n5, this.g);
            canvas.drawLine((float)(this.a.right - (this.a.right - this.a.left) / 3), (float)n4, (float)(this.a.right - (this.a.right - this.a.left) / 3), (float)n5, this.g);
        }
        canvas.drawPath(path, this.g);
        final int round2 = Math.round(2.0f * density);
        final int n6 = round2 + this.a.left;
        final int n7 = this.a.right - round2;
        final int n8 = round2 + this.a.top;
        final int n9 = this.a.bottom - round2;
        final int min = Math.min((int)(24.0f * density), this.a.width() / 4);
        final int min2 = Math.min((int)(24.0f * density), this.a.height() / 4);
        final int n10 = this.a.left + (this.a.right - this.a.left) / 2;
        final int n11 = this.a.top + (this.a.bottom - this.a.top) / 2;
        this.g.setStrokeWidth(2.0f * density);
        this.g.setColor(-1);
        this.g.setStrokeCap(Paint$Cap.SQUARE);
        canvas.drawLine((float)(n10 - min / 2), (float)n8, (float)(n10 + min / 2), (float)n8, this.g);
        canvas.drawLine((float)(n10 - min / 2), (float)n9, (float)(n10 + min / 2), (float)n9, this.g);
        canvas.drawLine((float)n6, (float)(n11 - min2 / 2), (float)n6, (float)(n11 + min2 / 2), this.g);
        canvas.drawLine((float)n7, (float)(n11 - min2 / 2), (float)n7, (float)(n11 + min2 / 2), this.g);
        canvas.drawLine((float)n6, (float)n8, (float)(n6 + min), (float)n8, this.g);
        canvas.drawLine((float)n6, (float)n8, (float)n6, (float)(n8 + min2), this.g);
        canvas.drawLine((float)n7, (float)n8, (float)(n7 - min), (float)n8, this.g);
        canvas.drawLine((float)n7, (float)n8, (float)n7, (float)(n8 + min2), this.g);
        canvas.drawLine((float)n7, (float)n9, (float)(n7 - min), (float)n9, this.g);
        canvas.drawLine((float)n7, (float)n9, (float)n7, (float)(n9 - min2), this.g);
        canvas.drawLine((float)n6, (float)n9, (float)(n6 + min), (float)n9, this.g);
        canvas.drawLine((float)n6, (float)n9, (float)n6, (float)(n9 - min2), this.g);
    }
    
    public void a(final Matrix matrix, final Rect rect, final RectF k, final boolean i, boolean b, final boolean b2, final int d) {
        boolean j = true;
        if (i) {
            b = j;
        }
        this.c = new Matrix(matrix);
        this.k = k;
        this.m = new RectF(rect);
        if (!b && !b2) {
            j = false;
        }
        this.j = j;
        this.i = i;
        this.d = d;
        this.b = this.k.width() / this.k.height();
        this.a = this.a();
        this.n.setARGB(125, 50, 50, 50);
        this.f.setARGB(125, 50, 50, 50);
        this.g.setStyle(Paint$Style.STROKE);
        this.g.setAntiAlias(false);
        this.l = b.None;
        this.d();
    }
    
    public void a(final b l) {
        if (l != this.l) {
            this.l = l;
            this.e.invalidate();
        }
    }
    
    public void a(final boolean h) {
        this.h = h;
    }
    
    public void b() {
        this.a = this.a();
    }
    
    void b(final float n, final float n2) {
        final Rect rect = new Rect(this.a);
        this.k.offset(n, n2);
        this.k.offset(Math.max(0.0f, this.m.left - this.k.left), Math.max(0.0f, this.m.top - this.k.top));
        this.k.offset(Math.min(0.0f, this.m.right - this.k.right), Math.min(0.0f, this.m.bottom - this.k.bottom));
        rect.union(this.a = this.a());
        rect.inset(-10, -10);
        this.e.invalidate(rect);
    }
    
    void b(final int n, final float n2, float n3) {
        final boolean h = ImageViewTouchBase.h;
        float n4;
        if ((n & 0x6) == 0x0) {
            n4 = 0.0f;
        }
        else {
            n4 = n2;
        }
        if ((n & 0x18) == 0x0) {
            n3 = 0.0f;
        }
        Label_0065: {
            if (this.j) {
                if (n4 != 0.0f) {
                    n3 = n4 / this.b;
                    if (!h) {
                        break Label_0065;
                    }
                }
                if (n3 != 0.0f) {
                    n4 = n3 * this.b;
                }
            }
        }
        final RectF rectF = new RectF(this.k);
        if (this.j && ((n & 0x12) == 0x12 || (n & 0xC) == 0xC)) {
            n3 = -n3;
        }
        if ((n & 0x2) != 0x0) {
            rectF.left += n4;
            if (this.j && (n & 0x10) == 0x0 && (n & 0x8) == 0x0) {
                rectF.top += n3 / 2.0f;
                rectF.bottom -= n3 - n3 / 2.0f;
            }
        }
        if ((n & 0x4) != 0x0) {
            rectF.right += n4;
            if (this.j && (n & 0x10) == 0x0 && (n & 0x8) == 0x0) {
                rectF.top -= n3 - n3 / 2.0f;
                rectF.bottom += n3 / 2.0f;
            }
        }
        if ((n & 0x8) != 0x0) {
            rectF.top += n3;
            if (this.j && (n & 0x2) == 0x0 && (n & 0x4) == 0x0) {
                rectF.left += n4 / 2.0f;
                rectF.right -= n4 - n4 / 2.0f;
            }
        }
        if ((n & 0x10) != 0x0) {
            rectF.bottom += n3;
            if (this.j && (n & 0x2) == 0x0 && (n & 0x4) == 0x0) {
                rectF.left -= n4 - n4 / 2.0f;
                rectF.right += n4 / 2.0f;
            }
        }
        float max = Math.max(25.0f, this.d);
        Label_0477: {
            if (rectF.width() < max) {
                if ((n & 0x2) != 0x0) {
                    rectF.left = rectF.right - max;
                    if (!h) {
                        break Label_0477;
                    }
                }
                if ((n & 0x4) != 0x0) {
                    rectF.right = max + rectF.left;
                    if (!h) {
                        break Label_0477;
                    }
                }
                rectF.inset(-(max - rectF.width()) / 2.0f, 0.0f);
            }
        }
        if (this.j) {
            max /= this.b;
        }
        Label_0571: {
            if (rectF.height() < max) {
                if ((n & 0x8) != 0x0) {
                    rectF.top = rectF.bottom - max;
                    if (!h) {
                        break Label_0571;
                    }
                }
                if ((n & 0x10) != 0x0) {
                    rectF.bottom = max + rectF.top;
                    if (!h) {
                        break Label_0571;
                    }
                }
                rectF.inset(0.0f, -(max - rectF.height()) / 2.0f);
            }
        }
        if (rectF.width() > this.m.width()) {
            rectF.right = rectF.left + this.m.width();
            if (this.j) {
                rectF.bottom = rectF.top + this.m.width() / this.b;
            }
        }
        if (rectF.height() > this.m.height()) {
            rectF.bottom = rectF.top + this.m.height();
            if (this.j) {
                rectF.right = rectF.left + this.m.height() * this.b;
            }
        }
        Label_0775: {
            if (rectF.left < this.m.left) {
                rectF.offset(this.m.left - rectF.left, 0.0f);
                if (!h) {
                    break Label_0775;
                }
            }
            if (rectF.right > this.m.right) {
                rectF.offset(-(rectF.right - this.m.right), 0.0f);
            }
        }
        Label_0851: {
            if (rectF.top < this.m.top) {
                rectF.offset(0.0f, this.m.top - rectF.top);
                if (!h) {
                    break Label_0851;
                }
            }
            if (rectF.bottom > this.m.bottom) {
                rectF.offset(0.0f, -(rectF.bottom - this.m.bottom));
            }
        }
        this.k.set(rectF);
        this.a = this.a();
        this.e.invalidate();
        if (DialogToastActivity.h) {
            ImageViewTouchBase.h = !h;
        }
    }
    
    public boolean c() {
        return this.h;
    }
    
    public Rect e() {
        return new Rect((int)this.k.left, (int)this.k.top, (int)this.k.right, (int)this.k.bottom);
    }
}
