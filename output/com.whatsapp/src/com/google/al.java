// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;

public class al extends IOException
{
    private static final long serialVersionUID = 3196188060225107702L;
    private static final String z;
    private final int a;
    private final int b;
    
    static {
        final char[] charArray = "\u0014q".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '/';
                    break;
                }
                case 0: {
                    c2 = '.';
                    break;
                }
                case 1: {
                    c2 = 'Q';
                    break;
                }
                case 2: {
                    c2 = 'M';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public al(final int a, final int b, final String s) {
        super(Integer.toString(a) + ":" + b + al.z + s);
        this.a = a;
        this.b = b;
    }
    
    public al(final String s) {
        this(-1, -1, s);
    }
    
    public int a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
}
