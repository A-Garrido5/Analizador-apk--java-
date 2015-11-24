// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.ConnectivityManager;
import de.greenrobot.event.m;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class ConnectivityReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "?\u00160P=?\r7H1(\u0000";
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
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "=\u0017:L75\u001dpP=(W=Q62W\u001dq\u0016\u0012<\u001dj\u0011\n0\ng\u0007\u001f1\u001fp\u001f\u0019";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "?\u00160P=?\r7H1(\u0000";
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
        context.registerReceiver((BroadcastReceiver)this, new IntentFilter(ConnectivityReceiver.z[1]));
        m.b().c(vp.a(((ConnectivityManager)context.getSystemService(ConnectivityReceiver.z[0])).getActiveNetworkInfo()));
    }
    
    public void onReceive(final Context context, final Intent intent) {
        m.b().c(vp.a(((ConnectivityManager)context.getSystemService(ConnectivityReceiver.z[2])).getActiveNetworkInfo()));
    }
}
