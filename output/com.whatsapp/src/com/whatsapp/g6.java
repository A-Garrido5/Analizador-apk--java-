// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class g6 implements Runnable
{
    final a_9 a;
    final s1 b;
    
    g6(final s1 b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.S.g(this.a);
    }
}
