// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import java.util.Map;

final class g implements u
{
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;
    final /* synthetic */ f c;
    
    g(final Map a, final Map b, final f c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final long n, final a a, final mc mc) {
        Map map;
        if (a != null && a.b != null) {
            map = this.a;
        }
        else {
            map = this.b;
        }
        map.put(n, mc);
        this.c.a(map, n, mc);
    }
    
    @Override
    public boolean a(final a a) {
        final long a2 = a.a;
        return this.a.containsKey(a2) || this.b.containsKey(a2);
    }
}
