// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class g
{
    private Object a;
    private List b;
    
    public static g a() {
        return new g();
    }
    
    public g a(final int n) {
        if (!this.b()) {
            throw new IllegalStateException("The capacity can only be set in an empty list.");
        }
        if (n > 1) {
            this.b = new ArrayList(n);
        }
        return this;
    }
    
    public g a(final Iterable iterable) {
        if (iterable != null) {
            final Iterator<Object> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next());
            }
        }
        return this;
    }
    
    public g a(final Object a) {
        if (this.b != null) {
            this.b.add(a);
            return this;
        }
        if (this.a != null) {
            (this.b = new ArrayList()).add(this.a);
            this.a = null;
            this.b.add(a);
            return this;
        }
        this.a = a;
        return this;
    }
    
    public boolean b() {
        return this.a == null && CollectionUtils.a((Collection)this.b);
    }
    
    public g c() {
        this.a = null;
        this.b = null;
        return this;
    }
    
    public List d() {
        List<Object> list;
        if (this.b != null) {
            list = Collections.unmodifiableList((List<?>)this.b);
        }
        else if (this.a != null) {
            list = Collections.singletonList(this.a);
        }
        else {
            list = Collections.emptyList();
        }
        this.c();
        return list;
    }
}
