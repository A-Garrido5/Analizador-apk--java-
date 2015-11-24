// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import java.util.Random;

final class al
{
    private static final Random a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\n)\u0010}c\u000e.^fc\u0004!\u0010o#\n)\u0010}c\u000e.\\";
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
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "H%\u001az`\u0001;\u0016uc\u0006,\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\n)\u0010}c\u000e.^fc\u0004!\u0010o#\n)\u0010}c\u000e.";
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
        a = new Random();
    }
    
    public static void a(final int n) {
        final int n2 = 1000 * (1 << n);
        final int n3 = n2 / 2 + al.a.nextInt(n2);
        try {
            Log.i(al.z[0] + n3 + al.z[1]);
            Thread.sleep(n3);
        }
        catch (InterruptedException ex) {
            Log.b(al.z[2], ex);
        }
    }
}
