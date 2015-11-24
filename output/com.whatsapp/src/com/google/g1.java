// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;

class g1
{
    private static final Iterable a;
    private static final Iterator b;
    
    static {
        b = new fC();
        a = new S();
    }
    
    static Iterable a() {
        return g1.a;
    }
    
    static Iterator b() {
        return g1.b;
    }
}
