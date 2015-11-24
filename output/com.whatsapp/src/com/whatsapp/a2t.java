// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;

class a2t implements TextWatcher
{
    final MultipleContactPicker a;
    
    a2t(final MultipleContactPicker a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)MultipleContactPicker.e(this.a), charSequence);
        if (charSequence.length() > 0) {
            MultipleContactPicker.b(this.a, vy.E(charSequence.toString()));
            MultipleContactPicker.a(this.a, MultipleContactPicker.f(this.a));
            MultipleContactPicker.h(this.a).setVisibility(0);
            MultipleContactPicker.a(this.a, true);
            if (!App.I) {
                return;
            }
        }
        MultipleContactPicker.b(this.a, null);
        MultipleContactPicker.h(this.a).setVisibility(8);
        MultipleContactPicker.c(this.a);
        MultipleContactPicker.a(this.a, false);
    }
}
