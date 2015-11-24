// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

class x7 implements CompoundButton$OnCheckedChangeListener
{
    final AccountInfoActivity a;
    private boolean b;
    
    x7(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        if (this.b) {
            return;
        }
        this.b = true;
        if (b) {
            if (AccountInfoActivity.f(this.a).getId() != compoundButton.getId()) {
                AccountInfoActivity.f(this.a).setChecked(false);
            }
            if (AccountInfoActivity.j(this.a).getId() != compoundButton.getId()) {
                AccountInfoActivity.j(this.a).setChecked(false);
            }
            if (AccountInfoActivity.b(this.a).getId() != compoundButton.getId()) {
                AccountInfoActivity.b(this.a).setChecked(false);
            }
        }
        this.b = false;
    }
}
