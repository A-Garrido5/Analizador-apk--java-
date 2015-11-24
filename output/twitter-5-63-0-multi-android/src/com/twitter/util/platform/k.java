// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import com.twitter.util.s;

public abstract class k
{
    static final yv a;
    private static k b;
    
    static {
        a = new yv("TestPlatformContext");
        k.b = null;
    }
    
    public static void a(final k b) {
        k.a.a();
        k.b = b;
    }
    
    public static k f() {
        if (k.b == null) {
            throw new IllegalStateException("A default context has not been set");
        }
        return k.b;
    }
    
    public abstract s a();
    
    public abstract m b();
    
    public abstract p c();
    
    public abstract n d();
    
    public abstract com.twitter.util.m e();
}
