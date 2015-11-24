// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class r1 implements Runnable
{
    final MediaView a;
    
    r1(final MediaView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.finish();
    }
}
