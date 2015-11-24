// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class zi implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final DeleteAccount a;
    
    static {
        final String[] z2 = new String[2];
        String s = "!\u001d:L\r)\u0017pW\f4\u00160JL!\u0010*W\r.]\bw'\u0017";
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
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '^';
                        break;
                    }
                    case 3: {
                        c2 = '>';
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
                    s = "(\u0007*N\u0011z\\qS\r\"\u001a2[L4\u00047J\u0016%\u0001p]\r-\\)_=3\u0007?J\u00173";
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
    
    zi(final DeleteAccount a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(109);
        this.a.startActivity(new Intent(zi.z[0], Uri.parse(zi.z[1])));
    }
}
