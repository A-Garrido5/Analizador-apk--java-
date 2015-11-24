// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import java.util.Iterator;
import java.util.Collection;
import android.support.annotation.DimenRes;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.PagerAdapter;

class i extends PagerAdapter
{
    final /* synthetic */ e a;
    
    i(final e a) {
        this.a = a;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final c c = (c)o;
        final View b = c.b();
        if (b != null && b.getParent() == viewGroup) {
            viewGroup.removeView(b);
        }
        c.c();
    }
    
    @Override
    public int getCount() {
        return this.a.a.size();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final c c = this.a.a.get(n);
        viewGroup.addView(c.a());
        return c;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return ((c)o).b() == view;
    }
}
