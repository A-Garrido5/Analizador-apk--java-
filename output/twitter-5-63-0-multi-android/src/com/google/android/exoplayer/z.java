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
import android.view.Surface;
import android.annotation.TargetApi;

class z implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ y d;
    
    z(final y d, final int a, final int b, final float c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.d.d.a(this.a, this.b, this.c);
    }
}
