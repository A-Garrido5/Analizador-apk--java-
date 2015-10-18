// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class mp implements ViewTreeObserver$OnGlobalLayoutListener
{
    final ArchivedConversationsFragment a;
    final int b;
    
    mp(final ArchivedConversationsFragment a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onGlobalLayout() {
        this.a.getListView().getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.a.a(this.b);
    }
}
