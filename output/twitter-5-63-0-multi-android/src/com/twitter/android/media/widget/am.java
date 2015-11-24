// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Handler;

class am implements Runnable
{
    final /* synthetic */ al a;
    
    am(final al a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Handler handler = this.a.c.getHandler();
        if (handler != null && this.a.c.i()) {
            handler.postDelayed((Runnable)this, 100L);
        }
    }
}
