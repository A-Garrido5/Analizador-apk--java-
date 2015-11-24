// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ka implements View$OnClickListener
{
    final AccountInfoActivity a;
    
    ka(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (!AccountInfoActivity.k(this.a)) {
            if (AccountInfoActivity.n(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.i(this.a), new k6(this));
                if (!App.I) {
                    return;
                }
            }
            AccountInfoActivity.d(this.a);
        }
    }
}
