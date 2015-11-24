// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler;

class as8 extends Handler
{
    private static final String[] z;
    final ChangeNumber a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u000b\u001aT\u001b:\r\u001c@\u0018?\r\u0000\u001a\u0010/\u001a\u001dG";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ']';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = 'u';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000b\u001aT\u001b:\r\u001c@\u0018?\r\u0000\u001a\u00165\r\u0011^X3\u001d\u001fW\u0010/G\u001f\\\u00060\t\u0006V\u001d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000b\u001aT\u001b:\r\u001c@\u0018?\r\u0000\u001a\u00014\u0005\u0017Z\u0000)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u000b\u001aT\u001b:\r\u001c@\u0018?\r\u0000\u001a\u00165\r\u0011^X3\u001d\u001fW\u0010/G\u001fT\u0001>\u0000";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    as8(final ChangeNumber a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0172: {
            switch (message.what) {
                case 1: {
                    Log.w(as8.z[3]);
                    ChangeNumber.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    if (!ChangeNumber.b().equals(EnterPhoneNumber.z)) {
                        this.a.showDialog(2);
                        if (!i) {
                            break;
                        }
                    }
                    ChangeNumber.b(this.a);
                    if (i) {
                        break Label_0172;
                    }
                    break;
                }
                case 2: {
                    Log.w(as8.z[1]);
                    ChangeNumber.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    this.a.a(2131231002);
                    if (i) {
                        break Label_0172;
                    }
                    break;
                }
                case 3: {
                    Log.e(as8.z[0]);
                    this.a.removeDialog(1);
                    this.a.showDialog(109);
                    if (i) {
                        break Label_0172;
                    }
                    break;
                }
                case 4: {
                    Log.e(as8.z[2]);
                    ChangeNumber.a(this.a).removeMessages(4);
                    this.a.removeDialog(1);
                    this.a.showDialog(109);
                }
            }
        }
    }
}
