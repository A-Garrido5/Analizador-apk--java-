// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class ax
{
    private static final String[] z;
    private final Z a;
    private final ci b;
    private final Object c;
    private final ci d;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "|P[\u000e\u0019_@D\u0011XU@s\u0007_SP[\u0016p\\VC\u0003WQ@".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = '2';
                    break;
                }
                case 1: {
                    c2 = '%';
                    break;
                }
                case 2: {
                    c2 = '7';
                    break;
                }
                case 3: {
                    c2 = 'b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "|P[\u000e\u0019QJY\u0016X[K^\f^f\\G\u0007}WCV\u0017UFlY\u0011MSKT\u0007".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '9';
                    break;
                }
                case 0: {
                    c4 = '2';
                    break;
                }
                case 1: {
                    c4 = '%';
                    break;
                }
                case 2: {
                    c4 = '7';
                    break;
                }
                case 3: {
                    c4 = 'b';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    private ax(final ci b, final Object c, final ci d, final Z a) {
        if (b == null) {
            throw new IllegalArgumentException(ax.z[1]);
        }
        try {
            if (a.e() == el.MESSAGE && d == null) {
                try {
                    throw new IllegalArgumentException(ax.z[0]);
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    ax(final ci ci, final Object o, final ci ci2, final Z z, final cM cm) {
        this(ci, o, ci2, z);
    }
    
    static Z a(final ax ax) {
        return ax.a;
    }
    
    static Object b(final ax ax) {
        return ax.c;
    }
    
    static ci c(final ax ax) {
        return ax.d;
    }
    
    public int a() {
        return this.a.c();
    }
    
    public ci b() {
        return this.b;
    }
}
