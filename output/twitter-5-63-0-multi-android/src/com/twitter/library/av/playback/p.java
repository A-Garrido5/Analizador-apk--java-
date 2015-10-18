// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public abstract class p
{
    private static final p c;
    String a;
    final Map b;
    
    static {
        c = new u();
    }
    
    public p() {
        this.b = new HashMap();
    }
    
    private AVPlayer a(final au au, final Context context, final boolean b) {
        if (au == null) {
            throw new NullPointerException();
        }
        final String a = au.a();
        if (this.b.containsKey(a)) {
            final q q = this.b.get(a);
            final AVPlayer a2 = q.a;
            if (b) {
                q.b.getAndIncrement();
            }
            a2.a(au);
            return a2;
        }
        final AVPlayer b2 = this.b(au, context);
        boolean b3;
        if (b) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        this.b(a, new q(b2, (int)(b3 ? 1 : 0)));
        return b2;
    }
    
    public static p a() {
        return p.c;
    }
    
    private void a(final String s, final q q) {
        boolean b;
        if (q.b.get() < 1) {
            b = true;
        }
        else {
            b = false;
        }
        if (!this.e(s) && b) {
            this.f(s);
            this.a(q.a, true);
            this.g(s);
        }
    }
    
    private void b(final String s, final q q) {
        this.b.put(s, q);
    }
    
    private void h(final String a) {
        this.a = a;
    }
    
    public AVPlayer a(final au au, final Context context) {
        return this.a(au, context, true);
    }
    
    protected abstract void a(final AVPlayer p0, final boolean p1);
    
    public void a(final au au) {
        final q q = this.b.get(au.a());
        if (q != null) {
            q.b.getAndDecrement();
            this.a(au.a(), q);
        }
    }
    
    public void a(final String s) {
        if (!this.e(s)) {
            this.b();
            this.h(s);
        }
    }
    
    protected abstract AVPlayer b(final au p0, final Context p1);
    
    public void b() {
        int n = 1;
        final q d = this.d();
        if (d != null) {
            int n2;
            if (d.a.J()) {
                n2 = d.b.decrementAndGet();
            }
            else {
                n2 = d.b.get();
            }
            if (n2 >= n) {
                n = 0;
            }
            this.a(d.a, n != 0);
            if (n != 0) {
                this.g(this.a);
            }
            this.f(this.a);
        }
    }
    
    public void b(final String s) {
        int n = 1;
        if (this.e(s)) {
            final q d = this.d();
            if (d != null) {
                d.a.L();
                if (d.b.get() >= n) {
                    n = 0;
                }
                this.a(d.a, n != 0);
                if (n != 0) {
                    this.g(s);
                }
            }
            this.f(this.a);
        }
    }
    
    public boolean b(final au au) {
        final q q = this.b.get(au.a());
        return q != null && q.b.get() < 2;
    }
    
    public void c(final String s) {
        if (this.e(s)) {
            final q d = this.d();
            if (d != null && d.b.get() == 0) {
                this.b(s);
            }
        }
    }
    
    public boolean c() {
        final String a = this.a;
        return a != null && this.d(a);
    }
    
    q d() {
        return this.b.get(this.a);
    }
    
    public boolean d(final String s) {
        final boolean e = this.e(s);
        boolean j = false;
        if (e) {
            final q d = this.d();
            j = false;
            if (d != null) {
                j = d.a.J();
            }
        }
        return j;
    }
    
    public boolean e(final String s) {
        return s.equals(this.a);
    }
    
    void f(final String s) {
        if (s.equals(this.a)) {
            this.a = null;
        }
    }
    
    void g(final String s) {
        this.b.remove(s);
    }
}
