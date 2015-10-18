// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class bn extends q
{
    private static final char[] a;
    private byte[] b;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public bn(final byte[] b) {
        this.b = b;
    }
    
    @Override
    void a(final o o) {
        o.a(28, this.b);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof bn && aag.a(this.b, ((bn)q).b);
    }
    
    public String c() {
        final StringBuffer sb = new StringBuffer("#");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final o o = new o(byteArrayOutputStream);
        try {
            o.a((d)this);
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; ++i) {
                sb.append(bn.a[0xF & byteArray[i] >>> 4]);
                sb.append(bn.a[0xF & byteArray[i]]);
            }
        }
        catch (IOException ex) {
            throw new RuntimeException("internal error encoding BitString");
        }
        return sb.toString();
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        return aag.a(this.b);
    }
    
    @Override
    int i() {
        return 1 + ca.a(this.b.length) + this.b.length;
    }
    
    @Override
    public String toString() {
        return this.c();
    }
}
