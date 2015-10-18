// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListView;
import com.twitter.android.client.u;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.refresh.widget.a;
import android.content.Context;

public class LandingPageSearchResultsFragment extends SearchResultsFragment
{
    protected String a;
    private boolean ao;
    private int ap;
    
    @Override
    protected void a(final Context context) {
        if (this.ao) {
            super.a(context);
            return;
        }
        this.A();
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        if (this.b(a.b) >= this.Y().getHeaderViewsCount() || !b) {
            this.b(1, a.c);
        }
    }
    
    protected void ae_() {
        this.ao = false;
        super.ae_();
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968903, viewGroup);
    }
    
    @Override
    protected void c() {
        this.ao = true;
        super.c();
    }
    
    protected void c_(final int n) {
        super.c_(n);
        if (n == 2 && this.G != null) {
            this.G.a();
        }
    }
    
    protected void k() {
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.I != null) {
            this.a(this.I);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a = this.getArguments().getString("scribe_component");
        this.ap = this.getResources().getDimensionPixelSize(2131558806);
    }
    
    @Override
    public void r() {
        final ListView y = this.Y();
        if (y != null && y.getFirstVisiblePosition() != 0) {
            this.b(1, this.ap);
        }
        if (this.o > 0) {
            this.e();
        }
    }
    
    protected boolean z_() {
        return true;
    }
}
