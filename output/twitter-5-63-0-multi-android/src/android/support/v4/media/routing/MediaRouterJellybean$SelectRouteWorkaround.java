// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media.routing;

import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.media.MediaRouter$RouteInfo;
import android.media.MediaRouter;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class MediaRouterJellybean$SelectRouteWorkaround
{
    private Method mSelectRouteIntMethod;
    
    public MediaRouterJellybean$SelectRouteWorkaround() {
        if (Build$VERSION.SDK_INT < 16 || Build$VERSION.SDK_INT > 17) {
            throw new UnsupportedOperationException();
        }
        try {
            this.mSelectRouteIntMethod = MediaRouter.class.getMethod("selectRouteInt", Integer.TYPE, MediaRouter$RouteInfo.class);
        }
        catch (NoSuchMethodException ex) {}
    }
    
    public void selectRoute(final Object o, final int n, final Object o2) {
        final MediaRouter mediaRouter = (MediaRouter)o;
        final MediaRouter$RouteInfo mediaRouter$RouteInfo = (MediaRouter$RouteInfo)o2;
        if ((0x800000 & mediaRouter$RouteInfo.getSupportedTypes()) == 0x0) {
            if (this.mSelectRouteIntMethod != null) {
                try {
                    this.mSelectRouteIntMethod.invoke(mediaRouter, n, mediaRouter$RouteInfo);
                    return;
                }
                catch (IllegalAccessException ex) {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", (Throwable)ex);
                }
                catch (InvocationTargetException ex2) {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", (Throwable)ex2);
                    goto Label_0079;
                }
            }
            Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
            goto Label_0079;
        }
        goto Label_0079;
    }
}
