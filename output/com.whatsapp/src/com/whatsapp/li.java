// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class li implements View$OnClickListener
{
    private static final String[] z;
    final ahh a;
    
    static {
        final String[] z2 = new String[2];
        String s = "*\u001bZZPx@\u0001HO-\b\u0000]K#\u001b]KS2AMENm\u000eJY";
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
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = 'o';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = '*';
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
                    s = "#\u0001JXL+\u000b\u0000CM6\n@^\r#\fZCL,Axcf\u0015";
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
    
    li(final ahh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.c.startActivity(new Intent(li.z[1], Uri.parse(li.z[0])));
    }
}
