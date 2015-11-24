// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.ViewPager$OnPageChangeListener;

class is implements ViewPager$OnPageChangeListener
{
    final PagerSlidingTabStrip a;
    
    private is(final PagerSlidingTabStrip a) {
        this.a = a;
    }
    
    is(final PagerSlidingTabStrip pagerSlidingTabStrip, final q_ q_) {
        this(pagerSlidingTabStrip);
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        if (n == 0) {
            PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.a(this.a).getCurrentItem(), 0);
        }
        if (this.a.f != null) {
            this.a.f.onPageScrollStateChanged(n);
        }
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        PagerSlidingTabStrip.a(this.a, n);
        PagerSlidingTabStrip.a(this.a, n2);
        PagerSlidingTabStrip.a(this.a, n, (int)(n2 * PagerSlidingTabStrip.c(this.a).getChildAt(n).getWidth()));
        this.a.invalidate();
        if (this.a.f != null) {
            this.a.f.onPageScrolled(n, n2, n3);
        }
    }
    
    @Override
    public void onPageSelected(final int n) {
        if (this.a.f != null) {
            this.a.f.onPageSelected(n);
        }
    }
}
