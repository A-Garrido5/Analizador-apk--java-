// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.ViewGroup;

class b2 implements Runnable
{
    final cw a;
    final ViewGroup b;
    
    b2(final cw a, final ViewGroup b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        try {
            b_.a(this.a.a, this.b);
        }
        catch (Exception ex) {}
    }
}
