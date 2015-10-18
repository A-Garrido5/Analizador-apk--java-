// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.ViewPager$OnPageChangeListener;

class mf implements ViewPager$OnPageChangeListener
{
    final MediaView$MediaViewPager a;
    final MediaView b;
    
    mf(final MediaView$MediaViewPager a, final MediaView b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
    }
    
    @Override
    public void onPageSelected(final int n) {
        MediaView.g(this.a.g, n);
    }
}
