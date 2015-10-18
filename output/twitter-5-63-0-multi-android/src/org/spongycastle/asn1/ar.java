// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;

public class ar extends q
{
    private l a;
    private i b;
    private q c;
    private int d;
    private q e;
    
    public ar(final e e) {
        q c = this.a(e, 0);
        final boolean b = c instanceof l;
        int n = 0;
        if (b) {
            this.a = (l)c;
            n = 1;
            c = this.a(e, n);
        }
        if (c instanceof i) {
            this.b = (i)c;
            ++n;
            c = this.a(e, n);
        }
        if (!(c instanceof bk)) {
            this.c = c;
            ++n;
            c = this.a(e, n);
        }
        if (e.a() != n + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(c instanceof bk)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        final bk bk = (bk)c;
        this.a(bk.c());
        this.e = bk.j();
    }
    
    private q a(final e e, final int n) {
        if (e.a() <= n) {
            throw new IllegalArgumentException("too few objects in input vector");
        }
        return e.a(n).a();
    }
    
    private void a(final int d) {
        if (d < 0 || d > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + d);
        }
        this.d = d;
    }
    
    @Override
    void a(final o o) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.a != null) {
            byteArrayOutputStream.write(this.a.a("DER"));
        }
        if (this.b != null) {
            byteArrayOutputStream.write(this.b.a("DER"));
        }
        if (this.c != null) {
            byteArrayOutputStream.write(this.c.a("DER"));
        }
        byteArrayOutputStream.write(new bk(true, this.d, this.e).a("DER"));
        o.a(32, 8, byteArrayOutputStream.toByteArray());
    }
    
    @Override
    boolean a(final q q) {
        if (q instanceof ar) {
            if (this == q) {
                return true;
            }
            final ar ar = (ar)q;
            if ((this.a == null || (ar.a != null && ar.a.equals(this.a))) && (this.b == null || (ar.b != null && ar.b.equals(this.b))) && (this.c == null || (ar.c != null && ar.c.equals(this.c)))) {
                return this.e.equals(ar.e);
            }
        }
        return false;
    }
    
    @Override
    boolean h() {
        return true;
    }
    
    @Override
    public int hashCode() {
        final l a = this.a;
        int hashCode = 0;
        if (a != null) {
            hashCode = this.a.hashCode();
        }
        if (this.b != null) {
            hashCode ^= this.b.hashCode();
        }
        if (this.c != null) {
            hashCode ^= this.c.hashCode();
        }
        return hashCode ^ this.e.hashCode();
    }
    
    @Override
    int i() {
        return this.b().length;
    }
}
