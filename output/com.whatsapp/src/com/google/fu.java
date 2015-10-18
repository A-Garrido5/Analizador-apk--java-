// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class fu
{
    private static volatile boolean b;
    private static final fu c;
    private final Map a;
    
    static {
        fu.b = false;
        c = new fu(true);
    }
    
    fu() {
        this.a = new HashMap();
    }
    
    fu(final fu fu) {
        if (fu == fu.c) {
            this.a = Collections.emptyMap();
            return;
        }
        this.a = Collections.unmodifiableMap((Map<?, ?>)fu.a);
    }
    
    private fu(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static boolean a() {
        return fu.b;
    }
    
    public static fu b() {
        return fu.c;
    }
    
    public ax a(final ci ci, final int n) {
        return this.a.get(new b4(ci, n));
    }
}
