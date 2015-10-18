// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class zu implements Runnable
{
    final nq a;
    
    zu(final nq a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.g(this.a.a);
    }
}
