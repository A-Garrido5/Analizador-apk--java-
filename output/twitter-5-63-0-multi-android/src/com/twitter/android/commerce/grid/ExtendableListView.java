// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.widget.Scroller;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.graphics.Rect;
import android.widget.Adapter;
import android.widget.AbsListView;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.os.Handler;
import android.util.Log;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.AdapterView;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import java.util.Iterator;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.view.VelocityTracker;
import android.widget.ListAdapter;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;

public abstract class ExtendableListView extends ListView
{
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private final j F;
    private AbsListView$OnScrollListener G;
    private final c H;
    private int I;
    private g J;
    private i K;
    private Runnable L;
    private d M;
    protected int a;
    protected int b;
    protected boolean c;
    protected int d;
    long e;
    long f;
    boolean g;
    ListAdapter h;
    final boolean[] i;
    private ExtendableListView$ListSavedState j;
    private int k;
    private int l;
    private int m;
    private VelocityTracker n;
    private final ArrayList o;
    private final ArrayList p;
    private final int q;
    private final int r;
    private final int s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    public ExtendableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = Long.MIN_VALUE;
        this.g = false;
        this.i = new boolean[1];
        this.m = 0;
        this.n = null;
        this.z = -1;
        this.setWillNotDraw(this.B = false);
        this.setClipToPadding(false);
        this.setFocusableInTouchMode(false);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.q = value.getScaledTouchSlop();
        this.r = value.getScaledMaximumFlingVelocity();
        this.s = value.getScaledMinimumFlingVelocity();
        this.F = new j(this);
        this.H = new c(this);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.k = 0;
    }
    
    private View a(final int n, final int n2, final boolean b, final boolean b2) {
        this.a(n, b);
        if (!this.C) {
            final View c = this.F.c(n);
            if (c != null) {
                this.a(c, n, n2, b, b2, true);
                return c;
            }
        }
        final View a = this.a(n, this.i);
        this.a(a, n, n2, b, b2, this.i[0]);
        return a;
    }
    
    private View a(final int n, final boolean[] array) {
        array[0] = false;
        final View d = this.F.d(n);
        if (d == null) {
            return this.h.getView(n, (View)null, (ViewGroup)this);
        }
        final View view = this.h.getView(n, d, (ViewGroup)this);
        if (view != d) {
            this.F.a(d, n);
            return view;
        }
        array[0] = true;
        return view;
    }
    
    static View a(final ArrayList list, final int n) {
        final int size = list.size();
        if (size > 0) {
            for (int i = 0; i < size; ++i) {
                final View view = list.get(i);
                if (((ExtendableListView$LayoutParams)view.getLayoutParams()).b == n) {
                    list.remove(i);
                    return view;
                }
            }
            return list.remove(size - 1);
        }
        return null;
    }
    
    private void a(final float n) {
        if (this.J == null) {
            this.J = new g(this);
        }
        this.J.a((int)(-n));
    }
    
    private void a(final View view, final int b, final int n, final boolean b2, final boolean b3, final boolean b4) {
        boolean b5;
        if (view.isSelected()) {
            b5 = true;
        }
        else {
            b5 = false;
        }
        final int l = this.l;
        final boolean pressed = l > 3 && l < 1 && this.x == b;
        int n2;
        if (pressed != view.isPressed()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        boolean b6;
        if (!b4 || b5 || view.isLayoutRequested()) {
            b6 = true;
        }
        else {
            b6 = false;
        }
        final int itemViewType = this.h.getItemViewType(b);
        ExtendableListView$LayoutParams extendableListView$LayoutParams;
        if (itemViewType == -2) {
            extendableListView$LayoutParams = this.b(view);
        }
        else {
            extendableListView$LayoutParams = this.a(view);
        }
        extendableListView$LayoutParams.d = itemViewType;
        extendableListView$LayoutParams.b = b;
        if (b4 || (extendableListView$LayoutParams.a && extendableListView$LayoutParams.d == -2)) {
            int n3;
            if (b2) {
                n3 = -1;
            }
            else {
                n3 = 0;
            }
            this.attachViewToParent(view, n3, (ViewGroup$LayoutParams)extendableListView$LayoutParams);
        }
        else {
            if (extendableListView$LayoutParams.d == -2) {
                extendableListView$LayoutParams.a = true;
            }
            int n4;
            if (b2) {
                n4 = -1;
            }
            else {
                n4 = 0;
            }
            this.addViewInLayout(view, n4, (ViewGroup$LayoutParams)extendableListView$LayoutParams, true);
        }
        if (b5) {
            view.setSelected(false);
        }
        if (n2 != 0) {
            view.setPressed(pressed);
        }
        if (b6) {
            this.a(view, extendableListView$LayoutParams);
        }
        else {
            this.cleanupLayoutState(view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        int n5;
        if (b2) {
            n5 = n;
        }
        else {
            n5 = n - measuredHeight;
        }
        final int a = this.a(b);
        if (b6) {
            this.a(view, b, b2, a, n5, a + measuredWidth, n5 + measuredHeight);
            return;
        }
        this.a(view, b, b2, a, n5);
    }
    
    private void a(final View view, final ArrayList list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (list.get(i).a == view) {
                list.remove(i);
                break;
            }
        }
    }
    
    private void a(final Runnable runnable) {
        ViewCompat.postOnAnimation((View)this, runnable);
    }
    
    private void a(final ArrayList list) {
        if (list != null) {
            final Iterator<f> iterator = list.iterator();
            while (iterator.hasNext()) {
                final ViewGroup$LayoutParams layoutParams = iterator.next().a.getLayoutParams();
                if (layoutParams instanceof ExtendableListView$LayoutParams) {
                    ((ExtendableListView$LayoutParams)layoutParams).a = false;
                }
            }
        }
    }
    
    private boolean a(final MotionEvent motionEvent) {
        final int v = (int)motionEvent.getX();
        final int u = (int)motionEvent.getY();
        int x = this.pointToPosition(v, u);
        this.n.clear();
        this.z = MotionEventCompat.getPointerId(motionEvent, 0);
        if (this.l != 2 && !this.C && x >= 0 && this.getAdapter().isEnabled(x)) {
            this.l = 3;
            if (this.L == null) {
                this.L = new e(this);
            }
            this.postDelayed(this.L, (long)ViewConfiguration.getTapTimeout());
            if (motionEvent.getEdgeFlags() != 0 && x < 0) {
                return false;
            }
        }
        else if (this.l == 2) {
            this.l = 1;
            this.w = 0;
            x = this.j(u);
        }
        this.v = v;
        this.u = u;
        this.x = x;
        this.y = Integer.MIN_VALUE;
        return true;
    }
    
    private boolean a(final View view, final int n, final long n2) {
        final AdapterView$OnItemLongClickListener onItemLongClickListener = this.getOnItemLongClickListener();
        final boolean b = onItemLongClickListener != null && onItemLongClickListener.onItemLongClick((AdapterView)this, view, n, n2);
        if (b) {
            this.performHapticFeedback(0);
        }
        return b;
    }
    
    private boolean b(final MotionEvent motionEvent) {
        final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.z);
        if (pointerIndex < 0) {
            Log.e("ExtendableListView", "onTouchMove could not find pointer with id " + this.z + " - did ExtendableListView receive an inconsistent " + "event stream?");
            return false;
        }
        final int n = (int)MotionEventCompat.getY(motionEvent, pointerIndex);
        if (this.C) {
            this.layoutChildren();
        }
        switch (this.l) {
            case 3:
            case 4:
            case 5: {
                this.h(n);
                break;
            }
            case 1: {
                this.i(n);
                break;
            }
        }
        return true;
    }
    
    private boolean c(final int n, final int n2) {
        if (!this.e()) {
            return true;
        }
        final int highestChildTop = this.getHighestChildTop();
        final int lowestChildBottom = this.getLowestChildBottom();
        final boolean c = this.c;
        int listPaddingBottom = 0;
        int listPaddingTop = 0;
        if (c) {
            listPaddingTop = this.getListPaddingTop();
            listPaddingBottom = this.getListPaddingBottom();
        }
        final int height = this.getHeight();
        final int n3 = listPaddingTop - this.getFirstChildTop();
        final int n4 = this.getLastChildBottom() - (height - listPaddingBottom);
        final int n5 = height - this.getListPaddingBottom() - this.getListPaddingTop();
        int n6;
        if (n2 < 0) {
            n6 = Math.max(-(n5 - 1), n2);
        }
        else {
            n6 = Math.min(n5 - 1, n2);
        }
        final int d = this.d;
        final int listPaddingTop2 = this.getListPaddingTop();
        final int n7 = height - this.getListPaddingBottom();
        final int childCount = this.getChildCount();
        int n8;
        if (d == 0 && highestChildTop >= listPaddingTop2 && n6 >= 0) {
            n8 = 1;
        }
        else {
            n8 = 0;
        }
        final boolean b = d + childCount == this.D && lowestChildBottom <= n7 && n6 <= 0;
        if (n8 != 0) {
            return n6 != 0;
        }
        if (b) {
            return n6 != 0;
        }
        final boolean b2 = n6 < 0;
        final int headerViewsCount = this.getHeaderViewsCount();
        final int n9 = this.D - this.getFooterViewsCount();
        int n10 = 0;
        int n15 = 0;
        int n16 = 0;
        Label_0327: {
            if (b2) {
                int n11 = -n6;
                if (this.c) {
                    n11 += this.getListPaddingTop();
                }
                int n12 = 0;
                int n13;
                for (int i = 0; i < childCount; ++i, n12 = n13) {
                    final View child = this.getChildAt(i);
                    if (child.getBottom() >= n11) {
                        break;
                    }
                    n13 = n12 + 1;
                    final int n14 = d + i;
                    if (n14 >= headerViewsCount && n14 < n9) {
                        this.F.a(child, n14);
                    }
                }
                n15 = n12;
                n16 = 0;
            }
            else {
                int n17 = height - n6;
                if (this.c) {
                    n17 -= this.getListPaddingBottom();
                }
                final int n18 = childCount - 1;
                int n19 = 0;
                int n22;
                for (int j = n18; j >= 0; j = n22) {
                    final View child2 = this.getChildAt(j);
                    if (child2.getTop() <= n17) {
                        n15 = n19;
                        n16 = n10;
                        break Label_0327;
                    }
                    final int n20 = n19 + 1;
                    final int n21 = d + j;
                    if (n21 >= headerViewsCount && n21 < n9) {
                        this.F.a(child2, n21);
                    }
                    n22 = j - 1;
                    n19 = n20;
                    n10 = j;
                }
                n15 = n19;
                n16 = n10;
            }
        }
        this.B = true;
        if (n15 > 0) {
            this.detachViewsFromParent(n16, n15);
            this.F.d();
            this.b(n16, n15);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        this.f(n6);
        if (b2) {
            this.d += n15;
        }
        final int abs = Math.abs(n6);
        if (n3 < abs || n4 < abs) {
            this.a(b2);
        }
        this.B = false;
        this.g();
        return false;
    }
    
    private boolean c(final MotionEvent motionEvent) {
        this.l = 0;
        this.setPressed(false);
        this.invalidate();
        final Handler handler = this.getHandler();
        if (handler != null) {
            handler.removeCallbacks((Runnable)this.M);
        }
        this.l();
        this.z = -1;
        return true;
    }
    
    private View d(int n, int d) {
        int height = this.getHeight();
        if (this.c) {
            height -= this.getListPaddingBottom();
        }
        while ((d < height || this.b()) && n < this.D) {
            this.a(n, d, true, false);
            ++n;
            d = this.d(n);
        }
        return null;
    }
    
    private boolean d(final MotionEvent motionEvent) {
        switch (this.l) {
            default: {
                this.setPressed(false);
                this.invalidate();
                final Handler handler = this.getHandler();
                if (handler != null) {
                    handler.removeCallbacks((Runnable)this.M);
                }
                this.l();
                this.z = -1;
                return true;
            }
            case 3:
            case 4:
            case 5: {
                return this.f(motionEvent);
            }
            case 1: {
                return this.e(motionEvent);
            }
        }
    }
    
    private View e(int n, int e) {
        int listPaddingTop;
        if (this.c) {
            listPaddingTop = this.getListPaddingTop();
        }
        else {
            listPaddingTop = 0;
        }
        while ((e > listPaddingTop || this.c()) && n >= 0) {
            this.a(n, e, false, false);
            --n;
            e = this.e(n);
        }
        this.d = n + 1;
        return null;
    }
    
    private boolean e(final MotionEvent motionEvent) {
        if (this.e()) {
            final int firstChildTop = this.getFirstChildTop();
            final int lastChildBottom = this.getLastChildBottom();
            int n;
            if (this.d == 0 && firstChildTop >= this.getListPaddingTop() && this.d + this.getChildCount() < this.D && lastChildBottom <= this.getHeight() - this.getListPaddingBottom()) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.n.computeCurrentVelocity(1000, (float)this.r);
                final float yVelocity = this.n.getYVelocity(this.z);
                if (Math.abs(yVelocity) > this.s) {
                    this.a(yVelocity);
                    this.l = 2;
                    this.u = 0;
                    this.invalidate();
                    return true;
                }
            }
        }
        this.m();
        this.l();
        this.l = 0;
        return true;
    }
    
    private View f(final int d, final int n) {
        this.a(d, n, true, false);
        this.d = d;
        final int e = this.e(d - 1);
        final int d2 = this.d(d + 1);
        final View e2 = this.e(d - 1, e);
        this.i();
        final View d3 = this.d(d + 1, d2);
        final int childCount = this.getChildCount();
        if (childCount > 0) {
            this.l(childCount);
        }
        if (e2 != null) {
            return e2;
        }
        return d3;
    }
    
    private boolean f(final MotionEvent motionEvent) {
        final int x = this.x;
        if (x >= 0) {
            final View child = this.getChildAt(x);
            if (child != null && !child.hasFocusable()) {
                if (this.l != 3) {
                    child.setPressed(false);
                }
                if (this.K == null) {
                    this.invalidate();
                    this.K = new i(this, null);
                }
                final i k = this.K;
                k.a = x;
                k.a();
                if (this.l == 3 || this.l == 4) {
                    final Handler handler = this.getHandler();
                    if (handler != null) {
                        Runnable runnable;
                        if (this.l == 3) {
                            runnable = this.L;
                        }
                        else {
                            runnable = this.M;
                        }
                        handler.removeCallbacks(runnable);
                    }
                    this.k = 0;
                    if (!this.C && x >= 0 && this.h.isEnabled(x)) {
                        this.l = 4;
                        this.layoutChildren();
                        child.setPressed(true);
                        this.setPressed(true);
                        this.postDelayed((Runnable)new b(this, child, k), (long)ViewConfiguration.getPressedStateDuration());
                        return true;
                    }
                    this.l = 0;
                    return true;
                }
                else if (!this.C && x >= 0 && this.h.isEnabled(x)) {
                    this.post((Runnable)k);
                }
            }
        }
        this.l = 0;
        return true;
    }
    
    private boolean g(final MotionEvent motionEvent) {
        this.h(motionEvent);
        final int v = this.v;
        final int u = this.u;
        final int pointToPosition = this.pointToPosition(v, u);
        if (pointToPosition >= 0) {
            this.x = pointToPosition;
        }
        this.y = u;
        return true;
    }
    
    private void h(final MotionEvent motionEvent) {
        final int n = (0xFF00 & motionEvent.getAction()) >> 8;
        if (motionEvent.getPointerId(n) == this.z) {
            int n2;
            if (n == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            this.v = (int)motionEvent.getX(n2);
            this.u = (int)motionEvent.getY(n2);
            this.z = motionEvent.getPointerId(n2);
            this.l();
        }
    }
    
    private boolean h(final int n) {
        final int n2 = n - this.u;
        if (Math.abs(n2) > this.q) {
            this.l = 1;
            int q;
            if (n2 > 0) {
                q = this.q;
            }
            else {
                q = -this.q;
            }
            this.w = q;
            final Handler handler = this.getHandler();
            if (handler != null) {
                handler.removeCallbacks((Runnable)this.M);
            }
            this.setPressed(false);
            final View child = this.getChildAt(this.x - this.d);
            if (child != null) {
                child.setPressed(false);
            }
            final ViewParent parent = this.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.i(n);
            return true;
        }
        return false;
    }
    
    private void i() {
        if (this.getChildCount() > 0) {
            int n = this.getHighestChildTop() - this.getListPaddingTop();
            if (n < 0) {
                n = 0;
            }
            if (n != 0) {
                this.f(-n);
            }
        }
    }
    
    private void i(final int n) {
        final int n2 = n - this.u;
        final int n3 = n2 - this.w;
        int n4;
        if (this.y != Integer.MIN_VALUE) {
            n4 = n - this.y;
        }
        else {
            n4 = n3;
        }
        if (this.l == 1 && n != this.y) {
            if (Math.abs(n2) > this.q) {
                final ViewParent parent = this.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int n5;
            if (this.x >= 0) {
                n5 = this.x - this.d;
            }
            else {
                n5 = this.getChildCount() / 2;
            }
            if (n4 != 0) {
                this.c(n3, n4);
            }
            if (this.getChildAt(n5) != null) {
                this.u = n;
            }
            this.y = n;
        }
    }
    
    private int j(final int n) {
        final int childCount = this.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; ++i) {
                if (n <= this.getChildAt(i).getBottom()) {
                    return i + this.d;
                }
            }
        }
        return -1;
    }
    
    private void j() {
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
            return;
        }
        this.n.clear();
    }
    
    private View k(final int n) {
        this.d = Math.min(this.d, -1 + this.D);
        if (this.d < 0) {
            this.d = 0;
        }
        return this.d(this.d, n);
    }
    
    private void k() {
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
    }
    
    private void l() {
        if (this.n != null) {
            this.n.recycle();
            this.n = null;
        }
    }
    
    private void l(final int n) {
        if (-1 + (n + this.d) == -1 + this.D && n > 0) {
            int min = this.getBottom() - this.getTop() - this.getListPaddingBottom() - this.getLowestChildBottom();
            final int highestChildTop = this.getHighestChildTop();
            if (min > 0 && (this.d > 0 || highestChildTop < this.getListPaddingTop())) {
                if (this.d == 0) {
                    min = Math.min(min, this.getListPaddingTop() - highestChildTop);
                }
                this.f(min);
                if (this.d > 0) {
                    final int n2 = -1 + this.d;
                    this.e(n2, this.e(n2));
                    this.i();
                }
            }
        }
    }
    
    private void m() {
        if (this.J != null) {
            this.J.a();
        }
    }
    
    private void m(final int n) {
        if (this.d == 0 && n > 0) {
            final int highestChildTop = this.getHighestChildTop();
            final int listPaddingTop = this.getListPaddingTop();
            final int n2 = this.getTop() - this.getBottom() - this.getListPaddingBottom();
            int min = highestChildTop - listPaddingTop;
            final int lowestChildBottom = this.getLowestChildBottom();
            final int n3 = -1 + (n + this.d);
            if (min > 0) {
                if (n3 < -1 + this.D || lowestChildBottom > n2) {
                    if (n3 == -1 + this.D) {
                        min = Math.min(min, lowestChildBottom - n2);
                    }
                    this.f(-min);
                    if (n3 < -1 + this.D) {
                        final int n4 = n3 + 1;
                        this.d(n4, this.d(n4));
                        this.i();
                    }
                }
                else if (n3 == -1 + this.D) {
                    this.i();
                }
            }
        }
    }
    
    private void n() {
        int n;
        if (this.getAdapter() == null || this.getAdapter().isEmpty()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (this.isInFilterMode()) {
            n = 0;
        }
        final View emptyView = this.getEmptyView();
        if (n != 0) {
            if (emptyView != null) {
                emptyView.setVisibility(0);
                this.setVisibility(8);
            }
            else {
                this.setVisibility(0);
            }
            if (this.C) {
                this.layout(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
            }
            return;
        }
        if (emptyView != null) {
            emptyView.setVisibility(8);
        }
        this.setVisibility(0);
    }
    
    private void o() {
        this.a(this.o);
        this.a(this.p);
        this.removeAllViewsInLayout();
        this.d = 0;
        this.C = false;
        this.F.b();
        this.g = false;
        this.j = null;
        this.k = 0;
        this.invalidate();
    }
    
    protected int a(final int n) {
        return this.getListPaddingLeft();
    }
    
    protected ExtendableListView$LayoutParams a(final View view) {
        return this.b(view);
    }
    
    public void a() {
    }
    
    protected void a(final int n, final int n2) {
        if (this.getChildCount() > 0) {
            this.m();
            this.F.b();
            this.C = true;
            this.h();
        }
    }
    
    protected void a(final int n, final boolean b) {
    }
    
    protected void a(final View view, final int n, final boolean b, final int n2, final int n3) {
        view.offsetLeftAndRight(n2 - view.getLeft());
        view.offsetTopAndBottom(n3 - view.getTop());
    }
    
    protected void a(final View view, final int n, final boolean b, final int n2, final int n3, final int n4, final int n5) {
        view.layout(n2, n3, n4, n5);
    }
    
    protected void a(final View view, final ExtendableListView$LayoutParams extendableListView$LayoutParams) {
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.I, this.getListPaddingLeft() + this.getListPaddingRight(), extendableListView$LayoutParams.width);
        final int height = extendableListView$LayoutParams.height;
        int n;
        if (height > 0) {
            n = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
        }
        else {
            n = View$MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, n);
    }
    
    protected void a(final boolean b) {
        final int childCount = this.getChildCount();
        if (b) {
            final int n = childCount + this.d;
            this.d(n, this.b(n));
        }
        else {
            final int n2 = -1 + this.d;
            this.e(n2, this.c(n2));
        }
        this.b(b);
    }
    
    public void addFooterView(final View view) {
        this.addFooterView(view, null, true);
    }
    
    public void addFooterView(final View a, final Object b, final boolean c) {
        final f f = new f(this);
        f.a = a;
        f.b = b;
        f.c = c;
        this.p.add(f);
        if (this.h != null && this.H != null) {
            this.H.onChanged();
        }
    }
    
    public void addHeaderView(final View view) {
        this.addHeaderView(view, null, true);
    }
    
    public void addHeaderView(final View a, final Object b, final boolean c) {
        if (this.h != null && !(this.h instanceof l)) {
            throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
        }
        final f f = new f(this);
        f.a = a;
        f.b = b;
        f.c = c;
        this.o.add(f);
        if (this.h != null && this.H != null) {
            this.H.onChanged();
        }
    }
    
    protected int b(final int n) {
        final int childCount = this.getChildCount();
        final boolean c = this.c;
        int n2 = 0;
        if (c) {
            n2 = this.getListPaddingTop();
        }
        if (childCount > 0) {
            n2 = this.getChildAt(childCount - 1).getBottom();
        }
        return n2;
    }
    
    protected ExtendableListView$LayoutParams b(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ExtendableListView$LayoutParams d;
        if (layoutParams != null) {
            if (layoutParams instanceof ExtendableListView$LayoutParams) {
                d = (ExtendableListView$LayoutParams)layoutParams;
            }
            else {
                d = new ExtendableListView$LayoutParams(layoutParams);
            }
        }
        else {
            d = null;
        }
        if (d == null) {
            d = this.d();
        }
        return d;
    }
    
    protected void b(final int n, final int n2) {
    }
    
    protected void b(final boolean b) {
        if (b) {
            this.l(this.getChildCount());
            return;
        }
        this.m(this.getChildCount());
    }
    
    protected boolean b() {
        return false;
    }
    
    protected int c(final int n) {
        final int childCount = this.getChildCount();
        int listPaddingBottom;
        if (this.c) {
            listPaddingBottom = this.getListPaddingBottom();
        }
        else {
            listPaddingBottom = 0;
        }
        if (childCount > 0) {
            return this.getChildAt(0).getTop();
        }
        return this.getHeight() - listPaddingBottom;
    }
    
    protected boolean c() {
        return false;
    }
    
    protected int d(final int n) {
        final int childCount = this.getChildCount();
        if (childCount > 0) {
            return this.getChildAt(childCount - 1).getBottom();
        }
        return 0;
    }
    
    protected ExtendableListView$LayoutParams d() {
        return new ExtendableListView$LayoutParams(-1, -2, 0);
    }
    
    protected int e(final int n) {
        final int childCount = this.getChildCount();
        if (childCount != 0 && childCount > 0) {
            return this.getChildAt(0).getTop();
        }
        return 0;
    }
    
    protected boolean e() {
        return this.getChildCount() > 0;
    }
    
    public void f() {
        switch (this.l) {
            default: {}
            case 1: {
                this.g(1);
            }
            case 2: {
                this.g(2);
            }
            case 0: {
                this.g(0);
            }
        }
    }
    
    protected void f(final int n) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).offsetTopAndBottom(n);
        }
    }
    
    void g() {
        if (this.G != null) {
            this.G.onScroll((AbsListView)this, this.d, this.getChildCount(), this.D);
        }
    }
    
    void g(final int m) {
        if (m != this.m) {
            this.m = m;
            if (this.G != null) {
                this.G.onScrollStateChanged((AbsListView)this, m);
            }
        }
    }
    
    public ListAdapter getAdapter() {
        return this.h;
    }
    
    public int getCount() {
        return this.D;
    }
    
    protected int getFirstChildTop() {
        final boolean e = this.e();
        int top = 0;
        if (e) {
            top = this.getChildAt(0).getTop();
        }
        return top;
    }
    
    public int getFirstVisiblePosition() {
        return Math.max(0, this.d - this.getHeaderViewsCount());
    }
    
    public int getFooterViewsCount() {
        return this.p.size();
    }
    
    public int getHeaderViewsCount() {
        return this.o.size();
    }
    
    protected int getHighestChildTop() {
        final boolean e = this.e();
        int top = 0;
        if (e) {
            top = this.getChildAt(0).getTop();
        }
        return top;
    }
    
    protected int getLastChildBottom() {
        if (this.e()) {
            return this.getChildAt(-1 + this.getChildCount()).getBottom();
        }
        return 0;
    }
    
    public int getLastVisiblePosition() {
        final int n = -1 + (this.d + this.getChildCount());
        int n2;
        if (this.h != null) {
            n2 = -1 + this.h.getCount();
        }
        else {
            n2 = 0;
        }
        return Math.min(n, n2);
    }
    
    protected int getLowestChildBottom() {
        if (this.e()) {
            return this.getChildAt(-1 + this.getChildCount()).getBottom();
        }
        return 0;
    }
    
    public View getSelectedView() {
        return null;
    }
    
    void h() {
        if (this.getChildCount() > 0) {
            this.g = true;
            this.f = this.getHeight();
            final View child = this.getChildAt(0);
            final ListAdapter adapter = this.getAdapter();
            if (this.d >= 0 && this.d < adapter.getCount()) {
                this.e = adapter.getItemId(this.d);
            }
            else {
                this.e = -1L;
            }
            if (child != null) {
                this.b = child.getTop();
            }
            this.a = this.d;
        }
    }
    
    protected void handleDataChanged() {
        super.handleDataChanged();
        final int d = this.D;
        if (d > 0 && this.g) {
            this.g = false;
            this.j = null;
            this.k = 2;
            this.a = Math.min(Math.max(0, this.a), d - 1);
            return;
        }
        this.k = 1;
        this.g = false;
        this.j = null;
    }
    
    protected void layoutChildren() {
        if (this.B) {
            return;
        }
        int n;
        int childCount;
        View child;
        boolean c;
        while (true) {
            this.B = true;
            while (true) {
                Label_0418: {
                    try {
                        super.layoutChildren();
                        this.invalidate();
                        if (this.h == null) {
                            this.o();
                            this.g();
                            return;
                        }
                        n = this.getListPaddingTop();
                        childCount = this.getChildCount();
                        if (this.k != 0) {
                            break Label_0418;
                        }
                        child = this.getChildAt(0);
                        c = this.C;
                        if (c) {
                            this.handleDataChanged();
                        }
                        if (this.D == 0) {
                            this.o();
                            this.g();
                            return;
                        }
                        if (this.D != this.h.getCount()) {
                            throw new IllegalStateException("The content of the adapter has changed but ExtendableListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ExtendableListView(" + this.getId() + ", " + this.getClass() + ") with Adapter(" + this.h.getClass() + ")]");
                        }
                    }
                    finally {
                        this.B = false;
                    }
                    break;
                }
                child = null;
                continue;
            }
        }
        final int d = this.d;
        final j f = this.F;
        if (c) {
            for (int i = 0; i < childCount; ++i) {
                f.a(this.getChildAt(i), d + i);
            }
        }
        else {
            f.a(childCount, d);
        }
        this.detachAllViewsFromParent();
        f.d();
        switch (this.k) {
            default: {
                if (childCount == 0) {
                    this.k(n);
                    break;
                }
                if (this.d < this.D) {
                    final int d2 = this.d;
                    if (child != null) {
                        n = child.getTop();
                    }
                    this.f(d2, n);
                    break;
                }
                this.f(0, n);
                break;
            }
            case 1: {
                this.d = 0;
                this.a();
                this.i();
                this.k(n);
                this.i();
                break;
            }
            case 2: {
                this.f(this.a, this.b);
                break;
            }
        }
        f.e();
        this.C = false;
        this.g = false;
        this.k = 0;
        this.g();
        this.B = false;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null) {
            this.C = true;
            this.E = this.D;
            this.D = this.h.getCount();
        }
        this.A = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.b();
        if (this.J != null) {
            this.removeCallbacks((Runnable)this.J);
        }
        this.A = false;
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        Label_0012: {
            if (this.A) {
                switch (action & 0xFF) {
                    default: {
                        return false;
                    }
                    case 0: {
                        final int l = this.l;
                        final int v = (int)motionEvent.getX();
                        final int u = (int)motionEvent.getY();
                        this.z = motionEvent.getPointerId(0);
                        final int j = this.j(u);
                        if (l != 2 && j >= 0) {
                            this.v = v;
                            this.u = u;
                            this.x = j;
                            this.l = 3;
                        }
                        this.y = Integer.MIN_VALUE;
                        this.j();
                        this.n.addMovement(motionEvent);
                        if (l == 2) {
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        switch (this.l) {
                            default: {
                                return false;
                            }
                            case 3: {
                                int pointerIndex = motionEvent.findPointerIndex(this.z);
                                if (pointerIndex == -1) {
                                    this.z = motionEvent.getPointerId(0);
                                    pointerIndex = 0;
                                }
                                final int n = (int)motionEvent.getY(pointerIndex);
                                this.k();
                                this.n.addMovement(motionEvent);
                                if (this.h(n)) {
                                    return true;
                                }
                                break Label_0012;
                            }
                        }
                        break;
                    }
                    case 1:
                    case 3: {
                        this.l = 0;
                        this.z = -1;
                        this.l();
                        this.g(0);
                        return false;
                    }
                    case 6: {
                        this.h(motionEvent);
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.h == null) {
            return;
        }
        if (b) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).forceLayout();
            }
            this.F.a();
        }
        this.t = true;
        this.layoutChildren();
        this.t = false;
    }
    
    protected void onMeasure(final int i, final int n) {
        super.onMeasure(i, n);
        this.setMeasuredDimension(View$MeasureSpec.getSize(i), View$MeasureSpec.getSize(n));
        this.I = i;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final ExtendableListView$ListSavedState j = (ExtendableListView$ListSavedState)parcelable;
        super.onRestoreInstanceState(j.a());
        this.C = true;
        this.f = j.f;
        if (j.c >= 0L) {
            this.g = true;
            this.j = j;
            this.e = j.c;
            this.a = j.e;
            this.b = j.d;
        }
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final ExtendableListView$ListSavedState extendableListView$ListSavedState = new ExtendableListView$ListSavedState(super.onSaveInstanceState());
        if (this.j != null) {
            extendableListView$ListSavedState.b = this.j.b;
            extendableListView$ListSavedState.c = this.j.c;
            extendableListView$ListSavedState.d = this.j.d;
            extendableListView$ListSavedState.e = this.j.e;
            extendableListView$ListSavedState.f = this.j.f;
            return (Parcelable)extendableListView$ListSavedState;
        }
        boolean b;
        if (this.getChildCount() > 0 && this.D > 0) {
            b = true;
        }
        else {
            b = false;
        }
        extendableListView$ListSavedState.b = this.getSelectedItemId();
        extendableListView$ListSavedState.f = this.getHeight();
        if (b && this.d > 0) {
            extendableListView$ListSavedState.d = this.getChildAt(0).getTop();
            int d = this.d;
            if (d >= this.D) {
                d = -1 + this.D;
            }
            extendableListView$ListSavedState.e = d;
            extendableListView$ListSavedState.c = this.h.getItemId(d);
        }
        else {
            extendableListView$ListSavedState.d = 0;
            extendableListView$ListSavedState.c = -1L;
            extendableListView$ListSavedState.e = 0;
        }
        return (Parcelable)extendableListView$ListSavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        this.a(n, n2);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean b;
        if (!this.isEnabled()) {
            if (!this.isClickable()) {
                final boolean longClickable = this.isLongClickable();
                b = false;
                if (!longClickable) {
                    return b;
                }
            }
            b = true;
        }
        else {
            this.k();
            this.n.addMovement(motionEvent);
            final boolean e = this.e();
            b = false;
            if (e) {
                final int n = 0xFF & motionEvent.getAction();
                boolean b2 = false;
                switch (n) {
                    case 0: {
                        b2 = this.a(motionEvent);
                        break;
                    }
                    case 2: {
                        b2 = this.b(motionEvent);
                        break;
                    }
                    case 3: {
                        b2 = this.c(motionEvent);
                        break;
                    }
                    case 6: {
                        b2 = this.g(motionEvent);
                        break;
                    }
                    case 1: {
                        b2 = this.d(motionEvent);
                        break;
                    }
                }
                this.f();
                return b2;
            }
        }
        return b;
    }
    
    public void onWindowFocusChanged(final boolean b) {
    }
    
    public boolean removeFooterView(final View view) {
        if (!this.p.isEmpty()) {
            boolean b;
            if (this.h != null && ((l)this.h).b(view)) {
                if (this.H != null) {
                    this.H.onChanged();
                }
                b = true;
            }
            else {
                b = false;
            }
            this.a(view, this.p);
            return b;
        }
        return false;
    }
    
    public boolean removeHeaderView(final View view) {
        if (!this.o.isEmpty()) {
            boolean b;
            if (this.h != null && ((l)this.h).a(view)) {
                if (this.H != null) {
                    this.H.onChanged();
                }
                b = true;
            }
            else {
                b = false;
            }
            this.a(view, this.o);
            return b;
        }
        return false;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.l();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void requestLayout() {
        if (!this.B && !this.t) {
            super.requestLayout();
        }
    }
    
    public void setAdapter(final ListAdapter h) {
        if (this.h != null) {
            this.h.unregisterDataSetObserver((DataSetObserver)this.H);
        }
        if (!this.o.isEmpty() || !this.p.isEmpty()) {
            this.h = (ListAdapter)new l(this.o, this.p, h);
        }
        else {
            this.h = h;
        }
        this.C = true;
        int count;
        if (this.h != null) {
            count = this.h.getCount();
        }
        else {
            count = 0;
        }
        this.D = count;
        if (this.h != null) {
            this.h.registerDataSetObserver((DataSetObserver)this.H);
            this.F.a(this.h.getViewTypeCount());
        }
        this.requestLayout();
    }
    
    public void setClipToPadding(final boolean b) {
        super.setClipToPadding(b);
        this.c = b;
    }
    
    public void setOnScrollListener(final AbsListView$OnScrollListener absListView$OnScrollListener) {
        super.setOnScrollListener(absListView$OnScrollListener);
        this.G = absListView$OnScrollListener;
    }
    
    public void setSelection(final int a) {
        if (a >= 0) {
            this.k = 2;
            this.b = this.getListPaddingTop();
            this.d = 0;
            if (this.g) {
                this.a = a;
                this.e = this.h.getItemId(a);
            }
            this.requestLayout();
        }
    }
}
