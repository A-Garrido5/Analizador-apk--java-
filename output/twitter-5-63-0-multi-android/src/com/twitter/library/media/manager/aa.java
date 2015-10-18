// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.util.Iterator;
import com.twitter.internal.network.l;

class aa implements Runnable
{
    final /* synthetic */ t a;
    final /* synthetic */ ab b;
    final /* synthetic */ Object c;
    final /* synthetic */ l d;
    final /* synthetic */ v e;
    
    aa(final v e, final t a, final ab b, final Object c, final l d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        if (this.a != null) {
            for (final af af : this.b.a) {
                final aj a = af.a;
                final ResourceResponse a2 = this.a.a(a, this.c, af.c, this.d);
                af.b.set(a2);
                if (!af.b.isCancelled()) {
                    final al v = a.v();
                    if (v == null) {
                        continue;
                    }
                    v.a(a2);
                }
            }
        }
        this.b.b();
    }
}
