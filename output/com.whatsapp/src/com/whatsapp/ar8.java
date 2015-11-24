// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ar8 implements Runnable
{
    final bd a;
    
    ar8(final bd a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        SettingsChat.b(this.a.a);
    }
}
