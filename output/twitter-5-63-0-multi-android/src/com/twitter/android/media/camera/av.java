// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.media.MediaRecorder;
import android.media.MediaRecorder$OnInfoListener;

class av implements MediaRecorder$OnInfoListener
{
    final /* synthetic */ au a;
    
    av(final au a) {
        this.a = a;
    }
    
    public void onInfo(final MediaRecorder mediaRecorder, final int n, final int n2) {
        if (n == 800) {
            this.a.a();
        }
    }
}
