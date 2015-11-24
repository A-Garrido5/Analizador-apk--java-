// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import com.twitter.library.util.h;

class no extends h
{
    final /* synthetic */ PhoneMTVerifyFragment a;
    
    no(final PhoneMTVerifyFragment a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.b();
    }
}
