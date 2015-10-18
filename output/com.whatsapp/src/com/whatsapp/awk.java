// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class awk implements Runnable
{
    final String a;
    
    awk(final String a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.a(App.aq.getContentResolver(), this.a);
    }
}
