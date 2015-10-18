// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import com.whatsapp.util.b0;
import java.util.concurrent.atomic.AtomicBoolean;

class c3 implements Runnable
{
    private static final String z;
    final AtomicBoolean a;
    final g b;
    final bq c;
    final boolean d;
    
    static {
        final char[] charArray = "~M\u0002\u0017M|\u0004\u0011\u001dOp_\u0019\nB6M\u001f\tUuF\u0011\u001a\u0016j@\n\u001b\u0016zH\u001c\u001d".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ';';
                    break;
                }
                case 0: {
                    c2 = '\u0019';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = 'p';
                    break;
                }
                case 3: {
                    c2 = '~';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c3(final g b, final bq c, final boolean d, final AtomicBoolean a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    @Override
    public void run() {
        final b0 b0 = new b0(c3.z);
        while (true) {
            try {
                GoogleDriveActivity.a(this.b.b, this.c.a(this.d, this.c.b(), this.a));
                b0.c();
            }
            catch (b2 b2) {
                Log.b(b2);
                continue;
            }
            break;
        }
    }
}
