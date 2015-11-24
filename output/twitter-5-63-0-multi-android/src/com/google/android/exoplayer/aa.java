// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.media.MediaCodec;
import android.os.Handler;
import android.annotation.TargetApi;
import android.view.Surface;

class aa implements Runnable
{
    final /* synthetic */ Surface a;
    final /* synthetic */ y b;
    
    aa(final y b, final Surface a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.d.a(this.a);
    }
}
