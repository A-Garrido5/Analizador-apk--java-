// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.refresh.widget;

import android.widget.Adapter;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.ListView;
import android.database.DataSetObserver;
import android.widget.ListView$FixedViewInfo;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;

class g extends HeaderViewListAdapter
{
    final /* synthetic */ RefreshableListView a;
    private final f b;
    private boolean c;
    private ListAdapter d;
    private final ArrayList e;
    private final ArrayList f;
    
    public g(final RefreshableListView a, final ArrayList e, final ArrayList f, final ListAdapter d, final f b) {
        this.a = a;
        super(e, f, d);
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
        this.b();
    }
    
    private View a(final int n, final View view, final ViewGroup viewGroup) {
        final int headersCount = this.getHeadersCount();
        if (n < headersCount) {
            return this.e.get(n).view;
        }
        final int n2 = n - headersCount;
        int count;
        if (this.d != null) {
            count = this.d.getCount();
            if (n2 < count) {
                return this.d.getView(n2, view, viewGroup);
            }
        }
        else {
            count = 0;
        }
        final int n3 = n2 - count;
        final int size = this.f.size();
        int n4 = 0;
        if (n3 < size) {
            n4 = 0;
            if (n3 >= 0) {
                n4 = n3;
            }
        }
        return ((ListView$FixedViewInfo)this.f.get(n4)).view;
    }
    
    int a() {
        return super.getCount();
    }
    
    public boolean areAllItemsEnabled() {
        return false;
    }
    
    public final void b() {
        if (!this.c) {
            super.registerDataSetObserver((DataSetObserver)this.b);
            this.c = true;
        }
    }
    
    public final void c() {
        if (this.c) {
            super.unregisterDataSetObserver((DataSetObserver)this.b);
            this.c = false;
        }
    }
    
    public int getCount() {
        return this.a.c;
    }
    
    public Object getItem(final int n) {
        final int refreshHeaderPosition = this.a.getRefreshHeaderPosition();
        if (!this.a.o) {
            return super.getItem(n);
        }
        if (n == refreshHeaderPosition) {
            return null;
        }
        if (n < refreshHeaderPosition) {
            return super.getItem(n);
        }
        return super.getItem(n - 1);
    }
    
    public long getItemId(final int n) {
        final int refreshHeaderPosition = this.a.getRefreshHeaderPosition();
        if (!this.a.o) {
            return super.getItemId(n);
        }
        if (n == refreshHeaderPosition) {
            return 0L;
        }
        if (n < refreshHeaderPosition) {
            return super.getItemId(n);
        }
        return super.getItemId(n - 1);
    }
    
    public int getItemViewType(final int n) {
        final int refreshHeaderPosition = this.a.getRefreshHeaderPosition();
        if (!this.a.o) {
            return super.getItemViewType(n);
        }
        if (n == refreshHeaderPosition) {
            return -1;
        }
        if (n < refreshHeaderPosition) {
            return super.getItemViewType(n);
        }
        return super.getItemViewType(n - 1);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final int refreshHeaderPosition = this.a.getRefreshHeaderPosition();
        if (!this.a.o) {
            return this.a(n, view, viewGroup);
        }
        if (n == refreshHeaderPosition) {
            if (this.a.c(34)) {
                return (View)this.a.b;
            }
            return this.a.j;
        }
        else {
            if (n < refreshHeaderPosition) {
                return this.a(n, view, viewGroup);
            }
            return this.a(n - 1, view, viewGroup);
        }
    }
    
    public boolean isEnabled(final int n) {
        if (!this.a.o) {
            return super.isEnabled(n);
        }
        if (n == this.a.getRefreshHeaderPosition()) {
            return false;
        }
        if (n < this.a.getRefreshHeaderPosition()) {
            return super.isEnabled(n);
        }
        return super.isEnabled(n - 1);
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.b.a(dataSetObserver);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.b.b(dataSetObserver);
    }
}
