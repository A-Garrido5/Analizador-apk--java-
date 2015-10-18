// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Matrix;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.twitter.library.av.playback.AVPlayer;
import android.annotation.TargetApi;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;

@TargetApi(16)
public class VideoTextureView extends TextureView implements TextureView$SurfaceTextureListener, ad
{
    protected int a;
    protected int b;
    final AVPlayer c;
    final m d;
    Surface e;
    SurfaceTexture f;
    final n g;
    
    public VideoTextureView(final Context context, final AVPlayer c, final n g) {
        super(context);
        this.c = c;
        this.d = c.B();
        this.g = g;
        this.c();
    }
    
    private void b() {
        float n = 1.00001f;
        final int a = this.a;
        final int b = this.b;
        if (a == 0 || b == 0) {
            return;
        }
        final float n2 = this.getWidth();
        final float n3 = this.getHeight();
        final float n4 = a / n2;
        final float n5 = b / n3;
        float n6;
        if (n4 >= n5) {
            n6 = n4 / n5;
        }
        else {
            final float n7 = n5 / n4;
            n6 = n;
            n = n7;
        }
        final Matrix transform = new Matrix();
        this.getTransform(transform);
        transform.setScale(n6, n, n2 / 2.0f, n3 / 2.0f);
        this.setTransform(transform);
    }
    
    private void c() {
        this.a = 0;
        this.b = 0;
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
    }
    
    public void a() {
        if (this.d.b() && this.getSurfaceTexture() == null) {
            final SurfaceTexture a = this.d.a(this.g);
            this.setSurfaceTexture(a);
            this.f = a;
            this.e = this.c.n();
        }
    }
    
    public void a(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (this.a != 0 && this.b != 0) {
            this.requestLayout();
        }
        this.b();
    }
    
    public int getVideoHeight() {
        return this.b;
    }
    
    public int getVideoWidth() {
        return this.a;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a();
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)VideoTextureView.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)VideoTextureView.class.getName());
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture f, final int n, final int n2) {
        this.d.a(f, this.g);
        this.f = f;
        this.e = new Surface(f);
        this.c.a(this.e);
        if (this.c.A()) {
            this.c.c(false);
            this.c.b(false);
        }
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        if (!this.d.a(surfaceTexture)) {
            surfaceTexture.release();
            if (this.c.n() != this.e) {
                this.e.release();
            }
        }
        return false;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.b();
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture f) {
        if ((!this.c.r() || this.c.u()) && this.f != f) {
            if (this.e != null) {
                this.e.release();
            }
            this.f = f;
            this.e = new Surface(f);
            this.c.a(this.e);
        }
    }
}
