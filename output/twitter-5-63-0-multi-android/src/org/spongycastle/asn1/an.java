// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class an extends q
{
    private char[] a;
    
    an(final char[] a) {
        this.a = a;
    }
    
    @Override
    void a(final o o) {
        o.b(30);
        o.a(2 * this.a.length);
        for (int i = 0; i != this.a.length; ++i) {
            final char c = this.a[i];
            o.b((byte)(c >> 8));
            o.b((byte)c);
        }
    }
    
    protected boolean a(final q q) {
        return q instanceof an && aag.a(this.a, ((an)q).a);
    }
    
    public String c() {
        return new String(this.a);
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
        return 1 + ca.a(2 * this.a.length) + 2 * this.a.length;
    }
    
    @Override
    public String toString() {
        return this.c();
    }
}
