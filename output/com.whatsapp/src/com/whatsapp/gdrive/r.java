// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.aol;
import com.whatsapp.util.Log;
import android.view.View$OnClickListener;

class r implements Runnable
{
    private static final String z;
    final b0 a;
    final View$OnClickListener b;
    
    static {
        final char[] charArray = "pv\u0007\u001eHmt\u0000GFga\u001a\u001cD,`\u0016\u001e\fnv\u0000\u0019@dv\\\u0019Ild^\b@`x\u0006\u001a\faf\u0007\u001eNm".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '!';
                    break;
                }
                case 0: {
                    c2 = '\u0003';
                    break;
                }
                case 1: {
                    c2 = '\u0013';
                    break;
                }
                case 2: {
                    c2 = 's';
                    break;
                }
                case 3: {
                    c2 = 'j';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    r(final b0 a, final View$OnClickListener b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.i(r.z);
        SettingsGoogleDrive.r(this.a.b).setVisibility(0);
        SettingsGoogleDrive.c(this.a.b).setVisibility(8);
        SettingsGoogleDrive.l(this.a.b).setVisibility(8);
        SettingsGoogleDrive.g(this.a.b).setVisibility(8);
        aol.a(this.b);
        SettingsGoogleDrive.r(this.a.b).setOnClickListener(this.b);
        SettingsGoogleDrive.t(this.a.b);
    }
}
