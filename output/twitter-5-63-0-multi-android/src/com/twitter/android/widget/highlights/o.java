// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.view.View;
import java.util.Comparator;

class o implements Comparator
{
    public int a(final View view, final View view2) {
        final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)view.getLayoutParams();
        final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams2 = (StoriesViewPager$LayoutParams)view2.getLayoutParams();
        if (storiesViewPager$LayoutParams.a == storiesViewPager$LayoutParams2.a) {
            return storiesViewPager$LayoutParams.e - storiesViewPager$LayoutParams2.e;
        }
        if (storiesViewPager$LayoutParams.a) {
            return 1;
        }
        return -1;
    }
}
