// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

class p implements Runnable
{
    final /* synthetic */ SegmentedVideoFile a;
    final /* synthetic */ o b;
    
    p(final o b, final SegmentedVideoFile a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.e();
    }
}
