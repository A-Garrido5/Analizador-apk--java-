// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.ConditionVariable;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.Log;
import android.content.Context;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class a6o extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00140\u0012\rl\u00126\u0006\u000ei\u0012*\\\u0007b\u00164\u001c\u0004$\u00049\u001e\u0006";
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
                        c2 = '\u000b';
                        break;
                    }
                    case 0: {
                        c2 = 'w';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00140\u0012\rl\u00126\u0006\u000ei\u0012*\\\u0007b\u00164\u001c\u0004$\u0004-\u0010\u0000n\u0004+";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u00140\u0012\rl\u00126\u0006\u000ei\u0012*\\\u0007b\u00164\u001c\u0004$\u00119\u001a\u000f";
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
    
    a6o(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        final long a = ChangeNumber.a((Context)App.aq);
        Label_0114: {
            switch (message.what) {
                case 5: {
                    Log.w(a6o.z[0]);
                    App.a(App.aj(), App.aq.getString(2131230887));
                    ChangeNumber.b((Context)App.aq);
                    if (i) {
                        break Label_0114;
                    }
                    break;
                }
                case 6: {
                    Log.e(a6o.z[2]);
                    App.a(App.aj(), App.aq.getString(2131230882));
                    ade.a(a, ade.c, true);
                    ChangeNumber.b((Context)App.aq);
                    if (i) {
                        break Label_0114;
                    }
                    break;
                }
                case 7: {
                    Log.i(a6o.z[1]);
                    App.a(App.aj(), App.aq.getString(2131230888, new Object[] { ChangeNumber.h(), VerifyNumber.b(App.aX.cc, App.aX.number) }));
                    if (GoogleDriveService.am()) {
                        final ConditionVariable conditionVariable = new ConditionVariable(false);
                        final x5 x5 = new x5(this, conditionVariable);
                        App.aq.bindService(new Intent((Context)App.aq, (Class)GoogleDriveService.class), (ServiceConnection)x5, 1);
                        bm.a(new mk(this, conditionVariable, (ServiceConnection)x5));
                        return;
                    }
                    break;
                }
            }
        }
    }
}
