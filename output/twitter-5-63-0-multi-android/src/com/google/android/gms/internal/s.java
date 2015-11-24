// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class s implements ServiceConnection
{
    final /* synthetic */ o a;
    
    public s(final o a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.a.b(binder);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.a.a.sendMessage(this.a.a.obtainMessage(4, (Object)1));
    }
}
