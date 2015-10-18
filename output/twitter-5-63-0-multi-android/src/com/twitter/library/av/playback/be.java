// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.model.Partner;
import java.util.Map;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.model.factory.a;

public class be extends au
{
    @Override
    public String a() {
        return String.valueOf(this.b.D);
    }
    
    public void a(final a e) {
        this.e = e;
    }
    
    @Override
    public void a(final Tweet b) {
        this.b = b;
    }
    
    public void a(final String c) {
        this.c = c;
    }
    
    @Override
    public Tweet b() {
        return this.b;
    }
    
    public void b(final Tweet b) {
        this.b = b;
    }
    
    public void b(final TwitterScribeAssociation i) {
        this.i = i;
    }
    
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public Map d() {
        return this.d;
    }
    
    @Override
    public a e() {
        return this.e;
    }
    
    @Override
    public String f() {
        return this.f;
    }
    
    @Override
    public Partner g() {
        return this.g;
    }
    
    @Override
    public TwitterScribeAssociation h() {
        return this.i;
    }
}
