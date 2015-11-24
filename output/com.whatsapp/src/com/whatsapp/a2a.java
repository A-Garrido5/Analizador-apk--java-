// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.ViewPager$OnPageChangeListener;

class a2a implements ViewPager$OnPageChangeListener
{
    final bi a;
    
    a2a(final bi a) {
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
        Label_0033: {
            if (App.ak()) {
                bi.a(n);
                if (!App.I) {
                    break Label_0033;
                }
            }
            bi.a(-1 + bi.j(this.a).length - n);
        }
        bi.a(this.a, bi.b());
    }
}
