// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class aqm implements View$OnClickListener
{
    final AccountInfoActivity a;
    
    aqm(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (!AccountInfoActivity.k(this.a)) {
            if (AccountInfoActivity.n(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.i(this.a), new dw(this));
                if (!i) {
                    return;
                }
            }
            if (AccountInfoActivity.l(this.a)) {
                AccountInfoActivity.e(this.a);
                if (!i) {
                    return;
                }
            }
            this.a.showDialog(11);
        }
    }
}
