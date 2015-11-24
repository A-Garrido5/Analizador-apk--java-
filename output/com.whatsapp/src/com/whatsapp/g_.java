// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class g_ extends Handler
{
    final RegisterName a;
    
    g_(final RegisterName a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        RegisterName.m(this.a);
    }
}
