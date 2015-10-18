// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.media.util.d;

class de implements d
{
    final /* synthetic */ MediaPlayerView a;
    
    de(final MediaPlayerView a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.start();
    }
    
    @Override
    public void b() {
        this.a.pause();
    }
    
    @Override
    public void c() {
        this.a.a();
    }
    
    @Override
    public void d() {
        this.a.b();
    }
}
