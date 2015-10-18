// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import android.widget.Button;
import com.twitter.library.util.h;

class ce extends h
{
    final /* synthetic */ Button a;
    final /* synthetic */ ChangeEmailActivity b;
    
    ce(final ChangeEmailActivity b, final Button a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.setEnabled(this.b.b() && this.b.w_());
    }
}
