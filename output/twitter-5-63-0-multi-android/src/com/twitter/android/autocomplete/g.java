// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

public class g
{
    private final db a;
    private final m b;
    private final l c;
    private k d;
    
    public g(final db a, final m b) {
        this.c = new l();
        this.a = a;
        this.b = b;
    }
    
    public void a() {
        synchronized (this) {
            if (this.d != null && this.d.a()) {
                this.d.b();
            }
            else {
                this.c.a.a(null);
                this.c.b = null;
            }
        }
    }
    
    public void a(final Object o) {
        synchronized (this) {
            if (this.d == null || !this.d.a()) {
                (this.d = new k(this.a, this.b, this.c)).start();
            }
            this.d.a(o);
        }
    }
}
