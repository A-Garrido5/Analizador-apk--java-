// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class adk implements Runnable
{
    final AccountInfoActivity a;
    
    adk(final AccountInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.m(this.a);
    }
}
