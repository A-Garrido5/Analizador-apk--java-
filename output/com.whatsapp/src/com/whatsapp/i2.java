// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class i2 implements Runnable
{
    final MediaView a;
    
    i2(final MediaView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.finish();
    }
}
