// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;

class adz implements i4
{
    final ao2 a;
    
    adz(final ao2 a) {
        this.a = a;
    }
    
    @Override
    public void a(final bt bt) {
        ao2.e(this.a);
    }
    
    @Override
    public void a(final String s, final String s2) {
    }
    
    @Override
    public void b(final String s, final String s2) {
        if (ao2.a(this.a).equals(s)) {
            ao2.e(this.a);
        }
    }
}
