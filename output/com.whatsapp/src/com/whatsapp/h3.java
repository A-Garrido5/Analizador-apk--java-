// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View$OnClickListener;

class h3 implements View$OnClickListener
{
    final NewGroup a;
    
    h3(final NewGroup a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        NewGroup.a(this.a).t = NewGroup.b(this.a).getText().toString();
        qp.a(NewGroup.a(this.a), this.a, 12);
    }
}
