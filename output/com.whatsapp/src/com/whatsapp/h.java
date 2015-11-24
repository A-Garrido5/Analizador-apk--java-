// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class h implements Runnable
{
    final dt a;
    final String b;
    
    h(final dt a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        App.d(this.b);
    }
}
