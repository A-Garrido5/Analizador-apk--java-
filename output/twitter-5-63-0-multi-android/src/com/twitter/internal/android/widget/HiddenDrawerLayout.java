// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.ViewCompat;
import android.view.View$MeasureSpec;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.support.v4.widget.ViewDragHelper$Callback;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewGroup;

public class HiddenDrawerLayout extends ViewGroup
{
    private View A;
    private int B;
    final int a;
    final boolean b;
    View c;
    View d;
    l e;
    float f;
    boolean g;
    final ViewDragHelper h;
    int i;
    boolean j;
    boolean k;
    private final int l;
    private final int m;
    private final Rect n;
    private final Paint o;
    private final int p;
    private final int q;
    private final Rect r;
    private final int s;
    private final boolean t;
    private m u;
    private boolean v;
    private float w;
    private float x;
    private int y;
    private boolean z;
    
    public HiddenDrawerLayout(final Context context) {
        this(context, null, kv.hiddenDrawerStyle);
    }
    
    public HiddenDrawerLayout(final Context context, final AttributeSet set) {
        this(context, set, kv.hiddenDrawerStyle);
    }
    
    public HiddenDrawerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = new Rect();
        this.o = new Paint();
        this.r = new Rect();
        this.i = 4;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.HiddenDrawerLayout, n, 0);
        this.l = obtainStyledAttributes.getInt(li.HiddenDrawerLayout_openAnimDuration, 250);
        this.m = obtainStyledAttributes.getInt(li.HiddenDrawerLayout_openAnimDuration, 250);
        final int resourceId = obtainStyledAttributes.getResourceId(li.HiddenDrawerLayout_openInterpolator, 0);
        final int resourceId2 = obtainStyledAttributes.getResourceId(li.HiddenDrawerLayout_closeInterpolator, 0);
        Interpolator loadInterpolator;
        if (resourceId != 0) {
            loadInterpolator = AnimationUtils.loadInterpolator(context, resourceId);
        }
        else {
            loadInterpolator = null;
        }
        Interpolator loadInterpolator2;
        if (resourceId2 != 0) {
            loadInterpolator2 = AnimationUtils.loadInterpolator(context, resourceId2);
        }
        else {
            loadInterpolator2 = null;
        }
        this.u = new m(this, context, loadInterpolator, loadInterpolator2);
        this.q = obtainStyledAttributes.getDimensionPixelSize(li.HiddenDrawerLayout_gutterSize, 0);
        this.p = obtainStyledAttributes.getColor(li.HiddenDrawerLayout_gutterColor, -1711276033);
        this.B = obtainStyledAttributes.getColor(li.HiddenDrawerLayout_bgColorHint, 0);
        this.a = obtainStyledAttributes.getInt(li.HiddenDrawerLayout_drawerDirection, 2);
        this.b = (this.a == 1 || this.a == 0);
        this.t = obtainStyledAttributes.getBoolean(li.HiddenDrawerLayout_draggable, false);
        if (this.t) {
            this.s = obtainStyledAttributes.getInt(li.HiddenDrawerLayout_draggableEdgeSize, 3 * ViewConfiguration.get(context).getScaledEdgeSlop());
        }
        else {
            this.s = 0;
        }
        final float density = context.getResources().getDisplayMetrics().density;
        this.y = ViewConfiguration.get(context).getScaledTouchSlop();
        (this.h = ViewDragHelper.create(this, 0.5f, new k(this, null))).setMinVelocity(density * 400.0f);
        obtainStyledAttributes.recycle();
    }
    
    private void a(final int n) {
        if (this.i == 3 || this.i == 5) {
            this.i = 2;
            this.u.b(n);
            if (this.e != null) {
                this.e.c();
            }
        }
    }
    
    private void a(final View view, final int n, final int n2) {
        if (view.getVisibility() == 8) {
            return;
        }
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)view.getLayoutParams();
        view.measure(View$MeasureSpec.makeMeasureSpec(n - rectLayoutParams.leftMargin - rectLayoutParams.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - rectLayoutParams.topMargin - rectLayoutParams.bottomMargin, 1073741824));
    }
    
    private boolean a(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.a(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return true;
                }
            }
        }
        Label_0141: {
            break Label_0141;
        }
        if (!b || !ViewCompat.canScrollHorizontally(view, -n)) {
            return false;
        }
        return true;
    }
    
    void a() {
        this.a(this.d, 0);
        this.b(this.d, 0);
    }
    
    void a(final View view, final int n) {
        if (view.getVisibility() == 8) {
            return;
        }
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)view.getLayoutParams();
        rectLayoutParams.b = n + rectLayoutParams.topMargin;
        rectLayoutParams.d = rectLayoutParams.b + view.getMeasuredHeight();
    }
    
    void b() {
        if (this.z) {
            return;
        }
        final View c = this.c;
        final int measuredWidth = c.getMeasuredWidth();
        int n;
        if (this.a == 3) {
            n = this.getMeasuredWidth() - measuredWidth;
        }
        else {
            n = 0;
        }
        c.offsetLeftAndRight(measuredWidth + n);
        this.b(c, n);
        this.z = true;
        this.invalidate();
    }
    
    void b(final View view, final int n) {
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)view.getLayoutParams();
        rectLayoutParams.a = n + rectLayoutParams.leftMargin;
        rectLayoutParams.c = rectLayoutParams.a + view.getMeasuredWidth();
    }
    
    void c() {
        if (!this.z) {
            return;
        }
        final View c = this.c;
        final int n = -c.getMeasuredWidth();
        c.offsetLeftAndRight(n);
        this.b(c, n);
        this.z = false;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof RectLayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (this.h.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }
    
    public void d() {
        this.a(this.m);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (view.equals(this.d)) {
            final Rect r = this.r;
            if (this.b) {
                if (this.a == 0) {
                    r.set(0, view.getTop(), this.getWidth(), this.getHeight());
                }
                else {
                    r.set(0, 0, this.getWidth(), view.getBottom());
                }
            }
            else if (this.a == 2) {
                r.set(view.getLeft(), 0, this.getWidth(), this.getHeight());
            }
            else {
                r.set(0, 0, view.getRight(), this.getHeight());
            }
            if ((this.B != 0 && (this.i == 2 || this.i == 1)) || this.i == 5) {
                this.o.setColor(this.B);
                canvas.drawRect(r, this.o);
            }
            final boolean drawChild = super.drawChild(canvas, view, n);
            if (this.f > 0.0f) {
                this.o.setColor((int)(((0xFF000000 & this.p) >>> 24) * this.f) << 24 | (0xFFFFFF & this.p));
                canvas.drawRect(r, this.o);
            }
            return drawChild;
        }
        return super.drawChild(canvas, view, n);
    }
    
    void e() {
        if (this.b) {
            this.f = Math.abs(this.d.getTop() / this.getHeight());
            return;
        }
        this.f = Math.abs(this.d.getLeft() / this.getWidth());
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
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        final int childCount = this.getChildCount();
        if (childCount < 2) {
            throw new IllegalStateException("HiddenDrawerLayout must contain at least two views.");
        }
        this.c = this.getChildAt(0);
        this.d = this.getChildAt(childCount - 1);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        switch (0xFF & motionEvent.getAction()) {
            case 0: {
                final int n = (int)motionEvent.getX();
                final int n2 = (int)motionEvent.getY();
                final Rect n3 = this.n;
                final int i = this.i;
                this.d.getHitRect(n3);
                final boolean contains = n3.contains(n, n2);
                n3.right = n3.left + this.s;
                final boolean contains2 = n3.contains(n, n2);
                if (this.t) {
                    boolean contains3;
                    if (this.A != null) {
                        this.A.getHitRect(n3);
                        contains3 = n3.contains(n, n2);
                    }
                    else {
                        contains3 = false;
                    }
                    this.k = ((contains2 && this.g) || contains3);
                    this.j = (contains && (i == 3 || i == 1));
                }
                boolean b = false;
                Label_0231: {
                    if (i != 3) {
                        b = false;
                        if (i != 1) {
                            break Label_0231;
                        }
                    }
                    b = false;
                    if (contains) {
                        this.v = true;
                        b = true;
                    }
                }
                this.w = n;
                this.x = n2;
                return b;
            }
            case 2: {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final float n4 = x - this.w;
                final float n5 = y - this.x;
                if (Math.abs(n4) < this.y || 0.5f * Math.abs(n4) <= Math.abs(n5)) {
                    break;
                }
                final boolean b2 = (this.k && n4 > 0.0f && !this.a((View)this, false, (int)n4, (int)x, (int)y)) || (this.j && n4 < 0.0f);
                if (b2) {
                    motionEvent.setAction(0);
                    this.h.processTouchEvent(motionEvent);
                    this.v = false;
                    return b2;
                }
                return b2;
            }
            case 1:
            case 3: {
                this.w = 0.0f;
                this.x = 0.0f;
                this.v = false;
                this.j = false;
                return this.k = false;
            }
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final RectLayoutParams rectLayoutParams = (RectLayoutParams)child.getLayoutParams();
                child.layout(rectLayoutParams.a, rectLayoutParams.b, rectLayoutParams.c, rectLayoutParams.d);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        this.setMeasuredDimension(size, size2);
        final View c = this.c;
        int n3;
        if (this.b) {
            n3 = size2 - this.q;
            this.a(c, size, n3);
        }
        else {
            n3 = size - this.q;
            this.a(c, n3, size2);
        }
        if (this.a == 1) {
            this.a(c, size2 - n3);
        }
        else {
            this.a(c, 0);
        }
        this.u.a(n3);
        final View d = this.d;
        this.a(d, size, size2);
        switch (this.i) {
            default: {}
            case 3: {
                if (this.b) {
                    if (this.a == 0) {
                        this.a(d, n3);
                    }
                    else {
                        this.a(d, -n3);
                    }
                    this.b(d, 0);
                }
                else {
                    if (this.a == 2) {
                        this.b(d, n3);
                    }
                    else {
                        this.b(d, -n3);
                    }
                    this.a(d, 0);
                }
                if (this.a == 3) {
                    this.b(c, size - n3);
                    return;
                }
                this.b(c, 0);
            }
            case 4: {
                this.a();
                this.b(c, -c.getMeasuredWidth());
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int n = 0xFF & motionEvent.getAction();
        this.h.processTouchEvent(motionEvent);
        switch (n) {
            case 2: {
                final float abs = Math.abs(this.w - motionEvent.getX());
                final float abs2 = Math.abs(this.x - motionEvent.getY());
                final float n2 = abs * abs + abs2 * abs2;
                if ((this.j || this.k) && n2 > this.y * this.y) {
                    this.v = false;
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                if (this.v) {
                    this.d();
                }
                this.j = false;
                this.k = false;
                this.w = 0.0f;
                this.x = 0.0f;
                break;
            }
        }
        return true;
    }
    
    public void setDragHandle(final View a) {
        this.A = a;
    }
    
    public void setDrawerListener(final l e) {
        this.e = e;
    }
    
    public void setDrawerOpenable(final boolean g) {
        this.g = g;
    }
}
