// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import java.util.Iterator;
import android.widget.AbsListView;
import android.accounts.Account;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.TypedValue;
import com.twitter.library.provider.cm;
import android.support.v4.content.CursorLoader;
import android.content.res.Resources;
import com.twitter.library.featureswitch.d;
import com.twitter.ui.widget.FullScreenFrameLayout;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.util.Collection;
import com.twitter.android.DispatchActivity;
import android.content.res.Configuration;
import com.twitter.library.media.manager.j;
import com.twitter.android.util.ap;
import com.twitter.android.FollowFlowController;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.android.ImageActivity;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.twitter.library.provider.ba;
import com.twitter.library.provider.b;
import android.os.Build$VERSION;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.ProfileActivity;
import com.twitter.android.SearchActivity;
import com.twitter.library.widget.ObservableScrollView;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.cb;
import com.twitter.android.TweetActivity;
import java.io.Serializable;
import com.twitter.android.GalleryActivity;
import com.twitter.android.AVMediaPlayerActivity;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import android.support.v4.content.Loader;
import android.database.Cursor;
import com.twitter.android.client.am;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.client.Session;
import com.twitter.library.api.timeline.RichTimeline$RequestType;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.twitter.internal.android.service.a;
import android.os.Bundle;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.client.c;
import com.twitter.android.client.NotificationService;
import com.twitter.android.client.notifications.StatusBarNotif;
import com.twitter.library.util.bq;
import android.app.Activity;
import com.twitter.util.q;
import com.twitter.library.api.UrlEntity;
import android.os.Parcelable;
import android.net.Uri$Builder;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Intent;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.HashMap;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.View;
import com.twitter.android.widget.highlights.StoriesViewPager;
import com.twitter.library.provider.bg;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import com.twitter.ui.widget.e;
import com.twitter.android.widget.highlights.k;
import com.twitter.android.widget.highlights.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.BaseFragmentActivity;

public class StoriesActivity extends BaseFragmentActivity implements LoaderManager$LoaderCallbacks, ViewTreeObserver$OnGlobalLayoutListener, w, y, g, k, e
{
    private static final boolean a;
    private HashSet A;
    private boolean B;
    private float C;
    private boolean D;
    private boolean E;
    private final Map b;
    private final Set c;
    private az d;
    private as e;
    private bg f;
    private t g;
    private com.twitter.library.client.k h;
    private StoriesViewPager i;
    private View j;
    private ViewStub k;
    private boolean l;
    private int m;
    private z n;
    private x o;
    private ViewGroup p;
    private int q;
    private boolean r;
    private String s;
    private boolean t;
    private int u;
    private af v;
    private TwitterScribeAssociation w;
    private HashSet x;
    private int y;
    private HashMap z;
    
    static {
        a = (App.l() && Log.isLoggable("StoriesActivity", 3));
    }
    
    public StoriesActivity() {
        this.b = new HashMap();
        this.c = new HashSet();
        this.t = true;
        this.u = -1;
        this.D = false;
    }
    
    public static Intent a(final Context context, final boolean b, String s, final int n, final String s2, final TwitterScribeLog twitterScribeLog) {
        final Intent addFlags = new Intent(context, (Class)StoriesActivity.class).addFlags(536870912);
        if (s2 != null) {
            addFlags.setData(Uri.parse(s2));
        }
        if (b) {
            addFlags.addFlags(67108864);
            if (TextUtils.isEmpty((CharSequence)s)) {
                s = "InvalidStoryId";
            }
            addFlags.putExtra("EXTRA_HIGHLIGHTS_TAPPED_STORY_ID", s);
        }
        switch (n) {
            case 1: {
                addFlags.setData(new Uri$Builder().appendQueryParameter("promptbird", "1").build());
                break;
            }
            case 2:
            case 3: {
                addFlags.putExtra("EXTRA_HIGHLIGHTS_FORCE_STATE", n);
                break;
            }
        }
        addFlags.putExtra("EXTRA_HIGHLIGHTS_SCRIBE_LOG", (Parcelable)twitterScribeLog);
        return addFlags;
    }
    
    public static TwitterScribeLog a(final long n, final String s, final String s2, final String s3) {
        return (TwitterScribeLog)new TwitterScribeLog(n).b("highlights", "storystream", s, s2, s3);
    }
    
