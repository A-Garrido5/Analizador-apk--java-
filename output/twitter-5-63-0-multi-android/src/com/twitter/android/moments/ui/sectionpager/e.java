// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import android.support.v4.view.PagerAdapter;
import java.util.Iterator;
import java.util.Collection;
import android.support.annotation.DimenRes;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import java.util.List;

public class e
{
    private final List a;
    private final List b;
    private final ViewPager c;
    private final TouchlessViewPager d;
    private final g e;
    private final i f;
    private final j g;
    private h h;
    
    public e(final ViewPager c, final TouchlessViewPager d) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = c;
        this.d = d;
        this.e = new g(this);
        this.f = new i(this);
        this.g = new j(this);
        this.d.setOffscreenPageLimit(5);
        c.setOnPageChangeListener(this.h);
        (this.h = new h(null)).a(this.g);
        this.h.a(this.e);
        this.c.setOnPageChangeListener(this.h);
    }
    
    private int b(final int n) {
        return this.a.indexOf(this.b.get(n).d());
    }
    
    public g a() {
        return this.e;
    }
    
    public void a(@DimenRes final int n) {
        final int dimensionPixelOffset = this.c.getResources().getDimensionPixelOffset(n);
        this.c.setPageMargin(dimensionPixelOffset);
        this.d.setPageMargin(dimensionPixelOffset);
    }
    
    public void a(final ViewPager$OnPageChangeListener viewPager$OnPageChangeListener) {
        this.h.a(viewPager$OnPageChangeListener);
    }
    
    public void a(final List list) {
        this.a.addAll(list);
        final Iterator<c> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b.addAll(iterator.next().d());
        }
        this.e.notifyDataSetChanged();
        this.f.notifyDataSetChanged();
    }
    
    public PagerAdapter b() {
        return this.f;
    }
}
