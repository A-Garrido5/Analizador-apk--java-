// 
// Decompiled by Procyon v0.5.30
// 

final class ca
{
    final byte[] a;
    int b;
    int c;
    ca d;
    ca e;
    
    ca() {
        this.a = new byte[2048];
    }
    
    public ca a() {
        ca d;
        if (this.d != this) {
            d = this.d;
        }
        else {
            d = null;
        }
        this.e.d = this.d;
        this.d.e = this.e;
        this.d = null;
        this.e = null;
        return d;
    }
    
    public ca a(final int n) {
        final int n2 = this.c - this.b - n;
        if (n <= 0 || n2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (n < n2) {
            final ca a = cb.a.a();
            System.arraycopy(this.a, this.b, a.a, a.b, n);
            this.b += n;
            a.c += n;
            this.e.a(a);
            return a;
        }
        final ca a2 = cb.a.a();
        System.arraycopy(this.a, n + this.b, a2.a, a2.b, n2);
        this.c -= n2;
        a2.c += n2;
        this.a(a2);
        return this;
    }
    
    public ca a(final ca ca) {
        ca.e = this;
        ca.d = this.d;
        this.d.e = ca;
        return this.d = ca;
    }
    
    public void a(final ca ca, final int n) {
        if (n + (ca.c - ca.b) > 2048) {
            throw new IllegalArgumentException();
        }
        if (n + ca.c > 2048) {
            System.arraycopy(ca.a, ca.b, ca.a, 0, ca.c - ca.b);
            ca.c -= ca.b;
            ca.b = 0;
        }
        System.arraycopy(this.a, this.b, ca.a, ca.c, n);
        ca.c += n;
        this.b += n;
    }
    
    public void b() {
        if (this.e == this) {
            throw new IllegalStateException();
        }
        if (this.e.c - this.e.b + (this.c - this.b) > 2048) {
            return;
        }
        this.a(this.e, this.c - this.b);
        this.a();
        cb.a.a(this);
    }
}
