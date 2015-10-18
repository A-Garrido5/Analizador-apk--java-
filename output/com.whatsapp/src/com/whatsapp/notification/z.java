// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.App;
import android.os.PowerManager;
import android.app.KeyguardManager;
import android.content.Context;

final class z implements Runnable
{
    private static final String[] z;
    private final int a;
    private final Context b;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0019-4?K";
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
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = 'i';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0002':=L\b0'";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004'0)X\u000e'-5M\u0000$*9X\u001d+,4\u0016\u0019-3/I\u0007-73_\u0000!\".P\u0006,l8X\n)$(V\u001c,'";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0004'0)X\u000e'-5M\u0000$*9X\u001d+,4\u0016\u0019-3/I\u0007-73_\u0000!\".P\u0006,l<V\u001b'$(V\u001c,'";
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
    
    z(final Context b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final KeyguardManager keyguardManager = (KeyguardManager)this.b.getSystemService(com.whatsapp.notification.z.z[1]);
        final PowerManager powerManager = (PowerManager)this.b.getSystemService(com.whatsapp.notification.z.z[0]);
        if (!App.I() || keyguardManager.inKeyguardRestrictedInputMode() || !powerManager.isScreenOn()) {
            Log.i(com.whatsapp.notification.z.z[2]);
            Intent intent;
            if ((keyguardManager.inKeyguardRestrictedInputMode() || !powerManager.isScreenOn()) && (this.a == 2 || this.a == 3)) {
                if (PopupNotification.s != null && !(PopupNotification.s instanceof PopupNotificationLocked)) {
                    PopupNotification.s.finish();
                    PopupNotification.s = null;
                }
                intent = new Intent(this.b, (Class)PopupNotificationLocked.class);
            }
            else if (!App.I() && this.a != 3) {
                if (PopupNotification.s != null && PopupNotification.s instanceof PopupNotificationLocked) {
                    PopupNotification.s.finish();
                    PopupNotification.s = null;
                }
                intent = new Intent(this.b, (Class)PopupNotification.class);
            }
            else {
                intent = null;
            }
            if (intent != null) {
                intent.setFlags(268697600);
                this.b.startActivity(intent);
            }
            if (PopupNotification.s != null) {
                PopupNotification.s.e();
            }
            if (!PopupNotification.A) {
                return;
            }
        }
        if (PopupNotification.s != null && PopupNotification.s.c()) {
            Log.i(com.whatsapp.notification.z.z[3]);
            PopupNotification.s.e();
        }
    }
}
