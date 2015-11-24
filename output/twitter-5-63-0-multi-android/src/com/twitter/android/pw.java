// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Button;

class pw implements Runnable
{
    final /* synthetic */ Button a;
    final /* synthetic */ RemoveAccountDialogActivity b;
    
    pw(final RemoveAccountDialogActivity b, final Button a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setEnabled(true);
    }
}
