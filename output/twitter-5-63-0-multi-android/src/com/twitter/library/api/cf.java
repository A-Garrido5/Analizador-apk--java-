// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.json.timeline.wtf.JsonStrings;
import java.util.Map;
import com.twitter.model.common.a;

public class cf extends a
{
    int a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    EntityScribeContent h;
    Map i;
    Map j;
    
    public cf a(final int a) {
        this.a = a;
        return this;
    }
    
    public cf a(final EntityScribeContent h) {
        this.h = h;
        return this;
    }
    
    cf a(final JsonStrings jsonStrings) {
        if (jsonStrings != null) {
            this.b = jsonStrings.a;
            this.c = jsonStrings.b;
            this.d = jsonStrings.c;
            this.e = jsonStrings.d;
            this.f = jsonStrings.e;
            this.g = jsonStrings.f;
        }
        return this;
    }
    
    public cf a(final String b) {
        this.b = b;
        return this;
    }
    
    public cf a(final Map i) {
        this.i = i;
        return this;
    }
    
    public cf b(final String d) {
        this.d = d;
        return this;
    }
    
    public cf b(final Map j) {
        this.j = j;
        return this;
    }
    
    protected WhoToFollow$Metadata c() {
        return new WhoToFollow$Metadata(this, null);
    }
    
    public cf c(final String e) {
        this.e = e;
        return this;
    }
    
    public cf d(final String c) {
        this.c = c;
        return this;
    }
    
    public cf e(final String f) {
        this.f = f;
        return this;
    }
    
    public cf f(final String g) {
        this.g = g;
        return this;
    }
}
