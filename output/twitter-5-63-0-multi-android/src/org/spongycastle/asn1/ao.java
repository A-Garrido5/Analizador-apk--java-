// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.IOException;

public class ao extends q
{
    private static final char[] c;
    protected byte[] a;
    protected int b;
    
    static {
        c = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public ao(final d d) {
        try {
            this.a = d.a().a("DER");
            this.b = 0;
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("Error processing object : " + ex.toString());
        }
    }
    
    public ao(final byte[] a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    static ao a(final int n, final InputStream inputStream) {
        if (n < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        final int read = inputStream.read();
        final byte[] array = new byte[n - 1];
        if (array.length != 0 && aam.a(inputStream, array) != array.length) {
            throw new EOFException("EOF encountered in middle of BIT STRING");
        }
        return new ao(array, read);
    }
    
    public static ao a(final Object o) {
        if (o == null || o instanceof ao) {
            return (ao)o;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + o.getClass().getName());
    }
    
    @Override
    void a(final o o) {
        final byte[] array = new byte[1 + this.a.length];
        array[0] = (byte)this.b;
        System.arraycopy(this.a, 0, array, 1, -1 + array.length);
        o.a(3, array);
    }
    
    protected boolean a(final q q) {
        if (q instanceof ao) {
            final ao ao = (ao)q;
            if (this.b == ao.b && aag.a(this.a, ao.a)) {
                return true;
            }
        }
        return false;
    }
    
    public byte[] c() {
        return this.a;
    }
    
    public String d() {
        final StringBuffer sb = new StringBuffer("#");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final o o = new o(byteArrayOutputStream);
        try {
            o.a((d)this);
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; ++i) {
                sb.append(ao.c[0xF & byteArray[i] >>> 4]);
                sb.append(ao.c[0xF & byteArray[i]]);
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
        return this.b ^ aag.a(this.a);
    }
    
    @Override
    int i() {
        return 1 + (1 + ca.a(1 + this.a.length) + this.a.length);
    }
    
    @Override
    public String toString() {
        return this.d();
    }
}
