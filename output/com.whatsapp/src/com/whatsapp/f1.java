// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class f1 implements Runnable
{
    final AccountInfoActivity a;
    
    f1(final AccountInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.e(this.a);
    }
}
