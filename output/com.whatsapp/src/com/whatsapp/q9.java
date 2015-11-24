// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class q9 implements View$OnClickListener
{
    final ProfileInfoActivity a;
    
    q9(final ProfileInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        new ah6(this.a, 2131231689, App.q((Context)this.a), new a64(this), 25, 0, 2131231414).show();
    }
}
