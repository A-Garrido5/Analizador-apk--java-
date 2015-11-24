// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.l7;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u001f((Bu\u0018$=_z\u001e)sOz\u0002*5X`Q";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '+';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001f((Bu\u0018$=_z\u001e)\u0003Cr\u0002/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012(1\u0005d\u0019&(Xr\u00017\u0003[a\u0014!9Yv\u001f$9X";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u001f((Bu\u0018$=_z\u001e)\u0003Cr\u0002/";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String stringExtra = intent.getStringExtra(MessageNotificationDismissedReceiver.z[3]);
        App.aq.getSharedPreferences(MessageNotificationDismissedReceiver.z[2], 0).edit().putString(MessageNotificationDismissedReceiver.z[1], stringExtra).commit();
        Log.i(MessageNotificationDismissedReceiver.z[0] + stringExtra);
        l7.v();
    }
}
