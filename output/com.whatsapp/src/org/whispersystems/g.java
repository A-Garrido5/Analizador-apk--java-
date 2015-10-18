// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class g
{
    private final Object a;
    private final Object b;
    
    public g(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    private boolean a(final Object o, final Object o2) {
        return (o == null && o2 == null) || (o != null && o2 != null && o.equals(o2));
    }
    
    public Object a() {
        return this.a;
    }
    
    public Object b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof g && this.a(((g)o).a(), this.a()) && this.a(((g)o).b(), this.b());
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode() ^ this.b().hashCode();
    }
}
