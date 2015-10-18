// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ue implements Runnable
{
    final a2g a;
    
    ue(final a2g a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AccountInfoActivity.m(this.a.a);
    }
}
