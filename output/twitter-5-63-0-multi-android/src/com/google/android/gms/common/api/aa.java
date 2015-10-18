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
import com.google.android.gms.internal.w;

class aa implements w
{
    final /* synthetic */ x a;
    
    aa(final x a) {
        this.a = a;
    }
    
    @Override
    public Bundle a_() {
        return null;
    }
    
    @Override
    public boolean b_() {
        return this.a.v;
    }
    
    @Override
    public boolean c() {
        return this.a.d();
    }
}
