// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListView;

class mf implements Runnable
{
    final /* synthetic */ ListView a;
    final /* synthetic */ MediaTagFragment b;
    
    mf(final MediaTagFragment b, final ListView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setSelection(0);
    }
}
