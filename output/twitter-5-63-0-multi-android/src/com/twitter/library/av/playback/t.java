// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.widget.Toast;
import android.content.Context;

class t implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ AVPlayer c;
    
    t(final AVPlayer c, final Context a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Toast.makeText(this.a, this.b, 0).show();
    }
}
