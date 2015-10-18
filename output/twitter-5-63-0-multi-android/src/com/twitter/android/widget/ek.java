// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class ek implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ ProgressReportingVideoView a;
    
    ek(final ProgressReportingVideoView a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        return true;
    }
}
