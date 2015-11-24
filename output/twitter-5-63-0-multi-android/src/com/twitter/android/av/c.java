// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.playback.PlaybackMode;
import java.util.Map;
import com.twitter.library.av.model.a;
import com.twitter.library.av.model.b;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.content.Context;

public class c
{
    public Context a;
    public Tweet b;
    public TwitterScribeAssociation c;
    public String d;
    public int e;
    public b f;
    public a g;
    public Map h;
    public int i;
    public boolean j;
    public String k;
    public Boolean l;
    public String m;
    public Long n;
    public PlaybackMode o;
    public Integer p;
    public Long q;
    
    public com.twitter.android.av.a a() {
        return new com.twitter.android.av.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
    }
    
    public c a(final int e) {
        this.e = e;
        return this;
    }
    
    public c a(final Context a) {
        this.a = a;
        return this;
    }
    
    public c a(final a g) {
        this.g = g;
        return this;
    }
    
    public c a(final b f) {
        this.f = f;
        return this;
    }
    
    public c a(final PlaybackMode o) {
        this.o = o;
        return this;
    }
    
    public c a(final Tweet b) {
        this.b = b;
        return this;
    }
    
    public c a(final TwitterScribeAssociation c) {
        this.c = c;
        return this;
    }
    
    public c a(final Boolean l) {
        this.l = l;
        return this;
    }
    
    public c a(final Integer p) {
        this.p = p;
        return this;
    }
    
    public c a(final Long n) {
        this.n = n;
        return this;
    }
    
    public c a(final String d) {
        this.d = d;
        return this;
    }
    
    public c a(final Map h) {
        this.h = h;
        return this;
    }
    
    public c a(final boolean j) {
        this.j = j;
        return this;
    }
    
    public c b(final int i) {
        this.i = i;
        return this;
    }
    
    public c b(final Long q) {
        this.q = q;
        return this;
    }
    
    public c b(final String k) {
        this.k = k;
        return this;
    }
    
    public c c(final String m) {
        this.m = m;
        return this;
    }
}
