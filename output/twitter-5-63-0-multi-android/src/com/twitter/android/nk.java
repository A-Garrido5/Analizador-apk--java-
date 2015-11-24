// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import com.twitter.library.util.h;

class nk extends h
{
    final /* synthetic */ PhoneMTEntryFragment a;
    
    nk(final PhoneMTEntryFragment a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.b();
    }
}
