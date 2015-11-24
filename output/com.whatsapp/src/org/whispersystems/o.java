// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class o
{
    private final ak a;
    
    public o(final ak a) {
        this.a = a;
    }
    
    public o(final byte[] array, final int n) {
        this.a = s.a(array, n);
    }
    
    public ak a() {
        return this.a;
    }
    
    public byte[] b() {
        return this.a.a();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof o && this.a.equals(((o)o).a());
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
