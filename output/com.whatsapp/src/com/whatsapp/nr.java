// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Vector;

class nr extends n9
{
    final x j;
    
    nr(final x j, final String s, final String s2, final Vector vector, final int n) {
        this.j = j;
        super(s, s2, vector, n);
    }
    
    @Override
    public void a(final String s) {
        if (NewGroup.a(this.j.c).b().exists()) {
            this.j.c.runOnUiThread((Runnable)new a_x(this, s));
        }
        super.a(s);
    }
}
