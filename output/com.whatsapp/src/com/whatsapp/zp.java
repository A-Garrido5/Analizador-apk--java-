// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.c2;

public class zp implements Runnable, c2
{
    private static final String[] z;
    public String a;
    
    static {
        final String[] z2 = new String[2];
        String s = "h\u007fx\u0001$m\u007fu\u0013%jcn\u0002#gbr\u00025vuh\u0010?jc~\b1jtw\u0005\"+ui\u0012?v0";
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
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = '`';
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
                    s = "h\u007fx\u0001$m\u007fu\u0013%jcn\u0002#gbr\u00025vuh\u0010?jc~\b1jtw\u0005\"+cn\u00033ach";
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
    
    zp(final String a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        Log.e(zp.z[0] + n);
    }
    
    @Override
    public void run() {
        Log.i(zp.z[1]);
    }
}
