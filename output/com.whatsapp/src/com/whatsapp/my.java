// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class my extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "7c|:j6n:+`+r{+{6";
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
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = 'E';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
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
                    s = "\"tu=\u007fe+::j#t\u007f;geeu&{$en;";
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
    
    my(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        Label_0041: {
            if (message.what == 0) {
                App.F(my.z[1]);
                if (!App.I) {
                    break Label_0041;
                }
            }
            App.S.g();
            App.ab.c();
            App.F(my.z[0]);
        }
        App.H();
    }
}
