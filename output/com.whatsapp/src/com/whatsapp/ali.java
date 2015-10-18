// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.az;
import com.whatsapp.messaging.by;
import com.whatsapp.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

final class ali implements ServiceConnection
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "<%\fA%\u0016%,W6\u0007)\u001cWk\u0004.\u001d]1\u001f$";
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
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '2';
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
                    s = "<%\fA%\u0016%,W6\u0007)\u001cWk\u0013/\n\\ ";
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
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        Log.i(ali.z[1]);
        App.g(false);
        App.a(((by)binder).a());
        App.Y().a(App.aX.jabber_id, App.F, App.aq);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        Log.i(ali.z[0]);
        App.g(false);
        App.a((MessageService)null);
    }
}
