// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Handler;
import android.graphics.drawable.TransitionDrawable;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListAdapter;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.AdapterView;

public final class HorizontalListView extends AdapterView implements i
{
    private int A;
    private int B;
    private r C;
    private t D;
    private int E;
    private DataSetObserver F;
    private int G;
    private int H;
    private Drawable I;
    private Rect J;
    private int K;
    private int L;
    private int M;
    private q N;
    private Drawable O;
    private int P;
    private Paint Q;
    private Runnable R;
    private u S;
    private boolean T;
    private int U;
    private VelocityTracker V;
    private boolean W;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    protected boolean b;
    protected ListAdapter c;
    protected int d;
    protected boolean e;
    protected int f;
    private final int g;
    private final v h;
    private final boolean[] i;
    private final int j;
    private final float k;
    private final int l;
    private final int m;
    private final int n;
    private final s o;
    private final Drawable p;
    private final Drawable q;
    private final Drawable r;
    private final Rect s;
    private final int t;
    private final int u;
    private w v;
    private w w;
    private w x;
    private int y;
    private int z;
    
    public HorizontalListView(final Context context) {
        this(context, null);
    }
    
    public HorizontalListView(final Context context, final AttributeSet set) {
        this(context, set, kv.horizontalListViewStyle);
    }
    
