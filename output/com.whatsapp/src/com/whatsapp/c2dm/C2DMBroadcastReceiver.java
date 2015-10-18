// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.c2dm;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class C2DMBroadcastReceiver extends BroadcastReceiver
{
    private static final String z;
    
    static {
        final char[] charArray = "6T*t\u001a:T 6\u0018{Z)>\u000f:R#t\u001eg_*t\u0014;O\"4\t{i\u0002\u00198\u001cm\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '}';
                    break;
                }
                case 0: {
                    c2 = 'U';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = 'G';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        Label_0030: {
            if (intent.getAction().equals(C2DMBroadcastReceiver.z)) {
                b.a(context, intent, true);
                if (C2DMRegistrar.c == 0) {
                    break Label_0030;
                }
            }
            C2DMRegistrar.a(context, intent);
        }
        this.setResultCode(-1);
    }
}
