// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.internal.network.DataUsageEvent$Type;
import com.twitter.internal.network.DataUsageEvent;
import java.util.Arrays;
import java.util.List;
import com.twitter.util.n;

public class b implements n
{
    static final List a;
    static final List b;
    final ic c;
    final ic d;
    final ic e;
    final ic f;
    final ic g;
    final ic h;
    
    static {
        a = Arrays.asList("api:wifi:::rxbytes", "api:wifi:::txbytes", "api:mobile:::rxbytes", "api:mobile:::txbytes", "api:wifi:video::rxbytes", "api:mobile:video::rxbytes");
        b = Arrays.asList("api:wifi:::rxbytes", "api:wifi:::txbytes", "api:mobile:::rxbytes", "api:mobile:::txbytes");
    }
    
    public b(final ir ir, final long n) {
        this.c = ic.a("api:wifi:::txbytes", ir, n, ih.n, 3);
        this.d = ic.a("api:wifi:::rxbytes", ir, n, ih.n, 3);
        this.e = ic.a("api:mobile:::txbytes", ir, n, ih.n, 3);
        this.f = ic.a("api:mobile:::rxbytes", ir, n, ih.n, 3);
        this.g = ic.a("api:wifi:video::rxbytes", ir, n, ih.n, 3);
        this.h = ic.a("api:mobile:video::rxbytes", ir, n, ih.n, 3);
    }
    
    public void a() {
        this.c.i();
        this.d.i();
        this.e.i();
        this.f.i();
        this.g.i();
        this.h.i();
    }
    
    public void a(final DataUsageEvent dataUsageEvent) {
        final long c = dataUsageEvent.c;
        final long d = dataUsageEvent.d;
        if (c > 0L) {
            if (dataUsageEvent.b) {
                this.d.a(c);
            }
            else {
                this.f.a(c);
            }
            if (dataUsageEvent.a == DataUsageEvent$Type.d && dataUsageEvent.b) {
                this.g.a(c);
            }
            else if (dataUsageEvent.a == DataUsageEvent$Type.d && !dataUsageEvent.b) {
                this.h.a(c);
            }
        }
        if (d > 0L) {
            if (!dataUsageEvent.b) {
                this.e.a(d);
                return;
            }
            this.c.a(d);
        }
    }
}
