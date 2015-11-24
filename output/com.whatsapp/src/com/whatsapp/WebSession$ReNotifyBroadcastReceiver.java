// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

public class WebSession$ReNotifyBroadcastReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "U\fv\u0019aN\u0010^\u0013RY\u001eE%`Z\rR\u0004m";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
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
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "R\u0010g\u0018uI\u000f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "R\u001a@:`O\fV\u0010`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "_\u0010ZYrT\u001eC\u0004dL\u000f\u0019\u0007`N\u0012^\u0004vU\u0010YYGn0v3F},c";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "_\u0010ZYrT\u001eC\u0004dL\u000f\u0019\u0016i]\rZYRy=h%@r0c>Ce";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void a(final Context context) {
        context.registerReceiver((BroadcastReceiver)this, new IntentFilter(WebSession$ReNotifyBroadcastReceiver.z[4]), WebSession$ReNotifyBroadcastReceiver.z[3], (Handler)null);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean booleanExtra = intent.getBooleanExtra(WebSession$ReNotifyBroadcastReceiver.z[2], true);
        final boolean booleanExtra2 = intent.getBooleanExtra(WebSession$ReNotifyBroadcastReceiver.z[1], true);
        final boolean booleanExtra3 = intent.getBooleanExtra(WebSession$ReNotifyBroadcastReceiver.z[0], false);
        l7.a(false);
        App.b(booleanExtra, false, booleanExtra2, booleanExtra3);
    }
}
