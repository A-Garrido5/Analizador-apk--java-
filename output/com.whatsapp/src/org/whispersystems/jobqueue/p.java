// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.List;
import java.io.Serializable;

public class p implements Serializable
{
    private final List a;
    private transient o b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final String f;
    private final long g;
    
    private p(final List a, final boolean c, final String f, final o b, final int e, final boolean d, final long g) {
        this.a = a;
        this.c = c;
        this.f = f;
        this.b = b;
        this.e = e;
        this.d = d;
        this.g = g;
    }
    
    p(final List list, final boolean b, final String s, final o o, final int n, final boolean b2, final long n2, final q q) {
        this(list, b, s, o, n, b2, n2);
    }
    
    public static g h() {
        return new g();
    }
    
    public List a() {
        return this.a;
    }
    
    public void a(final o b) {
        this.b = b;
    }
    
    public boolean b() {
        return this.c;
    }
    
    public boolean c() {
        return this.d;
    }
    
    public int d() {
        return this.e;
    }
    
    public o e() {
        return this.b;
    }
    
    public long f() {
        return this.g;
    }
    
    public String g() {
        return this.f;
    }
}
