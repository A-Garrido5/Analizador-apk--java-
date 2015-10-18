// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.content.Context;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.text.TextWatcher;

class a9n implements TextWatcher
{
    final NewGroup a;
    private int b;
    
    a9n(final NewGroup a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        cq.a(editable, (Context)this.a);
        final int codePointCount = string.codePointCount(0, string.length());
        NewGroup.d(this.a).setText((CharSequence)Integer.toString(ym.m - codePointCount));
        if (codePointCount >= ym.m && this.b == 0) {
            this.b = NewGroup.b(this.a).getInputType();
            if (this.b == 0) {
                return;
            }
            NewGroup.b(this.a).setInputType(0x80000 | this.b);
            NewGroup.b(this.a).setText((CharSequence)string);
            NewGroup.b(this.a).setSelection(string.length());
            if (!App.I) {
                return;
            }
        }
        if (this.b != 0) {
            NewGroup.b(this.a).setInputType(this.b);
            this.b = 0;
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)NewGroup.b(this.a), charSequence);
    }
}
