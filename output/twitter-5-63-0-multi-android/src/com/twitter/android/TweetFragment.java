// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Rect;
import android.support.v4.widget.ExploreByTouchHelper;
import com.twitter.android.widget.fu;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.az;
import android.net.Uri$Builder;
import com.twitter.library.widget.ActionButton;
import com.twitter.android.widget.PromptDialogFragment;
import android.app.AlertDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.scribe.ScribeItem;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.twitter.android.util.bb;
import android.widget.ListAdapter;
import com.twitter.android.widget.ChunkedAdapter;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper$DesignTreatment;
import com.twitter.android.av.p;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.android.client.am;
import com.twitter.library.util.bn;
import java.util.HashMap;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.ae;
import android.widget.ListView;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import android.util.Pair;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.support.v4.app.FragmentActivity;
import android.content.DialogInterface;
import com.twitter.library.api.Translation;
import com.twitter.library.api.TwitterUser;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.android.client.ce;
import com.twitter.library.service.aa;
import com.twitter.library.api.b;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.client.u;
import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.scribe.ScribeAssociation;
import java.util.List;
import java.util.Collection;
import com.twitter.library.util.bo;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.widget.TweetView;
import android.content.res.Resources;
import com.twitter.library.service.y;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.text.c;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.android.card.z;
import com.twitter.library.card.j;
import com.twitter.android.card.a;
import com.twitter.android.card.w;
import com.twitter.android.card.v;
import com.twitter.android.client.bh;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.media.util.q;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import com.twitter.library.widget.PageableListView;
import android.widget.BaseAdapter;
import com.twitter.library.api.ActivitySummary;
import com.twitter.android.widget.TweetDetailView;
import com.twitter.android.card.t;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.NewTweetBannerView;
import com.twitter.library.client.Session;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.android.widget.ToggleImageButton;
import com.twitter.ui.dialog.e;
import com.twitter.library.view.k;
import com.twitter.android.widget.r;
import com.twitter.android.widget.ft;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

public class TweetFragment extends TweetListFragment implements View$OnClickListener, View$OnLongClickListener, qg, ft, r, k, e
{
    private ToggleImageButton A;
    private ToggleImageButton B;
    private EngagementActionBar C;
    private boolean D;
    private boolean E;
    private long F;
    private int G;
    private long H;
    private int I;
    Session a;
    private wm aA;
    private NewTweetBannerView aB;
    private boolean aC;
    private String ao;
    private ta ap;
    private TwitterScribeItem aq;
    private long ar;
    private boolean as;
    private String at;
    private boolean au;
    private long av;
    private wk aw;
    private wn ax;
    private pn ay;
    private TwitterScribeAssociation az;
    Tweet b;
    TweetClassicCard c;
    f d;
    t e;
    TweetDetailView f;
    boolean g;
    ActivitySummary h;
    wl i;
    BaseAdapter j;
    xa k;
    TwitterScribeAssociation l;
    PageableListView m;
    String n;
    int o;
    boolean p;
    Tweet q;
    private final ArrayList r;
    private boolean s;
    private boolean t;
    private boolean u;
    private View v;
    private View w;
    private View x;
    private int y;
    private int z;
    
    public TweetFragment() {
        this.r = new ArrayList();
        this.av = -1L;
        final Bundle arguments = new Bundle();
        arguments.putBoolean("refresh", false);
        arguments.putBoolean("en_act", false);
        arguments.putBoolean("show_related_in_fragment", true);
        this.setArguments(arguments);
    }
    
    private void F() {
        this.getLoaderManager().initLoader(5, null, this);
    }
    
    private boolean H() {
        return this.m != null && this.i != null;
    }
    
    private void I() {
        final CardInstanceData w = this.b.W();
        final boolean t = this.b.T();
        final boolean a = com.twitter.library.media.util.q.a(this.b);
        if (t || a) {
            final UserSettings j = this.a.j();
            final boolean o = this.O();
            final boolean b = !this.p && this.b.x() && (j == null || !j.k || this.P());
            final g g = new g(t, this.getActivity(), this.b, DisplayMode.b, this.Z, this.l);
            g.a(4, this.f);
            final bh a2 = bh.a(this.an);
            if (this.K()) {
                this.f.a((View$OnClickListener)new we(this, a2));
                return;
            }
            if (b) {
                this.f.a((View$OnClickListener)new wf(this), o, this.b.y());
                return;
            }
            this.d = g.a();
            if (this.d != null) {
                if (t) {
                    (this.e = new v(this.an)).a(this.b);
                    this.e.a(this.Z);
                    this.e.b(this.l);
                }
                this.d.v();
                this.d.w();
                this.d.x();
                if (this.f != null) {
                    this.f.g();
                    this.f.setTweetContentView(this.d.z());
                    this.f.d();
                    this.f.c();
                }
            }
            else if (this.b.V()) {
                final TwitterFragmentActivity ax = this.ax();
                this.f.a(this.b);
                final wj d = new wj(this, ax);
                d.a(this.b);
                d.a(w);
                d.a(this.Z);
                d.b(this.l);
                ax.a(d);
                d.a(com.twitter.android.card.w.a().a(d, false, d, new wg(this, d)));
                this.e = d.A();
                this.d = d;
            }
        }
    }
    
