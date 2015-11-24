// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class aw1 implements Runnable
{
    final aqf a;
    
    aw1(final aqf a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.c((Activity)this.a.a);
        SettingsChat.a(this.a.a).post((Runnable)new as_(this));
    }
}
