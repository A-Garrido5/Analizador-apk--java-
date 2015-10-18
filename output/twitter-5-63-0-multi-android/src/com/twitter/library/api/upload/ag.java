// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.service.aa;
import com.twitter.library.service.ab;
import java.util.UUID;
import com.twitter.library.client.Session;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import com.twitter.internal.android.service.d;
import com.twitter.library.service.y;

public abstract class ag extends y
{
    protected static final boolean j;
    private final String a;
    private com.twitter.library.api.upload.y e;
    protected final d k;
    protected ah l;
    protected q m;
    
    static {
        j = (App.l() && Log.isLoggable("UploadRequest", 3));
    }
    
    protected ag(final Context context, final String s, final Session session) {
        super(context, s, session);
        String a;
        if (this.b != null) {
            a = this.b;
        }
        else {
            a = UUID.randomUUID().toString();
        }
        this.a = a;
        this.k = new d();
    }
    
    protected ag(final Context context, final String s, final ab ab) {
        this(null, context, s, ab);
    }
    
    protected ag(String string, final Context context, final String s, final ab ab) {
        super(context, s, ab);
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        this.a = string;
        this.k = new d();
    }
    
    protected aa a(final ag ag) {
        final aa s = ag.a(this.o).S();
        this.a(ag.o);
        return s;
    }
    
    protected abstract void a(final aa p0);
    
    @Override
    protected final void a_(final aa aa) {
        if (this.e != null) {
            this.e.a(this);
        }
        this.a(aa);
        if (this.e != null) {
            if (this.m != null) {
                this.e.a(this, aa, this.m);
            }
            this.e.a(this, aa);
        }
    }
    
    public String an_() {
        return this.a;
    }
    
    public int ay_() {
        return 1;
    }
    
    public ag b(final com.twitter.library.api.upload.y e) {
        this.e = e;
        return this;
    }
    
    public void c(final int n) {
        ny.a().a(this.an_(), this.ay_(), n);
    }
    
    @Override
    public d m() {
        return this.k;
    }
    
    protected void u() {
        this.k.a("uploadDuration");
    }
    
    protected void v() {
        this.k.b("uploadDuration");
    }
}
