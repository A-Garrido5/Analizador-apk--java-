// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.geo.Coordinate;
import java.util.Collection;

public class bq
{
    boolean A;
    TwitterStatusCard B;
    Long C;
    Collection D;
    xb E;
    long a;
    TwitterUser b;
    TwitterUser c;
    String d;
    TweetEntities e;
    long f;
    String g;
    String h;
    long i;
    long j;
    boolean k;
    long l;
    bp m;
    boolean n;
    int o;
    int p;
    int q;
    String r;
    boolean s;
    boolean t;
    boolean u;
    PromotedContent v;
    Coordinate w;
    TwitterPlace x;
    bp y;
    long z;
    
    public bq() {
        this.a = -1L;
        this.i = -1L;
        this.j = -1L;
        this.l = -1L;
        this.q = -1;
    }
    
    public long a() {
        return this.a;
    }
    
    public bq a(final int o) {
        this.o = o;
        return this;
    }
    
    public bq a(final long a) {
        this.a = a;
        return this;
    }
    
    public bq a(final PromotedContent v) {
        this.v = v;
        return this;
    }
    
    public bq a(final TweetEntities e) {
        this.e = e;
        return this;
    }
    
    public bq a(final TwitterStatusCard b) {
        this.B = b;
        return this;
    }
    
    public bq a(final TwitterUser b) {
        this.b = b;
        return this;
    }
    
    public bq a(final bp m) {
        this.m = m;
        return this;
    }
    
    public bq a(final Coordinate w) {
        this.w = w;
        return this;
    }
    
    public bq a(final TwitterPlace x) {
        this.x = x;
        return this;
    }
    
    public bq a(final Long c) {
        this.C = c;
        return this;
    }
    
    public bq a(final String d) {
        this.d = d;
        return this;
    }
    
    public bq a(final Collection d) {
        this.D = d;
        return this;
    }
    
    public bq a(final xb e) {
        this.E = e;
        return this;
    }
    
    public bq a(final boolean k) {
        this.k = k;
        return this;
    }
    
    public TwitterUser b() {
        return this.c;
    }
    
    public bq b(final int p) {
        this.p = p;
        return this;
    }
    
    public bq b(final long f) {
        this.f = f;
        return this;
    }
    
    public bq b(final TwitterUser c) {
        this.c = c;
        return this;
    }
    
    public bq b(final bp y) {
        this.y = y;
        if (y != null) {
            this.A = true;
            this.f(y.a);
        }
        return this;
    }
    
    public bq b(final String g) {
        this.g = g;
        return this;
    }
    
    public bq b(final boolean n) {
        this.n = n;
        return this;
    }
    
    public PromotedContent c() {
        return this.v;
    }
    
    public bq c(final int q) {
        this.q = q;
        return this;
    }
    
    public bq c(final long i) {
        this.i = i;
        return this;
    }
    
    public bq c(final String h) {
        this.h = h;
        return this;
    }
    
    public bq c(final boolean s) {
        this.s = s;
        return this;
    }
    
    public TwitterStatusCard d() {
        return this.B;
    }
    
    public bq d(final long j) {
        this.j = j;
        return this;
    }
    
    public bq d(final String r) {
        this.r = r;
        return this;
    }
    
    public bq d(final boolean t) {
        this.t = t;
        return this;
    }
    
    public bq e(final long l) {
        this.l = l;
        return this;
    }
    
    public bq e(final boolean u) {
        this.u = u;
        return this;
    }
    
    public xb e() {
        return this.E;
    }
    
    public bp f() {
        if (this.l != -1L && this.b != null && this.m == null) {
            this.m = new bp(this);
            this.a = this.l;
            this.c = this.b;
        }
        return new bp(this);
    }
    
    public bq f(final long z) {
        this.z = z;
        if (z > 0L) {
            this.A = true;
        }
        return this;
    }
    
    public bq f(final boolean a) {
        this.A = a;
        return this;
    }
}
