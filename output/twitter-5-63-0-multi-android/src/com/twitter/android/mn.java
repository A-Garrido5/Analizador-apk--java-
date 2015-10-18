// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.internal.android.widget.NavItemView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.widget.BaseAdapter;

public class mn extends BaseAdapter
{
    List a;
    int b;
    private int c;
    
    public mn(final List a) {
        this.b = 1;
        this.a = a;
    }
    
    int a() {
        return 2130968936;
    }
    
    public void a(final int c) {
        if (this.c != c) {
            this.c = c;
            this.notifyDataSetChanged();
        }
    }
    
    public int b() {
        return this.c;
    }
    
    public List c() {
        return this.a;
    }
    
    public int getCount() {
        return this.a.size();
    }
    
    public Object getItem(final int n) {
        return this.a.get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(context).inflate(this.a(), viewGroup, false);
        }
        else {
            inflate = view;
        }
        final NavItemView navItemView = (NavItemView)inflate;
        final gm gm = this.a.get(n);
        navItemView.setText(gm.d);
        navItemView.setIconResource(gm.i);
        navItemView.setBadgeMode(this.b);
        String contentDescription = context.getString(2131297930, new Object[] { gm.d });
        if (this.c == n) {
            contentDescription = context.getString(2131297664) + ". " + contentDescription;
        }
        navItemView.setContentDescription((CharSequence)contentDescription);
        navItemView.setIndicatorCount(gm.k);
        return inflate;
    }
}
