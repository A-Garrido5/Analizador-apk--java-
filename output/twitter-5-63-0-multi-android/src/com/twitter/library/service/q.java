// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.u;
import java.util.Collection;
import java.util.Arrays;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Set;
import java.util.HashSet;
import com.twitter.internal.android.service.y;

public abstract class q extends y
{
    public static final HashSet b;
    protected final Set c;
    protected final Set d;
    
    static {
        b = new HashSet((Collection<? extends E>)Arrays.asList(HttpOperation$RequestMethod.values()));
    }
    
    protected q(final Collection collection) {
        this.c = new HashSet(collection);
        this.d = q.b;
    }
    
    protected q(final Collection collection, final Collection collection2) {
        this.d = new HashSet(collection);
        this.c = new HashSet(collection2);
    }
    
    @Override
    public boolean a(final u u, final x x) {
        return false;
    }
    
    @Override
    public final boolean a(final x x) {
        final aa aa = (aa)x.b();
        if (!aa.a()) {
            final HttpOperation e = aa.e();
            if (e != null) {
                final l l = e.l();
                final Set d = this.d;
                final Set c = this.c;
                return d.contains(e.h()) && c.contains(l.a) && this.a(e, l);
            }
        }
        return false;
    }
    
    protected abstract boolean a(final HttpOperation p0, final l p1);
    
    @Override
    public long b(final x x) {
        return 0L;
    }
}
