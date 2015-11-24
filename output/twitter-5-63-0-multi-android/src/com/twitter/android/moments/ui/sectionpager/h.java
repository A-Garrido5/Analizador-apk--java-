// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.support.v4.view.ViewPager$OnPageChangeListener;

class h implements ViewPager$OnPageChangeListener
{
    private final List a;
    
    private h() {
        this.a = new ArrayList();
    }
    
    public void a(final ViewPager$OnPageChangeListener viewPager$OnPageChangeListener) {
        this.a.add(viewPager$OnPageChangeListener);
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        final Iterator<ViewPager$OnPageChangeListener> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPageScrollStateChanged(n);
        }
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        final Iterator<ViewPager$OnPageChangeListener> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPageScrolled(n, n2, n3);
        }
    }
    
    @Override
    public void onPageSelected(final int n) {
        final Iterator<ViewPager$OnPageChangeListener> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().onPageSelected(n);
        }
    }
}
