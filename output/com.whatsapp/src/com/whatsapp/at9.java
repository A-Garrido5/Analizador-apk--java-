// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class at9 implements View$OnClickListener
{
    private static final String[] z;
    final IncorrectAppReleaseVersionActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000eGavC\u0006M+mB\u001bLkp\u0002\u000eJqmC\u0001\u0007AA`*}@";
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
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = 'o';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
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
                    s = "\u001fHfoM\bL?gC\u0002\u0007rlM\u001bZdt\\";
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
    
    at9(final IncorrectAppReleaseVersionActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(at9.z[0], Uri.parse(at9.z[1])));
    }
}
