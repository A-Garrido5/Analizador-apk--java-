// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aw9 implements Runnable
{
    final zf a;
    
    aw9(final zf a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.ak.a(this.a.b, false, -1);
    }
}
