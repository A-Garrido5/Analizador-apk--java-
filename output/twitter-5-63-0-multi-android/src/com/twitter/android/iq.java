// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import com.twitter.library.util.h;

class iq extends h
{
    final /* synthetic */ ip a;
    
    iq(final ip a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.a(editable.toString());
    }
}
