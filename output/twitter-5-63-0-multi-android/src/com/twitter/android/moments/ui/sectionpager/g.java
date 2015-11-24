// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import java.util.Iterator;
import java.util.Collection;
import android.support.annotation.DimenRes;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.util.collection.i;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;

class g extends PagerAdapter implements ViewPager$OnPageChangeListener
{
    final /* synthetic */ e a;
    private i b;
    private i c;
    private int d;
    
    g(final e a) {
        this.a = a;
    }
    
    private i a(final int n, final float n2) {
        final b b = this.a.b.get(n);
        final a b2 = b.b();
        if (b2 != null) {
            if ((this.b == null || b != this.b.b) && (this.c == null || b != this.c.b)) {
                b2.b();
            }
            b2.a(n2);
            return new i(n, b);
        }
        return null;
    }
    
    private void a(final int n, final i i) {
        if (i != null) {
            final int intValue = (int)i.a;
            if (intValue != n && intValue != n + 1) {
                final a b = ((b)i.b).b();
                if (b != null) {
                    b.a(0.0f);
                    b.c();
                }
            }
        }
    }
    
    private boolean b(final int n, final i i) {
        if (i != null && (int)i.a != n) {
            final a b = ((b)i.b).b();
            if (b != null) {
                b.c();
                b.a(0.0f);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final b b = (b)o;
        final a b2 = b.b();
        if (b2 != null) {
            final View a = b2.a();
            if (a.getParent() == viewGroup) {
                viewGroup.removeView(a);
            }
        }
        b.c();
    }
    
    @Override
    public int getCount() {
        return this.a.b.size();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final b b = this.a.b.get(n);
        viewGroup.addView(b.a().a());
        return b;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        final a b = ((b)o).b();
        return b != null && b.a() == view;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        if (n == 0) {
            if (this.b(this.d, this.b)) {
                this.b = null;
            }
            if (this.b(this.d, this.c)) {
                this.c = null;
            }
        }
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        this.a(n, this.b);
        this.a(n, this.c);
        final i a = this.a(n, 1.0f - n2);
        if (n + 1 < this.a.b.size() && n2 > 0.0f) {
            this.c = this.a(n + 1, n2);
        }
        this.b = a;
    }
    
    @Override
    public void onPageSelected(final int d) {
        this.d = d;
    }
}
