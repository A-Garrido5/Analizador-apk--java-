// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class ug implements Runnable
{
    final String a;
    
    ug(final String a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.a(App.aq.getContentResolver(), this.a);
    }
}
