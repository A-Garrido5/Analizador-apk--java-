// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class App$32 extends BroadcastReceiver
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[2];
        String s = ">>e%t6 r~m2+z\u007fpp+mzm-+q";
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
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = '\n';
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
                    s = ">>e%t6 r~m2+z\u007fpp+mzm-+q%w4'e";
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
    
    App$32(final App a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(App$32.z[0]);
        if (App.Y() == null) {
            Log.i(App$32.z[1]);
            if (!App.I) {
                return;
            }
        }
        App.Y().i();
    }
}
