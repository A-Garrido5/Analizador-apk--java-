// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.VideoView;
import android.widget.SeekBar;

class d implements Runnable
{
    final SeekBar a;
    final VideoView b;
    final View c;
    final CameraActivity d;
    
    d(final CameraActivity d, final VideoView b, final SeekBar a, final View c) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (this.b.isPlaying()) {
            this.a.setProgress(this.b.getCurrentPosition());
            this.b.postDelayed((Runnable)this, 50L);
            if (!CameraActivity.m) {
                return;
            }
        }
        CameraActivity.a(this.d, true, this.c);
    }
}
