// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class Z
{
    private static final String z;
    private final o a;
    private final ak b;
    private final R c;
    private final ak d;
    private final w e;
    private final aY f;
    
    static {
        final char[] charArray = "\u0012J.ZQ*^.C\u0014/\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'q';
                    break;
                }
                case 0: {
                    c2 = '\\';
                    break;
                }
                case 1: {
                    c2 = '?';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '6';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private Z(final aY f, final w e, final o a, final ak d, final ak b, final R c) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        if (f != null && e != null && a != null && d != null && b != null) {
            if (c != null) {
                return;
            }
        }
        try {
            throw new IllegalArgumentException(Z.z);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    Z(final aY ay, final w w, final o o, final ak ak, final ak ak2, final R r, final A a) {
        this(ay, w, o, ak, ak2, r);
    }
    
    public static a3 g() {
        return new a3();
    }
    
    public o a() {
        return this.a;
    }
    
    public ak b() {
        return this.b;
    }
    
    public R c() {
        return this.c;
    }
    
    public w d() {
        return this.e;
    }
    
    public aY e() {
        return this.f;
    }
    
    public ak f() {
        return this.d;
    }
}
