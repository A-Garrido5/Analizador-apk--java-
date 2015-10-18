// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.api.b;

public class u
{
    public static u a;
    private b b;
    
    static {
        u.a = new u();
    }
    
    public b a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public void a(final b b) {
        synchronized (this) {
            this.b = b;
        }
    }
}
