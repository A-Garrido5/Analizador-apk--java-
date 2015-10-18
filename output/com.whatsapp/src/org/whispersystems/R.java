// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Set;
import java.io.Serializable;

public abstract class R implements Serializable
{
    public static boolean a;
    private static final long serialVersionUID;
    
    public static R a() {
        return S.b;
    }
    
    public static R a(final Object o) {
        return new T(a8.a(o));
    }
    
    public static R b(final Object o) {
        if (o == null) {
            return a();
        }
        return new T(o);
    }
    
    public abstract Object a(final n p0);
    
    public abstract R a(final R p0);
    
    public abstract R a(final aU p0);
    
    public abstract Object b();
    
    public abstract Object c(final Object p0);
    
    public abstract boolean c();
    
    public abstract Object d();
    
    public abstract Set e();
    
    @Override
    public abstract boolean equals(final Object p0);
    
    @Override
    public abstract int hashCode();
    
    @Override
    public abstract String toString();
}
