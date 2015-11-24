// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.content.Context;
import android.os.Message;
import android.os.Handler$Callback;

class adr implements Handler$Callback
{
    private static final String[] z;
    final SetStatus a;
    
    static {
        final String[] z2 = new String[2];
        String s = ">a,ZK>";
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
                        c2 = '>';
                        break;
                    }
                    case 0: {
                        c2 = 'M';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '.';
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
                    s = "\rfcYV,a>ON=;#KJ";
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
    
    adr(final SetStatus a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        if (message.what == 0) {
            App.a((Context)App.aq, 2131231786, 0);
            App.C(App.au() + adr.z[1]);
            if (!App.I) {
                return true;
            }
        }
        App.q(((Bundle)message.obj).getString(adr.z[0]));
        return true;
    }
}
