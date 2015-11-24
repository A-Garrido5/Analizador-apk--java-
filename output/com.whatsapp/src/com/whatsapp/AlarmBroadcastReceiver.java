// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.SystemClock;
import android.content.Intent;
import android.content.Context;
import android.support.v4.content.WakefulBroadcastReceiver;

public class AlarmBroadcastReceiver extends WakefulBroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0005\u007f\\FKN,\\Nx[>U^CS:\u0004";
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
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '_';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '*';
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
                    s = "\u007f3XXG|-VKN]>J^x[<\\C\\[-\u0019NCM/X^IV6WM\nJ0\u0019kF_-TyOL)PIO\u0005\u007fPD^[1M\u0017";
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
    
    public void onReceive(final Context context, final Intent intent) {
        final Intent setClass = new Intent(intent).setClass(context, (Class)AlarmService.class);
        Log.i(AlarmBroadcastReceiver.z[1] + intent + AlarmBroadcastReceiver.z[0] + SystemClock.elapsedRealtime());
        WakefulBroadcastReceiver.startWakefulService(context, setClass);
    }
}
