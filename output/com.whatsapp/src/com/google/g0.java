// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.LinkedHashMap;

class g0 extends LinkedHashMap
{
    final aw a;
    
    g0(final aw a, final int n, final float n2, final boolean b) {
        this.a = a;
        super(n, n2, b);
    }
    
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > aw.a(this.a);
    }
}
