// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class wi implements View$OnClickListener
{
    private static final String[] z;
    final AccountInfoActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\b14\u00143Zjo\u0006,\u000f\"n\u0013(\u000113\u00050\u0010k#\u000b-O$$\u0017";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = 'd';
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
                    s = "\u0001+$\u0016/\t!n\r.\u0014 .\u0010n\u0001&4\r/\u000ek\u0016-\u00057";
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
    
    wi(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(wi.z[1], Uri.parse(wi.z[0])));
    }
}
