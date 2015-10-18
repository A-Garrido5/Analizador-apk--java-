// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.api.TwitterUser;
import com.twitter.internal.util.Optional;
import com.twitter.library.media.model.MediaFile;

public class ap
{
    public final MediaFile a;
    public final MediaFile b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Optional h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public int l;
    
    public ap(final MediaFile a, final MediaFile b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = Optional.a();
        this.i = false;
        this.l = -1;
        this.j = false;
        this.k = false;
    }
    
    public ap(final MediaFile a, final MediaFile b, final boolean c, final String d, final String e, final String f, final String g, final Optional h, final boolean j, final boolean k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = true;
        this.l = -1;
        this.j = j;
        this.k = k;
    }
    
    public TwitterUser a(final TwitterUser twitterUser) {
        twitterUser.a(this.d);
        twitterUser.f(this.g);
        twitterUser.a(this.h);
        if (this.a != null) {
            twitterUser.b(this.a.b().toString());
        }
        if (this.c) {
            twitterUser.g(null);
        }
        else if (this.b != null) {
            twitterUser.g(this.b.b().toString());
        }
        if (this.j) {
            twitterUser.c(this.e);
        }
        if (this.k) {
            twitterUser.d(this.f);
        }
        return twitterUser;
    }
}
