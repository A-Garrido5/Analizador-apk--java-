// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class fU extends fu
{
    private static final fU f;
    private final Map d;
    private final Map e;
    
    static {
        f = new fU(true);
    }
    
    private fU() {
        this.e = new HashMap();
        this.d = new HashMap();
    }
    
    private fU(final boolean b) {
        super(fu.b());
        this.e = Collections.emptyMap();
        this.d = Collections.emptyMap();
    }
    
    public static fU a() {
        return fU.f;
    }
    
    public cu a(final bl bl, final int n) {
        return this.d.get(new a1(bl, n));
    }
}
