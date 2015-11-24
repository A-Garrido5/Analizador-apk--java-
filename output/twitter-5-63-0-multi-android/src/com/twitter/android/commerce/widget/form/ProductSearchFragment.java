// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.view.ViewGroup;
import android.os.Bundle;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.app.Activity;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import android.os.Parcelable;
import com.twitter.library.api.search.g;
import android.content.Context;
import com.twitter.android.kg;
import com.twitter.android.SearchFragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.SearchResultsFragment;

public class ProductSearchFragment extends SearchResultsFragment
{
    private com.twitter.android.commerce.widget.form.d a;
    private boolean ao;
    
    private boolean a(final int l, final long n) {
        if (!this.f(l)) {
            return false;
        }
        this.a_(this.l = l);
        switch (l) {
            default: {
                return false;
            }
            case 3: {
                final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { TwitterListFragment.a(this.B, this.M_(), l) })).a(this.u, SearchFragment.d(this.m), this.d, this.c);
                final FragmentActivity activity = this.getActivity();
                final g c = new g((Context)activity, this.aF(), n, this.u, this.O(), this.v, this.t, 0, this.A, false, kg.a((Context)activity)).a(1, false, false, false).a(this.D, this.E).c(19);
                this.a(c);
                c.a("scribe_log", (Parcelable)twitterScribeLog);
                if (this.c) {
                    c.a(this.H.a());
                }
                this.a(c, 2, l);
                return true;
            }
        }
    }
    
    private void aG() {
        final View headerView = this.a.getHeaderView();
        if (headerView instanceof e) {
            ((e)headerView).a(0);
        }
    }
    
    private ViewMoreContainer aH() {
        final ViewMoreContainer viewMoreContainer = new ViewMoreContainer(this.getActivity(), this.u, this.t, 1);
        viewMoreContainer.setId(2131886100);
        viewMoreContainer.setDescription(this.getString(2131297975));
        this.Y().addFooterView((View)viewMoreContainer);
        return viewMoreContainer;
    }
    
    @Override
    public void R() {
    }
    
    @Override
    public void S() {
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        if (cursor.getCount() > 0 && !this.ao) {
            final ViewMoreContainer ah = this.aH();
            this.ao = true;
            if (this.a != null) {
                this.a.a(ah);
                this.aG();
            }
        }
        super.a(loader, cursor);
    }
    
    public void a(final com.twitter.android.commerce.widget.form.d a) {
        this.a = a;
    }
    
    @Override
    protected boolean c(final int n) {
        return this.a(n, this.s);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        if (this.a != null && this.a.getHeaderView() != null) {
            this.Y().addHeaderView(this.a.getHeaderView(), (Object)null, false);
        }
        final View inflate = View.inflate((Context)this.getActivity(), 2130968754, (ViewGroup)null);
        inflate.setVisibility(8);
        this.Y().setEmptyView(inflate);
        super.onActivityCreated(bundle);
    }
}
