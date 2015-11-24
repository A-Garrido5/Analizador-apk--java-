// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class a_w implements View$OnClickListener
{
    private static final String[] z;
    final CorruptInstallationActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "i2vtOpi+0Na'evFwlm{\u0017g<i1]l2plKt#";
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
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
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
                    s = "e=`mEm7*vDp6jk\u0004e0pvEj}RVoS";
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
    
    a_w(final CorruptInstallationActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(a_w.z[1], Uri.parse(a_w.z[0])));
    }
}
