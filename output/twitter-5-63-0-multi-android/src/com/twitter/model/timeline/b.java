// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.timeline;

import com.twitter.model.common.a;

public class b extends a
{
    String a;
    String b;
    String c;
    String d;
    String e;
    
    public b a(final String a) {
        this.a = a;
        return this;
    }
    
    public b b(final String b) {
        this.b = b;
        return this;
    }
    
    protected SuggestsInfo c() {
        return new SuggestsInfo(this, null);
    }
    
    public b c(final String d) {
        this.d = d;
        return this;
    }
    
    public b d(final String c) {
        this.c = c;
        return this;
    }
    
    public b e(final String e) {
        this.e = e;
        return this;
    }
}
