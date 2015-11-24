// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.text.TextUtils;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

class on implements TextWatcher
{
    final fa a;
    final EditText b;
    
    on(final fa a, final EditText b) {
        this.a = a;
        this.b = b;
    }
    
    public void afterTextChanged(final Editable editable) {
        Conversation.b(this.a.a, editable.toString());
        Conversation.a(this.a.a, vy.E(Conversation.T(this.a.a)));
        Conversation.a(this.a.a, Conversation.T(this.a.a));
        if (TextUtils.isEmpty((CharSequence)Conversation.T(this.a.a))) {
            Conversation.l(this.a.a);
        }
        this.a.a.u.notifyDataSetChanged();
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)this.b, charSequence);
    }
}
