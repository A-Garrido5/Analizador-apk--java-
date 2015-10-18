// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import com.google.android.gms.internal.ap;
import java.util.Collection;
import com.google.android.gms.internal.jg;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import java.util.Map;
import android.content.Context;
import android.view.View;
import java.util.Set;

public final class o
{
    private String a;
    private final Set b;
    private int c;
    private View d;
    private String e;
    private final Context f;
    private final Map g;
    private FragmentActivity h;
    private int i;
    private q j;
    private Looper k;
    private final Set l;
    private final Set m;
    
    public o(final Context f) {
        this.b = new HashSet();
        this.g = new HashMap();
        this.i = -1;
        this.l = new HashSet();
        this.m = new HashSet();
        this.f = f;
        this.k = f.getMainLooper();
        this.e = f.getPackageName();
    }
    
    private n c() {
        final g a = com.google.android.gms.common.api.g.a(this.h);
        n a2 = a.a(this.i);
        if (a2 == null) {
            a2 = new x(this.f.getApplicationContext(), this.k, this.a(), this.g, this.l, this.m, this.i);
        }
        a.a(this.i, a2, this.j);
        return a2;
    }
    
    public o a(final a a) {
        this.g.put(a, null);
        final List b = a.b();
        for (int size = b.size(), i = 0; i < size; ++i) {
            this.b.add(b.get(i).a());
        }
        return this;
    }
    
    public o a(final p p) {
        this.l.add(p);
        return this;
    }
    
    public o a(final q q) {
        this.m.add(q);
        return this;
    }
    
    public jg a() {
        return new jg(this.a, this.b, this.c, this.d, this.e);
    }
    
    public n b() {
        ap.b(!this.g.isEmpty(), (Object)"must call addApi() to add at least one API");
        if (this.i >= 0) {
            return this.c();
        }
        return new x(this.f, this.k, this.a(), this.g, this.l, this.m, -1);
    }
}
