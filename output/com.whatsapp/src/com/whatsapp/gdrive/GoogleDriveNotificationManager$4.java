// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class GoogleDriveNotificationManager$4 extends BroadcastReceiver
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "j\\pmKh\u0015lkId^kg\\yQmj\u0010`YleZhJ-qNhJ/`XnQfaY Lm)OhKvkOh\u0015mrX\u007f\u0015feIl\u0015akSc]apTbV".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '=';
                    break;
                }
                case 0: {
                    c2 = '\r';
                    break;
                }
                case 1: {
                    c2 = '8';
                    break;
                }
                case 2: {
                    c2 = '\u0002';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    GoogleDriveNotificationManager$4(final ae a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(GoogleDriveNotificationManager$4.z);
        GoogleDriveService.a(1);
        GoogleDriveService.M();
        GoogleDriveService.c();
        ae.b(this.a).unregisterReceiver((BroadcastReceiver)this);
        ae.d(this.a).cancel(8);
    }
}
