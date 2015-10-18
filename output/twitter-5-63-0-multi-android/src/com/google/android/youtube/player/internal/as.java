// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.Intent;
import com.google.android.youtube.player.a;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Looper;
import android.content.ServiceConnection;
import java.util.ArrayList;
import android.os.IInterface;
import android.content.Context;
import com.google.android.youtube.player.YouTubeInitializationResult;
import android.os.Message;
import android.os.Handler;

final class as extends Handler
{
    final /* synthetic */ aq a;
    
    as(final aq a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 3) {
            this.a.a((YouTubeInitializationResult)message.obj);
        }
        else {
            if (message.what == 4) {
                synchronized (this.a.d) {
                    if (this.a.k && this.a.f() && this.a.d.contains(message.obj)) {
                        ((az)message.obj).a();
                    }
                    return;
                }
            }
            if ((message.what != 2 || this.a.f()) && (message.what == 2 || message.what == 1)) {
                ((at)message.obj).a();
            }
        }
    }
}
