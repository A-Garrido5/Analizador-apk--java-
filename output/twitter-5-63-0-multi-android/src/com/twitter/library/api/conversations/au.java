// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.b;
import java.util.UUID;
import com.twitter.library.service.f;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.n;
import java.util.concurrent.TimeUnit;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class au extends d
{
    private static final Map a;
    private static final Collection e;
    private static final Collection f;
    private final String g;
    private boolean h;
    private long i;
    
    static {
        a = new HashMap();
        e = Collections.singleton(HttpOperation$RequestMethod.b);
        f = Arrays.asList(401, 503, 0);
    }
    
    public au(final Context context, final Session session) {
        this(context, session, null, true);
    }
    
    public au(final Context context, final Session session, final String s, final boolean b) {
        this(context, new ab(session), s, b);
    }
    
    public au(final Context context, final ab ab, final String g, final boolean h) {
        super(context, au.class.getName(), ab);
        this.g = g;
        this.a(new n(6, 2L, 120L, TimeUnit.SECONDS, au.e, au.f));
        this.h = h;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        synchronized (au.a) {
            au.a.remove(this.g);
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "dm", "conversation" }).a("send_error_codes", true);
        if (this.g != null) {
            a.b(new Object[] { this.g });
        }
        a.a(new Object[] { "mark_read" }).a("last_read_event_id", this.i).a("request_id", UUID.randomUUID().toString());
        return a;
    }
    
    @Override
    protected boolean c(final aa aa) {
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        this.i = v.d(this.g);
        if (this.h) {
            this.h = false;
            if (this.g != null && !v.f(this.g)) {
                aa.a(true);
                return false;
            }
            v.a(this.g, this.i, w);
            w.a();
        }
        synchronized (au.a) {
            final Long n = au.a.get(this.g);
            if (n != null && n >= this.i) {
                aa.a(true);
                return false;
            }
            au.a.put(this.g, this.i);
            return true;
        }
    }
    
    protected bg e() {
        return null;
    }
}
