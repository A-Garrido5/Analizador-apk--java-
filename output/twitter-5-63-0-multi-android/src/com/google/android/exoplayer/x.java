// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaCodecInfo;
import android.annotation.TargetApi;

@TargetApi(21)
final class x implements v
{
    private final MediaCodecInfo[] a;
    
    public x(final boolean b) {
        boolean b2;
        if (b) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.a = new MediaCodecList((int)(b2 ? 1 : 0)).getCodecInfos();
    }
    
    @Override
    public int a() {
        return this.a.length;
    }
    
    @Override
    public MediaCodecInfo a(final int n) {
        return this.a[n];
    }
    
    @Override
    public boolean a(final String s, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return mediaCodecInfo$CodecCapabilities.isFeatureSupported("secure-playback");
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
