// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.method.TextKeyListener;
import android.view.View;
import android.view.View$OnClickListener;

class w8 implements View$OnClickListener
{
    final ah6 a;
    
    w8(final ah6 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ah6.a(this.a, false);
        ah6.a(this.a, null);
        ah6.g(this.a).removeDialog(50);
        TextKeyListener.clear(ah6.e(this.a).getText());
        this.a.dismiss();
    }
}
