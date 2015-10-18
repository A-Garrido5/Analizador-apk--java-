// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import java.util.concurrent.Executors;
import android.app.Activity;
import de.greenrobot.event.m;
import java.util.concurrent.Executor;

public class a
{
    private Class a;
    private Executor b;
    private m c;
    
    private a() {
    }
    
    a(final f f) {
        this();
    }
    
    public a a(final m c) {
        this.c = c;
        return this;
    }
    
    public a a(final Class a) {
        this.a = a;
        return this;
    }
    
    public a a(final Executor b) {
        this.b = b;
        return this;
    }
    
    public h a() {
        return this.a((Object)null);
    }
    
    public h a(final Activity activity) {
        return this.a((Object)activity.getClass());
    }
    
    public h a(final Object o) {
        if (this.c == null) {
            this.c = m.b();
        }
        if (this.b == null) {
            this.b = Executors.newCachedThreadPool();
        }
        if (this.a == null) {
            this.a = k.class;
        }
        return new h(this.b, this.c, this.a, o, null);
    }
}
