// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.os.Bundle;
import android.app.Activity;

final class b implements j
{
    final /* synthetic */ YouTubeBaseActivity a;
    
    private b(final YouTubeBaseActivity a) {
        this.a = a;
    }
    
    @Override
    public final void a(final YouTubePlayerView youTubePlayerView) {
        if (this.a.b != null && this.a.b != youTubePlayerView) {
            this.a.b.b(true);
        }
        this.a.b = youTubePlayerView;
        if (this.a.c > 0) {
            youTubePlayerView.a();
        }
        if (this.a.c >= 2) {
            youTubePlayerView.b();
        }
    }
}
