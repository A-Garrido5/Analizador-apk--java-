// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class aq extends q
{
    private static f[] b;
    byte[] a;
    
    static {
        aq.b = new f[12];
    }
    
    public aq(final byte[] a) {
        this.a = a;
    }
    
    static f b(final byte[] array) {
        f f;
        if (array.length > 1) {
            f = new f(aag.b(array));
        }
        else {
            if (array.length == 0) {
                throw new IllegalArgumentException("ENUMERATED has zero length");
            }
            final int n = 0xFF & array[0];
            if (n >= aq.b.length) {
                return new f(aag.b(array));
            }
            f = aq.b[n];
            if (f == null) {
                return aq.b[n] = new f(aag.b(array));
            }
        }
        return f;
    }
    
    @Override
    void a(final o o) {
        o.a(10, this.a);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof aq && aag.a(this.a, ((aq)q).a);
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        return aag.a(this.a);
    }
    
    @Override
    int i() {
        return 1 + ca.a(this.a.length) + this.a.length;
    }
}
