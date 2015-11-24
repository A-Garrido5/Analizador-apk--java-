// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.view.View$OnClickListener;

class ax implements Runnable
{
    private static final String z;
    final b0 a;
    final View$OnClickListener b;
    
    static {
        final char[] charArray = "r@gg0oB`>>eWze<.Vvgtl@``8f@<`1nR>w<u@a~0oDgv".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Y';
                    break;
                }
                case 0: {
                    c2 = '\u0001';
                    break;
                }
                case 1: {
                    c2 = '%';
                    break;
                }
                case 2: {
                    c2 = '\u0013';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ax(final b0 a, final View$OnClickListener b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.i(ax.z);
        SettingsGoogleDrive.r(this.a.b).setVisibility(8);
        SettingsGoogleDrive.c(this.a.b).setVisibility(0);
        SettingsGoogleDrive.c(this.a.b).setIndeterminate(false);
        if (this.b != null) {
            SettingsGoogleDrive.l(this.a.b).setVisibility(0);
            SettingsGoogleDrive.l(this.a.b).setOnClickListener(this.b);
        }
        SettingsGoogleDrive.g(this.a.b).setVisibility(0);
    }
}
