// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.util;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;
import java.util.NoSuchElementException;
import java.io.Serializable;

public final class Optional
{
    private static final Optional a;
    private final Object b;
    
    static {
        a = new Optional();
    }
    
    private Optional() {
        this.b = null;
    }
    
    private Optional(final Object b) {
        if (b == null) {
            throw new NullPointerException();
        }
        this.b = b;
    }
    
    public static Optional a() {
        return Optional.a;
    }
    
    public static Optional a(final Object o) {
        return new Optional(o);
    }
    
    public static Object a(final Optional optional) {
        if (optional == null || !optional.c()) {
            return null;
        }
        return optional.b();
    }
    
    public static Optional$ExternalizableOptional b(final Optional optional) {
        if (optional == null) {
            return null;
        }
        final Optional$ExternalizableOptional optional$ExternalizableOptional = new Optional$ExternalizableOptional();
        optional$ExternalizableOptional.mValue = (Serializable)optional.b;
        return optional$ExternalizableOptional;
    }
    
    public static Optional b(final Object o) {
        if (o == null) {
            return a();
        }
        return a(o);
    }
    
    public static Optional c(final Object o) {
        if (o == null) {
            return null;
        }
        return b(((Optional$ExternalizableOptional)o).mValue);
    }
    
    public Object b() {
        if (this.b == null) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }
    
    public boolean c() {
        return this.b != null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || !(o instanceof Optional)) {
                return false;
            }
            final Optional optional = (Optional)o;
            if (this.b != null) {
                return this.b.equals(optional.b);
            }
            if (optional.b != null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
    
    @Override
    public String toString() {
        if (this.b == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", this.b);
    }
}
