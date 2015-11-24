// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager;

public class TouchlessViewPager extends ViewPager
{
    public TouchlessViewPager(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
}
