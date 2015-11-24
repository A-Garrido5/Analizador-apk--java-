// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Bundle;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class atk extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "S\u001f";
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
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "@\ft %D\b)}3B\u0013rj$XQp`=D\u0012+i7H\u0010";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "S\u001fNf2";
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
    
    atk(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        final Bundle bundle = (Bundle)message.obj;
        if (!al5.a(bundle.getByteArray(atk.z[0]), bundle.getString(atk.z[2]))) {
            Log.e(atk.z[1]);
        }
    }
}
