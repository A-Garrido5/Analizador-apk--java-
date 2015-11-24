// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.service.f;
import java.util.Iterator;
import java.util.List;
import com.twitter.library.provider.b;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Collection;

public class af extends d
{
    public ag a;
    private final Collection e;
    private final Collection f;
    private final long g;
    
    public af(final Context context, final Session session, final Collection collection) {
        this(context, session, null, collection);
    }
    
    public af(final Context context, final Session session, final Collection e, final Collection f) {
        super(context, af.class.getName(), session);
        this.e = e;
        this.f = f;
        this.g = session.g();
    }
    
    public af(final Context context, final Session session, final long[] array) {
        this(context, session, CollectionUtils.a(array), null);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            this.a = (ag)bg.a();
            final b w = this.W();
            final List c = this.a.c;
            this.V().a(c, -1L, -1, -1L, null, null, true, w);
            if (!CollectionUtils.a((Collection)c)) {
                for (final TwitterUser twitterUser : c) {
                    ad ad = this.a.a.get(twitterUser.userId);
                    if (ad == null) {
                        ad = this.a.b.get(twitterUser.username.toLowerCase());
                    }
                    if (ad != null) {
                        this.V().d(ak.a(this.g, twitterUser.userId), !ad.a, w);
                    }
                }
            }
            w.a();
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "dm", "permissions" }).a("dm_users", true);
        if (!CollectionUtils.a(this.e)) {
            a.a("recipient_ids", CollectionUtils.c(this.e));
        }
        if (!CollectionUtils.a(this.f)) {
            a.a("recipient_screen_names", this.f.toArray(new String[this.f.size()]));
        }
        return a;
    }
    
    protected bg e() {
        return bg.a(76);
    }
}
