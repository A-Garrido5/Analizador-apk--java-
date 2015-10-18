// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.util.l;
import com.twitter.library.util.bk;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.util.aj;
import com.twitter.util.k;
import java.util.List;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.geo.Coordinate;
import java.util.HashMap;

public class bp implements ab
{
    public boolean A;
    public int B;
    public bp C;
    public long D;
    public boolean E;
    public xb F;
    public long G;
    public String H;
    public HashMap I;
    public final long a;
    public final String b;
    public final TweetEntities c;
    public final String d;
    public final boolean e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final long k;
    public final bp l;
    public final int m;
    public final int n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final PromotedContent s;
    public final Coordinate t;
    public final TwitterPlace u;
    public final TwitterStatusCard v;
    public final Long w;
    public final List x;
    public TwitterUser y;
    public boolean z;
    
    bp(final bq bq) {
        this.a = bq.a;
        this.y = bq.c;
        this.b = (String)com.twitter.util.k.a(bq.d, "");
        this.c = (TweetEntities)com.twitter.util.k.a(bq.e, TweetEntities.a);
        this.d = TweetEntities.a(new StringBuilder(this.b), this.c).toString();
        this.e = aj.a(this.b, this.c);
        this.f = bq.f;
        this.g = bq.g;
        this.h = bq.h;
        this.i = bq.i;
        this.j = bq.j;
        this.z = bq.k;
        this.k = bq.l;
        this.l = bq.m;
        this.A = bq.n;
        this.m = bq.o;
        this.B = bq.p;
        this.n = bq.q;
        this.o = (String)com.twitter.util.k.a(bq.r, "und");
        this.p = bq.s;
        this.q = bq.t;
        this.r = bq.u;
        this.s = bq.v;
        this.t = bq.w;
        this.u = bq.x;
        this.C = bq.y;
        this.D = bq.z;
        this.E = bq.A;
        TwitterStatusCard v;
        if (bq.B == null && this.l != null) {
            v = this.l.v;
        }
        else {
            v = bq.B;
        }
        this.v = v;
        this.w = bq.C;
        if (bq.D != null) {
            this.x = Collections.unmodifiableList((List<?>)new ArrayList<Object>(bq.D));
        }
        else {
            this.x = Collections.emptyList();
        }
        this.F = bq.E;
        if (this.d() || (this.s != null && !this.s.b())) {
            this.G = bk.a();
            return;
        }
        this.G = this.f;
    }
    
    @Override
    public long a() {
        if (this.l != null) {
            return this.l.a;
        }
        return this.a;
    }
    
    public boolean a(final bp bp) {
        return this == bp || (bp != null && this.a == bp.a);
    }
    
    @Override
    public String b() {
        return String.valueOf(this.a());
    }
    
    public bp c() {
        if (this.l != null) {
            this = this.l;
        }
        return this;
    }
    
    public boolean d() {
        return this.F != null && "popular".equals(this.F.e);
    }
    
    public boolean e() {
        return this.F != null && "news".equals(this.F.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof bp && this.a((bp)o));
    }
    
    public boolean f() {
        return this.s != null;
    }
    
    @Override
    public int hashCode() {
        return com.twitter.util.l.a(this.a);
    }
}
