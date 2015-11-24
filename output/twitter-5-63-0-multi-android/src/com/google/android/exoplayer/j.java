// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Handler$Callback;

final class j implements Handler$Callback
{
    private final Handler a;
    private final HandlerThread b;
    private final Handler c;
    private final l d;
    private final boolean[] e;
    private final long f;
    private final long g;
    private final int h;
    private final List i;
    private aj[] j;
    private aj k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    private int p;
    private int q;
    private int r;
    private long s;
    private volatile long t;
    private volatile long u;
    private volatile long v;
    
    public j(final Handler c, final boolean m, final boolean[] array, final int n, final int n2, final int h) {
        int i = 0;
        this.q = 0;
        this.r = 0;
        this.c = c;
        this.m = m;
        this.e = new boolean[array.length];
        this.f = 1000L * n;
        this.g = 1000L * n2;
        this.h = h;
        while (i < array.length) {
            this.e[i] = array[i];
            ++i;
        }
        this.p = 1;
        this.t = -1L;
        this.v = -1L;
        this.d = new l();
        this.i = new ArrayList(array.length);
        (this.b = new ag(this.getClass().getSimpleName() + ":Handler", -16)).start();
        this.a = new Handler(this.b.getLooper(), (Handler$Callback)this);
    }
    
    private void a(final int p) {
        if (this.p != p) {
            if (p == 3) {
                this.o = SystemClock.elapsedRealtime();
            }
            this.p = p;
            this.c.obtainMessage(1, p, 0).sendToTarget();
        }
    }
    
    private void a(final int n, final long n2, final long n3) {
        final long n4 = n2 + n3 - SystemClock.elapsedRealtime();
        if (n4 <= 0L) {
            this.a.sendEmptyMessage(n);
            return;
        }
        this.a.sendEmptyMessageDelayed(n, n4);
    }
    
    private void a(final int n, final Object o) {
        try {
            final Pair pair = (Pair)o;
            ((e)pair.first).a(n, pair.second);
            synchronized (this) {
                ++this.r;
                this.notifyAll();
                // monitorexit(this)
                if (this.p != 1 && this.p != 2) {
                    this.a.sendEmptyMessage(7);
                }
            }
        }
        finally {
            synchronized (this) {
                ++this.r;
                this.notifyAll();
            }
        }
    }
    
    private void a(final int n, final boolean b) {
        boolean b2 = true;
        if (this.e[n] != b) {
            this.e[n] = b;
            if (this.p != (b2 ? 1 : 0) && this.p != 2) {
                final aj aj = this.j[n];
                final int q = aj.q();
                if (q == (b2 ? 1 : 0) || q == 2 || q == 3) {
                    if (b) {
                        if (!this.m || this.p != 4) {
                            b2 = false;
                        }
                        aj.b(this.u, b2);
                        this.i.add(aj);
                        if (b2) {
                            aj.s();
                        }
                        this.a.sendEmptyMessage(7);
                        return;
                    }
                    if (aj == this.k) {
                        this.d.a(aj.f());
                    }
                    this.d(aj);
                    this.i.remove(aj);
                    aj.u();
                }
            }
        }
    }
    
    private boolean a(final aj aj) {
        if (aj.d()) {
            return true;
        }
        if (!aj.e()) {
            return false;
        }
        if (this.p == 4) {
            return true;
        }
        final long n = aj.n();
        final long o = aj.o();
        long n2;
        if (this.n) {
            n2 = this.g;
        }
        else {
            n2 = this.f;
        }
        if (this.h > 0) {
            n2 >>= (int)Math.min(31L, Math.max(0L, (SystemClock.elapsedRealtime() - this.o) / this.h));
        }
        return n2 <= 0L || o == -1L || o == -3L || o >= n2 + this.u || (n != -1L && n != -2L && o >= n);
    }
    
    private void b(final long n) {
        this.n = false;
        this.u = 1000L * n;
        this.d.b();
        this.d.a(this.u);
        if (this.p == 1 || this.p == 2) {
            return;
        }
        for (int i = 0; i < this.i.size(); ++i) {
            final aj aj = this.i.get(i);
            this.d(aj);
            aj.a(this.u);
        }
        this.a(3);
        this.a.sendEmptyMessage(7);
    }
    
