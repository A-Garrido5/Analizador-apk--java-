// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import android.os.Parcelable;
import com.twitter.android.client.TwitterListFragment;
import android.view.View$OnClickListener;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.refresh.widget.a;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.provider.cc;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import java.util.HashSet;
import java.util.ArrayList;

public class SearchPhotosFragment extends SearchFragment
{
    private String I;
    nw a;
    private boolean ao;
    private final ArrayList ap;
    private final HashSet aq;
    
    public SearchPhotosFragment() {
        this.ap = new ArrayList();
        this.aq = new HashSet();
    }
    
    @Override
    protected boolean A_() {
        this.getLoaderManager().restartLoader(0, null, this);
        return true;
    }
    
    @Override
    protected String M_() {
        return "photo_grid";
    }
    
    protected nw P_() {
        final FragmentActivity activity = this.getActivity();
        return new nw((Context)activity, this.getResources().getInteger(2131623938), cc.d, Integer.MAX_VALUE, this.b((Context)activity), new re(this, null), false);
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (n == 2) {
            this.c(y.b);
            final g g = (g)y;
            final aa aa = (aa)g.l().b();
            final int r = y.R();
            if (!aa.a()) {
                Toast.makeText(this.an, 2131297648, 1).show();
                this.c_(r);
            }
            else {
                if (g.t() == 0) {
                    if (r == 3) {
                        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { ScribeLog.a(new String[] { this.B + ":photo_grid:stream::no_results" }) })).a(this.u, SearchFragment.d(3), this.d, this.c));
                    }
                    else if (r == 1) {
                        this.h = true;
                    }
                    this.c_(r);
                    return;
                }
                if (this.j && r == 3) {
                    this.B();
                }
            }
        }
    }
    
    @Override
    protected void a(final Context context) {
        final g a = new g(context, this.aF(), this.s, this.u, this.O(), this.v, this.t, 1, this.A, false).a(this.t(), this.d, this.e, this.f);
        if (!TextUtils.isEmpty((CharSequence)this.D)) {
            a.a(this.D, this.E);
        }
        a.j("Not triggered by a user action.");
        this.a(a);
        if (this.c) {
            a.a(this.H.a());
        }
        this.a(a, 1, 2);
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        final int l = this.l;
        if (this.ao) {
            if (l == 3) {
                this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).a(this.X)).b(this.B)).c("photo_grid"));
            }
            this.A();
        }
        final a e = this.E();
        this.a.a(cursor);
        if (this.ao) {
            this.c_(l);
            if (l == 2) {
                this.a(e, true);
                this.l = 3;
            }
            return;
        }
        if (this.a.isEmpty()) {
            this.c(3);
        }
        this.ao = true;
    }
    
    @Override
    protected void a(final String s) {
        this.aw().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).g(this.I)).b(new String[] { s })).a(this.u, SearchFragment.d(3), this.d, this.c)).a(this.Z));
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        final nw a = this.a;
        if (b) {
            this.a_(5);
            this.A_();
        }
        else {
            if (a.a() == null) {
                this.a_(5);
                this.q();
                return;
            }
            if (a.isEmpty() || this.F()) {
                this.c(3);
                this.ao = true;
            }
        }
    }
    
    @Override
    protected int b(final long n) {
        if (this.a != null) {
            return this.a.a(n);
        }
        return 0;
    }
    
    protected View$OnClickListener b(final Context context) {
        return (View$OnClickListener)new rd(this, context);
    }
    
    @Override
    protected boolean c(final int l) {
        if (!this.f(l)) {
            return false;
        }
        this.a_(this.l = l);
        int n = 0;
        switch (l) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + l);
            }
            case 3: {
                n = 0;
                break;
            }
            case 2: {
                n = 1;
                this.am();
                break;
            }
            case 1: {
                n = 2;
                break;
            }
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { TwitterListFragment.a(this.B, "photo_grid", l) })).a(this.u, SearchFragment.d(3), this.d, this.c);
        final g a = new g((Context)this.getActivity(), this.aF(), this.s, this.u, this.O(), this.v, this.t, n, this.A, false).a(this.t(), this.d, this.e, this.f);
        this.a(a);
        if (!TextUtils.isEmpty((CharSequence)this.D)) {
            a.a(this.D, this.E);
        }
        a.a("scribe_log", (Parcelable)twitterScribeLog);
        if (this.c) {
            a.a(this.H.a());
        }
        this.a(a, 2, l);
        return true;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.I = this.getArguments().getString("scribe_context");
        if (this.a == null) {
            this.a(this.a = this.P_());
        }
        this.Y().setAdapter((ListAdapter)this.a);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(aw.a, this.aF().g()), cc.a, "flags&1537 !=0 AND search_id=?", new String[] { String.valueOf(this.s) }, "type_id ASC, _id ASC");
    }
    
    @Override
    public void onDestroy() {
        if (this.a != null) {
            this.a.a((Cursor)null);
        }
        super.onDestroy();
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.a.a((Cursor)null);
    }
    
    @Override
    protected boolean p() {
        return this.a.isEmpty();
    }
    
    @Override
    protected void q() {
        this.getLoaderManager().initLoader(0, null, this);
    }
    
    @Override
    public int t() {
        return 3;
    }
    
    @Override
    protected boolean w() {
        return true;
    }
    
    @Override
    protected int x() {
        if (this.a != null) {
            return this.a.getCount();
        }
        return 0;
    }
    
    @Override
    protected void y() {
        this.a(this.B + ":photo_grid:::impression");
    }
    
    @Override
    protected void z() {
        if (!this.ap.isEmpty()) {
            this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.B + ":photo_grid:stream::results" })).b(this.ap)).a(this.u, SearchFragment.d(3), this.d, this.c));
            this.ap.clear();
        }
    }
}
