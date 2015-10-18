// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.config;

public abstract class a
{
    private static a a;
    public static final yv c;
    
    static {
        c = new yv("TestAppConfig");
    }
    
    public static void a(final a a) {
        a.c.a();
        a.a = a;
    }
    
    public static a n() {
        if (com.twitter.config.a.a == null) {
            throw new IllegalStateException("No AppConfig instance has been set");
        }
        return com.twitter.config.a.a;
    }
    
    public static boolean o() {
        return com.twitter.config.a.a != null;
    }
    
    public abstract boolean a();
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public abstract boolean d();
    
    public abstract boolean e();
    
    public abstract long f();
    
    public abstract String g();
    
    public abstract String h();
    
    public abstract int i();
    
    public abstract boolean j();
    
    public abstract boolean k();
    
    public abstract boolean l();
    
    public abstract AppFlavor m();
    
    public final boolean p() {
        return this.c() || this.d();
    }
    
    public final boolean q() {
        return this.a() || this.b();
    }
}
