// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.content.Context;
import android.content.SharedPreferences;
import com.twitter.util.s;

public class a extends k
{
    private final s b;
    private final m c;
    private final p d;
    private final n e;
    private final com.twitter.util.m f;
    
    public a() {
        this(new g((SharedPreferences)new f(null)), i.a());
    }
    
    public a(final Context context) {
        this(new g(context), i.a());
    }
    
    public a(final n e, final com.twitter.util.m f) {
        this.b = new e(null);
        this.c = new c(null);
        this.d = new d(null);
        this.e = e;
        this.f = f;
    }
    
    @Override
    public s a() {
        return this.b;
    }
    
    @Override
    public m b() {
        return this.c;
    }
    
    @Override
    public p c() {
        return this.d;
    }
    
    @Override
    public n d() {
        return this.e;
    }
    
    @Override
    public com.twitter.util.m e() {
        return this.f;
    }
}
