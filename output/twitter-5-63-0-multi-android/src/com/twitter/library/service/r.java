// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.util.Arrays;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Collection;

public final class r extends q
{
    private static final Collection a;
    private static final Collection e;
    private final int f;
    private int g;
    
    static {
        a = Collections.singleton(HttpOperation$RequestMethod.a);
        e = Arrays.asList(500, 502);
    }
    
    public r(final int f) {
        super(r.a, r.e);
        this.f = f;
    }
    
    public r(final int f, final Collection collection, final Collection collection2) {
        super(collection, collection2);
        this.f = f;
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        return this.g++ < this.f;
    }
}
