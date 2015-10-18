// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import com.whatsapp.VideoView;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;

class e implements SeekBar$OnSeekBarChangeListener
{
    final CameraActivity a;
    final TextView b;
    final VideoView c;
    
    e(final CameraActivity a, final VideoView c, final TextView b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            this.c.seekTo(n);
        }
        this.b.setText((CharSequence)DateUtils.formatElapsedTime((long)(n / 1000)));
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        this.c.seekTo(seekBar.getProgress());
    }
}
