// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

public class EntityList implements Serializable, Iterable
{
    private static final EntityList a;
    private final List mEntities;
    
    static {
        a = new EntityList(Collections.emptyList());
    }
    
    EntityList(final List mEntities) {
        this.mEntities = mEntities;
    }
    
    public static EntityList a() {
        return EntityList.a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new EntityList$SerializationProxy(this);
    }
    
    public Entity a(final int n) {
        return this.mEntities.get(n);
    }
    
    void a(final int n, final int n2) {
        for (final Entity entity : this.mEntities) {
            if (entity.start > n) {
                entity.a(n2);
            }
        }
    }
    
    public int b() {
        return this.mEntities.size();
    }
    
    public boolean c() {
        return this.mEntities.isEmpty();
    }
    
    List d() {
        return this.mEntities;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EntityList && this.mEntities.equals(((EntityList)o).mEntities));
    }
    
    @Override
    public int hashCode() {
        return this.mEntities.hashCode();
    }
    
    @Override
    public Iterator iterator() {
        return this.mEntities.iterator();
    }
}
