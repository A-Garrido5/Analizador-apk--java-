// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.app.Activity;
import com.twitter.library.service.y;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;

class bo implements Runnable
{
    final /* synthetic */ bn a;
    
    bo(final bn a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a();
    }
}
