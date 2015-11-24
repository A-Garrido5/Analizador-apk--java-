// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.android.xc;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cq;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aq;
import com.twitter.android.ProfileActivity;
import com.twitter.android.composer.au;
import android.text.TextUtils;
import com.twitter.android.commerce.grid.StaggeredGridView;
import android.widget.AbsListView;
import com.twitter.refresh.widget.a;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.android.commerce.util.c;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import com.twitter.library.provider.ad;
import android.view.View;
import android.widget.ListView;
import android.view.ViewGroup;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.FrameLayout;
import com.twitter.android.client.bv;
import android.view.View$OnClickListener;
import com.twitter.android.TimelineFragment;

public class CommerceCollectionFragment extends TimelineFragment implements View$OnClickListener, bv
{
    private FrameLayout k;
    private com.twitter.android.commerce.view.e l;
    private CommerceCollectionActivity m;
    private boolean n;
    private com.twitter.android.commerce.view.d o;
    
    private TwitterScribeLog a(final String s) {
        return (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.m() + "::commerce:timeline:" + s })).a(TwitterScribeItem.a(this.m.j()));
    }
    
    private void d(final boolean b) {
        final ToolBar aq = this.aq();
        if (aq == null) {
            return;
        }
        if (b) {
            if (!this.n) {
                this.n = true;
                aq.a(this.l.c, true);
            }
        }
        else if (this.n) {
            aq.a("", this.n = false);
        }
        aq.invalidate();
    }
    
    protected int N_() {
        return 2130968652;
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        final aa aa = (aa)y.l().b();
        final f f = (f)y;
        if (y.R() == 2) {
            this.f();
        }
        this.c.g();
        this.v();
        Label_0150: {
            if (!aa.a()) {
                if (aa.c() != 401) {
                    break Label_0150;
                }
                Toast.makeText(this.an, 2131298015, 1).show();
            }
        Label_0121_Outer:
            while (true) {
                if (y.R() == 3 && aa.a() && this.aD()) {
                    this.getLoaderManager().restartLoader(1, null, this);
                }
                while (true) {
                    try {
                        this.l.a(f.a.b.profileHeaderImageUrl);
                        if (this.o != null) {
                            this.o.a(n, f);
                        }
                        this.c(y.b);
                        return;
                        Toast.makeText(this.an, 2131298000, 1).show();
                        continue Label_0121_Outer;
                    }
                    catch (NullPointerException ex) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            default: {
                super.a(loader, cursor);
                break;
            }
            case 1: {
                if (cursor != null && cursor.moveToFirst()) {
                    final com.twitter.android.commerce.view.e l = this.l;
                    l.a(cursor);
                    final ToolBar aq = this.aq();
                    if (aq != null) {
                        aq.setTitle(l.c);
                    }
                    l.a((ViewGroup)this.k);
                    this.ar();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final ListView listView, final View view, final int n, final long n2) {
        final Cursor cursor = (Cursor)listView.getItemAtPosition(n);
        if (cursor != null) {
            final Tweet a = new com.twitter.library.provider.ad(cursor).a();
            final FragmentActivity activity = this.getActivity();
            final TwitterScribeItem a2 = TwitterScribeItem.a((Context)activity, a, null, null);
            a2.g = n - 1;
            this.aw().a(this.a("click").a(a2));
            final Intent a3 = com.twitter.android.commerce.util.c.a(activity, a);
            if (a3 != null) {
                activity.startActivity(a3);
            }
        }
    }
    
    protected void a(final ToolBar toolBar) {
        super.a(toolBar);
        toolBar.a(2131887411).c(0);
        toolBar.a("", false);
        toolBar.invalidate();
    }
    
    @Override
    protected void a(final a a, final boolean b) {
    }
    
    protected void a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951624, toolBar);
    }
    
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        boolean b2 = true;
        final StaggeredGridView staggeredGridView = (StaggeredGridView)absListView;
        final ToolBar aq = this.aq();
        if (this.l != null && staggeredGridView != null && aq != null) {
            final int n4 = this.l.b() + staggeredGridView.getDistanceToTop() - aq.getHeight();
            final boolean b3 = n4 + this.l.a() < 0 && b2;
            if (n4 >= 0) {
                b2 = false;
            }
            this.m.b(b2);
            this.d(b3);
        }
        return false;
    }
    
    public boolean a(final jx jx) {
        final String h = this.l.h;
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887411: {
                if (!TextUtils.isEmpty((CharSequence)h)) {
                    this.aw().a(this.a("share"));
                    this.startActivity(com.twitter.android.composer.au.a((Context)this.getActivity()).a("\n" + h, new int[] { 0, 0 }).p());
                }
                return true;
            }
        }
    }
    
    protected void af() {
    }
    
    public void b(final int n, final com.twitter.library.service.y y) {
        this.a(y.b, y.R(), this.X);
    }
    
    @Override
    public void f() {
        super.f();
        ((StaggeredGridView)this.Y()).setScrollable(true);
    }
    
    public void i() {
        ((StaggeredGridView)this.Y()).setScrollable(false);
        super.i();
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131886393: {
                this.startActivity(new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", this.l.e));
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.m = (CommerceCollectionActivity)this.getActivity();
        if (this.m != null) {
            this.o = this.m;
        }
        if (bundle == null) {
            final Bundle arguments = this.getArguments();
            arguments.putBoolean("refresh", false);
            arguments.putInt("type", 31);
            arguments.putInt("empty_title", 2131296465);
            arguments.putInt("empty_desc", 2131296471);
        }
        this.a((bv)this);
        super.onCreate(bundle);
        this.j(true);
        this.aw().a(this.a("impression"));
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                return super.onCreateLoader(n, bundle);
            }
            case 1: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.aq.a, this.X), cq.a, "ev_id=?", new String[] { this.a }, null);
            }
        }
    }
    
    public void onLoaderReset(final Loader loader) {
        switch (loader.getId()) {
            default: {
                super.onLoaderReset(loader);
            }
            case 1: {}
        }
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentActivity activity = this.getActivity();
        this.k = new FrameLayout((Context)activity);
        this.Y().addHeaderView((View)this.k);
        final com.twitter.android.commerce.view.e l = new com.twitter.android.commerce.view.e(LayoutInflater.from((Context)activity).inflate(2130968651, (ViewGroup)null), (Context)this.getActivity());
        l.a.setOnClickListener((View$OnClickListener)this);
        this.l = l;
    }
    
    protected void q() {
        super.q();
        this.getLoaderManager().initLoader(1, null, this);
    }
    
    @Override
    protected boolean r() {
        return ((xc)this.W).isEmpty() || !this.b;
    }
    
    @Override
    protected int s() {
        if (((xc)this.W).isEmpty()) {
            return 3;
        }
        return 4;
    }
}
