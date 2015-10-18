// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.service.d;
import com.twitter.library.api.ad;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class i extends c
{
    private final Coordinate a;
    private j e;
    
    public i(final Context context, final Session session, final Coordinate a) {
        super(context, i.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "geo", "reverse_geocode" }).a("lat", this.a.a()).a("long", this.a.b()).a("granularity", "city").a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final ad ad) {
        super.a(httpOperation, aa, ad);
        if (httpOperation.j()) {
            this.e = (j)ad.a();
        }
    }
    
    protected k b() {
        return new k();
    }
    
    public j e() {
        return this.e;
    }
}
