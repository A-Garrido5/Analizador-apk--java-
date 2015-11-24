// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.ConditionVariable;
import com.whatsapp.gdrive.bf;

final class asp extends bf
{
    private static final String[] z;
    final ConditionVariable a;
    
    static {
        final String[] z2 = new String[3];
        String s = "uT\r \u0014tP\u0002&\u0014r^\u000f#\tc\\N\"\u0004cX\u0017 M~S\u0012 \u0012gT\u0013j\u0004t]\u00041\t~_L#\t\u007fX\u0012-\u0005u\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = '1';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = 'E';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "bD\u0002&\u0005bB";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "wP\b)\u0005u";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    asp(final ConditionVariable a) {
        this.a = a;
    }
    
    @Override
    public void a(final boolean b) {
        final StringBuilder append = new StringBuilder().append(asp.z[0]);
        String s;
        if (b) {
            s = asp.z[1];
        }
        else {
            s = asp.z[2];
        }
        Log.i(append.append(s).toString());
        this.a.open();
    }
}
