// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.android.xc;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.UserSettings;
import android.os.Bundle;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.TwitterScribeLog;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.twitter.util.f;
import com.twitter.library.provider.cn;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import android.support.v4.content.Loader;
import android.database.Cursor;
import com.twitter.library.api.timeline.al;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.widget.ListView;
import com.twitter.internal.android.service.a;
import android.content.Context;
import com.twitter.library.api.search.h;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.k;
import com.twitter.android.TimelineFragment;

public class TrendsPlusFragment extends TimelineFragment
{
    private k k;
    private String l;
    private long m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private n r;
    
    private void M() {
        if (!CollectionUtils.a((Collection)this.i)) {
            final h h = (h)new h((Context)this.getActivity(), this.aF()).c(5);
            h.f = CollectionUtils.c(this.i);
            this.a(h);
        }
    }
    
    private void N() {
        final int a = this.r.a(this.q);
        final ListView y = this.Y();
        final int paddingLeft = y.getPaddingLeft();
        final int paddingRight = y.getPaddingRight();
        if (a != paddingLeft || a != paddingRight) {
            y.setPadding(a, y.getPaddingTop(), a, y.getBottom());
        }
    }
    
    public void L() {
        this.n = true;
        this.A_();
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        if (n == 28) {
            this.c(y.b);
            this.c_(y.R());
            if (((aa)y.l().b()).a()) {
                if (this.aa != null) {
                    this.aa.setVisibility(8);
                }
                if (y instanceof com.twitter.library.api.timeline.al) {
                    final com.twitter.library.api.timeline.al al = (com.twitter.library.api.timeline.al)y;
                    final boolean q = this.q;
                    this.q = al.f();
                    if (q != this.q) {
                        this.N();
                    }
                    if (al.e() && !al.Q()) {
                        this.a(true);
                    }
                }
                this.k.a().a(this.l, System.currentTimeMillis()).apply();
            }
            return;
        }
        super.a(n, y);
    }
    
    @Override
    protected void a(final Cursor cursor) {
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        super.a(loader, cursor);
        if (cursor.getCount() > 0) {
            final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)com.twitter.util.f.a(cursor.getBlob(cn.D));
            this.q = (twitterTopic$TrendsPlus != null && twitterTopic$TrendsPlus.isDegraded);
        }
    }
    
    @Override
    protected void a(final View view, final int n, final int n2) {
        final TransitionDrawable backgroundDrawable = (TransitionDrawable)this.getActivity().getResources().getDrawable(2130839528);
        view.setBackgroundDrawable((Drawable)backgroundDrawable);
        backgroundDrawable.startTransition(500);
    }
    
    @Override
    protected void a_(final int n) {
        if (n == 5 && !this.p()) {
            this.g(false);
            return;
        }
        super.a_(n);
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.aw().a(new TwitterScribeLog(this.m).b("trendsplus", null, null, null, "exit"));
        this.M();
    }
    
    @Override
    protected void c() {
        super.c();
        this.aw().a(new TwitterScribeLog(this.m).b("trendsplus", null, null, null, "enter"));
    }
    
    @Override
    protected com.twitter.library.service.y g(final int p) {
        if (this.O == 28) {
            final com.twitter.library.api.timeline.al al = new com.twitter.library.api.timeline.al((Context)this.getActivity(), this.aF(), p != 3);
            if (p == 4) {
                al.j("Not triggered by a user action.");
            }
            al.b("scribe_event", TwitterListFragment.a(this.Z.a(), null, p));
            this.p = p;
            return al;
        }
        return super.g(p);
    }
    
    @Override
    protected void i() {
        this.g.clear();
        this.M();
        super.i();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        boolean boolean1 = true;
        super.onCreate(bundle);
        this.o = (bundle == null && boolean1);
        this.j(boolean1);
        final Bundle arguments = this.getArguments();
        final UserSettings j = this.aF().j();
        final boolean b = j != null && j.s;
        if (bundle != null) {
            if (b) {
                boolean1 = false;
            }
            boolean1 = bundle.getBoolean("state_is_degraded", boolean1);
        }
        else if (b) {
            boolean1 = false;
        }
        this.q = boolean1;
        final String string = arguments.getString("timeline_tag");
        if (string != null) {
            this.l = string + "_" + "refresh_time";
        }
        else {
            this.l = "refresh_time";
        }
        this.k = new k((Context)this.getActivity(), this.aF().e(), "trendsplus");
        this.m = this.aF().g();
        this.r = new n(this.getActivity().getResources());
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View a = this.a(layoutInflater, 2130969152, viewGroup);
        this.N();
        if (this.aa != null) {
            this.aa.setOnClickListener((View$OnClickListener)new com.twitter.android.trends.m(this));
        }
        return a;
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putBoolean("state_is_degraded", this.q);
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.o = false;
    }
    
    @Override
    protected boolean r() {
        if (this.p != 1) {
            if (this.n) {
                this.n = false;
                return true;
            }
            long n;
            if (this.q) {
                n = 900000L;
            }
            else {
                n = 300000L;
            }
            boolean b;
            if (System.currentTimeMillis() > n + this.k.getLong(this.l, 0L)) {
                b = true;
            }
            else {
                b = false;
            }
            if (((xc)this.W).isEmpty() || (b && this.o)) {
                return true;
            }
        }
        return false;
    }
}
