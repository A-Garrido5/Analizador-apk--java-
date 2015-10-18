// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class oj implements View$OnClickListener
{
    private static final String[] z;
    final QuickContactActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = ";OoI\nr";
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
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
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
                    n2 = 1;
                    array = z2;
                    s = " VhM\u0016r\r3J\r)Vo\\\u00158\f\u007fR\bgFp\u0012";
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
    
    oj(final QuickContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.a(this.a, Uri.parse(oj.z[0] + QuickContactActivity.c(this.a).e.a()), this.a.getString(2131231849, new Object[] { oj.z[1] }));
        QuickContactActivity.a(this.a, false);
    }
}
