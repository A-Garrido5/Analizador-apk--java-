// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.internal.android.service.a;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.internal.android.service.c;

class cc implements c
{
    private final Context a;
    private final Session b;
    
    public cc(final Context a, final Session b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final Object o, final a a) {
    }
    
    @Override
    public void a_(final a a) {
        final Long n = (Long)a.l().b();
        if (!a.isCancelled()) {
            as.a(this.a).a(new ej(this.a, this.b, n), (z)null);
        }
    }
    
    @Override
    public void b(final a a) {
    }
}
