// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.telephony.PhoneStateListener;

class ata extends PhoneStateListener
{
    final VoiceService a;
    
    ata(final VoiceService a) {
        this.a = a;
    }
    
    public void onCallStateChanged(final int n, final String s) {
        VoiceService.m(this.a).removeMessages(6);
        if (n != 0) {
            VoiceService.m(this.a).sendEmptyMessage(6);
            if (!App.I) {
                return;
            }
        }
        VoiceService.m(this.a).sendEmptyMessageDelayed(6, 1000L);
    }
}
