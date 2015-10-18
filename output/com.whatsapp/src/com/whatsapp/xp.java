// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class xp implements View$OnClickListener
{
    private static final String[] z;
    final DescribeProblemActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "(@5I- J\u007fR,=K?Ol(M%R-'\u0000\u0007r\u0007\u001e";
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
                        c2 = 'B';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = ';';
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
                    s = "!Z%K1s\u0001~L5>\u0000&S#=]0K2gM>Vm/O \u0014";
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
    
    xp(final DescribeProblemActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(xp.z[0], Uri.parse(xp.z[1])));
    }
}
