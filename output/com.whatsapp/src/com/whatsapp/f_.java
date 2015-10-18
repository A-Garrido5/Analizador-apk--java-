// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class f_ implements Runnable
{
    final b1 a;
    
    f_(final b1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        RegisterName.a(this.a.a, true);
    }
}
