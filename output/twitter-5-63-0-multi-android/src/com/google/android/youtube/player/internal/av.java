// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.IBinder;

public final class av extends g
{
    final /* synthetic */ aq a;
    
    protected av(final aq a) {
        this.a = a;
    }
    
    public final void a(final String s, final IBinder binder) {
        this.a.a.sendMessage(this.a.a.obtainMessage(1, (Object)new au(this.a, s, binder)));
    }
}
