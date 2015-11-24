// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.HorizontalScrollView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class an implements ViewTreeObserver$OnGlobalLayoutListener
{
    final HorizontalScrollView a;
    final GroupChatInfo b;
    
    an(final GroupChatInfo b, final HorizontalScrollView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.a.fullScroll(66);
    }
}
