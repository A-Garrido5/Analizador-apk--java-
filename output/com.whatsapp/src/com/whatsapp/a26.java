// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

class a26 implements SurfaceHolder$Callback
{
    final VideoView a;
    
    a26(final VideoView a) {
        this.a = a;
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        int n4 = 1;
        VideoView.b(this.a, n2);
        VideoView.d(this.a, n3);
        int n5;
        if (VideoView.j(this.a) == 3) {
            n5 = n4;
        }
        else {
            n5 = 0;
        }
        if (VideoView.d(this.a) != n2 || VideoView.g(this.a) != n3) {
            n4 = 0;
        }
        if (VideoView.f(this.a) != null && n5 != 0 && n4 != 0) {
            if (VideoView.e(this.a) != 0) {
                this.a.seekTo(VideoView.e(this.a));
            }
            this.a.start();
        }
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, surfaceHolder);
        VideoView.c(this.a);
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, null);
        VideoView.c(this.a, true);
    }
}
