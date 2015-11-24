// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

public enum AVMediaPlayer$PlayerState
{
    a("ERROR", 0), 
    b("IDLE", 1), 
    c("PREPARING", 2), 
    d("PREPARED", 3), 
    e("PLAYING", 4), 
    f("PAUSED", 5), 
    g("PLAYBACK_COMPLETED", 6);
    
    private AVMediaPlayer$PlayerState(final String s, final int n) {
    }
}
