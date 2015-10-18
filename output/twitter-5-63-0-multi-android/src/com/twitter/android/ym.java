// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import android.widget.BaseAdapter;

public class ym extends BaseAdapter
{
    private final ArrayList a;
    
    public ym() {
        this.a = new ArrayList();
    }
    
    public String a(final int n) {
        return this.a.get(n);
    }
    
    public void a(final List list) {
        this.a.clear();
        this.a.addAll(new LinkedHashSet(list));
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.a.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130969131, (ViewGroup)null);
        }
        else {
            inflate = view;
        }
        ((TextView)inflate).setText((CharSequence)this.a.get(n));
        return inflate;
    }
}
