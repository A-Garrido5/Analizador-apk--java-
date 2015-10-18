// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import org.whispersystems.m;
import com.whatsapp.protocol.b2;

final class at7 implements Runnable
{
    private static final String[] z;
    private final b2[] a;
    private final byte[] b;
    final wx c;
    private final boolean d;
    private final int e;
    private final b2 f;
    
    static {
        final String[] z2 = new String[5];
        String s = ".a\u0018S+.";
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
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "on\u001eK,zzQU&}s\u001fC*`qQW1k}\u0014^0";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ".p\u001eUc";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "on\u001eK,zzQU&}s\u001fC*`qQU&zd\b\u00071kg\u0004B0z6";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ".d\u0014D&g`\u0014CcobQS*csQ";
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
    
    at7(final wx c, final byte[] b, final int e, final b2[] a, final b2 f, final boolean d) {
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
        this.f = f;
        this.d = d;
    }
    
    @Override
    public void run() {
        final byte[] a = m.a(this.e);
        if (this.d) {
            Log.i(at7.z[1]);
            App.a(this.b, a, (byte)5, this.a, this.f);
        }
        Log.i(at7.z[3] + this.c.c + at7.z[2] + this.c.e + at7.z[0] + this.e + at7.z[4] + this.c.a);
        final bi bi = new bi(this.c.e);
        bi.u = this.c.a;
        App.a(bi, this.c.c, a);
    }
}
