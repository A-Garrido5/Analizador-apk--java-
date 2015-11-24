// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.Collections;
import com.twitter.library.provider.ad;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.card.Card;
import com.twitter.library.av.model.Partner;
import com.twitter.library.av.model.factory.a;
import java.util.Map;
import com.twitter.library.provider.Tweet;

public class au
{
    public static final au a;
    Tweet b;
    String c;
    Map d;
    a e;
    String f;
    Partner g;
    Card h;
    TwitterScribeAssociation i;
    
    static {
        a = new au(new ad().a(), null, null, null, Collections.EMPTY_MAP, Partner.a, null, null);
    }
    
    public au() {
        this.d = Collections.emptyMap();
    }
    
    public au(final Tweet b, final String f, final String c, final a e, final Map d, final Partner g, final TwitterScribeAssociation i, final Card h) {
        this.d = Collections.emptyMap();
        this.b = b;
        this.f = f;
        this.c = c;
        this.e = e;
        this.d = d;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public String a() {
        return String.valueOf(this.b.D);
    }
    
    public void a(final Tweet b) {
        this.b = b;
    }
    
    public void a(final TwitterScribeAssociation i) {
        if (i != null) {
            this.i = i;
        }
    }
    
    public Tweet b() {
        return this.b;
    }
    
    public String c() {
        return this.c;
    }
    
    public Map d() {
        return this.d;
    }
    
    public a e() {
        return this.e;
    }
    
    public String f() {
        return this.f;
    }
    
    public Partner g() {
        return this.g;
    }
    
    public TwitterScribeAssociation h() {
        return this.i;
    }
}
