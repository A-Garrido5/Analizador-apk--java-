// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class rc implements Runnable
{
    final im a;
    final DialogToastActivity$ProgressDialogFragment b;
    
    rc(final im a, final DialogToastActivity$ProgressDialogFragment b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        App.b(this.a.a.getActivity());
        this.b.getActivity().runOnUiThread((Runnable)new o9(this));
    }
}
