// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

public final class InternCache extends ConcurrentHashMap
{
    public static final InternCache a;
    private final Object lock;
    
    static {
        a = new InternCache();
    }
    
    private InternCache() {
        super(180, 0.8f, 4);
        this.lock = new Object();
    }
    
    public String a(final String s) {
        final String s2 = this.get(s);
        if (s2 != null) {
            return s2;
        }
        Label_0051: {
            if (this.size() < 180) {
                break Label_0051;
            }
            synchronized (this.lock) {
                if (this.size() >= 180) {
                    this.clear();
                }
                // monitorexit(this.lock)
                final String intern = s.intern();
                this.put(intern, intern);
                return intern;
            }
        }
    }
}
