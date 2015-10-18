// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.Intent;
import com.google.android.youtube.player.a;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.YouTubeInitializationResult;
import android.os.Looper;
import java.util.ArrayList;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

final class aw implements ServiceConnection
{
    final /* synthetic */ aq a;
    
    aw(final aq a) {
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.a.b(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.a.c = null;
        this.a.h();
    }
}
