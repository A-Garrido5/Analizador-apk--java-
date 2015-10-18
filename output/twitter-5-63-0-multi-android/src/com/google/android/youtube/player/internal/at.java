// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.Intent;
import com.google.android.youtube.player.a;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import com.google.android.youtube.player.YouTubeInitializationResult;
import android.os.Looper;
import android.content.ServiceConnection;
import java.util.ArrayList;
import android.os.IInterface;
import android.content.Context;
import android.os.Handler;

public abstract class at
{
    final /* synthetic */ aq a;
    private Object b;
    
    public at(final aq a, final Object b) {
        this.a = a;
        this.b = b;
        synchronized (a.i) {
            a.i.add(this);
        }
    }
    
    public final void a() {
        synchronized (this) {
            final Object b = this.b;
            // monitorexit(this)
            this.a(b);
        }
    }
    
    protected abstract void a(final Object p0);
    
    public final void b() {
        synchronized (this) {
            this.b = null;
        }
    }
}
