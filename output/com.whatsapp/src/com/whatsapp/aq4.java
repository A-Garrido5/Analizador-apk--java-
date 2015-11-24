// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.provider.ContactsContract$Contacts;
import android.view.View;
import android.view.View$OnClickListener;

class aq4 implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[3];
        String s = "[\u001b_R7[\u0000B\b\"@\u0000";
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
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\\u0001\\VvY\u0010UT3K\u0007\u0011C8\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\\\u0001\\VvY\u0010UT3K\u0007\u0011D3_\u001d_";
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
    
    aq4(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(aq4.z[2]);
        Advanced.a(ContactsContract$Contacts.CONTENT_URI, aq4.z[0]);
        App.F(aq4.z[1]);
    }
}
