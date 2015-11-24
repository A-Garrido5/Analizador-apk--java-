// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Map;

public class ar
{
    private final boolean a;
    private Map.Entry b;
    private final Iterator c;
    final df d;
    
    private ar(final df d, final boolean a) {
        this.d = d;
        this.c = df.a(this.d).g();
        if (this.c.hasNext()) {
            this.b = (Map.Entry)this.c.next();
        }
        this.a = a;
    }
    
    ar(final df df, final boolean b, final d6 d6) {
        this(df, b);
    }
    
    public void a(final int n, final ep ep) {
        final boolean b = dt.b;
        while (this.b != null && this.b.getKey().c() < n) {
            final hg hg = this.b.getKey();
            Label_0146: {
                if (this.a && hg.d() == es.MESSAGE && !hg.b()) {
                    if (this.b instanceof f8) {
                        ep.d(hg.c(), ((f8)this.b).a().d());
                        if (!b) {
                            break Label_0146;
                        }
                    }
                    ep.d(hg.c(), this.b.getValue());
                    if (!b) {
                        break Label_0146;
                    }
                }
                bB.a(hg, this.b.getValue(), ep);
            }
            Label_0183: {
                if (this.c.hasNext()) {
                    this.b = (Map.Entry)this.c.next();
                    if (!b) {
                        break Label_0183;
                    }
                }
                this.b = null;
            }
            if (b) {
                break;
            }
        }
    }
}
