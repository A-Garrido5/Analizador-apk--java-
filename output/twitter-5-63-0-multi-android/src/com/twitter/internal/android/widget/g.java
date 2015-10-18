// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View$MeasureSpec;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.ViewConfiguration;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import java.util.Set;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.os.SystemClock;

class g implements Runnable
{
    final /* synthetic */ DockLayout a;
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private int h;
    
    private g(final DockLayout a) {
        this.a = a;
        this.b = -1;
    }
    
    public void a() {
        if (this.b == -1) {
            this.b = 0;
        }
    }
    
    public void a(final int n, final boolean b, final boolean b2) {
        if (this.b == 0) {
            this.c = n;
            this.d = SystemClock.elapsedRealtime();
            if (this.a.k != null) {
                this.e = this.a.G;
                if (b) {
                    this.f = -this.a.G;
                }
                else {
                    this.f = 10000 - this.a.G;
                }
            }
            if (this.a.l != null) {
                this.g = this.a.J;
                if (b2) {
                    this.h = -this.a.J;
                }
                else {
                    this.h = 10000 - this.a.J;
                }
            }
            this.b = 1;
            this.a.post((Runnable)this);
        }
    }
    
    public void b() {
        if (this.b == 0 || this.b == -1) {
            return;
        }
        this.b = 2;
    }
    
    @Override
    public void run() {
        boolean bottomDocked = true;
        final long n = SystemClock.elapsedRealtime() - this.d;
        final boolean b = n > this.c && bottomDocked;
        float n2;
        if (b) {
            n2 = 1.0f;
        }
        else {
            n2 = n / this.c;
        }
        this.a.G = this.e + (int)(n2 * this.f);
        this.a.J = this.g + (int)(n2 * this.h);
        if (b || this.b == 2) {
            if (!this.a.z) {
                this.a.setTopDocked(this.a.G == 0 && bottomDocked);
            }
            if (!this.a.A) {
                final DockLayout a = this.a;
                if (this.a.J != 0) {
                    bottomDocked = false;
                }
                a.setBottomDocked(bottomDocked);
            }
            this.b = 0;
        }
        else {
            this.a.post((Runnable)this);
        }
        this.a.e();
        this.a.invalidate();
    }
}
