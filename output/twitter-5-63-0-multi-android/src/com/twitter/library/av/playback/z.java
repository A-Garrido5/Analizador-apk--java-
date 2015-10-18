// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class z extends ay
{
    private final AVPlayer a;
    
    z(final AVPlayer a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        super.a(session);
        this.a.a(true, true);
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        super.a(session, b);
        this.a.a(true, true);
    }
}
