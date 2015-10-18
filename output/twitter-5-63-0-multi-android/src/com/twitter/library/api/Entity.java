// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Comparator;
import java.io.Externalizable;

public class Entity implements Externalizable
{
    public static final Comparator a;
    private static final long serialVersionUID = 5621176132729378592L;
    public int end;
    public int start;
    
    static {
        a = new s();
    }
    
    public Entity() {
        this.start = -1;
        this.end = -1;
    }
    
    Entity(final t t) {
        this.start = -1;
        this.end = -1;
        this.start = t.a;
        this.end = t.b;
    }
    
    public t a() {
        return new u(this);
    }
    
    public void a(final int n) {
        this.start += n;
        this.end += n;
    }
    
    public boolean a(final Entity entity) {
        return this == entity || (entity != null && this.start == entity.start && this.end == entity.end);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Entity && this.a((Entity)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * this.start + this.end;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.start = objectInput.readInt();
        this.end = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.start);
        objectOutput.writeInt(this.end);
    }
}
