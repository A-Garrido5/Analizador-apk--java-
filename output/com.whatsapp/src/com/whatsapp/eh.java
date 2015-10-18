// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageButton;
import android.text.TextUtils;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;

class eh implements TextWatcher
{
    final CountryPicker a;
    
    eh(final CountryPicker a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)CountryPicker.c(this.a), charSequence);
        final ImageButton b = CountryPicker.b(this.a);
        int visibility;
        if (TextUtils.isEmpty(charSequence)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        b.setVisibility(visibility);
        CountryPicker.a(this.a).getFilter().filter(charSequence);
    }
}
