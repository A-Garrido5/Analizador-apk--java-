// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class lk implements View$OnClickListener
{
    private static final String[] z;
    final EULA a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u00013R/[Sh\t(_\u001eiQ7I\u001d4G/XG$I2\u0007\u0005\"A>DF";
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
                        c2 = '(';
                        break;
                    }
                    case 0: {
                        c2 = 'i';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '_';
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
                    s = "\b)B-G\u0000#\b6F\u001d\"H+\u0006\b$R6G\u0007ip\u0016m>";
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
    
    lk(final EULA a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(lk.z[1], Uri.parse(lk.z[0])));
    }
}
