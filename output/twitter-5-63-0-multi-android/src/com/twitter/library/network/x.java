// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.d;

public class x implements d
{
    private final a a;
    
    public x(final a a) {
        this.a = a;
    }
    
    @Override
    public void a(final HttpOperation httpOperation) {
        this.a.a(httpOperation, httpOperation.r());
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final Exception ex) {
    }
    
    @Override
    public void b(final HttpOperation httpOperation) {
    }
}
