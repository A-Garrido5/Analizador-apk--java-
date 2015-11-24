// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class a2g implements View$OnClickListener
{
    final AccountInfoActivity a;
    
    a2g(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (!AccountInfoActivity.k(this.a)) {
            if (AccountInfoActivity.n(this.a)) {
                AccountInfoActivity.a(this.a, AccountInfoActivity.i(this.a), new ue(this));
                if (!i) {
                    return;
                }
            }
            if (AccountInfoActivity.l(this.a)) {
                AccountInfoActivity.m(this.a);
                if (!i) {
                    return;
                }
            }
            this.a.showDialog(9);
        }
    }
}
