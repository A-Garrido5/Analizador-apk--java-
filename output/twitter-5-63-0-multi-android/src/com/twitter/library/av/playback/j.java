// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.os.Handler;
import com.twitter.library.av.model.b;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;

public class j
{
    private final int a;
    private final int b;
    
    public j() {
        this(Build$VERSION.SDK_INT);
    }
    
    protected j(final int n) {
        this(n, 10);
    }
    
    protected j(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static boolean a(final int n) {
        return n >= 16 && d.a("video_dropoff_exoplayer_buffering_2825", "exoplayer_1_second_buffering", "exoplayer_2_second_buffering", "exoplayer_5_second_buffering");
    }
    
    public AVMediaPlayer a(final b b, final f f, final Handler handler) {
        return (AVMediaPlayer)new k(this, b, handler, f).a(handler, this.b);
    }
}
