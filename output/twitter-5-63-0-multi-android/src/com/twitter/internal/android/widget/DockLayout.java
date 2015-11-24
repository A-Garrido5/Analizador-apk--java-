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

public class DockLayout extends ViewGroup
{
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean L;
    private final int a;
    private final int b;
    private final g c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final Rect j;
    private View k;
    private View l;
    private Set m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private VelocityTracker s;
    private int t;
    private i u;
    private i v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    public DockLayout(final Context context) {
        this(context, null, kv.dockLayoutStyle);
    }
    
    public DockLayout(final Context context, final AttributeSet set) {
        this(context, set, kv.dockLayoutStyle);
    }
    
    public DockLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.j = new Rect();
        this.m = new HashSet();
        this.r = 0;
        this.t = -1;
        this.G = 10000;
        this.J = 10000;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.DockLayout, n, 0);
        this.a = obtainStyledAttributes.getResourceId(li.DockLayout_topDockId, 0);
        this.b = obtainStyledAttributes.getResourceId(li.DockLayout_bottomDockId, 0);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.f = value.getScaledTouchSlop();
        this.c = new g(this, null);
        this.d = value.getScaledMinimumFlingVelocity();
        this.e = value.getScaledMaximumFlingVelocity();
        this.g = obtainStyledAttributes.getDimensionPixelSize(li.DockLayout_topPeek, obtainStyledAttributes.getDimensionPixelSize(li.DockLayout_turtle, 0));
        this.h = obtainStyledAttributes.getDimensionPixelSize(li.DockLayout_bottomPeek, 0);
        this.i = obtainStyledAttributes.getInt(li.DockLayout_scrollDrive, 0);
        this.y = obtainStyledAttributes.getBoolean(li.DockLayout_autoUnlock, true);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(li.DockLayout_disableAccessibilityLockOverride, false);
        if (!this.isInEditMode()) {
            final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
            this.x = (!boolean1 && accessibilityManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(accessibilityManager));
            if (this.x) {
                this.q = true;
                this.z = true;
                this.A = true;
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    private boolean a(final int n, final int n2) {
        final View k = this.k;
        boolean b = false;
        if (k != null) {
            this.k.getHitRect(this.j);
            b = (false | this.j.contains(n, n2));
        }
        if (this.l != null) {
            this.l.getHitRect(this.j);
            b |= this.j.contains(n, n2);
        }
        return b;
    }
    
    private void e() {
        final View k = this.k;
        final View l = this.l;
        if (k != null) {
            final int n = this.F + this.G * this.H / 10000;
            final int n2 = n - k.getTop();
            if (n2 != 0) {
                k.offsetTopAndBottom(n2);
                this.a(k, k.getLeft(), n);
                this.g();
                if (this.G == 0) {
                    this.B = false;
                    this.C = true;
                }
                else if (this.G == 10000) {
                    this.B = false;
                    this.C = false;
                }
                else {
                    this.B = true;
                }
            }
        }
        if (l != null) {
            final int n3 = this.I - this.J * this.K / 10000;
            final int n4 = n3 - l.getTop();
            if (n4 != 0) {
                l.offsetTopAndBottom(n4);
                this.a(l, l.getLeft(), n3);
                this.h();
                if (this.J == 0) {
                    this.D = false;
                    this.E = true;
                }
                else {
                    if (this.J == 10000) {
                        this.D = false;
                        this.E = false;
                        return;
                    }
                    this.D = true;
                }
            }
        }
    }
    
    private void f() {
        boolean b = true;
        if (this.k == null && this.l == null) {
            return;
        }
        boolean b2;
        if (this.z) {
            b2 = false;
        }
        else if (this.k != null) {
            b2 = (this.G < 5000 && b);
        }
        else {
            b2 = b;
        }
        if (this.A) {
            b = false;
        }
        else if (this.l != null && this.J >= 5000) {
            b = false;
        }
        this.c.a(250, b2, b);
    }
    
    private void g() {
        if (this.k != null) {
            final Iterator<f> iterator = this.m.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this.k.getLeft(), this.k.getTop(), this.k.getRight(), this.k.getBottom());
            }
        }
    }
    
    private void h() {
        if (this.l != null) {
            final Iterator<f> iterator = this.m.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(this.l.getLeft(), this.l.getTop(), this.l.getRight(), this.l.getBottom());
            }
        }
    }
    
    protected RectLayoutParams a(final View view, final int n, final int n2) {
        if (view == null) {
            return null;
        }
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)view.getLayoutParams();
        rectLayoutParams.a(n, n2, n + view.getMeasuredWidth(), n2 + view.getMeasuredHeight());
        return rectLayoutParams;
    }
    
    public void a() {
        if (this.a != 0) {
            this.setTopDockView(this.findViewById(this.a));
        }
        if (this.b != 0) {
            this.setBottomDockView(this.findViewById(this.b));
        }
    }
    
    public void a(final int n) {
        if (this.k != null || this.l != null) {
            this.c.a(n, false, false);
        }
    }
    
    public void a(final f f) {
        this.m.add(f);
    }
    
    public void b() {
        this.a(250);
    }
    
    public void b(final int n) {
        boolean b = true;
        if (this.k != null || this.l != null) {
            final g c = this.c;
            final boolean b2 = !this.z && b;
            if (this.A) {
                b = false;
            }
            c.a(n, b2, b);
        }
    }
    
    public boolean b(final f f) {
        return this.m.remove(f);
    }
    
    public void c() {
        this.b(250);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof RectLayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public boolean d() {
        return this.y;
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final boolean onFilterTouchEventForSecurity = this.onFilterTouchEventForSecurity(motionEvent);
        boolean dispatchTouchEvent = false;
        if (onFilterTouchEventForSecurity) {
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            switch (0xFF & motionEvent.getAction()) {
                case 0: {
                    final int o = (int)motionEvent.getX();
                    final int n = (int)motionEvent.getY();
                    if (this.a(o, n)) {
                        this.w = true;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.o = o;
                    this.p = n;
                    this.n = n;
                    this.t = motionEvent.getPointerId(0);
                    break;
                }
                case 1:
                case 3: {
                    if (!this.w && (!this.q || this.y) && this.r != 1) {
                        this.s.computeCurrentVelocity(1000, (float)this.e);
                        final int n2 = (int)VelocityTrackerCompat.getYVelocity(this.s, this.t);
                        if (Math.abs(n2) > this.d) {
                            if (n2 < 0) {
                                this.b(100);
                            }
                            else {
                                this.a(100);
                            }
                        }
                        else {
                            this.f();
                        }
                    }
                    this.r = 0;
                    this.t = -1;
                    this.s.recycle();
                    this.s = null;
                    this.w = false;
                    break;
                }
                case 2: {
                    final View k = this.k;
                    final View l = this.l;
                    int pointerIndex = motionEvent.findPointerIndex(this.t);
                    if (pointerIndex == -1) {
                        this.t = motionEvent.getPointerId(0);
                        pointerIndex = 0;
                    }
                    final int n3 = (int)motionEvent.getY(pointerIndex);
                    final int n4 = (int)motionEvent.getX(pointerIndex);
                    if (this.w || this.q || (k == null && l == null) || this.r == 1) {
                        this.n = n3;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (this.r == 0) {
                        if (Math.abs(this.p - n3) > this.f) {
                            this.r = 2;
                        }
                        else if (Math.abs(this.o - n4) > this.f) {
                            this.r = 1;
                            this.n = n3;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    if (this.r == 2 && this.L) {
                        this.c.b();
                        int n6;
                        int n5;
                        if (this.i == 0) {
                            n5 = (n6 = 10000 * (this.n - n3) / this.H);
                        }
                        else if (this.i == 1) {
                            n5 = (n6 = 10000 * (this.n - n3) / this.K);
                        }
                        else {
                            n6 = 10000 * (this.n - n3) / this.H;
                            n5 = 10000 * (this.n - n3) / this.K;
                        }
                        if (n6 > 0) {
                            if (k != null && !this.z && this.G > 0) {
                                this.G = Math.max(0, this.G - n6);
                                if (this.G == 0) {
                                    this.setTopDocked(true);
                                }
                            }
                            if (l != null && !this.A && this.J > 0) {
                                this.J = Math.max(0, this.J - n5);
                                if (this.J == 0) {
                                    this.setBottomDocked(true);
                                }
                            }
                        }
                        else {
                            if (k != null) {
                                this.G = Math.min(10000, this.G - n6);
                                if (this.G == 10000) {
                                    this.setTopDocked(false);
                                }
                            }
                            if (l != null && !this.A && this.J < 10000) {
                                this.J = Math.min(10000, this.J - n5);
                                if (this.J == 10000) {
                                    this.setBottomDocked(false);
                                }
                            }
                        }
                    }
                    this.n = n3;
                    this.e();
                    this.invalidate();
                    break;
                }
                case 5: {
                    final int actionIndex = motionEvent.getActionIndex();
                    final int o2 = (int)motionEvent.getX(actionIndex);
                    final int n7 = (int)motionEvent.getY(actionIndex);
                    if (this.a(o2, n7)) {
                        this.w = true;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.o = o2;
                    this.p = n7;
                    this.n = n7;
                    this.t = motionEvent.getPointerId(actionIndex);
                    break;
                }
            }
            dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new RectLayoutParams(-1, -1);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new RectLayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new RectLayoutParams(viewGroup$LayoutParams);
    }
    
    public View getBottomDockView() {
        return this.l;
    }
    
    int getBottomPeek() {
        final int h = this.h;
        int measuredHeight;
        if (this.l == null) {
            measuredHeight = 0;
        }
        else {
            measuredHeight = this.l.getMeasuredHeight();
        }
        return Math.min(h, measuredHeight);
    }
    
    public View getTopDockView() {
        return this.k;
    }
    
    int getTopPeek() {
        final int g = this.g;
        int measuredHeight;
        if (this.k == null) {
            measuredHeight = 0;
        }
        else {
            measuredHeight = this.k.getMeasuredHeight();
        }
        return Math.min(g, measuredHeight);
    }
    
    protected void onFinishInflate() {
        if (this.getChildCount() < 2) {
            throw new IllegalStateException("DockLayout must contain at least two children");
        }
        this.a();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final RectLayoutParams rectLayoutParams = (RectLayoutParams)child.getLayoutParams();
            child.layout(rectLayoutParams.a, rectLayoutParams.b, rectLayoutParams.c, rectLayoutParams.d);
        }
        this.c.a();
        this.g();
        this.h();
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child != null && child.getVisibility() != 8) {
                this.measureChildWithMargins(child, n, 0, n2, 0);
                this.a(child, 0, 0);
            }
        }
        final View k = this.k;
        final View l = this.l;
        if (k != null) {
            this.F = this.getTopPeek() - k.getMeasuredHeight();
            this.H = k.getMeasuredHeight() - this.getTopPeek();
            this.a(k, 0, this.F + this.G * this.H / 10000);
        }
        else {
            this.H = 0;
        }
        if (l != null) {
            this.I = this.getMeasuredHeight() - this.getBottomPeek();
            this.K = l.getMeasuredHeight() - this.getBottomPeek();
            this.a(l, 0, this.I - this.J * this.K / 10000);
        }
        else {
            this.K = 0;
        }
        boolean m = false;
        Label_0227: {
            if (this.H == 0) {
                final int j = this.K;
                m = false;
                if (j == 0) {
                    break Label_0227;
                }
            }
            m = true;
        }
        this.L = m;
        if (this.L) {
            if (this.i == 0 && this.H == 0) {
                this.H = this.K;
            }
            else if (this.i == 1 && this.K == 0) {
                this.K = this.H;
            }
        }
    }
    
    public void setAutoUnlockEnabled(final boolean y) {
        this.y = y;
    }
    
    public void setBottomDockView(final View l) {
        this.l = l;
        i v;
        if (this.l instanceof i) {
            v = (i)l;
        }
        else {
            v = null;
        }
        this.v = v;
        this.requestLayout();
    }
    
    void setBottomDocked(final boolean docked) {
        if (!this.A && (this.D || docked != this.E)) {
            if (this.v != null) {
                this.v.setDocked(docked);
            }
            for (final f f : this.m) {
                if (docked) {
                    f.c();
                }
                else {
                    f.d();
                }
            }
        }
    }
    
    public void setBottomLocked(final boolean a) {
        if (!this.x && a != this.A) {
            this.A = a;
            this.f();
        }
    }
    
    public void setBottomVisible(final boolean b) {
        if (this.l != null) {
            final View l = this.l;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            l.setVisibility(visibility);
        }
    }
    
    public void setLocked(final boolean a) {
        if (!this.x && a != this.q) {
            this.q = a;
            this.z = a;
            this.A = a;
            this.f();
        }
    }
    
    public void setTopDockView(final View k) {
        this.k = k;
        i u;
        if (this.k instanceof i) {
            u = (i)k;
        }
        else {
            u = null;
        }
        this.u = u;
        this.requestLayout();
    }
    
    void setTopDocked(final boolean docked) {
        if (!this.z && (this.B || docked != this.C)) {
            if (this.u != null) {
                this.u.setDocked(docked);
            }
            for (final f f : this.m) {
                if (docked) {
                    f.as_();
                }
                else {
                    f.at_();
                }
            }
        }
    }
    
    public void setTopLocked(final boolean z) {
        if (!this.x && z != this.z) {
            this.z = z;
            this.f();
        }
    }
    
    public void setTopView(final View k) {
        this.k = k;
        if (this.k instanceof i) {
            this.u = (i)k;
        }
        else {
            this.u = null;
        }
        this.postInvalidate();
    }
    
    public void setTopVisible(final boolean b) {
        if (this.k != null) {
            final View k = this.k;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            k.setVisibility(visibility);
        }
    }
}
