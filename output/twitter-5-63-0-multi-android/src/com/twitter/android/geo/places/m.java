// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.api.geo.i;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.as;
import com.twitter.library.client.au;

class m implements au
{
    private final as a;
    private final Context b;
    private final Session c;
    private n d;
    
    public m(final as a, final Context b, final Session c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a() {
        this.d = null;
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        if (this.d != null) {
            this.d.a(((i)y).e());
        }
    }
    
    public void a(final Coordinate coordinate, final n d) {
        this.d = d;
        this.a.a(new i(this.b, this.c, coordinate), 0, 0, this);
    }
    
    @Override
    public void b(final int n, final y y) {
    }
}
