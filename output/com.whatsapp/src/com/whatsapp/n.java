// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;

class n implements TextWatcher
{
    final CallRatingActivity a;
    private int b;
    
    n(final CallRatingActivity a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        Label_0122: {
            if (string.codePointCount(0, string.length()) >= CallRatingActivity.b() && this.b == 0) {
                this.b = CallRatingActivity.a(this.a).getInputType();
                if (this.b == 0) {
                    break Label_0122;
                }
                CallRatingActivity.a(this.a).setInputType(0x80000 | this.b);
                CallRatingActivity.a(this.a).setText((CharSequence)string);
                CallRatingActivity.a(this.a).setSelection(string.length());
                if (!App.I) {
                    break Label_0122;
                }
            }
            if (this.b != 0) {
                CallRatingActivity.a(this.a).setInputType(this.b);
                this.b = 0;
            }
        }
        CallRatingActivity.b(this.a);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)CallRatingActivity.a(this.a), charSequence);
    }
}
