// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.util.collection.i;
import android.database.DataSetObserver;
import android.support.annotation.LayoutRes;
import android.widget.BaseAdapter;

public class cv extends BaseAdapter
{
    protected int a;
    protected final BaseAdapter b;
    protected final BaseAdapter c;
    @LayoutRes
    private int d;
    
    public cv(final BaseAdapter b, final BaseAdapter c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = 2130969097;
        final cw cw = new cw(this);
        this.b.registerDataSetObserver((DataSetObserver)cw);
        this.c.registerDataSetObserver((DataSetObserver)cw);
    }
    
    protected int a() {
        final int count = this.b.getCount();
        if (this.c.getCount() <= 0 || count == 0) {
            return 0;
        }
        if (count > this.a) {
            return 2;
        }
        return 1;
    }
    
    public void a(@LayoutRes final int d) {
        this.d = d;
        this.notifyDataSetChanged();
    }
    
    public boolean areAllItemsEnabled() {
        return false;
    }
    
    public void b(final int a) {
        if (this.a != a) {
            this.a = a;
            this.notifyDataSetChanged();
        }
    }
    
    public i c(final int n) {
        final int count = this.b.getCount();
        if (count <= 0) {
            return new i(this.c, n);
        }
        final int count2 = this.c.getCount();
        final int min = Math.min(count, this.a);
        if (n < min || count2 == 0) {
            return new i(this.b, n);
        }
        if (n == min || n == 1 + (min + count2)) {
            return null;
        }
        if (n < 1 + (min + count2)) {
            return new i(this.c, -1 + (n - min));
        }
        return new i(this.b, -2 + (n - count2));
    }
    
    public int getCount() {
        final int count = this.b.getCount();
        final int count2 = this.c.getCount();
        int n;
        if (count2 > 0) {
            n = count2 + this.a();
        }
        else {
            n = 0;
        }
        return n + count;
    }
    
    public Object getItem(final int n) {
        final i c = this.c(n);
        if (c == null) {
            return null;
        }
        return ((BaseAdapter)c.a).getItem((int)c.b);
    }
    
    public long getItemId(final int n) {
        final i c = this.c(n);
        if (c == null) {
            return 0L;
        }
        return ((BaseAdapter)c.a).getItemId((int)c.b);
    }
    
    public int getItemViewType(final int n) {
        final i c = this.c(n);
        if (c == null) {
            return 0;
        }
        final Object a = c.a;
        final BaseAdapter c2 = this.c;
        int viewTypeCount = 0;
        if (a == c2) {
            viewTypeCount = this.b.getViewTypeCount();
        }
        return viewTypeCount + 1 + ((BaseAdapter)c.a).getItemViewType((int)c.b);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final i c = this.c(n);
        if (c == null) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(this.d, viewGroup, false);
        }
        return ((BaseAdapter)c.a).getView((int)c.b, view, viewGroup);
    }
    
    public int getViewTypeCount() {
        return 1 + (this.b.getViewTypeCount() + this.c.getViewTypeCount());
    }
    
    public boolean isEnabled(final int n) {
        final i c = this.c(n);
        return c != null && ((BaseAdapter)c.a).isEnabled((int)c.b);
    }
}
