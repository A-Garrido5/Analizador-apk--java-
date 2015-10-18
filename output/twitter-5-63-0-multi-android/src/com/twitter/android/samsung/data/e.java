// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import com.twitter.library.api.search.j;
import java.util.ArrayDeque;

@Deprecated
public class e
{
    private ArrayDeque a;
    
    public e() {
        this.a = new ArrayDeque();
    }
    
    public k a() {
        synchronized (this) {
            return this.a.removeFirst();
        }
    }
    
    public void a(final int n, final String s, final Exception ex) {
        synchronized (this) {
            while (!this.a.isEmpty()) {
                final k a = this.a();
                a.a(n, s);
                if (ex != null) {
                    a.a(ex);
                }
            }
        }
    }
    // monitorexit(this)
    
    public void a(final long n) {
        synchronized (this) {
            while (!this.a.isEmpty()) {
                this.a().a(n);
            }
        }
    }
    // monitorexit(this)
    
    public void a(final k k) {
        synchronized (this) {
            this.a.addLast(k);
        }
    }
    
    public void a(final j j) {
        synchronized (this) {
            while (!this.a.isEmpty()) {
                this.a().a(j);
            }
        }
    }
    // monitorexit(this)
    
    public void a(final String s) {
        synchronized (this) {
            while (!this.a.isEmpty()) {
                this.a().b(s);
            }
        }
    }
    // monitorexit(this)
    
    public void b(final String s) {
        while (!this.a.isEmpty()) {
            this.a().a(s);
        }
    }
}
