// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.android.vineloops.a;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.android.vineloops.i;
import com.twitter.android.vineloops.VineLoopAggregator;
import com.twitter.android.vineloops.b;

public class ao extends m
{
    b a;
    private final String b;
    private final VineLoopAggregator c;
    private final i d;
    
    public ao(final Context context, final String s) {
        this(s, VineLoopAggregator.a(context), i.a(context, as.a(context)));
    }
    
    ao(final String b, final VineLoopAggregator c, final i d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a() {
        synchronized (this) {
            super.a();
            if (this.a != null && this.b != null) {
                final int a = this.a.a();
                if (a > 0) {
                    this.c.a(this.b, a);
                    this.d.a();
                }
            }
            this.a = null;
        }
    }
    
    @Override
    public void a(final Context context, final VideoPlayerView videoPlayerView) {
        super.a(context, videoPlayerView);
        (this.a = new b(this)).a(videoPlayerView.a);
    }
}
