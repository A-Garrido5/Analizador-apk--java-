// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.graphics.drawable.Drawable;
import com.whatsapp.VideoView;
import android.view.View;
import android.view.View$OnClickListener;

class q implements View$OnClickListener
{
    final Runnable a;
    final CameraActivity b;
    final View c;
    final VideoView d;
    
    q(final CameraActivity b, final VideoView d, final View c, final Runnable a) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.d.isPlaying()) {
            this.d.pause();
            CameraActivity.a(this.b, true, this.c);
            if (!CameraActivity.m) {
                return;
            }
        }
        if (view == this.c) {
            CameraActivity.a(this.b, false, this.c);
            this.d.setBackgroundDrawable((Drawable)null);
            this.d.start();
            this.d.postDelayed(this.a, 0L);
        }
    }
}
