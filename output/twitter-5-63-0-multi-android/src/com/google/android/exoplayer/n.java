// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer.audio.AudioTrack;
import android.annotation.TargetApi;
import com.google.android.exoplayer.audio.AudioTrack$InitializationException;

class n implements Runnable
{
    final /* synthetic */ AudioTrack$InitializationException a;
    final /* synthetic */ m b;
    
    n(final m b, final AudioTrack$InitializationException a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.c.a(this.a);
    }
}
