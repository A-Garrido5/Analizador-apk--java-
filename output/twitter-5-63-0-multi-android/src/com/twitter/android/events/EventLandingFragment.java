// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.widget.Adapter;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.support.v4.app.Fragment;
import com.twitter.android.ul;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.os.Bundle;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.AbsListView;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.library.api.TwitterTopic;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.ScrollingHeaderActivity;
import com.twitter.library.service.y;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.twitter.android.ro;
import com.twitter.android.SearchResultsFragment;

public class EventLandingFragment extends SearchResultsFragment implements e
{
    private boolean a;
    private String ao;
    private String ap;
    private int aq;
    private final com.twitter.android.events.d ar;
    private String as;
    private int at;
    private boolean au;
    private boolean av;
    private int aw;
    private int ax;
    private int ay;
    
    public EventLandingFragment() {
        this.ar = new com.twitter.android.events.d();
        this.at = -1;
        this.aw = 0;
        this.ax = 0;
        this.ay = 0;
    }
    
    private void aG() {
        final TwitterEventActivity twitterEventActivity = (TwitterEventActivity)this.getActivity();
        final ListView y = this.Y();
        if (y != null && twitterEventActivity != null) {
            final ListAdapter adapter = y.getAdapter();
            if (this.av) {
                for (int i = 0; i < ((Adapter)adapter).getCount(); ++i) {
                    final ro ro = (ro)((Adapter)adapter).getItem(i);
                    if (ro != null && ro.n) {
                        this.aq = i;
                        break;
                    }
                }
                y.postDelayed((Runnable)new a(this, twitterEventActivity), 300L);
                this.av = false;
                this.aw = 1;
            }
        }
    }
    
    @Override
    protected String M_() {
        return this.ao;
    }
    
    @Override
    public void R() {
    }
    
    @Override
    public void S() {
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130969085, viewGroup);
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof ScrollingHeaderActivity) {
            ((ScrollingHeaderActivity)activity).a(false);
        }
    }
    
    @Override
    protected void a(final Context context) {
        if (this.a) {
            super.a(context);
            return;
        }
        this.A();
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (8 != this.m) {
            super.a(cursor);
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        this.av = (3 == this.l && this.aw == 0 && this.m == 8 && cursor.getCount() > 0);
        super.a(loader, cursor);
        this.aG();
    }
    
    @Override
    protected void a(final TwitterTopic twitterTopic) {
        if (twitterTopic != null) {
            final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)twitterTopic.a(TwitterTopic$SportsEvent.class);
            if (twitterTopic$SportsEvent != null) {
                ((TwitterEventActivity)this.getActivity()).a(twitterTopic$SportsEvent);
            }
        }
    }
    
    @Override
    protected void a(final com.twitter.refresh.widget.a a, final boolean b) {
    }
    
    public boolean a(final AbsListView absListView, final int n) {
        final TwitterEventActivity twitterEventActivity = (TwitterEventActivity)this.getActivity();
        if (twitterEventActivity.q()) {
            this.ar.a(n);
            twitterEventActivity.a(this.ar);
            this.ar.d();
            if (n == 0) {
                final ListView y = this.Y();
                final View child = y.getChildAt(0);
                if (child != null) {
                    this.ax = y.getFirstVisiblePosition();
                    this.ay = child.getTop();
                }
            }
            return super.a(absListView, n);
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        final TwitterEventActivity twitterEventActivity = (TwitterEventActivity)this.getActivity();
        if (twitterEventActivity.q()) {
            this.ar.a(absListView, n, b, this.ai);
            twitterEventActivity.a(this.ar);
            this.ar.d();
            return super.a(absListView, n, n2, n3, b);
        }
        return false;
    }
    
    protected void ae_() {
        this.a = false;
        super.ae_();
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968903, viewGroup);
    }
    
    @Override
    protected void c() {
        this.a = true;
        this.ar.d();
        this.ar.b(0);
        super.c();
    }
    
    @Override
    protected void e() {
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(this.B, this.ao, this.ap, null, "show_polled_content")).a(TwitterScribeItem.a(this.D, this.q)));
        super.e();
    }
    
    @Override
    public void e(int ay) {
        final int ax = this.ax;
        if (this.ax != 0) {
            ay = this.ay;
        }
        this.b(ax, ay);
    }
    
    @Override
    protected String e_(final int n) {
        return this.ao;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        if (bundle != null) {
            this.ao = bundle.getString("scribe_section");
            this.ap = bundle.getString("scribe_component");
            this.av = bundle.getBoolean("first_time");
            this.aw = bundle.getInt("count");
        }
        else {
            this.ao = arguments.getString("scribe_section");
            this.ap = arguments.getString("scribe_component");
            this.av = false;
        }
        this.at = arguments.getInt("search_type");
        this.as = arguments.getString("event_id");
        this.Z = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().b(this.B)).c(this.ao)).d(this.ap)).b(6)).a(this.D);
        this.K = new ul(this, this.Z);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        String s;
        if (this.m == 8) {
            s = "ev_start_time ASC ";
        }
        else {
            s = "type_id ASC, _id ASC";
        }
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.aw.a, this.X), cc.a, "search_id=?", new String[] { String.valueOf(this.s) }, s);
    }
    
    public void onPause() {
        super.onPause();
        this.au = true;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.au) {
            this.i();
            this.au = false;
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("scribe_section", this.ao);
        bundle.putString("scribe_component", this.ap);
        if (this.at == 8) {
            bundle.putString("event_id", this.as);
        }
        bundle.putBoolean("first_time", this.av);
        bundle.putInt("count", this.aw);
    }
    
    public void setUserVisibleHint(final boolean userVisibleHint) {
        super.setUserVisibleHint(userVisibleHint);
        if (userVisibleHint) {
            this.aG();
        }
    }
    
    protected boolean z_() {
        return true;
    }
}
