// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.Writer;

public class q extends Writer
{
    private static final String z;
    StringBuilder a;
    
    static {
        final char[] charArray = "q\u0019\r%c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'C';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = 'U';
                    break;
                }
                case 2: {
                    c2 = 'R';
                    break;
                }
                case 3: {
                    c2 = 'a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public q() {
        this.a = new StringBuilder();
    }
    
    @Override
    public void close() {
        this.a = null;
    }
    
    @Override
    public void flush() {
        if (Log.d() >= 4) {
            Log.c(4, Log.b(q.z, this.a.toString()));
            this.a = new StringBuilder();
        }
    }
    
    @Override
    public void write(final int n) {
        if (Log.d() >= 4) {
            this.a.append((char)n);
        }
    }
    
    @Override
    public void write(final String s, final int n, final int n2) {
        if (Log.d() >= 4) {
            this.a.append(s, n, n2);
        }
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        if (Log.d() >= 4) {
            this.a.append(array, n, n2);
        }
    }
}
