// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class _a implements ViewTreeObserver$OnGlobalLayoutListener
{
    final tg a;
    
    _a(final tg a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        ConversationsFragment.k(this.a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.a.a.a.a(this.a.a.b);
    }
}
