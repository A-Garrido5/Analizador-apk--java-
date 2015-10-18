// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.View;

public class l
{
    private m a;
    private View b;
    private int c;
    private VelocityTracker d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    
    public l(final View b, final ViewConfiguration viewConfiguration, final m a) {
        this.b = b;
        this.a = a;
        this.j = viewConfiguration.getScaledTouchSlop();
        this.l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
    }
    
    private ViewParent a() {
        return this.b.getParent();
    }
    
    private void a(final int i) {
        if (i != this.i) {
            final int j = this.i;
            this.i = i;
            if (this.a != null) {
                this.a.a(this.i, j);
            }
        }
    }
    
    private void b() {
        if (this.d != null) {
            this.d.clear();
        }
        this.a(0);
    }
    
    private void c(final MotionEvent motionEvent) {
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.c) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.c = MotionEventCompat.getPointerId(motionEvent, n);
            final int n2 = (int)(0.5f + MotionEventCompat.getX(motionEvent, n));
            this.g = n2;
            this.e = n2;
            final int n3 = (int)(0.5f + MotionEventCompat.getY(motionEvent, n));
            this.h = n3;
            this.f = n3;
        }
    }
    
    public boolean a(int n, int n2) {
        if (Math.abs(n) < this.l) {
            n = 0;
        }
        if (Math.abs(n2) < this.l) {
            n2 = 0;
        }
        final int max = Math.max(-this.k, Math.min(n, this.k));
        final int max2 = Math.max(-this.k, Math.min(n2, this.k));
        if (max == 0) {
            final boolean b = false;
            if (max2 == 0) {
                return b;
            }
        }
        if (this.a != null) {
            this.a.b(max, max2);
        }
        return true;
    }
    
    public boolean a(final MotionEvent motionEvent) {
        int n = 1;
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        switch (actionMasked) {
            case 0: {
                this.c = MotionEventCompat.getPointerId(motionEvent, 0);
                final int n2 = (int)(0.5f + motionEvent.getX());
                this.g = n2;
                this.e = n2;
                final int n3 = (int)(0.5f + motionEvent.getY());
                this.h = n3;
                this.f = n3;
                if (this.i == 2) {
                    this.b.getParent().requestDisallowInterceptTouchEvent((boolean)(n != 0));
                    this.a(n);
                    break;
                }
                break;
            }
            case 5: {
                this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                final int n4 = (int)(0.5f + MotionEventCompat.getX(motionEvent, actionIndex));
                this.g = n4;
                this.e = n4;
                final int n5 = (int)(0.5f + MotionEventCompat.getY(motionEvent, actionIndex));
                this.h = n5;
                this.f = n5;
                break;
            }
            case 2: {
                final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.c);
                final int n6 = 0;
                if (pointerIndex < 0) {
                    return n6 != 0;
                }
                final int n7 = (int)(0.5f + MotionEventCompat.getX(motionEvent, pointerIndex));
                final int n8 = (int)(0.5f + MotionEventCompat.getY(motionEvent, pointerIndex));
                if (this.i == n) {
                    break;
                }
                final int n9 = n7 - this.e;
                final int n10 = n8 - this.f;
                int n12;
                if (Math.abs(n9) > this.j) {
                    final int e = this.e;
                    final int j = this.j;
                    int n11;
                    if (n9 < 0) {
                        n11 = -1;
                    }
                    else {
                        n11 = n;
                    }
                    this.g = e + n11 * j;
                    n12 = n;
                }
                else {
                    n12 = 0;
                }
                if (n12 != 0) {
                    this.a().requestDisallowInterceptTouchEvent((boolean)(n != 0));
                    this.a(n);
                    break;
                }
                break;
            }
            case 6: {
                this.c(motionEvent);
                break;
            }
            case 1: {
                this.d.clear();
                break;
            }
            case 3: {
                this.b();
                break;
            }
        }
        if (this.i != n) {
            n = 0;
        }
        final int n6 = n;
        return n6 != 0;
    }
    
    void b(final int n, final int n2) {
        if (this.a != null) {
            this.a.c(n, n2);
        }
    }
    
    public boolean b(final MotionEvent motionEvent) {
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        this.d.addMovement(motionEvent);
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        switch (actionMasked) {
            default: {
                return true;
            }
            case 0: {
                this.c = MotionEventCompat.getPointerId(motionEvent, 0);
                final int n = (int)(0.5f + motionEvent.getX());
                this.g = n;
                this.e = n;
                final int n2 = (int)(0.5f + motionEvent.getY());
                this.h = n2;
                this.f = n2;
                return true;
            }
            case 5: {
                this.c = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                final int n3 = (int)(0.5f + MotionEventCompat.getX(motionEvent, actionIndex));
                this.g = n3;
                this.e = n3;
                final int n4 = (int)(0.5f + MotionEventCompat.getY(motionEvent, actionIndex));
                this.h = n4;
                this.f = n4;
                return true;
            }
            case 2: {
                final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.c);
                if (pointerIndex < 0) {
                    return false;
                }
                final int g = (int)(0.5f + MotionEventCompat.getX(motionEvent, pointerIndex));
                final int h = (int)(0.5f + MotionEventCompat.getY(motionEvent, pointerIndex));
                if (this.i != 1) {
                    final int n5 = g - this.e;
                    final int n6 = h - this.f;
                    int n8;
                    if (Math.abs(n5) > this.j) {
                        final int e = this.e;
                        final int j = this.j;
                        int n7;
                        if (n5 < 0) {
                            n7 = -1;
                        }
                        else {
                            n7 = 1;
                        }
                        this.g = e + n7 * j;
                        n8 = 1;
                    }
                    else {
                        n8 = 0;
                    }
                    if (n8 != 0) {
                        this.a().requestDisallowInterceptTouchEvent(true);
                        this.a(1);
                    }
                }
                if (this.i == 1) {
                    final int n9 = g - this.g;
                    final int n10 = h - this.h;
                    this.b(-n9, 0);
                }
                this.g = g;
                this.h = h;
                return true;
            }
            case 6: {
                this.c(motionEvent);
                return true;
            }
            case 1: {
                this.d.computeCurrentVelocity(1000, (float)this.k);
                final float n11 = -VelocityTrackerCompat.getXVelocity(this.d, this.c);
                if ((n11 == 0.0f && 0.0f == 0.0f) || !this.a((int)n11, (int)0.0f)) {
                    this.a(0);
                }
                else {
                    this.a(2);
                }
                this.d.clear();
                return true;
            }
            case 3: {
                this.b();
                return true;
            }
        }
    }
}
