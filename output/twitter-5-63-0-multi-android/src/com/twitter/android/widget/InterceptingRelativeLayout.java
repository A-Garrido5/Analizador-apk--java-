// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class InterceptingRelativeLayout extends RelativeLayout
{
    private int a;
    private float b;
    private float c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private MotionEvent i;
    private cy j;
    private Runnable k;
    
    public InterceptingRelativeLayout(final Context context) {
        this(context, null);
    }
    
    public InterceptingRelativeLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public InterceptingRelativeLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.k = new cx(this);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = ViewConfiguration.getLongPressTimeout();
    }
    
    public boolean dispatchTouchEvent(final MotionEvent i) {
        if (i.getAction() == 0) {
            this.b = i.getRawX();
            this.c = i.getRawY();
            this.e = false;
            this.f = (this.j != null && this.j.a(i.getRawY()));
        }
        View w;
        if (this.f && this.j != null) {
            w = this.j.w();
        }
        else {
            w = null;
        }
        while (true) {
            Label_0392: {
                if (w == null) {
                    break Label_0392;
                }
                switch (i.getAction()) {
                    case 0: {
                        this.g = false;
                        this.i = i;
                        this.h = true;
                        this.postDelayed(this.k, (long)this.d);
                        break;
                    }
                    case 2: {
                        if (Math.abs(this.b - i.getRawX()) > this.a || Math.abs(this.c - i.getRawY()) > this.a) {
                            this.i = null;
                            this.h = false;
                            this.e = true;
                            this.removeCallbacks(this.k);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.h) {
                            this.h = false;
                            this.i = null;
                            this.removeCallbacks(this.k);
                        }
                        if (!this.e) {
                            final int action = i.getAction();
                            i.setAction(3);
                            w.dispatchTouchEvent(i);
                            i.setAction(action);
                            this.g = true;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        this.i = null;
                        this.h = false;
                        this.removeCallbacks(this.k);
                        break;
                    }
                }
                if (this.g) {
                    break Label_0392;
                }
                boolean b = w.dispatchTouchEvent(i);
                if (!this.e) {
                    b = super.dispatchTouchEvent(i);
                }
                else if (i.getAction() == 1 || i.getAction() == 3) {
                    i.setAction(3);
                    if (!super.dispatchTouchEvent(i)) {
                        final boolean b2 = false;
                        if (!b) {
                            return b2;
                        }
                    }
                    return true;
                }
                return b;
            }
            boolean b = false;
            continue;
        }
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.k);
        super.onDetachedFromWindow();
    }
    
    public void setInterceptHandler(final cy j) {
        if (j == null) {
            this.removeCallbacks(this.k);
        }
        this.j = j;
    }
}
