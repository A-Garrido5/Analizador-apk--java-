// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class c1
{
    private static final String z;
    private L a;
    private final cG b;
    
    static {
        final char[] charArray = "~X\t,qUK\u0002?#QD\u00149#^TG#lR\u001c\t8oP\u001f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = '<';
                    break;
                }
                case 1: {
                    c2 = '1';
                    break;
                }
                case 2: {
                    c2 = 'g';
                    break;
                }
                case 3: {
                    c2 = 'M';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public c1(final cG b) {
        if (b == null) {
            throw new IllegalArgumentException(c1.z);
        }
        this.b = b;
    }
    
    public c1 a() {
        return new c1(this.b.a(this.b.b().d()));
    }
    
    public hN a(final int n, final hN hn) {
        return this.b.a(n, hn);
    }
    
    public boolean b() {
        return this.b.b().a();
    }
    
    public L c() {
        try {
            if (this.a == null) {
                this.a = this.b.d();
            }
            return this.a;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public int d() {
        return this.b.a();
    }
    
    public int e() {
        return this.b.c();
    }
    
    @Override
    public String toString() {
        try {
            return this.c().toString();
        }
        catch (fv fv) {
            return "";
        }
    }
}
