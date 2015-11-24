// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.LinkedHashMap;

public class ar
{
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    
    private int c(final Object o, final Object o2) {
        final int a = this.a(o, o2);
        if (a < 0) {
            throw new IllegalStateException("Negative size: " + o + "=" + o2);
        }
        return a;
    }
    
    protected int a(final Object o, final Object o2) {
        return 1;
    }
    
    public final Object a(final Object o) {
        if (o == null) {
            throw new NullPointerException("key == null");
        }
        final Object b;
        synchronized (this) {
            final Object value = this.a.get(o);
            if (value != null) {
                ++this.g;
                return value;
            }
            ++this.h;
            // monitorexit(this)
            b = this.b(o);
            if (b == null) {
                return null;
            }
        }
        synchronized (this) {
            ++this.e;
            final Object put = this.a.put(o, b);
            if (put != null) {
                this.a.put(o, put);
            }
            else {
                this.b += this.c(o, b);
            }
            // monitorexit(this)
            if (put != null) {
                this.a(false, o, b, put);
                return put;
            }
        }
        this.a(this.c);
        return b;
    }
    
    public final void a() {
        this.a(-1);
    }
    
    public void a(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
            }
            if (this.b <= n || this.a.isEmpty()) {
                break;
            }
            final Map.Entry<Object, V> entry = this.a.entrySet().iterator().next();
            final Object key = entry.getKey();
            final V value = entry.getValue();
            this.a.remove(key);
            this.b -= this.c(key, value);
            ++this.f;
            // monitorexit(this)
            this.a(true, key, value, null);
        }
    }
    // monitorexit(this)
    
    protected void a(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    protected Object b(final Object o) {
        return null;
    }
    
    public final Object b(final Object o, final Object o2) {
        if (o == null || o2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.d;
            this.b += this.c(o, o2);
            final Object put = this.a.put(o, o2);
            if (put != null) {
                this.b -= this.c(o, put);
            }
            // monitorexit(this)
            if (put != null) {
                this.a(false, o, put, o2);
            }
            this.a(this.c);
            return put;
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int n = this.g + this.h;
            int n2 = 0;
            if (n != 0) {
                n2 = 100 * this.g / n;
            }
            return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.g, this.h, n2);
        }
    }
}
