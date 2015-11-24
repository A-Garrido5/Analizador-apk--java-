// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.view.ViewParent;
import android.support.v4.view.ViewPager$OnPageChangeListener;

public class o implements ViewPager$OnPageChangeListener
{
    private ViewParent a;
    private int b;
    
    public o(final ViewParent a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        if (n3 >= this.b) {
            this.a.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    @Override
    public void onPageSelected(final int n) {
        this.a.requestDisallowInterceptTouchEvent(false);
    }
}
