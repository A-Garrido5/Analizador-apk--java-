// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class j
{
    private Object a;
    private Set b;
    
    public static j a() {
        return new j();
    }
    
    public j a(final Iterable iterable) {
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next());
        }
        return this;
    }
    
    public j a(final Object a) {
        if (this.b != null) {
            this.b.add(a);
            return this;
        }
        if (this.a != null) {
            (this.b = new HashSet()).add(this.a);
            this.a = null;
            this.b.add(a);
            return this;
        }
        this.a = a;
        return this;
    }
    
    public j b() {
        this.a = null;
        this.b = null;
        return this;
    }
    
    public Set c() {
        Set<Object> set;
        if (this.b != null) {
            set = Collections.unmodifiableSet((Set<?>)this.b);
        }
        else if (this.a != null) {
            set = Collections.singleton(this.a);
        }
        else {
            set = Collections.emptySet();
        }
        this.b();
        return set;
    }
}
