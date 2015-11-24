// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

public class b
{
    public static final b a;
    public final int b;
    
    static {
        a = new b(-1);
    }
    
    public b(final int b) {
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b && this.b == ((b)o).b);
    }
    
    @Override
    public int hashCode() {
        return this.b;
    }
}
