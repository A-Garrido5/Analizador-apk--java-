// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.os.DeadObjectException;
import com.google.android.gms.common.d;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import android.content.Context;
import com.google.android.gms.common.api.e;
import android.util.Log;
import android.os.IInterface;
import android.app.PendingIntent;
import com.google.android.gms.common.a;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class p extends Handler
{
    final /* synthetic */ o a;
    
    public p(final o a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 1 && !this.a.f()) {
            final q q = (q)message.obj;
            q.a();
            q.c();
            return;
        }
        if (message.what == 3) {
            this.a.l.a(new a((int)message.obj, null));
            return;
        }
        if (message.what == 4) {
            this.a.a(4, null);
            this.a.l.a((int)message.obj);
            this.a.a(4, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.c()) {
            final q q2 = (q)message.obj;
            q2.a();
            q2.c();
            return;
        }
        if (message.what == 2 || message.what == 1) {
            ((q)message.obj).b();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
}
