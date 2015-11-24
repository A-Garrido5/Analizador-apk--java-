// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;

public class z
{
    private final Iterator a;
    private final boolean b;
    private Map.Entry c;
    final dv d;
    
    private z(final dv d, final boolean b) {
        this.d = d;
        this.a = dv.a(this.d).g();
        if (this.a.hasNext()) {
            this.c = (Map.Entry)this.a.next();
        }
        this.b = b;
    }
    
    z(final dv dv, final boolean b, final cM cm) {
        this(dv, b);
    }
}
