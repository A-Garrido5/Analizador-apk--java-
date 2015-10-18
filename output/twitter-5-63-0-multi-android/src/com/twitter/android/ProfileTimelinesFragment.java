// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.metrics.b;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.support.v4.app.Fragment;
import com.twitter.android.composer.au;
import com.twitter.library.av.w;
import com.twitter.library.api.timeline.ae;
import com.twitter.library.api.timeline.ai;
import com.twitter.refresh.widget.a;
import com.twitter.util.collection.i;
import android.widget.AdapterView;
import android.widget.ListView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeItem;
import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import com.twitter.android.profiles.ah;
import android.support.v4.content.Loader;
import com.twitter.library.service.y;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.widget.ListAdapter;
import com.twitter.android.widget.et;
import android.widget.BaseAdapter;
import com.twitter.android.profiles.ak;
import com.twitter.android.profiles.af;
import android.content.Context;
import com.twitter.android.av.aw;
import android.database.Cursor;
import com.twitter.android.metrics.d;
import java.util.ArrayList;
import java.util.HashSet;
import com.twitter.android.profiles.z;
import com.twitter.android.widget.cv;
import android.view.View$OnClickListener;
import com.twitter.android.widget.ScrollingHeaderTimelineFragment;

public class ProfileTimelinesFragment extends ScrollingHeaderTimelineFragment implements View$OnClickListener
{
    private boolean k;
    private cv l;
    private z m;
    private final HashSet n;
    private final ArrayList o;
    private boolean p;
    private boolean q;
    
    public ProfileTimelinesFragment() {
        this.n = new HashSet();
        this.o = new ArrayList();
    }
    
    private void L() {
        if (((xc)this.W).getCount() > 0 && this.m != null) {
            this.q = false;
            this.p = true;
            this.m.n();
            return;
        }
        this.M();
    }
    
    private void M() {
        final com.twitter.android.metrics.d a = com.twitter.android.metrics.d.a(this.X, this.av(), false);
        if (a != null) {
            a.a(2);
        }
    }
    
    private void b(final Cursor cursor) {
        if (!this.k && this.l != null && cursor != null) {
            final int position = cursor.getPosition();
            Label_0066: {
                if (cursor.moveToFirst()) {
                    while (true) {
                        while (!ov.a_(cursor)) {
                            if (!cursor.moveToNext()) {
                                final int n = 0;
                                final cv l = this.l;
                                int n2;
                                if (n != 0) {
                                    n2 = 13;
                                }
                                else {
                                    n2 = 4;
                                }
                                l.b(n2);
                                break Label_0066;
                            }
                        }
                        final int n = 1;
                        continue;
                    }
                }
            }
            cursor.moveToPosition(position);
        }
    }
    
    protected int B() {
        if (this.j) {
            return 20;
        }
        return super.B();
    }
    
    protected boolean C() {
        return aw.a((Context)this.getActivity(), 901);
    }
    
