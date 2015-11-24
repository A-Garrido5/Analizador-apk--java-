// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class GoogleDriveNotificationManager$5 extends BroadcastReceiver
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "K8@\u0013bIq\\\u0015`E:[\u0019uX5]\u00149A=\\\u001bsI.\u001d\u000fgI.\u001f\u001eqO5V\u001fp\u0001(]WfI/F\u0015fIq]\fq^q^\u0015c\u0001>S\u000e`I.K".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0014';
                    break;
                }
                case 0: {
                    c2 = ',';
                    break;
                }
                case 1: {
                    c2 = '\\';
                    break;
                }
                case 2: {
                    c2 = '2';
                    break;
                }
                case 3: {
                    c2 = 'z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    GoogleDriveNotificationManager$5(final ae a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(GoogleDriveNotificationManager$5.z);
        GoogleDriveService.d();
        ae.b(this.a).unregisterReceiver((BroadcastReceiver)this);
        ae.d(this.a).cancel(8);
    }
}
