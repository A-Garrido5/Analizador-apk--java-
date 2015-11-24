// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class ap extends q
{
    public static final b a;
    public static final b b;
    private static final byte[] c;
    private static final byte[] d;
    private byte[] e;
    
    static {
        c = new byte[] { -1 };
        d = new byte[] { 0 };
        a = new b(false);
        b = new b(true);
    }
    
    public ap(final boolean b) {
        byte[] e;
        if (b) {
            e = ap.c;
        }
        else {
            e = ap.d;
        }
        this.e = e;
    }
    
    ap(final byte[] array) {
        if (array.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (array[0] == 0) {
            this.e = ap.d;
            return;
        }
        if (array[0] == 255) {
            this.e = ap.c;
            return;
        }
        this.e = aag.b(array);
    }
    
    static b b(final byte[] array) {
        if (array.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (array[0] == 0) {
            return ap.a;
        }
        if (array[0] == 255) {
            return ap.b;
        }
        return new b(array);
    }
    
    @Override
    void a(final o o) {
        o.a(1, this.e);
    }
    
    protected boolean a(final q q) {
        return q != null && q instanceof ap && this.e[0] == ((ap)q).e[0];
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.e[0];
    }
    
    @Override
    int i() {
        return 3;
    }
    
    @Override
    public String toString() {
        if (this.e[0] != 0) {
            return "TRUE";
        }
        return "FALSE";
    }
}
