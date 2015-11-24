// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import com.twitter.config.a;

public class e
{
    private static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    protected static String a(final int n) {
        return Thread.currentThread().getStackTrace()[n].getMethodName();
    }
    
    public static void a(final RuntimeException ex) {
        if (e()) {
            throw ex;
        }
    }
    
    public static void a(final Thread thread) {
        if (e() && Thread.currentThread() != thread) {
            throw new IllegalStateException(String.format("'%s' must be called from thread '%s'", a(4), thread.getName()));
        }
    }
    
    public static void a(final boolean b) {
        e.a.set(b);
    }
    
    public static void a(final boolean b, final String s) {
        if (e() && !b) {
            throw new AssertionError((Object)s);
        }
    }
    
    public static void b(final boolean b) {
        a(b, "");
    }
    
    public static boolean b() {
        final Boolean b = e.a.get();
        return b == null || b;
    }
    
    public static void c() {
        if (e() && !b()) {
            throw new IllegalStateException(String.format("'%s' is blocking and must not be called from this thread", a(4)));
        }
    }
    
    public static void d() {
        if (!yw.a()) {
            throw new IllegalStateException(String.format("'%s' must be called from a test suite", a(4)));
        }
    }
    
    public static boolean e() {
        return yw.b() || com.twitter.config.a.n().q();
    }
}
