// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.net.wifi.WifiManager;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class aj implements View$OnClickListener
{
    private static final String[] z;
    final CaptivePortalActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "ZB?tPRNlb[XBlgSZB#";
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
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
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
                    s = "IB*|";
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
    
    aj(final CaptivePortalActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(aj.z[0]);
        ((WifiManager)this.a.getSystemService(aj.z[1])).setWifiEnabled(false);
        this.a.finish();
    }
}
