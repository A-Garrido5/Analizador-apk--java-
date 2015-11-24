// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class _f implements Runnable
{
    final int a;
    final ps b;
    
    _f(final ps b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!ps.f(this.b).isFinishing()) {
            ps.f(this.b).showDialog(this.a);
        }
    }
}