    protected void Y_() {
        final com.twitter.android.metrics.d a = com.twitter.android.metrics.d.a(this.X, this.av(), false);
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof af) {
            this.m = new ak(this.getActivity(), this.aE(), ((af)activity).h(), this.Z, a, this.j);
            if (this.j) {
                this.l = new et((BaseAdapter)this.W, this.m.b(), 4);
            }
            else {
                this.l = new cv((BaseAdapter)this.W, this.m.b(), 4);
            }
            this.Y().setAdapter((ListAdapter)this.l);
            return;
        }
        this.Y().setAdapter(this.W);
    }
    
    public int a(final long n) {
        final int count = this.l.getCount();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = 0;
            if (n2 >= count) {
                break;
            }
            if (this.l.getItemId(n2) == n) {
                n3 = n2 + this.Y().getHeaderViewsCount();
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.k) {
            return this.a(layoutInflater, 2130968999, viewGroup);
        }
        return super.a(layoutInflater, viewGroup);
    }
    
    protected xc a(final TwitterFragmentActivity twitterFragmentActivity, final xa xa, final boolean b) {
        if (this.j) {
            return super.a(twitterFragmentActivity, xa, b, true);
        }
        return new ov(twitterFragmentActivity, 2, false, b, false, xa, this.L, this.f, this.Z);
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        if (n == 1) {
            this.L();
        }
        super.a(n, y);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (loader.getId() == 0) {
            super.a(loader, cursor);
            this.L();
            if (com.twitter.android.profiles.ah.d()) {
                this.b(cursor);
            }
        }
    }
    
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        super.a(view, tweet, bundle);
        if (this.n.add(tweet.D)) {
            final TwitterScribeItem a = TwitterScribeItem.a(this.getActivity().getApplicationContext(), tweet, this.Z, null);
            a.g = 1 + bundle.getInt("position");
            this.o.add(a);
            final PromotedContent j = tweet.j;
            if (j != null) {
                this.aw().a(PromotedEvent.a, j);
            }
        }
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        final i c = this.l.c(n - listView.getHeaderViewsCount());
        if (c != null && this.m != null && c.a == this.m.b()) {
            this.m.onItemClick((AdapterView)listView, view, (int)c.b, n2);
            return;
        }
        super.a(listView, view, n, n2);
    }
    
    protected void a(final a a, final boolean b) {
        final long b2 = a.b;
        final ListView y = this.Y();
        if (b2 > 0L) {
            final int n = a.a - y.getHeaderViewsCount();
            int n2;
            if (n >= 0 && this.l.getItemId(n) == b2) {
                n2 = a.a;
            }
            else {
                n2 = this.a(b2);
            }
            if (n2 >= y.getHeaderViewsCount() || !b) {
                this.b(n2, a.c);
            }
        }
    }
    
    protected void a(final boolean b) {
        super.a(b);
        if (!this.q && this.p && this.m != null) {
            this.m.n();
        }
    }
    
    public void ae_() {
        if (this.m != null) {
            this.m.q();
        }
        super.ae_();
    }
    
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.k) {
            return this.a(layoutInflater, 2130968999, viewGroup);
        }
        return super.b(layoutInflater, viewGroup);
    }
    
    protected com.twitter.library.service.y g(final int n) {
        if (this.O == 1) {
            final com.twitter.library.service.y g = super.g(n);
            if (!this.k && n == 3 && this.W != null && ((xc)this.W).getCount() == 0 && com.twitter.android.profiles.ah.d()) {
                if (g instanceof ai) {
                    ((ai)g).a(true);
                }
                else if (g instanceof ae) {
                    ((ae)g).a(true);
                    return g;
                }
            }
            return g;
        }
        return super.g(n);
    }
    
    protected boolean l() {
        return com.twitter.library.av.w.a(91);
    }
    
    protected String m() {
        return com.twitter.android.profiles.ah.a(this.k);
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887192) {
            com.twitter.android.composer.au.a((Context)this.getActivity()).a(this);
        }
    }
    
    public void onCreate(final Bundle bundle) {
        final Bundle arguments = this.getArguments();
        this.k = arguments.getBoolean("is_me");
        super.onCreate(bundle);
        final int int1 = arguments.getInt("statuses_count", 0);
        boolean q = false;
        if (int1 == 0) {
            q = true;
        }
        this.q = q;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.k) {
            ((TypefacesTextView)onCreateView.findViewById(2131886114)).setText(2131296938);
            final TwitterButton twitterButton = (TwitterButton)onCreateView.findViewById(2131887192);
            twitterButton.setVisibility(0);
            twitterButton.setText(2131296937);
            twitterButton.setOnClickListener((View$OnClickListener)this);
        }
        return onCreateView;
    }
    
    public void onDestroy() {
        if (this.m != null) {
            this.m.p();
        }
        super.onDestroy();
    }
    
    protected void v() {
        super.v();
        final com.twitter.android.metrics.d a = com.twitter.android.metrics.d.a(this.X, this.av(), false);
        if (a != null) {
            a.a(1);
        }
    }
    
    protected void x_() {
        (this.c = new com.twitter.android.metrics.b("timeline:bellbird_profile_tweets", "timeline:bellbird_profile_tweets", ih.l, this.av())).b(this.aE().b().g());
        this.c.i();
    }
    
    public void y() {
        super.y();
        if (this.m != null) {
            this.m.m();
        }
    }
}
