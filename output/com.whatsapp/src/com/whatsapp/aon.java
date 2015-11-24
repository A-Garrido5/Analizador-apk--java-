// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class aon implements ViewTreeObserver$OnGlobalLayoutListener
{
    final ListChatInfo a;
    
    aon(final ListChatInfo a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        ListChatInfo.h(this.a);
    }
}
