// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class as6 implements SeekBar$OnSeekBarChangeListener
{
    final ConversationRowAudio a;
    boolean b;
    
    as6(final ConversationRowAudio a) {
        this.a = a;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        this.b = false;
        if (up.a(this.a.m) && up.k()) {
            ConversationRowAudio.c(this.a).e();
            this.b = true;
        }
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        if (up.a(this.a.m) && !up.k() && this.b) {
            this.b = false;
            ConversationRowAudio.c(this.a).b(ConversationRowAudio.d(this.a).f());
            ConversationRowAudio.c(this.a).c();
        }
        ConversationRowAudio.c().put(this.a.m.a, ConversationRowAudio.d(this.a).f());
    }
}
