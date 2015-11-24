// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnSystemUiVisibilityChangeListener;

class ma implements View$OnSystemUiVisibilityChangeListener
{
    final /* synthetic */ MediaPlayerActivity a;
    
    ma(final MediaPlayerActivity a) {
        this.a = a;
    }
    
    public void onSystemUiVisibilityChange(final int n) {
        if (n == 0) {
            this.a.a.d();
        }
    }
}
