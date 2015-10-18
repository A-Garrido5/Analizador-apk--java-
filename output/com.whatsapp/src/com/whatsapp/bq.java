// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class bq implements Runnable
{
    final String a;
    final Conversations b;
    
    bq(final Conversations b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.i(this.a);
        }
        catch (InterruptedException ex) {}
    }
}
