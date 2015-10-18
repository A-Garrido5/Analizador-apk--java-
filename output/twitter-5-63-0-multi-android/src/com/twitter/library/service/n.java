// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.android.service.x;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Collection;

public final class n extends q
{
    private static final Collection a;
    private static final Collection e;
    private final long f;
    private final long g;
    private final int h;
    private int i;
    private long j;
    private long k;
    
    static {
        a = Collections.singleton(HttpOperation$RequestMethod.a);
        e = Collections.singleton(503);
    }
    
    public n(final int h, final long n, final long n2, final TimeUnit timeUnit, final Collection collection, final Collection collection2) {
        super(collection, collection2);
        this.h = h;
        this.f = timeUnit.toMillis(n);
        this.g = timeUnit.toMillis(n2);
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        if (this.h <= 0 || this.i < this.h) {
            if (this.i > 0) {
                this.k = (long)(Math.pow(2.0, -1 + this.i) * this.f);
            }
            else {
                this.k = 0L;
            }
            ++this.i;
            this.j += this.k;
            if (this.k + this.j <= this.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public long b(final x x) {
        return this.k;
    }
}