    public HorizontalListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = 0;
        this.h = new v(this);
        this.i = new boolean[1];
        this.o = new s(this);
        this.s = new Rect();
        this.v = new w(null);
        this.w = new w(null);
        this.x = new w(null);
        this.B = 0;
        this.E = -1;
        this.H = 0;
        this.K = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.U = Integer.MIN_VALUE;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.HorizontalListView, n, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(li.HorizontalListView_listDivider);
        if (drawable != null) {
            this.setDivider(drawable);
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(li.HorizontalListView_dividerWidth, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(li.HorizontalListView_edgePadding, 0);
        this.k = obtainStyledAttributes.getFloat(li.HorizontalListView_fillWidthHeightRatio, 0.0f);
        this.g = Math.max(obtainStyledAttributes.getDimensionPixelSize(li.HorizontalListView_scrollOffset, 10), dimensionPixelSize);
        this.p = obtainStyledAttributes.getDrawable(li.HorizontalListView_scrollDrawable);
        this.t = obtainStyledAttributes.getDimensionPixelSize(li.HorizontalListView_scrollHeight, 10);
        this.u = obtainStyledAttributes.getInt(li.HorizontalListView_fillMode, 0);
        this.setDividerWidth(dimensionPixelSize);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.l = value.getScaledTouchSlop();
        this.m = value.getScaledMinimumFlingVelocity();
        this.n = value.getScaledMaximumFlingVelocity();
        this.q = obtainStyledAttributes.getDrawable(li.HorizontalListView_leftFadeInDrawable);
        this.r = obtainStyledAttributes.getDrawable(li.HorizontalListView_rightFadeInDrawable);
        obtainStyledAttributes.recycle();
    }
    
    private View a(final int n, final int n2, final int n3, final boolean b) {
        if (!this.e) {
            final View a = this.h.a(n);
            if (a != null) {
                this.a(n, a, n2, n3, b, true);
                return a;
            }
        }
        final View a2 = this.a(n, this.i);
        this.a(n, a2, n2, n3, b, this.i[0]);
        return a2;
    }
    
    private View a(final int n, final boolean[] array) {
        final View b = this.h.b(n);
        View view;
        boolean b2;
        if (b != null) {
            view = this.c.getView(n, b, (ViewGroup)this);
            if (view != b) {
                this.h.a(b, n, false);
                b2 = false;
            }
            else {
                b2 = true;
            }
        }
        else {
            view = this.c.getView(n, (View)null, (ViewGroup)this);
            b2 = false;
        }
        array[0] = b2;
        return view;
    }
    
    private void a() {
        this.V.recycle();
        this.V = null;
    }
    
    private void a(final int n, final int n2, final float n3) {
        if (this.p != null) {
            final Rect s = this.s;
            final int n4 = n - s.left;
            final int n5 = n2 - s.right;
            final int a = this.w.a(n4, n3);
            final int a2 = this.x.a(n5, n3);
            s.left += a;
            s.right += a2;
            this.p.setBounds(s);
            if (a != 0 || a2 != 0) {
                this.invalidate(0, s.top, this.getRight(), s.bottom);
            }
        }
    }
    
    private void a(final int n, final View view, int n2, final int n3, final boolean b, final boolean b2) {
        int n4 = -1;
        HorizontalListView$LayoutParams layoutParams = (HorizontalListView$LayoutParams)view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (HorizontalListView$LayoutParams)this.generateDefaultLayoutParams();
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        final HorizontalListView$LayoutParams horizontalListView$LayoutParams = layoutParams;
        if (b2 && !horizontalListView$LayoutParams.d) {
            int n5;
            if (b) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
            this.attachViewToParent(view, n5, (ViewGroup$LayoutParams)horizontalListView$LayoutParams);
        }
        else {
            horizontalListView$LayoutParams.d = false;
            if (!b) {
                n4 = 0;
            }
            this.addViewInLayout(view, n4, (ViewGroup$LayoutParams)horizontalListView$LayoutParams, true);
        }
        boolean b3;
        if (!b2 || view.isLayoutRequested()) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (b3) {
            this.a(view, this.G, horizontalListView$LayoutParams);
        }
        else {
            this.cleanupLayoutState(view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (!b) {
            n2 -= measuredWidth;
        }
        if (b3) {
            view.layout(n2, n3, n2 + measuredWidth, n3 + measuredHeight);
        }
        else {
            view.offsetLeftAndRight(n2 - view.getLeft());
            view.offsetTopAndBottom(n3 - view.getTop());
        }
        final int a = this.A;
        boolean selected = false;
        if (n == a) {
            selected = true;
        }
        if (selected != view.isSelected()) {
            view.setSelected(selected);
        }
    }
    
    private void a(final Canvas canvas, final Drawable drawable, final int n) {
        int n2 = drawable.getIntrinsicWidth();
        if (n == 3 && this.H == 0) {
            n2 = Math.min(n2, this.getOverflowLeft());
        }
        else if (n == 5 && this.H + this.getChildCount() == this.d) {
            n2 = Math.min(n2, this.getOverflowRight());
        }
        if (n2 > 0) {
            final Rect bounds = new Rect();
            bounds.top = this.getPaddingTop();
            bounds.bottom = this.getHeight() - this.getPaddingBottom();
            if (n == 3) {
                bounds.left = this.getPaddingLeft();
                bounds.right = n2 + bounds.left;
            }
            else if (n == 5) {
                bounds.right = this.getWidth() - this.getPaddingRight();
                bounds.left = bounds.right - n2;
            }
            drawable.setBounds(bounds);
            drawable.draw(canvas);
        }
    }
    
    private void a(final View view, final int n) {
        HorizontalListView$LayoutParams layoutParams = (HorizontalListView$LayoutParams)view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = (HorizontalListView$LayoutParams)this.generateDefaultLayoutParams();
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        this.a(view, n, layoutParams);
    }
    
    private void a(final View view, final int n, final HorizontalListView$LayoutParams horizontalListView$LayoutParams) {
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, this.getPaddingTop() + this.getPaddingBottom(), horizontalListView$LayoutParams.height);
        int n2;
        if (this.b) {
            n2 = horizontalListView$LayoutParams.c;
        }
        else {
            n2 = horizontalListView$LayoutParams.width;
        }
        int n3;
        if (n2 > 0) {
            n3 = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
        }
        else {
            n3 = View$MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(n3, childMeasureSpec);
    }
    
    private void a(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    private void b() {
        this.setPressed(false);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).setPressed(false);
        }
    }
    
    private void b(final int n, final boolean selected) {
        final int n2 = n - this.H;
        if (n2 >= 0 && n2 < this.getChildCount()) {
            this.getChildAt(n2).setSelected(selected);
        }
    }
    
    private void b(final boolean b) {
        final int childCount = this.getChildCount();
        if (b) {
            int paddingLeft;
            if (childCount > 0) {
                if (childCount + this.H < this.d) {
                    paddingLeft = this.getChildAt(childCount - 1).getRight() + this.P;
                }
                else {
                    paddingLeft = this.getChildAt(childCount - 1).getRight() + this.j;
                }
            }
            else {
                paddingLeft = this.getPaddingLeft();
            }
            this.d(childCount + this.H, paddingLeft);
            return;
        }
        int n = 0;
        if (childCount > 0) {
            if (this.H == 0) {
                n = this.getChildAt(0).getLeft() - this.j;
            }
            else {
                n = this.getChildAt(0).getLeft() - this.P;
            }
        }
        this.c(-1 + this.H, n);
    }
    
    private boolean b(final int n, final int n2) {
        boolean b = true;
        int i = 0;
        if (n != 0 || n2 != 0) {
            final int childCount = this.getChildCount();
            final boolean b2 = n2 < 0 && b;
            final int paddingLeft = this.getPaddingLeft();
            final int n3 = this.getWidth() - this.getPaddingRight();
            final int right = this.getChildAt(childCount - 1).getRight();
            final int left = this.getChildAt(0).getLeft();
            final int h = this.H;
            int n4;
            if (b2) {
                if (h + childCount < this.d) {
                    n4 = this.getOverflowRight() + this.P;
                }
                else {
                    n4 = this.getOverflowRight() + this.j;
                }
            }
            else if (h > 0) {
                n4 = this.getOverflowLeft() + this.P;
            }
            else {
                n4 = this.getOverflowLeft() + this.j;
            }
            if (b2) {
                if (h + childCount >= this.d && right + n < n3 - this.j) {
                    b = false;
                }
            }
            else if (h <= 0 && left + n > paddingLeft + this.j) {
                b = false;
            }
            if (b) {
                int n5;
                int n7;
                if (b2) {
                    int j = 0;
                    n5 = 0;
                    while (j < childCount) {
                        final View child = this.getChildAt(j);
                        if (n + child.getRight() >= paddingLeft) {
                            break;
                        }
                        final int n6 = n5 + 1;
                        this.h.a(child, h + j, false);
                        ++j;
                        n5 = n6;
                    }
                    n7 = 0;
                }
                else {
                    int k = childCount - 1;
                    n7 = 0;
                    n5 = 0;
                    while (k >= 0) {
                        final View child2 = this.getChildAt(k);
                        if (n + child2.getLeft() <= n3) {
                            break;
                        }
                        final int n8 = n5 + 1;
                        this.h.a(child2, h + k, false);
                        final int n9 = k - 1;
                        n5 = n8;
                        n7 = k;
                        k = n9;
                    }
                }
                if (n5 > 0) {
                    this.detachViewsFromParent(n7, n5);
                    if (b2) {
                        this.H += n5;
                    }
                }
                while (i < this.getChildCount()) {
                    this.getChildAt(i).offsetLeftAndRight(n);
                    ++i;
                }
                this.invalidate();
                if (n4 < Math.abs(n2)) {
                    this.b(b2);
                    return b;
                }
            }
        }
        return b;
    }
    
    private void c() {
        this.invalidate();
        final boolean e = this.e;
        final boolean w = this.W;
        final int h = this.H;
        final v h2 = this.h;
        final int childCount = this.getChildCount();
        final View child = this.getChildAt(0);
        if (e) {
            for (int i = 0; i < childCount; ++i) {
                h2.a(this.getChildAt(i), h + i, false);
            }
        }
        else {
            h2.a(h, childCount);
        }
        this.detachAllViewsFromParent();
        if (child == null || w) {
            this.d(this.z);
        }
        else {
            this.d(h, child.getLeft());
        }
        h2.a();
        this.W = false;
        this.e = false;
        this.f = -1 + (this.H + this.getChildCount());
    }
    
    private void c(int n, int n2) {
        int paddingTop;
        int paddingLeft;
        int n3;
        for (paddingTop = this.getPaddingTop(), paddingLeft = this.getPaddingLeft(), n3 = 0; n2 > paddingLeft && n >= 0; n2 = this.a(n, n2, paddingTop, false).getLeft() - this.P, --n, ++n3) {}
        this.H -= n3;
    }
    
    private boolean c(final int n) {
        return this.b(n, n);
    }
    
    private void d() {
        final int childCount = this.getChildCount();
        final int d = this.d;
        if (childCount == d && d > 0) {
            final int measuredWidth = this.getMeasuredWidth();
            final int n = (d - 1) * this.P;
            final int n2 = n + (this.getPaddingLeft() + this.getPaddingRight() + 2 * this.j);
            int i = 0;
            int n3 = n2;
            while (i < childCount) {
                n3 += this.getChildAt(i).getMeasuredWidth();
                ++i;
            }
            if (measuredWidth > n3) {
                final int n4 = (measuredWidth - n2) / d;
                final int n5 = (measuredWidth - (n3 - n)) / d;
                final int n6 = this.getPaddingLeft() + this.j;
                int j = 0;
                int n7 = n6;
                while (j < childCount) {
                    final View child = this.getChildAt(j);
                    int c;
                    if (this.u == 1) {
                        c = n4;
                    }
                    else {
                        c = n5 + child.getMeasuredWidth();
                    }
                    ((HorizontalListView$LayoutParams)child.getLayoutParams()).c = c;
                    final int n8 = n7 + c;
                    child.measure(View$MeasureSpec.makeMeasureSpec(c, 1073741824), this.G);
                    child.layout(n7, child.getTop(), n8, child.getBottom());
                    int n9 = n7 + c;
                    if (j < childCount - 1) {
                        n9 += this.P;
                    }
                    ++j;
                    n7 = n9;
                }
                this.e();
            }
        }
        this.b = true;
    }
    
    private void d(final int n) {
        int n2 = 1;
        int h = 0;
        final int n3 = this.getPaddingLeft() + this.j;
        if (n == 0) {
            this.d(0, n3);
        }
        else {
            final int n4 = n - 1;
            this.d(n4, this.getPaddingLeft());
            final int childCount = this.getChildCount();
            if (n4 + childCount == this.d) {
                final int n5 = this.getMeasuredWidth() - this.getPaddingRight() - this.j - this.getChildAt(childCount - 1).getRight();
                for (int i = 0; i < childCount; ++i) {
                    this.getChildAt(i).offsetLeftAndRight(n5);
                }
                this.c(n4 - 1, this.getChildAt(0).getLeft());
                final int childCount2 = this.getChildCount();
                if (childCount2 == this.d) {
                    final int left = this.getChildAt(0).getLeft();
                    h = 0;
                    if (left > n3) {
                        final int n6 = n3 - left;
                        for (int j = 0; j < childCount2; ++j) {
                            this.getChildAt(j).offsetLeftAndRight(n6);
                        }
                        n2 = 0;
                    }
                }
                else {
                    h = this.d - childCount2;
                }
                if (n2 != 0) {
                    final View child = this.getChildAt(h - n);
                    if (child != null) {
                        final int n7 = this.P + this.g;
                        final int left2 = child.getLeft();
                        if (left2 < n7) {
                            this.c(n7 - left2);
                        }
                    }
                }
            }
            else {
                final View child2 = this.getChildAt(n2);
                if (child2 != null) {
                    final int n8 = this.P + this.g;
                    final int left3 = child2.getLeft();
                    if (left3 > n8) {
                        this.c(n8 - left3);
                    }
                }
                h = n4;
            }
        }
        this.H = h;
    }
    
    private void d(int n, int n2) {
        for (int paddingTop = this.getPaddingTop(); n2 < this.getWidth() - this.getPaddingRight() && n < this.d; n2 = this.a(n, n2, paddingTop, true).getRight() + this.P, ++n) {}
    }
    
    private void e() {
        if (this.p != null) {
            final int n = this.z - this.H;
            final Rect s = this.s;
            final View child = this.getChildAt(n);
            final int height = this.getHeight();
            if (child != null) {
                int n2;
                if (this.z == 0) {
                    n2 = this.getPaddingLeft() + this.j;
                }
                else {
                    n2 = child.getLeft() - this.P;
                }
                s.set(n2, height - this.t, child.getRight() + this.P, height);
            }
            else {
                final int width = this.getWidth();
                if (this.z < this.H) {
                    s.left = -s.right;
                    s.right = 0;
                }
                else {
                    s.right += width;
                    s.left = width;
                }
            }
            if (!s.equals((Object)this.p.getBounds())) {
                this.p.setBounds(s);
                this.invalidate(0, s.top, this.getWidth(), s.bottom);
            }
        }
    }
    
    private void e(final int y) {
        if (this.y != y) {
            this.f();
            this.y = y;
        }
    }
    
    private void e(final int n, final int n2) {
        this.b(n, false);
        this.b(n2, true);
        this.invalidate();
    }
    
    private void f() {
        this.v.a();
        this.w.a();
        this.x.a();
    }
    
    private void g() {
        this.f();
        this.z = this.A;
        this.e();
    }
    
    private int getOverflowLeft() {
        if (this.getChildCount() == 0) {
            return 0;
        }
        return this.getPaddingLeft() - this.getChildAt(0).getLeft();
    }
    
    private int getOverflowRight() {
        if (this.getChildCount() == 0) {
            return 0;
        }
        return this.getChildAt(-1 + this.getChildCount()).getRight() - (this.getWidth() - this.getPaddingRight());
    }
    
    private void h() {
        if (this.D != null) {
            this.D.a(this, this.E == 4);
        }
    }
    
    public int a(final int n, final int n2) {
        Rect rect = this.J;
        if (rect == null) {
            this.J = new Rect();
            rect = this.J;
        }
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                child.getHitRect(rect);
                if (rect.contains(n, n2)) {
                    return i + this.H;
                }
            }
        }
        return -1;
    }
    
