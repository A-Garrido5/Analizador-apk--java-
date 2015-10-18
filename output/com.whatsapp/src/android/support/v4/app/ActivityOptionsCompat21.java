// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.app.Activity;
import android.app.ActivityOptions;

class ActivityOptionsCompat21
{
    private final ActivityOptions mActivityOptions;
    
    private ActivityOptionsCompat21(final ActivityOptions mActivityOptions) {
        this.mActivityOptions = mActivityOptions;
    }
    
    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(final Activity activity, final View view, final String s) {
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
    }
    
    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(final Activity activity, final View[] array, final String[] array2) {
        final int a = NotificationCompatBase$Action.a;
        Pair[] array3 = null;
        if (array != null) {
            final Pair[] array4 = new Pair[array.length];
            int i = 0;
            while (i < array4.length) {
                array4[i] = Pair.create((Object)array[i], (Object)array2[i]);
                ++i;
                if (a != 0) {
                    break;
                }
            }
            array3 = array4;
        }
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, array3));
    }
    
    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }
}
