// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import android.text.TextUtils;
import com.twitter.library.service.f;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public abstract class ak extends i
{
    private int a;
    private int e;
    private long f;
    private long h;
    private int i;
    private String j;
    
    protected ak(final Context context, final String s, final Session session) {
        super(context, s, session);
        this.j = "";
    }
    
    protected ak(final Context context, final String s, final ab ab) {
        super(context, s, ab);
        this.j = "";
    }
    
    public final long H() {
        return this.h;
    }
    
    public final int I() {
        return this.i;
    }
    
    public final long J() {
        return this.f;
    }
    
    public final int K() {
        return this.a;
    }
    
    public final int L() {
        return this.e;
    }
    
    public final ak b(final long h) {
        this.h = h;
        return this;
    }
    
    public final ak b(final String j) {
        this.j = j;
        return this;
    }
    
    @Override
    protected final f b() {
        final f g = this.g();
        if (this.i > 0) {
            g.a("count", this.i);
        }
        if (this.h == 0L && this.f > 0L) {
            g.a("since_id", this.f);
        }
        if (this.h > 0L) {
            g.a("max_id", this.h);
        }
        if (!TextUtils.isEmpty((CharSequence)this.j)) {
            g.a("request_context", this.j);
        }
        return g.a("include_entities", true).b().a("include_media_features", true).a("include_cards", true).a("include_user_entities", true);
    }
    
    public final ak c(final int i) {
        this.i = i;
        return this;
    }
    
    public final ak c(final long f) {
        this.f = f;
        return this;
    }
    
    public final ak d(final int a) {
        this.a = a;
        return this;
    }
    
    public final ak e(final int e) {
        this.e = e;
        return this;
    }
    
    protected abstract f g();
}
