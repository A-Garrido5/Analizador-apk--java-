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
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListAdapter;

class u implements Runnable
{
    public int a;
    final /* synthetic */ HorizontalListView b;
    private int c;
    
    public u(final HorizontalListView b) {
        this.b = b;
    }
    
    public void a() {
        this.c = HorizontalListView.f(this.b);
    }
    
    public boolean b() {
        return this.b.hasWindowFocus() && HorizontalListView.g(this.b) == this.c;
    }
    
    @Override
    public void run() {
        if (!this.b.e) {
            final ListAdapter c = this.b.c;
            final int a = this.a;
            if (c != null && this.b.d > 0 && a != -1 && a < c.getCount() && this.b()) {
                final View child = this.b.getChildAt(a - this.b.H);
                if (child != null) {
                    this.b.performItemClick(child, a, c.getItemId(a));
                }
            }
        }
    }
}
