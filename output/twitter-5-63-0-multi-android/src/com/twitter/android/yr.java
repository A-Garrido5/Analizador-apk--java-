// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import android.widget.TextView;
import com.twitter.library.util.h;

class yr extends h
{
    final /* synthetic */ TextView a;
    final /* synthetic */ UsersFragment b;
    
    yr(final UsersFragment b, final TextView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.setText((CharSequence)editable.toString());
    }
}
