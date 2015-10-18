// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class gy implements Runnable
{
    final qu a;
    
    gy(final qu a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        QuickContactActivity.a(this.a.a, false);
    }
}
