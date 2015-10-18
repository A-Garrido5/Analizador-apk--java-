// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class arp implements View$OnClickListener
{
    final AccountInfoActivity a;
    
    arp(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.findViewById(2131755134).setVisibility(8);
        this.a.findViewById(2131755132).setVisibility(0);
        AccountInfoActivity.a(this.a, (String)null);
    }
}
