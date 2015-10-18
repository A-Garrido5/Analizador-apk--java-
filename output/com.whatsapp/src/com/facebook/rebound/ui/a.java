// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.widget.BaseAdapter;

class a extends BaseAdapter
{
    private final Context a;
    final SpringConfiguratorView b;
    private final List c;
    
    public a(final SpringConfiguratorView b, final Context a) {
        this.b = b;
        this.a = a;
        this.c = new ArrayList();
    }
    
    public void a() {
        this.c.clear();
        this.notifyDataSetChanged();
    }
    
    public void a(final String s) {
        this.c.add(s);
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public Object getItem(final int n) {
        return this.c.get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        TextView textView2 = null;
        Label_0082: {
            if (view == null) {
                final TextView textView = new TextView(this.a);
                textView.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -1));
                final int a = g.a(12.0f, this.b.getResources());
                textView.setPadding(a, a, a, a);
                textView.setTextColor(SpringConfiguratorView.b(this.b));
                if (SpringConfiguratorView.d == 0) {
                    textView2 = textView;
                    break Label_0082;
                }
            }
            textView2 = (TextView)view;
        }
        textView2.setText((CharSequence)this.c.get(n));
        return (View)textView2;
    }
}
