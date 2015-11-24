// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.net.wifi.WifiManager;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class ay implements View$OnClickListener
{
    private static final String[] z;
    final int a;
    final String b;
    final CaptivePortalActivity c;
    
    static {
        final String[] z2 = new String[9];
        String s = "?}\u0013nm=<\u000em(=u\tag7r\u001fa|yz\bmeyk\u0013dayr\u001fv\u007f6n\u0011\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = 'z';
                        break;
                    }
                    case 3: {
                        c2 = '\u0002';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?s\bem-h\u0013loyk\u0013dayr\u001fv\u007f6n\u0011\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "yr\u001bom=<";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "yr\u001bom=<";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ".u\u001ck";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "*}\fg(:s\u0014da>i\bc|0s\u0014\"n8u\u0016glyz\u0015p(.u\u001ck(7y\u000eug+wZ";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "yr\u001bom=<";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "yr\u001bom=<";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "+y\u0017m~<<\u0014g|.s\bi(?}\u0013nm=<\u001cmzyk\u0013dayr\u001fv\u007f6n\u0011\"";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ay(final CaptivePortalActivity c, final int a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        Log.i(ay.z[1] + this.a + ay.z[7] + this.b);
        final WifiManager wifiManager = (WifiManager)this.c.getSystemService(ay.z[4]);
        Label_0171: {
            if (!wifiManager.removeNetwork(this.a)) {
                Log.w(ay.z[8] + this.a + ay.z[3] + this.b);
                if (!e.a) {
                    break Label_0171;
                }
            }
            if (!wifiManager.saveConfiguration()) {
                Log.w(ay.z[5] + this.a + ay.z[2] + this.b);
            }
        }
        if (!wifiManager.disconnect()) {
            Log.w(ay.z[0] + this.a + ay.z[6] + this.b);
        }
        this.c.finish();
    }
}
