// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import com.twitter.library.util.h;

class jx extends h
{
    final /* synthetic */ ListCreateEditActivity a;
    
    jx(final ListCreateEditActivity a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.Q();
    }
}
