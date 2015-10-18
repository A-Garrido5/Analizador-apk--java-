// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View$OnClickListener;

class iv implements View$OnClickListener
{
    private static final String[] z;
    final ViewSharedContactActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "sg\u0014Op!<ORbk`NXltt\fZ-x|\r\u0010nzc\u0013\u0000r&";
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
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = '`';
                        break;
                    }
                    case 3: {
                        c2 = '?';
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
                    s = "z}\u0004MlrwNVmov\u000eK-zp\u0014Vlu=6vFL";
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
    
    iv(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (ViewSharedContactActivity.c(this.a)) {
            ViewSharedContactActivity.a(this.a, view);
            if (!App.I) {
                return;
            }
        }
        this.a.startActivity(new Intent(iv.z[1], Uri.parse(iv.z[0] + ((m)view.getTag()).e)));
    }
}
