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

class ab implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ y c;
    
    ab(final y c, final int a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.d.a(this.a, this.b);
    }
}
