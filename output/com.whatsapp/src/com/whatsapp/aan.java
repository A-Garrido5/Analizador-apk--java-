// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aan implements Runnable
{
    final HomeActivity a;
    
    aan(final HomeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        HomeActivity.i(this.a);
    }
}
