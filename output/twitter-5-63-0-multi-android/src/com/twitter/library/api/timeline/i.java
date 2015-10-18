// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Set;
import java.util.List;
import com.twitter.library.service.c;

public class i extends c
{
    private final long a;
    private final long e;
    private final List f;
    private final Set g;
    
    public i(final Context context, final Session session, final long a, final long e, final List f, final Set g) {
        super(context, i.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("media", "media_tags", "delete").a("status_id", this.a).a("media_ids", TextUtils.join((CharSequence)",", (Iterable)this.f)).a("tagged_user_ids", TextUtils.join((CharSequence)",", (Iterable)this.g)).a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.j()) {
            final b w = this.W();
            this.V().a(this.a, this.e, this.f, this.g, w);
            w.a();
        }
    }
    
    public long b() {
        return this.a;
    }
    
    @Override
    protected d h() {
        return null;
    }
}
