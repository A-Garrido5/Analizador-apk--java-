// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.media.RemoteControlClient$OnPlaybackPositionUpdateListener;
import android.media.RemoteControlClient$OnGetPlaybackPositionListener;

class TransportMediatorJellybeanMR2 implements RemoteControlClient$OnGetPlaybackPositionListener, RemoteControlClient$OnPlaybackPositionUpdateListener
{
    final TransportMediatorCallback mTransportCallback;
    
    public long onGetPlaybackPosition() {
        return this.mTransportCallback.getPlaybackPosition();
    }
    
    public void onPlaybackPositionUpdate(final long n) {
        this.mTransportCallback.playbackPositionUpdate(n);
    }
}
