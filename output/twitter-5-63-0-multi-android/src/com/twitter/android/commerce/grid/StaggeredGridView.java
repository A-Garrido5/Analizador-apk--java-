// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import java.util.Arrays;
import android.view.View;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseArray;

public class StaggeredGridView extends ExtendableListView
{
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private SparseArray p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private int[] v;
    private int[] w;
    private int[] x;
    private int y;
    
    public StaggeredGridView(final Context context) {
        this(context, null);
    }
    
    public StaggeredGridView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public StaggeredGridView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = 2;
        this.o = 3;
        this.u = true;
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.StaggeredGridView, n, 0);
            this.j = obtainStyledAttributes.getInteger(0, 0);
            if (this.j > 0) {
                this.n = this.j;
                this.o = this.j;
            }
            else {
                this.n = obtainStyledAttributes.getInteger(1, 2);
                this.o = obtainStyledAttributes.getInteger(2, 3);
            }
            this.k = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.q = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.r = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.s = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.t = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            obtainStyledAttributes.recycle();
        }
        this.j = 0;
        this.v = new int[0];
        this.w = new int[0];
        this.x = new int[0];
        this.p = new SparseArray();
    }
    
    private int b(final int n, final boolean b) {
        int n2 = this.n(n);
        final int j = this.j;
        if (n2 < 0 || n2 >= j) {
            if (!b) {
                return this.getLowestPositionedTopColumn();
            }
            n2 = this.getHighestPositionedBottomColumn();
        }
        return n2;
    }
    
    private void b(final View view, final int n, final boolean b, final int n2, final int n3) {
        final int n4 = this.n(n);
        final int h = this.h(n);
        final int childBottomMargin = this.getChildBottomMargin();
        final int n5 = h + childBottomMargin;
        int n8;
        int n9;
        if (b) {
            final int n6 = this.w[n4];
            final int n7 = n6 + (n5 + this.c(view));
            n8 = n6;
            n9 = n7;
        }
        else {
            final int n10 = this.v[n4];
            n8 = n10 - (n5 + this.c(view));
            n9 = n10;
        }
        this.e(((StaggeredGridView$GridLayoutParams)view.getLayoutParams()).e = n4, n9);
        this.d(n4, n8);
        view.layout(n2, n8 + h, n3, n9 - childBottomMargin);
    }
    
    private void b(final View view, final int n, final boolean b, final int n2, final int n3, final int n4, final int n5) {
        int lowestPositionedBottom;
        int highestPositionedTop;
        if (b) {
            lowestPositionedBottom = this.getLowestPositionedBottom();
            highestPositionedTop = lowestPositionedBottom + this.c(view);
        }
        else {
            highestPositionedTop = this.getHighestPositionedTop();
            lowestPositionedBottom = highestPositionedTop - this.c(view);
        }
        for (int i = 0; i < this.j; ++i) {
            this.d(i, lowestPositionedBottom);
            this.e(i, highestPositionedTop);
        }
        super.a(view, n, b, n2, lowestPositionedBottom, n4, highestPositionedTop);
    }
    
    private int c(final View view) {
        return view.getMeasuredHeight();
    }
    
    private void c(final View view, final int n, final boolean b, final int n2, final int n3) {
        int lowestPositionedBottom;
        int highestPositionedTop;
        if (b) {
            lowestPositionedBottom = this.getLowestPositionedBottom();
            highestPositionedTop = lowestPositionedBottom + this.c(view);
        }
        else {
            highestPositionedTop = this.getHighestPositionedTop();
            lowestPositionedBottom = highestPositionedTop - this.c(view);
        }
        for (int i = 0; i < this.j; ++i) {
            this.d(i, lowestPositionedBottom);
            this.e(i, highestPositionedTop);
        }
        super.a(view, n, b, n2, lowestPositionedBottom);
    }
    
    private void d(final int n, final int n2) {
        if (n2 < this.v[n]) {
            this.v[n] = n2;
        }
    }
    
    private void d(final View view, final int n, final boolean b, final int n2, final int n3) {
        final int n4 = this.n(n);
        final int h = this.h(n);
        final int n5 = h + this.getChildBottomMargin();
        int n8;
        int n9;
        if (b) {
            final int n6 = this.w[n4];
            final int n7 = n6 + (n5 + this.c(view));
            n8 = n6;
            n9 = n7;
        }
        else {
            final int n10 = this.v[n4];
            n8 = n10 - (n5 + this.c(view));
            n9 = n10;
        }
        this.e(((StaggeredGridView$GridLayoutParams)view.getLayoutParams()).e = n4, n9);
        this.d(n4, n8);
        super.a(view, n, b, n2, n8 + h);
    }
    
    private void e(final int n, final int n2) {
        if (n2 > this.w[n]) {
            this.w[n] = n2;
        }
    }
    
    private void f(final int n, final int n2) {
        if (n != 0) {
            final int[] v = this.v;
            v[n2] += n;
            final int[] w = this.w;
            w[n2] += n;
        }
    }
    
    private void g(final int n, final int a) {
        this.m(n).a = a;
    }
    
    private int getChildBottomMargin() {
        return this.k;
    }
    
    private int[] getHighestNonHeaderTops() {
        final int[] array = new int[this.j];
        final int childCount = this.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (child != null && child.getLayoutParams() != null && child.getLayoutParams() instanceof StaggeredGridView$GridLayoutParams) {
                    final StaggeredGridView$GridLayoutParams staggeredGridView$GridLayoutParams = (StaggeredGridView$GridLayoutParams)child.getLayoutParams();
                    if (staggeredGridView$GridLayoutParams.d != -2 && child.getTop() < array[staggeredGridView$GridLayoutParams.e]) {
                        array[staggeredGridView$GridLayoutParams.e] = child.getTop();
                    }
                }
            }
        }
        return array;
    }
    
    private int getHighestPositionedBottom() {
        return this.w[this.getHighestPositionedBottomColumn()];
    }
    
    private int getHighestPositionedBottomColumn() {
        int i = 0;
        int n = Integer.MAX_VALUE;
        int n2 = 0;
        while (i < this.j) {
            final int n3 = this.w[i];
            if (n3 < n) {
                n = n3;
                n2 = i;
            }
            ++i;
        }
        return n2;
    }
    
    private int getHighestPositionedTop() {
        return this.v[this.getHighestPositionedTopColumn()];
    }
    
    private int getHighestPositionedTopColumn() {
        int i = 0;
        int n = Integer.MAX_VALUE;
        int n2 = 0;
        while (i < this.j) {
            final int n3 = this.v[i];
            if (n3 < n) {
                n = n3;
                n2 = i;
            }
            ++i;
        }
        return n2;
    }
    
    private int getLowestPositionedBottom() {
        return this.w[this.getLowestPositionedBottomColumn()];
    }
    
    private int getLowestPositionedBottomColumn() {
        int i = 0;
        int n = Integer.MIN_VALUE;
        int n2 = 0;
        while (i < this.j) {
            final int n3 = this.w[i];
            if (n3 > n) {
                n = n3;
                n2 = i;
            }
            ++i;
        }
        return n2;
    }
    
    private int getLowestPositionedTop() {
        return this.v[this.getLowestPositionedTopColumn()];
    }
    
    private int getLowestPositionedTopColumn() {
        int i = 0;
        int n = Integer.MIN_VALUE;
        int n2 = 0;
        while (i < this.j) {
            final int n3 = this.v[i];
            if (n3 > n) {
                n = n3;
                n2 = i;
            }
            ++i;
        }
        return n2;
    }
    
    private int h(final int n) {
        int n2;
        if (n < this.getHeaderViewsCount() + this.j) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        int k = 0;
        if (n2 != 0) {
            k = this.k;
        }
        return k;
    }
    
    private void h(final int n, final int n2) {
        this.m(n).b = n2 / this.l;
    }
    
    private void i(final int n) {
        this.y += n;
    }
    
    private boolean i() {
        return this.getResources().getConfiguration().orientation == 2;
    }
    
    private void j() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child != null) {
                child.requestLayout();
            }
        }
    }
    
    private void j(final int n) {
        if (n != 0) {
            for (int i = 0; i < this.j; ++i) {
                this.f(n, i);
            }
        }
    }
    
    private int k(final int n) {
        return (n - (this.getRowPaddingLeft() + this.getRowPaddingRight()) - this.k * (1 + this.j)) / this.j;
    }
    
    private void k() {
        if (!this.m) {
            Arrays.fill(this.w, 0);
        }
        else {
            this.m = false;
        }
        System.arraycopy(this.v, 0, this.w, 0, this.j);
    }
    
    private int l(final int n) {
        return this.getRowPaddingLeft() + this.k + n * (this.k + this.l);
    }
    
    private void l() {
        if (this.d == this.getHeaderViewsCount()) {
            final int[] highestNonHeaderTops = this.getHighestNonHeaderTops();
            int n = 1;
            int n2 = -1;
            int n3 = Integer.MAX_VALUE;
            for (int i = 0; i < highestNonHeaderTops.length; ++i) {
                if (n != 0 && i > 0 && highestNonHeaderTops[i] != n3) {
                    n = 0;
                }
                if (highestNonHeaderTops[i] < n3) {
                    n3 = highestNonHeaderTops[i];
                    n2 = i;
                }
            }
            int j = 0;
            if (n == 0) {
                while (j < highestNonHeaderTops.length) {
                    if (j != n2) {
                        this.c(n3 - highestNonHeaderTops[j], j);
                    }
                    ++j;
                }
                this.invalidate();
            }
        }
    }
    
    private StaggeredGridView$GridItemRecord m(final int n) {
        StaggeredGridView$GridItemRecord staggeredGridView$GridItemRecord = (StaggeredGridView$GridItemRecord)this.p.get(n, (Object)null);
        if (staggeredGridView$GridItemRecord == null) {
            staggeredGridView$GridItemRecord = new StaggeredGridView$GridItemRecord();
            this.p.append(n, (Object)staggeredGridView$GridItemRecord);
        }
        return staggeredGridView$GridItemRecord;
    }
    
    private void m() {
        final int min = Math.min(this.a, -1 + this.getCount());
        final SparseArray sparseArray = new SparseArray(min);
        for (int i = 0; i < min; ++i) {
            final StaggeredGridView$GridItemRecord staggeredGridView$GridItemRecord = (StaggeredGridView$GridItemRecord)this.p.get(i);
            if (staggeredGridView$GridItemRecord == null) {
                break;
            }
            Log.d("StaggeredGridView", "onColumnSync:" + i + " ratio:" + staggeredGridView$GridItemRecord.b);
            sparseArray.append(i, (Object)staggeredGridView$GridItemRecord.b);
        }
        this.p.clear();
        for (int j = 0; j < min; ++j) {
            final Double n = (Double)sparseArray.get(j);
            if (n == null) {
                break;
            }
            final StaggeredGridView$GridItemRecord m = this.m(j);
            final int n2 = (int)(this.l * n);
            m.b = n;
            if (this.o(j)) {
                final int lowestPositionedBottom = this.getLowestPositionedBottom();
                final int n3 = n2 + lowestPositionedBottom;
                for (int k = 0; k < this.j; ++k) {
                    this.v[k] = lowestPositionedBottom;
                    this.w[k] = n3;
                }
            }
            else {
                final int highestPositionedBottomColumn = this.getHighestPositionedBottomColumn();
                final int n4 = this.w[highestPositionedBottomColumn];
                final int n5 = n2 + n4 + this.h(j) + this.getChildBottomMargin();
                this.v[highestPositionedBottomColumn] = n4;
                this.w[highestPositionedBottomColumn] = n5;
                m.a = highestPositionedBottomColumn;
            }
        }
        final int highestPositionedBottomColumn2 = this.getHighestPositionedBottomColumn();
        this.g(min, highestPositionedBottomColumn2);
        final int n6 = this.w[highestPositionedBottomColumn2];
        this.j(-n6 + this.b);
        this.y = -n6;
        System.arraycopy(this.w, 0, this.v, 0, this.j);
    }
    
    private int n(final int n) {
        final StaggeredGridView$GridItemRecord staggeredGridView$GridItemRecord = (StaggeredGridView$GridItemRecord)this.p.get(n, (Object)null);
        if (staggeredGridView$GridItemRecord != null) {
            return staggeredGridView$GridItemRecord.a;
        }
        return -1;
    }
    
    private void n() {
        this.o();
        this.p();
    }
    
    private void o() {
        Arrays.fill(this.v, this.getPaddingTop() + this.s);
    }
    
    private boolean o(final int n) {
        return this.h.getItemViewType(n) == -2;
    }
    
    private void p() {
        Arrays.fill(this.w, this.getPaddingTop() + this.s);
    }
    
    private void q() {
        for (int i = 0; i < this.j; ++i) {
            this.x[i] = this.l(i);
        }
    }
    
    private void setPositionIsHeaderFooter(final int n) {
        this.m(n).c = true;
    }
    
    @Override
    protected int a(final int n) {
        if (this.o(n)) {
            return super.a(n);
        }
        return this.x[this.n(n)];
    }
    
    @Override
    protected ExtendableListView$LayoutParams a(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        ExtendableListView$LayoutParams extendableListView$LayoutParams;
        if (layoutParams != null) {
            if (layoutParams instanceof StaggeredGridView$GridLayoutParams) {
                extendableListView$LayoutParams = (StaggeredGridView$GridLayoutParams)layoutParams;
            }
            else {
                extendableListView$LayoutParams = new StaggeredGridView$GridLayoutParams(layoutParams);
            }
        }
        else {
            extendableListView$LayoutParams = null;
        }
        if (extendableListView$LayoutParams == null) {
            extendableListView$LayoutParams = new StaggeredGridView$GridLayoutParams(this.l, -2);
        }
        return extendableListView$LayoutParams;
    }
    
    @Override
    public void a() {
        if (this.j > 0) {
            if (this.v == null) {
                this.v = new int[this.j];
            }
            if (this.w == null) {
                this.w = new int[this.j];
            }
            this.n();
            this.p.clear();
            this.m = false;
            this.setSelection(this.y = 0);
        }
    }
    
    @Override
    protected void a(final int n, final int n2) {
        super.a(n, n2);
        int j;
        if (this.i()) {
            j = this.o;
        }
        else {
            j = this.n;
        }
        if (this.j != j) {
            this.j = j;
            this.l = this.k(n);
            this.v = new int[this.j];
            this.w = new int[this.j];
            this.x = new int[this.j];
            this.y = 0;
            this.n();
            this.q();
            if (this.getCount() > 0 && this.p.size() > 0) {
                this.m();
            }
            this.requestLayout();
        }
    }
    
    @Override
    protected void a(final int positionIsHeaderFooter, final boolean b) {
        super.a(positionIsHeaderFooter, b);
        if (!this.o(positionIsHeaderFooter)) {
            this.g(positionIsHeaderFooter, this.b(positionIsHeaderFooter, b));
            return;
        }
        this.setPositionIsHeaderFooter(positionIsHeaderFooter);
    }
    
    @Override
    protected void a(final View view, final int n, final boolean b, final int n2, final int n3) {
        if (this.o(n)) {
            this.c(view, n, b, n2, n3);
            return;
        }
        this.d(view, n, b, n2, n3);
    }
    
    @Override
    protected void a(final View view, final int n, final boolean b, final int n2, final int n3, final int n4, final int n5) {
        if (this.o(n)) {
            this.b(view, n, b, n2, n3, n4, n5);
            return;
        }
        this.b(view, n, b, n2, n4);
    }
    
    @Override
    protected void a(final View view, final ExtendableListView$LayoutParams extendableListView$LayoutParams) {
        final int d = extendableListView$LayoutParams.d;
        final int b = extendableListView$LayoutParams.b;
        if (d == -2 || d == -1) {
            super.a(view, extendableListView$LayoutParams);
        }
        else {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.l, 1073741824);
            int n;
            if (extendableListView$LayoutParams.height > 0) {
                n = View$MeasureSpec.makeMeasureSpec(extendableListView$LayoutParams.height, 1073741824);
            }
            else {
                n = View$MeasureSpec.makeMeasureSpec(-2, 0);
            }
            view.measure(measureSpec, n);
        }
        this.h(b, this.c(view));
    }
    
    @Override
    protected int b(final int n) {
        if (this.o(n)) {
            return super.b(n);
        }
        final int n2 = this.n(n);
        if (n2 == -1) {
            return this.getHighestPositionedBottom();
        }
        return this.w[n2];
    }
    
    @Override
    protected void b(final int n, final int n2) {
        super.b(n, n2);
        Arrays.fill(this.v, Integer.MAX_VALUE);
        Arrays.fill(this.w, 0);
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child != null) {
                final ExtendableListView$LayoutParams extendableListView$LayoutParams = (ExtendableListView$LayoutParams)child.getLayoutParams();
                if (extendableListView$LayoutParams.d != -2 && extendableListView$LayoutParams instanceof StaggeredGridView$GridLayoutParams) {
                    final StaggeredGridView$GridLayoutParams staggeredGridView$GridLayoutParams = (StaggeredGridView$GridLayoutParams)extendableListView$LayoutParams;
                    final int e = staggeredGridView$GridLayoutParams.e;
                    final int b = staggeredGridView$GridLayoutParams.b;
                    final int top = child.getTop();
                    if (top < this.v[e]) {
                        this.v[e] = top - this.h(b);
                    }
                    final int bottom = child.getBottom();
                    if (bottom > this.w[e]) {
                        this.w[e] = bottom + this.getChildBottomMargin();
                    }
                }
                else {
                    final int top2 = child.getTop();
                    final int bottom2 = child.getBottom();
                    for (int j = 0; j < this.j; ++j) {
                        if (top2 < this.v[j]) {
                            this.v[j] = top2;
                        }
                        if (bottom2 > this.w[j]) {
                            this.w[j] = bottom2;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    protected void b(final boolean b) {
        super.b(b);
        if (!b) {
            this.l();
        }
    }
    
    @Override
    protected int c(final int n) {
        if (this.o(n)) {
            return super.c(n);
        }
        final int n2 = this.n(n);
        if (n2 == -1) {
            return this.getLowestPositionedTop();
        }
        return this.v[n2];
    }
    
    protected void c(final int n, final int n2) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child != null && child.getLayoutParams() != null && child.getLayoutParams() instanceof StaggeredGridView$GridLayoutParams && ((StaggeredGridView$GridLayoutParams)child.getLayoutParams()).e == n2) {
                child.offsetTopAndBottom(n);
            }
        }
        this.f(n, n2);
    }
    
    @Override
    protected boolean c() {
        int rowPaddingTop;
        if (this.c) {
            rowPaddingTop = this.getRowPaddingTop();
        }
        else {
            rowPaddingTop = 0;
        }
        final int lowestPositionedTop = this.getLowestPositionedTop();
        boolean b = false;
        if (lowestPositionedTop > rowPaddingTop) {
            b = true;
        }
        return b;
    }
    
    @Override
    protected int d(final int n) {
        if (this.o(n)) {
            return super.d(n);
        }
        return this.getHighestPositionedBottom();
    }
    
    @Override
    protected int e(final int n) {
        if (this.o(n)) {
            return super.e(n);
        }
        return this.getLowestPositionedTop();
    }
    
    @Override
    protected void f(final int n) {
        super.f(n);
        this.j(n);
        this.i(n);
    }
    
    public int getColumnWidth() {
        return this.l;
    }
    
    public int getDistanceToTop() {
        return this.y;
    }
    
    @Override
    protected int getFirstChildTop() {
        if (this.o(this.d)) {
            return super.getFirstChildTop();
        }
        return this.getLowestPositionedTop();
    }
    
    @Override
    protected int getHighestChildTop() {
        if (this.o(this.d)) {
            return super.getHighestChildTop();
        }
        return this.getHighestPositionedTop();
    }
    
    @Override
    protected int getLastChildBottom() {
        if (this.o(this.d + (-1 + this.getChildCount()))) {
            return super.getLastChildBottom();
        }
        return this.getHighestPositionedBottom();
    }
    
    @Override
    protected int getLowestChildBottom() {
        if (this.o(this.d + (-1 + this.getChildCount()))) {
            return super.getLowestChildBottom();
        }
        return this.getLowestPositionedBottom();
    }
    
    public int getRowPaddingBottom() {
        return this.getListPaddingBottom() + this.t;
    }
    
    public int getRowPaddingLeft() {
        return this.getListPaddingLeft() + this.q;
    }
    
    public int getRowPaddingRight() {
        return this.getListPaddingRight() + this.r;
    }
    
    public int getRowPaddingTop() {
        return this.getListPaddingTop() + this.s;
    }
    
    @Override
    protected void layoutChildren() {
        this.k();
        super.layoutChildren();
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return !this.u || super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.j <= 0) {
            int j;
            if (this.i()) {
                j = this.o;
            }
            else {
                j = this.n;
            }
            this.j = j;
        }
        this.l = this.k(this.getMeasuredWidth());
        if (this.v == null || this.v.length != this.j) {
            this.v = new int[this.j];
            this.o();
        }
        if (this.w == null || this.w.length != this.j) {
            this.w = new int[this.j];
            this.p();
        }
        if (this.x == null || this.x.length != this.j) {
            this.x = new int[this.j];
            this.q();
        }
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final StaggeredGridView$GridListSavedState staggeredGridView$GridListSavedState = (StaggeredGridView$GridListSavedState)parcelable;
        this.j = staggeredGridView$GridListSavedState.h;
        this.v = staggeredGridView$GridListSavedState.i;
        this.w = new int[this.j];
        this.p = staggeredGridView$GridListSavedState.j;
        this.m = true;
        super.onRestoreInstanceState((Parcelable)staggeredGridView$GridListSavedState);
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        final ExtendableListView$ListSavedState extendableListView$ListSavedState = (ExtendableListView$ListSavedState)super.onSaveInstanceState();
        final StaggeredGridView$GridListSavedState staggeredGridView$GridListSavedState = new StaggeredGridView$GridListSavedState(extendableListView$ListSavedState.a());
        staggeredGridView$GridListSavedState.b = extendableListView$ListSavedState.b;
        staggeredGridView$GridListSavedState.c = extendableListView$ListSavedState.c;
        staggeredGridView$GridListSavedState.d = extendableListView$ListSavedState.d;
        staggeredGridView$GridListSavedState.e = extendableListView$ListSavedState.e;
        staggeredGridView$GridListSavedState.f = extendableListView$ListSavedState.f;
        boolean b;
        if (this.getChildCount() > 0 && this.getCount() > 0) {
            b = true;
        }
        else {
            b = false;
        }
        if (b && this.d > 0) {
            staggeredGridView$GridListSavedState.h = this.j;
            staggeredGridView$GridListSavedState.i = this.v;
            staggeredGridView$GridListSavedState.j = this.p;
            return (Parcelable)staggeredGridView$GridListSavedState;
        }
        int j;
        if (this.j >= 0) {
            j = this.j;
        }
        else {
            j = 0;
        }
        staggeredGridView$GridListSavedState.h = j;
        staggeredGridView$GridListSavedState.i = new int[staggeredGridView$GridListSavedState.h];
        staggeredGridView$GridListSavedState.j = new SparseArray();
        return (Parcelable)staggeredGridView$GridListSavedState;
    }
    
    @Override
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a(n, n2);
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return !this.u || super.onTouchEvent(motionEvent);
    }
    
    public void setColumnCount(final int n) {
        this.n = n;
        this.o = n;
        this.a(this.getWidth(), this.getHeight());
        this.j();
    }
    
    public void setColumnCountLandscape(final int o) {
        this.o = o;
        this.a(this.getWidth(), this.getHeight());
        this.j();
    }
    
    public void setColumnCountPortrait(final int n) {
        this.n = n;
        this.a(this.getWidth(), this.getHeight());
        this.j();
    }
    
    public void setScrollable(final boolean u) {
        this.u = u;
    }
}
