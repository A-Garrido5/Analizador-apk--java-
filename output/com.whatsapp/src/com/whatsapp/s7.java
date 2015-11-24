// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class s7 extends sj
{
    final ao2 a;
    
    s7(final ao2 a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi, final int n) {
        if (bi.I == 0 && bi.c == 6 && ao2.a(this.a).equals(bi.a.a) && App.S.e().u.equals(bi.t) && (bi.L == 5L || bi.L == 7L)) {
            ao2.h(this.a).finish();
        }
    }
}
