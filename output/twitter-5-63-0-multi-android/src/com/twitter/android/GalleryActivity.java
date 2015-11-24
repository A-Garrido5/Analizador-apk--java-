// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.KeyEvent;
import com.twitter.library.widget.SlidingUpPanelLayout;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Collections;
import android.net.Uri;
import com.twitter.errorreporter.ErrorReporter;
import android.app.Dialog;
import java.util.ArrayList;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bj;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.PagerAdapter;
import android.os.Parcelable;
import com.twitter.library.provider.ae;
import com.twitter.library.widget.aj;
import com.twitter.library.view.z;
import android.app.Activity;
import java.util.Iterator;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.composer.au;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.timeline.ah;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import java.util.HashSet;
import android.content.DialogInterface;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.os.AsyncTask$Status;
import com.twitter.library.widget.StatusToolBar;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.api.PromotedEvent;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.twitter.library.media.manager.UserImageRequest;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import java.util.List;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.widget.TextView;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;
import android.view.animation.Animation;
import com.twitter.ui.widget.TwitterButton;
import android.view.View;
import com.twitter.ui.dialog.e;
import android.view.View$OnClickListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;

public class GalleryActivity extends TwitterFragmentActivity implements LoaderManager$LoaderCallbacks, ViewPager$OnPageChangeListener, View$OnClickListener, cl, ye, e, fp
{
    private View A;
    private View B;
    private TwitterButton F;
    private final fo G;
    private im H;
    private String I;
    Animation a;
    Animation b;
    ig c;
    Tweet d;
    MediaEntity e;
    int f;
    private TweetView g;
    private ViewPager h;
    private long i;
    private boolean j;
    private boolean k;
    private ViewGroup l;
    private MediaActionBarFragment m;
    private TextView n;
    private Session o;
    private String[] p;
    private TwitterScribeAssociation q;
    private TwitterScribeItem r;
    private ij s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private ya x;
    private SlidingPanel y;
    private long z;
    
    public GalleryActivity() {
        this.f = -1;
        this.i = Long.MIN_VALUE;
        this.k = false;
        this.G = new fo(this);
    }
    
