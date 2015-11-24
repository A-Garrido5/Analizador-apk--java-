// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class au implements DialogInterface$OnClickListener
{
    private static final String z;
    final a6 a;
    
    static {
        final char[] charArray = "Y^2\u001eKD\\5GENI/\u001cG\u0005Y'\tI_Kk\u0004G^L)\u0018I\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\"';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = 'F';
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
    
    au(final a6 a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final String text = this.a.a.getResources().getStringArray(2131689484)[n];
        Log.i(au.z + text);
        SettingsGoogleDrive.e(this.a.a).setText((CharSequence)text);
        GoogleDriveService.d(n);
        GoogleDriveService.i();
        dialogInterface.dismiss();
    }
}
