// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.app.NotificationManager;

class aa implements Runnable
{
    final /* synthetic */ NotificationManager a;
    final /* synthetic */ String b;
    final /* synthetic */ x c;
    
    aa(final x c, final NotificationManager a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.cancel(this.b, 1004);
    }
}
