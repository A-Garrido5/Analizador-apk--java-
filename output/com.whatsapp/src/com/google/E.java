// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public final class E implements cH, dw
{
    private static final String z;
    private final bl a;
    private final by b;
    private final int c;
    private final String d;
    private dq e;
    private dV[] f;
    
    static {
        final char[] charArray = "l\u00148$\u0012\t\u00178:\u0015\t\u0019\"'\u0015H\u0013#i\u0000]Z!,\u0000Z\u000em&\u000fLZ;(\r\\\u001fc".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'a';
                    break;
                }
                case 0: {
                    c2 = ')';
                    break;
                }
                case 1: {
                    c2 = 'z';
                    break;
                }
                case 2: {
                    c2 = 'M';
                    break;
                }
                case 3: {
                    c2 = 'I';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private E(final dq e, final by b, final bl a, final int c) {
        this.c = c;
        this.e = e;
        this.d = cl.b(b, a, e.a());
        this.b = b;
        this.a = a;
        if (e.f() == 0) {
            throw new gG(this, E.z, (bO)null);
        }
        this.f = new dV[e.f()];
        for (int i = 0; i < e.f(); ++i) {
            this.f[i] = new dV(e.a(i), b, this, i, null);
        }
        by.a(b).d(this);
    }
    
    E(final dq dq, final by by, final bl bl, final int n, final bO bo) {
        this(dq, by, bl, n);
    }
    
    static void a(final E e, final dq dq) {
        e.a(dq);
    }
    
    private void a(final dq e) {
        this.e = e;
        for (int i = 0; i < this.f.length; ++i) {
            dV.a(this.f[i], e.a(i));
        }
    }
    
    @Override
    public dV a(final int n) {
        return b7.b(by.a(this.b)).get(new v(this, n));
    }
    
    public dV a(final String s) {
        final cH a = by.a(this.b).a(this.d + '.' + s);
        if (a != null && a instanceof dV) {
            return (dV)a;
        }
        return null;
    }
    
    public dq a() {
        return this.e;
    }
    
    @Override
    public fc a(final int n) {
        return this.a(n);
    }
    
    @Override
    public String a() {
        return this.d;
    }
    
    @Override
    public fm b() {
        return this.a();
    }
    
    public List b() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.f));
    }
    
    @Override
    public String c() {
        return this.e.a();
    }
    
    @Override
    public by d() {
        return this.b;
    }
}
