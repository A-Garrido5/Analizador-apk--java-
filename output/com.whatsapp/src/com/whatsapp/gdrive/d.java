// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class d implements DialogInterface$OnCancelListener
{
    private static final String z;
    final cl a;
    
    static {
        final char[] charArray = "U\u000brPPH\tu\t^B\u001coR\\\t\tvW\u0014S\u0000gRXO\u0002gFUCNsW\\TNbAZJ\u0007hA]\u0006\u001ai\u0004PH\u001drEUJNAKVA\u0002c\u0004iJ\u000f\u007f\u0004jC\u001cpMZC\u001d(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = '&';
                    break;
                }
                case 1: {
                    c2 = 'n';
                    break;
                }
                case 2: {
                    c2 = '\u0006';
                    break;
                }
                case 3: {
                    c2 = '$';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    d(final cl a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        Log.i(d.z);
        SettingsGoogleDrive.a(this.a.a.a).open();
    }
}
