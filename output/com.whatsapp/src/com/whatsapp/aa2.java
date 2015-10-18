// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aa2 implements Runnable
{
    final AccountInfoActivity a;
    
    aa2(final AccountInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.g(this.a);
    }
}
