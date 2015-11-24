// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import de.greenrobot.event.m;
import android.os.PowerManager;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class ScreenLockReceiver extends BroadcastReceiver
{
    private static final String[] z;
    private boolean a;
    
    static {
        final String[] z2 = new String[8];
        String s = "(gh7\u007f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9f{ b1l1;c,mq&#9kk;b6&L\u0011_\u001dMQ\rB\u001eN";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "9f{ b1l1;c,mq&#9kk;b6&L\u0011_\u001dMQ\rB\u0016";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000bkm7h6Dp1f\nm|7d.mm)a7kt7ie";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "9f{ b1l1;c,mq&#9kk;b6&L\u0011_\u001dMQ\rB\u001eN";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "9xo}~;zz7cwgy4";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "9xo}~;zz7cwgq";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "9f{ b1l1;c,mq&#9kk;b6&L\u0011_\u001dMQ\rB\u0016";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void a(final Context context) {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ScreenLockReceiver.z[1]);
        intentFilter.addAction(ScreenLockReceiver.z[2]);
        context.registerReceiver((BroadcastReceiver)this, intentFilter);
        this.a = !((PowerManager)context.getSystemService(ScreenLockReceiver.z[0])).isScreenOn();
        m.b().c(new a8p(this.a));
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean a = this.a;
        Label_0069: {
            if (intent.getAction().equals(ScreenLockReceiver.z[7])) {
                Log.i(ScreenLockReceiver.z[6]);
                this.a = false;
                if (!App.I) {
                    break Label_0069;
                }
            }
            if (intent.getAction().equals(ScreenLockReceiver.z[4])) {
                Log.i(ScreenLockReceiver.z[5]);
                this.a = true;
            }
        }
        if (this.a != a) {
            m.b().c(new a8p(this.a));
        }
    }
    
    public String toString() {
        return ScreenLockReceiver.z[3] + this.a + '}';
    }
}
