// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class tn implements Runnable
{
    final MediaView a;
    
    tn(final MediaView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.finish();
    }
}
