// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.content.Context;

public class u extends p
{
    @Override
    protected void a(final AVPlayer avPlayer, final boolean b) {
        avPlayer.a(true, b);
    }
    
    @Override
    protected AVPlayer b(final au au, final Context context) {
        return new AVPlayer(this, au, context);
    }
}
