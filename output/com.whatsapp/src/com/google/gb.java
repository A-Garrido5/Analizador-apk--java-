// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class gb extends gP
{
    private final gP i;
    
    public gb() {
        this.i = new g9();
    }
    
    private static aU a(final aU au) {
        final String a = au.a();
        if (a.charAt(0) == '0') {
            return new aU(a.substring(1), null, au.c(), d3.UPC_A);
        }
        throw fD.a();
    }
    
    @Override
    protected int a(final hN hn, final int[] array, final StringBuilder sb) {
        return this.i.a(hn, array, sb);
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        return a(this.i.a(n, hn, map));
    }
    
    @Override
    public aU a(final int n, final hN hn, final int[] array, final Map map) {
        return a(this.i.a(n, hn, array, map));
    }
    
    @Override
    public aU a(final c1 c1, final Map map) {
        return a(this.i.a(c1, map));
    }
    
    @Override
    d3 a() {
        return d3.UPC_A;
    }
}
