// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.provider.ContactsContract$RawContacts;
import android.view.View;
import android.view.View$OnClickListener;

class aqt implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[3];
        String s = ">Ir\u001dM(]hM\b4X";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'Z';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">Ir\u001dM(]hM\u000f?[v\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "(]hC\u0019\"H";
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
    
    aqt(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(aqt.z[1]);
        Advanced.a(ContactsContract$RawContacts.CONTENT_URI, aqt.z[2]);
        App.F(aqt.z[0]);
    }
}
