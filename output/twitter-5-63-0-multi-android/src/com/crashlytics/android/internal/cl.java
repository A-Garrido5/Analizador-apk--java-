// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Service;
import android.os.Bundle;
import java.util.Iterator;
import android.util.Log;
import android.os.Build$VERSION;
import android.content.Context;
import android.app.Activity;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import android.app.Application;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class cl extends ch
{
    private by a;
    private AtomicReference b;
    private boolean c;
    private File d;
    private Application e;
    private WeakReference f;
    private String g;
    private int h;
    private ConcurrentHashMap i;
    
    cl() {
        this.b = new AtomicReference();
        this.h = 4;
        this.a = new b(ce.a);
        this.i = new ConcurrentHashMap();
    }
    
    public static cl a() {
        return co.a;
    }
    
    private cl a(final Activity activity) {
        this.f = new WeakReference((T)activity);
        return this;
    }
    
    public static void a(final Context context, final ck... array) {
        while (true) {
            while (true) {
                int n = 0;
                Label_0109: {
                    synchronized (cl.class) {
                        if (!co.a.x()) {
                            final cl a = co.a;
                            a.e = cj.b(context);
                            final cl a2 = a.a(cj.a(context));
                            final int length = array.length;
                            n = 0;
                            if (n < length) {
                                final ck ck = array[n];
                                if (!a2.i.containsKey(array)) {
                                    a2.i.putIfAbsent(ck.getClass(), ck);
                                }
                                break Label_0109;
                            }
                            else {
                                a2.b(context);
                            }
                        }
                        return;
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    public final ck a(final Class clazz) {
        return this.i.get(clazz);
    }
    
    public final void a(final ci ci) {
        this.b.set(ci);
    }
    
    public final ci b() {
        ci ci = this.b.get();
        if (ci == null) {
            ci = new cj();
            if (!this.b.compareAndSet(null, ci)) {
                ci = this.b.get();
            }
        }
        return ci;
    }
    
    public final Application c() {
        return this.e;
    }
    
    public final Activity d() {
        if (this.f != null) {
            return (Activity)this.f.get();
        }
        return null;
    }
    
    @Override
    protected final void e() {
        final Context w = this.w();
        this.d = new File(w.getFilesDir(), "com.crashlytics.sdk.android");
        if (!this.d.exists()) {
            this.d.mkdirs();
        }
        if (Build$VERSION.SDK_INT >= 14) {
            cm.a(new cm(this, (byte)0), this.e);
        }
        if (this.c && Log.isLoggable("CrashlyticsInternal", 3)) {
            final StringBuilder sb = new StringBuilder();
            for (final ch ch : this.i.values()) {
                final long nanoTime = System.nanoTime();
                ch.b(w);
                sb.append("sdkPerfStart.").append(ch.getClass().getName()).append('=').append(System.nanoTime() - nanoTime).append('\n');
            }
            Log.d("CrashlyticsInternal", sb.toString());
        }
        else {
            final Iterator<ch> iterator2 = this.i.values().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().b(w);
            }
        }
    }
    
    public final String f() {
        return "1.1.13.29";
    }
    
    public final boolean g() {
        return this.c;
    }
    
    public final int h() {
        return this.h;
    }
    
    public final File i() {
        return this.d;
    }
    
    public final String j() {
        return this.g;
    }
}
