// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.util.AttributeSet;
import android.content.Context;

class MediaView$MediaViewPager extends PhotoViewPager
{
    final MediaView g;
    
    public MediaView$MediaViewPager(final MediaView g, final Context context, final AttributeSet set) {
        this.g = g;
        super(context, set);
        this.setOnPageChangeListener(new mf(this, g));
        this.setOnInterceptTouchListener(new fq(this, g));
    }
}
