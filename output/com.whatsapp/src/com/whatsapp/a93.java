// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.telephony.PhoneStateListener;

class a93 extends PhoneStateListener
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[3];
        String s = "-4\u0014*Fr/\u000f%W8|\u0014\"E53\u0014/";
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
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '{';
                        break;
                    }
                    case 3: {
                        c2 = 'D';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "-4\u0014*Fr/\u000f%W8|\t-M:5\u0015#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "-4\u0014*Fr/\u000f%W8|\u0012 O8";
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
    
    a93(final App a) {
        this.a = a;
    }
    
    public void onCallStateChanged(final int n, final String s) {
        final boolean i = App.I;
        Label_0060: {
            switch (n) {
                case 1: {
                    Log.i(a93.z[1]);
                    up.q();
                    if (i) {
                        break Label_0060;
                    }
                    break;
                }
                case 2: {
                    Log.i(a93.z[0]);
                    if (i) {
                        break Label_0060;
                    }
                    break;
                }
                case 0: {
                    Log.i(a93.z[2]);
                }
            }
        }
    }
}