    private void b(final aj aj) {
        try {
            this.d(aj);
            if (aj.q() == 2) {
                aj.u();
            }
        }
        catch (ExoPlaybackException ex) {
            Log.e("ExoPlayerImplInternal", "Stop failed.", (Throwable)ex);
        }
        catch (RuntimeException ex2) {
            Log.e("ExoPlayerImplInternal", "Stop failed.", (Throwable)ex2);
        }
    }
    
    private void b(final boolean m) {
        while (true) {
            Label_0073: {
                try {
                    this.n = false;
                    if (!(this.m = m)) {
                        this.f();
                        this.g();
                    }
                    else {
                        if (this.p != 4) {
                            break Label_0073;
                        }
                        this.e();
                        this.a.sendEmptyMessage(7);
                    }
                    return;
                }
                finally {
                    this.c.obtainMessage(2).sendToTarget();
                }
            }
            if (this.p == 3) {
                this.a.sendEmptyMessage(7);
            }
        }
    }
    
    private void b(final aj[] j) {
        this.n = false;
        this.j = j;
        for (int i = 0; i < j.length; ++i) {
            if (j[i].a()) {
                ae.b(this.k == null);
                this.k = j[i];
            }
        }
        this.a(2);
        this.a.sendEmptyMessage(2);
    }
    
    private void c(final aj aj) {
        try {
            aj.v();
        }
        catch (ExoPlaybackException ex) {
            Log.e("ExoPlayerImplInternal", "Release failed.", (Throwable)ex);
        }
        catch (RuntimeException ex2) {
            Log.e("ExoPlayerImplInternal", "Release failed.", (Throwable)ex2);
        }
    }
    
