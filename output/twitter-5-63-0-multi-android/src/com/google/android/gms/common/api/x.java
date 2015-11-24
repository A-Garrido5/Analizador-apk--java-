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

final class x implements n
{
    final Queue a;
    final Handler b;
    BroadcastReceiver c;
    final Set d;
    private final Lock e;
    private final Condition f;
    private final u g;
    private final int h;
    private final Context i;
    private final Looper j;
    private a k;
    private int l;
    private volatile int m;
    private volatile boolean n;
    private boolean o;
    private int p;
    private long q;
    private long r;
    private final Bundle s;
    private final Map t;
    private final List u;
    private boolean v;
    private final Set w;
    private final ad x;
    private final p y;
    private final w z;
    
    public x(final Context i, final Looper j, final jg jg, final Map map, final Set set, final Set set2, final int h) {
        this.e = new ReentrantLock();
        this.f = this.e.newCondition();
        this.a = new LinkedList();
        this.m = 4;
        this.o = false;
        this.q = 120000L;
        this.r = 5000L;
        this.s = new Bundle();
        this.t = new HashMap();
        this.w = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.d = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
        this.x = new y(this);
        this.y = new z(this);
        this.z = new aa(this);
        this.i = i;
        this.g = new u(i, j, this.z);
        this.j = j;
        this.b = new ae(this, j);
        this.h = h;
        final Iterator<p> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.g.a(iterator.next());
        }
        final Iterator<q> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            this.g.a(iterator2.next());
        }
        for (final com.google.android.gms.common.api.a a : map.keySet()) {
            final f a2 = a.a();
            this.t.put(a.c(), a(a2, map.get(a), i, j, jg, this.y, new ab(this, a2)));
        }
        this.u = Collections.unmodifiableList((List<?>)jg.b());
    }
    
    private static e a(final f f, final Object o, final Context context, final Looper looper, final jg jg, final p p7, final q q) {
        return f.a(context, looper, jg, o, p7, q);
    }
    
    private void a(final int n) {
        this.e.lock();
        Label_0373: {
            Label_0236: {
                Label_0111: {
                    try {
                        if (this.m == 3) {
                            break Label_0373;
                        }
                        if (n != -1) {
                            break Label_0236;
                        }
                        if (this.e()) {
                            final Iterator iterator = this.a.iterator();
                            while (iterator.hasNext()) {
                                final af af = iterator.next();
                                if (af.e() != 1) {
                                    af.b();
                                    iterator.remove();
                                }
                            }
                            break Label_0111;
                        }
                    }
                    finally {
                        this.e.unlock();
                    }
                    this.a.clear();
                }
                final Iterator<af> iterator2 = this.d.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().b();
                }
                this.d.clear();
                final Iterator<ag> iterator3 = this.w.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().a();
                }
                this.w.clear();
                if (this.k == null && !this.a.isEmpty()) {
                    this.o = true;
                    this.e.unlock();
                    return;
                }
            }
            final boolean e = this.e();
            final boolean d = this.d();
            this.m = 3;
            if (e) {
                if (n == -1) {
                    this.k = null;
                }
                this.f.signalAll();
            }
            this.v = false;
            for (final e e2 : this.t.values()) {
                if (e2.c()) {
                    e2.b();
                }
            }
            this.v = true;
            this.m = 4;
            if (d) {
                if (n != -1) {
                    this.g.a(n);
                }
                this.v = false;
            }
        }
        this.e.unlock();
    }
    
    private void a(final af af) {
        this.e.lock();
        try {
            ap.b(af.d() != null, (Object)"This task can not be executed or enqueued (it's probably a Batch or malformed)");
            this.d.add(af);
            af.a(this.x);
            if (this.f()) {
                af.b(new Status(8));
                return;
            }
            af.a(this.a(af.d()));
        }
        finally {
            this.e.unlock();
        }
    }
    
    private void g() {
        --this.p;
        if (this.p == 0) {
            if (this.k != null) {
                this.o = false;
                this.a(3);
                if (!this.f() || !com.google.android.gms.common.e.c(this.i, this.k.c())) {
                    this.j();
                    this.g.a(this.k);
                }
                this.v = false;
            }
            else {
                this.m = 2;
                this.j();
                this.f.signalAll();
                this.h();
                if (this.o) {
                    this.o = false;
                    this.a(-1);
                    return;
                }
                Bundle s;
                if (this.s.isEmpty()) {
                    s = null;
                }
                else {
                    s = this.s;
                }
                this.g.a(s);
            }
        }
    }
    
    private void h() {
    Label_0026_Outer:
        while (true) {
            this.e.lock();
            while (true) {
                Label_0110: {
                    Label_0095: {
                        try {
                            if (!this.d() && !this.f()) {
                                break Label_0095;
                            }
                            break Label_0110;
                            while (true) {
                                try {
                                    this.a(this.a.remove());
                                }
                                catch (DeadObjectException ex) {
                                    Log.w("GoogleApiClientImpl", "Service died while flushing queue", (Throwable)ex);
                                }
                                continue Label_0026_Outer;
                                final boolean b;
                                ap.a(b, (Object)"GoogleApiClient is not connected yet.");
                                continue Label_0026_Outer;
                            }
                        }
                        // iftrue(Label_0100:, this.a.isEmpty())
                        finally {
                            this.e.unlock();
                        }
                    }
                    final boolean b = false;
                    continue;
                }
                final boolean b = true;
                continue;
            }
        }
        Label_0100: {
            this.e.unlock();
        }
    }
    
    private void i() {
        this.e.lock();
        try {
            if (this.f()) {
                this.b();
            }
        }
        finally {
            this.e.unlock();
        }
    }
    
    private void j() {
        this.e.lock();
        try {
            if (!this.n) {
                return;
            }
            this.n = false;
            this.b.removeMessages(2);
            this.b.removeMessages(1);
            this.i.unregisterReceiver(this.c);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public Looper a() {
        return this.j;
    }
    
    @Override
    public e a(final h h) {
        final e e = this.t.get(h);
        ap.a(e, "Appropriate Api was not requested.");
        return e;
    }
    
    @Override
    public l a(final l l) {
        Label_0034: {
            if (!this.d() && !this.f()) {
                break Label_0034;
            }
            boolean b = true;
            while (true) {
                ap.a(b, (Object)"GoogleApiClient is not connected yet.");
                this.h();
                try {
                    this.a((af)l);
                    return l;
                    b = false;
                }
                catch (DeadObjectException ex) {
                    this.a(1);
                    return l;
                }
            }
        }
    }
    
    @Override
    public void a(final p p) {
        this.g.a(p);
    }
    
    @Override
    public void a(final q q) {
        this.g.a(q);
    }
    
    @Override
    public void b() {
        this.e.lock();
        try {
            this.o = false;
            if (this.d() || this.e()) {
                return;
            }
            this.v = true;
            this.k = null;
            this.m = 1;
            this.s.clear();
            this.p = this.t.size();
            final Iterator<e> iterator = this.t.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
        finally {
            this.e.unlock();
        }
        this.e.unlock();
    }
    
    @Override
    public void b(final p p) {
        this.g.b(p);
    }
    
    @Override
    public void b(final q q) {
        this.g.b(q);
    }
    
    @Override
    public void c() {
        this.j();
        this.a(-1);
    }
    
    @Override
    public boolean d() {
        return this.m == 2;
    }
    
    @Override
    public boolean e() {
        return this.m == 1;
    }
    
    boolean f() {
        return this.n;
    }
}
