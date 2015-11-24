// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.List;
import java.util.Iterator;
import org.whispersystems.jobqueue.requirements.e;
import android.os.PowerManager$WakeLock;
import java.io.Serializable;

public abstract class a implements Serializable
{
    public static boolean a;
    private transient long b;
    private transient int c;
    private transient PowerManager$WakeLock d;
    private final p e;
    
    public a(final p e) {
        this.e = e;
    }
    
    public abstract void a();
    
    public void a(final int c) {
        this.c = c;
    }
    
    public void a(final long b) {
        this.b = b;
    }
    
    public void a(final PowerManager$WakeLock d) {
        this.d = d;
    }
    
    public void a(final o o) {
        this.e.a(o);
    }
    
    public abstract boolean a(final Exception p0);
    
    public boolean b() {
        final boolean h = v.h;
        final Iterator<e> iterator = this.e.a().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().a()) {
                return false;
            }
            if (h) {
                break;
            }
        }
        return true;
    }
    
    public List c() {
        return this.e.a();
    }
    
    public String d() {
        return this.e.g();
    }
    
    public int e() {
        return this.e.d();
    }
    
    public abstract void f();
    
    public long g() {
        return this.b;
    }
    
    public boolean h() {
        return this.e.b();
    }
    
    public boolean i() {
        return this.e.c();
    }
    
    public int j() {
        return this.c;
    }
    
    public o k() {
        return this.e.e();
    }
    
    public abstract void l();
    
    public PowerManager$WakeLock m() {
        return this.d;
    }
    
    public long n() {
        return this.e.f();
    }
}
