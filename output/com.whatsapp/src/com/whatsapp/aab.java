// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class aab implements Runnable
{
    private static final String z;
    final VoiceService a;
    
    static {
        final char[] charArray = "[C!sDNM$o(L\\<v\u0019H\u0003;w\n_Xhe\nD@".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = '-';
                    break;
                }
                case 1: {
                    c2 = ',';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '\u0003';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aab(final VoiceService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (Voip.startCallRecording(VoiceService.i(this.a))) {
            return;
        }
        Log.e(aab.z);
    }
}
