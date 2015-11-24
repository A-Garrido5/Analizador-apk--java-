// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.Canvas;
import java.util.Iterator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;

public class CropImageView extends ImageViewTouchBase
{
    boolean n;
    g o;
    float p;
    ArrayList q;
    float r;
    int s;
    boolean t;
    
    public CropImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.q = new ArrayList();
        this.o = null;
        this.t = false;
    }
    
    private void a(final MotionEvent motionEvent) {
        final boolean h = ImageViewTouchBase.h;
        this.clearFocus();
        int n;
        for (int i = 0; i < this.q.size(); i = n) {
            final g g = this.q.get(i);
            if (g.a(motionEvent.getX(), motionEvent.getY()) != 1) {
                if (g.c()) {
                    break;
                }
                g.a(true);
                g.b();
                if (!h) {
                    break;
                }
            }
            n = i + 1;
            if (h) {
                break;
            }
        }
        this.invalidate();
    }
    
    static void a(final CropImageView cropImageView, final g g) {
        cropImageView.c(g);
    }
    
    private void b(final g g) {
        final Rect a = g.a;
        final float max = Math.max(1.0f, Math.min(0.6f * (this.getWidth() / a.width()), 0.6f * (this.getHeight() / a.height())) * this.e());
        if (Math.abs(max - this.e()) / max > 0.1) {
            final float[] array = { g.k.centerX(), g.k.centerY() };
            this.getImageMatrix().mapPoints(array);
            this.a(max, array[0], array[1], 300.0f, new s(this, g));
        }
    }
    
    private void c(final g g) {
        final Rect a = g.a;
        int max = Math.max(0, this.getLeft() - a.left);
        final int min = Math.min(0, this.getRight() - a.right);
        int max2 = Math.max(0, this.getTop() - a.top);
        final int min2 = Math.min(0, this.getBottom() - a.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 == 0) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            this.a(max, max2);
        }
    }
    
    @Override
    public void a() {
        this.q.clear();
        super.a();
    }
    
    @Override
    protected void a(final float n, final float n2, final float n3) {
        final boolean h = ImageViewTouchBase.h;
        super.a(n, n2, n3);
        for (final g g : this.q) {
            g.c.set(this.getImageMatrix());
            g.b();
            if (h) {
                break;
            }
        }
    }
    
    public void a(final g g) {
        this.q.add(g);
        this.invalidate();
    }
    
    @Override
    protected void b(final float n, final float n2) {
        final boolean h = ImageViewTouchBase.h;
        super.b(n, n2);
        int n3;
        for (int i = 0; i < this.q.size(); i = n3) {
            final g g = this.q.get(i);
            g.c.postTranslate(n, n2);
            g.b();
            n3 = i + 1;
            if (h) {
                break;
            }
        }
    }
    
    public void clearFocus() {
        final boolean h = ImageViewTouchBase.h;
        int n;
        for (int i = 0; i < this.q.size(); i = n) {
            final g g = this.q.get(i);
            g.a(false);
            g.b();
            n = i + 1;
            if (h) {
                break;
            }
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        final boolean h = ImageViewTouchBase.h;
        if (!this.t) {
            super.onDraw(canvas);
        }
        int n;
        for (int i = 0; i < this.q.size(); i = n) {
            ((g)this.q.get(i)).a(canvas);
            n = i + 1;
            if (h) {
                break;
            }
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean h = ImageViewTouchBase.h;
        super.onLayout(b, n, n2, n3, n4);
        if (this.k.f() != null) {
            for (final g g : this.q) {
                g.c.set(this.getImageMatrix());
                g.b();
                if (g.h) {
                    this.b(g);
                }
                if (h) {
                    break;
                }
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean h = ImageViewTouchBase.h;
        final CropImage cropImage = (CropImage)this.getContext();
        if (cropImage.g) {
            return false;
        }
        Label_0283: {
            switch (motionEvent.getAction()) {
                case 0: {
                    int n;
                    for (int i = 0; i < this.q.size(); i = n) {
                        final g o = this.q.get(i);
                        final int a = o.a(motionEvent.getX(), motionEvent.getY());
                        if (a != 1) {
                            this.s = a;
                            this.o = o;
                            this.p = motionEvent.getX();
                            this.r = motionEvent.getY();
                            final g o2 = this.o;
                            b b;
                            if (a == 32) {
                                b = com.whatsapp.wallpaper.b.Move;
                            }
                            else {
                                b = com.whatsapp.wallpaper.b.Grow;
                            }
                            o2.a(b);
                            this.a(motionEvent);
                            if (!h) {
                                break;
                            }
                        }
                        n = i + 1;
                        if (h) {
                            break;
                        }
                    }
                    if (h) {
                        break Label_0283;
                    }
                    break;
                }
                case 1: {
                    if (this.o != null) {
                        cropImage.t = this.o;
                        if (this.o.c()) {
                            this.o.a(false);
                            this.o.b();
                            this.invalidate();
                        }
                        this.b(this.o);
                        this.o.a(com.whatsapp.wallpaper.b.None);
                    }
                    this.o = null;
                    if (h) {
                        break Label_0283;
                    }
                    break;
                }
                case 2: {
                    if (this.o != null) {
                        this.o.a(this.s, motionEvent.getX() - this.p, motionEvent.getY() - this.r);
                        this.p = motionEvent.getX();
                        this.r = motionEvent.getY();
                        this.c(this.o);
                        break;
                    }
                    break;
                }
            }
        }
        Label_0364: {
            switch (motionEvent.getAction()) {
                case 1:
                case 3: {
                    this.a(true, true);
                    if (h) {
                        break Label_0364;
                    }
                    break;
                }
                case 2: {
                    if (this.e() == 1.0f) {
                        this.a(true, true);
                        break;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
