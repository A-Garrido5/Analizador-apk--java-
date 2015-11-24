// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.view.KeyEvent;

interface TransportMediatorCallback
{
    long getPlaybackPosition();
    
    void handleKey(final KeyEvent p0);
    
    void playbackPositionUpdate(final long p0);
}
