// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.Adapter;
import android.widget.AbsListView;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import android.view.ViewConfiguration;
import android.widget.AbsListView$OnScrollListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.widget.PageableListView;

public class ChunkedPageableListView extends PageableListView implements ViewTreeObserver$OnGlobalLayoutListener
{
    private Handler a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private Resources o;
    
    public ChunkedPageableListView(final Context context) {
        super(context);
        this.a = new Handler();
        this.l = Integer.MIN_VALUE;
        this.c();
    }
    
    public ChunkedPageableListView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Handler();
        this.l = Integer.MIN_VALUE;
        this.c();
    }
    
    public ChunkedPageableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new Handler();
        this.l = Integer.MIN_VALUE;
        this.c();
    }
    
    private void a(final float n) {
        final float min = Math.min(Math.max(n, 0.0f), 1.0f);
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final Integer n2 = (Integer)child.getTag(2131886098);
            final Integer n3 = (Integer)child.getTag(2131886097);
            if (n2 != null && n3 == 0 && n2.equals(1)) {
                a(child, min);
            }
        }
    }
    
    private void a(final int n) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.getChildAt(i).offsetTopAndBottom(n);
        }
    }
    
    public static void a(final View view, final float alpha) {
        view.setAlpha(alpha);
    }
    
    private void a(final t t) {
        float n = 1.0f;
        final boolean a = t.a;
        final float n2 = this.h;
        if (!a) {
            final float min = Math.min(Math.max((this.f - t.c) / n2, 0.0f), n);
            n = min * (min * min);
        }
        this.a(0.15f + n * 0.75f);
    }
    
    private void c() {
        this.setOnScrollListener((AbsListView$OnScrollListener)this);
        this.d = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
        this.m = 0;
        this.n = false;
        this.o = this.getResources();
        this.h = this.o.getDimensionPixelSize(2131558514);
        this.j = this.o.getInteger(2131623948);
        this.i = this.o.getInteger(2131623949);
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
    }
    
    private void c(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.15f;
        }
        this.a(n);
    }
    
    private ChunkedAdapter getChunkedAdapter() {
        final ListAdapter adapter = this.getAdapter();
        if (adapter instanceof ChunkedAdapter) {
            return (ChunkedAdapter)adapter;
        }
        if (adapter instanceof HeaderViewListAdapter) {
            return (ChunkedAdapter)((HeaderViewListAdapter)adapter).getWrappedAdapter();
        }
        return null;
    }
    
    private t getScrollStatus() {
        int n = Integer.MAX_VALUE;
        while (true) {
            for (int i = -1 + this.getChildCount(); i >= 0; --i) {
                final View child = this.getChildAt(i);
                final Integer n2 = (Integer)child.getTag(2131886098);
                if (n2 != null && n2 == 2) {
                    n = child.getTop() + child.findViewById(2131886388).getBottom();
                    final boolean b = true;
                    final int h = this.h;
                    final ChunkedAdapter chunkedAdapter = this.getChunkedAdapter();
                    final boolean b2 = chunkedAdapter != null && chunkedAdapter.b();
                    ChunkedAdapter$ScrollAction chunkedAdapter$ScrollAction;
                    if (b) {
                        if (b2) {
                            if (n > this.g + this.getDividerHeight()) {
                                if (n > h + this.g) {
                                    chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.c;
                                }
                                else {
                                    chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.b;
                                }
                            }
                            else {
                                chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.a;
                            }
                        }
                        else if (n < this.f - this.getDividerHeight()) {
                            if (n < this.f - h) {
                                chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.c;
                            }
                            else {
                                chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.b;
                            }
                        }
                        else {
                            chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.a;
                        }
                    }
                    else {
                        chunkedAdapter$ScrollAction = ChunkedAdapter$ScrollAction.a;
                    }
                    return new t(b2, chunkedAdapter$ScrollAction, n, b);
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final t scrollStatus = this.getScrollStatus();
        final int n = (int)motionEvent.getY();
        final int n2 = n - this.b;
        switch (motionEvent.getAction()) {
            case 0: {
                this.b = n;
                this.c = Integer.MIN_VALUE;
                break;
            }
            case 2: {
                this.c = n;
                if (n2 > this.d && scrollStatus.b != ChunkedAdapter$ScrollAction.a) {
                    super.onInterceptTouchEvent(motionEvent);
                    return true;
                }
                break;
            }
            case 1:
            case 3: {
                this.b = Integer.MIN_VALUE;
                this.c = Integer.MIN_VALUE;
                break;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.g = this.getListPaddingTop();
        this.f = this.getListPaddingTop() + this.getListPaddingBottom() + this.getHeight();
    }
    
    @Override
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        super.onScroll(absListView, n, n2, n3);
        if (this.m == 2) {
            final t scrollStatus = this.getScrollStatus();
            final boolean a = scrollStatus.a;
            if (scrollStatus.b != ChunkedAdapter$ScrollAction.a) {
                if (this.b != Integer.MIN_VALUE && scrollStatus.d) {
                    int c = scrollStatus.c;
                    if (!a) {
                        c -= this.f;
                    }
                    if (c != 0 && !this.n) {
                        this.n = true;
                        this.a.post((Runnable)new u(this, c, a));
                    }
                }
                this.e = false;
            }
        }
    }
    
    @Override
    public void onScrollStateChanged(final AbsListView absListView, final int m) {
        super.onScrollStateChanged(absListView, m);
        if (this.m == 3) {
            if (m == 0 && this.k != Integer.MIN_VALUE) {
                this.setSelectionFromTop(this.k, this.l);
                this.k = Integer.MIN_VALUE;
            }
            else if (m == 2) {
                return;
            }
        }
        this.m = m;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final t scrollStatus = this.getScrollStatus();
        final ChunkedAdapter$ScrollAction b = scrollStatus.b;
        final boolean a = scrollStatus.a;
        final ChunkedAdapter chunkedAdapter = this.getChunkedAdapter();
        int c = scrollStatus.c;
        final int n = (int)motionEvent.getY();
        final int n2 = n - this.b;
        switch (actionMasked) {
            case 0: {
                this.b = n;
                this.c = Integer.MIN_VALUE;
                this.e = true;
                break;
            }
            case 2: {
                int n3;
                if (this.c != Integer.MIN_VALUE) {
                    n3 = n - this.c;
                }
                else {
                    n3 = n2;
                }
                this.c = n;
                if (Math.abs(n2) <= this.d) {
                    break;
                }
                this.setChildrenDrawingCacheEnabled(false);
                this.setChildrenDrawnWithCacheEnabled(false);
                if (b != ChunkedAdapter$ScrollAction.a) {
                    if (this.e) {
                        super.onTouchEvent(motionEvent);
                        this.e = false;
                    }
                    this.a((int)(0.42f * n3));
                    chunkedAdapter.a(scrollStatus);
                    this.a(scrollStatus);
                    this.invalidate();
                    return true;
                }
                break;
            }
            case 1:
            case 3: {
                if (scrollStatus.d) {
                    switch (w.a[b.ordinal()]) {
                        default: {
                            c = 0;
                            break;
                        }
                        case 1: {
                            chunkedAdapter.c();
                            if (a) {
                                c -= this.f;
                            }
                            this.c(true);
                            break;
                        }
                        case 2: {
                            if (!a) {
                                c -= this.f;
                                break;
                            }
                            break;
                        }
                    }
                    if (c != 0 && !this.n) {
                        this.n = true;
                        this.a.post((Runnable)new v(this, c, b, a));
                    }
                }
                this.e = false;
                break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setAdapter(final ListAdapter adapter) {
        if (!(adapter instanceof ChunkedAdapter)) {
            throw new IllegalArgumentException("Adapter for ChunkedPageableListView must be instance of ChunkedSectionAdapter");
        }
        super.setAdapter(adapter);
    }
    
    public void smoothScrollToPosition(final int n, final int n2) {
        super.smoothScrollToPosition(n, n2);
        this.m = 3;
    }
    
    public void smoothScrollToPositionFromTop(final int k, final int l) {
        super.smoothScrollToPositionFromTop(k, l);
        this.k = k;
        this.l = l;
        this.m = 3;
    }
}
