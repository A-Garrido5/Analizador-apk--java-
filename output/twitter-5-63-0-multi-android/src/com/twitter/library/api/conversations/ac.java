// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.i;
import com.twitter.library.api.bh;
import com.twitter.library.api.TweetEntities;

public class ac
{
    private long a;
    private long b;
    private String c;
    private long d;
    private long e;
    private boolean f;
    private boolean g;
    private String h;
    private TweetEntities i;
    private BaseDMAttachment j;
    private String k;
    private boolean l;
    private boolean m;
    private int n;
    
    public ac() {
        this.a = -1L;
        this.b = -1L;
        this.d = -1L;
        this.e = -1L;
    }
    
    public DMMessageEntry a() {
        final boolean b = this.b();
        final DMMessageEntry dmMessageEntry = new DMMessageEntry(this.a, this.b, this.c, this.k, this.d, this.e, bh.a(this.h, this.i, null), this.i, this.j, this.l, this.f, this.g, this.n);
        if (b) {
            ak.a(dmMessageEntry);
        }
        return dmMessageEntry;
    }
    
    public ac a(final long a) {
        this.a = a;
        return this;
    }
    
    public ac a(final TweetEntities i) {
        this.i = i;
        return this;
    }
    
    public ac a(final BaseDMAttachment j) {
        this.j = j;
        return this;
    }
    
    public ac a(final String c) {
        this.c = c;
        return this;
    }
    
    public ac a(final boolean f) {
        this.f = f;
        return this;
    }
    
    public ac b(final long b) {
        this.b = b;
        return this;
    }
    
    public ac b(final String h) {
        this.h = h;
        return this;
    }
    
    public ac b(final boolean g) {
        this.g = g;
        return this;
    }
    
    public boolean b() {
        String h;
        if (this.h == null) {
            h = "";
        }
        else {
            h = this.h;
        }
        this.h = h;
        int n;
        if (this.m) {
            n = 19;
        }
        else {
            n = 0;
        }
        this.n = n;
        if (this.j != null) {
            if ("unknown".equals(this.j.a())) {
                if (this.j.b()) {
                    this.j = null;
                }
                else if (this.j.c()) {
                    return true;
                }
            }
            else if (this.h != null && this.j.b()) {
                final i a = ak.a(new i(this.h, this.i), this.j);
                this.h = a.a;
                this.i = a.b;
                return false;
            }
        }
        return false;
    }
    
    public ac c(final long d) {
        this.d = d;
        return this;
    }
    
    public ac c(final String k) {
        this.k = k;
        return this;
    }
    
    public ac c(final boolean l) {
        this.l = l;
        return this;
    }
    
    public ac d(final long e) {
        this.e = e;
        return this;
    }
    
    public ac d(final boolean m) {
        this.m = m;
        return this;
    }
}
