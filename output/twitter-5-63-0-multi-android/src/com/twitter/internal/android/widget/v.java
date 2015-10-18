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
import android.widget.ListAdapter;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.view.View;
import java.util.ArrayList;

class v
{
    final /* synthetic */ HorizontalListView a;
    private final ArrayList b;
    private View[] c;
    private int d;
    
    public v(final HorizontalListView a) {
        this.a = a;
        this.b = new ArrayList();
    }
    
    private void c() {
        final int length = this.c.length;
        final ArrayList b = this.b;
        final int size = b.size();
        final int n = size - length;
        final int n2 = size - 1;
        int i = 0;
        int n3 = n2;
        while (i < n) {
            HorizontalListView.a(this.a, b.remove(n3), false);
            --n3;
            ++i;
        }
    }
    
    public View a(final int n) {
        if (this.c != null) {
            final int n2 = n - this.d;
            final View[] c = this.c;
            if (n2 >= 0 && n2 < c.length) {
                final View view = c[n2];
                c[n2] = null;
                return view;
            }
        }
        return null;
    }
    
    public void a() {
        final View[] c = this.c;
        if (c == null) {
            return;
        }
        final ArrayList b = this.b;
        for (int i = -1 + c.length; i >= 0; --i) {
            final View view = c[i];
            if (view != null) {
                final HorizontalListView$LayoutParams horizontalListView$LayoutParams = (HorizontalListView$LayoutParams)view.getLayoutParams();
                c[i] = null;
                horizontalListView$LayoutParams.b = i + this.d;
                b.add(view);
            }
        }
        this.c();
    }
    
    public void a(final int d, final int n) {
        View[] array = this.c;
        if (array == null || array.length < n) {
            this.c = new View[n];
            array = this.c;
        }
        this.d = d;
        for (int i = 0; i < n; ++i) {
            array[i] = this.a.getChildAt(i);
        }
    }
    
    public void a(final View view, final int b, final boolean d) {
        final HorizontalListView$LayoutParams horizontalListView$LayoutParams = (HorizontalListView$LayoutParams)view.getLayoutParams();
        if (horizontalListView$LayoutParams == null) {
            return;
        }
        horizontalListView$LayoutParams.b = b;
        horizontalListView$LayoutParams.a = true;
        horizontalListView$LayoutParams.d = d;
        this.b.add(view);
    }
    
    public View b(final int n) {
        final ArrayList b = this.b;
        if (b.isEmpty()) {
            return null;
        }
        final int size = b.size();
        for (int i = 0; i < size; ++i) {
            final View view = b.get(i);
            if (((HorizontalListView$LayoutParams)view.getLayoutParams()).b == n) {
                b.remove(i);
                return view;
            }
        }
        return b.remove(size - 1);
    }
    
    public void b() {
        final ArrayList b = this.b;
        for (int i = -1 + b.size(); i >= 0; --i) {
            HorizontalListView.b(this.a, b.remove(i), false);
        }
    }
}
