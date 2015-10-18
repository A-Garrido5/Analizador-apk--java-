// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.res.Configuration;
import android.content.ComponentCallbacks2;

class o implements ComponentCallbacks2
{
    final /* synthetic */ l a;
    
    o(final l a) {
        this.a = a;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onLowMemory() {
    }
    
    public void onTrimMemory(final int n) {
        if (n == 20) {
            this.a.a();
        }
    }
}
