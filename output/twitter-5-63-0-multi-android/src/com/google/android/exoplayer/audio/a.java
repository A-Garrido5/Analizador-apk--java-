// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer.audio;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import android.os.ConditionVariable;
import android.annotation.TargetApi;
import android.media.AudioTrack;

class a extends Thread
{
    final /* synthetic */ AudioTrack a;
    final /* synthetic */ com.google.android.exoplayer.audio.AudioTrack b;
    
    a(final com.google.android.exoplayer.audio.AudioTrack b, final AudioTrack a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            this.a.release();
        }
        finally {
            this.b.a.open();
        }
    }
}
