// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;
import java.util.EnumSet;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class App$31 extends BroadcastReceiver
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[4];
        String s = "!`VA";
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
                        c2 = '/';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = '\t';
                        break;
                    }
                    case 2: {
                        c2 = '3';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1fAUJ\u0002y_YN3";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "4{ZBF4h_sY2gG";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "#hTE";
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
    
    App$31(final App a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final Serializable serializableExtra = intent.getSerializableExtra(App$31.z[0]);
        f8 crash;
        if (serializableExtra instanceof f8) {
            crash = (f8)serializableExtra;
        }
        else {
            crash = f8.CRASH;
        }
        final Serializable serializableExtra2 = intent.getSerializableExtra(App$31.z[3]);
        EnumSet set;
        if (serializableExtra2 instanceof EnumSet) {
            set = (EnumSet)serializableExtra2;
        }
        else {
            set = null;
        }
        App.a(intent.getStringExtra(App$31.z[2]), intent.getBooleanExtra(App$31.z[1], false), crash, set);
    }
}
