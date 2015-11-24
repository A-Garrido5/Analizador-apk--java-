// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.util.Iterator;
import android.os.SystemClock;
import android.graphics.Color;
import java.util.ArrayList;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import java.util.List;
import android.graphics.drawable.Drawable;

public class u extends Drawable
{
    final List a;
    private int b;
    private long c;
    private int d;
    private ColorFilter e;
    private float f;
    private int g;
    private int h;
    private float i;
    private final Paint j;
    private final int k;
    private final int l;
    
    public u() {
        this.a = new ArrayList();
        this.d = 255;
        this.f = 0.0f;
        this.g = 0;
        this.h = 0;
        this.i = 0.0f;
        this.j = new Paint(1);
        this.k = -1;
        this.l = Color.argb(255, 187, 187, 187);
        this.a(1);
    }
    
    private int a(final int n, final int n2, final float n3) {
        return (int)(0.5 * n3 + 0.5 * (0.66 * (1.0 + Math.sin((SystemClock.elapsedRealtime() - this.c - 17.0 * (20.0 * n)) * 0.0031415926535897933)) * (n2 - n3)));
    }
    
    private float b(final int n) {
        return (n - this.c(n)) / 3.0f;
    }
    
    private float c(final int n) {
        return 0.65f * (n / 4);
    }
    
    public void a(final int b) {
        if (b == this.b) {
            return;
        }
        this.b = b;
        if (this.b == 1) {
            this.c = SystemClock.elapsedRealtime();
        }
        if (this.b == 2) {
            for (final v v : this.a) {
                v.a();
                v.b();
            }
        }
        else {
            final Iterator<v> iterator2 = this.a.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().a();
            }
        }
        this.invalidateSelf();
    }
    
    public void draw(final Canvas canvas) {
        this.j.setAlpha(this.d);
        this.j.setColorFilter(this.e);
        if (this.b == 1) {
            this.j.setColor(this.l);
            for (final v v : this.a) {
                v.b = this.a(v.c, this.h, this.i);
            }
        }
        else {
            this.j.setColor(-1);
        }
        canvas.save();
        canvas.translate(0.5f * this.i, this.h - 0.5f * this.i);
        final Iterator<v> iterator2 = this.a.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().a(canvas, this.j);
            canvas.translate(this.f, 0.0f);
        }
        canvas.restore();
        if (this.b != 0) {
            this.invalidateSelf();
        }
    }
    
    public int getOpacity() {
        return this.d;
    }
    
    public void setAlpha(final int d) {
        this.d = d;
    }
    
    public void setBounds(final int n, final int n2, final int n3, final int n4) {
        int i = 0;
        int n5;
        if (this.getBounds() == null || n3 - n != this.getBounds().width() || n4 - n2 != this.getBounds().height()) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        super.setBounds(n, n2, n3, n4);
        if (n5 != 0) {
            this.g = this.getBounds().width();
            this.h = this.getBounds().height();
            this.f = this.b(this.g);
            this.i = this.c(this.g);
            this.j.setStyle(Paint$Style.STROKE);
            this.j.setStrokeWidth(this.i);
            this.j.setStrokeCap(Paint$Cap.ROUND);
            this.j.setStrokeJoin(Paint$Join.ROUND);
            this.j.setColor(-1);
            this.a.clear();
            while (i < 4) {
                final v v = new v(this.h, this.i);
                v.c = i;
                this.a.add(v);
                ++i;
            }
        }
    }
    
    public void setColorFilter(final ColorFilter e) {
        this.e = e;
    }
}
