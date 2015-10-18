// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VoiceService$5 extends BroadcastReceiver
{
    private static final String z;
    final VoiceService a;
    
    static {
        final char[] charArray = "A\u0013#|\r".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'h';
                    break;
                }
                case 0: {
                    c2 = '2';
                    break;
                }
                case 1: {
                    c2 = 'g';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    VoiceService$5(final VoiceService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent.getIntExtra(VoiceService$5.z, 0) > 0) {
            VoiceService.a(this.a, true);
        }
        VoiceService.h(this.a);
        if (VoiceService.c(this.a) != null) {
            VoiceService.c(this.a).b();
        }
    }
}
