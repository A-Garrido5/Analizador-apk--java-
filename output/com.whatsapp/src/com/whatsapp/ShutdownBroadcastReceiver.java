// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Environment;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

final class ShutdownBroadcastReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "NO_$cFE\u0015?b[DU\"\"NBO?cA\u000fz\u0015Xfnu\t_gto\u0012Cxo";
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
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
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
                    s = "NQKy\u007fGTO2cXO\u00143t[DI8mC~V3hF@\u0014%xNU^y";
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
    
    public void a(final Context context) {
        context.registerReceiver((BroadcastReceiver)this, new IntentFilter(ShutdownBroadcastReceiver.z[0]));
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(ShutdownBroadcastReceiver.z[1] + Environment.getExternalStorageState());
        App.c(context, 0);
        App.a(context, false);
    }
}
