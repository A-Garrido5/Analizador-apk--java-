// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import android.support.v4.view.PagerAdapter;
import java.util.Iterator;
import java.util.Collection;
import android.support.annotation.DimenRes;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.view.ViewPager$OnPageChangeListener;

class j implements ViewPager$OnPageChangeListener
{
    final /* synthetic */ e a;
    private int b;
    private int c;
    
    j(final e a) {
        this.a = a;
    }
    
    private int a(final int n) {
        return this.a.b(n) * (this.a.c.getWidth() + this.a.c.getPageMargin());
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        if (n == 0) {
            this.c = this.b;
            this.a.d.setCurrentItem(this.a.a.indexOf(this.a.b.get(this.c).d()), false);
            this.a.d.setScrollX(this.a(this.c));
        }
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        final int n4 = this.a.c.getWidth() + this.a.c.getPageMargin();
        final b b = this.a.b.get(n);
        final c d = b.d();
        final int index = d.d().indexOf(b);
        final int scrollX = n4 * this.a.a.indexOf(d);
        if (index == -1 + d.d().size()) {
            this.a.d.setScrollX(scrollX + n3);
        }
        else if (this.a.d.getScrollX() != scrollX) {
            this.a.d.setScrollX(scrollX);
        }
    }
    
    @Override
    public void onPageSelected(final int b) {
        this.b = b;
    }
}
