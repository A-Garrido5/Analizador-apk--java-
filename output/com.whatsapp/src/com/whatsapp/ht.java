// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ht implements Runnable
{
    final App a;
    
    ht(final App a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.z();
    }
}
