// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.errorreporter;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class b
{
    private final Throwable a;
    private final Map b;
    
    public b(final Throwable t) {
        this(t, Collections.emptyMap());
    }
    
    public b(final Throwable a, final Map map) {
        this.a = a;
        this.b = new HashMap(map);
    }
    
    public Map a() {
        return this.b;
    }
    
    public void a(final Map map) {
        this.b.putAll(map);
    }
    
    public Throwable b() {
        return this.a;
    }
    
    public boolean c() {
        return this.a != null;
    }
}
