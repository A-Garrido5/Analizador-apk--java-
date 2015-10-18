// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bp implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final int a;
    final VerifySms b;
    
    static {
        final String[] z2 = new String[2];
        String s = "C\u0011M1\rLYL5\u0018";
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
                        c2 = 'k';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'X';
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
                    s = "C\u0011M1\rLYK5\f";
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
    
    bp(final VerifySms b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(this.a);
        VerifySms.j(0);
        VerifySms.k(this.b);
        App.b((Context)this.b, 1);
        VerifySms.d(this.b, bp.z[0]);
        VerifySms.b(this.b, null);
        this.b.g(bp.z[1]);
    }
}
