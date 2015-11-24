// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.util.Log;

class art implements Runnable
{
    private static final String z;
    final t1 a;
    final Runnable b;
    final Runnable c;
    
    static {
        final char[] charArray = "1i\u0006T*3h\u0004\b,9y\u0004N(9~NU;?\u007f\bQ;85\u0004U,3hA".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = '\\';
                    break;
                }
                case 1: {
                    c2 = '\u001a';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = '\'';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    art(final t1 a, final Runnable b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        final boolean k = a_9.k;
        for (final aw3 aw3 : t1.a(this.a).values()) {
            if (aw3.a >= 500) {
                Log.w(art.z + aw3.a);
                if (this.b != null) {
                    this.b.run();
                }
                return;
            }
            if (k) {
                break;
            }
        }
        if (this.c != null) {
            this.c.run();
        }
    }
}
