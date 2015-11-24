// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import android.content.Context;
import com.twitter.library.api.bg;
import java.util.List;
import com.twitter.library.network.OAuthToken;

public class o implements q
{
    private OAuthToken a;
    private List b;
    private byte[] c;
    private String d;
    private bg e;
    private boolean f;
    private int g;
    
    @Override
    public q a(final Context context) {
        final HttpOperation c = new g(context, this.d).a(HttpOperation$RequestMethod.b).a(new t(this.a)).a("Scribing is never triggered by a user action.").a(this.e).a(this.b).a().c();
        this.f = c.j();
        this.g = c.l().a;
        return this;
    }
    
    @Override
    public q a(final OAuthToken a) {
        this.a = a;
        return this;
    }
    
    @Override
    public q a(final String d) {
        this.d = d;
        return this;
    }
    
    @Override
    public q a(final List b) {
        this.b = b;
        return this;
    }
    
    @Override
    public q a(final byte[] c) {
        this.c = c;
        return this;
    }
    
    @Override
    public boolean a() {
        return this.f;
    }
    
    @Override
    public int b() {
        return this.g;
    }
    
    @Override
    public q b(final Context context) {
        final g a = new g(context, this.d).a(HttpOperation$RequestMethod.b).a(new t(this.a)).a("Scribing is never triggered by a user action.").a(this.e);
        a.a((HttpEntity)new ByteArrayEntity(this.c));
        final HttpOperation c = a.a().c();
        this.f = c.j();
        this.g = c.l().a;
        return this;
    }
}
