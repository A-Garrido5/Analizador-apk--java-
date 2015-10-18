// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import com.twitter.library.api.geo.h;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.client.au;

public class e implements au
{
    private final Context a;
    private final az b;
    private final as c;
    private final long d;
    private f e;
    
    public e(final Context a) {
        this.a = a;
        this.b = az.a(a);
        this.c = as.a(a);
        this.d = this.b.b().g();
    }
    
    public void a() {
        this.e = null;
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        if (this.e != null) {
            this.e.a(((com.twitter.library.api.geo.f)y).e());
        }
        this.e = null;
    }
    
    public void a(final String s, final f e, final String s2, final String s3, final String s4, final boolean b) {
        if (this.e == null) {
            this.e = e;
            this.c.a(new h().a(this.a).a(this.b.b()).a(s).a(this.d).b(s2).d(s4).a(b).c(s3).a(), 0, 0, this);
        }
    }
    
    @Override
    public void b(final int n, final y y) {
    }
}