    private boolean K() {
        final bh a = bh.a(this.an);
        return !this.u && (!com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled") || this.b.F() || (this.b.H() && a.i())) && a.h();
    }
    
    private cn L() {
        return cm.a(this.getActivity().getApplicationContext()).a(this.b.D);
    }
    
    private void M() {
        if (!this.d(this.at) && com.twitter.library.util.text.c.a(this.an, this.b) && !this.f.a()) {
            this.f("translation_request");
            Locale locale = this.an.getResources().getConfiguration().locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            final os os = new os(this.an, this.aF(), this.b.Q, com.twitter.util.i.b(locale));
            this.a(os, 7, 0);
            this.b(this.at = os.b);
        }
    }
    
    private void N() {
        int i = 0;
        final long g = this.aF().g();
        if (this.h != null) {
            if (!this.b.e && this.h.c != null && this.h.c.length > 0) {
                final long[] c = this.h.c;
                for (int length = c.length, j = 0; j < length; ++j) {
                    if (c[j] == g) {
                        this.b.e = true;
                        this.A.setToggledOn(true);
                        break;
                    }
                }
            }
            if (!this.b.g && this.h.d != null && this.h.d.length > 0) {
                for (long[] d = this.h.d; i < d.length; ++i) {
                    if (d[i] == g) {
                        this.b.g = true;
                        this.B.setToggledOn(true);
                        break;
                    }
                }
            }
        }
    }
    
    private boolean O() {
        return com.twitter.library.featureswitch.d.f("blocker_interstitial_enabled") && this.P();
    }
    
    private boolean P() {
        return this.aF() != null && this.b.f == this.aF().g();
    }
    
    private boolean Q() {
        return com.twitter.library.featureswitch.d.a("promoted_in_tweet_detail_android_3201", "ptw_enabled", "ptw_enabled_more");
    }
    
    private boolean R() {
        return com.twitter.library.featureswitch.d.d("promoted_in_tweet_detail_android_3201").equalsIgnoreCase("ptw_enabled_more");
    }
    
    private void S() {
        boolean b;
        if (!this.aC || this.r.size() < 2) {
            b = true;
        }
        else {
            b = false;
        }
        final View w = this.w;
        int visibility;
        if (b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        w.setVisibility(visibility);
        final View v = this.v;
        final Resources resources = this.getResources();
        int n;
        if (b) {
            n = 2131689503;
        }
        else {
            n = 2131689564;
        }
        v.setBackgroundColor(resources.getColor(n));
        final View x = this.x;
        int visibility2 = 0;
        if (!b) {
            visibility2 = 8;
        }
        x.setVisibility(visibility2);
    }
    
    private void U() {
        final boolean b = com.twitter.library.api.z.b(this.b.r);
        boolean b2;
        if (this.b.C == this.aF().g()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!b2 && (!b || this.E)) {
            this.E = true;
            this.f.a((View$OnClickListener)this, b);
        }
    }
    
    private com.twitter.library.media.widget.r a(final TweetView tweetView) {
        return new wi(this, tweetView);
    }
    
    private void a(final View view, final int height) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (height != layoutParams.height) {
            layoutParams.height = height;
            view.requestLayout();
        }
    }
    
    private void a(final TweetClassicCard tweetClassicCard, final Tweet tweet, final long n) {
        String s = null;
        switch (tweetClassicCard.type) {
            default: {
                return;
            }
            case 1: {
                s = "platform_photo_card";
                break;
            }
            case 2: {
                if (tweet.H()) {
                    s = "platform_amplify_card";
                    break;
                }
                s = "platform_player_card";
                break;
            }
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.g()).a(this.an, this.b, this.Z, null).a(n, null, null).b(new String[] { ScribeLog.a("tweet::", s, "profile_click") });
        a(twitterScribeLog, tweetClassicCard);
        this.aw().a(twitterScribeLog);
    }
    
    private void a(final com.twitter.library.api.timeline.t t) {
        if (this.r.isEmpty() && this.b != null && this.i != null && this.aF().d() && this.Q()) {
            t.a(this.b, this.i.a());
        }
    }
    
    private void a(final Tweet tweet, final View view) {
        final TweetView tag = (TweetView)view.findViewById(2131886305);
        tag.setRenderRtl(bj.e);
        tag.setOnTweetViewClickListener(this.k);
        tag.setContentSize(bo.a);
        tag.setHideInlineActions(false);
        tag.setDisplayTranslationBadge(com.twitter.library.util.text.c.a(this.an, tweet));
        view.setTag((Object)tag);
    }
    
    private static void a(final TwitterScribeLog twitterScribeLog, final TweetClassicCard tweetClassicCard) {
        if (tweetClassicCard.siteUser != null) {
            twitterScribeLog.a(((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(2)).a(tweetClassicCard.siteUser.userId)).b(3));
        }
        if (tweetClassicCard.authorUser != null) {
            twitterScribeLog.a(((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(3)).a(tweetClassicCard.authorUser.userId)).b(3));
        }
    }
    
    private void a(final y y, final int n) {
        if (this.r.isEmpty() && y instanceof com.twitter.library.api.timeline.t) {
            this.r.addAll(((com.twitter.library.api.timeline.t)y).e());
            this.S();
            if (this.aA != null) {
                this.aA.a(this.r, n <= 0);
            }
        }
    }
    
    private void a(final String s, final Tweet tweet) {
        final TwitterScribeAssociation z = this.Z;
        String a;
        if (z != null) {
            a = z.a();
        }
        else {
            a = "tweet";
        }
        this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).a(this.an, tweet, z, null).b(a, "", "media_forward:platform_photo_card", s)).a(z));
    }
    
    private void a(final String s, final String s2, final String s3) {
        this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).a(this.getActivity().getApplicationContext(), this.b, this.Z, null).b(new String[] { ScribeLog.a("tweet", null, s, s2, s3) })).c(new String[] { "tweet::tweet::impression" })).a(this.l));
    }
    
    private boolean c(final Tweet tweet) {
        return tweet.m() && !tweet.p();
    }
    
    private void d(final int n) {
        if (this.r.isEmpty()) {
            return;
        }
        this.aB.setOnClickListener((View$OnClickListener)new wh(this, n));
        this.aB.a(true);
    }
    
    private void d(final Tweet tweet) {
        if (tweet.O() && tweet.E()) {
            this.aw().a(new TwitterScribeLog(this.a.g()).a(null, tweet, null, null).b(new String[] { ScribeLog.a(new String[] { "tweet:::quoted_tweet:show" }) }));
        }
    }
    
    private void e(final String s) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("screen_name", s);
        TwitterScribeAssociation twitterScribeAssociation;
        if (this.l != null) {
            twitterScribeAssociation = this.l;
        }
        else {
            twitterScribeAssociation = this.Z;
        }
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(twitterScribeAssociation).a(1)).a(this.b.D));
        if (this.b.j != null) {
            putExtra.putExtra("pc", (Serializable)this.b.j);
        }
        this.startActivity(putExtra);
    }
    
    private void f(final String s) {
        final TwitterScribeLog g = this.g(s);
        final com.twitter.android.client.c aw = this.aw();
        aw.a(g);
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)g.c();
        if (twitterScribeItem != null) {
            final String n = twitterScribeItem.n;
            final String a = bj.a();
            final com.twitter.library.api.b a2 = com.twitter.library.client.u.a.a();
            if (!TextUtils.isEmpty((CharSequence)n) && !TextUtils.isEmpty((CharSequence)a)) {
                final TwitterScribeLog g2 = this.g(s);
                g2.f("app_download_client_event");
                g2.a("4", a);
                g2.a("3", bq.a(n, a));
                if (a2 != null) {
                    g2.a("6", a2.a());
                    g2.a(a2.b());
                }
                aw.a(g2);
            }
        }
    }
    
    private TwitterScribeLog g(final String s) {
        return (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).a(this.an, this.b, this.Z, null).b(new String[] { ScribeLog.a("tweet", null, Tweet.b(this.b), null, s) })).c(new String[] { "tweet::tweet::impression" })).a(this.l);
    }
    
    private Tweet h(final long n) {
        Tweet a;
        if (this.aA == null) {
            a = null;
        }
        else {
            a = this.aA.a(n);
        }
        if (a != null) {
            return a;
        }
        if (this.i == null) {
            return null;
        }
        return this.i.a(n);
    }
    
    private void n(final boolean b) {
        if (b) {
            this.b.e = true;
            final Tweet b2 = this.b;
            ++b2.t;
            this.A.setToggledOn(true);
            this.A.setContentDescription((CharSequence)this.getResources().getString(2131296423));
        }
        else {
            this.b.e = false;
            this.b.t = Math.max(-1 + this.b.t, 0);
            this.A.setToggledOn(false);
            this.A.setContentDescription((CharSequence)this.getResources().getString(2131296393));
        }
        long[] d;
        long[] c;
        if (this.b.o != null) {
            d = this.b.o.d;
            c = this.b.o.c;
        }
        else {
            d = new long[0];
            c = new long[0];
        }
        this.b.o = new ActivitySummary(Integer.toString(this.b.t), Integer.toString(this.b.p), c, d);
        this.f.a(this.b.o);
    }
    
    public void A() {
        bq.a((Context)this.getActivity(), this.b, !kg.a((Context)this.getActivity()));
        this.f("share");
    }
    
    public void B() {
        if (this.i != null) {
            this.i.notifyDataSetChanged();
        }
        if (this.d != null) {
            this.d.a(this.b);
        }
        if (this.e != null) {
            this.e.a(this.b);
        }
    }
    
    public void a() {
        this.aw().a(this.aF().g(), "tweet::retweet_dialog:tweet:share_via_dm");
    }
    
    public void a(final int n, final int n2, final boolean b) {
        final PageableListView m = this.m;
        if (this.H()) {
            if (!b) {
                this.b(n, n2);
                return;
            }
            m.smoothScrollToPositionFromTop(n, n2);
        }
    }
    
    @Override
    public final void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                final int int1 = aa.c.getInt("new_tweet", 0);
                this.a(y, int1);
                switch (y.R()) {
                    default: {
                        if (aa.a()) {
                            this.getLoaderManager().initLoader(1, null, this);
                            return;
                        }
                        this.t();
                        this.m.a(false);
                        return;
                    }
                    case 1: {
                        if (int1 > 0) {
                            this.getLoaderManager().initLoader(2, null, this);
                            this.L().c = 0L;
                            return;
                        }
                        this.m.a(false);
                        return;
                    }
                    case 2: {
                        if (int1 > 0) {
                            this.getLoaderManager().initLoader(3, null, this);
                            return;
                        }
                        this.m.b(false);
                        return;
                    }
                }
                break;
            }
            case 2: {
                final l f = aa.f();
                if (this.b != null && f != null && f.a == 200) {
                    final ActivitySummary e = ((ly)y).e();
                    this.f.a(e, this);
                    this.h = e;
                    this.b.o = e;
                    this.N();
                    return;
                }
                break;
            }
            case 3: {
                final int[] t = ((com.twitter.library.api.timeline.f)y).t();
                if (aa.c() == 403) {
                    ce.a(this.an).a(t);
                }
                if (this.b != null) {
                    this.a(new ly(this.an, this.aF(), this.b.D), 2, 0);
                    return;
                }
                break;
            }
            case 4: {
                if (this.b != null) {
                    this.a(new ly(this.an, this.aF(), this.b.D), 2, 0);
                    return;
                }
                break;
            }
            case 5: {
                this.getLoaderManager().restartLoader(5, null, this);
            }
            case 6: {
                if (!aa.a()) {
                    break;
                }
                final TwitterUser a = ((qd)y).a;
                if (a != null && a.userId == this.b.C) {
                    this.b.r = a.friendship;
                    this.b.s = a.friendshipTime;
                    this.U();
                    return;
                }
                break;
            }
            case 7: {
                final Translation e2 = ((os)y).e();
                if (!aa.a() || e2 == null) {
                    Toast.makeText(this.an, 2131297949, 1).show();
                    return;
                }
                if (this.f.a(e2)) {
                    this.f.b();
                    return;
                }
                Toast.makeText(this.an, (CharSequence)this.getResources().getString(2131297951, new Object[] { com.twitter.library.util.text.c.a(e2.c, e2.c) }), 1).show();
            }
        }
    }
    
    public void a(final long n, final Tweet tweet, final boolean b) {
        if (this.isAdded()) {
            if (!b) {
                tweet.h = true;
                this.B.setToggledOn(true);
                this.f("retweet");
                return;
            }
            tweet.h = false;
            this.B.setToggledOn(false);
            this.f("unretweet");
        }
    }
    
    public void a(final long n, final boolean e, final int t) {
        final Tweet h = this.h(n);
        if (h != null && (h.e != e || h.t != t)) {
            h.e = e;
            h.t = t;
            this.B();
        }
    }
    
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
        if (!this.isAdded() || this.b == null || this.an == null) {
            return;
        }
        if (!b) {
            if (b2) {
                this.b.h = true;
                this.B.setToggledOn(true);
            }
            else {
                this.b.h = false;
                this.B.setToggledOn(false);
                if (!b3) {
                    Toast.makeText(this.an, 2131298005, 1).show();
                }
            }
        }
        this.a(new ly(this.an, this.aF(), this.b.D), 2, 0);
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        final FragmentActivity activity = this.getActivity();
        switch (n) {
            case 102: {
                if (n2 == -1) {
                    this.f("delete");
                    this.a(new op(activity.getApplicationContext(), this.a, this.b.E));
                    final Intent intent = new Intent();
                    intent.putExtra("status_id", this.b.E);
                    activity.setResult(1, intent);
                    activity.finish();
                    return;
                }
                break;
            }
        }
    }
    
    void a(final Bundle bundle) {
        this.h = (ActivitySummary)bundle.getParcelable("as");
        this.t = bundle.getBoolean("f");
        this.u = bundle.getBoolean("dw");
        this.E = bundle.getBoolean("fss");
        this.G = bundle.getInt("social_context_type", -1);
        this.I = bundle.getInt("social_context_user_count", -1);
        this.H = bundle.getLong("activity_row_id", -1L);
        this.aq = (TwitterScribeItem)bundle.getParcelable("scribe_item");
        this.ar = bundle.getLong("magic_rec_id", -1L);
        this.q = (Tweet)bundle.getParcelable("in_reply_to_tweet");
        this.p = bundle.getBoolean("display_possibly_sensitive_media");
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("suggested_tweet");
        if (parcelableArrayList != null) {
            this.r.clear();
            this.r.addAll(parcelableArrayList);
        }
        this.aC = (this.R() && bundle.getBoolean("sofst"));
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final PageableListView m = this.m;
        final wl i = this.i;
        final pk t = this.T;
        Label_0056: {
            switch (loader.getId()) {
                case 1: {
                    if (i.getCount() == 1 && cursor != null && cursor.moveToFirst()) {
                        final ArrayList<Tweet> list = new ArrayList<Tweet>(cursor.getCount());
                        do {
                            final Tweet a = new com.twitter.library.provider.ad(cursor).a();
                            if (a.E != this.F) {
                                list.add(a);
                            }
                        } while (cursor.moveToNext());
                        i.a(list);
                        i.notifyDataSetChanged();
                    }
                    this.t();
                    return;
                }
                case 2: {
                    if (cursor == null || !cursor.moveToFirst()) {
                        break;
                    }
                    final Tweet a2 = i.a(0);
                    final boolean l = new com.twitter.library.provider.ad(cursor).a().l();
                    int n = 0;
                    if (!l) {
                        m.a(false);
                    }
                    while (cursor.moveToNext()) {
                        final Tweet a3 = new com.twitter.library.provider.ad(cursor).a();
                        if (a2.equals(a3)) {
                            break;
                        }
                        i.a(n, a3);
                        ++n;
                    }
                    if (n > 0) {
                        i.notifyDataSetChanged();
                        this.b(m.getHeaderViewsCount() + i.a(a2), m.getLoadingHeaderHeight());
                        return;
                    }
                    break;
                }
                case 3: {
                    if (cursor == null) {
                        break;
                    }
                    final Tweet b = i.b();
                    if (cursor.moveToLast()) {
                        final int count = i.getCount();
                        int n2 = 0;
                        while (true) {
                            do {
                                final Tweet a4 = new com.twitter.library.provider.ad(cursor).a();
                                if (b.equals(a4) || this.b.equals(a4) || a4.E == this.F) {
                                    if (n2 > 0) {
                                        this.L().b = 0L;
                                        i.notifyDataSetChanged();
                                        this.d(count);
                                        return;
                                    }
                                    if (cursor.getCount() >= 400) {
                                        this.m.b(false);
                                        return;
                                    }
                                    break Label_0056;
                                }
                                else {
                                    i.a(i.getCount() - n2, a4);
                                    ++n2;
                                }
                            } while (cursor.moveToPrevious());
                            continue;
                        }
                    }
                    break;
                }
                case 5: {
                    final int count2 = cursor.getCount();
                    this.ay.a(Long.valueOf(this.b.D), Pair.create((Object)this.av, (Object)count2));
                    switch (wa.a[RelatedTweetsExperimentHelper.f().ordinal()]) {
                        default: {
                            return;
                        }
                        case 1:
                        case 2: {
                            this.f.setNumRelatedTweets(count2);
                            return;
                        }
                        case 3: {
                            t.swapCursor(cursor);
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public void a(final View view, final int n, final long[] array) {
        final FragmentActivity activity = this.getActivity();
        if (kg.a((Context)activity)) {
            kg.c(activity, n, this.b.a());
            return;
        }
        this.startActivity(new Intent((Context)activity, (Class)UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.a.g()).putExtra("tag", this.b.D).putExtra("type", n).putExtra("user_ids", array));
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        super.a(listView, view, n, n2);
        final Integer n3 = (Integer)view.getTag(2131886098);
        if (n3 == null || n3 == 0) {
            String s;
            if (n - 1 < this.i.a(this.b)) {
                s = "parent_tweet";
            }
            else {
                s = "child_tweet";
            }
            this.a("", s, "click");
            this.startActivityForResult(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).setData(com.twitter.library.provider.ae.a(n2, this.a.g())).putExtra("association", (Parcelable)this.Z), 3);
        }
        else if (n3 == 1) {
            final pm pm = (pm)view.getTag();
            if (pm.g == 0) {
                final Tweet tweet = pm.a.f.getTweet();
                this.startActivity(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("association", (Parcelable)this.az));
                this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).a(null, tweet, this.az, null).b(new String[] { TwitterScribeLog.a(this.az, "tweet", "tweet", "click") })).a(this.az));
            }
        }
    }
    
    public void a(final wk aw) {
        this.aw = aw;
    }
    
    public void a(final wn ax) {
        this.ax = ax;
    }
    
    public void a(final MediaEntity mediaEntity) {
        if (mediaEntity.type == MediaEntity$Type.d && mediaEntity.videoInfo != null) {
            new com.twitter.android.a().a(this.Z).a(this.b).b(true).c(false).d(bh.a((Context)this.getActivity()).i()).a((Context)this.getActivity());
            return;
        }
        this.a(PromotedEvent.n);
        this.k.a(this.b, mediaEntity, null);
    }
    
    void a(final PromotedEvent promotedEvent) {
        if (this.b.j != null) {
            this.aw().a(promotedEvent, this.b.j);
        }
    }
    
    public void a(final TweetClassicCard tweetClassicCard) {
        this.a(PromotedEvent.n);
        this.k.a(this.b, tweetClassicCard, null);
    }
    
    void a(final TweetClassicCard tweetClassicCard, final Tweet tweet) {
        String s = null;
        switch (tweetClassicCard.type) {
            default: {
                return;
            }
            case 1: {
                s = "platform_photo_card";
                break;
            }
            case 2: {
                if (tweet.H()) {
                    s = "platform_amplify_card";
                    break;
                }
                s = "platform_player_card";
                break;
            }
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.g()).a(this.an, tweet, null, null).b(new String[] { ScribeLog.a("tweet::", s, "show") });
        a(twitterScribeLog, tweetClassicCard);
        this.aw().a(twitterScribeLog);
    }
    
    public void a(final UrlEntity urlEntity) {
        this.a(urlEntity, null, false);
    }
    
    public void a(final UrlEntity urlEntity, final HashMap hashMap, final boolean b) {
        if (this.e != null) {
            this.e.a("open_link", "platform_card");
        }
        final String af = this.b.af();
        String string;
        String s;
        if (!b) {
            string = "tweet::" + af + "::open_link";
            s = "tweet::tweet::impression";
        }
        else {
            string = null;
            s = null;
        }
        final String c = bn.c(urlEntity.expandedUrl);
        final com.twitter.android.client.c aw = this.aw();
        final String a = com.twitter.library.featureswitch.d.a("in_app_youtube_player_android_2413");
        final FragmentActivity activity = this.getActivity();
        if (c != null && !"control".equals(a) && !"unassigned".equals(a)) {
            aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a((Context)activity, this.b, this.Z, null).b(new String[] { string })).c(new String[] { s })).a(this.Z)).b(urlEntity.expandedUrl, urlEntity.url));
            this.startActivity(new Intent((Context)activity, (Class)YouTubeActivity.class).putExtra("video_id", c));
            return;
        }
        com.twitter.android.client.am.a((Context)activity, this.b, urlEntity, this.X, string, s, this.Z, null);
    }
    
    public void a(final TwitterPlace twitterPlace) {
    }
    
    void a(final Tweet tweet) {
        this.q = tweet;
        this.b = tweet;
        this.C.setTweet(this.b);
        this.i.b(this.b);
    }
    
    void a(final Tweet tweet, final Session a, final String n, final int o, final int g, final int i, final String ao, final long h, final TwitterScribeItem aq, final long ar, final boolean as) {
        this.a = a;
        this.b = tweet;
        if (this.q == null) {
            this.q = this.b;
        }
        this.n = n;
        this.o = o;
        this.c = tweet.S();
        this.k.a(a);
        this.G = g;
        this.I = i;
        this.ao = ao;
        this.H = h;
        this.aq = aq;
        this.ar = ar;
        this.as = as;
        if (this.ap == null) {
            this.ap = new ta((Context)this.getActivity(), this.H, this.G, this.aq, this.ar, tweet);
        }
        else {
            this.ap.a(this.H, this.G, this.aq, this.ar, tweet);
        }
        if (!this.s && tweet.j != null && com.twitter.android.av.p.a(tweet)) {
            this.s = true;
            this.a(PromotedEvent.g);
        }
        final boolean d = this.aF().d();
        if (d || kg.a((Context)this.getActivity())) {
            this.C.setTweet(tweet);
            this.C.setOnClickListener((View$OnClickListener)this);
        }
        (this.i = new wl(this, this.b)).a(this);
        if (RelatedTweetsExperimentHelper.f() == RelatedTweetsExperimentHelper$DesignTreatment.c) {
            final ChunkedAdapter j = new ChunkedAdapter((Context)this.getActivity(), this.i, this.T, 2131297535, 2131297537, 2131297534, 2131297536);
            j.a(this);
            this.j = j;
        }
        else {
            (this.aA = new wm(this, null)).a(this.r, false);
            this.aA.a(this);
            this.aA.a(this.aC);
            final com.twitter.android.widget.k k = new com.twitter.android.widget.k(this.i, this.aA);
            k.a(2130969122);
            this.j = k;
        }
        final PageableListView m = this.m;
        final boolean l = tweet.l();
        if (m.getAdapter() == null) {
            this.m.addFooterView(this.x, (Object)null, false);
            m.a(this.v);
            if (this.aC) {
                this.S();
                m.a(this.w);
                m.setFooterContainerOnClickListener((View$OnClickListener)new wc(this));
            }
            m.b();
            if (l) {
                m.a();
            }
            m.setAdapter((ListAdapter)this.j);
        }
        this.g = true;
        final cn l2 = this.L();
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.t || currentTimeMillis < 300000L + l2.a) {
            this.getLoaderManager().initLoader(1, null, this);
        }
        else {
            this.t = true;
            final com.twitter.library.api.timeline.t t = new com.twitter.library.api.timeline.t((Context)this.getActivity(), a, tweet.D);
            this.a(t);
            this.a(t, 1, 0);
            l2.a = currentTimeMillis;
        }
        this.f.setOnTweetAnalyticsClickListener((View$OnClickListener)new wd(this));
        if (this.h != null) {
            this.b.o = this.h;
            this.f.a(this.h, this);
        }
        else if (d || kg.a((Context)this.getActivity())) {
            this.a(new ly((Context)this.getActivity(), a, tweet.D), 2, 0);
        }
        this.I();
        if (l) {
            this.b(false);
        }
        if (com.twitter.library.featureswitch.d.f("translate_tweet_auto")) {
            this.M();
            this.f("translation_auto");
        }
        if ((d || kg.a((Context)this.getActivity())) && RelatedTweetsExperimentHelper.a()) {
            final long d2 = this.b.D;
            final Pair b = this.ay.b(Long.valueOf(d2));
            if (b != null) {
                this.av = (long)b.first;
                this.f.setNumRelatedTweets((int)b.second);
                if (RelatedTweetsExperimentHelper.f() == RelatedTweetsExperimentHelper$DesignTreatment.c) {
                    this.F();
                }
            }
            else if (this.av >= 0L) {
                this.F();
            }
            else {
                this.av = com.twitter.util.q.a.nextLong();
                this.a(bb.a(d2, (Context)this.getActivity(), this.aw(), this.aF(), this.av, null, 0), 5, 0);
            }
            this.b.x = this.av;
        }
        final FragmentActivity activity = this.getActivity();
        final Intent intent = activity.getIntent();
        if (intent != null) {
            final Uri data = intent.getData();
            if (data != null) {
                final List pathSegments = data.getPathSegments();
                String s;
                if (pathSegments.size() > 0) {
                    s = pathSegments.get(0);
                }
                else {
                    s = "";
                }
                if (intent.getBooleanExtra("email_redirect_retweet", false) || "retweet".equals(s)) {
                    if (this.b.h) {
                        intent.removeExtra("email_redirect_retweet");
                        return;
                    }
                    com.twitter.android.qd.b(101, this.b, false, this, this, activity);
                }
                else if (intent.getBooleanExtra("email_redirect_favorite", false) || "favorite".equals(s)) {
                    if (!this.b.e) {
                        this.q(103);
                        return;
                    }
                    intent.removeExtra("email_redirect_favorite");
                }
            }
        }
    }
    
    public void a(final String s) {
        if (s.length() > 1) {
            final char char1 = s.charAt(0);
            final FragmentActivity activity = this.getActivity();
            final long g = this.aF().g();
            final String b = Tweet.b(this.b);
            if (char1 == '#') {
                this.a(PromotedEvent.e);
                this.startActivity(new Intent((Context)activity, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "hashtag_click").putExtra("scribe_context", "hashtag"));
                this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(this.getActivity().getApplicationContext(), this.b, this.Z, null).b(new String[] { ScribeLog.a("tweet", null, b, "hashtag", "search") })).e(s)).a(this.l));
            }
            else {
                if (char1 == '$') {
                    this.a(PromotedEvent.u);
                    this.startActivity(new Intent((Context)activity, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "cashtag_click").putExtra("scribe_context", "cashtag"));
                    this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(this.getActivity().getApplicationContext(), this.b, this.Z, null).b(new String[] { ScribeLog.a("tweet", null, b, "cashtag", "search") })).e(s)).a(this.l));
                    return;
                }
                if (char1 == '@') {
                    this.a(PromotedEvent.f);
                    final String substring = s.substring(1);
                    this.e(substring);
                    this.aw().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(this.getActivity().getApplicationContext(), this.b, this.Z, null).b(new String[] { ScribeLog.a("tweet", null, b, null, "mention_click") })).e(substring)).b(TwitterScribeItem.a(substring))).a(this.l));
                }
            }
        }
    }
    
    public void a(final boolean b, final int n) {
        if (this.H()) {
            this.a(this.m.getHeaderViewsCount() + this.i.a(this.q), n, b);
        }
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.aB.setVisibility(8);
    }
    
    public void b(final long n) {
        this.k.a(this.b, n, null);
    }
    
    public void b(final long n, final Tweet tweet, final boolean b) {
        this.f("quote");
    }
    
    public void b(final boolean b) {
        this.a(b, this.z);
    }
    
    protected Dialog b_(final int n) {
        switch (n) {
            default: {
                return super.b_(n);
            }
            case 103: {
                final AlertDialog create = new AlertDialog$Builder((Context)this.getActivity()).setTitle(2131297999).setMessage(2131296955).setPositiveButton(2131296393, (DialogInterface$OnClickListener)new vy(this)).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null).create();
                create.setOnDismissListener((DialogInterface$OnDismissListener)new vz(this));
                return (Dialog)create;
            }
        }
    }
    
    public void c(final long n) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("pc", (Serializable)this.b.j);
        if (this.l != null) {
            putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.l).a(1)).a(this.b.D));
        }
        else {
            putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(1)).a(this.b.D));
        }
        this.startActivity(putExtra);
    }
    
    public void c(final long n, final Tweet tweet, final boolean b) {
        this.aw().a(this.aF().g(), "tweet::retweet_dialog::dismiss");
    }
    
    public void d(final long f) {
        if (this.i != null) {
            this.F = f;
            this.i.c(f);
        }
    }
    
    public void d(final long n, final Tweet tweet, final boolean b) {
        final com.twitter.android.client.c aw = this.aw();
        if (aw != null) {
            aw.a(this.aF().g(), "tweet::retweet_dialog::impression");
        }
    }
    
    public void d(final boolean b) {
        this.D = false;
        if (this.b != null) {
            if (!b) {
                this.m.b(false);
                return;
            }
            this.x();
        }
    }
    
    public ActivitySummary e() {
        return this.h;
    }
    
    public void e(final boolean b) {
        if (this.ax != null) {
            this.ax.a(2131297538, b);
        }
        if (b) {
            this.aw().a(this.X, "tweet::tweet:related_tweets:click");
        }
    }
    
    protected void k() {
        if (!this.g) {
            super.k();
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.S) {
            this.az = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("related_tweets")).d("tweet");
        }
    }
    
    public void onClick(final View view) {
        final Tweet b = this.b;
        final int id = view.getId();
        if (id == 2131886228) {
            this.p(0);
        }
        else {
            this.p(2);
        }
        final String b2 = Tweet.b(this.b);
        switch (id) {
            case 2131886228: {
                if (!kg.a((Context)this.getActivity())) {
                    this.q = b;
                    if (this.aw != null) {
                        this.aw.a(b);
                    }
                    this.f("reply");
                    return;
                }
                kg.a(this.getActivity(), 3, b.a());
            }
            case 2131886230: {
                if (!kg.a((Context)this.getActivity())) {
                    this.y();
                    return;
                }
                this.A.a();
                kg.a(this.getActivity(), 1, b.a());
            }
            case 2131886229: {
                if (!kg.a((Context)this.getActivity())) {
                    this.z();
                    return;
                }
                kg.a(this.getActivity(), 2, b.a());
            }
            case 2131886232: {
                final PromptDialogFragment j = PromptDialogFragment.b(102).c(2131297994).d(2131297993).h(2131298158).j(2131297303);
                j.setTargetFragment(this, 0);
                j.a(this.getActivity().getSupportFragmentManager());
            }
            case 2131886231: {
                this.A();
            }
            case 2131886644:
            case 2131887315: {
                if (id == 2131886644) {
                    this.a(PromotedEvent.c);
                }
                else {
                    if (!com.twitter.library.featureswitch.d.f("clickable_username_in_tweet_detail_enabled")) {
                        break;
                    }
                    this.a(PromotedEvent.d);
                }
                final long c = this.b.C;
                this.c(c);
                this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.a.g()).a(this.getActivity().getApplicationContext(), this.b, this.Z, null).a(c, null, null).b(new String[] { TwitterScribeLog.a(this.Z, b2, "avatar", "profile_click") })).a(this.Z));
            }
            case 2131887320: {
                this.a(PromotedEvent.m);
                if (b.z() && b.g) {
                    this.c(b.C);
                    return;
                }
                this.c(b.f);
            }
            case 2131886366: {
                if (this.c != null && this.c.siteUser != null) {
                    final long userId = this.c.siteUser.userId;
                    this.c(userId);
                    this.a(this.c, b, userId);
                    return;
                }
                break;
            }
            case 2131886080: {
                if (!kg.a((Context)this.getActivity())) {
                    final ActionButton actionButton = (ActionButton)view;
                    final boolean checked = actionButton.isChecked();
                    String s;
                    if (checked) {
                        s = "unfollow";
                    }
                    else {
                        s = "follow";
                    }
                    final com.twitter.android.client.c aw = this.aw();
                    if (checked) {
                        this.b.r = 0;
                        this.a(new pe((Context)this.getActivity(), this.aF(), this.b.C, this.b.j));
                    }
                    else {
                        this.b.r = 1;
                        this.a(new pb((Context)this.getActivity(), this.aF(), this.b.C, this.b.j));
                    }
                    actionButton.toggle();
                    aw.a(new TwitterScribeLog(this.aF().g()).a((Context)this.getActivity(), this.b, this.Z, null).b(this.b.C, this.b.j, null).b(new String[] { ScribeLog.a("tweet", null, b2, null, s) }));
                    return;
                }
                kg.a(this.getActivity(), 4, b.a());
            }
            case 2131887317: {
                if (this.f.a()) {
                    this.f.b();
                    return;
                }
                this.M();
                this.f("translation_button");
            }
            case 2131886562: {
                this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.a.g()).a((Context)this.getActivity(), this.b, this.Z, null).b(new String[] { "tweet::tweet:quoted_tweet:click" })).a(this.Z));
                this.startActivity(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).setData(new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", String.valueOf(this.b.J)).build()).putExtra("association", (Parcelable)this.Z));
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(1)).b("tweet"));
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.l = (TwitterScribeAssociation)arguments.getParcelable("source_association");
        }
        this.aC = this.R();
        if (bundle != null) {
            this.a(bundle);
        }
        this.y = this.getResources().getDimensionPixelSize(2131558830);
        this.z = this.getResources().getDimensionPixelSize(2131558507);
        (this.k = new vw(this, this, this.Z, null, null, "tweet:stream:tweet:link:open_link", null, null, new wo(this, this, this.Z))).a(false);
        this.k.a(this.l);
        this.ay = pn.a((Context)this.getActivity());
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        Uri uri = null;
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                uri = com.twitter.library.provider.az.m;
                break;
            }
            case 2: {
                uri = com.twitter.library.provider.az.n;
                break;
            }
            case 3: {
                uri = com.twitter.library.provider.az.o;
                break;
            }
            case 5: {
                return bb.a(this.av, (Context)this.getActivity(), this.aF().g());
            }
        }
        return new CursorLoader(this.getActivity().getApplicationContext(), uri.buildUpon().appendEncodedPath(String.valueOf(this.b.D)).appendQueryParameter("ownerId", String.valueOf(this.a.g())).build(), Tweet.a, null, null, null);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        View view;
        if (RelatedTweetsExperimentHelper.f() == RelatedTweetsExperimentHelper$DesignTreatment.c) {
            view = this.a(layoutInflater, 2130968638, viewGroup);
        }
        else {
            view = this.a(layoutInflater, 2130968698, viewGroup);
            (this.aB = (NewTweetBannerView)view.findViewById(2131886088)).setMinDelaySinceLastDisplayed(240000L);
            this.aB.setText(2131297295);
        }
        this.m = (PageableListView)this.Y();
        return view;
    }
    
    public void onLoaderReset(final Loader loader) {
    }
    
    public boolean onLongClick(final View view) {
        final int id = view.getId();
        if (id == 2131886102) {
            this.aw().a(this.a.g(), "tweet", null, this.b.af(), null, "copy");
            final FragmentActivity activity = this.getActivity();
            bq.b((Context)activity, this.b.y);
            Toast.makeText((Context)activity, 2131296728, 0).show();
            return true;
        }
        return id == 2131886562 && this.k.b(this.b);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        NotificationSettingsActivity.a(this.getActivity().getIntent(), (ViewGroup)this.f);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("as", (Parcelable)this.h);
        bundle.putBoolean("f", this.t);
        bundle.putBoolean("dw", this.u);
        bundle.putBoolean("fss", this.E);
        bundle.putInt("social_context_type", this.G);
        bundle.putInt("social_context_user_count", this.I);
        bundle.putLong("activity_row_id", this.H);
        bundle.putParcelable("scribe_item", (Parcelable)this.aq);
        bundle.putLong("magic_rec_id", this.ar);
        bundle.putParcelable("in_reply_to_tweet", (Parcelable)this.q);
        bundle.putBoolean("display_possibly_sensitive_media", this.p);
        bundle.putParcelableArrayList("suggested_tweet", this.r);
        bundle.putBoolean("sofst", this.aC);
        this.f.a(bundle);
    }
    
    public void onStart() {
        super.onStart();
        if (this.au) {
            this.f.e();
            this.au = false;
        }
    }
    
    @Override
    public void onStop() {
        this.a(this.aF().g(), "tweet::stream::results");
        this.f.f();
        this.au = true;
        super.onStop();
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final PageableListView m = this.m;
        m.setScrollingCacheEnabled(false);
        m.setCacheColorHint(0);
        m.setOnPageScrollListener(new wb(this, m));
        final LayoutInflater from = LayoutInflater.from(m.getContext());
        final TweetDetailView f = (TweetDetailView)from.inflate(2130969162, (ViewGroup)m, false);
        f.a.setOnClickListener((View$OnClickListener)this);
        f.getNamePanel().setOnClickListener((View$OnClickListener)this);
        this.m.setExploreByTouchHelper(new fu((View)this.m, f));
        f.d.setOnLongClickListener((View$OnLongClickListener)this);
        f.b.setOnClickListener((View$OnClickListener)this);
        f.setQuoteTweetClickListener((View$OnClickListener)this);
        f.setQuoteTweetLongClickListener((View$OnLongClickListener)this);
        f.setTranslationButtonClickListener((View$OnClickListener)this);
        if (bundle != null) {
            f.b(bundle);
        }
        this.f = f;
        this.au = false;
        (this.C = f.c).b();
        this.A = (ToggleImageButton)this.C.findViewById(2131886230);
        this.B = (ToggleImageButton)this.C.findViewById(2131886229);
        this.w = from.inflate(2130968619, (ViewGroup)m, false);
        this.v = from.inflate(2130968955, (ViewGroup)m, false);
        this.x = from.inflate(2130968713, (ViewGroup)m, false);
        if (!com.twitter.library.featureswitch.d.f("clickable_username_in_tweet_detail_enabled")) {
            this.f.findViewById(2131887311).findViewById(2131887315).setBackgroundResource(0);
        }
    }
    
    public void r() {
        if (this.b == null || this.m == null || this.m.getMeasuredHeight() == 0 || this.f == null || this.f.getMeasuredHeight() == 0) {
            return;
        }
        final Rect rect = new Rect();
        int n;
        if (this.v.getParent().getParent() != null && this.v.getGlobalVisibleRect(rect)) {
            n = 1;
        }
        else {
            n = 0;
        }
        final View v = this.v;
        final int y = this.y;
        int n2;
        if (n != 0) {
            n2 = rect.height();
        }
        else {
            n2 = this.y;
        }
        this.a(v, Math.max(y, n2));
    }
    
    void t() {
        if (this.g) {
            final wl i = this.i;
            final PageableListView m = this.m;
            final Tweet b = this.b;
            m.a(i.a(0).l());
            m.b(b.equals(i.b()));
            i.notifyDataSetChanged();
            if (b.l()) {
                this.a(this.v, com.twitter.util.t.a(this.getActivity()));
                this.a(false, this.z);
            }
            this.g = false;
            final com.twitter.library.metrics.e b2 = com.twitter.library.metrics.e.b("tweet:complete", this.av(), ih.n);
            b2.b(this.X);
            b2.j();
            if (this.e != null) {
                this.e.a("impression", "platform_card");
            }
        }
    }
    
    public void w() {
        final PageableListView m = this.m;
        m.setSelectionFromTop(-1 + (m.getHeaderViewsCount() + m.getCount()), 0);
        m.b(true);
        this.D = true;
    }
    
    public void x() {
        this.getLoaderManager().initLoader(3, null, this);
        if (this.f(2)) {
            final Tweet b = this.i.b();
            this.L().b = System.currentTimeMillis();
            final com.twitter.library.api.timeline.t t = new com.twitter.library.api.timeline.t((Context)this.getActivity(), this.a, this.b.D);
            t.c(b.D);
            this.a(t);
            this.a(t, 1, 2);
        }
    }
    
    public void y() {
        final Tweet b = this.b;
        if (b.e) {
            this.a(new com.twitter.library.api.timeline.l((Context)this.getActivity(), this.a, b.D).a(b.j), 4, 0);
            this.n(false);
            this.f("unfavorite");
            return;
        }
        this.a(new com.twitter.library.api.timeline.f((Context)this.getActivity(), this.a, b.D, b.E).a(b.j), 3, 0);
        this.n(true);
        this.f("favorite");
    }
    
    public void z() {
        com.twitter.android.qd.a(101, this.b, false, this, this, this.getActivity());
    }
}
