// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.util.Log;
import android.hardware.SensorEventListener;

class a implements Runnable
{
    private static final String[] z;
    final PopupNotification a;
    
    static {
        final String[] z2 = new String[3];
        String s = ">m\u001f\u0006\u007f m\u001b\u001ai'a\u000e\u0007f!l@\u0003}!z\u0006\u001ef:{U";
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
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = 'o';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "no\u000e\u000b5";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ">m\u001f\u0006\u007f m\u001b\u001ai'a\u000e\u0007f!l@\u001d`nr\u001d\u001cw'o\u0006\u0007vnq\n\u001d|!p";
                    n2 = 2;
                    array = z2;
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
    
    a(final PopupNotification a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (PopupNotification.b(this.a) != null) {
            PopupNotification.g(this.a).unregisterListener(PopupNotification.b(this.a));
        }
        PopupNotification.a(this.a, null);
        if (PopupNotification.e(this.a) != null) {
            Log.i(com.whatsapp.notification.a.z[0] + PopupNotification.a(this.a) + com.whatsapp.notification.a.z[1] + PopupNotification.e(this.a).getMaximumRange());
            if (PopupNotification.a(this.a) < 5.0f && PopupNotification.a(this.a) != PopupNotification.e(this.a).getMaximumRange()) {
                return;
            }
            PopupNotification.q(this.a);
            if (!PopupNotification.A) {
                return;
            }
        }
        Log.i(com.whatsapp.notification.a.z[2]);
        PopupNotification.q(this.a);
    }
}
