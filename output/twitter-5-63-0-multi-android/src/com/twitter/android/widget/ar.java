// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.WindowManager;

class ar implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ WindowManager b;
    final /* synthetic */ ap c;
    
    ar(final ap c, final Runnable a, final WindowManager b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (this.a != null) {
            this.a.run();
        }
        this.c.a(this.b);
    }
}
