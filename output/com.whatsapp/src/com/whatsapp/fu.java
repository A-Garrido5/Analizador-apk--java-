// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.aq;

class fu implements Runnable
{
    final adc a;
    final String b;
    final String c;
    
    fu(final adc a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        App.aq.a2.h().b(new aq(this.c, ha.g(this.b)));
    }
}
