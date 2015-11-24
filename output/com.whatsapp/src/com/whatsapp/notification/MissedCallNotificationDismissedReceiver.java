// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver
{
    private static final String z;
    
    static {
        final char[] charArray = "*+\u000f#O#!\u001d<F)-\b9L.!\u001d$C(,S4C4/\u0015#Yg".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '*';
                    break;
                }
                case 0: {
                    c2 = 'G';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = '|';
                    break;
                }
                case 3: {
                    c2 = 'P';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(MissedCallNotificationDismissedReceiver.z);
        w.b().c();
    }
}