    private void d() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = true;
        for (int i = 0; i < this.j.length; ++i) {
            if (this.j[i].q() == 0 && this.j[i].r() == 0) {
                b = false;
            }
        }
        if (!b) {
            this.a(2, elapsedRealtime, 10L);
            return;
        }
        long max = 0L;
        int n = 1;
        int n2 = 1;
        for (int j = 0; j < this.j.length; ++j) {
            final aj aj = this.j[j];
            if (this.e[j] && aj.q() == 1) {
                aj.b(this.u, false);
                this.i.add(aj);
                if (n != 0 && aj.d()) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n2 != 0 && this.a(aj)) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                if (max != -1L) {
                    final long n3 = aj.n();
                    if (n3 == -1L) {
                        max = -1L;
                    }
                    else if (n3 != -2L) {
                        max = Math.max(max, n3);
                    }
                }
            }
        }
        this.t = max;
        if (n != 0) {
            this.a(5);
        }
        else {
            int n4;
            if (n2 != 0) {
                n4 = 4;
            }
            else {
                n4 = 3;
            }
            this.a(n4);
            if (this.m && this.p == 4) {
                this.e();
            }
        }
        this.a.sendEmptyMessage(7);
    }
    
    private void d(final aj aj) {
        if (aj.q() == 3) {
            aj.t();
        }
    }
    
    private void e() {
        this.n = false;
        this.d.a();
        for (int i = 0; i < this.i.size(); ++i) {
            ((aj)this.i.get(i)).s();
        }
    }
    
    private void f() {
        this.d.b();
        for (int i = 0; i < this.i.size(); ++i) {
            this.d((aj)this.i.get(i));
        }
    }
    
    private void g() {
        long u;
        if (this.k != null && this.i.contains(this.k)) {
            u = this.k.f();
        }
        else {
            u = this.d.c();
        }
        this.u = u;
        this.s = 1000L * SystemClock.elapsedRealtime();
    }
    
    private void h() {
        ah.a("doSomeWork");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        long t;
        if (this.t != -1L) {
            t = this.t;
        }
        else {
            t = Long.MAX_VALUE;
        }
        this.g();
        int n = 1;
        int n2 = 1;
        long min = t;
        for (int i = 0; i < this.i.size(); ++i) {
            final aj aj = this.i.get(i);
            aj.a(this.u, this.s);
            if (n2 != 0 && aj.d()) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n != 0 && this.a(aj)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (min != -1L) {
                final long n3 = aj.n();
                final long o = aj.o();
                if (o == -1L) {
                    min = -1L;
                }
                else if (o != -3L && (n3 == -1L || n3 == -2L || o < n3)) {
                    min = Math.min(min, o);
                }
            }
        }
        this.v = min;
        if (n2 != 0) {
            this.a(5);
            this.f();
        }
        else if (this.p == 3 && n != 0) {
            this.a(4);
            if (this.m) {
                this.e();
            }
        }
        else if (this.p == 4 && n == 0) {
            this.n = this.m;
            this.a(3);
            this.f();
        }
        this.a.removeMessages(7);
        if ((this.m && this.p == 4) || this.p == 3) {
            this.a(7, elapsedRealtime, 10L);
        }
        else if (!this.i.isEmpty()) {
            this.a(7, elapsedRealtime, 1000L);
        }
        ah.a();
    }
    
    private void i() {
        this.n = false;
        this.k();
    }
    
    private void j() {
        this.k();
        synchronized (this) {
            this.l = true;
            this.notifyAll();
        }
    }
    
    private void k() {
        this.a.removeMessages(7);
        this.a.removeMessages(2);
        this.d.b();
        if (this.j == null) {
            return;
        }
        for (int i = 0; i < this.j.length; ++i) {
            final aj aj = this.j[i];
            this.b(aj);
            this.c(aj);
        }
        this.j = null;
        this.k = null;
        this.i.clear();
        this.a(1);
    }
    
    public long a() {
        return this.u / 1000L;
    }
    
    public void a(final long n) {
        this.a.obtainMessage(6, (Object)n).sendToTarget();
    }
    
    public void a(final e e, final int n, final Object o) {
        ++this.q;
        this.a.obtainMessage(9, n, 0, (Object)Pair.create((Object)e, o)).sendToTarget();
    }
    
    public void a(final boolean b) {
        final Handler a = this.a;
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        a.obtainMessage(3, n, 0).sendToTarget();
    }
    
    public void a(final aj... array) {
        this.a.obtainMessage(1, (Object)array).sendToTarget();
    }
    
    public long b() {
        if (this.t == -1L) {
            return -1L;
        }
        return this.t / 1000L;
    }
    
    public void b(final e e, final int n, final Object o) {
        synchronized (this) {
            if (this.l) {
                Log.w("ExoPlayerImplInternal", "Sent message(" + n + ") after release. Message ignored.");
            }
            else {
                final int n2 = this.q++;
                this.a.obtainMessage(9, n, 0, (Object)Pair.create((Object)e, o)).sendToTarget();
                while (this.r <= n2) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
    
    public void c() {
        while (true) {
            synchronized (this) {
                if (this.l) {
                    return;
                }
                this.a.sendEmptyMessage(5);
                while (!this.l) {
                    try {
                        this.wait();
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.b.quit();
        }
    }
    
    public boolean handleMessage(final Message message) {
        boolean b;
        try {
            final int what = message.what;
            b = false;
            switch (what) {
                case 1: {
                    this.b((aj[])message.obj);
                    return true;
                }
                case 2: {
                    this.d();
                    return true;
                }
                case 3: {
                    final int arg1 = message.arg1;
                    boolean b2 = false;
                    if (arg1 != 0) {
                        b2 = true;
                    }
                    this.b(b2);
                    return true;
                }
                case 7: {
                    this.h();
                    return true;
                }
                case 6: {
                    this.b((long)message.obj);
                    return true;
                }
                case 4: {
                    this.i();
                    return true;
                }
                case 5: {
                    this.j();
                    return true;
                }
                case 9: {
                    this.a(message.arg1, message.obj);
                    return true;
                }
                case 8: {
                    final int arg2 = message.arg1;
                    final int arg3 = message.arg2;
                    boolean b3 = false;
                    if (arg3 != 0) {
                        b3 = true;
                    }
                    this.a(arg2, b3);
                    return true;
                }
            }
        }
        catch (ExoPlaybackException ex) {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", (Throwable)ex);
            this.c.obtainMessage(3, (Object)ex).sendToTarget();
            this.i();
            return true;
        }
        catch (RuntimeException ex2) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", (Throwable)ex2);
            this.c.obtainMessage(3, (Object)new ExoPlaybackException(ex2)).sendToTarget();
            this.i();
            b = true;
        }
        return b;
    }
}
