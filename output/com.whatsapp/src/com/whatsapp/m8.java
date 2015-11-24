// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.content.Context;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.text.TextWatcher;

class m8 implements TextWatcher
{
    final ProfilePhotoReminder a;
    int b;
    
    m8(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        cq.a(editable, (Context)this.a);
        ProfilePhotoReminder.a(this.a).setText((CharSequence)Integer.toString(25 - string.length()));
        if (string.length() >= 25 && this.b == 0) {
            this.b = ProfilePhotoReminder.c(this.a).getInputType();
            if (this.b == 0) {
                return;
            }
            ProfilePhotoReminder.c(this.a).setInputType(0x80000 | this.b);
            ProfilePhotoReminder.c(this.a).setText((CharSequence)string);
            ProfilePhotoReminder.c(this.a).setSelection(string.length());
            if (!App.I) {
                return;
            }
        }
        if (this.b != 0) {
            ProfilePhotoReminder.c(this.a).setInputType(this.b);
            this.b = 0;
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)ProfilePhotoReminder.c(this.a), charSequence);
    }
}
