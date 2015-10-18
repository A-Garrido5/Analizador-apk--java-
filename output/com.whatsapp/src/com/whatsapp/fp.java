// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

class fp implements Runnable
{
    final c5 a;
    final ArrayList b;
    
    fp(final c5 a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.a.isCancelled()) {
            ContactInfo.b(this.a.a, this.b);
        }
    }
}
