// 
// Decompiled by Procyon v0.5.30
// 

package com.viewpagerindicator;

import android.support.v4.view.ViewPager;

public interface PageIndicator extends OnPageChangeListener
{
    void notifyDataSetChanged();
    
    void setCurrentItem(final int p0);
    
    void setOnPageChangeListener(final OnPageChangeListener p0);
    
    void setViewPager(final ViewPager p0);
    
    void setViewPager(final ViewPager p0, final int p1);
}
