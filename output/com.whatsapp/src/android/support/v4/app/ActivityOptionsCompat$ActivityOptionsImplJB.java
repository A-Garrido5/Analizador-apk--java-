// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;

class ActivityOptionsCompat$ActivityOptionsImplJB extends ActivityOptionsCompat
{
    private final ActivityOptionsCompatJB mImpl;
    
    ActivityOptionsCompat$ActivityOptionsImplJB(final ActivityOptionsCompatJB mImpl) {
        this.mImpl = mImpl;
    }
    
    @Override
    public Bundle toBundle() {
        return this.mImpl.toBundle();
    }
}
