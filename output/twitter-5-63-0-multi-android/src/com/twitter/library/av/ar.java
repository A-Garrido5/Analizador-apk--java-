// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.util.bq;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public class ar
{
    public aq a(final Context context, final AVPlayer avPlayer) {
        return new am(context, avPlayer);
    }
    
    public aq a(final Context context, final AVPlayer avPlayer, final n n) {
        if (bq.a()) {
            return this.b(context, avPlayer, n);
        }
        return this.a(context, avPlayer);
    }
    
    public aq b(final Context context, final AVPlayer avPlayer, final n n) {
        return new an(context, avPlayer, n);
    }
}
