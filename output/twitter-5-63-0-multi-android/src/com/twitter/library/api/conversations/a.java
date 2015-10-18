// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.UUID;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import java.util.Iterator;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.util.k;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Set;

public class a extends d
{
    public b a;
    private final String e;
    private final Set f;
    private int[] g;
    
    public a(final Context context, final Session session, final String e, final Set set) {
        super(context, a.class.getName(), session);
        this.g = new int[0];
        this.e = e;
        this.f = com.twitter.util.k.a(set);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.b w = this.W();
        if (httpOperation.k()) {
            this.a = (b)bg.a();
            this.V().a(this.a, true, w);
            final List a = this.a.a;
            if (!a.isEmpty()) {
                final ArrayList<Long> list = new ArrayList<Long>();
                final Iterator<com.twitter.library.api.conversations.k> iterator = a.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().a);
                }
                this.V().a(this.e, CollectionUtils.c(list), w);
            }
            w.a();
            new ai(this.p, this.P()).S();
            return;
        }
        this.g = ae.a((List)bg.a());
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a("dm", "conversation", this.e, "add_participants").a("participant_ids", TextUtils.join((CharSequence)",", (Iterable)this.f)).a("request_id", UUID.randomUUID().toString()).a("dm_users", true);
    }
    
    protected bg e() {
        return bg.a(79);
    }
    
    public int[] f() {
        return this.g;
    }
}
