// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.Adapter;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.ListAdapter;
import android.widget.AdapterView;

public class VideoSegmentListView extends AdapterView
{
    private bo A;
    private final bp B;
    private ListAdapter a;
    private int b;
    private boolean c;
    private int d;
    private DataSetObserver e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final Drawable o;
    private final int p;
    private final Rect q;
    private boolean r;
    private int s;
    private VideoSegmentListItemView t;
    private VideoSegmentListItemView u;
    private long v;
    private boolean w;
    private int x;
    private VelocityTracker y;
    private final bn z;
    
    public VideoSegmentListView(final Context context) {
        this(context, null);
    }
    
    public VideoSegmentListView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoSegmentListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = 0;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.q = new Rect();
        this.x = Integer.MIN_VALUE;
        this.z = new bn(this);
        this.B = new bp(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.VideoSegmentListView, n, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize > 0) {
            this.setDividerWidth(dimensionPixelSize);
        }
        this.k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.o = obtainStyledAttributes.getDrawable(2);
        this.p = obtainStyledAttributes.getDimensionPixelSize(3, 10);
        this.s = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        obtainStyledAttributes.recycle();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.l = value.getScaledTouchSlop();
        this.m = value.getScaledMinimumFlingVelocity();
        this.n = value.getScaledMaximumFlingVelocity();
    }
    
    private int a(final int n, int n2, final int n3) {
        int n4 = 0;
        final ListAdapter a = this.a;
        if (a != null) {
            int n5 = this.getPaddingLeft() + this.getPaddingRight();
            final int count = a.getCount();
            int i = 0;
            while (i < count) {
                final VideoSegmentListItemView b = this.b(i);
                this.a((View)b, n);
                n5 += ((View)b).getMeasuredWidth();
                if (n5 >= n2) {
                    if (n3 >= 0 && i > n3 && n4 > 0 && n5 != n2) {
                        return n4;
                    }
                    return n2;
                }
                else {
                    if (n3 >= 0 && i >= n3) {
                        n4 = n5;
                    }
                    ++i;
                }
            }
            return n5;
        }
        n2 = this.getPaddingLeft() + this.getPaddingRight();
        return n2;
    }
    
    private View a(final int n, final int n2, final int n3, final boolean b) {
        final VideoSegmentListItemView b2 = this.b(n);
        this.a((View)b2, n2, n3, b);
        return (View)b2;
    }
    
    private void a(final View view, final int n) {
        ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = this.generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, this.getPaddingTop() + this.getPaddingBottom(), layoutParams.height);
        final int width = layoutParams.width;
        int n2;
        if (width > 0) {
            n2 = View$MeasureSpec.makeMeasureSpec(width, 1073741824);
        }
        else {
            n2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(n2, childMeasureSpec);
    }
    
    private void a(final View view, int n, final int n2, final boolean b) {
        ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = this.generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        final ViewGroup$LayoutParams viewGroup$LayoutParams = layoutParams;
        int n3;
        if (b) {
            n3 = -1;
        }
        else {
            n3 = 0;
        }
        this.addViewInLayout(view, n3, viewGroup$LayoutParams, true);
        final boolean layoutRequested = view.isLayoutRequested();
        if (layoutRequested) {
            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, this.getPaddingTop() + this.getPaddingBottom(), viewGroup$LayoutParams.height);
            final int width = viewGroup$LayoutParams.width;
            int n4;
            if (width > 0) {
                n4 = View$MeasureSpec.makeMeasureSpec(width, 1073741824);
            }
            else {
                n4 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(n4, childMeasureSpec);
        }
        else {
            this.cleanupLayoutState(view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (!b) {
            n -= measuredWidth;
        }
        if (layoutRequested) {
            view.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            return;
        }
        view.offsetLeftAndRight(n - view.getLeft());
        view.offsetTopAndBottom(n2 - view.getTop());
    }
    
    private VideoSegmentListItemView b(final int n) {
        final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.a.getView(n, (View)null, (ViewGroup)this);
        videoSegmentListItemView.setThumbnailSize(this.s);
        return videoSegmentListItemView;
    }
    
    private void b(int n, int n2) {
        for (int paddingTop = this.getPaddingTop(); n2 > this.getPaddingLeft() && n >= 0; n2 = this.a(n, n2, paddingTop, false).getLeft() - this.j, --n) {}
        if (this.b > 0 && n == -1 && this.getOverflowLeft() < 0) {
            this.detachAllViewsFromParent();
            this.c(this.g = 0, this.getPaddingLeft() + this.k);
            return;
        }
        this.g = n + 1;
    }
    
    private void b(final boolean b) {
        if (b) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).forceLayout();
            }
        }
        this.f();
    }
    
    private void c(int n, int n2) {
        final int paddingTop = this.getPaddingTop();
        final int n3 = this.getWidth() - this.getPaddingRight();
        final boolean b = n == 0 && n2 == this.getPaddingLeft() + this.k;
        while (n2 < n3 && n < this.b) {
            n2 = this.a(n, n2, paddingTop, true).getRight() + this.j;
            ++n;
        }
        if (!b && this.b > 0 && n == this.b && this.getOverflowRight() < 0 && (this.g > 0 || this.getOverflowLeft() > 0)) {
            this.detachAllViewsFromParent();
            this.b(-1 + this.b, n3 - this.k);
        }
    }
    
    private void c(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    private void d(final boolean b) {
        final int childCount = this.getChildCount();
        if (b) {
            int paddingLeft;
            if (childCount > 0) {
                paddingLeft = this.getChildAt(childCount - 1).getRight() + this.j;
            }
            else {
                paddingLeft = this.getPaddingLeft();
            }
            this.c(childCount + this.g, paddingLeft);
            return;
        }
        int n = 0;
        if (childCount > 0) {
            n = this.getChildAt(0).getLeft() - this.j;
        }
        this.b(-1 + this.g, n);
    }
    
    private void e() {
        if (this.y != null) {
            this.y.recycle();
            this.y = null;
        }
    }
    
    private void f() {
        final boolean c = this.c;
        final int g = this.g;
        final View child = this.getChildAt(0);
        this.detachAllViewsFromParent();
        if (child == null) {
            this.c(g, this.getPaddingLeft() + this.k);
        }
        else {
            this.c(g, child.getLeft());
        }
        this.a();
        if (c) {
            this.invalidate();
        }
        this.c = false;
    }
    
    private int getOverflowLeft() {
        return this.getPaddingLeft() + this.k - this.getChildAt(0).getLeft();
    }
    
    private int getOverflowRight() {
        return this.getChildAt(-1 + this.getChildCount()).getRight() - (this.getWidth() - this.getPaddingRight() - this.k);
    }
    
    public void a() {
        final int childCount = this.getChildCount();
        if (childCount != 0) {
            final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.getChildAt(childCount - 1);
            final int status = videoSegmentListItemView.getStatus();
            int n3;
            int n4;
            if (status == 4 || status == 3) {
                videoSegmentListItemView.a(false, false);
                final int n = childCount - 2;
                final int n2 = -2 + this.b - this.g;
                n3 = n;
                n4 = n2;
            }
            else {
                final int n5 = childCount - 1;
                final int n6 = -1 + this.b - this.g;
                n3 = n5;
                n4 = n6;
            }
            int i;
            for (i = 0; i <= n3; ++i) {
                final VideoSegmentListItemView videoSegmentListItemView2 = (VideoSegmentListItemView)this.getChildAt(i);
                if (videoSegmentListItemView2.getStatus() == 1) {
                    videoSegmentListItemView2.a(true, true);
                    break;
                }
            }
            if (i > n3) {
                i = Integer.MAX_VALUE;
            }
            for (int j = 0; j <= n3; ++j) {
                if (j != i) {
                    ((VideoSegmentListItemView)this.getChildAt(j)).a((j == 0 && this.g == 0) || j == i + 1, j == n4 || j == i - 1);
                }
            }
        }
    }
    
    public void a(final int n) {
        this.B.a(n);
    }
    
    public void a(final boolean r) {
        this.r = r;
        this.invalidate();
    }
    
    public boolean a(final int n, final int n2) {
        boolean b = true;
        int i = 0;
        final int childCount = this.getChildCount();
        if (childCount != 0) {
            final boolean b2 = n2 < 0 && b;
            final int paddingLeft = this.getPaddingLeft();
            final int n3 = this.getWidth() - this.getPaddingRight();
            final int right = this.getChildAt(childCount - 1).getRight();
            final int left = this.getChildAt(0).getLeft();
            int n4;
            if (b2) {
                n4 = this.getOverflowRight();
            }
            else {
                n4 = this.getOverflowLeft();
            }
            final int g = this.g;
            if (b2) {
                if (g + childCount >= this.b && right + n < n3 - this.k) {
                    b = false;
                }
            }
            else if (g <= 0 && left + n > paddingLeft + this.k) {
                b = false;
            }
            if (b) {
                int n6;
                int n8;
                if (b2) {
                    int n5 = 0;
                    n6 = 0;
                    while (n5 < childCount && n + this.getChildAt(n5).getRight() < paddingLeft) {
                        final int n7 = n6 + 1;
                        ++n5;
                        n6 = n7;
                    }
                    n8 = 0;
                }
                else {
                    int n9 = childCount - 1;
                    n8 = 0;
                    n6 = 0;
                    while (n9 >= 0 && n + this.getChildAt(n9).getLeft() > n3) {
                        final int n10 = n6 + 1;
                        final int n11 = n9 - 1;
                        n6 = n10;
                        n8 = n9;
                        n9 = n11;
                    }
                }
                if (n6 > 0) {
                    this.detachViewsFromParent(n8, n6);
                    if (b2) {
                        this.g += n6;
                    }
                }
                while (i < this.getChildCount()) {
                    this.getChildAt(i).offsetLeftAndRight(n);
                    ++i;
                }
                this.invalidate();
                if (n4 < Math.abs(n2)) {
                    this.d(b2);
                }
                if (this.A != null) {
                    this.A.b();
                    return b;
                }
            }
        }
        return b;
    }
    
    public boolean a(final MotionEvent motionEvent) {
        boolean d = true;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && this.w) {
            d = false;
        }
        else {
            this.B.a();
            if (this.b == 0) {
                if (motionEvent.getX() < 0.0f || motionEvent.getX() > this.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > this.getHeight()) {
                    return false;
                }
            }
            else {
                if (this.y == null) {
                    this.y = VelocityTracker.obtain();
                }
                this.y.addMovement(motionEvent);
                final int h = (int)motionEvent.getX();
                final int n = (int)motionEvent.getY();
                switch (actionMasked) {
                    default: {
                        return d;
                    }
                    case 0: {
                        this.c((this.d = (d ? 1 : 0)) != 0);
                        this.z.a();
                        this.h = h;
                        this.i = n;
                        this.x = Integer.MIN_VALUE;
                        this.w = false;
                        return d;
                    }
                    case 1: {
                        switch (this.d) {
                            default: {
                                final VelocityTracker y = this.y;
                                y.computeCurrentVelocity(1000, (float)this.n);
                                final float xVelocity = y.getXVelocity();
                                if (Math.abs(xVelocity) > this.m) {
                                    this.z.a((int)(-xVelocity));
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                this.d = 0;
                                break;
                            }
                        }
                        this.e();
                        this.i = Integer.MIN_VALUE;
                        this.h = Integer.MIN_VALUE;
                        this.x = Integer.MIN_VALUE;
                        return d;
                    }
                    case 2: {
                        if (this.h != Integer.MIN_VALUE) {
                            if (this.getChildCount() == 0) {
                                this.d = 0;
                                return super.onTouchEvent(motionEvent);
                            }
                            final int n2 = h - this.h;
                            if (this.d != 2) {
                                if ((this.g == 0 && this.getOverflowLeft() == 0 && n2 > 0) || (this.getOverflowRight() == 0 && n2 < 0)) {
                                    this.c(false);
                                    return d;
                                }
                                if (this.i != Integer.MIN_VALUE && this.l <= Math.abs(n - this.i)) {
                                    this.c(false);
                                    return d;
                                }
                                if (this.l > Math.abs(n2)) {
                                    break;
                                }
                                this.d = 2;
                            }
                            if (h == this.x) {
                                break;
                            }
                            int n3;
                            if (n2 > 0) {
                                n3 = n2 - this.l;
                            }
                            else {
                                n3 = n2 + this.l;
                            }
                            if (this.x != Integer.MIN_VALUE) {
                                n3 = h - this.x;
                            }
                            this.a(n2, n3);
                            this.x = h;
                        }
                        this.h = h;
                        this.i = n;
                        return d;
                    }
                    case 3: {
                        this.b();
                        return d;
                    }
                }
            }
        }
        return d;
    }
    
    public void b() {
        if (!this.w) {
            this.w = true;
            this.B.a();
            this.e();
            this.h = Integer.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.d = 0;
        }
    }
    
    public void c() {
        final int height = this.getHeight();
        this.invalidate(0, height - this.p, this.getWidth(), height);
    }
    
    public void d() {
        this.u = this.t;
        this.v = SystemClock.elapsedRealtime();
        final int height = this.getHeight();
        this.invalidate(0, height - this.p, this.getWidth(), height);
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        final VideoSegmentListItemView u = this.u;
        VideoSegmentListItemView videoSegmentListItemView;
        if (u != null && u.getParent() != this) {
            this.u = null;
            videoSegmentListItemView = null;
        }
        else {
            videoSegmentListItemView = u;
        }
        if (this.r) {
            VideoSegmentListItemView t = this.t;
            Label_0111: {
                if (t == null || !t.a() || t.getParent() != this) {
                    final int childCount = this.getChildCount();
                    int i = 0;
                    while (true) {
                        while (i < childCount) {
                            t = (VideoSegmentListItemView)this.getChildAt(i);
                            if (t.a()) {
                                if ((this.t = t) != null) {
                                    break Label_0111;
                                }
                                return;
                            }
                            else {
                                ++i;
                            }
                        }
                        t = null;
                        continue;
                    }
                }
            }
            final int height = this.getHeight();
            final int top = height - this.p;
            this.q.left = t.getLeft();
            this.q.right = this.q.left + this.s;
            this.q.top = top;
            this.q.bottom = height;
            if (t != videoSegmentListItemView && videoSegmentListItemView != null) {
                final long n = SystemClock.elapsedRealtime() - this.v;
                if (n < 100L) {
                    final float n2 = n / 100.0f;
                    this.q.left = (int)(n2 * this.q.left + (1.0f - n2) * videoSegmentListItemView.getLeft());
                    this.q.right = this.q.left + this.s;
                    this.invalidate(0, top, this.getWidth(), height);
                }
            }
            this.o.setBounds(this.q);
            this.o.draw(canvas);
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        int s;
        if (this.s == 0) {
            s = -2;
        }
        else {
            s = this.s;
        }
        return new ViewGroup$LayoutParams(-2, s);
    }
    
    public ListAdapter getAdapter() {
        return this.a;
    }
    
    public int getDividerWidth() {
        return this.j;
    }
    
    public int getFirstVisiblePosition() {
        return this.g;
    }
    
    public Drawable getIndicatorDrawable() {
        return this.o;
    }
    
    public int getLastVisiblePosition() {
        return -1 + (this.g + this.getChildCount());
    }
    
    public View getSelectedView() {
        return null;
    }
    
    public int getThumbnailSize() {
        return this.s;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.b(b);
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.f = View$MeasureSpec.makeMeasureSpec(this.s, 1073741824);
        int count;
        if (this.a == null) {
            count = 0;
        }
        else {
            count = this.a.getCount();
        }
        this.b = count;
        final int mode = View$MeasureSpec.getMode(n);
        int n3 = View$MeasureSpec.getSize(n);
        if (mode == 0) {
            n3 = this.getPaddingLeft() + this.getPaddingRight() + this.s;
        }
        else if (mode == Integer.MIN_VALUE) {
            n3 = this.a(this.f, n3, -1);
        }
        this.setMeasuredDimension(n3, this.getPaddingTop() + this.getPaddingBottom() + this.s + this.getResources().getDimensionPixelSize(2131558409));
    }
    
    public void setAdapter(final ListAdapter a) {
        if (a != this.a) {
            this.B.a();
            this.z.a();
            if (this.e == null) {
                this.e = new bm(this, null);
            }
            if (this.a != null) {
                this.a.unregisterDataSetObserver(this.e);
            }
            if ((this.a = a) == null) {
                this.b = 0;
                return;
            }
            a.registerDataSetObserver(this.e);
            this.b = a.getCount();
        }
    }
    
    public void setDividerWidth(final int j) {
        this.j = j;
        this.requestLayout();
        this.invalidate();
    }
    
    public void setOnScrollListener(final bo a) {
        this.A = a;
    }
    
    public void setPressed(final boolean b) {
    }
    
    public void setSelection(final int n) {
    }
    
    public void setThumbnailSize(final int s) {
        this.s = s;
        this.f = View$MeasureSpec.makeMeasureSpec(this.s, 1073741824);
        this.forceLayout();
    }
}