    private void a(final int n, final long n2, final PromotedContent promotedContent, final String s) {
        final String c = this.c(n);
        if (c != null) {
            this.G().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(n2, promotedContent, s).b(new String[] { c })).a(this.q)).a(this.r));
        }
    }
    
    private void a(final int n, final Tweet tweet) {
        final String c = this.c(n);
        if (c != null) {
            this.G().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.U().g()).a(this.getApplicationContext(), tweet, this.q, null).b(new String[] { c })).a(this.q)).a(this.r));
        }
    }
    
    private void a(final long n, final List list, final Set set) {
        this.a(new i((Context)this, this.o, n, this.o.g(), list, set), 0);
    }
    
    private void a(final Tweet tweet) {
        this.H.a(tweet);
        this.G.a(tweet);
        this.g.setTweet(tweet);
        this.d = tweet;
        this.m.a(tweet);
        this.Q();
        this.h();
    }
    
    private String c(final int n) {
        if (this.p != null && n >= 0 && n < this.p.length) {
            return this.p[n];
        }
        return null;
    }
    
    private String d(final int n) {
        String s = "";
        String s2 = null;
        switch (n) {
            default: {
                this.p = null;
                return null;
            }
            case 0: {
                s2 = "profile";
                break;
            }
            case 1: {
                s2 = "events";
                break;
            }
            case 2: {
                s2 = "search";
                break;
            }
            case 3: {
                s2 = "search";
                s = "cluster";
                break;
            }
            case 4: {
                s2 = "home";
                break;
            }
            case 5: {
                s2 = "tweet";
                break;
            }
            case 6: {
                s2 = "profile_tweets";
                break;
            }
            case 7: {
                s2 = "list";
                break;
            }
            case 8: {
                s2 = "favorites";
                break;
            }
            case 9: {
                s2 = "network_activity";
                break;
            }
            case 10: {
                if (this.q != null && this.q.a() != null) {
                    s2 = this.q.a();
                }
                else {
                    s2 = "photo_grid";
                }
                if (this.q != null && this.q.b() != null) {
                    s = this.q.b();
                    break;
                }
                break;
            }
            case 11: {
                if (this.q != null && this.q.a() != null) {
                    s2 = this.q.a();
                }
                else {
                    s2 = "profile";
                }
                if (this.q != null && this.q.b() != null) {
                    s = this.q.b();
                    break;
                }
                break;
            }
        }
        this.p = new String[] { ScribeLog.a(s2, s, "gallery", "next:click"), ScribeLog.a(s2, s, "gallery", "prev:click"), ScribeLog.a(s2, s, "gallery", this.I), ScribeLog.a(s2, s, "gallery", "tweet:click"), ScribeLog.a(s2, s, "gallery", "media_tag_summary:click"), ScribeLog.a(s2, s, "gallery", "remove_my_media_tag:click"), ScribeLog.a(s2, s, "gallery", "media_tagged_user:follow"), ScribeLog.a(s2, s, "gallery", "media_tagged_user:unfollow"), ScribeLog.a(s2, s, "gallery", "tweet:open_link"), ScribeLog.a(s2, s, "gallery", "button:cta_click_open") };
        return s2;
    }
    
    private void h() {
        final Tweet d = this.d;
        if (d.P()) {
            final List a = ag.a((Iterable)com.twitter.library.media.util.q.a(d, Size.a));
            this.x.a(this.getSupportLoaderManager(), ag.b(a));
            this.n.setOnClickListener((View$OnClickListener)new ie(this, a, d));
            this.n.setText(ag.a((Context)this, a, 2130839198), TextView$BufferType.SPANNABLE);
            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
            layoutParams.setMargins(this.u, this.v, 0, this.w);
            this.n.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.n.setVisibility(0);
            return;
        }
        this.n.setVisibility(8);
    }
    
    private void i() {
        final Resources resources = this.getResources();
        if (this.g.getVisibility() == 0) {
            final TypedArray obtainStyledAttributes = this.obtainStyledAttributes((AttributeSet)null, pa.TweetView, 2130772130, 0);
            this.u = obtainStyledAttributes.getDimensionPixelOffset(52, 0) + (obtainStyledAttributes.getDimensionPixelOffset(54, UserImageRequest.a(-3)) + (obtainStyledAttributes.getDimensionPixelOffset(50, 0) + this.g.getPaddingLeft()));
            this.v = resources.getDimensionPixelOffset(2131558657);
            obtainStyledAttributes.recycle();
        }
        else {
            this.u = resources.getDimensionPixelOffset(2131558655);
            this.v = resources.getDimensionPixelOffset(2131558656);
        }
        this.w = resources.getDimensionPixelOffset(2131558654);
    }
    
    private void j() {
        if (!this.k) {
            this.a(2, (Tweet)null);
            this.k = true;
        }
    }
    
    private void k() {
        if (Build$VERSION.SDK_INT < 19) {
            this.l.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)new if(this));
        }
    }
    
    public void C_() {
        if (this.d != null && this.d.j != null) {
            this.G().a(PromotedEvent.f, this.d.j);
        }
    }
    
    public Animation U_() {
        return this.b;
    }
    
    protected int a(final ToolBar toolBar) {
        final int a = super.a(toolBar);
        if (toolBar instanceof StatusToolBar) {
            ((StatusToolBar)toolBar).setDisplayShowStatusBarEnabled(false);
        }
        ik b;
        if (this.c != null) {
            b = this.c.b(this.f);
        }
        else {
            b = null;
        }
        if (b == null) {
            return a;
        }
        final boolean b2 = this.I().b(b.d) != null;
        toolBar.a(2131887428).c(b2 && (this.s == null || this.s.getStatus() == AsyncTask$Status.FINISHED));
        if (this.t || this.d == null) {
            toolBar.a(2131887427).b(false);
            toolBar.a(2131886232).b(false);
            return 1;
        }
        toolBar.a(2131887471).b(ag.a(com.twitter.library.media.util.q.a(this.d, Size.a), this.o.g()));
        int n;
        if (this.d.f == this.o.g()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (!kg.a((Context)this)) {
            final jx a2 = toolBar.a(2131886232);
            boolean b3 = false;
            if (n != 0) {
                final boolean g = this.d.g;
                b3 = false;
                if (!g) {
                    b3 = true;
                }
            }
            a2.b(b3);
            toolBar.a(2131887427).b(this.U().d());
            toolBar.a(2131887427).c(b2);
            return 1;
        }
        toolBar.a(2131886232).b(false);
        toolBar.a(2131887427).b(false);
        toolBar.a(2131887427).c(false);
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968969);
        bn.d(false);
        bn.a(false);
        bn.c(false);
        return bn;
    }
    
    public void a(final int visibility) {
        if (visibility == 0) {
            this.M().c();
        }
        else if (!this.x.a()) {
            this.M().d();
        }
        final ViewGroup l = this.l;
        for (int childCount = l.getChildCount(), i = 0; i < childCount; ++i) {
            l.getChildAt(i).setVisibility(visibility);
        }
        if (visibility == 0) {
            this.y.requestFocus();
        }
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        switch (n) {
            case 0: {
                if (this.d.Q == ((i)y).b()) {
                    int n2;
                    if (((aa)y.l().b()).a()) {
                        n2 = 2131297258;
                    }
                    else {
                        n2 = 2131297257;
                        this.M().a(2131887471).b(true);
                    }
                    Toast.makeText((Context)this, n2, 0).show();
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.M().a(2131887471).b(false);
                    final HashSet<Long> set = new HashSet<Long>();
                    set.add(this.o.g());
                    this.a(this.d.Q, com.twitter.library.media.util.q.f(this.d.G.media), set);
                    this.a(5, this.d);
                    this.x.b();
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final List a = ((il)loader).a();
        this.c.a(a);
        int max = Math.max(this.f, 0);
        Label_0102: {
            if (this.i != Long.MIN_VALUE && this.e == null) {
                while (true) {
                    for (int size = a.size(), i = 0; i < size; ++i) {
                        if (a.get(i).a.E == this.i) {
                            this.i = Long.MIN_VALUE;
                            final int n = i;
                            max = n;
                            break Label_0102;
                        }
                    }
                    final int n = max;
                    continue;
                }
            }
            if (this.e != null && this.f == -1) {
                if (!TextUtils.isEmpty((CharSequence)this.e.mediaUrl)) {
                    for (int size2 = a.size(), j = 0; j < size2; ++j) {
                        if (this.e.mediaUrl.equals(a.get(j).b.l)) {
                            this.f = j;
                            max = j;
                            break;
                        }
                    }
                }
            }
            else if (cursor != null && !cursor.moveToFirst()) {
                this.a(new ah((Context)this, this.o, this.z), 1);
            }
        }
        this.h.setCurrentItem(max, false);
        this.onPageSelected(max);
        this.j();
    }
    
    public void a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.F.setText((CharSequence)this.getString(2131296384, new Object[] { s }));
            return;
        }
        this.F.setText((CharSequence)this.getString(2131296383));
    }
    
    public void a(final boolean b) {
        this.c(!b);
    }
    
    public void a(final boolean b, final long n, final String s, final PromotedContent promotedContent) {
        int n2;
        if (b) {
            n2 = 6;
        }
        else {
            n2 = 7;
        }
        this.a(n2, n, promotedContent, s);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951634, toolBar);
        jv.a(2131951649, toolBar);
        jv.a(2131951630, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887428) {
            if (this.s != null && this.s.getStatus() != AsyncTask$Status.FINISHED) {
                this.s.cancel(true);
            }
            (this.s = new ij((Context)this)).execute((Object[])new ik[] { this.c.b(this.f) });
            return true;
        }
        if (a == 2131887427) {
            String s = null;
            Label_0113: {
                if (this.e != null) {
                    s = this.e.expandedUrl;
                }
                else {
                    final TweetClassicCard s2 = this.d.S();
                    final MediaEntity q = this.d.Q();
                    if (s2 != null) {
                        final String url = s2.url;
                        for (final UrlEntity urlEntity : this.d.G.c()) {
                            if (urlEntity.url.equals(url)) {
                                s = urlEntity.expandedUrl;
                                break Label_0113;
                            }
                        }
                        s = url;
                    }
                    else {
                        s = null;
                        if (q != null) {
                            s = q.expandedUrl;
                        }
                    }
                }
            }
            if (s != null) {
                com.twitter.android.composer.au.a((Context)this).a(" " + s, new int[] { 0, 0 }).a(this.o.e()).b((Context)this);
                return true;
            }
        }
        else if (a == 2131887471) {
            PromptDialogFragment.b(1).d(2131297547).h(2131297362).j(2131296445).a(this).a(this.getSupportFragmentManager());
        }
        else if (a == 2131886232) {
            this.showDialog(1);
        }
        return super.a(jx);
    }
    
    public Animation b() {
        return this.a;
    }
    
    public void b(final int n) {
        final TweetView g = this.g;
        final ToolBar m = this.M();
        if ((n & 0x1) != 0x0) {
            g.setOnTweetViewClickListener(new gq(this, this.G(), this.U(), this.c(8), null, this.q));
            g.setAutoLink(true);
        }
        else {
            g.setOnTweetViewClickListener(null);
            g.setAutoLink(false);
        }
        if (m != null) {
            if ((n & 0x2) != 0x0) {
                m.setCustomView(this.A);
            }
            else {
                m.setCustomView(null);
            }
        }
        if ((n & 0x4) != 0x0) {
            this.F.setVisibility(0);
            return;
        }
        this.F.setVisibility(8);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.I = intent.getStringExtra("photo_impression");
        if (TextUtils.isEmpty((CharSequence)this.I)) {
            this.I = "photo:impression";
        }
        this.q = (TwitterScribeAssociation)intent.getParcelableExtra("association");
        this.t = intent.getBooleanExtra("dm", false);
        this.o = this.T().b();
        final SlidingPanel y = (SlidingPanel)this.findViewById(2131886629);
        final ya ya = new ya(this, this.U(), this.q, y, 2130837610);
        ya.a(this);
        this.x = ya;
        y.a(1);
        y.setPanelSlideListener(ya);
        y.setClipChildren(false);
        y.setFadeMode(1);
        y.setCoveredFadeColor(-16777216);
        this.y = y;
        int intExtra;
        ArrayList list;
        Bundle bundle2;
        if (intent.hasExtra("li")) {
            final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("li");
            if (intent.hasExtra("list_starting_index")) {
                intExtra = intent.getIntExtra("list_starting_index", 0);
                list = parcelableArrayListExtra;
                bundle2 = null;
            }
            else {
                list = parcelableArrayListExtra;
                bundle2 = null;
                intExtra = 0;
            }
        }
        else if (this.t) {
            bundle2 = null;
            intExtra = 0;
            list = null;
        }
        else if (intent.hasExtra("tw")) {
            final Bundle bundle3 = new Bundle();
            bundle3.putParcelable("uri", (Parcelable)ae.b(((Tweet)intent.getParcelableExtra("tw")).Q, this.U().g()));
            bundle3.putStringArray("projection", Tweet.b);
            bundle2 = bundle3;
            intExtra = 0;
            list = null;
        }
        else if (intent.hasExtra("statusId")) {
            final Bundle bundle4 = new Bundle();
            this.z = intent.getLongExtra("statusId", 0L);
            bundle4.putParcelable("uri", (Parcelable)ae.b(this.z, this.U().g()));
            bundle4.putStringArray("projection", Tweet.b);
            bundle2 = bundle4;
            intExtra = 0;
            list = null;
        }
        else {
            if (intent.getData() == null) {
                this.finish();
                return;
            }
            final Bundle bundle5 = new Bundle();
            bundle5.putParcelable("uri", (Parcelable)intent.getData());
            bundle5.putStringArray("projection", intent.getStringArrayExtra("prj"));
            bundle5.putString("selection", intent.getStringExtra("sel"));
            bundle5.putStringArray("selectionArgs", intent.getStringArrayExtra("selArgs"));
            bundle5.putString("orderBy", intent.getStringExtra("orderBy"));
            this.i = intent.getLongExtra("id", Long.MIN_VALUE);
            bundle2 = bundle5;
            intExtra = 0;
            list = null;
        }
        if (intent.hasExtra("media")) {
            this.e = (MediaEntity)intent.getSerializableExtra("media");
            if (bundle2 != null) {
                bundle2.putLong("sourceStatusId", this.e.sourceTweetId);
            }
        }
        final boolean booleanExtra = intent.getBooleanExtra("etc", true);
        final String d = this.d(intent.getIntExtra("context", -1));
        this.r = (TwitterScribeItem)intent.getParcelableExtra("item");
        this.c = new ig(this);
        final ViewPager h = (ViewPager)this.findViewById(2131886367);
        h.setOffscreenPageLimit(3);
        h.setAdapter(this.c);
        h.setOnPageChangeListener(this);
        h.setPageMargin(this.getResources().getDimensionPixelSize(2131558422));
        this.h = h;
        final GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(this.getApplicationContext(), (GestureDetector$OnGestureListener)new ib(this, ya));
        gestureDetectorCompat.setIsLongpressEnabled(false);
        (this.l = (ViewGroup)this.findViewById(2131887125)).setOnTouchListener((View$OnTouchListener)new ic(this, gestureDetectorCompat, h));
        this.k();
        this.n = (TextView)this.findViewById(2131887126);
        final TweetView g = (TweetView)this.l.findViewById(2131887128);
        int n = 1;
        if (this.t) {
            n = 0;
        }
        g.setHideInlineActions(true);
        g.setRenderRtl(bj.e);
        g.setHideMediaTagSummary(true);
        if (booleanExtra) {
            g.setOnClickListener((View$OnClickListener)this);
        }
        g.setAlwaysStripMediaUrls(true);
        g.setPromotedBadgeEnabled(false);
        this.g = g;
        final ck ck = new ck(this);
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2131034141);
        loadAnimation.setAnimationListener((Animation$AnimationListener)ck);
        loadAnimation.setFillAfter(true);
        loadAnimation.setDuration(150L);
        this.a = loadAnimation;
        final Animation loadAnimation2 = AnimationUtils.loadAnimation((Context)this, 2131034143);
        loadAnimation2.setAnimationListener((Animation$AnimationListener)ck);
        loadAnimation2.setFillAfter(true);
        loadAnimation2.setDuration(150L);
        this.b = loadAnimation2;
        com.twitter.util.c.a((View)this.l, 1536);
        if (bundle == null) {
            this.j = true;
            ya.a = intent.getBooleanExtra("tagged_user_list", false);
        }
        else {
            this.j = bundle.getBoolean("cv", this.j);
            this.f = bundle.getInt("current_position", this.f);
            ya.b(bundle);
        }
        if (bundle2 != null) {
            this.getSupportLoaderManager().initLoader(0, bundle2, this);
        }
        else if (this.t) {
            this.f = 0;
            this.c.a(null, this.e, true);
            this.j();
            this.c(false);
            this.setTitle(2131297076);
        }
        else if (this.d != null) {
            this.c.a(this.d, this.e, false);
            this.a(this.d);
            this.j();
            this.setTitle(2131297985);
        }
        else if (list != null) {
            this.c.b(list);
            g.setVisibility(8);
            if (list.size() == 1) {
                this.setTitle(2131297985);
                n = 0;
            }
            else {
                if (intExtra == 0) {
                    this.onPageSelected(intExtra);
                }
                this.h.setCurrentItem(intExtra);
                n = 0;
            }
        }
        if (n != 0) {
            this.m = MediaActionBarFragment.a(this, 2131886241, this.q, d, "", "gallery");
        }
        this.s = (ij)this.getLastCustomNonConfigurationInstance();
        this.i();
        this.H = new im(new gq(this, this.G(), this.U(), this.c(9), null, this.q));
        this.A = LayoutInflater.from((Context)this).inflate(2130969134, (ViewGroup)this.M(), false);
        (this.B = this.A.findViewById(2131887302)).setOnClickListener((View$OnClickListener)this.H);
        (this.F = (TwitterButton)this.findViewById(2131887127)).setOnClickListener((View$OnClickListener)this.H);
        this.G.a(fm.a().a(intent.getBooleanExtra("show_tw", true) && (intent.hasExtra("tw") || intent.hasExtra("prj"))).a(intent.getIntExtra("tw_link", 0)).a());
    }
    
    public void b(final boolean b) {
        if (b) {
            this.g.setVisibility(0);
            return;
        }
        this.g.setVisibility(8);
    }
    
    public void c(final boolean j) {
        if (this.j == j) {
            return;
        }
        if (j) {
            com.twitter.util.c.a((View)this.l, 1536);
            this.l.startAnimation(this.a);
        }
        else {
            this.l.startAnimation(this.b);
            if (!this.x.a()) {
                com.twitter.util.c.a((View)this.l);
            }
        }
        this.j = j;
    }
    
    @Override
    protected void g_() {
        if (this.t) {
            super.onBackPressed();
            return;
        }
        super.g_();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                if (this.x != null) {
                    this.x.a(n, n2, intent);
                    break;
                }
                break;
            }
            case 3: {
                if (10 == n2) {
                    this.finish();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.x.a()) {
            this.x.a(false);
            return;
        }
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {
                final Tweet d = this.d;
                this.startActivityForResult(new Intent((Context)this, (Class)TweetActivity.class).putExtra("tw", (Parcelable)d).putExtra("association", (Parcelable)this.q), 3);
                this.a(3, d);
            }
            case 2131887127:
            case 2131887302: {}
        }
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                if (this.t) {
                    String string;
                    if (this.e == null) {
                        string = "ANATOMY-371: attempting to delete a null DM photo";
                    }
                    else {
                        string = "ANATOMY-371: attempting to delete DM photo #" + this.e.id;
                    }
                    ErrorReporter.a(new IllegalStateException(string));
                    return null;
                }
                if (this.d == null) {
                    ErrorReporter.a(new IllegalStateException("ANATOMY-371: attempting to delete a photo but mTweet is null"));
                    return null;
                }
                return MediaActionBarFragment.a(this, this.d.E, n);
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new il((Context)this, (Uri)bundle.getParcelable("uri"), bundle.getStringArray("projection"), bundle.getString("selection"), bundle.getStringArray("selectionArgs"), bundle.getString("orderBy"), bundle.getLong("sourceStatusId", -1L));
    }
    
    @Override
    protected void onDestroy() {
        if (this.l != null) {
            this.l.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)null);
        }
        if (this.c != null) {
            this.c.c();
            this.c = null;
        }
        if (this.h != null) {
            final ViewGroup viewGroup = (ViewGroup)this.h.getParent();
            viewGroup.removeAllViews();
            viewGroup.measure(0, 0);
            this.h = null;
        }
        super.onDestroy();
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        if (this.c != null) {
            this.c.a(Collections.emptyList());
        }
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
    }
    
    @Override
    public void onPageSelected(final int f) {
        final ig c = this.c;
        final int count = c.getCount();
        if (count > 0) {
            if (count > 1) {
                this.setTitle(this.getString(2131297439, new Object[] { f + 1, count }));
            }
            else {
                this.setTitle(this.getString(2131297985));
            }
            final Tweet a = c.a(f);
            if (a != null) {
                final int f2 = this.f;
                final boolean b = f != f2;
                final ya x = this.x;
                final boolean b2 = b | x.b;
                x.b = b2;
                if (b2) {
                    this.x.b();
                }
                this.a(a);
                if (f2 != -1) {
                    if (f == f2 + 1) {
                        this.a(0, a);
                    }
                    else if (f == f2 - 1) {
                        this.a(1, a);
                    }
                    if (f2 != f) {
                        final PromotedContent j = a.j;
                        if (j != null) {
                            this.G().a(PromotedEvent.p, j);
                        }
                    }
                }
            }
        }
        this.f = f;
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle != null) {
            if (this.y.getPanelState() != 0) {
                this.y.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new id(this));
            }
        }
        else if (this.x.a()) {
            this.x.a(true);
        }
        if (this.j) {
            this.a(0);
            return;
        }
        this.a(4);
    }
    
    protected void onRestart() {
        super.onRestart();
        this.c.b();
    }
    
    public Object onRetainCustomNonConfigurationInstance() {
        return this.s;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("cv", this.j);
        bundle.putInt("current_position", this.f);
        bundle.putBoolean("dm", this.t);
        this.x.a(bundle);
    }
    
    @Override
    protected void onStop() {
        this.c.a();
        super.onStop();
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b && !this.j && !this.x.a()) {
            com.twitter.util.c.a((View)this.l);
        }
    }
}
