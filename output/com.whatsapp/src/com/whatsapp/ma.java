// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ma implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final VerifyNumber a;
    
    static {
        final String[] z2 = new String[2];
        String s = "9#\b/}1)B4|,(\u0002)<9.\u00184}6c:\u0014W\u000f";
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
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = ']';
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
                    s = "09\u0018-abbC0}:$\u00008<,:\u0005)f=?B>}5b\u001b<M+9\r)g+";
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
    
    ma(final VerifyNumber a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(109);
        this.a.startActivity(new Intent(ma.z[0], Uri.parse(ma.z[1])));
    }
}
