// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class k8 implements View$OnClickListener
{
    final ViewSharedContactActivity a;
    
    k8(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ViewSharedContactActivity.a(this.a);
    }
}
