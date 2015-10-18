// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bt implements DialogInterface$OnClickListener
{
    private static final String z;
    final SettingsGoogleDrive a;
    
    static {
        final char[] charArray = "b,5\"n\u007f.2{`u;( b>9$$a~;,{ep**#w1<23u1-$5kx'$2'e&a&bc/.$j1\u000e.9`},a\u0012ux?$vep**#w1&73u1*$:kd% $'9>)3i1=)3'b,5\"n\u007f.2vtp0a\u0001n<\u000f(vh\u007f%8\u007f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0007';
                    break;
                }
                case 0: {
                    c2 = '\u0011';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = 'A';
                    break;
                }
                case 3: {
                    c2 = 'V';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bt(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(bt.z);
        SettingsGoogleDrive.r(this.a).setEnabled(true);
    }
}
