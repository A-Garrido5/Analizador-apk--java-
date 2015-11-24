// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.os.DeadObjectException;
import com.google.android.gms.common.d;
import android.os.Bundle;
import android.util.Log;
import android.os.IBinder;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.p;
import java.util.ArrayList;
import android.os.IInterface;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.e;

public abstract class o implements e, w
{
    public static final String[] c;
    final Handler a;
    boolean b;
    private final Context d;
    private final Looper e;
    private final Object f;
    private IInterface g;
    private final ArrayList h;
    private s i;
    private int j;
    private final String[] k;
    private final u l;
    
    static {
        c = new String[] { "service_esmobile", "service_googleme" };
    }
    
    protected o(final Context context, final Looper looper, final p p5, final q q, final String... k) {
        this.f = new Object();
        this.h = new ArrayList();
        this.j = 1;
        this.b = false;
        this.d = (Context)ap.a(context);
        this.e = (Looper)ap.a(looper, "Looper must not be null");
        this.l = new u(context, looper, this);
        this.a = new com.google.android.gms.internal.p(this, looper);
        this.a(k);
        this.k = k;
        this.a((p)ap.a(p5));
        this.a((q)ap.a(q));
    }
    
    private void a(final int j, final IInterface g) {
        boolean b = true;
        while (true) {
            Label_0059: {
                if (j != 3) {
                    break Label_0059;
                }
                final boolean b2 = b;
                if (b2 != (g != null && b)) {
                    b = false;
                }
                ap.b(b);
                synchronized (this.f) {
                    this.j = j;
                    this.g = g;
                    return;
                }
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    private boolean a(final int n, final int n2, final IInterface interface1) {
        synchronized (this.f) {
            if (this.j != n) {
                return false;
            }
            this.a(n2, interface1);
            return true;
        }
    }
    
    protected abstract IInterface a(final IBinder p0);
    
    @Override
    public void a() {
        this.b = true;
        this.a(2, null);
        final int a = com.google.android.gms.common.e.a(this.d);
        if (a != 0) {
            this.a(1, null);
            this.a.sendMessage(this.a.obtainMessage(3, (Object)a));
        }
        else {
            if (this.i != null) {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + this.d());
                x.a(this.d).b(this.d(), this.i);
            }
            this.i = new s(this);
            if (!x.a(this.d).a(this.d(), this.i)) {
                Log.e("GmsClient", "unable to connect to service: " + this.d());
                this.a.sendMessage(this.a.obtainMessage(3, (Object)9));
            }
        }
    }
    
    public void a(final int n) {
        this.a.sendMessage(this.a.obtainMessage(4, (Object)n));
    }
    
    protected void a(final int n, final IBinder binder, final Bundle bundle) {
        this.a.sendMessage(this.a.obtainMessage(1, (Object)new t(this, n, binder, bundle)));
    }
    
    public void a(final p p) {
        this.l.a(p);
    }
    
    public void a(final q q) {
        this.l.a(q);
    }
    
    protected abstract void a(final af p0, final r p1);
    
    protected void a(final String... array) {
    }
    
    @Override
    public Bundle a_() {
        return null;
    }
    
    @Override
    public void b() {
        this.b = false;
        synchronized (this.h) {
            for (int size = this.h.size(), i = 0; i < size; ++i) {
                ((com.google.android.gms.internal.q)this.h.get(i)).d();
            }
            this.h.clear();
            // monitorexit(this.h)
            this.a(1, null);
            if (this.i != null) {
                x.a(this.d).b(this.d(), this.i);
                this.i = null;
            }
        }
    }
    
    protected final void b(final IBinder binder) {
        try {
            this.a(ag.a(binder), new r(this));
        }
        catch (DeadObjectException ex2) {
            Log.w("GmsClient", "service died");
            this.a(1);
        }
        catch (RemoteException ex) {
            Log.w("GmsClient", "Remote exception occurred", (Throwable)ex);
        }
    }
    
    @Override
    public boolean b_() {
        return this.b;
    }
    
    @Override
    public boolean c() {
        while (true) {
            synchronized (this.f) {
                if (this.j == 3) {
                    return true;
                }
            }
            return false;
        }
    }
    
    protected abstract String d();
    
    protected abstract String e();
    
    public boolean f() {
        while (true) {
            synchronized (this.f) {
                if (this.j == 2) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public final Context g() {
        return this.d;
    }
    
    protected final void h() {
        if (!this.c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
    
    public final IInterface i() {
        synchronized (this.f) {
            if (this.j == 4) {
                throw new DeadObjectException();
            }
        }
        this.h();
        ap.a(this.g != null, (Object)"Client is connected but service is null");
        // monitorexit(o)
        return this.g;
    }
}
