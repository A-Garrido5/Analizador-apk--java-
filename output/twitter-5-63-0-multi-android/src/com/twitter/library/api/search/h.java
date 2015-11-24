// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.provider.bg;
import com.twitter.library.provider.b;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

public class h extends p
{
    private static final int[] h;
    public long a;
    public long[] e;
    public long[] f;
    public String g;
    
    static {
        h = new int[] { 1, 2, 3, 4, 5 };
    }
    
    public h(final Context context, final Session session) {
        super(context, h.class.getName(), session, com.twitter.library.api.search.h.h);
        this.a = 0L;
    }
    
    @Override
    protected void a() {
        switch (this.v()) {
            case 1: {
                if (this.a != 0L) {
                    final b u = this.u();
                    this.t().c(this.a, u);
                    u.a();
                    return;
                }
                break;
            }
            case 2: {
                this.t().b(this.e);
            }
            case 3: {
                final b u2 = this.u();
                this.t().c(this.g, u2);
                u2.a();
            }
            case 4: {
                final b u3 = this.u();
                final bg t = this.t();
                t.a(6, "TRENDSPLUS", false, u3);
                t.a(u3);
                u3.a();
            }
            case 5: {
                this.t().c(this.f);
            }
        }
    }
}
