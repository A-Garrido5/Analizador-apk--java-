// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class w implements v
{
    @Override
    public int a() {
        return MediaCodecList.getCodecCount();
    }
    
    @Override
    public MediaCodecInfo a(final int n) {
        return MediaCodecList.getCodecInfoAt(n);
    }
    
    @Override
    public boolean a(final String s, final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return "video/avc".equals(s);
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
