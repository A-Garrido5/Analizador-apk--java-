// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class zl implements Runnable
{
    final aqh a;
    
    zl(final aqh a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.b((Activity)this.a.a);
        SettingsChat.a(this.a.a).post((Runnable)new yd(this));
    }
}
