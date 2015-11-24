// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class c extends BaseAdapter
{
    private final LayoutInflater a;
    private final List b;
    
    public c(final LayoutInflater a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public int getCount() {
        return 1;
    }
    
    public Object getItem(final int n) {
        return n;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (view == null) {
            viewGroup2 = (ViewGroup)this.a.inflate(2130968894, viewGroup, false);
        }
        else {
            viewGroup2 = (ViewGroup)view;
        }
        ((HorizontalListView)viewGroup2.findViewById(2131886959)).setAdapter((ListAdapter)new g(this.a, this.b));
        return (View)viewGroup2;
    }
}
