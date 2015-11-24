// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.provider.b;
import com.twitter.library.provider.f;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.internal.android.service.a;

public class bc extends a
{
    private final Context a;
    private final long e;
    private final long f;
    private final boolean g;
    
    public bc(final Context a, final Session session, final long f, final boolean g) {
        super(bc.class.getName());
        this.a = a;
        this.e = session.g();
        this.f = f;
        this.g = g;
    }
    
    protected Boolean a() {
        int n = 1;
        final f a = com.twitter.library.provider.f.a(this.a, this.e);
        final b b = new b(this.a.getContentResolver());
        final long[] array = new long[n];
        array[0] = this.f;
        final int a2 = a.a(array, b, this.g);
        b.a();
        if (a2 <= 0) {
            n = 0;
        }
        return n != 0;
    }
    
    protected Boolean b() {
        return false;
    }
}
