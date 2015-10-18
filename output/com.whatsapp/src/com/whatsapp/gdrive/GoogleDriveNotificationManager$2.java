// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class GoogleDriveNotificationManager$2 extends BroadcastReceiver
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "!2g\u0019;#{{\u001f9/0|\u0013,2?z\u001e`+7{\u0011*#$:\u0005>#$8\u0014(%?q\u0015)k\"z]/'5~\u0005=k9c\u0015?k2t\u0004,k5z\u001e##5a\u0019\"(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'M';
                    break;
                }
                case 0: {
                    c2 = 'F';
                    break;
                }
                case 1: {
                    c2 = 'V';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
                    break;
                }
                case 3: {
                    c2 = 'p';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    GoogleDriveNotificationManager$2(final ae a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(GoogleDriveNotificationManager$2.z);
        GoogleDriveService.l();
        GoogleDriveService.c();
        ae.b(this.a).unregisterReceiver((BroadcastReceiver)this);
        ae.d(this.a).cancel(8);
    }
}
