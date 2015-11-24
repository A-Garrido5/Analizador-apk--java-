// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

class am implements Runnable
{
    final p a;
    
    am(final p a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.c();
    }
}
