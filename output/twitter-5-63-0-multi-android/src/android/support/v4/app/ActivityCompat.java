// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import android.app.Activity;
import android.support.v4.content.ContextCompat;

public class ActivityCompat extends ContextCompat
{
    private static ActivityCompat21$SharedElementCallback21 createCallback(final SharedElementCallback sharedElementCallback) {
        ActivityCompat21$SharedElementCallback21 activityCompat21$SharedElementCallback21 = null;
        if (sharedElementCallback != null) {
            activityCompat21$SharedElementCallback21 = new ActivityCompat$SharedElementCallback21Impl(sharedElementCallback);
        }
        return activityCompat21$SharedElementCallback21;
    }
    
    public static void finishAffinity(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 16) {
            ActivityCompatJB.finishAffinity(activity);
            return;
        }
        activity.finish();
    }
    
    public static void finishAfterTransition(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            ActivityCompat21.finishAfterTransition(activity);
            return;
        }
        activity.finish();
    }
    
    public static boolean invalidateOptionsMenu(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 11) {
            ActivityCompatHoneycomb.invalidateOptionsMenu(activity);
            return true;
        }
        return false;
    }
    
    public static void postponeEnterTransition(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            ActivityCompat21.postponeEnterTransition(activity);
        }
    }
    
    public static void setEnterSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        if (Build$VERSION.SDK_INT >= 21) {
            ActivityCompat21.setEnterSharedElementCallback(activity, createCallback(sharedElementCallback));
        }
    }
    
    public static void setExitSharedElementCallback(final Activity activity, final SharedElementCallback sharedElementCallback) {
        if (Build$VERSION.SDK_INT >= 21) {
            ActivityCompat21.setExitSharedElementCallback(activity, createCallback(sharedElementCallback));
        }
    }
    
    public static void startActivity(final Activity activity, final Intent intent, @Nullable final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivity((Context)activity, intent, bundle);
            return;
        }
        activity.startActivity(intent);
    }
    
    public static void startActivityForResult(final Activity activity, final Intent intent, final int n, @Nullable final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivityForResult(activity, intent, n, bundle);
            return;
        }
        activity.startActivityForResult(intent, n);
    }
    
    public static void startPostponedEnterTransition(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            ActivityCompat21.startPostponedEnterTransition(activity);
        }
    }
}
