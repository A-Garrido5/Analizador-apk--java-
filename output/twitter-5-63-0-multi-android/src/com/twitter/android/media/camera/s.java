// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.hardware.Camera;

final class s implements Runnable
{
    final /* synthetic */ Camera a;
    
    s(final Camera a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.release();
    }
}
