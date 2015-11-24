// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.support.v4.view.PagerAdapter;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.ViewPager;

public class TimelineViewPager extends ViewPager
{
    private ViewPager$OnPageChangeListener a;
    
    public TimelineViewPager(final Context context) {
        super(context);
    }
    
    public TimelineViewPager(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public boolean canScrollHorizontally(final int n) {
        return true;
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        int n3 = View$MeasureSpec.getSize(n);
        final PagerAdapter adapter = this.getAdapter();
        if (adapter != null && adapter.getCount() > 0 && n3 > 0) {
            n3 = Math.max((int)(adapter.getPageWidth(0) * n3) - this.getPaddingLeft() - this.getPaddingRight(), 0);
        }
        final int childCount = this.getChildCount();
        int i = 0;
        int max = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            child.measure(View$MeasureSpec.makeMeasureSpec(n3, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
            max = Math.max(max, child.getMeasuredHeight());
            ++i;
        }
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(max, 1073741824));
    }
    
    @Override
    public void setCurrentItem(final int currentItem) {
        final int currentItem2 = this.getCurrentItem();
        super.setCurrentItem(currentItem);
        if (currentItem2 == currentItem && this.a != null) {
            this.a.onPageSelected(currentItem);
        }
    }
    
    @Override
    public void setOnPageChangeListener(final ViewPager$OnPageChangeListener viewPager$OnPageChangeListener) {
        super.setOnPageChangeListener(viewPager$OnPageChangeListener);
        this.a = viewPager$OnPageChangeListener;
    }
}
