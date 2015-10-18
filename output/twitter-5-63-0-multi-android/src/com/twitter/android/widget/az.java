// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.content.Context;
import android.graphics.PointF;
import android.view.View$OnTouchListener;

public class az extends be implements View$OnTouchListener
{
    private final PointF a;
    private final PointF b;
    private final PointF c;
    private float d;
    private ba e;
    private boolean f;
    
    public az(final Context context, final ap ap) {
        super(context, ap);
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
        this.f = false;
        this.j();
    }
    
    private float a(final PointF pointF, final Rect rect) {
        final AnimatableParams a = this.a();
        int n;
        if (pointF.x > rect.left + rect.width() / 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return 1 + (rect.right + a.width);
        }
        return -1 + (rect.left - a.width);
    }
    
    private boolean a(final PointF pointF, final MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX() - pointF.x) > this.d || Math.abs(motionEvent.getY() - pointF.y) > this.d;
    }
    
    private float b(final PointF pointF, final Rect rect) {
        final AnimatableParams a = this.a();
        int n;
        if (pointF.x > rect.left + rect.width() / 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            return 1 + (rect.right + a.width);
        }
        return -1 + (rect.left - a.width);
    }
    
    private void j() {
        this.d = ViewConfiguration.get(this.g()).getScaledTouchSlop();
        this.f().setOnTouchListener((View$OnTouchListener)this);
        this.f().setId(2131886111);
        this.e().setId(2131886110);
    }
    
    public void a(final int n, final Rect rect, final Runnable runnable) {
        this.a(this.a().a(), n, rect, runnable);
    }
    
    public void a(final PointF pointF, final int n, final Rect rect, final Runnable runnable) {
        final AnimatableParams a = this.a();
        float n2;
        if (n == 1) {
            n2 = this.a(pointF, rect);
        }
        else {
            n2 = this.b(pointF, rect);
        }
        a.o();
        a.a(new PointF(n2, pointF.y));
        a.d(pointF).a(runnable);
    }
    
    public void a(final PointF pointF, final Runnable runnable) {
        this.a().d(pointF).a(runnable);
    }
    
    protected void a(final View view) {
        this.e().removeAllViews();
        if (view != null) {
            this.e().addView(view);
        }
    }
    
    public void a(final ba e) {
        this.e = e;
    }
    
    public void b(final int n, final Rect rect, final Runnable runnable) {
        this.b(this.a().b(), n, rect, runnable);
    }
    
    public void b(final PointF pointF, final int n, final Rect rect, final Runnable runnable) {
        float n2;
        if (n == 0) {
            n2 = this.a(pointF, rect);
        }
        else {
            n2 = this.b(pointF, rect);
        }
        this.a().d(new PointF(n2, pointF.y)).a(runnable);
    }
    
    public Context d() {
        return this.g();
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        boolean f = true;
        switch (motionEvent.getAction()) {
            default: {
                f = false;
                break;
            }
            case 0: {
                this.b.set(motionEvent.getX(), motionEvent.getY());
                this.f = false;
                break;
            }
            case 2: {
                if (!this.f && this.a(this.b, motionEvent)) {
                    if (this.e != null) {
                        this.e.c(this);
                    }
                    this.c.x = motionEvent.getX() - this.a.x;
                    this.c.y = motionEvent.getY() - this.a.y;
                    this.f = f;
                    break;
                }
                if (this.f && this.e != null) {
                    final float n = motionEvent.getRawX() - this.a.x;
                    final float n2 = motionEvent.getRawY() - this.a.y;
                    this.c.set(0.0f, 0.0f);
                    final PointF b = this.a().b();
                    b.x += n + this.c.x;
                    b.y += n2 + this.c.y;
                    this.c.set(0.0f, 0.0f);
                    this.a().c(this.a().b());
                    this.h();
                    this.e.a(this, n, n2);
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                if (this.e != null) {
                    if (this.f) {
                        this.e.d(this);
                    }
                    else {
                        this.e.b(this);
                    }
                }
                this.f = false;
                break;
            }
        }
        this.a.x = motionEvent.getRawX();
        this.a.y = motionEvent.getRawY();
        return f;
    }
}
