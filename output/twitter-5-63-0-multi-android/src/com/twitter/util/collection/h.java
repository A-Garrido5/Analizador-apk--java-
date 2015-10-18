// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class h
{
    private Object a;
    private Object b;
    private Map c;
    
    public static h a() {
        return new h();
    }
    
    public h a(final Object a, final Object b) {
        if (this.c != null) {
            this.c.put(a, b);
            return this;
        }
        if (this.a != null) {
            (this.c = new HashMap()).put(this.a, this.b);
            this.a = null;
            this.b = null;
            this.c.put(a, b);
            return this;
        }
        this.a = a;
        this.b = b;
        return this;
    }
    
    public h b() {
        this.a = null;
        this.b = null;
        this.c = null;
        return this;
    }
    
    public Map c() {
        Map<Object, Object> map;
        if (this.c != null) {
            map = Collections.unmodifiableMap((Map<?, ?>)this.c);
        }
        else if (this.a != null) {
            map = Collections.singletonMap(this.a, this.b);
        }
        else {
            map = Collections.emptyMap();
        }
        this.b();
        return map;
    }
}
