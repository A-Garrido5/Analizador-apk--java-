// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

class cQ
{
    private volatile ci a;
    private final ci b;
    private hv c;
    private volatile boolean d;
    private final fu e;
    
    public cQ(final ci b, final fu e, final hv c) {
        this.d = false;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    private void b() {
        try {
            if (this.a != null) {
                return;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        synchronized (this) {
            if (this.a != null) {
                return;
            }
        }
        while (true) {
            try {
                if (this.c != null) {
                    this.a = (ci)this.b.getParserForType().a(this.c, this.e);
                }
            }
            // monitorexit(this)
            catch (IOException ex2) {
                continue;
            }
            break;
        }
    }
    
    public int a() {
        if (this.d) {
            return this.a.getSerializedSize();
        }
        return this.c.c();
    }
    
    public ci a(final ci a) {
        final ci a2 = this.a;
        this.a = a;
        this.c = null;
        this.d = true;
        return a2;
    }
    
    public ci c() {
        this.b();
        return this.a;
    }
    
    public hv d() {
        if (!this.d) {
            return this.c;
        }
        synchronized (this) {
            if (!this.d) {
                return this.c;
            }
        }
        this.c = this.a.b();
        this.d = false;
        // monitorexit(this)
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        this.b();
        return this.a.equals(o);
    }
    
    @Override
    public int hashCode() {
        this.b();
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        this.b();
        return this.a.toString();
    }
}
