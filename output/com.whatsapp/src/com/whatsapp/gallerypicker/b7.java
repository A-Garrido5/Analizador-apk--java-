// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager$OnPageChangeListener;

class b7 implements ViewPager$OnPageChangeListener
{
    final ImagePreview a;
    
    b7(final ImagePreview a) {
        this.a = a;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
    }
    
    @Override
    public void onPageSelected(final int n) {
        ImagePreview.a(this.a, n);
    }
}
