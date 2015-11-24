// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Iterator;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.twitter.model.common.a;

public abstract class v extends a
{
    private EntityList a;
    private List b;
    
    public v() {
        this.a = this.a((List)null);
    }
    
    public v(final int n) {
        this.a = this.a((List)null);
        List b = null;
        if (n > 0) {
            b = new ArrayList(n);
        }
        this.b = b;
    }
    
    public v(final EntityList a) {
        this.a = a;
    }
    
    private List e() {
        if (this.b == null) {
            this.b = new ArrayList(this.a.d());
            this.a = this.a((List)null);
        }
        return this.b;
    }
    
    protected abstract EntityList a(final List p0);
    
    public v a(final Entity entity) {
        CollectionUtils.b(this.e(), entity, Entity.a);
        return this;
    }
    
    public v a(EntityList a) {
        if (a == null) {
            a = this.a((List)null);
        }
        this.a = a;
        this.b = null;
        return this;
    }
    
    public v a(final Iterable iterable) {
        final Iterator<Entity> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next());
        }
        return this;
    }
    
    public boolean a() {
        return this.a.c() && CollectionUtils.a((Collection)this.b);
    }
    
    public v b(final Entity entity) {
        if (this.b != null || this.a.d().contains(entity)) {
            this.e().remove(entity);
        }
        return this;
    }
    
    public v c() {
        if (!this.a()) {
            final List e = this.e();
            for (int i = 0; i < e.size(); ++i) {
                e.set(i, e.get(i).a().f());
            }
        }
        return this;
    }
    
    protected EntityList d() {
        if (this.b != null) {
            this.a = this.a(this.b);
            this.b = null;
        }
        return this.a;
    }
}
