// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class g4 implements SeekBar$OnSeekBarChangeListener
{
    final VideoPreviewActivity a;
    
    g4(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            VideoPreviewActivity.c(this.a).seekTo(n);
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        if (!VideoPreviewActivity.c(this.a).isPlaying()) {
            VideoPreviewActivity.b(this.a).a(seekBar.getProgress());
        }
        VideoPreviewActivity.c(this.a).seekTo(seekBar.getProgress());
        VideoPreviewActivity.a(this.a, false);
    }
}
