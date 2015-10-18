// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class xt implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final VerifySms a;
    final int b;
    
    static {
        final String[] z2 = new String[2];
        String s = "PW.e)_\u001f/a<";
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
                        c2 = 'O';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '\f';
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
                    s = "PW.e)_\u001f(a.";
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
    
    xt(final VerifySms a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(this.b);
        VerifySms.j(0);
        VerifySms.k(this.a);
        App.b((Context)this.a, 1);
        VerifySms.d(this.a, xt.z[0]);
        VerifySms.b(this.a, null);
        this.a.g(xt.z[1]);
    }
}
