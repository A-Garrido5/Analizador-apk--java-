// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class V
{
    private final int a;
    private final String b;
    
    public V(final String b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != null && o instanceof V) {
            final V v = (V)o;
            if (this.b.equals(v.b) && this.a == v.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode() ^ this.a;
    }
    
    @Override
    public String toString() {
        return this.b + ":" + this.a;
    }
}
