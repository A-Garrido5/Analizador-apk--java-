// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Bundle;
import android.os.Message;
import android.os.Handler$Callback;

class di implements Handler$Callback
{
    private static final String[] z;
    final GroupChatInfo a;
    
    static {
        final String[] z2 = new String[3];
        String s = "ac?";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = '\u000b';
                        break;
                    }
                    case 1: {
                        c2 = '\n';
                        break;
                    }
                    case 2: {
                        c2 = '[';
                        break;
                    }
                    case 3: {
                        c2 = '[';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "lx4.3Ti3:7Tc5=,$m>/\u001cx~:/6xU=:*go?{)bnf~0+i4?&6/?";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "x~:/6x";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    di(final GroupChatInfo a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        final Bundle bundle = (Bundle)message.obj;
        if (message.what == 0) {
            Log.a(di.z[1], null, new Object[] { bundle.getString(di.z[0]), message.arg1 });
            if (!App.I) {
                return true;
            }
        }
        App.q(bundle.getString(di.z[2]));
        return true;
    }
}
