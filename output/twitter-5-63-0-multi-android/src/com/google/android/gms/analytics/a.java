// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.analytics;

public class a extends c
{
    private static a b;
    private b a;
    
    static a a() {
        synchronized (a.class) {
            return a.b;
        }
    }
    
    public b b() {
        return this.a;
    }
}
