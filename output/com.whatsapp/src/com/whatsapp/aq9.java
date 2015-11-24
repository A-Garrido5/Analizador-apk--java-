// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.net.NetworkInfo;
import com.whatsapp.util.Log;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class aq9 implements View$OnClickListener
{
    private static final String[] z;
    final EULA a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\r[2LW\u000bK2A\r\u0004O,\u0000\u0016\rZ)B\n\u0003\u000e0X\u0014\u0004";
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
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = '-';
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
                    s = "\r[2LW\u000bK2A\r\u0004O,\u0000\u0016\rZ)B\n\u0003\u000e+C\u0013\u0006A)C";
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
    
    aq9(final EULA a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final int networkType = App.h.getNetworkType();
        final NetworkInfo activeNetworkInfo = App.Q.getActiveNetworkInfo();
        boolean b;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            b = true;
        }
        else {
            b = false;
        }
        App.aq.aQ.b((Context)this.a);
        if (App.h == null) {
            Log.e(aq9.z[0]);
            this.a.showDialog(2);
            if (!i) {
                return;
            }
        }
        if (networkType == 0 && !b) {
            Log.e(aq9.z[1]);
            this.a.showDialog(2);
            if (!i) {
                return;
            }
        }
        if (App.h.getDeviceId() == null) {
            this.a.showDialog(3);
            if (!i) {
                return;
            }
        }
        EULA.a(this.a);
    }
}
