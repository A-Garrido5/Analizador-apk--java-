// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import com.google.android.gms.internal.ap;
import java.util.Iterator;
import com.google.android.gms.common.d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.w;
import java.util.List;
import java.util.Map;
import android.os.Bundle;
import com.google.android.gms.common.a;
import android.content.Context;
import com.google.android.gms.internal.u;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import android.content.BroadcastReceiver;
import java.util.Queue;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class ae extends Handler
{
    final /* synthetic */ x a;
    
    ae(final x a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
            }
            case 1: {
                this.a.j();
            }
            case 2: {
                this.a.i();
            }
        }
    }
}
