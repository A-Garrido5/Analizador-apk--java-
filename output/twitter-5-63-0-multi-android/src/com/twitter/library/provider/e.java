// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.geo.GeoTag;
import java.util.List;
import com.twitter.model.common.a;

public class e extends a
{
    long a;
    String b;
    List c;
    long d;
    GeoTag e;
    long f;
    List g;
    PromotedContent h;
    QuotedTweetData i;
    String j;
    
    public e a(final long a) {
        this.a = a;
        return this;
    }
    
    public e a(final PromotedContent h) {
        this.h = h;
        return this;
    }
    
    public e a(final QuotedTweetData i) {
        this.i = i;
        return this;
    }
    
    public e a(final GeoTag e) {
        this.e = e;
        return this;
    }
    
    public e a(final String b) {
        this.b = b;
        return this;
    }
    
    public e a(final List c) {
        this.c = c;
        return this;
    }
    
    public e a(final List g, final long f) {
        this.g = g;
        this.f = f;
        return this;
    }
    
    public e b(final long d) {
        this.d = d;
        return this;
    }
    
    public e b(final String j) {
        this.j = j;
        return this;
    }
    
    protected DraftTweet c() {
        return new DraftTweet(this);
    }
}
