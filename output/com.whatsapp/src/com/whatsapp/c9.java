// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import android.media.RingtoneManager;
import android.os.Message;
import android.os.Handler$Callback;

class c9 implements Handler$Callback
{
    private static final String z;
    final VoiceService a;
    
    static {
        final char[] charArray = "xCTS\u007f~IOJ?jE^B<[\\YB$kd\\M4bIO\u0003'k\f\\Q5.BRWpgB\u001dB>.M^W9xI\u001d@1b@".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'P';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = ',';
                    break;
                }
                case 2: {
                    c2 = '=';
                    break;
                }
                case 3: {
                    c2 = '#';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c9(final VoiceService a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        aol.a();
        final Voip$CallInfo callInfo = Voip.getCallInfo();
        Label_0168: {
            if (callInfo != null) {
                int n;
                if (callInfo.getCallState() == Voip$CallState.ACTIVE) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final long callDuration = callInfo.getCallDuration();
                if (n != 0) {
                    Voip.checkStreamStatistics();
                    App.a(callInfo.getPeerId(), callDuration);
                }
                if (callInfo.getCallState() == Voip$CallState.RECEIVED_CALL && VoiceService.j(this.a) != null && !VoiceService.j(this.a).isPlaying()) {
                    VoiceService.j(this.a).stop();
                    VoiceService.a(this.a, RingtoneManager.getRingtone((Context)this.a, VoiceService.s(this.a)));
                    if (VoiceService.j(this.a) != null) {
                        VoiceService.j(this.a).play();
                    }
                }
                if (VoiceService.c(this.a) != null) {
                    VoiceService.c(this.a).a(callInfo);
                }
                if (!App.I) {
                    break Label_0168;
                }
            }
            Log.e(c9.z);
        }
        VoiceService.d(this.a).sendEmptyMessageDelayed(0, 1000L);
        return true;
    }
}
