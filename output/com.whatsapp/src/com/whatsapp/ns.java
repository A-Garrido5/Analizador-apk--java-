// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.ArrayList;
import android.widget.EditText;
import android.view.View;
import android.view.View$OnClickListener;

class ns implements View$OnClickListener
{
    private static final String[] z;
    final Advanced a;
    
    static {
        final String[] z2 = new String[2];
        String s = "b;[+ae!X/ e:E";
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
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '6';
                        break;
                    }
                    case 3: {
                        c2 = '[';
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
                    s = "F=\u0018,)g:E:1v`X>5";
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
    
    ns(final Advanced a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        App.F(ns.z[0]);
        final String string = ((EditText)this.a.findViewById(2131755228)).getText().toString();
        ArrayList list = null;
        Label_0116: {
            if (string != null && string.length() > 0 && string.contains("-")) {
                list = App.S.b();
                if (!i) {
                    break Label_0116;
                }
            }
            if (string != null && string.length() > 0) {
                list = App.S.b(string + ns.z[1]);
                if (!i) {
                    break Label_0116;
                }
            }
            list = App.S.i();
        }
        if (list != null && list.size() > 0) {
            for (final a_9 a_9 : list) {
                if (i) {
                    break;
                }
            }
        }
    }
}
