// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

public enum ForegroundMetricTracker$BackgroundBehavior
{
    a("DESTROY_ON_ENTER_BACKGROUND", 0), 
    b("STOP_ON_ENTER_BACKGROUND", 1), 
    c("PAUSE_ON_ENTER_BACKGROND", 2);
    
    private ForegroundMetricTracker$BackgroundBehavior(final String s, final int n) {
    }
}
