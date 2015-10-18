// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;

public abstract class b
{
    private static final b a;
    
    static {
        a = b();
    }
    
    public static b a() {
        return b.a;
    }
    
    private static b b() {
        try {
            final Class<? extends b> subclass = Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(b.class);
            try {
                return (b)subclass.newInstance();
            }
            catch (InstantiationException ex) {
                throw new IllegalStateException(ex);
            }
            catch (IllegalAccessException ex2) {
                throw new IllegalStateException(ex2);
            }
        }
        catch (ClassNotFoundException ex3) {}
    }
    
    public abstract e a(final Context p0, final String p1, final az p2, final ba p3);
    
    public abstract i a(final Activity p0, final e p1);
}
