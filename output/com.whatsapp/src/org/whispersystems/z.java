// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import com.google.hv;

public class z
{
    private am a;
    
    public z(final int n, final w w) {
        this.a = am.f().a(n).a(hv.a(w.b().a())).b(hv.a(w.a().a())).c();
    }
    
    public z(final byte[] array) {
        this.a = am.a(array);
    }
    
    public w a() {
        try {
            return new w(s.a(this.a.a().a(), 0), s.a(this.a.i().a()));
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public int b() {
        return this.a.j();
    }
    
    public byte[] c() {
        return this.a.a();
    }
}
