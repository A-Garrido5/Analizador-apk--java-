// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.VelocityTracker;

class VelocityTrackerCompat$BaseVelocityTrackerVersionImpl implements VelocityTrackerCompat$VelocityTrackerVersionImpl
{
    @Override
    public float getXVelocity(final VelocityTracker velocityTracker, final int n) {
        return velocityTracker.getXVelocity();
    }
    
    @Override
    public float getYVelocity(final VelocityTracker velocityTracker, final int n) {
        return velocityTracker.getYVelocity();
    }
}
