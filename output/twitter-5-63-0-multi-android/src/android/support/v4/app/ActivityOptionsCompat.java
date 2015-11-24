// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.graphics.Bitmap;
import android.support.v4.util.Pair;
import android.app.Activity;
import android.view.View;
import android.os.Build$VERSION;
import android.content.Context;

public class ActivityOptionsCompat
{
    public static ActivityOptionsCompat makeCustomAnimation(final Context context, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB.makeCustomAnimation(context, n, n2));
        }
        return new ActivityOptionsCompat();
    }
    
    public static ActivityOptionsCompat makeScaleUpAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB.makeScaleUpAnimation(view, n, n2, n3, n4));
        }
        return new ActivityOptionsCompat();
    }
    
    public static ActivityOptionsCompat makeSceneTransitionAnimation(final Activity activity, final View view, final String s) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, view, s));
        }
        return new ActivityOptionsCompat();
    }
    
    public static ActivityOptionsCompat makeSceneTransitionAnimation(final Activity activity, final Pair... array) {
        if (Build$VERSION.SDK_INT >= 21) {
            String[] array4;
            View[] array5;
            if (array != null) {
                final View[] array2 = new View[array.length];
                final String[] array3 = new String[array.length];
                for (int i = 0; i < array.length; ++i) {
                    array2[i] = (View)array[i].first;
                    array3[i] = (String)array[i].second;
                }
                array4 = array3;
                array5 = array2;
            }
            else {
                array4 = null;
                array5 = null;
            }
            return new ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, array5, array4));
        }
        return new ActivityOptionsCompat();
    }
    
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(final View view, final Bitmap bitmap, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(view, bitmap, n, n2));
        }
        return new ActivityOptionsCompat();
    }
    
    public Bundle toBundle() {
        return null;
    }
    
    public void update(final ActivityOptionsCompat activityOptionsCompat) {
    }
}
