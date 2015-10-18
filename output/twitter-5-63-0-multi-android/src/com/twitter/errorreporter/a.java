// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.errorreporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
{
    private final Map a;
    private final List b;
    
    public a() {
        this.a = new HashMap(32);
        this.b = new ArrayList(4);
    }
    
    public a(final long n) {
        this.a = new HashMap(32);
        this.b = new ArrayList(4);
        this.a("ErrorLog.user id", n);
    }
    
    public a(final Throwable t) {
        this.a = new HashMap(32);
        (this.b = new ArrayList(4)).add(new b(t));
    }
    
    public final a a(final Object o, final Object o2) {
        this.a.put(o, o2);
        return this;
    }
    
    public final a a(final Throwable t) {
        this.b.add(new b(t, this.a));
        return this;
    }
    
    public final List a() {
        return this.b;
    }
}
