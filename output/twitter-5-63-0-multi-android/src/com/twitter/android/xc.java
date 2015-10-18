// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ViewAnimator;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import android.util.Pair;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.util.bo;
import com.twitter.android.client.bh;
import com.twitter.library.provider.Tweet;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.util.bj;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.UserSettings;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import java.util.ArrayList;
import com.twitter.library.view.z;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.u;
import android.support.v4.widget.CursorAdapter;

public class xc extends CursorAdapter implements u
{
    protected final TwitterFragmentActivity a;
    protected final c b;
    protected final az c;
    protected final z d;
    protected final vf e;
    protected final ArrayList f;
    protected final lv g;
    private final ArrayList h;
    private final int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private mz m;
    private int n;
    private boolean o;
    private boolean p;
    private FriendshipCache q;
    private boolean r;
    private boolean s;
    private pn t;
    private final TwitterScribeAssociation u;
    
    public xc(final TwitterFragmentActivity a, final int n, final boolean j, final boolean k, final boolean p12, final z d, final vf e, final FriendshipCache q, final int i, final int n2, final int n3, final TwitterScribeAssociation u) {
        boolean b = true;
        super((Context)a, null, n);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.r = b;
        this.u = u;
        this.a = a;
        this.c = az.a((Context)a);
        this.b = com.twitter.android.client.c.a((Context)a);
        this.d = d;
        this.p = p12;
        this.j = j;
        this.k = k;
        final UserSettings l = this.c.b().j();
        if (l == null || !l.k) {
            b = false;
        }
        this.o = b;
        this.e = e;
        this.i = i;
        this.n = n2;
        this.q = q;
        if (kg.a((Context)a)) {
            this.r = false;
        }
        this.t = pn.a((Context)a);
        this.g = this.a(n3);
    }
    
    public xc(final TwitterFragmentActivity twitterFragmentActivity, final int n, final boolean b, final boolean b2, final boolean b3, final z z, final vf vf, final FriendshipCache friendshipCache, final TwitterScribeAssociation twitterScribeAssociation) {
        this(twitterFragmentActivity, n, b, b2, b3, z, vf, friendshipCache, 2130969133, 2130969165, -1, twitterScribeAssociation);
    }
    
    private void a(final TweetView tweetView) {
        tweetView.setRenderRtl(bj.e);
        tweetView.setDisplaySensitiveMedia(this.o);
        tweetView.setOnTweetViewClickListener(this.d);
        tweetView.setShowRetweetSocialProofToOwner(this.p);
        tweetView.setShouldSimulateInlineActions(this.r);
    }
    
    private void b(final View view) {
        final og tag = new og(view);
        this.a(tag.f);
        tag.f.setAlwaysExpandMedia(true);
        this.a(tag.a);
        tag.a.setAlwaysExpandMedia(true);
        view.setTag((Object)tag);
    }
    
    protected int H_() {
        return 1;
    }
    
    protected Bundle a(final hk hk, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("position", n);
        return bundle;
    }
    
    protected Tweet a(final View view, final hk hk, final int n) {
        boolean w = true;
        final Tweet a = hk.a;
        final bh a2 = bh.a(this.mContext);
        final boolean a3 = a2.a(a);
        if (!a3) {
            a.i &= 0xFFFFFFF7;
        }
        final xb xb = (xb)view.getTag();
        final TweetView f = xb.f;
        if (this.q != null) {
            this.q.a(a);
        }
        f.setFriendshipCache(this.q);
        f.setShouldSimulateInlineActions(this.r);
        f.setAlwaysExpand(this.j && a3 && w);
        f.setAlwaysExpandMedia(this.k && a3 && w);
        f.setHideInlineActions(false);
        f.setContentSize(bo.a);
        f.setDisplayTranslationBadge(com.twitter.library.util.text.c.a(this.mContext, a));
        final boolean b = f.getPreviewEnabled() && (this.j || this.k || a.n()) && w;
        final boolean a4 = a.a(this.o, a2.c());
        final g g = new g(b && a4 && w, this.a, a, DisplayMode.a, this.u, null);
        if (RelatedTweetsExperimentHelper.c() && this.s) {
            final long d = a.D;
            final Pair b2 = this.t.b(Long.valueOf(d));
            if (b2 == null) {
                a.x = this.t.a(d, this.c.b(), new xg(this, d, f, g));
            }
            else {
                a.x = (long)b2.first;
                if ((int)b2.second <= 0) {
                    w = false;
                }
                a.w = w;
            }
        }
        f.a(a, this.l, g);
        view.setContentDescription(f.getContentDescription());
        f.setRenderRtl(bj.e);
        if (this.m != null) {
            this.m.a(view, a, this.a(hk, n));
        }
        if (this.e != null) {
            this.e.b(xb, hk.o);
        }
        return a;
    }
    
