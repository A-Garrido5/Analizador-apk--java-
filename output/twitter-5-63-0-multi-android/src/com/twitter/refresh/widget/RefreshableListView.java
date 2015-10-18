// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.refresh.widget;

import android.widget.ListAdapter;
import android.widget.Adapter;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.widget.ListView$FixedViewInfo;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import java.util.ArrayList;
import android.widget.ListView;

public class RefreshableListView extends ListView implements j
{
    private final String A;
    private final String B;
    private int C;
    private boolean D;
    private boolean E;
    private final ArrayList F;
    private final ArrayList G;
    private int H;
    private c I;
    final Scroller a;
    final RelativeLayout b;
    int c;
    private final i d;
    private final Animation e;
    private final Animation f;
    private final ProgressBar g;
    private final ImageView h;
    private final TextView i;
    private final View j;
    private boolean k;
    private View l;
    private TextView m;
    private final int n;
    private boolean o;
    private g p;
    private f q;
    private d r;
    private e s;
    private final int t;
    private int u;
    private int v;
    private final int w;
    private int x;
    private int y;
    private final String z;
    
    public RefreshableListView(final Context context) {
        this(context, null);
    }
    
    public RefreshableListView(final Context context, final AttributeSet set) {
        this(context, set, xe.refreshableListViewStyle);
    }
    
