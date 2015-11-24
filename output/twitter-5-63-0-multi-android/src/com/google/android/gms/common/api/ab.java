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
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.internal.u;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.util.Queue;
import com.google.android.gms.common.a;

class ab implements q
{
    final /* synthetic */ f a;
    final /* synthetic */ x b;
    
    ab(final x b, final f a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final a a) {
        this.b.e.lock();
        try {
            if (this.b.k == null || this.a.a() < this.b.l) {
                this.b.k = a;
                this.b.l = this.a.a();
            }
            this.b.g();
        }
        finally {
            this.b.e.unlock();
        }
    }
}
