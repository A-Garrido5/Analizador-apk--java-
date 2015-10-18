// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import android.util.Pair;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.util.bb;
import com.twitter.library.client.as;
import com.twitter.util.q;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.provider.bg;
import android.support.v4.util.LruCache;
import com.twitter.library.client.ay;
import com.twitter.library.util.ak;

public final class pn implements ak
{
    private static pn a;
    private ay b;
    private LruCache c;
    private bg d;
    private Context e;
    private az f;
    private c g;
    
    private pn(final Context context, final int n) {
        this.g = com.twitter.android.client.c.a(context);
        this.e = context.getApplicationContext();
        this.c = new po(this, n);
        this.b = new pr(this, null);
        this.f = az.a(context);
        this.d = bg.a(context, this.f.b().g());
        this.f.a(this.b);
    }
    
    public static pn a(final Context context) {
        synchronized (pn.class) {
            if (pn.a == null) {
                pn.a = new pn(context, 300);
            }
            return pn.a;
        }
    }
    
    public long a(final long n, final Session session, final pq pq) {
        final Pair b = this.b(Long.valueOf(n));
        if (b == null) {
            final long nextLong = q.a.nextLong();
            as.a(this.e).a(bb.a(n, this.e, this.g, session, nextLong, null, 0), new pp(this, n, nextLong, pq));
            return nextLong;
        }
        final long longValue = (long)b.first;
        pq.a((int)b.second);
        return longValue;
    }
    
    public Pair a(final Long n) {
        return (Pair)this.c.remove(n);
    }
    
    public Pair a(final Long n, final Pair pair) {
        this.d.i((long)pair.first);
        return (Pair)this.c.put(n, pair);
    }
    
    @Override
    public void a() {
        this.c.evictAll();
    }
    
    public Pair b(final Long n) {
        return (Pair)this.c.get(n);
    }
    
    @Override
    public Collection b() {
        return this.c.snapshot().values();
    }
}
