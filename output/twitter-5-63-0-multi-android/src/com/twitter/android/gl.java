// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Looper;
import com.twitter.util.concurrent.h;

class gl extends h
{
    public gl() {
        super(Looper.getMainLooper(), false);
    }
    
    public void a() {
        this.c.removeCallbacksAndMessages((Object)null);
    }
}
