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
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.ListAdapter;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;
import android.support.v4.view.ViewCompat;
import android.support.v4.util.SparseArrayCompat;
import java.util.ArrayList;
import android.view.View;

class j
{
    final /* synthetic */ ExtendableListView a;
    private int b;
    private View[] c;
    private ArrayList[] d;
    private int e;
    private ArrayList f;
    private ArrayList g;
    private SparseArrayCompat h;
    
    j(final ExtendableListView a) {
        this.a = a;
        this.c = new View[0];
    }
    
    private void f() {
        final int length = this.c.length;
        final int e = this.e;
        for (final ArrayList list : this.d) {
            final int size = list.size();
            final int n = size - length;
            int n2 = size - 1;
            int n3;
            for (int j = 0; j < n; ++j, n2 = n3) {
                final ExtendableListView a = this.a;
                n3 = n2 - 1;
                ExtendableListView.e(a, list.remove(n2), false);
            }
        }
        final SparseArrayCompat h = this.h;
        int k = 0;
        if (h != null) {
            while (k < this.h.size()) {
                if (!ViewCompat.hasTransientState((View)this.h.valueAt(k))) {
                    this.h.removeAt(k);
                    --k;
                }
                ++k;
            }
        }
    }
    
    public void a() {
        int i = 0;
        if (this.e == 1) {
            final ArrayList f = this.f;
            for (int size = f.size(), j = 0; j < size; ++j) {
                f.get(j).forceLayout();
            }
        }
        else {
            for (int e = this.e, k = 0; k < e; ++k) {
                final ArrayList list = this.d[k];
                for (int size2 = list.size(), l = 0; l < size2; ++l) {
                    list.get(l).forceLayout();
                }
            }
        }
        if (this.h != null) {
            while (i < this.h.size()) {
                ((View)this.h.valueAt(i)).forceLayout();
                ++i;
            }
        }
    }
    
    public void a(final int e) {
        if (e < 1) {
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }
        final ArrayList[] d = new ArrayList[e];
        for (int i = 0; i < e; ++i) {
            d[i] = new ArrayList();
        }
        this.e = e;
        this.f = d[0];
        this.d = d;
    }
    
    void a(final int n, final int b) {
        if (this.c.length < n) {
            this.c = new View[n];
        }
        this.b = b;
        final View[] c = this.c;
        for (int i = 0; i < n; ++i) {
            final View child = this.a.getChildAt(i);
            final ExtendableListView$LayoutParams extendableListView$LayoutParams = (ExtendableListView$LayoutParams)child.getLayoutParams();
            if (extendableListView$LayoutParams != null && extendableListView$LayoutParams.d != -2) {
                c[i] = child;
            }
        }
    }
    
    void a(final View view, final int b) {
        final ExtendableListView$LayoutParams extendableListView$LayoutParams = (ExtendableListView$LayoutParams)view.getLayoutParams();
        if (extendableListView$LayoutParams != null) {
            extendableListView$LayoutParams.b = b;
            final int d = extendableListView$LayoutParams.d;
            final boolean hasTransientState = ViewCompat.hasTransientState(view);
            if (!this.b(d) || hasTransientState) {
                if (d != -2 || hasTransientState) {
                    if (this.g == null) {
                        this.g = new ArrayList();
                    }
                    this.g.add(view);
                }
                if (hasTransientState) {
                    if (this.h == null) {
                        this.h = new SparseArrayCompat();
                    }
                    this.h.put(b, view);
                }
            }
            else {
                if (this.e == 1) {
                    this.f.add(view);
                    return;
                }
                this.d[d].add(view);
            }
        }
    }
    
    void b() {
        if (this.e == 1) {
            final ArrayList f = this.f;
            for (int size = f.size(), i = 0; i < size; ++i) {
                ExtendableListView.a(this.a, f.remove(size - 1 - i), false);
            }
        }
        else {
            for (int e = this.e, j = 0; j < e; ++j) {
                final ArrayList list = this.d[j];
                for (int size2 = list.size(), k = 0; k < size2; ++k) {
                    ExtendableListView.b(this.a, list.remove(size2 - 1 - k), false);
                }
            }
        }
        if (this.h != null) {
            this.h.clear();
        }
    }
    
    public boolean b(final int n) {
        return n >= 0;
    }
    
    View c(final int n) {
        final int n2 = n - this.b;
        final View[] c = this.c;
        if (n2 >= 0 && n2 < c.length) {
            final View view = c[n2];
            c[n2] = null;
            return view;
        }
        return null;
    }
    
    void c() {
        if (this.h != null) {
            this.h.clear();
        }
    }
    
    View d(final int n) {
        if (this.e == 1) {
            return ExtendableListView.a(this.f, n);
        }
        final int itemViewType = this.a.h.getItemViewType(n);
        if (itemViewType >= 0 && itemViewType < this.d.length) {
            return ExtendableListView.a(this.d[itemViewType], n);
        }
        return null;
    }
    
    void d() {
        if (this.g == null) {
            return;
        }
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            ExtendableListView.c(this.a, (View)this.g.get(i), false);
        }
        this.g.clear();
    }
    
    void e() {
        final View[] c = this.c;
        final boolean b = this.e > 1;
        ArrayList f = this.f;
        for (int i = -1 + c.length; i >= 0; --i) {
            final View view = c[i];
            if (view != null) {
                final ExtendableListView$LayoutParams extendableListView$LayoutParams = (ExtendableListView$LayoutParams)view.getLayoutParams();
                c[i] = null;
                final boolean hasTransientState = ViewCompat.hasTransientState(view);
                final int d = extendableListView$LayoutParams.d;
                if (!this.b(d) || hasTransientState) {
                    if (d != -2 || hasTransientState) {
                        ExtendableListView.d(this.a, view, false);
                    }
                    if (hasTransientState) {
                        if (this.h == null) {
                            this.h = new SparseArrayCompat();
                        }
                        this.h.put(i + this.b, view);
                    }
                }
                else {
                    if (b) {
                        f = this.d[d];
                    }
                    extendableListView$LayoutParams.b = i + this.b;
                    f.add(view);
                }
            }
        }
        this.f();
    }
}
