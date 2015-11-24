// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bo;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

class sx extends BaseAdapter
{
    protected sy[] a;
    private final int b;
    
    sx(final sy sy) {
        this(new sy[] { sy });
    }
    
    sx(final sy[] array) {
        this(array, 2130969110);
    }
    
    sx(final sy[] a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final int n, final int a) {
        this.a[n].a = a;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.a.length;
    }
    
    public Object getItem(final int n) {
        return this.a[n].c;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        return sz.a(this.b, view, viewGroup, this.a[n], bo.a);
    }
}
