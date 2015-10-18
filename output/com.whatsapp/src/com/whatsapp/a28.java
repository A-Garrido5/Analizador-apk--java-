// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a28 implements Runnable
{
    final boolean a;
    final boolean b;
    final pr c;
    
    a28(final pr c, final boolean b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        pr.a(this.c).runOnUiThread((Runnable)new als(this));
    }
}
