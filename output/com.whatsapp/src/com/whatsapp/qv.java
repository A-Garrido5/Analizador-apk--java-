// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class qv implements Runnable
{
    final w0 a;
    
    qv(final w0 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        pr.b(this.a.a).removeMessages(1);
        pr.a(this.a.a).showDialog(201);
    }
}