    int a(final int n, int i, int n2, int n3, final int n4) {
        final ListAdapter c = this.c;
        if (c != null) {
            int n5 = this.getPaddingLeft() + this.getPaddingRight() + 2 * this.j;
            if (n2 == -1) {
                n2 = -1 + c.getCount();
            }
            final v h = this.h;
            final boolean[] j = this.i;
            int n6 = 0;
            while (i <= n2) {
                final View a = this.a(i, j);
                this.a(a, n);
                h.a(a, -1, false);
                n5 += a.getMeasuredWidth() + this.P;
                if (n5 >= n3) {
                    if (n4 >= 0 && i > n4 && n6 > 0 && n5 != n3) {
                        return n6;
                    }
                    return n3;
                }
                else {
                    if (n4 >= 0 && i >= n4) {
                        n6 = n5;
                    }
                    ++i;
                }
            }
            return n5;
        }
        n3 = this.getPaddingLeft() + this.getPaddingRight();
        return n3;
    }
    
    public HorizontalListView$LayoutParams a(final AttributeSet set) {
        return new HorizontalListView$LayoutParams(this.getContext(), set);
    }
    
    public void a(final int b) {
        if (b != 0) {
            this.aa = true;
        }
        else {
            final boolean aa = this.aa;
            this.aa = false;
            if (aa && this.ac) {
                this.requestLayout();
            }
            if (b == 0 && this.B != 0) {
                this.g();
            }
        }
        this.B = b;
    }
    
