// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnLongClickListener;

class r5 implements View$OnLongClickListener
{
    final AccountInfoActivity a;
    
    r5(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        AccountInfoActivity.a(this.a).onClick(view);
        return true;
    }
}
