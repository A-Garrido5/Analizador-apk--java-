// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.support.v4.content.Loader;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.twitter.library.provider.be;
import android.net.Uri;
import android.widget.ListAdapter;
import com.twitter.android.mz;
import com.twitter.library.view.k;
import com.twitter.library.widget.c;
import com.twitter.android.pg;
import com.twitter.android.ou;
import android.database.Cursor;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import com.twitter.android.widget.ec;
import android.view.View$OnClickListener;

public class e extends ab implements View$OnClickListener, d
{
    private final ec f;
    private final ListView g;
    private final View h;
    
    public e(final FragmentActivity fragmentActivity, final az az, final ad ad, final TwitterScribeAssociation twitterScribeAssociation, final View h) {
        super(fragmentActivity, az, ad, twitterScribeAssociation);
        this.f = new ec(this.c, this.d);
        this.h = h;
        (this.g = (ListView)this.h.findViewById(2131887178)).setOnItemClickListener((AdapterView$OnItemClickListener)this);
    }
    
    private int a(final boolean b) {
        if (this.e == null) {
            return 0;
        }
        int n;
        if (b) {
            n = this.e.getCount();
        }
        else {
            n = this.g.getChildCount();
        }
        int i = 0;
        int n2 = 0;
        while (i < n) {
            View view;
            if (b) {
                view = this.e.getView(i, null, (ViewGroup)this.g);
                view.measure(0, 0);
            }
            else {
                view = this.g.getChildAt(i);
            }
            n2 += view.getMeasuredHeight();
            ++i;
        }
        if (!b && n < this.e.getCount()) {
            ++n;
        }
        return n2 + this.g.getDividerHeight() * (n - 1);
    }
    
    private boolean a(final boolean b, final boolean b2) {
        final int a = this.a(b2);
        if (a != this.g.getLayoutParams().height || b) {
            this.g.getLayoutParams().height = a;
            this.g.requestLayout();
            return true;
        }
        return false;
    }
    
    public void a() {
        this.h.setVisibility(8);
        if (this.e != null) {
            this.e.a((Cursor)null);
        }
    }
    
    public ou b() {
        if (this.e == null) {
            final pg pg = new pg(this.c, 0, 2130837600, this, this.b.c(), true);
            pg.a(this.f);
            pg.a(this);
            (this.e = new ou(this.c, pg, this.d(), 19)).a((View$OnClickListener)this);
            this.e.a(this.b.a(), this.b.b());
            this.g.setAdapter((ListAdapter)this.e);
        }
        return this.e;
    }
    
    @Override
    protected Uri c() {
        return be.z;
    }
    
    @Override
    protected int d() {
        return 20;
    }
    
    @Override
    protected int e() {
        return 3;
    }
    
    @Override
    protected int f() {
        return 3;
    }
    
    @Override
    protected int g() {
        return 3;
    }
    
    @Override
    protected void h() {
        super.h();
        this.h.setVisibility(0);
        this.i();
    }
    
    @Override
    protected void i() {
        if (!this.a(true, true)) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = this.g.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new f(this, viewTreeObserver));
    }
    
    @Override
    protected String j() {
        return "user_similarities_list";
    }
    
    @Override
    public boolean k() {
        return super.k() && this.g.getVisibility() == 0;
    }
    
    @Override
    protected void l() {
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886108) {
            this.a();
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        super.onLoaderReset(loader);
        if (loader.getId() == this.g()) {
            this.a();
        }
    }
}
