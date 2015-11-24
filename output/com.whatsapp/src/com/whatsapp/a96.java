// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

class a96 implements SeekBar$OnSeekBarChangeListener
{
    final MediaView a;
    
    private a96(final MediaView a) {
        this.a = a;
    }
    
    a96(final MediaView mediaView, final pz pz) {
        this(mediaView);
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        if (MediaView.q(this.a) != null && MediaView.q(this.a).f()) {
            MediaView.q(this.a).a();
        }
        MediaView.t(this.a).removeMessages(0);
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        final boolean i = App.I;
        if (MediaView.q(this.a) != null) {
            if (MediaView.u(this.a) == 4) {
                MediaView.q(this.a).a(MediaView.q(this.a).e() * (MediaView.b(this.a).f() / MediaView.b(this.a).a()));
                MediaView.q(this.a).h();
                MediaView.t(this.a).sendEmptyMessage(0);
                MediaView.m(this.a).setImageResource(2130838953);
                if (!i) {
                    return;
                }
            }
            MediaView.i(this.a, MediaView.q(this.a).e() * (MediaView.b(this.a).f() / MediaView.b(this.a).a()));
            if (!i) {
                return;
            }
        }
        MediaView.b(this.a).setProgress(0);
    }
}
