// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.v4.view.PagerAdapter;

class vz extends PagerAdapter
{
    final bi a;
    
    private vz(final bi a) {
        this.a = a;
    }
    
    vz(final bi bi, final r0 r0) {
        this(bi);
    }
    
    @Override
    public void destroyItem(final View view, final int n, final Object o) {
        ((ViewPager)view).removeView((View)o);
    }
    
    @Override
    public int getCount() {
        return bi.j(this.a).length;
    }
    
    @Override
    public Object instantiateItem(final View view, int n) {
        final View inflate = bi.d(this.a).inflate(2130903151, (ViewGroup)null);
        final ListView listView = (ListView)inflate.findViewById(16908298);
        if (!App.ak()) {
            n = -1 + bi.j(this.a).length - n;
        }
        if (bi.j(this.a)[n] == null) {
            bi.j(this.a)[n] = new io(this.a, bi.g(this.a), n);
        }
        listView.setAdapter((ListAdapter)bi.j(this.a)[n]);
        listView.setEmptyView(inflate.findViewById(16908292));
        ((ViewPager)view).addView(inflate, 0);
        return inflate;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
}
