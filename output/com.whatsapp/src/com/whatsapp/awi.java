// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Handler$Callback;

class awi implements Handler$Callback
{
    private static final String z;
    final VoiceService a;
    
    static {
        final char[] charArray = "`X\u001f\b.eR\u0004\u000ehuRY\u000buyG%\u001dmp\u007f\u0017\u0016ezR\u0004XrbX\u0006+dzQV\u0016na".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0001';
                    break;
                }
                case 0: {
                    c2 = '\u0016';
                    break;
                }
                case 1: {
                    c2 = '7';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = 'x';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    awi(final VoiceService a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                if (!Voip.d()) {
                    if (VoiceService.I().get() > 0) {
                        VoiceService.q(this.a);
                        if (!App.I) {
                            return true;
                        }
                    }
                    Log.i(awi.z);
                    this.a.stopSelf();
                }
                return true;
            }
        }
    }
}
