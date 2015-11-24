// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

import com.twitter.internal.android.service.x;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.util.Arrays;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Collection;
import com.twitter.library.service.q;

public class h extends q
{
    private static final Collection a;
    private static final Collection e;
    private final int f;
    private int g;
    
    static {
        a = Arrays.asList(HttpOperation$RequestMethod.b);
        e = Arrays.asList(500);
    }
    
    public h() {
        this(1);
    }
    
    public h(final int f) {
        super(h.a, h.e);
        this.f = f;
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        ++this.g;
        return l.a == 500 && this.g <= this.f;
    }
    
    @Override
    public long b(final x x) {
        return 1000L + (long)(100.0 * Math.random());
    }
}
