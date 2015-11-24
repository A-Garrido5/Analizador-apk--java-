// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.ap;
import java.util.Iterator;
import com.google.android.gms.internal.ab;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import android.util.Log;
import android.os.Message;
import android.util.Pair;
import android.os.Looper;
import android.os.Handler;

public class k extends Handler
{
    public k() {
        this(Looper.getMainLooper());
    }
    
    public k(final Looper looper) {
        super(looper);
    }
    
    public void a() {
        this.removeMessages(2);
    }
    
    public void a(final v v, final u u) {
        this.sendMessage(this.obtainMessage(1, (Object)new Pair((Object)v, (Object)u)));
    }
    
    protected void b(final v v, final u u) {
        try {
            v.a(u);
        }
        catch (RuntimeException ex) {
            i.a(u);
            throw ex;
        }
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                Log.wtf("GoogleApi", "Don't know how to handle this message.");
            }
            case 1: {
                final Pair pair = (Pair)message.obj;
                this.b((v)pair.first, (u)pair.second);
            }
            case 2: {
                ((j)message.obj).g();
            }
        }
    }
}
