// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.view.MotionEvent;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.ViewGroup;

public class CarouselView extends ViewGroup implements m
{
    private b a;
    private a b;
    private f c;
    private l d;
    private h e;
    private final DataSetObserver f;
    
    public CarouselView(final Context context) {
        this(context, null);
    }
    
    public CarouselView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CarouselView(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, new n(), new h());
    }
    
    CarouselView(final Context context, final AttributeSet set, final int n, final n n2, final h h) {
        super(context, set, n);
        this.f = new i(this);
        this.a(context, n2, h);
    }
    
    private void a(final Context context, final n n, final h e) {
        this.e = e;
        this.d = n.a((View)this, ViewConfiguration.get(context), this);
        this.setWillNotDraw(ViewCompat.getOverScrollMode((View)this) == 2);
    }
    
    public j a(final int n) {
        if (this.c != null) {
            return this.c.a(n);
        }
        return null;
    }
    
    void a() {
        if (this.c != null) {
            this.c.b();
        }
        this.invalidate();
        this.requestLayout();
    }
    
    public void a(final int n, final int n2) {
        if (n == 0 && this.a != null) {
            this.a.a(this, this.c, 0, 0);
        }
    }
    
    void b() {
        this.invalidate();
        this.requestLayout();
    }
    
    public void b(final int n, final int n2) {
        if (this.a != null) {
            this.a.a(this, this.c, n, n2);
        }
    }
    
    public void c(final int n, final int n2) {
        int a;
        if (this.b != null && n != 0) {
            a = this.a.a(this, this.c, n);
        }
        else {
            a = 0;
        }
        if (a != 0) {
            this.onScrollChanged(0, 0, 0, 0);
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.d.a(motionEvent);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.a != null && this.c != null) {
            this.a.a(this, this.c);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.d.b(motionEvent);
    }
    
    public void setAdapter(final a b) {
        if (this.b != null) {
            this.b.b(this.f);
        }
        this.b = b;
        f a;
        if (this.b != null) {
            a = this.e.a(this.b);
        }
        else {
            a = null;
        }
        this.c = a;
        if (this.b != null) {
            this.b.a(this.f);
        }
    }
    
    public void setLayoutManager(final b a) {
        this.a = a;
    }
}
