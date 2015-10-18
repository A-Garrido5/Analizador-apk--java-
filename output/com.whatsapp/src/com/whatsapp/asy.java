// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class asy implements Runnable
{
    final HomeActivity a;
    
    asy(final HomeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        HomeActivity.a(this.a, false);
    }
}
