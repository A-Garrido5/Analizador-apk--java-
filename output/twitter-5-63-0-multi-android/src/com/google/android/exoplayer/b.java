// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaExtractor;
import android.annotation.TargetApi;
import android.media.MediaCodec$CryptoInfo;

public class b
{
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    private final MediaCodec$CryptoInfo g;
    
    public b() {
        MediaCodec$CryptoInfo b;
        if (ai.a >= 16) {
            b = this.b();
        }
        else {
            b = null;
        }
        this.g = b;
    }
    
    @TargetApi(16)
    private MediaCodec$CryptoInfo b() {
        return new MediaCodec$CryptoInfo();
    }
    
    @TargetApi(16)
    public MediaCodec$CryptoInfo a() {
        return this.g;
    }
    
    @TargetApi(16)
    public void a(final MediaExtractor mediaExtractor) {
        mediaExtractor.getSampleCryptoInfo(this.g);
        this.f = this.g.numSubSamples;
        this.d = this.g.numBytesOfClearData;
        this.e = this.g.numBytesOfEncryptedData;
        this.b = this.g.key;
        this.a = this.g.iv;
        this.c = this.g.mode;
    }
}
