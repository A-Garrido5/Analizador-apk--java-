// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a21 implements Runnable
{
    final HomeActivity a;
    final String b;
    
    a21(final HomeActivity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.i(this.b);
        }
        catch (InterruptedException ex) {}
    }
}
