// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;

class x0 implements Runnable
{
    private static final String[] z;
    final m2 a;
    
    static {
        final String[] z2 = new String[2];
        String s = ":C1z1nHdlthQ!m1jK%v\u007fnB<k1hB'zxjS";
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
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
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
                    s = "{_+s~nKdmtiB*{xt@d";
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
    
    x0(final m2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.b(this.a.c);
        final bi a = App.ak.a(this.a.a);
        if (a != null) {
            Log.i(x0.z[1] + this.a.a + x0.z[0]);
            a.b((byte[])null);
            App.b(a, false);
        }
    }
}
