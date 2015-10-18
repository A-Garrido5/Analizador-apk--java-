// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.FragmentActivity;
import android.content.Context;

class rb implements Runnable
{
    final /* synthetic */ SearchFragment a;
    
    rb(final SearchFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            this.a.a((Context)activity);
        }
    }
}
