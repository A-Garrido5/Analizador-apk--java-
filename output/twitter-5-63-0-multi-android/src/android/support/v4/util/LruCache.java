// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;
import java.util.LinkedHashMap;

public class LruCache
{
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;
    
    public LruCache(final int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = maxSize;
        this.map = new LinkedHashMap(0, 0.75f, true);
    }
    
    private int safeSizeOf(final Object o, final Object o2) {
        final int size = this.sizeOf(o, o2);
        if (size < 0) {
            throw new IllegalStateException("Negative size: " + o + "=" + o2);
        }
        return size;
    }
    
    protected Object create(final Object o) {
        return null;
    }
    
    public final int createCount() {
        synchronized (this) {
            return this.createCount;
        }
    }
    
    protected void entryRemoved(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    public final void evictAll() {
        this.trimToSize(-1);
    }
    
    public final int evictionCount() {
        synchronized (this) {
            return this.evictionCount;
        }
    }
    
    public final Object get(final Object o) {
        if (o == null) {
            throw new NullPointerException("key == null");
        }
        final Object create;
        synchronized (this) {
            final Object value = this.map.get(o);
            if (value != null) {
                ++this.hitCount;
                return value;
            }
            ++this.missCount;
            // monitorexit(this)
            create = this.create(o);
            if (create == null) {
                return null;
            }
        }
        synchronized (this) {
            ++this.createCount;
            final Object put = this.map.put(o, create);
            if (put != null) {
                this.map.put(o, put);
            }
            else {
                this.size += this.safeSizeOf(o, create);
            }
            // monitorexit(this)
            if (put != null) {
                this.entryRemoved(false, o, create, put);
                return put;
            }
        }
        this.trimToSize(this.maxSize);
        return create;
    }
    
    public final int hitCount() {
        synchronized (this) {
            return this.hitCount;
        }
    }
    
    public final int maxSize() {
        synchronized (this) {
            return this.maxSize;
        }
    }
    
    public final int missCount() {
        synchronized (this) {
            return this.missCount;
        }
    }
    
    public final Object put(final Object o, final Object o2) {
        if (o == null || o2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.putCount;
            this.size += this.safeSizeOf(o, o2);
            final Object put = this.map.put(o, o2);
            if (put != null) {
                this.size -= this.safeSizeOf(o, put);
            }
            // monitorexit(this)
            if (put != null) {
                this.entryRemoved(false, o, put, o2);
            }
            this.trimToSize(this.maxSize);
            return put;
        }
    }
    
    public final int putCount() {
        synchronized (this) {
            return this.putCount;
        }
    }
    
    public final Object remove(final Object o) {
        if (o == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            final Object remove = this.map.remove(o);
            if (remove != null) {
                this.size -= this.safeSizeOf(o, remove);
            }
            // monitorexit(this)
            if (remove != null) {
                this.entryRemoved(false, o, remove, null);
            }
            return remove;
        }
    }
    
    public void resize(final int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = maxSize;
            // monitorexit(this)
            this.trimToSize(maxSize);
        }
    }
    
    public final int size() {
        synchronized (this) {
            return this.size;
        }
    }
    
    protected int sizeOf(final Object o, final Object o2) {
        return 1;
    }
    
    public final Map snapshot() {
        synchronized (this) {
            return new LinkedHashMap(this.map);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int n = this.hitCount + this.missCount;
            int n2 = 0;
            if (n != 0) {
                n2 = 100 * this.hitCount / n;
            }
            return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.maxSize, this.hitCount, this.missCount, n2);
        }
    }
    
    public void trimToSize(final int n) {
        while (true) {
            synchronized (this) {
                if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
            }
            if (this.size <= n || this.map.isEmpty()) {
                break;
            }
            final Map.Entry<Object, V> entry = this.map.entrySet().iterator().next();
            final Object key = entry.getKey();
            final V value = entry.getValue();
            this.map.remove(key);
            this.size -= this.safeSizeOf(key, value);
            ++this.evictionCount;
            // monitorexit(this)
            this.entryRemoved(true, key, value, null);
        }
    }
    // monitorexit(this)
}
