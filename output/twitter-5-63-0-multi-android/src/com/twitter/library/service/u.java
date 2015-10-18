// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import java.util.concurrent.TimeUnit;

public class u extends g
{
    public static final int c;
    public static final int d;
    public static final int e;
    
    static {
        c = (int)TimeUnit.SECONDS.toMillis(3L);
        d = (int)TimeUnit.MINUTES.toMillis(5L);
        e = (int)TimeUnit.HOURS.toMillis(1L);
    }
    
    public u() {
        this(u.c, u.d, u.e);
    }
    
    public u(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public u(final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
    }
    
    @Override
    protected int a() {
        return 2 * this.b;
    }
}
