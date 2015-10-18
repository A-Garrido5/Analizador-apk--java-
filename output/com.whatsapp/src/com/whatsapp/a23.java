// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a23 implements View$OnClickListener
{
    final SetStatus a;
    
    a23(final SetStatus a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.showDialog(50);
    }
}
