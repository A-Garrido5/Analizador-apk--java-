// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.c2;

final class ahq implements c2
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "OS_i}IUKjxII\u0011drIXU*tYV\\bh\u0003V_syD";
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
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '\u0007';
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
                    s = "OS_i}IUKjxII\u0011a{EW\u001e";
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
    
    @Override
    public void a(final int n) {
        final boolean i = App.I;
        Log.e(ahq.z[1] + n);
        Label_0152: {
            switch (n) {
                case 400: {
                    Log.w(ahq.z[0]);
                    ChangeNumber.e().sendEmptyMessage(5);
                    al5.p();
                    App.aX();
                    if (i) {
                        break Label_0152;
                    }
                    return;
                }
                case 401: {
                    ChangeNumber.e().sendEmptyMessage(6);
                    al5.p();
                    App.aX();
                    if (i) {
                        break Label_0152;
                    }
                    return;
                }
                case 405: {
                    ChangeNumber.M.run();
                    if (i) {
                        break Label_0152;
                    }
                    return;
                }
                case 409: {
                    if (i) {
                        break;
                    }
                    return;
                }
            }
        }
        if (n < 500) {
            ChangeNumber.e().sendEmptyMessage(6);
            al5.p();
            App.aX();
        }
    }
}
