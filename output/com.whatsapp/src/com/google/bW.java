// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bW implements cH
{
    private t[] a;
    private dB b;
    private final int c;
    private final String d;
    private final by e;
    
    private bW(final dB b, final by e, final int c) {
        this.c = c;
        this.b = b;
        this.d = cl.b(e, null, b.p());
        this.e = e;
        this.a = new t[b.e()];
        for (int i = 0; i < b.e(); ++i) {
            this.a[i] = new t(b.a(i), e, this, i, null);
        }
        by.a(e).d(this);
    }
    
    bW(final dB db, final by by, final int n, final bO bo) {
        this(db, by, n);
    }
    
    static void a(final bW bw) {
        bw.b();
    }
    
    static void a(final bW bw, final dB db) {
        bw.a(db);
    }
    
    private void a(final dB b) {
        this.b = b;
        for (int i = 0; i < this.a.length; ++i) {
            t.a(this.a[i], b.a(i));
        }
    }
    
    private void b() {
        final t[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            t.a(a[i]);
        }
    }
    
    public dB a() {
        return this.b;
    }
    
    @Override
    public String a() {
        return this.d;
    }
    
    @Override
    public fm b() {
        return this.a();
    }
    
    @Override
    public String c() {
        return this.b.p();
    }
    
    @Override
    public by d() {
        return this.e;
    }
}
