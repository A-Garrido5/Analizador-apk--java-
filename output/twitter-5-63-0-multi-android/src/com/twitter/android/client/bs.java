// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.view.View;

class bs implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ TwitterListFragment b;
    
    bs(final TwitterListFragment b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.sendAccessibilityEvent(8);
    }
}
