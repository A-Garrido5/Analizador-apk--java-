// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

class ac
{
    private gz a;
    
    public gz a() {
        final int e = n.e;
        final gz a = this.a;
        if (a == null) {
            return null;
        }
        gz e2 = a.e;
        a.e = null;
        while (true) {
            gz f;
            for (gz b = a.b; b != null; b = f) {
                b.e = e2;
                f = b.f;
                if (e != 0) {
                    this.a = b;
                    return a;
                }
                e2 = b;
            }
            gz b = e2;
            continue;
        }
    }
    
    void a(final gz gz) {
        final int e = n.e;
        gz e2 = null;
        while (true) {
            gz f;
            for (gz a = gz; a != null; a = f) {
                a.e = e2;
                f = a.f;
                if (e != 0) {
                    this.a = a;
                    return;
                }
                e2 = a;
            }
            gz a = e2;
            continue;
        }
    }
}
