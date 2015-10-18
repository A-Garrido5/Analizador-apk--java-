// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class E
{
    private static final String z;
    private final w a;
    private final w b;
    private final o c;
    private final ak d;
    private final R e;
    private final aY f;
    
    static {
        final char[] charArray = "p\u0016\u001aD\fH\u0002\u001a]I\u001f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ',';
                    break;
                }
                case 0: {
                    c2 = '>';
                    break;
                }
                case 1: {
                    c2 = 'c';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = '(';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    E(final aY f, final w a, final w b, final R e, final o c, final ak d) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        if (f != null && a != null && b != null && e != null && c != null) {
            if (d != null) {
                return;
            }
        }
        try {
            throw new IllegalArgumentException(E.z);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public static H f() {
        return new H();
    }
    
    public w a() {
        return this.b;
    }
    
    public o b() {
        return this.c;
    }
    
    public aY c() {
        return this.f;
    }
    
    public ak d() {
        return this.d;
    }
    
    public R e() {
        return this.e;
    }
    
    public w g() {
        return this.a;
    }
}
