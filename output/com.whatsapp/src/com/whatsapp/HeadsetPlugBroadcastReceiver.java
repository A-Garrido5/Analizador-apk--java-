// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

final class HeadsetPlugBroadcastReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "]\u007fiF^Uu#]_Htc@\u001f]ry]^R?EqpxBH`nl]Xs";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Oel@T";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "]a}\u001bYYpiGTH>";
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
    
    public void a(final Context context) {
        context.registerReceiver((BroadcastReceiver)this, new IntentFilter(HeadsetPlugBroadcastReceiver.z[0]));
    }
    
    public void onReceive(final Context context, final Intent intent) {
        int l = 1;
        final int intExtra = intent.getIntExtra(HeadsetPlugBroadcastReceiver.z[l], 0);
        if (App.L && intExtra < l) {
            up.q();
        }
        if (intExtra < l) {
            l = 0;
        }
        App.L = (l != 0);
        Log.i(HeadsetPlugBroadcastReceiver.z[2] + intExtra);
    }
}
