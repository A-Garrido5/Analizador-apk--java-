// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.bd;
import com.twitter.library.util.bq;
import com.twitter.android.widget.EngagementActionBar;
import java.util.ArrayList;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.api.timeline.l;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.f;
import java.io.Serializable;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.dm.ShareViaDMActivity;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.composer.au;
import android.annotation.TargetApi;
import android.view.animation.Animation$AnimationListener;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.net.Uri$Builder;
import android.content.Intent;
import com.twitter.library.util.bo;
import android.widget.Toast;
import com.twitter.android.util.bb;
import com.twitter.library.widget.ag;
import com.twitter.library.view.TweetActionType;
import com.twitter.library.api.PromotedContent;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.Session;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.provider.Tweet;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.service.aa;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.View;
import android.support.v4.app.Fragment;
import com.twitter.library.client.as;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.lang.ref.WeakReference;
import com.twitter.library.client.az;
import com.twitter.android.client.c;

public class ul implements vh
{
    private static final boolean a;
    protected final c c;
    protected final az d;
    protected final WeakReference e;
    protected final TwitterScribeAssociation f;
    protected final Context g;
    protected final as h;
    
    static {
        a = yw.a();
    }
    
    public ul(final Fragment fragment, final TwitterScribeAssociation f) {
        this.g = fragment.getActivity().getApplicationContext();
        this.c = com.twitter.android.client.c.a(this.g);
        this.h = as.a(this.g);
        this.d = az.a(this.g);
        this.e = new WeakReference((T)fragment);
        this.f = f;
    }
    
    private static Animation a(final View view) {
        final AnimationSet set = new AnimationSet(false);
        final ve ve = new ve(view, 0);
        ve.setDuration(350L);
        set.addAnimation((Animation)ve);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setDuration(200L);
        set.addAnimation((Animation)alphaAnimation);
        return (Animation)set;
    }
    
    protected static void a(final FragmentActivity fragmentActivity, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        new AlertDialog$Builder((Context)fragmentActivity).setMessage((CharSequence)fragmentActivity.getString(2131297997)).setPositiveButton((CharSequence)fragmentActivity.getString(2131297996), dialogInterface$OnClickListener).setNegativeButton((CharSequence)fragmentActivity.getString(2131296445), (DialogInterface$OnClickListener)null).create().show();
    }
    
    private void a(final Tweet tweet, final FragmentActivity fragmentActivity, final Session session, final TwitterScribeItem twitterScribeItem) {
        this.a(this.a(fragmentActivity), "tweet_analytics", tweet, twitterScribeItem);
        fragmentActivity.startActivity(TweetAnalyticsWebViewActivity.a((Context)fragmentActivity, session.e(), tweet.D));
    }
    
    private void a(final Tweet tweet, final PromotedEvent promotedEvent, final String s, final String s2) {
        this.a(tweet, promotedEvent, s, s2, -1L);
    }
    
    private void a(final Tweet tweet, final PromotedEvent promotedEvent, final String s, final String s2, final long n) {
        final PromotedContent j = tweet.j;
        String impressionId;
        if (j != null) {
            impressionId = j.impressionId;
        }
        else {
            impressionId = null;
        }
        this.c.a(tweet.aa, tweet.Z, impressionId, promotedEvent);
        this.a(s, s2, tweet, null);
        if (n != -1L) {
            this.c.c(n);
        }
    }
    
    private void a(final TweetActionType tweetActionType, final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session) {
        int n = 0;
        switch (us.a[tweetActionType.ordinal()]) {
            default: {
                return;
            }
            case 4: {
                n = 1;
                break;
            }
            case 5: {
                n = 2;
                break;
            }
            case 6: {
                n = 3;
                break;
            }
            case 7: {
                n = 4;
                break;
            }
            case 2: {
                this.c(tweet, fragment, fragmentActivity, session);
                return;
            }
            case 8: {
                this.a(tweet, fragment, fragmentActivity, session);
                return;
            }
        }
        kg.a(fragmentActivity, n, tweet.a());
    }
    
