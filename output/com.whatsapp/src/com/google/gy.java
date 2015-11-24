// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class gy extends gm implements aP
{
    private static final String z;
    private boolean a;
    private bB b;
    
    static {
        final char[] charArray = "\tQt\u0006\u001f4J=\u0006J-Ir\u0006Z9\u0019i\u001a\u001f?\\=\u001aI8Ko\u001c[9\\sU]$\u0019n\u0000]>U|\u0006L8J3".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '?';
                    break;
                }
                case 0: {
                    c2 = ']';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '\u001d';
                    break;
                }
                case 3: {
                    c2 = 'u';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected gy() {
        this.b = bB.d();
    }
    
    private bB a() {
        this.b.b();
        this.a = false;
        return this.b;
    }
    
    static bB a(final gy gy) {
        return gy.a();
    }
    
    @Override
    public gm a() {
        return this.b();
    }
    
    public gy b() {
        throw new UnsupportedOperationException(gy.z);
    }
    
    @Override
    public fE clone() {
        return this.b();
    }
    
    @Override
    public Object clone() {
        return this.b();
    }
}
