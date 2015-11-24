// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.service.y;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.bf;
import com.twitter.android.kg;
import com.twitter.library.api.z;
import android.content.Context;
import com.twitter.library.client.Session;
import com.twitter.android.qb;
import com.twitter.android.qc;

public class s implements ae, q, qc
{
    private final qb a;
    private final ad b;
    private final Session c;
    private final Context d;
    private final r e;
    
    public s(final r e, final ad b, final Session c, final Context d, final qb a) {
        this.e = e;
        (this.b = b).a(this);
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    private void c() {
        if (!this.d()) {
            this.e.k();
            return;
        }
        if (z.d(this.b.d())) {
            this.e.m();
            return;
        }
        this.e.l();
    }
    
    private boolean d() {
        final TwitterUser a = this.b.a();
        return !kg.a(this.d) && a != null && !z.e(this.b.d()) && bf.a(a.flags) && !this.b.b();
    }
    
    @Override
    public void a() {
        this.a.a(new oe(this.d, this.c).a(this.b.e()), 4000, this);
        this.b.b(8192);
        this.e.m();
    }
    
    @Override
    public void a(final int n, final y y) {
        if (!y.X()) {
            switch (n) {
                case 4000: {
                    this.b.c(8192);
                    this.e.l();
                }
                case 4001: {
                    this.b.b(8192);
                    this.e.m();
                }
            }
        }
    }
    
    @Override
    public void a(final ad ad) {
        this.c();
    }
    
    @Override
    public void a(final r r) {
        this.c();
    }
    
    @Override
    public void b() {
        this.a.a(new of(this.d, this.c).a(this.b.e()), 4001, this);
        this.b.c(8192);
        this.e.l();
    }
}