    public RefreshableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.y = 0;
        this.F = new ArrayList();
        this.G = new ArrayList();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xg.RefreshableListView, n, 0);
        this.t = obtainStyledAttributes.getColor(xg.RefreshableListView_pullBackgroundColor, -1);
        final int resourceId = obtainStyledAttributes.getResourceId(xg.RefreshableListView_pullDivider, 0);
        this.a = new Scroller(context);
        this.d = new i(this);
        this.e = AnimationUtils.loadAnimation(context, obtainStyledAttributes.getResourceId(xg.RefreshableListView_rotateUpAnim, 0));
        this.f = AnimationUtils.loadAnimation(context, obtainStyledAttributes.getResourceId(xg.RefreshableListView_rotateDownAnim, 0));
        final RelativeLayout b = (RelativeLayout)LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(xg.RefreshableListView_refreshHeader, 0), (ViewGroup)this, false);
        if (resourceId != 0) {
            final View viewById = b.findViewById(xf.refresh_divider);
            viewById.setBackgroundResource(resourceId);
            viewById.setVisibility(0);
        }
        this.g = (ProgressBar)b.findViewById(xf.refresh_loading);
        this.h = (ImageView)b.findViewById(xf.refresh_icon);
        this.i = (TextView)b.findViewById(xf.refresh_text);
        this.b = b;
        (this.j = new View(context)).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, 0, -1));
        this.w = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        b.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(layoutParams.width, layoutParams.height, -1));
        this.n = obtainStyledAttributes.getResourceId(xg.RefreshableListView_refreshFooter, 0);
        this.z = obtainStyledAttributes.getString(xg.RefreshableListView_loadingText);
        this.A = obtainStyledAttributes.getString(xg.RefreshableListView_pullText);
        this.B = obtainStyledAttributes.getString(xg.RefreshableListView_releaseText);
        this.H = obtainStyledAttributes.getInt(xg.RefreshableListView_pullHeaderPosition, -1);
        this.k = obtainStyledAttributes.getBoolean(xg.RefreshableListView_pullAfterHeaders, false);
        this.o = obtainStyledAttributes.getBoolean(xg.RefreshableListView_enablePullToRefresh, true);
        obtainStyledAttributes.recycle();
    }
    
    private void a(final int n) {
        if (n > 0) {
            this.d.a(n);
        }
    }
    
    private void a(final ArrayList list) {
        if (list != null) {
            for (final ListView$FixedViewInfo listView$FixedViewInfo : list) {
                final AbsListView$LayoutParams absListView$LayoutParams = (AbsListView$LayoutParams)listView$FixedViewInfo.view.getLayoutParams();
                if (absListView$LayoutParams != null) {
                    listView$FixedViewInfo.view.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(absListView$LayoutParams.width, absListView$LayoutParams.height, -2));
                }
            }
        }
    }
    
    private boolean g() {
        return this.r != null;
    }
    
    View a(final ArrayList list, final int n) {
        if (list != null) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View viewById = list.get(i).view.findViewById(n);
                if (viewById != null) {
                    return viewById;
                }
            }
        }
        return null;
    }
    
    View a(final ArrayList list, final Object o) {
        if (list != null) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View viewWithTag = list.get(i).view.findViewWithTag(o);
                if (viewWithTag != null) {
                    return viewWithTag;
                }
            }
        }
        return null;
    }
    
    void a(int i, final int n) {
        while (i < this.getChildCount()) {
            this.getChildAt(i).offsetTopAndBottom(n);
            ++i;
        }
    }
    
    public void a(final int n, final View view, final Object data, final boolean isSelectable) {
        if (this.g() && this.o) {
            final ListView$FixedViewInfo listView$FixedViewInfo = new ListView$FixedViewInfo((ListView)this);
            listView$FixedViewInfo.view = view;
            listView$FixedViewInfo.data = data;
            listView$FixedViewInfo.isSelectable = isSelectable;
            this.F.add(n, listView$FixedViewInfo);
            return;
        }
        super.addHeaderView(view, data, isSelectable);
    }
    
    public void a(final b refreshVisibilityListener) {
        this.setRefreshListener(refreshVisibilityListener);
        this.setRefreshDataProvider(refreshVisibilityListener);
        this.setRefreshVisibilityListener(refreshVisibilityListener);
    }
    
    public void a(final boolean b) {
        if (b) {
            this.l.setVisibility(0);
            this.m.setVisibility(8);
            return;
        }
        this.l.setVisibility(8);
        this.m.setVisibility(0);
    }
    
    public boolean a() {
        return this.E;
    }
    
    public void addFooterView(final View view, final Object data, final boolean isSelectable) {
        if (this.g()) {
            final ListView$FixedViewInfo listView$FixedViewInfo = new ListView$FixedViewInfo((ListView)this);
            listView$FixedViewInfo.view = view;
            listView$FixedViewInfo.data = data;
            listView$FixedViewInfo.isSelectable = isSelectable;
            this.G.add(listView$FixedViewInfo);
            return;
        }
        super.addFooterView(view, data, isSelectable);
    }
    
    public void addHeaderView(final View view, final Object o, final boolean b) {
        this.a(this.F.size(), view, o, b);
    }
    
    public void b() {
        if (!this.g() || !this.o) {
            return;
        }
        this.h.clearAnimation();
        this.h.setVisibility(4);
        this.g.setVisibility(0);
        this.i.setText((CharSequence)this.z);
        this.setMode(32);
        if (!this.c(2)) {
            this.q.onChanged();
        }
        this.setVisible(true);
    }
    
    void b(final int n) {
        this.C &= ~n;
    }
    
    void b(final int n, final int n2) {
        int mode = 1;
        final RelativeLayout b = this.b;
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        final boolean c = this.c(mode);
        if (c) {
            this.attachViewToParent((View)b, n, layoutParams);
        }
        else {
            this.addViewInLayout((View)b, n, layoutParams, (boolean)(mode != 0));
            this.setMode(mode);
        }
        this.setMode(2);
        if (c && !b.isLayoutRequested()) {
            mode = 0;
        }
        if (mode != 0) {
            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.x, this.getListPaddingLeft() + this.getListPaddingRight(), layoutParams.width);
            final int height = layoutParams.height;
            int n3;
            if (height > 0) {
                n3 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
            else {
                n3 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            b.measure(childMeasureSpec, n3);
        }
        else {
            this.cleanupLayoutState((View)b);
        }
        final int measuredWidth = b.getMeasuredWidth();
        final int measuredHeight = b.getMeasuredHeight();
        final int n4 = n2 - measuredHeight;
        final int listPaddingLeft = this.getListPaddingLeft();
        if (mode != 0) {
            b.layout(listPaddingLeft, n4, measuredWidth + listPaddingLeft, n4 + measuredHeight);
        }
        else {
            b.offsetLeftAndRight(listPaddingLeft - b.getLeft());
            b.offsetTopAndBottom(n4 - b.getTop());
        }
        this.q.onChanged();
        if (this.s != null) {
            this.s.k_();
        }
    }
    
    public void c() {
        final d r = this.r;
        if (r != null && this.c(32)) {
            this.h.setVisibility(0);
            this.g.setVisibility(4);
            this.i.setText((CharSequence)this.A);
            final int firstVisiblePosition = this.getFirstVisiblePosition();
            final boolean c = this.c(2);
            final c i = this.I;
            int c2;
            int a;
            long b;
            if (i != null) {
                final a e = i.E();
                c2 = e.c;
                a = e.a;
                b = e.b;
            }
            else {
                b = Long.MIN_VALUE;
                a = 0;
                c2 = 0;
            }
            r.f();
            int a2;
            if (b != Long.MIN_VALUE) {
                a2 = i.a(b);
            }
            else {
                a2 = -1;
            }
            this.b(32);
            if (a2 != a) {
                r.ak();
                if (c) {
                    this.d();
                }
                else {
                    this.q.onChanged();
                }
                if (a2 != -1) {
                    this.setSelectionFromTop(a2, c2);
                }
                this.setVisible(false);
                return;
            }
            r.al();
            if (this.getChildCount() > 0) {
                final int refreshHeaderPosition = this.getRefreshHeaderPosition();
                if (firstVisiblePosition != 0 || !this.isInTouchMode()) {
                    if (c) {
                        this.d();
                    }
                    else {
                        this.q.onChanged();
                    }
                    this.setSelectionFromTop(a, c2);
                    this.setVisible(false);
                    return;
                }
                final int n = refreshHeaderPosition - firstVisiblePosition;
                int n2;
                if (n > 0) {
                    n2 = this.getChildAt(n - 1).getBottom();
                }
                else {
                    n2 = this.getListPaddingTop();
                }
                this.a(this.getChildAt(n).getBottom() - n2);
            }
        }
    }
    
    boolean c(final int n) {
        return (n & this.C) != 0x0;
    }
    
    protected int computeVerticalScrollOffset() {
        if (this.isSmoothScrollbarEnabled() && this.c(2)) {
            final int firstVisiblePosition = this.getFirstVisiblePosition();
            final int childCount = this.getChildCount();
            final int c = this.c;
            int n;
            if (this.o) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int n2 = c - n;
            int max = 0;
            if (n2 > 0) {
                max = 0;
                if (firstVisiblePosition >= 1) {
                    max = 0;
                    if (childCount > 0) {
                        final View child = this.getChildAt(0);
                        final int top = child.getTop();
                        final int height = child.getHeight();
                        max = 0;
                        if (height > 0) {
                            max = Math.max(100 * (firstVisiblePosition - 1) - top * 100 / height + (int)(100.0f * (this.getScrollY() / this.getHeight() * n2)), 0);
                        }
                    }
                }
            }
            return max;
        }
        return super.computeVerticalScrollOffset();
    }
    
    protected int computeVerticalScrollRange() {
        if (this.isSmoothScrollbarEnabled() && this.c(2)) {
            final int c = this.c;
            int n;
            if (this.o) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int n2 = c - n;
            final int scrollY = this.getScrollY();
            int max = Math.max(n2 * 100, 0);
            if (scrollY != 0) {
                max += Math.abs((int)(100.0f * (scrollY / this.getHeight() * n2)));
            }
            return max;
        }
        return super.computeVerticalScrollRange();
    }
    
    void d() {
        if (this.c(2)) {
            if (this == this.b.getParent()) {
                this.detachViewFromParent((View)this.b);
            }
            this.b(94);
            this.q.onChanged();
            if (this.s != null) {
                this.s.af_();
            }
        }
    }
    
    protected void detachViewsFromParent(final int n, final int n2) {
        if (this.c(4)) {
            return;
        }
        super.detachViewsFromParent(n, n2);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        if (this.g() && view == this.b) {
            final int n2 = this.getRefreshHeaderPosition() - this.getFirstVisiblePosition();
            int n3;
            if (n2 > 0) {
                n3 = this.getChildAt(n2 - 1).getBottom();
            }
            else {
                n3 = this.getScrollY();
            }
            final int scrollX = this.getScrollX();
            final int save = canvas.save();
            canvas.clipRect(scrollX, n3, scrollX + this.getWidth(), view.getBottom());
            canvas.drawColor(this.t);
            final boolean drawChild = super.drawChild(canvas, view, n);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, n);
    }
    
    @TargetApi(8)
    public boolean e() {
        final int y = this.y;
        if (Build$VERSION.SDK_INT <= 7) {
            this.setSelection(y);
            return true;
        }
        final int firstVisiblePosition = this.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            if (firstVisiblePosition > 15) {
                this.setSelectionFromTop(y, this.getListPaddingTop());
            }
            this.smoothScrollToPosition(y);
            return true;
        }
        return false;
    }
    
    void f() {
        if (!this.g()) {
            return;
        }
        final int a = this.p.a();
        int n;
        if (this.o) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.c = n + a;
    }
    
    protected View findViewTraversal(final int n) {
        View view = super.findViewTraversal(n);
        if (view == null) {
            view = this.a(this.F, n);
        }
        if (view != null) {
            return view;
        }
        return this.a(this.G, n);
    }
    
    protected View findViewWithTagTraversal(final Object o) {
        View view = super.findViewWithTagTraversal(o);
        if (view == null) {
            view = this.a(this.F, o);
        }
        if (view != null) {
            return view;
        }
        return this.a(this.G, o);
    }
    
    public int getFooterViewsCount() {
        if (this.g()) {
            return this.G.size();
        }
        return super.getFooterViewsCount();
    }
    
    public int getHeaderViewsCount() {
        if (this.g() && this.o) {
            return 1 + this.F.size();
        }
        return super.getHeaderViewsCount();
    }
    
    public int getRefreshHeaderPosition() {
        int size;
        if (!this.g() || !this.o) {
            size = 0;
        }
        else {
            size = this.F.size();
            if (this.H != -1 && this.H < size + 1 && this.H < this.c) {
                return this.H;
            }
            if (!this.k || size >= this.c) {
                return 0;
            }
        }
        return size;
    }
    
    protected void layoutChildren() {
        if (!this.g()) {
            super.layoutChildren();
        }
        else if (!this.c(12)) {
            if (this.c == 0) {
                this.a(this.F);
                this.a(this.G);
            }
            super.layoutChildren();
        }
    }
    
    protected void onAttachedToWindow() {
        if (this.g() && this.p != null) {
            this.p.b();
            this.f();
        }
        this.D = true;
        super.onAttachedToWindow();
    }
    
    protected void onDetachedFromWindow() {
        if (this.g()) {
            if (this.p != null) {
                this.p.c();
            }
            this.removeCallbacks((Runnable)this.d);
        }
        this.D = false;
        super.onDetachedFromWindow();
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        if (this.g() && !this.D && b && this.getSelectedItemPosition() < 0 && !this.isInTouchMode() && this.p != null) {
            this.f();
        }
        super.onFocusChanged(b, n, rect);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.g() || !this.o) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        final int n = (int)motionEvent.getY();
        final int n2 = n - this.u;
        switch (motionEvent.getAction()) {
            case 0: {
                this.u = n;
                this.v = Integer.MIN_VALUE;
                break;
            }
            case 2: {
                this.v = n;
                if (this.c(32) || this.getFirstVisiblePosition() != 0) {
                    break;
                }
                final int firstVisiblePosition = this.getFirstVisiblePosition();
                final int n3 = this.getRefreshHeaderPosition() - firstVisiblePosition;
                if (firstVisiblePosition != 0 || n3 < 0 || n3 >= this.getChildCount()) {
                    break;
                }
                final View child = this.getChildAt(n3 + 1);
                int top;
                if (child != null) {
                    top = child.getTop();
                }
                else {
                    top = 0;
                }
                boolean b;
                int n4;
                if (n3 > 0) {
                    final View child2 = this.getChildAt(0);
                    b = false;
                    if (child2 != null) {
                        final int top2 = child2.getTop();
                        final int listPaddingTop = this.getListPaddingTop();
                        b = false;
                        if (top2 >= listPaddingTop) {
                            b = true;
                        }
                    }
                    n4 = this.getChildAt(n3 - 1).getBottom();
                }
                else {
                    n4 = this.getListPaddingTop();
                    b = true;
                }
                if (b && top >= n4 && n2 > this.w) {
                    return true;
                }
                break;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    protected void onMeasure(final int x, final int n) {
        this.f();
        super.onMeasure(this.x = x, n);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final RefreshableListView$SavedState refreshableListView$SavedState = (RefreshableListView$SavedState)parcelable;
        super.onRestoreInstanceState(refreshableListView$SavedState.getSuperState());
        this.H = refreshableListView$SavedState.c;
        if (refreshableListView$SavedState.a && refreshableListView$SavedState.b) {
            this.setMode(32);
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final RefreshableListView$SavedState refreshableListView$SavedState = new RefreshableListView$SavedState(super.onSaveInstanceState());
        refreshableListView$SavedState.a = this.g();
        refreshableListView$SavedState.b = this.c(32);
        refreshableListView$SavedState.c = this.H;
        return (Parcelable)refreshableListView$SavedState;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean onTouchEvent;
        if (!this.g() || !this.o) {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        else {
            final int n = 0xFF & motionEvent.getAction();
            final boolean c = this.c(8);
            onTouchEvent = false;
            if (!c) {
                final int v = (int)motionEvent.getY();
                final int n2 = v - this.u;
                switch (n) {
                    case 0: {
                        this.u = v;
                        this.v = Integer.MIN_VALUE;
                        this.setMode(64);
                        break;
                    }
                    case 1: {
                        this.b(20);
                        if (this.c(32) || !this.c(2) || this.getFirstVisiblePosition() != 0) {
                            break;
                        }
                        final int refreshHeaderPosition = this.getRefreshHeaderPosition();
                        int n3;
                        if (refreshHeaderPosition > 0) {
                            n3 = this.getChildAt(refreshHeaderPosition - 1).getBottom();
                        }
                        else {
                            n3 = this.getListPaddingTop();
                        }
                        final View child = this.getChildAt(refreshHeaderPosition);
                        if (child == null) {
                            break;
                        }
                        final int top = child.getTop();
                        final int bottom = child.getBottom();
                        if (top > n3) {
                            this.r.c(true);
                            this.a(top - n3);
                            break;
                        }
                        if (bottom > n3) {
                            this.r.c(false);
                            this.a(bottom - n3);
                            break;
                        }
                        this.d();
                        break;
                    }
                    case 2: {
                        if (this.c(32)) {
                            this.v = v;
                            break;
                        }
                        int n4;
                        if (this.v != Integer.MIN_VALUE) {
                            n4 = v - this.v;
                        }
                        else {
                            n4 = n2;
                        }
                        boolean b;
                        if (v >= this.v) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        this.v = v;
                        final int firstVisiblePosition = this.getFirstVisiblePosition();
                        final int n5 = this.getRefreshHeaderPosition() - firstVisiblePosition;
                        if (firstVisiblePosition == 0 && n5 >= 0 && n5 < this.getChildCount()) {
                            final View child2 = this.getChildAt(n5 + 1);
                            int top2;
                            if (child2 != null) {
                                top2 = child2.getTop();
                            }
                            else {
                                top2 = 0;
                            }
                            boolean b2;
                            int n6;
                            if (n5 > 0) {
                                final View child3 = this.getChildAt(0);
                                if (child3 != null && child3.getTop() >= this.getListPaddingTop()) {
                                    b2 = true;
                                }
                                else {
                                    b2 = false;
                                }
                                n6 = this.getChildAt(n5 - 1).getBottom();
                            }
                            else {
                                n6 = this.getListPaddingTop();
                                b2 = true;
                            }
                            if (b2 && top2 >= n6 && n2 > this.w) {
                                this.requestDisallowInterceptTouchEvent(true);
                                if (this.c(64)) {
                                    super.onTouchEvent(motionEvent);
                                    this.b(64);
                                }
                                this.setChildrenDrawingCacheEnabled(false);
                                this.setChildrenDrawnWithCacheEnabled(false);
                                if (this.c(2)) {
                                    this.a(n5, (int)(0.5f * n4));
                                    this.invalidate();
                                    if (this.getChildAt(n5).getTop() >= n6) {
                                        if (b && !this.c(16)) {
                                            this.setMode(16);
                                            this.i.setText((CharSequence)this.B);
                                            this.h.startAnimation(this.e);
                                            this.r.ai();
                                        }
                                    }
                                    else if (!b && this.c(16)) {
                                        this.b(16);
                                        this.i.setText((CharSequence)this.A);
                                        this.h.startAnimation(this.f);
                                        this.r.aj();
                                    }
                                }
                                else {
                                    this.b(n5, top2 - this.getDividerHeight());
                                }
                                this.setMode(4);
                                return true;
                            }
                        }
                        this.d();
                        break;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        return onTouchEvent;
    }
    
    public void setAdapter(final ListAdapter adapter) {
        if (this.g()) {
            if (adapter != null) {
                if (this.p == null || !this.p.getWrappedAdapter().equals(adapter)) {
                    this.q = new f(this);
                    if (this.g() && this.l == null) {
                        final View inflate = LayoutInflater.from(this.getContext()).inflate(this.n, (ViewGroup)null);
                        this.addFooterView(inflate, null, false);
                        this.l = inflate.findViewById(xf.footer_content);
                        this.m = (TextView)inflate.findViewById(xf.footer_dot);
                    }
                    this.p = new g(this, this.F, this.G, adapter, this.q);
                }
                final int a = this.p.a();
                int n;
                if (this.o) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                this.c = n + a;
            }
            else {
                this.p = null;
                this.c = 0;
            }
            super.setAdapter((ListAdapter)this.p);
            return;
        }
        super.setAdapter(adapter);
    }
    
    void setMode(final int n) {
        this.C |= n;
    }
    
    public void setPullAfterHeadersEnabled(final boolean k) {
        if (this.g() && this.o && k != this.k) {
            this.k = k;
            if (this.q != null) {
                this.q.onChanged();
            }
        }
    }
    
    public final void setRefreshDataProvider(final c i) {
        this.I = i;
    }
    
    public void setRefreshHeaderPosition(final int h) {
        if (this.g() && this.o && h != this.H) {
            if (h >= this.getHeaderViewsCount() || h < -1) {
                throw new IllegalArgumentException("Invalid position " + h);
            }
            this.H = h;
            if (this.q != null) {
                this.q.onChanged();
            }
        }
    }
    
    public final void setRefreshListener(final d r) {
        if (!this.g() && this.getHeaderViewsCount() > 0) {
            throw new IllegalStateException("setRefreshListener must be called before addHeaderView.");
        }
        this.r = r;
    }
    
    public final void setRefreshVisibilityListener(final e s) {
        this.s = s;
    }
    
    public void setTopPosition(final int y) {
        this.y = y;
    }
    
    void setVisible(final boolean e) {
        if (this.E != e) {
            this.E = e;
            if (this.s != null) {
                this.s.a_(e);
            }
        }
    }
}
