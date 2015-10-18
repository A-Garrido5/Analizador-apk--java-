// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class a4 implements View$OnClickListener
{
    private static final String z;
    final SettingsGoogleDrive a;
    
    static {
        final char[] charArray = "Nv\b:\u0012St\u000fc\u001cYa\u00158\u001e\u0012p\u001d \u0018X\u007fQ,\u001a^x\t>[Z|\u0013)\u0017X3\u0018<\u0012Kv\\=\u001eOe\u0015-\u001e\u001d|\u001e$\u001e^g\\'\b\u001d}\t\"\u0017\u00113\t \u001eEc\u0019-\u000fXwR".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '{';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = '\u0013';
                    break;
                }
                case 2: {
                    c2 = '|';
                    break;
                }
                case 3: {
                    c2 = 'N';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a4(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (SettingsGoogleDrive.u(this.a) != null) {
            SettingsGoogleDrive.u(this.a).ad();
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        Log.e(a4.z);
    }
}
