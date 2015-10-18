// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class c_ implements DialogInterface$OnClickListener
{
    private static final String z;
    final GoogleDriveActivity a;
    
    static {
        final char[] charArray = "\u0005:zHt\u0007siBv\u000b(aU{M3{F/\u0010;{Um\u0010;%Gk\f7{I.B\ta\fD\u000b~}Oc\u0014?aMc\u00002m\u0001c\f:(Tq\u0007,(Eg\u00012aOg\u0006~|N\"\u0010;{Um\u0010;(Lg\u00067i\u0001m\f~kDn\u000e+d@pL".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0002';
                    break;
                }
                case 0: {
                    c2 = 'b';
                    break;
                }
                case 1: {
                    c2 = '^';
                    break;
                }
                case 2: {
                    c2 = '\b';
                    break;
                }
                case 3: {
                    c2 = '!';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c_(final GoogleDriveActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(c_.z);
        this.a.setResult(3);
        this.a.finish();
    }
}
