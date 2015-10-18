// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import java.util.concurrent.TimeUnit;

public class t extends g
{
    private static final int a;
    
    static {
        a = (int)TimeUnit.MINUTES.toMillis(1L);
    }
    
    public t() {
        this(500, t.a);
    }
    
    public t(final int n, final int n2) {
        super(n, n, n2);
    }
    
    @Override
    protected int a() {
        return this.b;
    }
}
