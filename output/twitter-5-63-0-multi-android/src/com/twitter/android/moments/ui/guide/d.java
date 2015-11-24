// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.view.ViewGroup;
import android.view.View;
import android.widget.ListAdapter;
import com.twitter.util.r;
import android.widget.BaseAdapter;

class d extends BaseAdapter
{
    private final r a;
    private final ListAdapter b;
    
    public d(final r a, final ListAdapter b) {
        this.a = a;
        this.b = b;
    }
    
    public int getCount() {
        return 1 + this.b.getCount();
    }
    
    public Object getItem(final int n) {
        if (n == 0) {
            return new Object();
        }
        return this.b.getItem(n - 1);
    }
    
    public long getItemId(final int n) {
        if (n == 0) {
            return 10000L;
        }
        return this.b.getItemId(n - 1);
    }
    
    public int getItemViewType(final int n) {
        if (n == 0) {
            return this.b.getViewTypeCount();
        }
        return this.b.getItemViewType(n - 1);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (n == 0) {
            return (View)this.a.b();
        }
        return this.b.getView(n - 1, view, viewGroup);
    }
    
    public int getViewTypeCount() {
        return 1 + this.b.getViewTypeCount();
    }
    
    public boolean isEnabled(final int n) {
        return n == 0 || this.b.isEnabled(n - 1);
    }
}
