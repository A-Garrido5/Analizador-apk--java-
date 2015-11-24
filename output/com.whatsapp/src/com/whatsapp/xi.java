// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.provider.ContactsContract$CommonDataKinds$Phone;
import android.view.View;
import android.view.View$OnClickListener;

class xi implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[3];
        String s = "vO\u000fe\\bR\r{\u00192_\fq";
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
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = '\u0012';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "bR\r{\u0019a\u0014\u0016m\b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "vO\u000fe\\bR\r{\u00192X\u0007r\u0015|";
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
    
    xi(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(xi.z[2]);
        Advanced.a(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, xi.z[1]);
        App.F(xi.z[0]);
    }
}
