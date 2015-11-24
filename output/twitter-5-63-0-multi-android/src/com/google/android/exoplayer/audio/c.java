// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer.audio;

import android.media.AudioTrack;
import android.media.AudioTimestamp;
import android.annotation.TargetApi;

@TargetApi(19)
final class c implements b
{
    private final AudioTimestamp a;
    
    public c() {
        this.a = new AudioTimestamp();
    }
    
    @Override
    public long a() {
        return this.a.nanoTime;
    }
    
    @Override
    public boolean a(final AudioTrack audioTrack) {
        return audioTrack.getTimestamp(this.a);
    }
    
    @Override
    public long b() {
        return this.a.framePosition;
    }
}
