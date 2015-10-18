// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.content.Intent;
import java.util.HashSet;
import android.os.Message;
import android.os.Handler;
import android.content.Context;
import android.os.Handler$Callback;
import java.util.HashMap;
import java.util.Iterator;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public class z implements ServiceConnection
{
    final /* synthetic */ y a;
    
    public z(final y a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this.a.a.d) {
            this.a.g = binder;
            this.a.h = componentName;
            final Iterator<s> iterator = this.a.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceConnected(componentName, binder);
            }
        }
        this.a.e = 1;
    }
    // monitorexit(hashMap)
    
    public void onServiceDisconnected(final ComponentName componentName) {
        synchronized (this.a.a.d) {
            this.a.g = null;
            this.a.h = componentName;
            final Iterator<s> iterator = this.a.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().onServiceDisconnected(componentName);
            }
        }
        this.a.e = 2;
    }
    // monitorexit(hashMap)
}
