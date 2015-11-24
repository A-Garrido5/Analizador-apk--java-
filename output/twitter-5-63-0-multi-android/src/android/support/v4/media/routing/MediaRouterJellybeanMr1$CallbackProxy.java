// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.routing;

import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;

class MediaRouterJellybeanMr1$CallbackProxy extends MediaRouterJellybean$CallbackProxy
{
    public MediaRouterJellybeanMr1$CallbackProxy(final MediaRouterJellybeanMr1$Callback mediaRouterJellybeanMr1$Callback) {
        super(mediaRouterJellybeanMr1$Callback);
    }
    
    public void onRoutePresentationDisplayChanged(final MediaRouter mediaRouter, final MediaRouter$RouteInfo mediaRouter$RouteInfo) {
        ((MediaRouterJellybeanMr1$Callback)this.mCallback).onRoutePresentationDisplayChanged(mediaRouter$RouteInfo);
    }
}
