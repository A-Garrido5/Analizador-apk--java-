// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class om implements View$OnClickListener
{
    final View a;
    final AccountInfoActivity b;
    final View c;
    final View d;
    
    om(final AccountInfoActivity b, final View d, final View a, final View c) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public void onClick(final View view) {
        if (view == this.d) {
            AccountInfoActivity.f(this.b).setChecked(true);
        }
        if (view == this.a) {
            AccountInfoActivity.j(this.b).setChecked(true);
        }
        if (view == this.c) {
            AccountInfoActivity.b(this.b).setChecked(true);
        }
    }
}
