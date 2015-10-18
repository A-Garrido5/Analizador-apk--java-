// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aq0 implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final SmsDefaultAppWarning a;
    
    static {
        final String[] z2 = new String[2];
        String s = "gYDQLrUBY]uDGBHfZ^[N;FRFL`";
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
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = '5';
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
                    s = "w[Z\u001b^|UCFHdD";
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
    
    aq0(final SmsDefaultAppWarning a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(aq0.z[0]);
        this.a.getPackageManager().clearPackagePreferredActivities(aq0.z[1]);
        this.a.finish();
    }
}
