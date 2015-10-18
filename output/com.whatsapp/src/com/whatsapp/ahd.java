// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.text.TextWatcher;

class ahd implements TextWatcher
{
    private int a;
    final ah6 b;
    
    ahd(final ah6 b) {
        this.b = b;
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        cq.a(editable, ah6.a(this.b));
        if (ah6.f(this.b) > 0) {
            final int codePointCount = string.codePointCount(0, string.length());
            ah6.h(this.b).setText((CharSequence)Integer.toString(ah6.f(this.b) - codePointCount));
            if (codePointCount >= ah6.f(this.b) && this.a == 0) {
                this.a = ah6.e(this.b).getInputType();
                if (this.a == 0) {
                    return;
                }
                ah6.e(this.b).setInputType(0x80000 | this.a);
                ah6.e(this.b).setText((CharSequence)string);
                ah6.e(this.b).setSelection(string.length());
                if (!App.I) {
                    return;
                }
            }
            if (this.a != 0) {
                ah6.e(this.b).setInputType(this.a);
                this.a = 0;
            }
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)ah6.e(this.b), charSequence);
    }
}
