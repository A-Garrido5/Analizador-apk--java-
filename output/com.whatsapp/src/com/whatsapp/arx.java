// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.os.Message;
import android.os.Handler;

class arx extends Handler
{
    final ViewProfilePhoto a;
    
    arx(final ViewProfilePhoto a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final App aq = App.aq;
        int n;
        if (ViewProfilePhoto.a(this.a).m()) {
            n = 2131231120;
        }
        else {
            n = 2131231123;
        }
        App.a((Context)aq, n, 0);
        this.a.findViewById(2131755163).setVisibility(8);
    }
}
