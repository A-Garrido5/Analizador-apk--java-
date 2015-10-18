// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class gG extends Exception
{
    private static final long serialVersionUID = 5750205775490483148L;
    private static final String[] z;
    private final fm a;
    private final String b;
    private final String c;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = ";{".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '\u0001';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = 'i';
                    break;
                }
                case 3: {
                    c2 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = ";{".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0012';
                    break;
                }
                case 0: {
                    c4 = '\u0001';
                    break;
                }
                case 1: {
                    c4 = '[';
                    break;
                }
                case 2: {
                    c4 = 'i';
                    break;
                }
                case 3: {
                    c4 = 'F';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    private gG(final by by, final String c) {
        super(by.c() + gG.z[0] + c);
        this.b = by.c();
        this.a = by.f();
        this.c = c;
    }
    
    gG(final by by, final String s, final bO bo) {
        this(by, s);
    }
    
    private gG(final cH ch, final String c) {
        super(ch.a() + gG.z[1] + c);
        this.b = ch.a();
        this.a = ch.b();
        this.c = c;
    }
    
    gG(final cH ch, final String s, final bO bo) {
        this(ch, s);
    }
    
    private gG(final cH ch, final String s, final Throwable t) {
        this(ch, s);
        this.initCause(t);
    }
    
    gG(final cH ch, final String s, final Throwable t, final bO bo) {
        this(ch, s, t);
    }
    
    public fm a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.c;
    }
}
