// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.content.Context;
import com.twitter.library.av.playback.AVPlayer;
import android.view.SurfaceView;
import android.view.Surface;
import android.os.Build$VERSION;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

class al implements SurfaceHolder$Callback
{
    final /* synthetic */ VideoSurfaceView a;
    
    al(final VideoSurfaceView a) {
        this.a = a;
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final Surface surface = surfaceHolder.getSurface();
        if (surface != null && (surface.isValid() || Build$VERSION.SDK_INT > 15)) {
            this.a.c.a(surfaceHolder);
            if (this.a.c.A()) {
                this.a.c.c(false);
                this.a.c.b(false);
            }
        }
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.a.c.a((SurfaceHolder)null);
    }
}
