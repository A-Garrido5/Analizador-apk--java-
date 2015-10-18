// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import com.twitter.errorreporter.ErrorReporter;
import java.util.Map;
import android.os.IBinder;
import android.content.ComponentName;
import java.util.Collection;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Process;
import android.app.ActivityManager;
import com.twitter.errorreporter.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import android.content.Context;
import android.content.ServiceConnection;

public class v implements ServiceConnection
{
    private AsyncService a;
    private Context b;
    private final LinkedHashMap c;
    private final HashMap d;
    private final ArrayList e;
    private final int[] f;
    private final c g;
    
    public v() {
        this.b = null;
        this.c = new LinkedHashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new int[0];
        this.g = new w(this);
    }
    
    public v(final Context b) {
        this.b = null;
        this.c = new LinkedHashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new int[0];
        this.g = new w(this);
        this.b = b;
    }
    
    private a a(final Context context) {
        final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        final long n = Process.myPid();
        final a a = new a();
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (activityManager$RunningAppProcessInfo.pid == n) {
                a.a("processName", activityManager$RunningAppProcessInfo.processName);
                return a;
            }
        }
        return null;
    }
    
    public String a(final com.twitter.internal.android.service.a a) {
        final String b = a.b;
        a.a(this.g);
        synchronized (this.f) {
            if (this.a != null) {
                this.d.put(b, a);
                this.a.a(a);
            }
            else {
                this.c.put(b, a);
            }
            return b;
        }
    }
    
    public void a(final u u) {
        synchronized (this.f) {
            final AsyncService a = this.a;
            // monitorexit(this.f)
            if (a != null) {
                a.a(u);
            }
        }
    }
    
    public void a(final boolean b) {
        synchronized (this.f) {
            this.e.addAll(this.c.values());
            this.c.clear();
            this.e.addAll(this.d.values());
            this.d.clear();
            final Iterator<com.twitter.internal.android.service.a> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel(b);
            }
        }
        this.e.clear();
    }
    // monitorexit(array)
    
    public boolean a() {
        return this.a != null;
    }
    
    public boolean a(final String s) {
        synchronized (this.f) {
            return this.d.containsKey(s);
        }
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int[] f = this.f;
        // monitorenter(f)
        try {
            try {
                this.a = ((t)binder).a();
                this.d.putAll(this.c);
                final Iterator<com.twitter.internal.android.service.a> iterator = this.c.values().iterator();
                while (iterator.hasNext()) {
                    this.a.a(iterator.next());
                }
            }
            finally {
            }
            // monitorexit(f)
        }
        catch (ClassCastException ex) {
            if (this.b != null) {
                final a a = this.a(this.b);
                if (a != null) {
                    a.a(ex);
                    ErrorReporter.a(a);
                }
            }
            throw ex;
        }
        this.c.clear();
    }
    // monitorexit(f)
    
    public void onServiceDisconnected(final ComponentName componentName) {
        synchronized (this.f) {
            this.a = null;
        }
    }
}
