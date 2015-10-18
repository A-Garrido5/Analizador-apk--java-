// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.HashMap;

public class av
{
    private String a;
    private int b;
    private int c;
    private long d;
    private bp e;
    private Conversation f;
    private TwitterTopic g;
    private long h;
    private TimelineScribeContent i;
    private String j;
    private String k;
    private TwitterSocialProof l;
    private HashMap m;
    private Recap n;
    private h o;
    private WhoToFollow p;
    
    public av() {
        this.b = 1;
        this.c = 0;
        this.d = 0L;
        this.h = -1L;
        this.m = new HashMap();
    }
    
    private boolean f() {
        return this.a != null && (this.e != null || this.f != null || this.g != null || this.n != null || (this.o != null && this.o.a()) || this.p != null);
    }
    
    public av a(final int b) {
        this.b = b;
        return this;
    }
    
    public av a(final long h) {
        this.h = h;
        return this;
    }
    
    public av a(final Conversation f) {
        this.f = f;
        return this;
    }
    
    public av a(final Recap n) {
        this.n = n;
        return this;
    }
    
    public av a(final TimelineScribeContent i) {
        this.i = i;
        return this;
    }
    
    public av a(final TwitterSocialProof l) {
        this.l = l;
        return this;
    }
    
    public av a(final TwitterTopic g) {
        this.g = g;
        return this;
    }
    
    public av a(final WhoToFollow p) {
        this.p = p;
        return this;
    }
    
    public av a(final bp e) {
        this.e = e;
        return this;
    }
    
    public av a(final h o) {
        this.o = o;
        return this;
    }
    
    public av a(final String a) {
        this.a = a;
        return this;
    }
    
    public av a(final String s, final String s2) {
        this.m.put(s, s2);
        return this;
    }
    
    public bp a() {
        return this.e;
    }
    
    public av b(final int c) {
        this.c = c;
        return this;
    }
    
    public av b(final long d) {
        this.d = d;
        return this;
    }
    
    public av b(final String j) {
        this.j = j;
        return this;
    }
    
    public String b() {
        return this.j;
    }
    
    public av c(final String k) {
        this.k = k;
        return this;
    }
    
    public boolean c() {
        return this.c == 2;
    }
    
    public HashMap d() {
        return this.m;
    }
    
    public at e() {
        if (this.f()) {
            return new at(this, null);
        }
        return null;
    }
}
