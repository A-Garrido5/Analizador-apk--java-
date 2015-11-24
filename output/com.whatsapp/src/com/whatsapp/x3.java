// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class x3 implements Runnable
{
    final f2 a;
    final DialogToastActivity$ProgressDialogFragment b;
    
    x3(final f2 a, final DialogToastActivity$ProgressDialogFragment b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        App.c(this.a.a.getActivity());
        this.b.getActivity().runOnUiThread((Runnable)new a_m(this));
    }
}
