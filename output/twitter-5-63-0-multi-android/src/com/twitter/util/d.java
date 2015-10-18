// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

public abstract class d extends e
{
    public static void a() {
        if (!yw.b() && e.e() && !c.a()) {
            throw new IllegalStateException(String.format("'%s' must be called from main thread", e.a(4)));
        }
    }
}
