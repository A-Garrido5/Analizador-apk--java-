// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.provider.ContactsContract$Data;
import android.view.View;
import android.view.View$OnClickListener;

class tc implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0016|BM;\u0016h[\\;\u0010lHTu";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016|BM;\u0016h[\\;\u0017gK";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0016h[\\5\u0006q[";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    tc(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(tc.z[0]);
        Advanced.a(ContactsContract$Data.CONTENT_URI, tc.z[2]);
        App.F(tc.z[1]);
    }
}
