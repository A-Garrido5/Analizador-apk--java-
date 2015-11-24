// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class App$30 extends BroadcastReceiver
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[2];
        String s = "ra \u0004Mrr;L]|d>O\u0002wp$J\u0000v\u007f1ICvup";
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
                        c2 = '/';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = '\u0011';
                        break;
                    }
                    case 2: {
                        c2 = 'P';
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
                    n2 = 1;
                    array = z2;
                    s = "p~=\u0005H|~7GJ=a\"DLvb#\u0005Hra X";
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
    
    App$30(final App a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean backgroundDataSetting = App.Q.getBackgroundDataSetting();
        Log.i(App$30.z[0] + backgroundDataSetting);
        if (!backgroundDataSetting) {
            App.a(context, true);
            App.f(context);
        }
        App.B(App$30.z[1]);
    }
}
