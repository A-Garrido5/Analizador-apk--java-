// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.util.Log;
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
import com.google.android.gms.common.a;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.internal.u;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.util.Queue;
import android.os.Bundle;
import android.content.IntentFilter;

class z implements p
{
    final /* synthetic */ x a;
    
    z(final x a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        this.a.e.lock();
        switch (n) {
            case 2: {
                try {
                    this.a.a(n);
                    this.a.b();
                    break;
                }
                finally {
                    this.a.e.unlock();
                }
            }
            case 1: {
                if (this.a.f()) {
                    this.a.e.unlock();
                    return;
                }
                this.a.n = true;
                this.a.c = new ac(this.a);
                final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                this.a.i.registerReceiver(this.a.c, intentFilter);
                this.a.b.sendMessageDelayed(this.a.b.obtainMessage(1), this.a.q);
                this.a.b.sendMessageDelayed(this.a.b.obtainMessage(2), this.a.r);
                this.a.a(n);
                break;
            }
        }
        this.a.e.unlock();
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.a.e.lock();
        try {
            if (this.a.m == 1) {
                if (bundle != null) {
                    this.a.s.putAll(bundle);
                }
                this.a.g();
            }
        }
        finally {
            this.a.e.unlock();
        }
    }
}
