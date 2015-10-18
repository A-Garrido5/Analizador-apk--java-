// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class g3 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final CallLogActivity a;
    
    g3(final CallLogActivity a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        CallLogActivity.a(this.a);
    }
}
