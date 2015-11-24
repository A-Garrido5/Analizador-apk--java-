// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VoiceService$4 extends BroadcastReceiver
{
    private static final String z;
    final VoiceService a;
    
    static {
        final char[] charArray = "\u0010\bc\u000f4\u0018\u0002)\u00145\u0005\u0003i\tu\u0010\u0005s\u00144\u001fHT>\t4#I\"\u00147 ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '[';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = 'f';
                    break;
                }
                case 2: {
                    c2 = '\u0007';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    VoiceService$4(final VoiceService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals(VoiceService$4.z)) {
            this.a.f();
        }
    }
}
