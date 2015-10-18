// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ScrollView;

class fs implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ fr b;
    
    fs(final fr b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        ((ScrollView)this.b.a).smoothScrollTo(0, this.a);
    }
}
