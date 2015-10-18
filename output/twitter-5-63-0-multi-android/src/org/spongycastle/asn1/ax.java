// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.math.BigInteger;

public class ax extends q
{
    byte[] a;
    
    public ax(final int n) {
        this.a = BigInteger.valueOf(n).toByteArray();
    }
    
    public ax(final BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
    }
    
    public ax(final byte[] a) {
        this.a = a;
    }
    
    public static i a(final Object o) {
        if (o == null || o instanceof i) {
            return (i)o;
        }
        if (o instanceof ax) {
            return new i(((ax)o).c());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + o.getClass().getName());
    }
    
    @Override
    void a(final o o) {
        o.a(2, this.a);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof ax && aag.a(this.a, ((ax)q).a);
    }
    
    public BigInteger c() {
        return new BigInteger(this.a);
    }
    
    public BigInteger d() {
        return new BigInteger(1, this.a);
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        int i = 0;
        int n = 0;
        while (i != this.a.length) {
            n ^= (0xFF & this.a[i]) << i % 4;
            ++i;
        }
        return n;
    }
    
    @Override
    int i() {
        return 1 + ca.a(this.a.length) + this.a.length;
    }
    
    @Override
    public String toString() {
        return this.c().toString();
    }
}