    public void a(final int n, final float n2) {
        int n3 = 1;
        if (n2 != 0.0f) {
            final int n4 = n + 1;
            final int n5 = n - this.H;
            final int childCount = this.getChildCount();
            if (n5 >= 0 && n5 < childCount) {
                final View child = this.getChildAt(n5);
                int n6;
                if (this.B == 2 && n != this.A && n4 != this.A) {
                    n6 = n3;
                }
                else {
                    n6 = 0;
                }
                if (this.z > n) {
                    this.e(n);
                    final int h = this.H;
                    int n7 = 0;
                    if (h == 0) {
                        n7 = n3;
                    }
                    int n8;
                    if (n7 != 0 && n == 0) {
                        n8 = this.getPaddingLeft() + this.j;
                    }
                    else {
                        n8 = this.getPaddingLeft() + this.P + this.g;
                    }
                    final int n9 = n8 - child.getLeft();
                    int n10;
                    if (n9 > 0) {
                        if (n7 != 0 && n == 0) {
                            n10 = this.getPaddingLeft() + this.j;
                        }
                        else {
                            n10 = this.getPaddingLeft() + this.g;
                        }
                    }
                    else {
                        n10 = child.getLeft() - this.P;
                    }
                    final float n11 = 1.0f - n2;
                    if (n6 == 0 && n9 > 0) {
                        this.c(this.v.a(n9, n11));
                    }
                    this.a(n10, n10 + child.getWidth() + this.P, n11);
                    return;
                }
                if (n2 > 0.0f) {
                    this.e(n4);
                    final int n12 = n4 - this.H;
                    if (n12 >= 0 && n12 < childCount) {
                        final View child2 = this.getChildAt(n12);
                        if (childCount + this.H != this.d) {
                            n3 = 0;
                        }
                        final int n13 = this.getWidth() - this.getPaddingRight() - this.j;
                        final View child3 = this.getChildAt(childCount - 1);
                        final int n14 = this.getPaddingLeft() + this.P + this.g;
                        int max;
                        if (n3 != 0) {
                            max = Math.max(n14 - child2.getLeft(), n13 - child3.getRight());
                        }
                        else {
                            max = n14 - child2.getLeft();
                        }
                        int n15;
                        if (max < 0) {
                            if (n3 != 0) {
                                n15 = max + child2.getLeft() - this.P;
                            }
                            else {
                                n15 = this.getPaddingLeft() + this.g;
                            }
                        }
                        else {
                            n15 = child2.getLeft() - this.P;
                        }
                        final int n16 = n15 + child2.getWidth() + this.P;
                        if (n6 == 0 && max < 0 && (n3 == 0 || child.getLeft() <= n14 || child3.getRight() > n13)) {
                            this.c(this.v.a(max, n2));
                        }
                        this.a(n15, n16, n2);
                    }
                }
            }
        }
    }
    
