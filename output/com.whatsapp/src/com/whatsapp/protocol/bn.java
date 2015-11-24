// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.Writer;

public final class bn implements bc, b1
{
    private final co a;
    private final b1 b;
    private final String c;
    private final bc d;
    private final Writer e;
    
    public bn(final b1 b, final Writer e, final String c) {
        this.d = null;
        this.b = b;
        this.e = e;
        this.a = new br(this.e);
        this.c = c;
    }
    
    public bn(final bc d, final Writer e, final String c) {
        this.d = d;
        this.b = null;
        this.e = e;
        this.a = new br(this.e);
        this.c = c;
    }
    
    @Override
    public c0 a(final byte[] array) {
        final c0 a = this.b.a(array);
        try {
            this.e.write(this.c);
            this.a.a(a);
            return a;
        }
        catch (Throwable t) {
            return a;
        }
    }
    
    @Override
    public void a() {
        this.d.a();
    }
    
    @Override
    public void a(final b4 b4) {
        this.d.a(b4);
    }
    
    @Override
    public String b() {
        return this.d.b();
    }
    
    @Override
    public void c() {
        this.d.c();
    }
    
    @Override
    public c0 d() {
        final c0 d = this.d.d();
        try {
            this.e.write(this.c);
            this.a.a(d);
            return d;
        }
        catch (Throwable t) {
            return d;
        }
    }
}