    private void a(final TweetActionType tweetActionType, final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session, final FriendshipCache friendshipCache, final TwitterScribeItem twitterScribeItem, final ag ag) {
        if (tweetActionType == TweetActionType.b) {
            this.a(tweet, fragmentActivity, session, twitterScribeItem, ag);
        }
        else {
            if (tweetActionType == TweetActionType.c) {
                this.a(tweet, fragment, fragmentActivity, twitterScribeItem, ag);
                return;
            }
            if (tweetActionType == TweetActionType.d) {
                this.a(tweet, fragment, fragmentActivity, session, twitterScribeItem);
                return;
            }
            if (tweetActionType == TweetActionType.e) {
                this.a(tweet, friendshipCache, twitterScribeItem, ag);
                return;
            }
            if (tweetActionType == TweetActionType.f) {
                this.b(tweet, fragment, fragmentActivity, session);
                return;
            }
            if (tweetActionType == TweetActionType.g) {
                this.c(tweet, fragment, fragmentActivity, session);
                return;
            }
            if (tweetActionType == TweetActionType.h) {
                this.a(tweet, fragment, fragmentActivity, session);
                return;
            }
            if (tweetActionType == TweetActionType.j || tweetActionType == TweetActionType.i) {
                if (fragment instanceof TweetListFragment) {
                    this.a(tweet, tweetActionType, (TweetListFragment)fragment);
                }
            }
            else {
                if (tweetActionType == TweetActionType.k) {
                    bb.a((Context)fragmentActivity, tweet.D, tweet.x);
                    return;
                }
                if (tweetActionType == TweetActionType.p) {
                    this.a(tweet, fragmentActivity);
                    return;
                }
                if (tweetActionType == TweetActionType.l) {
                    this.a(tweet, friendshipCache, fragmentActivity, session);
                    return;
                }
                if (tweetActionType == TweetActionType.m) {
                    this.b(tweet, friendshipCache, fragmentActivity, session);
                    return;
                }
                if (tweetActionType == TweetActionType.n) {
                    this.c(tweet, friendshipCache, fragmentActivity, session);
                    return;
                }
                if (tweetActionType == TweetActionType.o) {
                    this.d(tweet, friendshipCache, fragmentActivity, session);
                    return;
                }
                if (tweetActionType == TweetActionType.q) {
                    this.a(tweet, fragmentActivity, session, twitterScribeItem);
                }
            }
        }
    }
    
    private static void b(final boolean b, final boolean b2, final Context context, final boolean b3) {
        if (!b && context != null && !b3) {
            int n;
            if (b2) {
                n = 2131297995;
            }
            else {
                n = 2131298005;
            }
            Toast.makeText(context, n, 1).show();
        }
    }
    
    private void c(final long n, final aa aa, final FriendshipCache friendshipCache) {
        if (aa != null && aa.a()) {
            friendshipCache.f(n);
        }
    }
    
    private void d(final long n, final aa aa, final FriendshipCache friendshipCache) {
        if (aa != null && aa.a()) {
            friendshipCache.g(n);
        }
    }
    
    private static void e(final long n, final aa aa, final FriendshipCache friendshipCache) {
        if (aa != null && aa.a() && friendshipCache != null) {
            friendshipCache.h(n);
        }
    }
    
    private static void f(final long n, final aa aa, final FriendshipCache friendshipCache) {
        if (aa != null && aa.a()) {
            friendshipCache.i(n);
        }
    }
    
    protected String a(final Activity activity) {
        if (activity instanceof TweetActivity) {
            return "non_focused_tweet";
        }
        return null;
    }
    
    protected String a(final Tweet tweet) {
        if (tweet.B()) {
            return "focal";
        }
        if (tweet.A()) {
            return "ancestor";
        }
        return null;
    }
    
