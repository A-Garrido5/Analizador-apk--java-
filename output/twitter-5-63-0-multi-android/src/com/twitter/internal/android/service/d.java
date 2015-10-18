// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class d
{
    private final Map a;
    private final Map b;
    
    public d() {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }
    
    public long a() {
        return this.b("blocking", -1L);
    }
    
    public long a(final String s, final long n) {
        if (s != null) {
            final Long n2 = this.a.get(s);
            if (n2 != null) {
                return System.currentTimeMillis() - SystemClock.uptimeMillis() + n2;
            }
        }
        return n;
    }
    
    public void a(final String s) {
        if (s == null) {
            return;
        }
        this.a.put(s, SystemClock.uptimeMillis());
    }
    
    public long b(final String s, final long n) {
        if (s != null) {
            final Long n2 = this.b.get(s);
            if (n2 != null) {
                return n2;
            }
        }
        return n;
    }
    
    public void b(final String s) {
        if (s != null) {
            final Long n = this.a.get(s);
            if (n != null) {
                this.b.put(s, SystemClock.uptimeMillis() - n);
            }
        }
    }
}
