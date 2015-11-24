// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.concurrent.TimeoutException;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import com.twitter.util.q;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;

public abstract class a implements Future
{
    private s a;
    public final String b;
    public final String c;
    y d;
    private Future e;
    private int f;
    private CopyOnWriteArrayList g;
    private x h;
    private int i;
    private int j;
    private boolean k;
    private Handler l;
    
    public a(final String s) {
        this(s, new Handler(Looper.getMainLooper()));
    }
    
    public a(final String c, final Handler l) {
        this.g = new CopyOnWriteArrayList();
        this.j = 1;
        this.b = q.a(6);
        this.c = c;
        this.f = 1;
        this.l = l;
    }
    
    public final a a(final int i) {
        this.i = i;
        return this;
    }
    
    public final a a(final c c) {
        this.b(c);
        return this;
    }
    
    public final a a(final y d) {
        this.d = d;
        return this;
    }
    
    public Runnable a(final a a) {
        return null;
    }
    
    public void a(final x x) {
    }
    
    protected final void a(final Future e) {
        this.e = e;
    }
    
    protected final boolean a(final s a) {
        boolean b = true;
        // monitorexit(this)
        while (true) {
            Label_0093: {
                synchronized (this) {
                    switch (this.f) {
                        default: {
                            throw new IllegalStateException("Mark RETRY_SCHEDULED. Invalid state: " + this.f);
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            break Label_0093;
                        }
                    }
                }
                this.a = a;
                this.f = 3;
                final boolean b2 = false;
                this.notifyAll();
                if (b2) {
                    b = false;
                }
                return b;
            }
            final boolean b2 = b;
            continue;
        }
    }
    
    public final boolean a(final u u, final x x) {
        synchronized (this) {
            boolean b;
            if (this.f == 3) {
                b = true;
            }
            else {
                b = false;
            }
            // monitorexit(this)
            if (b && this.d != null && this.d.a(u, x)) {
                return true;
            }
        }
        return false;
    }
    
    public void b(final int j) {
        this.j = j;
    }
    
    public void b(final x x) {
    }
    
    protected final void b(final Object o) {
        this.l.post((Runnable)new b(this, o));
    }
    
    public final boolean b(final c c) {
        if (c != null) {
            synchronized (this) {
                if (this.f != 6) {
                    this.g.add(c);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final a c(final x h) {
        synchronized (this) {
            this.h = h;
            return this;
        }
    }
    
    protected abstract Object c();
    
    public final void c(final Object o) {
        final Iterator<c> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(o, this);
        }
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        while (true) {
            boolean b2 = true;
            while (true) {
                Label_0128: {
                    Label_0117: {
                        synchronized (this) {
                            switch (this.f) {
                                case 2: {
                                    this.f = 5;
                                    final int n = 0;
                                    if (b2) {
                                        this.k = true;
                                    }
                                    this.notifyAll();
                                    // monitorexit(this)
                                    if (n != 0 && this.a != null) {
                                        this.a.run();
                                    }
                                    return b2;
                                }
                                case 4: {
                                    break;
                                }
                                case 3: {
                                    break Label_0117;
                                }
                                default: {
                                    break Label_0128;
                                }
                            }
                        }
                        if (this.e != null) {
                            this.e.cancel(b);
                        }
                        this.f = 5;
                        final int n = 0;
                        continue;
                    }
                    this.f = 5;
                    final int n = b2 ? 1 : 0;
                    continue;
                }
                final int n = 0;
                b2 = false;
                continue;
            }
        }
    }
    
    protected abstract Object d();
    
    @Override
    public final Object get() {
        synchronized (this) {
            while (this.f != 6) {
                this.wait();
            }
        }
        // monitorexit(this)
        if (this.h != null) {
            return this.h.b();
        }
        return null;
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        long millis = timeUnit.toMillis(n);
        // monitorenter(this)
    Label_0050_Outer:
        while (true) {
            while (true) {
                if (millis > 0L) {
                    try {
                        if (this.f != 6) {
                            this.wait(millis);
                            millis -= SystemClock.elapsedRealtime() - elapsedRealtime;
                            continue Label_0050_Outer;
                        }
                        if (this.f != 6) {
                            throw new TimeoutException("Get async operation result timed out");
                        }
                    }
                    finally {
                    }
                    // monitorexit(this)
                    break;
                }
                continue;
            }
        }
        // monitorexit(this)
        return this.h.b();
    }
    
    public final int i() {
        return this.i;
    }
    
    @Override
    public final boolean isCancelled() {
        synchronized (this) {
            return this.k;
        }
    }
    
    @Override
    public final boolean isDone() {
        synchronized (this) {
            return this.f == 6;
        }
    }
    
    protected int j() {
        return this.j;
    }
    
    public void k() {
        synchronized (this) {
            boolean b;
            if (this.f == 3) {
                b = true;
            }
            else {
                b = false;
            }
            // monitorexit(this)
            if (b && this.a != null) {
                this.a.run();
            }
        }
    }
    
    public final x l() {
        synchronized (this) {
            return this.h;
        }
    }
    
    public d m() {
        return null;
    }
    
    public final void n() {
        final Iterator<c> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(this);
        }
    }
    
    public final void o() {
        final Iterator<c> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().a_(this);
        }
    }
    
    protected String p() {
        return null;
    }
    
    protected final boolean q() {
        boolean b = true;
        synchronized (this) {
            if (this.f == (b ? 1 : 0)) {
                this.f = 2;
                this.notifyAll();
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    protected final boolean r() {
        boolean b = true;
        // monitorexit(this)
        while (true) {
            Label_0094: {
                synchronized (this) {
                    switch (this.f) {
                        default: {
                            throw new IllegalStateException("Mark RUNNING. Invalid state: " + this.f);
                        }
                        case 2:
                        case 3: {
                            break;
                        }
                        case 5: {
                            break Label_0094;
                        }
                    }
                }
                this.f = 4;
                final boolean b2 = false;
                this.notifyAll();
                if (b2) {
                    b = false;
                }
                return b;
            }
            final boolean b2 = b;
            continue;
        }
    }
    
    protected final void s() {
        synchronized (this) {
            switch (this.f) {
                default: {
                    throw new IllegalStateException("Mark DONE. Invalid state: " + this.f);
                }
                case 4:
                case 5: {
                    break;
                }
            }
        }
        this.f = 6;
        this.notifyAll();
    }
    // monitorexit(this)
}
