// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.widget.ao;
import java.lang.ref.WeakReference;
import java.util.List;

public class bk
{
    private static final bk a;
    private boolean b;
    private boolean c;
    private List d;
    private long e;
    private long f;
    private WeakReference g;
    private WeakReference h;
    
    static {
        a = new bk();
    }
    
    private bk() {
        this.f = 30000L;
        this.g = new WeakReference(null);
    }
    
    public static bk a() {
        return bk.a;
    }
    
    public void a(final long f) {
        if (f > 0L) {
            this.f = f;
        }
    }
    
    public void a(final bl bl) {
        this.g = new WeakReference((T)bl);
    }
    
    public void a(final ao ao) {
        if (ao == null) {
            this.h = null;
            return;
        }
        this.h = new WeakReference((T)ao);
    }
    
    public void a(final List d) {
        if (d != null && d.size() > 0) {
            this.d = d;
            this.c = true;
        }
    }
    
    public void a(final boolean b) {
        this.b = b;
        final bl bl = (bl)this.g.get();
        if (this.c && bl != null) {
            bl.a(b);
        }
    }
    
    public boolean b() {
        return this.c && this.b;
    }
    
    public long c() {
        if (this.e == 0L) {
            this.e = com.twitter.library.util.bk.a();
            return 0L;
        }
        return (com.twitter.library.util.bk.a() - this.e) % this.f;
    }
    
    public long d() {
        return this.f;
    }
    
    public List e() {
        return this.d;
    }
    
    public ao f() {
        if (this.h != null) {
            return (ao)this.h.get();
        }
        return null;
    }
}
