// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.View$OnTouchListener;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;

public class VideoSegmentEditView extends RelativeLayout implements bo
{
    private static final int a;
    private int A;
    private int B;
    private int C;
    private float D;
    private int E;
    private boolean F;
    private final int b;
    private final int c;
    private final az d;
    private final bd e;
    private final ba f;
    private final bf g;
    private final bg h;
    private final bb i;
    private VideoSegmentListView j;
    private bi k;
    private bc l;
    private be m;
    private ay n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private Drawable t;
    private float u;
    private final Rect v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    static {
        a = 2 * ViewConfiguration.getTapTimeout();
    }
    
    public VideoSegmentEditView(final Context context) {
        this(context, null);
    }
    
    public VideoSegmentEditView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoSegmentEditView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new az(this, null);
        this.e = new bd(this);
        this.f = new ba(this);
        this.g = new bf(this);
        this.h = new bg(this);
        this.i = new bb(this);
        this.v = new Rect();
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 2 * this.b;
        this.setMotionEventSplittingEnabled(false);
    }
    
    private void a(final int y) {
        if (this.k != null && this.k.a(this.v)) {
            final VideoSegmentListView j = this.j;
            final int y2 = this.y;
            if (y2 > -1 && y > -1 && y2 != y) {
                final int firstVisiblePosition = j.getFirstVisiblePosition();
                final View child = j.getChildAt(y - firstVisiblePosition);
                final View child2 = j.getChildAt(y2 - firstVisiblePosition);
                final int width = child2.getWidth();
                final int n = width + Math.min(child.getLeft(), child2.getLeft());
                final int n2 = Math.max(child.getRight(), child2.getRight()) - width;
                if (this.o <= n || this.o >= n2) {
                    this.b(y2, this.y = y);
                }
            }
            else if (y2 == y) {
                final View child3 = j.getChildAt(j.getLastVisiblePosition() - j.getFirstVisiblePosition());
                if (child3 != null && this.v.left > child3.getRight()) {
                    this.b(y2, this.y = j.getLastVisiblePosition());
                }
            }
            final int n3 = this.o - j.getLeft();
            final int width2 = j.getWidth();
            if (n3 > 0.66f * width2) {
                this.d.a(1);
            }
            else if (n3 < 0.33f * width2) {
                this.d.a(0);
            }
            else {
                this.d.a();
            }
        }
        else {
            this.d.a();
        }
        this.invalidate();
    }
    
    private void a(final int n, final int n2) {
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new av(this, viewTreeObserver, n, n2));
        this.requestLayout();
    }
    
    private void a(final int n, final VideoSegmentListItemView videoSegmentListItemView) {
        int visibility;
        if (this.t != null && n == this.y) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        videoSegmentListItemView.setVisibility(visibility);
        int a;
        if (n == this.z) {
            a = 1;
        }
        else {
            final bi k = this.k;
            a = 0;
            if (k != null) {
                a = this.k.a(n);
            }
        }
        videoSegmentListItemView.setStatus(a);
    }
    
    private void b(final int n) {
        final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.j.getChildAt(n - this.j.getFirstVisiblePosition());
        if (videoSegmentListItemView != null) {
            this.a(n, videoSegmentListItemView);
        }
    }
    
    private void b(int i, final int z) {
        if (this.k != null) {
            if (i < z) {
                while (i < z) {
                    if (i >= 0) {
                        this.k.c(i, i + 1);
                        this.a(i, i + 1);
                    }
                    ++i;
                }
            }
            else {
                while (i > z) {
                    if (i >= 1) {
                        this.k.c(i, i - 1);
                        this.a(i, i - 1);
                    }
                    --i;
                }
            }
        }
        if (z != -1) {
            this.z = z;
            this.j.d();
        }
        this.e();
    }
    
    private void c(final int n) {
        final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.j.getChildAt(n - this.j.getFirstVisiblePosition());
        if (videoSegmentListItemView != null && this.p - this.j.getLeft() >= videoSegmentListItemView.getLeft() && this.r - this.j.getTop() >= videoSegmentListItemView.getTop() && this.p - this.j.getLeft() <= videoSegmentListItemView.getRight() && this.r - this.j.getTop() <= videoSegmentListItemView.getBottom()) {
            this.t = (Drawable)videoSegmentListItemView.getFloatingShadow();
            final Rect v = this.v;
            videoSegmentListItemView.getHitRect(v);
            this.v.offset(this.j.getLeft(), this.j.getTop());
            this.w = this.p - v.left;
            this.x = this.r - v.top;
            this.u = 1.0f;
        }
    }
    
    private boolean d(final int n) {
        if (n == this.z && n != -1 && this.k != null) {
            this.c(n);
            this.k.f(n);
            this.y = this.B;
            this.b(n);
            this.e.a();
            this.invalidate();
            return true;
        }
        return false;
    }
    
    private void e() {
        if (this.k == null) {
            return;
        }
        for (int i = this.j.getFirstVisiblePosition(); i < i + this.j.getChildCount(); ++i) {
            this.b(i);
        }
        this.j.a();
    }
    
    private void e(final int z) {
        final View child = this.j.getChildAt(z - this.j.getFirstVisiblePosition());
        if (child == null) {
            return;
        }
        if (this.z != z) {
            child.setActivated(true);
            if (this.z != -1) {
                final View child2 = this.j.getChildAt(this.z - this.j.getFirstVisiblePosition());
                if (child2 != null) {
                    child2.setActivated(false);
                }
            }
            this.z = z;
        }
        this.e();
        this.invalidate();
    }
    
    private boolean f() {
        return this.g.a || this.h.a || this.i.a || this.F;
    }
    
    private int getClosestItemPosition() {
        for (int i = 0; i < this.j.getChildCount(); ++i) {
            if (this.o - this.j.getLeft() < this.j.getChildAt(i).getRight()) {
                return i + this.j.getFirstVisiblePosition();
            }
        }
        return -1;
    }
    
    public boolean a() {
        return this.A != -1;
    }
    
    boolean a(final MotionEvent motionEvent) {
        boolean b = true;
        if (this.k == null || this.f()) {
            b = false;
        }
        else {
            this.o = (int)motionEvent.getX() + this.j.getLeft();
            this.q = (int)motionEvent.getY() + this.j.getTop();
            this.B = this.getClosestItemPosition();
            switch (motionEvent.getActionMasked()) {
                default: {
                    return false;
                }
                case 0: {
                    this.p = this.o;
                    this.r = this.q;
                    this.s = false;
                    this.C = motionEvent.getPointerId(0);
                    this.A = this.B;
                    this.postDelayed((Runnable)this.n, (long)VideoSegmentEditView.a);
                    this.j.a(motionEvent);
                    return b;
                }
                case 2: {
                    if (this.C != motionEvent.getPointerId(motionEvent.getActionIndex())) {
                        return false;
                    }
                    if (this.s) {
                        return this.j.a(motionEvent);
                    }
                    if (this.t == null) {
                        if (Math.abs(this.q - this.r) < this.c) {
                            if (Math.abs(this.o - this.p) >= this.b) {
                                this.removeCallbacks((Runnable)this.n);
                                this.s = b;
                                return this.j.a(motionEvent);
                            }
                            return false;
                        }
                        else {
                            this.j.b();
                            this.removeCallbacks((Runnable)this.n);
                            this.n.run();
                            if (this.t == null) {
                                break;
                            }
                        }
                    }
                    this.v.offsetTo(this.o - this.w, this.q - this.x);
                    this.k.b(this.v);
                    this.a(this.B);
                    return b;
                }
                case 6: {
                    if (this.C != motionEvent.getPointerId(motionEvent.getActionIndex())) {
                        return false;
                    }
                }
                case 1: {
                    this.C = -1;
                    final int a = this.A;
                    this.A = -1;
                    if (this.s) {
                        this.s = false;
                        return this.j.a(motionEvent);
                    }
                    this.removeCallbacks((Runnable)this.n);
                    if (this.t != null) {
                        if (this.k.a(this.y, this.v)) {
                            this.i.a();
                            this.E = this.z;
                            if (this.k.d(this.E)) {
                                if (this.E == -1 + this.k.getCount()) {
                                    this.h.a();
                                }
                                else {
                                    this.g.a();
                                }
                            }
                            else {
                                this.F = b;
                                this.postDelayed((Runnable)new au(this), 100L);
                            }
                        }
                        else {
                            this.f.a();
                        }
                        this.d.a();
                        this.invalidate();
                        this.j.b();
                        return b;
                    }
                    if (this.l != null && a != -1 && this.z == -1 && Math.abs(this.p - this.o) < this.b && Math.abs(this.r - this.q) < this.b) {
                        this.j.b();
                        this.l.c(a);
                        return b;
                    }
                    this.j.a(motionEvent);
                    return b;
                }
                case 3: {
                    this.removeCallbacks((Runnable)this.n);
                    this.C = -1;
                    this.A = -1;
                    this.s = false;
                    if (this.t != null) {
                        this.f.a();
                    }
                    this.j.b();
                    return b;
                }
            }
        }
        return b;
    }
    
    public void b() {
        this.invalidate();
        this.removeCallbacks((Runnable)this.n);
    }
    
    void c() {
        if (this.k != null) {
            this.k.g(this.y);
        }
        this.t = null;
        this.z = -1;
        this.e();
        this.invalidate();
    }
    
    void d() {
        if (this.E != -1) {
            if (this.k != null) {
                this.k.j(this.E);
            }
            this.E = -1;
            this.z = -1;
            this.j.d();
        }
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        final Drawable t = this.t;
        if (t != null) {
            final Rect v = this.v;
            t.setBounds(v);
            final float u = this.u;
            canvas.save();
            canvas.scale(u, u, (float)((v.left + v.right) / 2), (float)((v.top + v.bottom) / 2));
            t.draw(canvas);
            canvas.restore();
        }
    }
    
    public void onFinishInflate() {
        (this.j = (VideoSegmentListView)this.findViewById(16908298)).setOnTouchListener((View$OnTouchListener)new at(this));
        this.j.setOnScrollListener(this);
        this.n = new ay(this, null);
        this.D = 0.1f * this.getResources().getDisplayMetrics().xdpi;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.k != null && this.j.getVisibility() != 8) {
            final int a = this.k.a();
            if (a > 0) {
                if (a != this.j.getThumbnailSize()) {
                    this.j.setVisibility(0);
                    this.j.setThumbnailSize(a);
                    this.measure(View$MeasureSpec.makeMeasureSpec(this.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getHeight(), 1073741824));
                    super.onLayout(true, n, n2, n3, n4);
                }
            }
            else {
                this.j.setVisibility(4);
                this.j.setThumbnailSize(0);
            }
        }
        if (this.m != null) {
            this.m.g();
        }
    }
    
    public void setAdapter(final bi bi) {
        if (bi != null) {
            this.k = bi;
            this.j.setAdapter((ListAdapter)bi);
            bi.a(this);
            return;
        }
        this.setListItemClickListener(null);
        this.k = null;
        this.j.setAdapter(null);
    }
    
    public void setListItemClickListener(final bc l) {
        this.l = l;
    }
    
    public void setPostLayoutListener(final be m) {
        this.m = m;
    }
}
