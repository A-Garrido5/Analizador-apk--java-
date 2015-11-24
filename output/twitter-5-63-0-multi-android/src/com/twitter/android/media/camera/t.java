// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.media.MediaRecorder;

final class t implements Runnable
{
    final /* synthetic */ MediaRecorder a;
    
    t(final MediaRecorder a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.release();
    }
}
