// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import com.twitter.library.provider.k;
import com.twitter.library.provider.ax;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collection;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

public class z extends p
{
    private final int a;
    private final long[] e;
    
    public z(final Context context, final Session session, final int a, final Collection collection) {
        super(context, z.class.getName(), session);
        this.a = a;
        this.e = CollectionUtils.c(collection);
    }
    
    @Override
    protected void a() {
        final ab h = this.h();
        final String e = h.e;
        final int a = this.a;
        final bg t = this.t();
        final b u = this.u();
        final long[] e2 = this.e;
        if (e2 != null) {
            t.a(h.c, a, -1L, e2, u);
            if (ax.a(a)) {
                t.b(a, e2, u);
            }
        }
        else {
            switch (a) {
                case 0: {
                    com.twitter.library.provider.k.a(this.i).a(e, "tweet", 0, u);
                    break;
                }
                case 5: {
                    t.b(0, null, u);
                    final k a2 = com.twitter.library.provider.k.a(this.i);
                    a2.a(e, "mention", 0, u);
                    a2.a(e, "unread_interactions", 0, u);
                    break;
                }
            }
        }
        u.a();
    }
}
