// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.twitter.library.provider.be;
import android.net.Uri;
import com.twitter.android.mz;
import com.twitter.library.widget.c;
import com.twitter.android.pg;
import com.twitter.android.kg;
import com.twitter.android.ou;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.metrics.d;

public class ak extends ab
{
    private final d f;
    private final boolean g;
    
    public ak(final FragmentActivity fragmentActivity, final az az, final ad ad, final TwitterScribeAssociation twitterScribeAssociation, final d f, final boolean g) {
        super(fragmentActivity, az, ad, twitterScribeAssociation);
        this.f = f;
        this.g = g;
    }
    
    @Override
    public ou b() {
        if (this.e == null) {
            int n;
            if (kg.a(this.c) || this.a.d()) {
                n = 2130837600;
            }
            else {
                n = 0;
            }
            final pg pg = new pg(this.c, 0, n, this, this.b.c(), 0, true, false, this.g);
            pg.a(this);
            int n2 = 3;
            if (this.g) {
                n2 = 35;
            }
            (this.e = new ou(this.c, pg, this.d(), n2)).a(this.b.a(), this.b.b());
        }
        return this.e;
    }
    
    @Override
    protected Uri c() {
        return be.y;
    }
    
    @Override
    protected int d() {
        return 10;
    }
    
    @Override
    protected int e() {
        return 3;
    }
    
    @Override
    protected int f() {
        return 6;
    }
    
    @Override
    protected int g() {
        return 2;
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    protected void i() {
    }
    
    @Override
    protected String j() {
        return "similar_to";
    }
    
    @Override
    protected void l() {
        if (this.f != null) {
            this.f.a(2);
        }
    }
    
    @Override
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (this.e.c(n)) {
            final Intent intent = (Intent)this.e.getItem(n);
            if (intent != null) {
                this.c.startActivity(intent);
            }
            return;
        }
        super.onItemClick(adapterView, view, n, n2);
    }
}
