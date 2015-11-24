// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.HashMap;
import android.os.Looper;
import java.util.Map;
import java.util.Collections;
import android.app.Activity;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

class n implements bk
{
    t a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final ScheduledExecutorService j;
    
    public n(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final j j, final bu bu) {
        this(s, s2, s3, s4, s5, s6, s7, j, bi.b("Crashlytics SAM"), bu);
    }
    
    n(final String b, final String c, final String d, final String e, final String f, final String g, final String h, final j j, final ScheduledExecutorService i, final bu bu) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = UUID.randomUUID().toString();
        this.j = i;
        this.a = new i(i, j, bu);
        j.a(this);
    }
    
    private void a(final W w, final Activity activity, final boolean b) {
        this.a(u.a(this.b, this.i, this.c, this.d, this.e, this.f, this.g, this.h, w, Collections.singletonMap("activity", activity.getClass().getName())), false);
    }
    
    private void a(final u u, final boolean b) {
        this.a(new p(this, u, b));
    }
    
    private void a(final Runnable runnable) {
        try {
            this.j.submit(runnable);
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to submit analytics task");
        }
    }
    
    void a() {
        this.a(new s(this));
    }
    
    public final void a(final Activity activity) {
        this.a(W.a, activity, false);
    }
    
    final void a(final ak ak, final String s) {
        this.a(new q(this, ak, s));
    }
    
    public final void a(final String s) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
        final o o = new o(this, s);
        try {
            this.j.submit(o).get();
        }
        catch (Exception ex) {
            bd.d("Crashlytics failed to run analytics task");
        }
    }
    
    public final void b() {
        this.a(u.a(this.b, this.i, this.c, this.d, this.e, this.f, this.g, this.h, W.j, new HashMap()), true);
    }
    
    public final void b(final Activity activity) {
        this.a(W.g, activity, false);
    }
    
    public final void b(final String s) {
        this.a(u.a(this.b, this.i, this.c, this.d, this.e, this.f, this.g, this.h, W.h, Collections.singletonMap("sessionId", s)), false);
    }
    
    @Override
    public final void c() {
        this.a(new r(this));
    }
    
    public final void c(final Activity activity) {
        this.a(W.e, activity, false);
    }
    
    public final void d(final Activity activity) {
        this.a(W.c, activity, false);
    }
    
    public final void e(final Activity activity) {
        this.a(W.d, activity, false);
    }
    
    public final void f(final Activity activity) {
        this.a(W.b, activity, false);
    }
    
    public final void g(final Activity activity) {
        this.a(W.f, activity, false);
    }
}
