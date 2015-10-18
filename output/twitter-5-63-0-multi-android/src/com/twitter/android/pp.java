// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import android.util.Pair;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class pp extends z
{
    final /* synthetic */ pn a;
    private pq b;
    private long c;
    private long d;
    
    pp(final pn a, final long c, final long d, final pq b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof g) {
            final g g = (g)y;
            this.a.a(Long.valueOf(this.c), Pair.create((Object)this.d, (Object)g.t()));
            this.b.a(g.t());
        }
    }
}
