// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.internal.android.service.a;
import com.twitter.android.client.c;
import com.twitter.library.client.k;
import com.twitter.library.service.ac;

final class f extends ac
{
    final /* synthetic */ long a;
    final /* synthetic */ k b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ com.twitter.android.client.c e;
    final /* synthetic */ String f;
    
    f(final long a, final k b, final boolean c, final boolean d, final com.twitter.android.client.c e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a_(final a a) {
        com.twitter.android.highlights.e.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