    private TwitterScribeLog a(final af af, final UrlEntity urlEntity) {
        final String c = c(af.a());
        if (c != null) {
            String s;
            if (!com.twitter.util.q.a(urlEntity.expandedUrl)) {
                s = urlEntity.expandedUrl;
            }
            else {
                s = urlEntity.url;
            }
            return (TwitterScribeLog)this.a("story", c, "open_link").a(s);
        }
        return null;
    }
    
    public static void a(final Activity activity, final int n) {
        if (n == 3) {
            new com.twitter.library.client.k((Context)activity, az.a((Context)activity).b().e()).a().a("highlights_last_user_view_time", 0L).apply();
        }
        activity.startActivity(a((Context)activity, false, null, n, null, null));
    }
    
    private void a(final Intent intent) {
        if (intent != null) {
            final Bundle a = bq.a(intent);
            if (a != null) {
                if (a.getParcelable("sb_notification") != null) {
                    NotificationService.a(this.getApplicationContext(), a);
                }
                final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)a.getParcelable("EXTRA_HIGHLIGHTS_SCRIBE_LOG");
                if (twitterScribeLog != null) {
                    com.twitter.android.client.c.a((Context)this).a(twitterScribeLog);
                }
                intent.removeExtra("sb_notification");
                intent.removeExtra("EXTRA_HIGHLIGHTS_SCRIBE_LOG");
            }
        }
    }
    
    private void b(final String s) {
        this.D = true;
        if (!"InvalidStoryId".equals(s)) {
            if (StoriesActivity.a) {
                Log.d("StoriesActivity", "Activity started from notification, will move " + s + " to front!");
            }
            final mt mt = new mt(this.getApplicationContext(), this.d.b(), s);
            mt.a(new r(this));
            this.E = true;
            this.e.a(mt);
        }
    }
    
    private static String c(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11: {
                return "tweet";
            }
            case 5: {
                return "user";
            }
        }
    }
    
    private boolean g() {
        if (this.i.getCurrentItem() < this.m) {
            this.k.inflate();
            this.findViewById(2131886841).setOnClickListener((View$OnClickListener)this);
            this.findViewById(2131886840).setOnClickListener((View$OnClickListener)this);
            ((TextView)this.findViewById(2131886839)).setText((CharSequence)com.twitter.util.q.a(this.getString(2131297060), 2));
            return this.l = true;
        }
        return false;
    }
    
    private void h() {
        final Session b = this.d.b();
        this.e.a(new com.twitter.library.api.timeline.w((Context)this, b, b.f()).a(RichTimeline$RequestType.b).b("push_foreground"));
    }
    
    public af a(final View view) {
        final View a = this.i.a(view);
        if (a != null) {
            return this.o.a(((ag)a.getTag()).E);
        }
        return null;
    }
    
    protected TwitterScribeLog a(final String s, final String s2, final String s3) {
        return a(this.d.b().g(), s, s2, s3);
    }
    
    public void a(final float n) {
        final int b = this.o.b();
        if ((this.o.a() != 1 || (b != 100 && b != 101)) && n > this.C) {
            this.i.c();
            this.g.a(this.i, this.j, true);
            com.twitter.android.client.c.a((Context)this).a(this.a(null, null, "exit").a(StoryScribeItem.a("swipe")));
        }
    }
    
    public void a(final int u) {
        if (this.u != u) {
            if (this.B && u >= this.m) {
                this.B = false;
            }
            if (this.v != null) {
                this.a(this.v, false);
            }
            final af a = this.o.a(u);
            if ((this.v = a) != null) {
                this.a(a, true);
                this.u = u;
            }
        }
    }
    
    public void a(final int n, final float n2, final int n3) {
        if (!this.r) {
            if (StoriesActivity.a) {
                Log.v("StoriesActivity", "initializing ViewPager");
            }
            this.a(0);
            this.r = true;
            this.g.a(this.i);
        }
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        this.p.setPadding(n, n2, n3, n4);
    }
    
    public void a(final Context context, final Tweet tweet, final UrlEntity urlEntity, final long n) {
        am.a(context, tweet, urlEntity, n, null, null, this.w, null);
    }
    
    void a(final Intent intent, final long n, final int n2) {
        boolean b;
        if (intent != null && intent.hasExtra("EXTRA_HIGHLIGHTS_TAPPED_STORY_ID")) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            this.h();
        }
        switch (n2) {
            default: {
                throw new IllegalArgumentException("Invalid override state specified");
            }
            case 1: {
                if (b) {
                    this.s = intent.getStringExtra("EXTRA_HIGHLIGHTS_TAPPED_STORY_ID");
                }
                this.a(null, 1, 100);
                break;
            }
            case 3: {
                this.a(null, 0, 103);
            }
            case 0:
            case 2: {
                if (b) {
                    this.b(intent.getStringExtra("EXTRA_HIGHLIGHTS_TAPPED_STORY_ID"));
                    this.a(null, n2, 100);
                    return;
                }
                if (intent != null) {
                    final long n3 = lcmp(System.currentTimeMillis(), 900000L + n);
                    boolean b2 = false;
                    if (n3 > 0) {
                        b2 = true;
                    }
                    if (b2) {
                        if (StoriesActivity.a) {
                            Log.d("StoriesActivity", "Non-notification launch, with stale data. Will refresh.");
                        }
                        this.b();
                    }
                    else {
                        this.D = true;
                    }
                    this.a(null, n2, 100);
                    return;
                }
                break;
            }
        }
    }
    
    void a(final Cursor cursor, final int n, final int n2) {
        this.u = -1;
        this.o.a(cursor, n, n2);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        int n = 104;
        final int id = loader.getId();
        switch (id) {
            default: {
                if (id >= 100) {
                    final com.twitter.android.highlights.am a = this.n.a(this.z.get(id));
                    if (a != null) {
                        a.a.swapCursor(cursor);
                    }
                }
            }
            case 0: {
                if (StoriesActivity.a) {
                    Log.d("StoriesActivity", "Story load finished");
                }
                if (this.E) {
                    this.a(null, this.o.a(), 101);
                    return;
                }
                if (cursor != null && cursor.getCount() > 0) {
                    if (this.o.a() != 1 && (this.o.b() == 101 || this.o.b() == 100)) {
                        this.r = false;
                        this.g.a();
                    }
                    final int a2 = this.o.a();
                    if (this.D) {
                        n = 102;
                    }
                    this.a(cursor, a2, n);
                    this.f();
                    return;
                }
                if (this.D) {
                    n = 103;
                }
                this.a(null, 0, n);
            }
        }
    }
    
    protected void a(final af af, final boolean b) {
        final int a = af.a();
        if (b && !this.x.contains(af.e) && !af.k && a != 10 && a != 12) {
            if (StoriesActivity.a) {
                Log.d("StoriesActivity", "Logging impression and setting read state for " + af.e);
            }
            this.e.a(new mu(this.getApplicationContext(), this.d.b(), af.e));
            com.twitter.android.client.c.a((Context)this).a(this.a("story", null, "impression").a(StoryScribeItem.a(af)));
            switch (a) {
                case 0:
                case 1:
                case 4:
                case 11: {
                    com.twitter.android.client.c.a((Context)this).a(this.a("story", "tweet", "impression").a(StoryScribeItem.a(af)));
                    break;
                }
                case 5: {
                    com.twitter.android.client.c.a((Context)this).a(this.a("story", "user", "impression").a(StoryScribeItem.a(af)));
                    break;
                }
            }
            this.x.add(af.e);
        }
        switch (a) {
            case 4:
            case 11: {
                ((l)af).a(b);
            }
            case 10: {
                if (this.o.a() == 2) {
                    com.twitter.android.highlights.e.a(this.h, true);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final al al, final Tweet tweet) {
        Set<Tweet> set = this.b.get(al);
        if (set == null) {
            set = new HashSet<Tweet>();
            this.b.put(al, set);
        }
        set.add(tweet);
    }
    
    public void a(final MediaEntity mediaEntity) {
    }
    
    public void a(final TweetClassicCard tweetClassicCard) {
    }
    
    public void a(final UrlEntity urlEntity) {
        final af a = this.o.a(this.u);
        if (a != null) {
            final TwitterScribeLog a2 = this.a(a, urlEntity);
            if (a2 != null) {
                a2.a(StoryScribeItem.a(a));
                com.twitter.android.client.c.a((Context)this).a(a2);
            }
        }
        this.a((Context)this, null, urlEntity, this.d.b().g());
    }
    
    public void a(final TwitterPlace twitterPlace) {
    }
    
    public void a(final TweetMediaView tweetMediaView, final MediaEntity mediaEntity) {
        final Tweet tweet = (Tweet)tweetMediaView.getTag();
        Intent intent;
        if (mediaEntity.type == MediaEntity$Type.d) {
            intent = new Intent((Context)this, (Class)AVMediaPlayerActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("extra_up_as_back", true);
        }
        else {
            intent = new Intent((Context)this, (Class)GalleryActivity.class).putExtra("media", (Serializable)mediaEntity).putExtra("tw", (Parcelable)tweet).putExtra("show_tw", false).putExtra("association", (Parcelable)this.w).putExtra("extra_up_as_back", true);
        }
        this.startActivity(intent);
        final af a = this.a((View)tweetMediaView);
        if (a != null) {
            final String c = c(a.a());
            if (c != null) {
                com.twitter.android.client.c.a((Context)this).a(this.a("story", c, "image_click").a(StoryScribeItem.a(a, tweet)));
            }
        }
    }
    
    public void a(final TweetMediaView tweetMediaView, final TweetClassicCard tweetClassicCard) {
        final Tweet tweet = (Tweet)tweetMediaView.getTag();
        if (tweet.J() || tweet.G()) {
            this.startActivity(new Intent((Context)this, (Class)TweetActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
            return;
        }
        final UrlEntity urlEntity = (UrlEntity)((cb)new cb().b(tweetClassicCard.url)).f();
        final af a = this.a((View)tweetMediaView);
        if (a != null) {
            final TwitterScribeLog a2 = this.a(a, urlEntity);
            if (a2 != null) {
                a2.a(StoryScribeItem.a(a, tweet));
                com.twitter.android.client.c.a((Context)this).a(a2);
            }
        }
        this.a((Context)this, tweet, urlEntity, this.d.b().g());
    }
    
    public void a(final TweetMediaView tweetMediaView, final EditableMedia editableMedia) {
    }
    
    public void a(final ObservableScrollView observableScrollView) {
    }
    
    public void a(final ObservableScrollView observableScrollView, final int n, final int n2, final int n3, final int n4) {
        if (observableScrollView.getId() == 2131886855) {
            final ag ag = (ag)observableScrollView.getTag();
            final int height = observableScrollView.getHeight();
            final int height2 = observableScrollView.getChildAt(0).getHeight();
            if (n2 + height >= height2) {
                ag.D.setVisibility(8);
            }
            else if (height + n4 >= height2) {
                ag.D.setVisibility(0);
            }
        }
    }
    
    public void a(final String s) {
        if (s.length() > 1) {
            final char char1 = s.charAt(0);
            if (char1 == '#') {
                this.startActivity(new Intent((Context)this, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "hashtag_click").putExtra("scribe_context", "hashtag").putExtra("source_association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
            }
            else {
                if (char1 == '$') {
                    this.startActivity(new Intent((Context)this, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "cashtag_click").putExtra("scribe_context", "cashtag").putExtra("source_association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
                    return;
                }
                if (char1 == '@') {
                    this.startActivity(ProfileActivity.a((Context)this, 0L, s.substring(1), null, null, -1, null).putExtra("association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
                }
            }
        }
    }
    
    void a(final boolean d) {
        this.D = d;
    }
    
    public boolean a(final CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
    
    void b() {
        this.E = true;
        this.e.a(new mv((Context)this, this.d.b(), this.q), new com.twitter.android.highlights.s(this));
    }
    
    public void b(final int n) {
    }
    
    public void b(final long n) {
    }
    
    public void b(final ObservableScrollView observableScrollView) {
    }
    
    public void b(final ObservableScrollView observableScrollView, final int n, final int n2, final int n3, final int n4) {
        if (observableScrollView.getId() == 2131886855) {
            observableScrollView.post((Runnable)new com.twitter.android.highlights.q(this, observableScrollView, n2));
        }
    }
    
    public void c() {
        if (this.i != null) {
            if (Build$VERSION.SDK_INT >= 21) {
                this.u = -1;
                this.a(this.i.getCurrentItem());
            }
            this.i.setEnabled(true);
        }
    }
    
    public void d() {
        if (this.l) {
            this.i.setVisibility(8);
            return;
        }
        this.finish();
    }
    
    void e() {
        this.E = false;
        final b b = new b(this.getApplicationContext().getContentResolver());
        b.a(ba.a);
        b.a();
    }
    
    void f() {
        final TwitterScribeLog a = this.a("story", null, "load_finished");
        for (int i = 0; i < this.o.getCount(); ++i) {
            final af a2 = this.o.a(i);
            if (a2 != null) {
                a.a(StoryScribeItem.a(a2));
            }
        }
        com.twitter.android.client.c.a((Context)this).a(a);
    }
    
    public void finish() {
        super.finish();
        this.overridePendingTransition(0, 2131034144);
    }
    
    public void onBackPressed() {
        String s = "exit";
        String s2;
        if (this.o.getCount() == 0) {
            super.onBackPressed();
            s2 = null;
        }
        else if (this.B) {
            if (this.l) {
                super.onBackPressed();
                s2 = "opt_out_prompt";
                s = "dismiss";
            }
            else if (this.g()) {
                this.g.a(this.i, null, false);
                s2 = "opt_out_prompt";
                s = "impression";
            }
            else {
                this.g.a(this.i, this.j, false);
                s2 = null;
            }
        }
        else {
            this.g.a(this.i, this.j, false);
            s2 = null;
        }
        com.twitter.android.client.c.a((Context)this).a(this.a(null, s2, s).a(StoryScribeItem.a("back_button")));
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131886802:
            case 2131886840: {
                String s = null;
                String s2 = "exit";
                if (this.o.getCount() == 0) {
                    this.finish();
                }
                else if (this.B) {
                    if (this.l) {
                        this.finish();
                        s = "opt_out_prompt";
                        s2 = "dismiss";
                    }
                    else if (this.g()) {
                        this.g.a(this.i, null, false);
                        s = "opt_out_prompt";
                        s2 = "impression";
                    }
                    else {
                        this.g.a(this.i, this.j, false);
                        s = null;
                    }
                }
                else {
                    this.g.a(this.i, this.j, false);
                    s = null;
                }
                com.twitter.android.client.c.a((Context)this).a(this.a(null, s, s2).a(StoryScribeItem.a("x_button")));
                break;
            }
            case 2131886841: {
                com.twitter.android.highlights.e.a(this.d.b().g(), this.h, false, true, (Context)this, com.twitter.android.client.c.a((Context)this), ScribeLog.a("highlights", "storystream", null, "opt_out_prompt", "opt_out"));
                Toast.makeText((Context)this, 2131297066, 0).show();
                this.finish();
                break;
            }
        }
        final int currentItem = this.i.getCurrentItem();
        final af a = this.o.a(currentItem);
        if (a != null) {
            final View a2 = this.i.a(view);
            if (a2 == null || ((ag)a2.getTag()).E == currentItem) {
                switch (view.getId()) {
                    default: {}
                    case 2131886124: {
                        final ah ah = (ah)a;
                        if (ah.p) {
                            this.startActivity(ah.a(this.getApplicationContext()));
                        }
                        else {
                            this.a((Context)this, null, (UrlEntity)((cb)new cb().b(ah.c)).f(), this.d.b().g());
                        }
                        com.twitter.android.client.c.a((Context)this).a(((TwitterScribeLog)this.a("story", null, "open_link").a(StoryScribeItem.a(ah))).a(ah.c));
                    }
                    case 2131886854: {
                        this.startActivity(a.a((Context)this));
                        com.twitter.android.client.c.a((Context)this).a(this.a("story", null, "launch").a(StoryScribeItem.a(a)));
                    }
                    case 2131886852:
                    case 2131886876: {
                        ((ac)view.getTag()).a(this.e, this.d.b());
                    }
                    case 2131886851:
                    case 2131886875: {
                        ((ac)view.getTag()).a(this, this.d.b());
                    }
                    case 2131886853: {
                        ((ae)view.getTag()).a(this.e, this.d.b());
                    }
                    case 2131886306:
                    case 2131886861: {
                        this.startActivity(ProfileActivity.a((Context)this, 0L, (String)view.getTag(), null, null, -1, null).putExtra("association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
                        com.twitter.android.client.c.a((Context)this).a(this.a("story", "user", "image_click").a(StoryScribeItem.a(a)));
                    }
                    case 2131886695:
                    case 2131886856:
                    case 2131886859: {
                        final j imageRequest = ((BaseMediaImageView)view).getImageRequest();
                        if (imageRequest != null) {
                            final String a3 = imageRequest.a();
                            this.startActivity(new Intent((Context)this, (Class)ImageActivity.class).setData(Uri.parse(a3)).putExtra("image_url", a3).putExtra("extra_up_as_back", true));
                            com.twitter.android.client.c.a((Context)this).a(this.a("story", null, "image_click").a(StoryScribeItem.a(a)));
                            return;
                        }
                        break;
                    }
                    case 2131886843: {
                        final l l = (l)a;
                        String s3;
                        if (l.b((ag)view.getTag())) {
                            s3 = "resume";
                        }
                        else {
                            s3 = "pause";
                        }
                        com.twitter.android.client.c.a((Context)this).a(this.a("story", "tweet", s3).a(StoryScribeItem.a(l)));
                    }
                    case 2131886842: {
                        ((l)a).a((ag)view.getTag(), true);
                    }
                    case 2131886844: {
                        ((l)a).a((ag)view.getTag(), false);
                    }
                    case 2131886846: {
                        this.startActivity(new Intent((Context)this, (Class)TweetActivity.class).putExtra("tw", (Parcelable)((l)a).b).putExtra("extra_up_as_back", true));
                    }
                    case 2131886877: {
                        this.startActivity(new Intent((Context)this, (Class)TweetActivity.class).putExtra("tw", (Parcelable)((aq)view.getTag()).k).putExtra("association", (Parcelable)this.w).putExtra("extra_up_as_back", true));
                    }
                    case 2131886815: {
                        com.twitter.android.highlights.e.a(this.h, true);
                        final Session b = this.d.b();
                        if (com.twitter.android.highlights.e.a(b.g(), this.h)) {
                            int n;
                            if (!TextUtils.isEmpty((CharSequence)this.s)) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                this.b(this.s);
                            }
                            else {
                                this.b();
                            }
                            this.a(null, 1, 101);
                        }
                        else if (com.twitter.android.highlights.e.a(b.g(), this.h, true, true, (Context)this, com.twitter.android.client.c.a((Context)this), ScribeLog.a("highlights", "storystream", null, null, "opt_in"))) {
                            this.a(null, 1, 101);
                            this.b();
                        }
                        else {
                            ErrorReporter.a(new IllegalStateException("Session user account not found."));
                            this.finish();
                        }
                        this.getSupportLoaderManager().initLoader(0, null, this);
                    }
                    case 2131886809: {
                        switch (((com.twitter.android.highlights.a)a).a) {
                            case 0: {
                                this.b();
                                break;
                            }
                            case 1: {
                                new FollowFlowController("highlights").a(false).e(!com.twitter.android.util.ap.a((Context)this).l()).b(this);
                                break;
                            }
                        }
                        this.getSupportLoaderManager().initLoader(0, null, this);
                    }
                }
            }
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.t = true;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d = az.a((Context)this);
        final Session b = this.d.b();
        if (!b.d()) {
            if (StoriesActivity.a) {
                Log.d("StoriesActivity", "No logged in user; falling back to log in.");
            }
            DispatchActivity.a(this);
            return;
        }
        if (StoriesActivity.a) {
            Log.d("StoriesActivity", "Active user: " + b.e());
        }
        this.h = new com.twitter.library.client.k((Context)this, b.e());
        if (!com.twitter.android.highlights.e.a(b.g())) {
            if (StoriesActivity.a) {
                Log.d("StoriesActivity", "User does not have highlights; falling back to home timeline.");
            }
            DispatchActivity.a(this);
            return;
        }
        this.w = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("highlights")).c("storystream");
        this.e = as.a((Context)this);
        this.f = bg.a((Context)this, b.g());
        if (bundle != null) {
            this.x = (HashSet)bundle.getSerializable("STATE_STORIES_VISITED");
            this.y = bundle.getInt("STATE_NEXT_LOADER_ID", 100);
            this.A = (HashSet)bundle.getSerializable("STATE_SEARCH_IDS");
            this.f.a(this.A);
            this.z = (HashMap)bundle.getSerializable("STATE_AGGREGATE_STORY_IDS");
        }
        else {
            this.x = new HashSet();
            this.y = 100;
            this.A = new HashSet();
            this.z = new HashMap();
        }
        this.setContentView(2130968812);
        final Resources resources = this.getResources();
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(resources.getColor(2131689588)));
        this.p = (ViewGroup)this.findViewById(2131886801);
        ((FullScreenFrameLayout)this.findViewById(2131886799)).setFitSystemWindowListener(this);
        this.C = resources.getFraction(2131755010, 1, 1);
        (this.j = this.findViewById(2131886802)).setOnClickListener((View$OnClickListener)this);
        (this.i = (StoriesViewPager)this.findViewById(2131886803)).setOffscreenPageLimit(2);
        this.i.setOnPageChangeListener(this);
        this.i.setEdgeListener(this);
        this.i.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.n = new z((Context)this);
        this.o = new x((Context)this, this.n, this);
        this.i.setAdapter(this.o);
        this.g = new t(resources, this);
        this.k = (ViewStub)this.findViewById(2131886800);
        this.q = com.twitter.library.featureswitch.d.a("homescreen_recs_story_count", 14);
        this.m = com.twitter.library.featureswitch.d.a("highlights_opt_out_after_story_count", 2);
        this.a(this.getIntent());
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                if (n >= 100) {
                    final String s = this.z.get(n);
                    final com.twitter.android.highlights.am a = this.n.a(s);
                    if (a != null) {
                        final Uri$Builder buildUpon = ba.b.buildUpon();
                        com.twitter.library.provider.ae.a(buildUpon, this.d.b().g()).appendPath(s).appendQueryParameter("search_id", String.valueOf(a.c));
                        return new CursorLoader((Context)this, buildUpon.build(), null, null, null, null);
                    }
                }
                return null;
            }
            case 0: {
                return new CursorLoader((Context)this, com.twitter.library.provider.ae.a(ba.a.buildUpon(), this.d.b().g()).build(), cm.a, null, null, null);
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        if (this.f != null) {
            this.f.b(this.A);
        }
        super.onDestroy();
    }
    
    public void onGlobalLayout() {
        if (this.t && this.i.getChildCount() > 0) {
            final Resources resources = this.getResources();
            final TypedValue typedValue = new TypedValue();
            resources.getValue(2131558668, typedValue, true);
            final float float1 = typedValue.getFloat();
            final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131558713);
            final int height = this.i.getChildAt(0).getHeight();
            final int n = (int)(float1 * height);
            final int n2 = -1 * resources.getDimensionPixelOffset(2131558688);
            int pageMargin = dimensionPixelOffset + (n - resources.getDisplayMetrics().widthPixels);
            if (pageMargin > n2) {
                final int n3 = (height - (int)((n2 + resources.getDisplayMetrics().widthPixels - dimensionPixelOffset) / float1)) / 2;
                final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)this.i.getLayoutParams();
                layoutParams.topMargin = n3;
                layoutParams.bottomMargin = n3;
                this.i.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                pageMargin = n2;
            }
            this.i.setPageMargin(pageMargin);
            this.g.a = (resources.getDisplayMetrics().widthPixels - n) / 2;
            this.t = false;
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        final int id = loader.getId();
        switch (id) {
            default: {
                if (id >= 100) {
                    final com.twitter.android.highlights.am a = this.n.a(this.z.get(id));
                    if (a != null) {
                        a.a.swapCursor((Cursor)null);
                    }
                }
            }
            case 0: {
                this.a(null, 0, 101);
            }
        }
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.a(intent);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        com.twitter.android.client.x.a((Context)this).a(this.d.b().e(), 32);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final Session b = this.d.b();
        final Account a = com.twitter.library.util.a.a((Context)this, b.e());
        if (a == null) {
            if (StoriesActivity.a) {
                Log.d("StoriesActivity", "Current logged in user was removed; falling back to log in.");
            }
            DispatchActivity.a(this);
        }
        else {
            com.twitter.android.client.x.a((Context)this).b(a.name, 32);
            int intExtra;
            int n;
            if (!com.twitter.android.highlights.e.a(this.h)) {
                if (com.twitter.android.highlights.e.b(b.g())) {
                    intExtra = 2;
                    n = 0;
                }
                else {
                    n = 1;
                    intExtra = 1;
                }
            }
            else {
                n = 0;
                intExtra = 0;
            }
            final Intent intent = this.getIntent();
            if (intent != null) {
                final Uri data = intent.getData();
                if (intent.hasExtra("EXTRA_HIGHLIGHTS_FORCE_STATE")) {
                    intExtra = intent.getIntExtra("EXTRA_HIGHLIGHTS_FORCE_STATE", 0);
                    if (intExtra == 3) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                }
                else if (data != null) {
                    if (data.getQueryParameter("promptbird") != null) {
                        n = 1;
                        intExtra = 1;
                    }
                    else if ("true".equals(data.getQueryParameter("allow_optout"))) {
                        this.B = true;
                    }
                }
                com.twitter.android.client.c.a((Context)this).a(this.a(null, null, "impression"));
            }
            com.twitter.android.client.x.a((Context)this).c();
            final long long1 = this.h.getLong("highlights_last_user_view_time", 0L);
            this.h.a().a("highlights_last_user_view_time", System.currentTimeMillis()).apply();
            this.a(intent, long1, intExtra);
            this.setIntent((Intent)null);
            if (this.r) {
                this.i.setEnabled(true);
            }
            if (n == 0) {
                this.getSupportLoaderManager().initLoader(0, null, this);
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("STATE_NEXT_LOADER_ID", this.y);
        bundle.putSerializable("STATE_SEARCH_IDS", (Serializable)this.A);
        bundle.putSerializable("STATE_AGGREGATE_STORY_IDS", (Serializable)this.z);
        bundle.putSerializable("STATE_STORIES_VISITED", (Serializable)this.x);
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        if (absListView.getId() == 2131886871 && absListView.getChildCount() != 0) {
            final ar ar = (ar)absListView.getTag();
            if (n == 0) {
                final al al = (al)this.o.a(ar.E);
                if (al != null) {
                    final com.twitter.android.highlights.am a = this.n.a(al.e);
                    if (a != null && a.c == 0L && !this.a((CharSequence)al.r)) {
                        a.c = com.twitter.util.q.a.nextLong();
                        this.A.add(a.c);
                        final int n4 = this.y++;
                        this.z.put(n4, al.e);
                        this.f.i(a.c);
                        this.e.a(new com.twitter.library.api.search.g((Context)this, this.d.b(), a.c, al.r, 0, "timeline", al.r, 0, null, false).a(1, false, false, false).c(10), a.b);
                        this.getSupportLoaderManager().restartLoader(n4, null, this);
                    }
                    this.c.add(al);
                }
            }
            if (n + n2 == n3) {
                final int n5 = absListView.getChildAt(-1 + absListView.getChildCount()).getBottom() - absListView.getHeight();
                final int paddingBottom = absListView.getPaddingBottom();
                if (n5 > paddingBottom) {
                    ar.D.setVisibility(0);
                    return;
                }
                if (n5 == paddingBottom) {
                    ar.D.setVisibility(8);
                }
            }
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
    
    @Override
    protected void onStop() {
        for (final Map.Entry<al, V> entry : this.b.entrySet()) {
            final al al = entry.getKey();
            final Iterator iterator2 = ((Set)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                com.twitter.android.client.c.a((Context)this).a(this.a("story", "tweet", "impression").a(StoryScribeItem.a(al, iterator2.next())));
            }
        }
        this.b.clear();
        final Iterator<al> iterator3 = this.c.iterator();
        while (iterator3.hasNext()) {
            com.twitter.android.client.c.a((Context)this).a(this.a("story", null, "scroll").a(StoryScribeItem.a(iterator3.next())));
        }
        this.c.clear();
        super.onStop();
    }
}
