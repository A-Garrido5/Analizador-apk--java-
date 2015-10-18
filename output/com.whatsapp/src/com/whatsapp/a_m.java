// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a_m implements Runnable
{
    final x3 a;
    
    a_m(final x3 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.dismiss();
    }
}
