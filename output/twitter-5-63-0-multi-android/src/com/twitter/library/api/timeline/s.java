// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import android.database.Cursor;
import com.twitter.library.provider.bg;
import java.util.Iterator;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.api.at;
import com.twitter.library.api.bp;
import com.twitter.library.api.bs;
import java.util.ArrayList;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import java.util.List;
import com.twitter.library.service.c;

public class s extends c
{
    private final List a;
    private final Tweet e;
    private final List f;
    
    public s(final Context context, final ab ab, final Tweet e, final List f) {
        super(context, s.class.getSimpleName(), ab);
        this.a = new ArrayList();
        this.e = e;
        this.f = f;
    }
    
    private void a(final bs bs) {
        if (bs != null && !bs.a.isEmpty()) {
            final ArrayList a = bs.a;
            final ArrayList<bp> list = new ArrayList<bp>();
            for (final at at : a) {
                if (at.e != null) {
                    list.add(at.e);
                }
            }
            if (!list.isEmpty()) {
                final bg v = this.V();
                final long c = this.P().c;
                v.a(list, c, 10, -1L, false, false, true, null, true, null, true);
                final ArrayList<Tweet> list2 = new ArrayList<Tweet>();
                final Iterator<bp> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    final Cursor query = this.p.getContentResolver().query(ae.a(iterator2.next().a, c), Tweet.b, (String)null, (String[])null, (String)null);
                    if (query != null) {
                        try {
                            if (!query.moveToFirst()) {
                                continue;
                            }
                            list2.add(new ad(query).a());
                            continue;
                        }
                        finally {
                            query.close();
                        }
                        break;
                    }
                }
                this.a.clear();
                this.a.addAll(list2);
            }
        }
    }
    
    @Override
    protected e a() {
        final f a = this.M().a("conversation", "suggestions", "show").a("id", this.e.Q).a("author_id", this.e.C).a("pc", true);
        if (this.f.size() > 0) {
            a.a("last_tweets", this.f);
        }
        if (this.e.j != null) {
            a.a("impression_id", this.e.j.impressionId);
        }
        return a.a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.k()) {
            this.a((bs)((com.twitter.library.api.bg)d).a());
        }
    }
    
    public final List b() {
        return this.a;
    }
    
    @Override
    protected d h() {
        return com.twitter.library.api.bg.a(44);
    }
}
