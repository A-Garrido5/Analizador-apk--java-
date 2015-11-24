// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class GoogleDriveNotificationManager$3 extends BroadcastReceiver
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "uh=$(w!!\"*{j&.?fe #s\u007fm!,9w~`8-w~b);qe+(:?x `,w\u007f;\",w! ;;`!#\")?n.9*w~6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = '\u0012';
                    break;
                }
                case 1: {
                    c2 = '\f';
                    break;
                }
                case 2: {
                    c2 = 'O';
                    break;
                }
                case 3: {
                    c2 = 'M';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    GoogleDriveNotificationManager$3(final ae a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(GoogleDriveNotificationManager$3.z);
        GoogleDriveService.aa();
        ae.b(this.a).unregisterReceiver((BroadcastReceiver)this);
        ae.d(this.a).cancel(8);
    }
}
