// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fo implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final UserFeedbackActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0013[\u0011\u001b\u0002\u001bQ[\u0000\u0003\u0006P\u001b\u001dC\u0013V\u0001\u0000\u0002\u001c\u001b# (%";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
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
                    s = "\u001aA\u0001\u0019\u001eH\u001aZ\u0004\u0002\u0010\\\u0019\fC\u0006B\u001c\u001d\u0019\u0017G[\n\u0002\u001f\u001a\u0002\b2\u0001A\u0014\u001d\u0018\u0001";
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
    
    fo(final UserFeedbackActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(123);
        this.a.startActivity(new Intent(fo.z[0], Uri.parse(fo.z[1])));
    }
}
