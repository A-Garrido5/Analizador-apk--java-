// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.Collection;

public class jm extends j1
{
    private static final String z;
    int b;
    String c;
    Collection d;
    
    static {
        final char[] charArray = ":)#)m'\u0004\u0011>o8{".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\b';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = '|';
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
    
    public jm(final String c, final Collection d, final int b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public String b() {
        final boolean i = App.I;
        final StringBuilder sb = new StringBuilder();
        for (final bi bi : this.d) {
            sb.append(" ");
            sb.append(bi.a.toString());
            if (i) {
                break;
            }
        }
        return jm.z + this.c + sb.toString() + " " + this.b;
    }
    
    @Override
    public void c() {
        App.a(this.c, this.d, this.b);
    }
}
