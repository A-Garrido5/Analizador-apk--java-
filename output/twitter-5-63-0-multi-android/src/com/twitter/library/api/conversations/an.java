// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.UUID;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class an extends d
{
    private static final String a;
    private final String e;
    private final boolean f;
    private final boolean g;
    
    static {
        a = an.class.getName();
    }
    
    public an(final Context context, final Session session, final String s, final boolean b) {
        this(context, session, s, false, b);
    }
    
    public an(final Context context, final Session session, final String e, final boolean f, final boolean g) {
        super(context, an.a, session);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public an(final Context context, final ab ab, final String e, final boolean f, final boolean g) {
        super(context, an.a, ab);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        if (httpOperation.l().a == 404 || httpOperation.l().a == 401) {
            aa.a(true);
        }
        if (aa.a()) {
            v.d(this.e, w);
        }
        else {
            v.b(this.e, false, w);
        }
        w.a();
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a("dm", "conversation", this.e, "delete").a("last_event_id", this.V().a(this.e, true)).a("request_id", UUID.randomUUID().toString());
        if (this.g) {
            a.a("read_only", true);
        }
        return a;
    }
    
    @Override
    protected boolean c(final aa aa) {
        boolean b = true;
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        if (s.a(this.e) || this.f) {
            v.d(this.e, w);
            aa.a(b);
            b = false;
        }
        else {
            v.b(this.e, b, w);
        }
        w.a();
        return b;
    }
    
    protected bg e() {
        return null;
    }
}
