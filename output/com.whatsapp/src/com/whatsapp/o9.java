// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class o9 implements Runnable
{
    final rc a;
    
    o9(final rc a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.dismiss();
    }
}
