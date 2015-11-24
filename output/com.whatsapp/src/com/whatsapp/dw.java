// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class dw implements Runnable
{
    final aqm a;
    
    dw(final aqm a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.e(this.a.a);
    }
}
