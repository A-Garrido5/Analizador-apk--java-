// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.content.Context;

public class ar
{
    private PlaybackMode a;
    private final p b;
    private Context c;
    private au d;
    private boolean e;
    
    public ar(final p b) {
        this.a = PlaybackMode.a;
        this.e = true;
        this.b = b;
    }
    
    public AVPlayer a() {
        if (this.d == null || this.c == null) {
            throw new IllegalArgumentException("Obtaining an AVPlayer for playback requires  a delegate, event handler and context");
        }
        final AVPlayer a = this.b.a(this.d, this.c.getApplicationContext());
        a.c(this.e);
        a.b(this.a);
        return a;
    }
    
    public ar a(final Context c) {
        this.c = c;
        return this;
    }
    
    public ar a(final PlaybackMode a) {
        this.a = a;
        return this;
    }
    
    public ar a(final au d) {
        this.d = d;
        return this;
    }
    
    public ar a(final boolean e) {
        this.e = e;
        return this;
    }
}
