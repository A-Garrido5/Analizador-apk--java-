// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import android.text.Editable;
import android.widget.Button;
import com.twitter.library.util.h;

class yz extends h
{
    final /* synthetic */ Button a;
    final /* synthetic */ VerifyLoginActivity b;
    
    yz(final VerifyLoginActivity b, final Button a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.setEnabled(!TextUtils.isEmpty((CharSequence)editable.toString()));
    }
}
