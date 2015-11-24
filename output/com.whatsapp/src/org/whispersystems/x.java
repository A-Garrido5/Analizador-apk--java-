// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hv;

public class x
{
    private aj a;
    
    public x(final int n, final long n2, final w w, final byte[] array) {
        this.a = aj.n().a(n).c(hv.a(w.b().a())).a(hv.a(w.a().a())).b(hv.a(array)).a(n2).h();
    }
    
    public x(final byte[] array) {
        this.a = aj.a(array);
    }
    
    public w a() {
        try {
            return new w(s.a(this.a.h().a(), 0), s.a(this.a.d().a()));
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public byte[] b() {
        return this.a.c().a();
    }
    
    public byte[] c() {
        return this.a.a();
    }
    
    public int d() {
        return this.a.r();
    }
}
