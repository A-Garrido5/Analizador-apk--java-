// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler;

class tr extends Handler
{
    private static final String[] z;
    final DeleteAccountConfirmation a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001aLIqq\u001bHFwq\u001dFKrl\fD\n`l\u0013LJaqQL]dl\fLA";
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
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
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
                    s = "\u001aLIqq\u001bHFwq\u001dFKrl\fD\npl\u001fEJs(\u001aLIqq\u001b\u0004Cul\u0012LA";
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
    
    tr(final DeleteAccountConfirmation a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            case 0: {
                Log.i(tr.z[0]);
                if (DeleteAccountConfirmation.h() != this.a) {
                    break;
                }
                this.a.removeDialog(1);
                if (App.c((Context)App.aq) != 0) {
                    Log.w(tr.z[1]);
                    this.a.showDialog(3);
                    return;
                }
                break;
            }
        }
    }
}
