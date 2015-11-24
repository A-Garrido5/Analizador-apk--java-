// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class aa1 implements SeekBar$OnSeekBarChangeListener
{
    final RecordAudio a;
    
    aa1(final RecordAudio a) {
        this.a = a;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            RecordAudio.m(this.a).setText((CharSequence)DateUtils.formatElapsedTime((long)(n / 1000)));
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (RecordAudio.j(this.a) != null && RecordAudio.j(this.a).f()) {
            RecordAudio.j(this.a).a();
        }
        RecordAudio.i(this.a).removeMessages(0);
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        if (RecordAudio.j(this.a) != null) {
            if (RecordAudio.c(this.a) != 3) {
                return;
            }
            RecordAudio.j(this.a).a(seekBar.getProgress());
            RecordAudio.j(this.a).h();
            RecordAudio.i(this.a).sendEmptyMessage(0);
            RecordAudio.a(this.a).setImageResource(2130838953);
            if (!App.I) {
                return;
            }
        }
        seekBar.setProgress(0);
    }
}