    protected lv a(final int n) {
        return new hl(false);
    }
    
    protected void a(final View view) {
        final xb tag = new xb(view);
        this.a(tag.f);
        view.setTag((Object)tag);
        this.f.add(new WeakReference<xb>(tag));
    }
    
    protected void a(final View view, final hi hi, final int imageResource) {
        final xf xf = (xf)view.getTag();
        xf.b.setImageResource(imageResource);
        if (this.h.contains(hi.a)) {
            xf.a.setVisibility(0);
            xf.c.setVisibility(8);
            return;
        }
        xf.a.setVisibility(8);
        xf.c.setVisibility(0);
    }
    
    protected boolean a(final Cursor cursor) {
        return cursor.getInt(18) == 2;
    }
    
    public boolean a(final ListView listView, final long n, final Tweet tweet, final Runnable runnable) {
        for (int childCount = listView.getChildCount(), i = 0; i < childCount; ++i) {
            final View viewById = listView.getChildAt(i).findViewById(2131886136);
            if (viewById instanceof ViewAnimator) {
                final ViewAnimator viewAnimator = (ViewAnimator)viewById;
                if (((TweetView)viewAnimator.getChildAt(0)).getTweet().Q == n) {
                    listView.post((Runnable)new xd(this, viewAnimator, tweet, runnable));
                    return true;
                }
            }
        }
        return false;
    }
    
    public void b(final mz m) {
        this.m = m;
    }
    
    @Override
    public void b(final boolean l) {
        if (this.l != l && !(this.l = l)) {
            for (int i = -1 + this.f.size(); i >= 0; --i) {
                final xb xb = this.f.get(i).get();
                if (xb != null) {
                    xb.f.q();
                }
            }
        }
    }
    
    protected boolean b(final Cursor cursor) {
        return cursor != null && cursor.getLong(41) != 0L;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final int position = cursor.getPosition();
        final hh hh = (hh)this.g.b(cursor);
        if (hh instanceof hi) {
            this.a(view, (hi)hh, 2130839523);
            return;
        }
        this.a(view, (hk)hh, position);
    }
    
    protected FriendshipCache c() {
        return this.q;
    }
    
    public void c(final long n) {
        this.h.add(n);
    }
    
    public void c(final boolean k) {
        if (this.k != k) {
            this.k = k;
            this.notifyDataSetChanged();
        }
    }
    
    public void d() {
        for (int i = -1 + this.f.size(); i >= 0; --i) {
            final xb xb = this.f.get(i).get();
            if (xb == null) {
                this.f.remove(i);
            }
            else {
                xb.f.o();
            }
        }
    }
    
    public void d(final boolean s) {
        this.s = s;
    }
    
    public ArrayList e() {
        return this.h;
    }
    
    public void f() {
        this.h.clear();
    }
    
    @Override
    public long getItemId(final int n) {
        final int count = this.getCount();
        if (count == 0 || n >= count) {
            return 0L;
        }
        return ((hh)this.g.b(this.getItem(n))).o;
    }
    
    public int getItemViewType(final int n) {
        if (((hh)this.g.b(this.getItem(n))) instanceof hi) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (((hh)this.g.b(this.mCursor)) instanceof hj || (view != null && view.findViewById(2131886136) != null)) {
            return super.getView(n, null, viewGroup);
        }
        return super.getView(n, view, viewGroup);
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final hh hh = (hh)this.g.b(this.mCursor);
        if (hh instanceof hi) {
            final View inflate = LayoutInflater.from(context).inflate(this.i, (ViewGroup)null);
            inflate.setTag((Object)new xf(inflate));
            return inflate;
        }
        if (hh instanceof hj) {
            final View inflate2 = LayoutInflater.from(context).inflate(2130968990, (ViewGroup)null);
            this.b(inflate2);
            return inflate2;
        }
        final View inflate3 = LayoutInflater.from(context).inflate(this.n, (ViewGroup)null);
        this.a(inflate3);
        return inflate3;
    }
    
    @Override
    public Cursor swapCursor(final Cursor cursor) {
        return super.swapCursor(cursor);
    }
}
