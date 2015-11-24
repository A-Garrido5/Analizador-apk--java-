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
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.Scroller;
import android.view.View;

class i implements Runnable
{
    final /* synthetic */ RefreshableListView a;
    private int b;
    private int c;
    
    i(final RefreshableListView a) {
        this.a = a;
    }
    
    private void b(final int n) {
        final View child = this.a.getChildAt(-1 + this.a.getChildCount());
        if (child != null && child.getBottom() < this.a.getBottom() - RefreshableListView.c(this.a) - this.a.getDividerHeight()) {
            final View child2 = this.a.getChildAt(n);
            if (child2 != null) {
                final int top = child2.getTop();
                RefreshableListView.d(this.a);
                this.a.a(n, top - child2.getTop());
            }
        }
    }
    
    void a(final int n) {
        this.b = 0;
        this.a.setMode(8);
        this.a.a.abortAnimation();
        this.a.a.startScroll(0, 0, 0, n, 300);
        this.c = this.a.getRefreshHeaderPosition() - this.a.getFirstVisiblePosition();
        this.a.post((Runnable)this);
    }
    
    @Override
    public void run() {
        if (!this.a.c(8)) {
            return;
        }
        final Scroller a = this.a.a;
        boolean b;
        if (a.timePassed() < 300 && a.computeScrollOffset()) {
            b = true;
        }
        else {
            b = false;
        }
        int b2;
        if (b) {
            b2 = a.getCurrY();
        }
        else {
            b2 = a.getFinalY();
        }
        final int n = this.b - b2;
        this.b = b2;
        this.a.a(this.c, n);
        this.b(this.c);
        this.a.invalidate();
        if (b) {
            this.a.post((Runnable)this);
            return;
        }
        this.a.b(8);
        if (this.a.c(32)) {
            this.a.setSelectionFromTop(this.a.H, b2);
        }
        else if (this.a.c(2)) {
            this.a.d();
        }
        else {
            this.a.setSelectionFromTop(0, b2);
            this.a.q.onChanged();
        }
        this.a.setVisible(false);
    }
}
