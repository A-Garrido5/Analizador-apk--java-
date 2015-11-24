// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View$OnClickListener;

class zy implements View$OnClickListener
{
    final RegisterName a;
    
    zy(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        qp.a(RegisterName.j(this.a), this.a, 12);
    }
}
