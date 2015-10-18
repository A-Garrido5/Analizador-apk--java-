// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.d;
import com.google.android.gms.common.a;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Collection;
import com.google.android.gms.common.api.p;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

public final class u
{
    final ArrayList a;
    private final w b;
    private final ArrayList c;
    private boolean d;
    private final ArrayList e;
    private final Handler f;
    
    public u(final Context context, final Looper looper, final w b) {
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.d = false;
        this.e = new ArrayList();
        this.b = b;
        this.f = new v(this, looper);
    }
    
    protected void a() {
        synchronized (this.c) {
            this.a(this.b.a_());
        }
    }
    
    public void a(final int n) {
        this.f.removeMessages(1);
        synchronized (this.c) {
            this.d = true;
            for (final p p : new ArrayList<p>(this.c)) {
                if (!this.b.b_()) {
                    break;
                }
                if (!this.c.contains(p)) {
                    continue;
                }
                p.a(n);
            }
            this.d = false;
        }
    }
    
    public void a(final Bundle bundle) {
        boolean b;
        boolean b2;
        Label_0019_Outer:Label_0047_Outer:
        while (true) {
            b = true;
            while (true) {
            Label_0164:
                while (true) {
                    synchronized (this.c) {
                        if (!this.d) {
                            b2 = b;
                            ap.a(b2);
                            this.f.removeMessages(1);
                            this.d = true;
                            if (this.a.size() == 0) {
                                ap.a(b);
                                for (final p p : new ArrayList<p>(this.c)) {
                                    if (!this.b.b_() || !this.b.c()) {
                                        break;
                                    }
                                    if (this.a.contains(p)) {
                                        continue Label_0019_Outer;
                                    }
                                    p.a(bundle);
                                }
                                this.a.clear();
                                this.d = false;
                                return;
                            }
                            break Label_0164;
                        }
                    }
                    b2 = false;
                    continue Label_0047_Outer;
                }
                b = false;
                continue;
            }
        }
    }
    
    public void a(final a a) {
        this.f.removeMessages(1);
        synchronized (this.e) {
            for (final d d : new ArrayList<d>(this.e)) {
                if (!this.b.b_()) {
                    return;
                }
                if (!this.e.contains(d)) {
                    continue;
                }
                d.a(a);
            }
        }
    }
    // monitorexit(list)
    
    public void a(final p p) {
        ap.a(p);
        synchronized (this.c) {
            if (this.c.contains(p)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + p + " is already registered");
            }
            else {
                this.c.add(p);
            }
            // monitorexit(this.c)
            if (this.b.c()) {
                this.f.sendMessage(this.f.obtainMessage(1, (Object)p));
            }
        }
    }
    
    public void a(final d d) {
        ap.a(d);
        synchronized (this.e) {
            if (this.e.contains(d)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + d + " is already registered");
            }
            else {
                this.e.add(d);
            }
        }
    }
    
    public void b(final p p) {
        ap.a(p);
        synchronized (this.c) {
            if (this.c != null) {
                if (!this.c.remove(p)) {
                    Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + p + " not found");
                }
                else if (this.d) {
                    this.a.add(p);
                }
            }
        }
    }
    
    public void b(final d d) {
        ap.a(d);
        synchronized (this.e) {
            if (this.e != null && !this.e.remove(d)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + d + " not found");
            }
        }
    }
}
