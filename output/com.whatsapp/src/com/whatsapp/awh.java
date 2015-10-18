// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class awh implements Runnable
{
    final a1 a;
    
    awh(final a1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.j(this.a.b.a);
        App.a(this.a.b);
    }
}
