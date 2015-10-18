// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.PopupWindow$OnDismissListener;

class yp implements Runnable
{
    final EmojiPopupWindow$2 a;
    
    yp(final EmojiPopupWindow$2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.setOnDismissListener((PopupWindow$OnDismissListener)null);
        this.a.b.dismiss();
        this.a.b.a(n7.b(this.a.b));
    }
}
