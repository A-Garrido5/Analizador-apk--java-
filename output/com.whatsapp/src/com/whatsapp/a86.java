// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;

class a86 implements TextWatcher
{
    final MultipleContactsSelector a;
    
    a86(final MultipleContactsSelector a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)this.a.t, charSequence);
    }
}
