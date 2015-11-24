// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

class e implements Runnable
{
    final /* synthetic */ StoriesViewPager a;
    
    e(final StoriesViewPager a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setScrollState(0);
        this.a.b();
    }
}
