// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class by
{
    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final ce d;
    private final cc e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;
    
    public by(final ce ce) {
        this(ce, "default");
    }
    
    public by(final ce ce, final String s) {
        this(ce, s, cc.a);
    }
    
    private by(final ce d, final String c, final cc e) {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new ca(this);
        this.g = new cb(this);
        this.h = new HashMap();
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public String toString() {
        return "[Bus \"" + this.c + "\"]";
    }
}
