// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class kx extends k1
{
    private kx(final int n, final int n2, final int n3) {
        super(n, null, n2, n3, null);
    }
    
    kx(final int n, final int n2, final int n3, final r0 r0) {
        this(n, n2, n3);
    }
    
    @Override
    public int a() {
        return Math.min(35, bi.c().size());
    }
    
    @Override
    public int a(final int n) {
        return bi.c().get(n).code;
    }
}
