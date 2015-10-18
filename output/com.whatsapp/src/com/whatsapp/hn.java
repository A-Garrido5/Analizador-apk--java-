// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler$Callback;

final class hn implements Handler$Callback
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "^[\u0012mA^S\u0012x";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '*';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "MW\u000b{FKF\n{\u001dLS\u0016dWN\u0012\u0015aV\u0017\u0017\f(QEV\u001a5\u0017N";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "@[\u001b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "MW\u000b{FKF\n{\u001dD]\u001c`SDU\u001a(XCVB-A";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "YF\u001e|GY";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "MW\u000b{FKF\n{\u001dXW\u001cm[\\W\u001b(\u0012@[\u001b5\u0017Y\u0012\f|S^G\f5\u0017Y\u0012\u000ba_OA\u000bi_Z\u000fZl";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "MW\u000b{FKF\n{\u001dNW\u0013mFO\u0012\u0015aV\u0017\u0017\f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public boolean handleMessage(final Message message) {
        final boolean i = App.I;
        final Bundle bundle = (Bundle)message.obj;
        final String string = bundle.getString(hn.z[2]);
        final a_9 d = App.S.d(string);
        if (d != null) {
            Label_0231: {
                switch (message.what) {
                    case 0: {
                        Log.a(hn.z[1], null, new Object[] { string, message.arg1 });
                        if (i) {
                            break Label_0231;
                        }
                        break;
                    }
                    case 1: {
                        d.d = bundle.getString(hn.z[4]);
                        d.s = bundle.getLong(hn.z[0]);
                        Log.c(hn.z[5], null, new Object[] { string, d.d, d.s });
                        App.S.l(d);
                        App.C(string);
                        if (i) {
                            break Label_0231;
                        }
                        break;
                    }
                    case 2: {
                        Log.c(hn.z[3], null, new Object[] { string });
                        if (i) {
                            break Label_0231;
                        }
                        break;
                    }
                    case 3: {
                        Log.c(hn.z[6], null, new Object[] { string });
                        d.d = null;
                        d.s = 0L;
                        App.S.l(d);
                        App.C(string);
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
