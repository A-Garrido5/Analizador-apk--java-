// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import android.text.format.Formatter;

final class zw implements Runnable
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "`c'\u0004Toz#\u0004Jsz#J_mvzFXez6\u0004XygzJK`z;J_mvx";
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
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '+';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "!g8_\\m.";
                    n2 = 1;
                    array = z2;
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
    
    @Override
    public void run() {
        Log.i(zw.z[0] + Formatter.formatFileSize((Context)App.aq, App.C()) + zw.z[1] + Formatter.formatFileSize((Context)App.aq, App.T()));
    }
}
