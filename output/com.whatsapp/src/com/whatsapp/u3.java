// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.audiofx.Visualizer;
import android.media.audiofx.Visualizer$OnDataCaptureListener;

class u3 implements Visualizer$OnDataCaptureListener
{
    final up a;
    
    u3(final up a) {
        this.a = a;
    }
    
    public void onFftDataCapture(final Visualizer visualizer, final byte[] array, final int n) {
    }
    
    public void onWaveFormDataCapture(final Visualizer visualizer, final byte[] array, final int n) {
        if (up.b(this.a) != null) {
            up.b(this.a).a(array);
        }
    }
}
