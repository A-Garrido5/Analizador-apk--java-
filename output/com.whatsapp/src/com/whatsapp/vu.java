// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class vu extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "-l\u0014c}5r\u0007cj)p\u00055";
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
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = 'L';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
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
                    s = "-l\u0014c}5r\u0007c|9r";
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
    
    vu(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            case 0: {
                if (App.aQ()) {
                    Log.i(vu.z[0]);
                    this.removeMessages(0);
                    this.sendEmptyMessageDelayed(0, 15000L);
                    if (!App.I) {
                        break;
                    }
                }
                Log.i(vu.z[1]);
                this.removeMessages(0);
                PerformSyncManager.b((Context)App.aq);
            }
        }
    }
}