    public void a(final int n, final boolean b) {
        if (n < 0 || n >= this.d) {
            throw new IndexOutOfBoundsException("setSelection: " + n);
        }
        if (this.z != n || b) {
            this.z = n;
            this.A = n;
            this.W = true;
            this.requestLayout();
        }
    }
    
    void a(final Canvas canvas, final Rect bounds) {
        final Drawable o = this.O;
        o.setBounds(bounds);
        o.draw(canvas);
    }
    
    public void b(final int n) {
        if (this.B == 0) {
            this.setSelection(n);
            return;
        }
        this.e(this.A, this.A = n);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof HorizontalListView$LayoutParams;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        int i = 0;
        final int p = this.P;
        boolean b;
        if (p > 0 && this.O != null) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            final Rect rect = new Rect();
            rect.left = this.getPaddingLeft();
            rect.right = this.getWidth() - this.getPaddingRight();
            final int childCount = this.getChildCount();
            final int h = this.H;
            final ListAdapter c = this.c;
            final int scrollX = this.getScrollX();
            boolean b2;
            if (this.isOpaque() && !super.isOpaque()) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b2 && this.Q == null) {
                this.Q = new Paint();
            }
            final Paint q = this.Q;
            int paddingLeft;
            int paddingRight;
            if (this.T) {
                paddingLeft = this.getPaddingLeft();
                paddingRight = this.getPaddingRight();
            }
            else {
                paddingRight = 0;
                paddingLeft = 0;
            }
            final int left = scrollX + this.getWidth() - paddingRight;
            while (i < childCount) {
                final int left2 = this.getChildAt(i).getLeft();
                if (left2 > paddingLeft) {
                    if (c.isEnabled(h + i) && (i == childCount - 1 || c.isEnabled(1 + (h + i)))) {
                        rect.left = left2 - p;
                        rect.right = left2;
                        this.a(canvas, rect);
                    }
                    else if (b2) {
                        rect.left = left2 - p;
                        rect.right = left2;
                        canvas.drawRect(rect, q);
                    }
                }
                ++i;
            }
            if (childCount > 0 && scrollX > 0 && b) {
                rect.left = left;
                rect.right = left + p;
                this.a(canvas, rect);
            }
        }
        super.dispatchDraw(canvas);
        if (this.p != null) {
            this.p.draw(canvas);
        }
        if (this.q != null) {
            this.a(canvas, this.q, 3);
        }
        if (this.r != null) {
            this.a(canvas, this.r, 5);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.p != null && this.p.isStateful()) {
            this.p.setState(this.getDrawableState());
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new HorizontalListView$LayoutParams(-2, -1);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new HorizontalListView$LayoutParams(viewGroup$LayoutParams);
    }
    
    public ListAdapter getAdapter() {
        return this.c;
    }
    
    public View getSelectedView() {
        return null;
    }
    
    public int getSelection() {
        return this.z;
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + HorizontalListView.a.length);
        if (this.ab) {
            mergeDrawableStates(onCreateDrawableState, HorizontalListView.a);
        }
        return onCreateDrawableState;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.b();
        if (this.N != null) {
            this.removeCallbacks((Runnable)this.N);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.aa) {
            return;
        }
        this.ac = false;
        this.aa = true;
        final boolean e = this.e;
        final boolean w = this.W;
        if (b || e) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).forceLayout();
            }
        }
        this.c();
        if (b || w) {
            this.e();
        }
        if (this.u != 0 && (!this.b || b || e)) {
            this.d();
        }
        this.aa = false;
    }
    
    protected void onMeasure(final int n, final int g) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(g);
        int n2 = View$MeasureSpec.getSize(n);
        final int size = View$MeasureSpec.getSize(g);
        int count;
        if (this.c == null) {
            count = 0;
        }
        else {
            count = this.c.getCount();
        }
        this.d = count;
        int suggestedMinimumHeight;
        int n3;
        if (this.d > 0 && (mode == 0 || mode2 == 0)) {
            final View a = this.a(0, this.i);
            this.a(a, g);
            final int measuredWidth = a.getMeasuredWidth();
            final int measuredHeight = a.getMeasuredHeight();
            this.h.a(a, -1, true);
            suggestedMinimumHeight = measuredHeight;
            n3 = measuredWidth;
        }
        else {
            final int suggestedMinimumWidth = this.getSuggestedMinimumWidth();
            suggestedMinimumHeight = this.getSuggestedMinimumHeight();
            n3 = suggestedMinimumWidth;
        }
        if (mode == 0) {
            n2 = n3 + (this.getPaddingLeft() + this.getPaddingRight());
        }
        else if (mode == Integer.MIN_VALUE) {
            n2 = this.a(g, 0, -1, n2, -1);
        }
        int n4;
        if (mode2 == 0) {
            n4 = suggestedMinimumHeight + (this.getPaddingTop() + this.getPaddingBottom());
        }
        else {
            n4 = size;
        }
        final float n5 = fcmpl(this.k, 0.0f);
        int n6 = 0;
        if (n5 > 0) {
            final int d = this.d;
            n6 = 0;
            if (d > 0) {
                final int width = (n2 - 2 * this.j - this.P * this.d) / this.d;
                if (width >= n4) {
                    final float n7 = fcmpg((float)width, this.k * n4);
                    int i = 0;
                    if (n7 <= 0) {
                        while (i < this.getChildCount()) {
                            this.getChildAt(i).getLayoutParams().width = width;
                            ++i;
                        }
                    }
                }
                n6 = width;
            }
        }
        if (this.C != null) {
            this.C.a(n6);
        }
        this.setMeasuredDimension(n2, n4);
        this.G = g;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.d == 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.V == null) {
            this.V = VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        final int n = 0xFF & motionEvent.getAction();
        final int k = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        switch (n) {
            case 0: {
                final int a = this.a(k, n2);
                if (!this.e && this.E != 4 && a >= 0 && this.c.isEnabled(a)) {
                    this.E = 0;
                    if (this.N == null) {
                        this.N = new q(this);
                    }
                    this.postDelayed((Runnable)this.N, (long)ViewConfiguration.getTapTimeout());
                }
                this.a(true);
                this.o.a();
                this.K = k;
                this.L = n2;
                this.U = Integer.MIN_VALUE;
                this.M = a;
                break;
            }
            case 1: {
                switch (this.E) {
                    default: {
                        final VelocityTracker v = this.V;
                        v.computeCurrentVelocity(1000, (float)this.n);
                        final float xVelocity = v.getXVelocity();
                        if (Math.abs(xVelocity) > this.m) {
                            this.o.a((int)(-xVelocity));
                            break;
                        }
                        break;
                    }
                    case 0:
                    case 1:
                    case 2: {
                        final int m = this.M;
                        final int a2 = this.a(k, n2);
                        final View child = this.getChildAt(m - this.H);
                        boolean b;
                        if (k > this.getPaddingLeft() && k < this.getWidth() - this.getPaddingRight() && a2 == m) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (child != null && !child.hasFocusable() && b) {
                            if (this.E != 0) {
                                child.setPressed(false);
                            }
                            if (this.S == null) {
                                this.S = new u(this);
                            }
                            final u s = this.S;
                            s.a = m;
                            s.a();
                            if (this.E == 0 || this.E == 1) {
                                final Handler handler = this.getHandler();
                                if (handler != null) {
                                    handler.removeCallbacks((Runnable)this.N);
                                }
                                if (!this.e && this.c.isEnabled(m)) {
                                    this.E = 1;
                                    this.c();
                                    child.setPressed(true);
                                    this.setPressed(true);
                                    if (this.I != null) {
                                        final Drawable current = this.I.getCurrent();
                                        if (current != null && current instanceof TransitionDrawable) {
                                            ((TransitionDrawable)current).resetTransition();
                                        }
                                    }
                                    if (this.R != null) {
                                        this.removeCallbacks(this.R);
                                    }
                                    this.postDelayed(this.R = new o(this, child, s), (long)ViewConfiguration.getPressedStateDuration());
                                }
                                else {
                                    this.E = -1;
                                }
                                return true;
                            }
                            if (!this.e && this.c.isEnabled(m)) {
                                s.run();
                            }
                        }
                        this.E = -1;
                        break;
                    }
                }
                this.a();
                this.b();
                this.L = Integer.MIN_VALUE;
                this.K = Integer.MIN_VALUE;
                this.U = Integer.MIN_VALUE;
                break;
            }
            case 2: {
                if (this.K != Integer.MIN_VALUE) {
                    final int childCount = this.getChildCount();
                    if (childCount == 0) {
                        this.E = -1;
                        return super.onTouchEvent(motionEvent);
                    }
                    final int n3 = k - this.K;
                    if (this.E != 3) {
                        if ((this.H == 0 && this.getOverflowLeft() + this.j == 0 && n3 > 0) || (this.H == this.f && this.getOverflowRight() + this.j == 0 && n3 < 0)) {
                            this.a(false);
                            break;
                        }
                        if (this.L != Integer.MIN_VALUE && this.l <= Math.abs(n2 - this.L)) {
                            this.a(false);
                            break;
                        }
                        if (this.l > Math.abs(n3) || (childCount == this.d && this.getOverflowLeft() + this.j == 0 && this.getOverflowRight() + this.j == 0)) {
                            break;
                        }
                        this.E = 3;
                    }
                    if (k == this.U) {
                        break;
                    }
                    int n4;
                    if (n3 > 0) {
                        n4 = n3 - this.l;
                    }
                    else {
                        n4 = n3 + this.l;
                    }
                    if (this.U != Integer.MIN_VALUE) {
                        n4 = k - this.U;
                    }
                    this.b(n3, n4);
                    this.U = k;
                    this.e();
                }
                this.K = k;
                this.L = n2;
                break;
            }
            case 3: {
                this.b();
                this.a();
                this.K = Integer.MIN_VALUE;
                this.L = Integer.MIN_VALUE;
                this.U = Integer.MIN_VALUE;
                this.E = -1;
                break;
            }
        }
        return true;
    }
    
    public void requestLayout() {
        this.ac = true;
        super.requestLayout();
    }
    
    public void setAdapter(final ListAdapter c) {
        if (c != this.c) {
            if (this.F == null) {
                this.F = new p(this);
            }
            if (this.c != null) {
                this.c.unregisterDataSetObserver(this.F);
            }
            c.registerDataSetObserver(this.F);
            this.c = c;
            this.d = c.getCount();
        }
    }
    
    public void setChildWidthListener(final r c) {
        this.C = c;
    }
    
    public void setClipToPadding(final boolean b) {
        super.setClipToPadding(b);
        this.T = b;
    }
    
    public void setDivider(final Drawable o) {
        if (o != null) {
            this.P = o.getIntrinsicWidth();
        }
        else {
            this.P = 0;
        }
        this.O = o;
        this.requestLayout();
        this.invalidate();
    }
    
    public void setDividerWidth(final int p) {
        if (p != this.P) {
            this.P = p;
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setDocked(final boolean ab) {
        if (this.ab != ab) {
            this.ab = ab;
            this.refreshDrawableState();
            this.invalidate();
        }
    }
    
    public void setOnScrollListener(final t d) {
        this.D = d;
    }
    
    public void setPressed(final boolean pressed) {
        if (this.getParent() == null) {
            super.setPressed(pressed);
        }
    }
    
    public void setSelection(final int n) {
        this.a(n, false);
    }
}
