// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.view.View;
import android.app.ActivityOptions;

class ActivityOptionsCompatJB
{
    private final ActivityOptions mActivityOptions;
    
    private ActivityOptionsCompatJB(final ActivityOptions mActivityOptions) {
        this.mActivityOptions = mActivityOptions;
    }
    
    public static ActivityOptionsCompatJB makeScaleUpAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4));
    }
    
    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }
}
