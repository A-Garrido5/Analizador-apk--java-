// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class p0 implements View$OnClickListener
{
    final int a;
    final PagerSlidingTabStrip b;
    
    p0(final PagerSlidingTabStrip b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        PagerSlidingTabStrip.a(this.b).setCurrentItem(this.a);
    }
}
