// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.view.Surface;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import java.io.IOException;
import android.os.SystemClock;
import android.media.MediaCodec$CryptoException;
import android.media.MediaCodec$CryptoInfo;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import java.util.Map;
import android.media.MediaCodec$BufferInfo;
import java.util.List;
import android.os.Handler;
import android.annotation.TargetApi;

class p implements Runnable
{
    final /* synthetic */ MediaCodecTrackRenderer$DecoderInitializationException a;
    final /* synthetic */ MediaCodecTrackRenderer b;
    
    p(final MediaCodecTrackRenderer b, final MediaCodecTrackRenderer$DecoderInitializationException a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.j.a(this.a);
    }
}
