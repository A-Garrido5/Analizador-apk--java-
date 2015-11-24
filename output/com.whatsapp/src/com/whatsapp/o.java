// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class o implements Runnable
{
    final a_9 a;
    
    o(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.a(App.aq.getContentResolver(), this.a.u);
    }
}
