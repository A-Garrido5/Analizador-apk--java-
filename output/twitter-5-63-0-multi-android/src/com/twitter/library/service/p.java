// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.internal.android.service.a;

public abstract class p extends a
{
    private static final int[] a;
    private final ab e;
    private final int[] f;
    private int g;
    protected final Context i;
    
    static {
        a = new int[0];
    }
    
    public p(final Context context, final String s) {
        this(context, s, (ab)null, p.a);
    }
    
    public p(final Context context, final String s, final Session session) {
        ab ab;
        if (session != null) {
            ab = new ab(session);
        }
        else {
            ab = null;
        }
        this(context, s, ab, p.a);
    }
    
    public p(final Context context, final String s, final Session session, final int[] array) {
        ab ab;
        if (session != null) {
            ab = new ab(session);
        }
        else {
            ab = null;
        }
        this(context, s, ab, array);
    }
    
    public p(final Context context, final String s, final ab ab) {
        this(context, s, ab, p.a);
    }
    
    public p(final Context context, final String s, final ab e, final int[] f) {
        super(s);
        this.i = context.getApplicationContext();
        this.e = e;
        this.f = f;
    }
    
    protected abstract void a();
    
    public p c(final int g) {
        if (g < 0 || (this.f != null && !CollectionUtils.a(this.f, g))) {
            throw new UnsupportedOperationException("No supported action for action code: " + g);
        }
        this.g = g;
        return this;
    }
    
    protected final Void f() {
        this.a();
        return null;
    }
    
    protected final Void g() {
        return null;
    }
    
    public final ab h() {
        return this.e;
    }
    
    public final bg t() {
        if (this.e == null) {
            return bg.a(this.i, 0L);
        }
        return bg.a(this.i, this.e.c);
    }
    
    protected final b u() {
        return new b(this.i.getContentResolver());
    }
    
    public int v() {
        return this.g;
    }
}
