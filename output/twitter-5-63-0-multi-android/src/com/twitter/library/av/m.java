// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.graphics.SurfaceTexture;

public class m
{
    SurfaceTexture a;
    n b;
    
    public SurfaceTexture a(final n b) {
        final SurfaceTexture a = this.a;
        SurfaceTexture a2 = null;
        if (a != null) {
            final n b2 = this.b;
            a2 = null;
            if (b2 != null) {
                if (b != this.b) {
                    this.b.j();
                }
                a2 = this.a;
            }
        }
        if (a2 != null) {
            this.b = b;
        }
        return a2;
    }
    
    public void a() {
        if (this.a != null) {
            this.b.j();
            this.a.release();
            this.a = null;
        }
        this.b = null;
    }
    
    public void a(final SurfaceTexture a, final n b) {
        if (this.a != null && a != this.a) {
            this.a();
        }
        this.a = a;
        this.b = b;
    }
    
    public boolean a(final SurfaceTexture surfaceTexture) {
        final SurfaceTexture a = this.a;
        boolean b = false;
        if (a != null) {
            final SurfaceTexture a2 = this.a;
            b = false;
            if (a2 == surfaceTexture) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean b() {
        return this.a != null;
    }
}
