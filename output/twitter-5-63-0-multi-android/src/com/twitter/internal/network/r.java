// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import com.twitter.config.b;
import com.twitter.util.platform.o;
import com.twitter.util.platform.n;
import com.twitter.util.platform.k;
import com.twitter.util.m;

public class r extends m
{
    private static r a;
    private boolean b;
    private boolean c;
    
    private r() {
        this(k.f().d(), k.f().e());
    }
    
    public r(final n n, final m m) {
        this.b = false;
        this.c = false;
        this.b = n.a("wifi_only_mode", false);
        n.a(new s(this));
        m.a(new t(this));
    }
    
    public static r a() {
        synchronized (r.class) {
            if (r.a == null) {
                r.a = new r();
            }
            return r.a;
        }
    }
    
    private void a(final boolean b, final boolean c) {
        final boolean b2 = this.b();
        this.b = b;
        this.c = c;
        if (this.b() != b2) {
            this.a(new u(this.b()));
        }
    }
    
    public boolean b() {
        return !com.twitter.config.b.a("wifi_only_mode") || !this.b || this.c;
    }
}
