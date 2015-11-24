// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.Writer;

public final class c3 implements co, bp
{
    private final co a;
    private final bp b;
    private final co c;
    private final String d;
    private final Writer e;
    
    public c3(final bp b, final Writer e, final String d) {
        this.c = null;
        this.b = b;
        this.e = e;
        this.a = new br(this.e);
        this.d = d;
    }
    
    public c3(final co c, final Writer e, final String d) {
        this.c = c;
        this.b = null;
        this.e = e;
        this.a = new br(this.e);
        this.d = d;
    }
    
    @Override
    public void a() {
        this.c.a();
        this.e.write(this.d);
        this.a.a();
    }
    
    @Override
    public void a(final b4 b4) {
        this.c.a(b4);
    }
    
    @Override
    public void a(final c0 c0) {
        this.c.a(c0);
        try {
            this.e.write(this.d);
            this.a.a(c0);
        }
        catch (Throwable t) {}
    }
    
    @Override
    public void a(final c0 c0, final int n) {
        this.c.a(c0, n);
        try {
            this.e.write(this.d);
            this.a.a(c0);
        }
        catch (Throwable t) {}
    }
    
    @Override
    public void a(final c0 c0, final boolean b) {
        this.c.a(c0, b);
        try {
            this.e.write(this.d);
            this.a.a(c0);
        }
        catch (Throwable t) {}
    }
    
    @Override
    public void a(final String s, final String s2) {
        this.c.a(s, s2);
        this.e.write(this.d);
        this.a.a(s, s2);
    }
    
    @Override
    public byte[] a(final c0 c0) {
        try {
            this.e.write(this.d);
            this.a.a(c0);
            return this.b.a(c0);
        }
        catch (Throwable t) {
            return this.b.a(c0);
        }
    }
}
