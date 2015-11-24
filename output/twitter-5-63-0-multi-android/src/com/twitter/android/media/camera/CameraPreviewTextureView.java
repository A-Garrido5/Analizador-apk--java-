// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.graphics.SurfaceTexture;
import android.graphics.Matrix;
import android.content.Context;
import android.hardware.Camera$Size;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;

public class CameraPreviewTextureView extends TextureView implements TextureView$SurfaceTextureListener
{
    private final m a;
    private Camera$Size b;
    
    public CameraPreviewTextureView(final Context context, final m a) {
        super(context);
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        this.a = a;
    }
    
    private void b() {
        float n = 1.0f;
        Camera$Size b = this.a.a();
        if (b == null) {
            b = this.b;
            if (b == null) {
                return;
            }
        }
        else {
            this.b = b;
        }
        final int d = this.a.d(z.a(this.getContext()));
        float n2;
        float n3;
        if (d == 0 || d == 180) {
            n2 = b.width;
            n3 = b.height;
        }
        else {
            n2 = b.height;
            n3 = b.width;
        }
        final float n4 = this.getWidth();
        final float n5 = this.getHeight();
        final float n6 = n2 / n4;
        final float n7 = n3 / n5;
        float n10;
        if (n6 >= n7) {
            final float n8 = n6 / n7;
            final float n9 = n;
            n = n8;
            n10 = n9;
        }
        else {
            n10 = n7 / n6;
        }
        final Matrix transform = new Matrix();
        transform.setScale(n, n10, n4 / 2.0f, n5 / 2.0f);
        this.setTransform(transform);
    }
    
    public void a() {
        this.b();
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.a.c(Math.min(n, n2));
        this.a.a(surfaceTexture);
        this.b();
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.a.b(surfaceTexture);
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.b();
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
}
