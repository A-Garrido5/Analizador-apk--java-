// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.service.f;
import android.os.Bundle;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class ae extends c
{
    public ae(final Context context, final Session session) {
        this(context, ae.class.getName(), session);
    }
    
    public ae(final Context context, final String s, final Session session) {
        super(context, s, session);
    }
    
    @Override
    protected final e a() {
        final Bundle o = this.o;
        final f b = this.M().a((String)null).a(HttpOperation$RequestMethod.b).b(new Object[] { "i", "anonymize" });
        if (o.containsKey("data")) {
            b.a("data", o.getString("data"));
        }
        this.a(b);
        return b.a();
    }
    
    protected void a(final f f) {
    }
    
    @Override
    protected d h() {
        return null;
    }
}
