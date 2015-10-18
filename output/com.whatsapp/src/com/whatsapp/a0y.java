// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class a0y implements View$OnClickListener
{
    final DeleteAccount a;
    
    a0y(final DeleteAccount a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent((Context)this.a, (Class)CountryPicker.class);
        intent.putExtra(CountryPicker.q, this.a.u.getText().toString());
        this.a.startActivityForResult(intent, 0);
        this.a.t.removeTextChangedListener(DeleteAccount.c(this.a));
    }
}
