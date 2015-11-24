// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

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
import android.widget.Scroller;

class g implements Runnable
{
    final /* synthetic */ ExtendableListView a;
    private final Scroller b;
    private int c;
    
    g(final ExtendableListView a) {
        this.a = a;
        this.b = new Scroller(a.getContext());
    }
    
    private void a() {
        this.c = 0;
        this.a.l = 0;
        this.a.g(0);
        this.a.removeCallbacks((Runnable)this);
        this.b.forceFinished(true);
    }
    
    void a(final int n) {
        int c;
        if (n < 0) {
            c = Integer.MAX_VALUE;
        }
        else {
            c = 0;
        }
        this.c = c;
        this.b.forceFinished(true);
        this.b.fling(0, c, 0, n, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.a.l = 2;
        this.a.a(this);
    }
    
    @Override
    public void run() {
        switch (this.a.l) {
            default: {}
            case 2: {
                if (this.a.D == 0 || this.a.getChildCount() == 0) {
                    this.a();
                    return;
                }
                final Scroller b = this.b;
                final boolean computeScrollOffset = b.computeScrollOffset();
                final int currY = b.getCurrY();
                final int n = this.c - currY;
                int n2;
                if (n > 0) {
                    this.a.x = this.a.d;
                    n2 = Math.min(-1 + (this.a.getHeight() - this.a.getPaddingBottom() - this.a.getPaddingTop()), n);
                }
                else {
                    this.a.x = -1 + this.a.getChildCount() + this.a.d;
                    n2 = Math.max(-(-1 + (this.a.getHeight() - this.a.getPaddingBottom() - this.a.getPaddingTop())), n);
                }
                final boolean a = this.a.c(n2, n2);
                if (computeScrollOffset && !a) {
                    this.a.invalidate();
                    this.c = currY;
                    this.a.a(this);
                    return;
                }
                this.a();
            }
        }
    }
}
