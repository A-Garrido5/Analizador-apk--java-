// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;

final class ar
{
    private static final String[] z;
    private final int a;
    private boolean b;
    private final String c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u00194)\u0015\u001f^2a\u0000\u001e\u0019";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = '9';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0019>/\u001d\u0005P6-\u001d\u000b\\w5\u001bQ";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ar(final int n, final String s) {
        this(n, s, false);
    }
    
    public ar(final int a, final String c, final boolean b) {
        this.a = a;
        this.c = c;
        Log.b(a, c + ar.z[1] + b);
        this.b = b;
    }
    
    public void a(final boolean b) {
        Log.b(this.a, this.c + " " + this.b + ar.z[0] + b);
        this.b = b;
    }
    
    public boolean a() {
        return this.b;
    }
}
