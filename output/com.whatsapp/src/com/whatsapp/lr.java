// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.c2;

public class lr implements c2, b9
{
    private static final String[] z;
    j1 a;
    
    static {
        final String[] z2 = new String[5];
        String s = "M:=-9_-\u0012<(S&Xh";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001c'\u0012ra";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "M:=-3N'\u0010ht\fxB'1\u001c!\f> P!\u0006h%N'\u00128(R/Xh";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "I&\u000701Y+\u0016-%\u001c:\u0007<4N&B+.X-Xh";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "M:=-3N'\u0010ht\fxB94Y=\u0007!/[rB";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public lr(final j1 a) {
        a.a(l7.c);
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        final boolean i = App.I;
        if (n >= 500) {
            if (this.a.a()) {
                Log.e(lr.z[4] + this.a.toString());
                l7.s.add(this.a);
                if (!i) {
                    return;
                }
            }
            Log.e(lr.z[2] + this.a.toString());
            if (!i) {
                return;
            }
        }
        if (n >= 400) {
            l7.f();
            if (!i) {
                return;
            }
        }
        Log.e(lr.z[3] + n + lr.z[1] + this.a.toString());
    }
    
    @Override
    public void a(final Exception ex) {
        Log.b(lr.z[0] + this.a.toString(), ex);
    }
}
