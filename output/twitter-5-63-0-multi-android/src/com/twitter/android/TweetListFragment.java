// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.TwitterListFragment;
import android.view.ViewConfiguration;
import java.io.Serializable;
import android.os.Parcelable;
import android.view.View$OnTouchListener;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import com.twitter.internal.android.service.c;
import android.widget.AbsListView;
import com.twitter.library.client.Session;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.android.widget.RelatedTweetsFeedbackDialogFragment;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.e;
import com.twitter.library.service.y;
import com.twitter.library.util.FriendshipCache;
import android.content.SharedPreferences;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.er;
import com.twitter.android.client.bv;
import com.twitter.android.widget.ScrollingHeaderListFragment;

public abstract class TweetListFragment extends ScrollingHeaderListFragment implements bv, mz, vk, er
{
    private static ww a;
    protected Tweet J;
    protected ul K;
    protected vf L;
    protected vi M;
    protected wt N;
    protected int O;
    protected TwitterScribeItem P;
    protected long Q;
    protected boolean R;
    protected boolean S;
    protected pk T;
    protected long U;
    private SharedPreferences b;
    private FriendshipCache c;
    
    static {
        TweetListFragment.a = new ww();
    }
    
    public TweetListFragment() {
        this.K = null;
        this.L = null;
        this.M = null;
        this.O = -1;
        this.P = null;
        this.Q = Long.MIN_VALUE;
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (n == -4) {
            final com.twitter.library.api.search.e e = (com.twitter.library.api.search.e)y;
            int n2;
            if (((aa)e.l().b()).a()) {
                final long a = e.a;
                final long e2 = e.e;
                String s;
                if ("good".equals(e.f)) {
                    s = "good_feedback_%d_%d";
                }
                else {
                    s = "bad_feedback_%d_%d";
                }
                final String format = String.format(s, a, e2);
                if (this.b == null) {
                    this.b = this.an.getSharedPreferences("related_tweets", 0);
                }
                this.b.edit().putBoolean(format, true).apply();
                if (this.T != null) {
                    this.T.notifyDataSetChanged();
                }
                n2 = 2131298244;
            }
            else {
                n2 = 2131298243;
            }
            Toast.makeText(this.an, n2, 1).show();
        }
    }
    
    @Override
    protected void a(final long n, final long n2) {
        this.N.a(n);
    }
    
    protected void a(final long n, final String s) {
        this.N.a(n, s);
    }
    
    protected void a(final long n, final String s, final long n2) {
        this.N.a(n, s, n2);
    }
    
    public void a(final long n, final boolean b) {
        final Bundle bundle = new Bundle();
        bundle.putLong("status_id", this.U);
        bundle.putLong("related_status_id", n);
        bundle.putBoolean("is_good", b);
        final FragmentActivity activity = this.getActivity();
        int n2;
        if (b) {
            n2 = 2131361825;
        }
        else {
            n2 = 2131361824;
        }
        final RelatedTweetsFeedbackDialogFragment relatedTweetsFeedbackDialogFragment = new RelatedTweetsFeedbackDialogFragment((Context)activity, bundle, n2);
        relatedTweetsFeedbackDialogFragment.a(this);
        relatedTweetsFeedbackDialogFragment.show(this.getFragmentManager(), null);
    }
    
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        this.N.a(view, tweet, bundle);
    }
    
    @Override
    public void a(final String s, final String s2, final Bundle bundle) {
        final long long1 = bundle.getLong("status_id");
        final long long2 = bundle.getLong("related_status_id");
        final boolean boolean1 = bundle.getBoolean("is_good");
        final FragmentActivity activity = this.getActivity();
        final Session af = this.aF();
        String s3;
        if (boolean1) {
            s3 = "good";
        }
        else {
            s3 = "bad";
        }
        this.a(new com.twitter.library.api.search.e((Context)activity, af, long1, long2, s3, s, s2), -4, 0);
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.N.b();
        }
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        boolean b = true;
        if (n == 0 && this.af) {
            this.ad();
        }
        if (this.N != null && this.N.a(absListView, n)) {
            return b;
        }
        if (n == 2 || n == 0) {
            if (n != 2) {
                b = false;
            }
            this.m(b);
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        return (this.N != null && this.N.a(absListView, n, n2, n3, b)) || super.a(absListView, n, n2, n3, b);
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.N.a();
    }
    
    @Override
    public xb b(final View view) {
        if (view.getTag() instanceof pm) {
            return ((pm)view.getTag()).a;
        }
        return null;
    }
    
    protected String b(final Tweet tweet) {
        return this.N.a(tweet);
    }
    
    public void e(final long u) {
        if (u != 0L) {
            this.U = u;
        }
    }
    
    @Override
    protected void i() {
        super.i();
        final oa oa = new oa(this.an, this.aF().g());
        oa.a(new wx(this));
        as.a(this.an).a(oa);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.S && this.T == null) {
            this.T = new pk((Context)this.getActivity(), this.aw(), this, this.c, this.U);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        boolean s = true;
        super.onCreate(bundle);
        if (bundle != null) {
            this.J = (Tweet)bundle.getParcelable("state_delete_key");
            this.Q = bundle.getLong("state_revealer_id", Long.MIN_VALUE);
            this.c = (FriendshipCache)bundle.getSerializable("friendship_cache");
            this.U = bundle.getLong("status_id");
        }
        final Bundle arguments = this.getArguments();
        this.R = ((arguments == null || arguments.getBoolean("en_act", s)) && s);
        if (arguments == null || !arguments.getBoolean("show_related_in_fragment", false)) {
            s = false;
        }
        this.S = s;
        this.a((bv)this);
        if (this.S) {
            if (this.c == null) {
                this.c = new FriendshipCache();
            }
            if (this.U == 0L && arguments != null) {
                this.U = arguments.getLong("status_id");
            }
        }
    }
    
    @Override
    public void onDestroy() {
        if (this.T != null) {
            this.T.swapCursor(null);
        }
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        if (this.M != null) {
            this.b((View$OnTouchListener)this.M);
            this.M = null;
        }
        super.onDestroyView();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.N.a(this.Y());
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.J != null) {
            bundle.putParcelable("state_delete_key", (Parcelable)this.J);
        }
        if (this.L != null) {
            bundle.putLong("state_revealer_id", this.L.a());
        }
        if (this.c != null && !this.c.a()) {
            bundle.putSerializable("friendship_cache", (Serializable)this.c);
        }
        if (this.U != 0L) {
            bundle.putLong("status_id", this.U);
        }
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.N.a(this.aF().g());
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentActivity activity = this.getActivity();
        if ((this.ae || this.aF().d()) && (this.R || this.S)) {
            if (this.K == null) {
                this.K = new ul(this, this.Z);
            }
            (this.L = new vf(activity.getApplicationContext(), this.K)).a(this.Q);
            (this.M = new vi(this, this.L, this.Y(), ViewConfiguration.get((Context)activity).getScaledTouchSlop())).a(this);
            this.a((View$OnTouchListener)this.M);
        }
        this.N = TweetListFragment.a.a((Context)activity, this.Z, this.O, this.P, true);
    }
    
    @Override
    public void y_() {
    }
}