    @Override
    public void a() {
        if (bo.b) {
            final Fragment fragment = (Fragment)this.e.get();
            if (fragment != null) {
                final FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    com.twitter.android.util.aa.a((Context)activity).a(3);
                }
            }
        }
    }
    
    public void a(final long n, final FragmentActivity fragmentActivity) {
        fragmentActivity.startActivity(new Intent((Context)fragmentActivity, (Class)TweetActivity.class).setData(new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", String.valueOf(n)).build()).putExtra("association", (Parcelable)this.f));
    }
    
    protected void a(final long n, final boolean b, final int n2) {
    }
    
    @TargetApi(16)
    protected void a(final View view, final Tweet tweet, final PromotedEvent promotedEvent, final String s, final String s2, final long n) {
        int n2;
        if (!ul.a && Build$VERSION.SDK_INT >= 16 && com.twitter.library.featureswitch.d.f("animate_dismiss_enabled")) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            final int height = view.getLayoutParams().height;
            final Animation a = a(view);
            a.setAnimationListener((Animation$AnimationListener)new uq(this, view, tweet, promotedEvent, s, s2, n, height));
            view.setHasTransientState(true);
            view.startAnimation(a);
            return;
        }
        this.a(tweet, promotedEvent, s, s2, n);
    }
    
    protected void a(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session) {
        this.a("dismiss", "click", tweet, null);
        a(fragmentActivity, (DialogInterface$OnClickListener)new vd(this, tweet));
    }
    
    protected void a(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session, final TwitterScribeItem twitterScribeItem) {
        this.a(this.a(fragmentActivity), "reply", tweet, twitterScribeItem);
        au.a((Context)fragmentActivity).a(tweet).a(session.e()).b((Context)fragmentActivity);
    }
    
    protected void a(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final TwitterScribeItem twitterScribeItem, final ag ag) {
        qd.a(0, tweet, false, fragment, new uu(this, new WeakReference((T)ag), fragmentActivity, tweet, twitterScribeItem, this.c, this.d.b().g(), this.f), fragmentActivity);
    }
    
    protected void a(final Tweet tweet, final FragmentActivity fragmentActivity) {
        this.c.a(this.d.b().g(), TwitterScribeLog.a(this.f, "share_sheet", "tweet", "share_via_dm"));
        if (ak.e()) {
            ShareViaDMActivity.a(fragmentActivity, tweet);
            return;
        }
        fragmentActivity.startActivity(new Intent((Context)fragmentActivity, (Class)DMActivity.class).putExtra("quoted_tweet", (Serializable)new QuotedTweetData(tweet)));
    }
    
    protected void a(final Tweet tweet, final FragmentActivity fragmentActivity, final Session session, final TwitterScribeItem twitterScribeItem, final ag ag) {
        final boolean b = !tweet.e;
        if (ag != null) {
            ag.b(b);
        }
        if (b) {
            this.h.a(new f(this.g, session, tweet.D, tweet.E).a(tweet.j), new um(this, this.g));
            this.a(this.a(fragmentActivity), "favorite", tweet, twitterScribeItem);
            return;
        }
        this.h.a(new l(this.g, session, tweet.D).a(tweet.j), new ut(this, this.g));
        this.a(this.a(fragmentActivity), "unfavorite", tweet, twitterScribeItem);
    }
    
    public void a(final Tweet tweet, final View view, final FragmentActivity fragmentActivity, final long n) {
        this.a(tweet, view, fragmentActivity, n, null);
    }
    
    public void a(final Tweet tweet, final View view, final FragmentActivity fragmentActivity, final long n, final Runnable runnable) {
        this.a("dismiss", "click", tweet, null);
        if (tweet.q()) {
            new AlertDialog$Builder((Context)fragmentActivity).setTitle((CharSequence)fragmentActivity.getString(2131297996)).setItems(new CharSequence[] { fragmentActivity.getString(2131297974), fragmentActivity.getString(2131297977), fragmentActivity.getString(2131297978), fragmentActivity.getString(2131296445) }, (DialogInterface$OnClickListener)new un(this, view, tweet, n, runnable)).create().show();
            return;
        }
        a(fragmentActivity, (DialogInterface$OnClickListener)new uo(this, view, tweet, n, runnable));
    }
    
    protected void a(final Tweet tweet, final FriendshipCache friendshipCache, final FragmentActivity fragmentActivity, final Session session) {
        this.a(this.a(fragmentActivity), "mute_user", tweet, null);
        as.a(this.g).a(new oe(this.g, session).a(tweet.C), new uv(this, tweet, friendshipCache));
    }
    
    protected void a(final Tweet tweet, final FriendshipCache friendshipCache, final TwitterScribeItem twitterScribeItem, final ag ag) {
        final boolean b = !friendshipCache.k(tweet.C);
        if (ag != null) {
            ag.a(b);
        }
        final Session b2 = this.d.b();
        if (friendshipCache != null) {
            if (!b) {
                this.a("unfollow", tweet, null);
                this.h.a(new pe(this.g, b2, tweet.C, tweet.j));
                friendshipCache.c(tweet.C);
                return;
            }
            this.a("follow", tweet, twitterScribeItem);
            this.h.a(new pb(this.g, b2, tweet.C, tweet.j));
            final boolean a = friendshipCache.a(tweet.C);
            int intValue = 0;
            if (a) {
                intValue = friendshipCache.j(tweet.C);
            }
            friendshipCache.b(tweet.C, 0x40 | (intValue | 0x1));
        }
    }
    
    protected void a(final Tweet tweet, final TweetActionType tweetActionType, final TweetListFragment tweetListFragment) {
        tweetListFragment.a(tweet.E, tweetActionType == TweetActionType.i);
    }
    
    public void a(final TweetActionType tweetActionType, final Tweet tweet, final FriendshipCache friendshipCache, final TwitterScribeItem twitterScribeItem, final ag ag) {
        if (this.c != null) {
            final Fragment fragment = (Fragment)this.e.get();
            if (fragment != null) {
                final FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    final Session b = this.d.b();
                    if (b.d()) {
                        this.a(tweetActionType, tweet, fragment, activity, b, friendshipCache, twitterScribeItem, ag);
                    }
                    else if (kg.a((Context)activity)) {
                        this.a(tweetActionType, tweet, fragment, activity, b);
                    }
                }
            }
        }
    }
    
    protected void a(final String s, final Tweet tweet, final TwitterScribeItem twitterScribeItem) {
        this.a("", s, tweet, twitterScribeItem);
    }
    
    protected void a(final String s, final String s2, final Tweet tweet, final TwitterScribeItem twitterScribeItem) {
        this.c.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.d.b().g()).a(this.g, tweet, this.f, this.a(tweet)).b(new String[] { TwitterScribeLog.a(this.f, Tweet.b(tweet), s, s2) })).a(this.f)).a(twitterScribeItem));
    }
    
    @Override
    public boolean a(final TweetActionType tweetActionType, final Tweet tweet, final FriendshipCache friendshipCache) {
        this.a(tweetActionType, tweet, friendshipCache, null, null);
        return true;
    }
    
    @Override
    public void b() {
    }
    
    protected void b(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session) {
        final PromptDialogFragment j = PromptDialogFragment.b(0).c(2131297994).d(2131297993).h(2131298158).j(2131297303);
        j.setTargetFragment(fragment, 0);
        j.a(fragmentActivity.getSupportFragmentManager());
        j.a(new vb(this, session, tweet));
    }
    
    protected void b(final Tweet tweet, final FriendshipCache friendshipCache, final FragmentActivity fragmentActivity, final Session session) {
        this.a(this.a(fragmentActivity), "unmute_user", tweet, null);
        as.a(this.g).a(new of(this.g, session).a(tweet.C), new uw(this, tweet, friendshipCache));
    }
    
    public boolean b(final Tweet tweet) {
        final Fragment fragment = (Fragment)this.e.get();
        FragmentActivity activity;
        if (fragment == null) {
            activity = null;
        }
        else {
            activity = fragment.getActivity();
        }
        if (activity == null || tweet.I == null || activity.isFinishing()) {
            return false;
        }
        final QuotedTweetData i = tweet.I;
        final long j = tweet.J;
        final long g = this.d.b().g();
        final boolean d = this.d.b().d();
        this.c.a(g, TwitterScribeLog.a(this.f, this.f.c(), "quoted_tweet", "long_press"));
        final SparseArray sparseArray = new SparseArray(3);
        final ArrayList<String> list = new ArrayList<String>(3);
        if (d) {
            sparseArray.put(list.size(), (Object)TweetActionType.p);
            list.add(activity.getString(2131297793));
        }
        if (EngagementActionBar.a(i, g)) {
            sparseArray.put(list.size(), (Object)TweetActionType.g);
            list.add(activity.getString(2131297792));
        }
        sparseArray.put(list.size(), (Object)TweetActionType.r);
        list.add(activity.getString(2131298121));
        final PromptDialogFragment promptDialogFragment = (PromptDialogFragment)PromptDialogFragment.b(0).a(list.toArray(new CharSequence[list.size()])).a(new up(this, sparseArray, activity, i, j, g));
        promptDialogFragment.setRetainInstance(true);
        promptDialogFragment.a(activity.getSupportFragmentManager());
        return true;
    }
    
    protected void c(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session) {
        bq.a((Context)fragmentActivity, tweet, false);
        this.a(this.a(fragmentActivity), "share", tweet, null);
    }
    
    protected void c(final Tweet tweet, final FriendshipCache friendshipCache, final FragmentActivity fragmentActivity, final Session session) {
        this.a(this.a(fragmentActivity), "block_user", tweet, null);
        this.a("block_dialog", "impression", tweet, null);
        bd.a(this.g, tweet.F, -1, fragmentActivity.getSupportFragmentManager(), new ux(this, tweet, session, friendshipCache));
    }
    
    protected void d(final Tweet tweet, final FriendshipCache friendshipCache, final FragmentActivity fragmentActivity, final Session session) {
        this.a(this.a(fragmentActivity), "unblock_user", tweet, null);
        this.a("unblock_dialog", "impression", tweet, null);
        bd.b(this.g, tweet.F, -1, fragmentActivity.getSupportFragmentManager(), new uz(this, tweet, session, friendshipCache));
    }
}
