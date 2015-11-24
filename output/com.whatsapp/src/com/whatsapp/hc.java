// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

final class hc implements Runnable
{
    final boolean a;
    final Activity b;
    final String c;
    final boolean d;
    
    hc(final Activity b, final boolean d, final String c, final boolean a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.b(this.b, this.d, this.c, this.a);
        }
        catch (InterruptedException ex) {}
    }
}
