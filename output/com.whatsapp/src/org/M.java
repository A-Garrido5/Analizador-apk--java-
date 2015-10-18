// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.nio.charset.Charset;
import java.net.DatagramSocket;

public abstract class M
{
    private static final Q b;
    public static boolean c;
    protected int a;
    protected DatagramSocket d;
    protected Q e;
    private Charset f;
    protected boolean g;
    
    static {
        b = new H();
    }
    
    public M() {
        final boolean c = M.c;
        this.f = Charset.defaultCharset();
        this.d = null;
        this.a = 0;
        this.g = false;
        this.e = M.b;
        if (c) {
            ++l.a;
        }
    }
    
    public void a() {
        (this.d = this.e.a()).setSoTimeout(this.a);
        this.g = true;
    }
    
    public void a(final int a) {
        this.a = a;
    }
    
    public boolean b() {
        return this.g;
    }
    
    public void c() {
        if (this.d != null) {
            this.d.close();
        }
        this.d = null;
        this.g = false;
    }
}
