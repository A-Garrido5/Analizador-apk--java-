// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.ContactProvider;
import java.io.File;
import android.content.ContentValues;
import android.view.View;
import android.view.View$OnClickListener;

class zk implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[4];
        String s = "G\u0006Z7e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0007';
                        break;
                    }
                    case 0: {
                        c2 = '0';
                        break;
                    }
                    case 1: {
                        c2 = 'g';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "R\u0006\u00178r@G\u00101t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "@\u0006\u0000;";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "t\u0006\u00002eQ\u0014\u0011 ";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    zk(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.F(zk.z[1]);
        try {
            App.ak.a(false, false, false);
            Conversation.g();
            final ContentValues contentValues = new ContentValues();
            contentValues.put(zk.z[2], new File(new File(App.M, zk.z[3]), zk.z[0]).getAbsolutePath());
            this.a.getContentResolver().insert(ContactProvider.d, contentValues);
        }
        catch (Exception ex) {}
    }
}
