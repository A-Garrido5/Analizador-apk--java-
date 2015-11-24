// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a6b implements Runnable
{
    final String a;
    final dt b;
    
    a6b(final dt b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.d(this.a);
    }
}
