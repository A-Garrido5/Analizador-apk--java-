// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class h extends c
{
    private final String a;
    private final String e;
    private final String f;
    private String g;
    private boolean h;
    
    public h(final Context context, final Session session, final String a, final String e, final String f) {
        super(context, h.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(HttpOperation$RequestMethod.b).b("beta", "timelines", "custom");
        if (this.h) {
            b.a(new Object[] { "update" });
        }
        else {
            b.a(new Object[] { "create" });
        }
        b.a("name", this.a);
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            b.a("description", this.e);
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            b.a("url", this.f);
        }
        if (this.h) {
            b.a("id", this.g);
        }
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final TwitterTopic twitterTopic = (TwitterTopic)bg.a();
            final ArrayList<TwitterTopic> list = new ArrayList<TwitterTopic>(1);
            list.add(twitterTopic);
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            v.a(list, w);
            v.a(list, this.P().c, 0, false, w);
            w.a();
        }
    }
    
    public void a(final String g) {
        this.g = g;
        this.h = !TextUtils.isEmpty((CharSequence)this.g);
    }
    
    protected bg b() {
        return bg.a(66);
    }
}
