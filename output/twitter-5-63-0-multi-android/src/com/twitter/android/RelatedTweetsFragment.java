// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.twitter.android.util.bb;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.os.Parcelable;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import com.twitter.refresh.widget.a;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.AdapterView$OnItemClickListener;

public class RelatedTweetsFragment extends SearchFragment implements AdapterView$OnItemClickListener
{
    private boolean a;
    
    private void U() {
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("related_tweets")).d("tweet"));
    }
    
    protected boolean A_() {
        this.getLoaderManager().restartLoader(0, null, this);
        return true;
    }
    
    @Override
    protected String M_() {
        return "";
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
                Toast.makeText(this.an, 2131297533, 1).show();
                this.c_(r);
            }
            else if (r == 3) {
                if (g.t() == 0) {
                    this.c_(3);
                }
                if (this.j) {
                    this.B();
                }
            }
            else if (g.t() == 0) {
                if (r == 1) {
                    this.h = true;
                }
                this.c_(r);
            }
        }
    }
    
    @Override
    protected void a(final Context context) {
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final pk t = this.T;
        final int l = this.l;
        if (this.a) {
            this.A();
        }
        final a e = this.E();
        t.swapCursor(cursor);
        if (this.a) {
            this.c_(l);
            if (l == 2) {
                this.a(e, true);
                this.l = 3;
            }
            return;
        }
        if (this.T.isEmpty()) {
            this.c(3);
        }
        this.a = true;
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        if (n >= this.Y().getHeaderViewsCount()) {
            final com.twitter.android.client.c aw = this.aw();
            final long g = this.aF().g();
            final String d = SearchFragment.d(this.m);
            final pm pm = (pm)view.getTag();
            if (pm.g == 0) {
                final Tweet tweet = pm.a.f.getTweet();
                this.startActivity(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("association", (Parcelable)this.Z));
                aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(null, tweet, this.Z, null).b(new String[] { TwitterScribeLog.a(this.Z, "tweet", "tweet", "click") })).a(this.Z)).a(this.u, d, this.d, this.c));
            }
        }
    }
    
    @Override
    protected void a(final String s) {
    }
    
    protected void a(final boolean b) {
        super.a(b);
        final pk t = this.T;
        if (b) {
            this.a_(5);
            this.A_();
        }
        else {
            if (t.getCursor() == null) {
                this.a_(5);
                this.q();
                return;
            }
            if (t.isEmpty() || this.F()) {
                this.c(3);
                this.a = true;
            }
        }
    }
    
    @Override
    protected int b(final long n) {
        if (this.T != null) {
            return this.T.a(n);
        }
        return 0;
    }
    
    @Override
    protected boolean c(final int l) {
        if (!this.f(l)) {
            return false;
        }
        this.a_(this.l = l);
        final pk t = this.T;
        int n = 0;
        Label_0090: {
            switch (l) {
                default: {
                    throw new IllegalArgumentException("Invalid fetch type: " + l);
                }
                case 4: {
                    n = 1;
                    break Label_0090;
                }
                case 1: {
                    n = 2;
                    break Label_0090;
                }
                case 2: {
                    this.am();
                    n = 1;
                }
                case 3: {
                    this.a(bb.a(this.U, (Context)this.getActivity(), this.aw(), this.aF(), this.s, this.H(), n), 2, l);
                    return true;
                }
            }
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.Z == null) {
            this.U();
        }
        this.Y().setAdapter((ListAdapter)this.T);
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return bb.a(this.s, (Context)this.getActivity(), this.aF().g());
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.getActivity().startActivity(new Intent((Context)this.getActivity(), (Class)GalleryActivity.class).setData(com.twitter.library.provider.ae.a(aw.a, this.aF().g())).putExtra("prj", cc.a).putExtra("sel", "flags&1537 !=0 AND search_id=? AND type_id=?").putExtra("selArgs", new String[] { String.valueOf(this.s), String.valueOf(((ro)adapterView.getTag()).c) }).putExtra("orderBy", "type_id ASC, _id ASC").putExtra("id", n2).putExtra("context", 2).putExtra("item", (Parcelable)null));
    }
    
    public void onLoaderReset(final Loader loader) {
        this.T.swapCursor(null);
    }
    
    protected boolean p() {
        return this.T.isEmpty();
    }
    
    protected void q() {
        this.getLoaderManager().initLoader(0, null, this);
    }
    
    @Override
    public int t() {
        return this.m;
    }
    
    @Override
    protected boolean w() {
        return true;
    }
    
    @Override
    protected int x() {
        if (this.T != null) {
            return this.T.getCount();
        }
        return 0;
    }
    
    @Override
    protected void y() {
    }
    
    @Override
    protected void z() {
    }
}
