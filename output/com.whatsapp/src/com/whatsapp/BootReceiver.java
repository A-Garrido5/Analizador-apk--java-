// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Process;
import android.net.ConnectivityManager;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class BootReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001b\u00032\u0004b\u001a\u00030\u0000.\u001c\u00188";
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
                        c2 = 'B';
                        break;
                    }
                    case 0: {
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = 'l';
                        break;
                    }
                    case 2: {
                        c2 = ']';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
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
                    s = "\u001a\u00033\u001e'\u001a\u00184\u0006+\r\u0015";
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
        Log.i(BootReceiver.z[0]);
        if (App.aq != null) {
            App.c((Context)App.aq, 0);
            App.a((Context)App.aq, !((ConnectivityManager)App.aq.getSystemService(BootReceiver.z[1])).getBackgroundDataSetting());
        }
        if (App.c((Context)App.aq) != 3) {
            Process.killProcess(Process.myPid());
        }
    }
}
