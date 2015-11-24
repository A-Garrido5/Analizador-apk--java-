// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class arr implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final SettingsHelp a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\t\u00170fs\u0001\u001dz}r\u001c\u001c:`2\t\u001a }s\u0006W\u0002]Y?";
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
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
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
                    s = "\u0000\r doRV{ys\n\u00108q2\u001c\u000e=`h\r\u000bzws\u0005V#uC\u001b\r5`i\u001b";
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
    
    arr(final SettingsHelp a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(123);
        this.a.startActivity(new Intent(arr.z[0], Uri.parse(arr.z[1])));
    }
}
