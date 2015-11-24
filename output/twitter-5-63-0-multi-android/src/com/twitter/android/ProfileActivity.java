// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewParent;
import android.widget.AdapterView;
import android.support.v4.content.CursorLoader;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.util.collection.CollectionUtils;
import android.accounts.Account;
import java.util.ArrayList;
import com.twitter.android.client.SearchSuggestionController;
import com.twitter.android.profiles.s;
import android.os.Build$VERSION;
import android.accounts.AccountManager;
import android.widget.RelativeLayout;
import com.twitter.library.media.widget.BackgroundImageView;
import com.twitter.library.media.widget.MediaImageView;
import java.util.Set;
import java.util.HashSet;
import android.view.LayoutInflater;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.App;
import android.preference.PreferenceManager;
import com.twitter.android.widget.ProfileEmptyAvatarOverlay;
import com.twitter.library.client.AbsFragmentActivity;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import com.twitter.library.service.ab;
import com.twitter.internal.network.l;
import com.twitter.android.client.x;
import com.twitter.android.client.bn;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Handler;
import android.os.Looper;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Toast;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.client.ap;
import com.twitter.library.api.bh;
import com.twitter.android.client.ca;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.twitter.android.profiles.ag;
import com.twitter.android.profiles.o;
import com.twitter.android.profiles.p;
import com.twitter.internal.android.widget.ToolBar;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import com.twitter.library.client.Session;
import android.graphics.Bitmap;
import java.util.Iterator;
import android.support.v4.app.FragmentManager;
import java.util.Date;
import com.twitter.library.view.k;
import com.twitter.android.widget.ec;
import com.twitter.android.avatars.b;
import java.util.List;
import android.widget.ListAdapter;
import com.twitter.library.util.bj;
import java.util.Collections;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.app.Fragment;
import com.twitter.android.util.bd;
import com.twitter.ui.widget.TwitterButton;
import android.text.SpannableStringBuilder;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import android.app.Activity;
import com.twitter.library.util.aj;
import com.twitter.internal.android.widget.f;
import com.twitter.android.widget.LoggedOutBar;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.android.composer.ComposerDockLayout;
import java.io.Serializable;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.platform.PushService;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.android.profiles.ah;
import com.twitter.android.profiles.t;
import com.twitter.library.service.z;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ListView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.TwitterUser;
import android.content.SharedPreferences;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.profiles.animation.BalloonSetAnimationView;
import android.widget.TextView;
import com.twitter.android.profiles.q;
import com.twitter.android.profiles.ad;
import com.twitter.android.profiles.d;
import com.twitter.library.util.FriendshipCache;
import android.widget.LinearLayout;
import android.widget.ImageView;
import com.twitter.android.widget.TweetStatView;
import com.twitter.android.profiles.a;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.android.profiles.HeaderImageView;
import com.twitter.android.profiles.v;
import android.net.Uri;
import com.twitter.ui.dialog.e;
import com.twitter.android.profiles.u;
import com.twitter.android.profiles.r;
import com.twitter.android.profiles.i;
import com.twitter.android.profiles.c;
import com.twitter.android.profiles.af;
import com.twitter.android.profiles.ae;
import com.twitter.android.profiles.aa;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.accounts.OnAccountsUpdateListener;

public class ProfileActivity extends ScrollingHeaderUserQueryActivity implements OnAccountsUpdateListener, LoaderManager$LoaderCallbacks, View$OnClickListener, aa, ae, af, c, i, r, u, e
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    private os F;
    private v G;
    private HeaderImageView H;
    private UserImageView I;
    private a J;
    private TweetStatView K;
    private TweetStatView L;
    private String M;
    private ImageView N;
    private ImageView O;
    private float P;
    private String Q;
    private LinearLayout R;
    private int S;
    private boolean T;
    private int U;
    private boolean V;
    private String W;
    private boolean X;
    private boolean Y;
    private FriendshipCache Z;
    private String aA;
    private boolean aB;
    private d aC;
    private ad aD;
    private q aE;
    private boolean aF;
    private int aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    private TextView aL;
    private jx aM;
    private jx aN;
    private BalloonSetAnimationView aO;
    private PromotedContent aa;
    private CardInstanceData ab;
    private boolean ac;
    private SharedPreferences ad;
    private TwitterUser ae;
    private Uri af;
    private boolean ag;
    private qi ah;
    private TwitterScribeAssociation ai;
    private sx aj;
    private ListView ak;
    private LinearLayout al;
    private int am;
    private View an;
    private ViewGroup ao;
    private z ap;
    private or aq;
    private t ar;
    private boolean as;
    private boolean at;
    private int au;
    private View av;
    private View aw;
    private com.twitter.android.metrics.d ax;
    private boolean ay;
    private boolean az;
    
    static {
        a = Uri.parse("twitter://profile/tweets");
        b = Uri.parse("twitter://profile/media");
        c = Uri.parse("twitter://profile/favorites");
        d = Uri.parse("twitter://profile/protected_account");
        e = Uri.parse("twitter://profile/blocked_account");
        f = Uri.parse("twitter://profile/blocker_interstitial");
        g = Uri.parse("twitter://profile/followers");
        h = Uri.parse("twitter://profile/following");
        i = Uri.parse("twitter://profile/follow");
        j = Uri.parse("twitter://profile/device_follow");
    }
    
    public ProfileActivity() {
        this.ay = true;
        this.az = false;
        this.aF = false;
        this.aH = false;
        this.aI = false;
        this.aJ = true;
        this.aK = false;
    }
    
    private boolean X() {
        return com.twitter.android.profiles.ah.a();
    }
    
    private void Y() {
        final int au = this.au;
        if (this.B == null) {
            this.au = 0;
        }
        else if (com.twitter.android.profiles.ah.a(this.A, this.U)) {
            this.au = 2;
        }
        else if (com.twitter.android.profiles.ah.a(this.A, this.B, this.U)) {
            this.au = 4;
        }
        else if (com.twitter.android.profiles.ah.b(this.A, this.B, this.U) && !this.at) {
            this.au = 3;
        }
        else {
            this.au = 1;
        }
        if (au != this.au) {
            if (this.au != 0 && this.au != 1) {
                this.ax.k();
            }
            this.k = this.d();
            this.F.a(this.k);
            ((ot)this.l.getAdapter()).a(this.k);
            this.af();
            this.Z();
        }
    }
    
    private void Z() {
        if (this.af == null) {
            return;
        }
        final boolean a = kg.a((Context)this);
        if (ProfileActivity.g.equals((Object)this.af)) {
            if (a) {
                kg.b(this, 6, this.M);
            }
            else {
                this.startActivity(com.twitter.android.util.v.a((Context)this, this.U().g(), this.B, null));
            }
        }
        else if (ProfileActivity.h.equals((Object)this.af)) {
            if (a) {
                kg.b(this, 5, this.M);
            }
            else {
                this.startActivity(this.an());
            }
        }
        else if (ProfileActivity.i.equals((Object)this.af)) {
            if (a) {
                kg.b(this, 4, this.M);
            }
            else if (!this.A && !com.twitter.library.api.z.b(this.U) && !com.twitter.library.api.z.f(this.U) && !com.twitter.library.api.z.e(this.U)) {
                this.n(14);
            }
        }
        else if (ProfileActivity.j.equals((Object)this.af)) {
            if (!a) {
                final boolean g = PushService.g((Context)this, this.U().e());
                boolean b = false;
                if (g) {
                    final boolean c = PushService.c((Context)this);
                    b = false;
                    if (c) {
                        b = true;
                    }
                }
                if (com.twitter.android.profiles.ah.a(b, this.aD)) {
                    this.n(13);
                }
            }
        }
        else {
            for (int i = 0; i < this.k.size(); ++i) {
                if (((gm)this.k.get(i)).c.equals((Object)this.af)) {
                    this.a(i);
                    break;
                }
            }
        }
        this.af = null;
    }
    
    public static Intent a(final Context context, final long n, final String s, final PromotedContent promotedContent, final TwitterScribeAssociation twitterScribeAssociation, final int n2, final PromotedEvent promotedEvent) {
        final Intent putExtra = new Intent(context, (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("association", (Parcelable)twitterScribeAssociation).putExtra("screen_name", s);
        if (n2 != -1) {
            putExtra.putExtra("friendship", n2);
        }
        if (promotedContent != null) {
            if (promotedEvent != null) {
                com.twitter.android.client.c.a(context).a(promotedEvent, promotedContent);
            }
            putExtra.putExtra("pc", (Serializable)promotedContent);
        }
        return putExtra;
    }
    
    private gm a(final Uri uri, final int n) {
        int n2 = 1;
        final Bundle bundle = new Bundle();
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        Serializable s;
        int n3;
        if (ProfileActivity.a.equals((Object)uri)) {
            bundle.putInt("statuses_count", this.B.statusesCount);
            bundle.putInt("empty_title", 2131297310);
            bundle.putLong("owner_id", this.y);
            bundle.putInt("type", n2);
            bundle.putInt("title", 2131297488);
            bundle.putLong("userid_of_current_profile", this.y);
            bundle.putBoolean("is_me", this.A);
            bundle.putParcelable("user", (Parcelable)this.B);
            bundle.putString("scribe_section", "tweets");
            s = ProfileTimelinesFragment.class;
            n3 = 2131297488;
        }
        else if (ProfileActivity.b.equals((Object)uri)) {
            bundle.putInt("empty_title", 2131297307);
            bundle.putLong("user_id", this.y);
            bundle.putLong("owner_id", this.y);
            bundle.putInt("title", 2131297488);
            bundle.putLong("userid_of_current_profile", this.y);
            bundle.putBoolean("is_me", this.A);
            s = ProfilePhotoGridFragment.class;
            n3 = 2131297487;
        }
        else if (ProfileActivity.c.equals((Object)uri)) {
            bundle.putInt("empty_title", 2131297304);
            bundle.putLong("owner_id", this.y);
            bundle.putInt("type", 2);
            bundle.putInt("title", 2131297482);
            bundle.putLong("userid_of_current_profile", this.y);
            bundle.putBoolean("is_me", this.A);
            bundle.putString("scribe_section", "favorites");
            s = ProfileFavoriteTimelinesFragment.class;
            n3 = 2131297482;
        }
        else if (ProfileActivity.d.equals((Object)uri)) {
            bundle.putParcelable("user", (Parcelable)this.B);
            s = ProfileProtectedViewFragment.class;
            n2 = 0;
            n3 = 0;
        }
        else if (ProfileActivity.f.equals((Object)uri)) {
            bundle.putParcelable("user", (Parcelable)this.B);
            s = ProfileBlockerInterstitialFragment.class;
            n2 = 0;
            n3 = 0;
        }
        else {
            if (!ProfileActivity.e.equals((Object)uri)) {
                throw new IllegalArgumentException("Invalid page");
            }
            bundle.putParcelable("user", (Parcelable)this.B);
            s = ProfileBlockedProfileFragment.class;
            n2 = 0;
            n3 = 0;
        }
        bundle.putBoolean("refresh", (boolean)(n2 != 0));
        bundle.putInt("fragment_page_number", n);
        final go go = new go(uri, (Class)s);
        if (n3 != 0) {
            go.a((CharSequence)this.getString(n3));
        }
        go.a(bundle);
        return go.a();
    }
    
    private String a(final String s) {
        if (!com.twitter.android.profiles.ah.a(this.A, this.U)) {
            return com.twitter.android.profiles.ah.a(this.A) + ":" + s;
        }
        if (s.startsWith(":")) {
            return "blocked_profile:profile" + s;
        }
        return "blocked_profile:" + s;
    }
    
    private void a(final long n, final PromotedContent promotedContent) {
        this.a(new pb((Context)this, this.U(), n, promotedContent).b(true).a(Integer.valueOf(this.U)), 9);
    }
    
    private void a(final long n, final String s) {
        this.ac = true;
        this.startActivity(a((Context)this, n, s, this.aa, null, -1, null));
        this.overridePendingTransition(2131034166, 2131034167);
        this.finish();
    }
    
    public static void a(final Context context, final long n, final String s, final PromotedContent promotedContent, final TwitterScribeAssociation twitterScribeAssociation) {
        context.startActivity(a(context, n, s, promotedContent, twitterScribeAssociation, -1, PromotedEvent.c));
    }
    
    private void a(final LoggedOutBar loggedOutBar) {
        this.C.a(new oi(this, loggedOutBar));
    }
    
    private void a(final TweetStatView tweetStatView, final String s, final int n) {
        tweetStatView.setValue(com.twitter.library.util.aj.b(this.getResources(), n));
        tweetStatView.setName(s.toUpperCase());
    }
    
    private void a(final CardInstanceData cardInstanceData) {
        final vt a = vt.a(this, this.y, cardInstanceData);
        if (a != null) {
            a.v();
            a.w();
            a.x();
            this.an.setVisibility(8);
            this.ao.setVisibility(0);
            this.ao.addView(a.z());
            final com.twitter.android.card.v v = new com.twitter.android.card.v((Context)this);
            v.a(cardInstanceData.u());
            v.a("impression", "platform_card");
        }
    }
    
    private void a(final String s, final long n, final PromotedContent promotedContent, final String s2, final TwitterScribeAssociation twitterScribeAssociation) {
        this.a(s, n, promotedContent, s2, twitterScribeAssociation, null);
    }
    
    private void a(final String s, final long n, final PromotedContent promotedContent, final String s2, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeItem twitterScribeItem) {
        this.G().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(n, promotedContent, s2).b(new String[] { s })).a(twitterScribeAssociation)).h(String.valueOf(this.y))).a(twitterScribeItem));
    }
    
    private void a(final boolean b, final boolean b2) {
        if (this.P()) {
            this.aM.b(b);
            this.aN.b(b2);
        }
    }
    
    private void aA() {
        this.aL = (TextView)this.findViewById(2131887188);
        final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)this.getString(2131297479));
        text.append((CharSequence)" ");
        final int length = text.length();
        text.append((CharSequence)this.getString(2131298028));
        text.setSpan((Object)new on(this, this.getResources().getColor(2131689601)), length, text.length(), 33);
        com.twitter.library.view.u.a(this.aL);
        this.aL.setText((CharSequence)text);
    }
    
    private String aa() {
        if (this.B == null || this.au != 1) {
            return "";
        }
        int n = 0;
        int n2 = 0;
        switch (this.F.b()) {
            default: {
                return "";
            }
            case 0: {
                n = 2131427346;
                n2 = this.B.statusesCount;
                break;
            }
            case 1: {
                if (this.B.mediaCount == -1) {
                    return this.getResources().getString(2131297489);
                }
                n = 2131427345;
                n2 = this.B.mediaCount;
                break;
            }
            case 2: {
                n = 2131427344;
                n2 = this.B.favoritesCount;
                break;
            }
        }
        return this.getResources().getQuantityString(n, n2, new Object[] { com.twitter.library.util.aj.b(this.getResources(), n2) });
    }
    
    private void ab() {
        if (this.y != 0L && this.aK && this.au != 2) {
            final String a = com.twitter.android.commerce.util.e.a(this.y);
            if (a != null) {
                final TwitterButton twitterButton = (TwitterButton)this.R.findViewById(2131887187);
                twitterButton.setText((CharSequence)this.getString(2131298269));
                twitterButton.setVisibility(0);
                twitterButton.setOnClickListener((View$OnClickListener)this);
                if (this.aJ) {
                    com.twitter.android.commerce.util.e.a((Context)this, this.a(":commerce::impression"), this.y, this.B, this.aa, this.ai, a);
                    this.aJ = false;
                }
            }
        }
    }
    
    private void ac() {
        if (this.ay) {
            com.crashlytics.android.d.a("profile_user", String.format("id: %s, name: %s", Long.toString(this.y), this.z));
            this.a(this.a(":::impression"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
            this.ay = false;
        }
    }
    
    private void ad() {
        this.G().a(this.U().g(), this.a(":user:muted_button:click"));
        bd.a((Context)this, this.z, 11, this.getSupportFragmentManager(), (Fragment)null);
    }
    
    private void ae() {
        this.H.setProfileUser(this.aD);
        this.a(this.K, this.getString(2131297474), this.B.followersCount);
        this.a(this.L, this.getString(2131297475), this.B.friendsCount);
        this.I.a(this.B, false);
        this.ah();
    }
    
    private void af() {
        boolean b;
        if (this.k.size() > 1) {
            b = true;
        }
        else {
            b = false;
        }
        final HorizontalListView n = this.n;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        n.setVisibility(visibility);
        int dimensionPixelSize;
        if (b) {
            dimensionPixelSize = this.getResources().getDimensionPixelSize(2131558806);
        }
        else {
            dimensionPixelSize = 0;
        }
        this.v = dimensionPixelSize;
        final View an = this.an;
        int visibility2;
        if (b) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        an.setVisibility(visibility2);
        if (this.au == 1 || this.au == 4) {
            this.av.setVisibility(0);
            this.aw.setVisibility(0);
            this.ar.b(this.U);
        }
        else {
            this.av.setVisibility(8);
            this.aw.setVisibility(8);
        }
        if (this.au == 1) {
            this.L.setOnClickListener((View$OnClickListener)this);
            this.K.setOnClickListener((View$OnClickListener)this);
        }
        else {
            this.L.setOnClickListener((View$OnClickListener)null);
            this.K.setOnClickListener((View$OnClickListener)null);
        }
        if (this.au == 3) {
            if (this.aC != null) {
                this.aC.a();
            }
            this.b(true);
            this.G().a(this.U().g(), this.a("blocker_interstitial:::impression"), null);
        }
        else {
            this.b(false);
        }
        this.ag();
        this.aK = true;
        this.ab();
        if (this.au == 2) {
            this.ar.c();
            this.H().a("blocked_profile");
            if (this.as) {
                this.G().a(this.U().g(), "blocked_profile:profile:::impression");
                this.as = false;
            }
        }
    }
    
    private void ag() {
        if (this.au == 3) {
            this.d(false);
        }
        else {
            this.d(true);
        }
        if (this.au == 2) {
            this.e(this.getString(2131296702));
            this.V = true;
            return;
        }
        if (this.B != null && this.y != this.U().g() && this.au != 2) {
            this.e(this.getString(2131297986, new Object[] { this.B.name }));
            return;
        }
        this.e(this.getString(2131296702));
    }
    
    private void ah() {
        if (com.twitter.android.profiles.ah.a(this.A, this.B)) {
            if (this.ak == null) {
                (this.ak = (ListView)this.R.findViewById(2131887189)).setOnItemClickListener((AdapterView$OnItemClickListener)this);
            }
            if (this.aj == null) {
                final List<sy> singletonList = Collections.singletonList(new sy(this.getString(2131297013), new Intent((Context)this, (Class)UsersActivity.class).putExtra("type", 18)));
                int n;
                if (bj.e) {
                    n = 2130969052;
                }
                else {
                    n = 2130969002;
                }
                this.aj = new sx(singletonList.toArray(new sy[singletonList.size()]), n);
                this.ak.setAdapter((ListAdapter)this.aj);
            }
            this.ai();
            this.ak();
        }
        if (this.al == null) {
            this.al = (LinearLayout)this.R.findViewById(2131887175);
        }
    }
    
    private void ai() {
        if ((0x20 & this.am) == 0x0) {
            this.a(new po((Context)this, this.U(), 0), 2);
            this.am |= 0x20;
        }
    }
    
    private void aj() {
        if (com.twitter.android.profiles.ah.c() && !this.aF) {
            if (this.ab != null) {
                this.a(this.ab);
            }
            else if (this.y != 0L) {
                this.a(new pu((Context)this, this.U(), this.y), 15);
            }
            this.aF = true;
        }
    }
    
    private void ak() {
        this.getSupportLoaderManager().restartLoader(4, null, this);
    }
    
    private void al() {
        Serializable s;
        if (com.twitter.android.avatars.b.b()) {
            s = EditProfileWithAvatarDrawerActivity.class;
        }
        else {
            s = EditProfileActivity.class;
        }
        this.startActivityForResult(new Intent((Context)this, (Class)s), 4);
    }
    
    private void am() {
        this.G.a(new ec((Context)this, (TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).b(com.twitter.android.profiles.ah.a(this.A))));
        this.G.a(this.aD, this.W, this.getResources());
    }
    
    private Intent an() {
        return new Intent((Context)this, (Class)UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", this.y).putExtra("type", 0).putExtra("owner_name", this.B.name).putExtra("fetch_always", true);
    }
    
    private void ao() {
        this.G().a(this.U().g(), this.a(":user:mute_dialog:mute_user"));
        this.aE.a();
    }
    
    private void ap() {
        this.a(new pa((Context)this, this.U()).a(this.y), 3);
        this.k(16384);
    }
    
    private void aq() {
        final boolean c = com.twitter.library.api.z.c(this.U);
        if (this.B.isProtected) {
            this.j(16384);
        }
        else {
            this.j(1);
        }
        if (c && this.Y) {
            this.m(13);
        }
        this.a(new pb((Context)this, this.U(), this.y, this.aa).a(false).c(-1), 8);
        this.a(this.a("profile::user:follow"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        if (c) {
            this.a(this.a("profile::user:follow_back"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        }
    }
    
    private void ar() {
        this.a(this.a("profile::user:unfollow"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        this.as();
    }
    
    private void as() {
        final PromotedContent aa = this.aa;
        this.k(1);
        this.Z.c(this.B.userId);
        this.a(new pe((Context)this, this.U(), this.y, aa).c(-1), 10);
    }
    
    private void at() {
        this.a(this.a(":user:block_dialog:block"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        this.au();
    }
    
    private void au() {
        this.a(new od((Context)this, this.U(), this.y, this.aa, 1), 5);
        this.j(4);
    }
    
    private void av() {
        this.k(16);
        this.a(this.a("profile::user:device_unfollow"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        this.g(false);
    }
    
    private void aw() {
        this.j(16);
        this.a(this.a("profile::user:device_follow"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
        this.g(true);
    }
    
    private void ax() {
        if (this.ay() && pi.a() && pi.b() && this.aO == null && this.hasWindowFocus()) {
            (this.aO = (BalloonSetAnimationView)this.findViewById(2131887161)).a();
            this.G().a(this.y, this.a("::birthday:play"));
        }
    }
    
    private boolean ay() {
        return this.aD.a() != null && this.aD.a().extendedProfile != null && pi.a(this.aD.a().extendedProfile, new Date());
    }
    
    private void az() {
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        final Iterator<gm> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            final Fragment a = iterator.next().a(supportFragmentManager);
            if (a instanceof TimelineFragment) {
                ((TimelineFragment)a).y();
            }
        }
        if (this.aC != null) {
            this.aC.o();
        }
    }
    
    private void b(final Bitmap bitmap) {
        try {
            this.H.setContentDescription((CharSequence)this.getString(2131297095));
            this.a(bitmap);
            if (!this.ag) {
                if (this.ah != null) {
                    this.ah.cancel(true);
                }
                (this.ah = new qi(this, false)).execute((Object[])new Bitmap[] { bitmap });
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.x.b();
        }
    }
    
    private void b(final String s, final int n) {
        if (this.B != null && s != null) {
            final Uri parse = Uri.parse(s.replace("_normal.", "."));
            final Intent putExtra = new Intent((Context)this, (Class)ImageActivity.class).setData(parse).putExtra("image_url", parse.toString());
            long y;
            if (this.A) {
                y = this.y;
            }
            else {
                y = 0L;
            }
            this.startActivity(putExtra.putExtra("owner_user_id", y).putExtra("click_place", n).putExtra("android.intent.extra.TEXT", this.z));
        }
    }
    
    private UserImageView c(final Resources resources) {
        final UserImageView userImageView = new UserImageView((Context)this);
        userImageView.setId(2131886644);
        userImageView.setBackgroundResource(2130837546);
        userImageView.setSize(resources.getDimensionPixelSize(2131558876));
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558879);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558877);
        final int n = this.a(resources) + resources.getDimensionPixelSize(2131558867);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131558875);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
        layoutParams.setMargins(dimensionPixelSize, n, dimensionPixelSize2, 0);
        layoutParams.addRule(9);
        userImageView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, 0);
        userImageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        return userImageView;
    }
    
    private void c(final ToolBar toolBar) {
        if (this.P()) {
            ag ag;
            if (kg.a((Context)this)) {
                ag = new p();
            }
            else {
                ag = new o(this.B, this.U, this.A, this.U().f());
            }
            ag.a(toolBar);
            this.aE.a(this);
        }
    }
    
    private void c(final boolean b) {
        if (this.B == null || this.T) {
            return;
        }
        if (this.aD.f() != null) {
            this.H.setDefaultDrawable((Drawable)new ColorDrawable(this.b(this.getResources())));
        }
        else {
            this.e(b);
        }
        this.T = true;
    }
    
    private void d(final TwitterUser twitterUser) {
        final ap a = ca.a(this.U());
        if (this.A && a != null && a.i) {
            twitterUser.profileDescription = bh.c(a.e);
            twitterUser.location = a.g;
            twitterUser.structuredLocation = a.h;
            twitterUser.profileUrl = a.f;
            twitterUser.name = a.d;
            if (a.j) {
                this.B.descriptionEntities = null;
            }
            if (a.k) {
                this.B.urlEntities = null;
            }
        }
    }
    
    private void e(final boolean b) {
        this.q = this.b(this.getResources());
        if (b && this.q != this.S) {
            this.x.b();
            final TransitionDrawable defaultDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(this.S), new ColorDrawable(this.q) });
            this.H.setDefaultDrawable((Drawable)defaultDrawable);
            defaultDrawable.startTransition(500);
            this.aq.postDelayed((Runnable)new ok(this), 500L);
            return;
        }
        this.x.a();
        this.H.setDefaultDrawable((Drawable)new ColorDrawable(this.q));
    }
    
    private void f(final boolean b) {
        this.aL.setVisibility(com.twitter.android.profiles.ah.b(this.U));
    }
    
    private void g(final boolean b) {
        this.a(new py((Context)this, this.U(), this.B).a(1, b), 12);
    }
    
    private void h(final boolean b) {
        if (b) {
            if (this.ad.getBoolean("profile_device_follow_dialog_shown", false)) {
                Toast.makeText((Context)this, (CharSequence)this.getString(2131298062, new Object[] { this.B.c() }), 1).show();
                return;
            }
            this.m(5);
            this.ad.edit().putBoolean("profile_device_follow_dialog_shown", true).apply();
        }
    }
    
    private void j(final int n) {
        this.l(com.twitter.library.api.z.a(this.U, n));
    }
    
    private void k(final int n) {
        this.l(com.twitter.library.api.z.b(this.U, n));
    }
    
    private void l(final int u) {
        this.ar.a(u);
        this.U = u;
        this.c(this.M());
        this.f(false);
        this.Y();
        this.aD.a(this.U);
    }
    
    private void m(final int n) {
        final PromptDialogFragment o = this.o(n);
        if (o != null) {
            o.a(this.getSupportFragmentManager());
        }
    }
    
    private void n(final int n) {
        final PromptDialogFragment o = this.o(n);
        if (o != null) {
            new Handler(Looper.getMainLooper()).post((Runnable)new ol(this, o));
        }
    }
    
    private PromptDialogFragment o(final int n) {
        PromptDialogFragment promptDialogFragment = null;
        if (this.B == null) {
            promptDialogFragment = null;
        }
        else {
            final Resources resources = this.getResources();
            int n2 = 2131298158;
            int n3 = 2131297303;
            final String c = this.B.c();
            int n4 = 0;
            int n5 = 0;
            switch (n) {
                default: {
                    return null;
                }
                case 14: {
                    final PromptDialogFragment c2 = PromptDialogFragment.b(14).c(2131297007);
                    n3 = 2131296445;
                    n2 = 2131297007;
                    promptDialogFragment = c2;
                    n4 = 2131298070;
                    n5 = 1;
                    break;
                }
                case 12: {
                    final PromptDialogFragment a = PromptDialogFragment.b(12).a(resources.getString(2131296445));
                    n3 = 2131297303;
                    n2 = 2131298158;
                    promptDialogFragment = a;
                    n4 = 2131298051;
                    n5 = 1;
                    break;
                }
                case 6: {
                    final PromptDialogFragment a2 = PromptDialogFragment.b(6).a(resources.getString(2131298053, new Object[] { c }));
                    a2.i(2131298066);
                    n3 = 2131298057;
                    n2 = 2131296445;
                    promptDialogFragment = a2;
                    n4 = 2131298052;
                    n5 = 1;
                    break;
                }
                case 1: {
                    final PromptDialogFragment c3 = PromptDialogFragment.b(1).c(2131298057);
                    if (com.twitter.library.api.z.i(this.U)) {
                        c3.i(2131298066);
                        promptDialogFragment = c3;
                        n4 = 2131298059;
                        n5 = 1;
                        break;
                    }
                    promptDialogFragment = c3;
                    n4 = 2131298059;
                    n5 = 1;
                    break;
                }
                case 4: {
                    promptDialogFragment = PromptDialogFragment.b(4).c(2131298081);
                    n4 = 2131298082;
                    n5 = 1;
                    break;
                }
                case 13: {
                    this.Y = false;
                    final PromptDialogFragment c4 = PromptDialogFragment.b(13).c(2131298061);
                    this.a(this.a("::device_follow_prompt:impression"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    n3 = 2131297309;
                    n2 = 2131297362;
                    n5 = 1;
                    n4 = 2131298060;
                    promptDialogFragment = c4;
                    break;
                }
                case 5: {
                    promptDialogFragment = PromptDialogFragment.b(5).c(2131298088);
                    n4 = 2131298087;
                    n2 = 2131297362;
                    n5 = 0;
                    break;
                }
                case 9: {
                    final PromptDialogFragment b = PromptDialogFragment.b(9);
                    final String string = this.getResources().getString(2131298063, new Object[] { c });
                    n2 = 2131297362;
                    n3 = 2131296445;
                    b.a(string);
                    promptDialogFragment = b;
                    n4 = 2131298064;
                    n5 = 1;
                    break;
                }
                case 7: {
                    promptDialogFragment = PromptDialogFragment.b(7).a(resources.getString(2131298072, new Object[] { c }));
                    n4 = 2131298071;
                    n2 = 2131297362;
                    n5 = 0;
                    break;
                }
                case 8: {
                    promptDialogFragment = PromptDialogFragment.b(8).a(resources.getString(2131298074, new Object[] { c }));
                    n4 = 2131298073;
                    n2 = 2131297362;
                    n5 = 0;
                    break;
                }
            }
            promptDialogFragment.b(resources.getString(n4, new Object[] { c }));
            promptDialogFragment.h(n2);
            if (n5 != 0) {
                promptDialogFragment.j(n3);
                return promptDialogFragment;
            }
        }
        return promptDialogFragment;
    }
    
    protected String K_() {
        return this.aa();
    }
    
    public void L_() {
        if (this.aH && this.aI) {
            return;
        }
        this.aH = true;
        this.aG = this.m.getHeight();
        super.L_();
        this.aq.post((Runnable)new oj(this));
    }
    
    protected int a(final Resources resources) {
        return (int)(resources.getDisplayMetrics().widthPixels / 3.0f);
    }
    
    protected int a(final ToolBar toolBar) {
        final int a = super.a(toolBar);
        this.aM = this.M().a(2131887452);
        this.aN = this.M().a(2131887467);
        if (a != 2 && !this.isFinishing()) {
            this.c(toolBar);
        }
        if (kg.a((Context)this) && this.getIntent().getData() != null) {
            toolBar.setDisplayShowHomeAsUpEnabled(false);
        }
        return a;
    }
    
    protected PagerAdapter a(final List list, final ViewPager viewPager) {
        return new ot(this, this, list, viewPager, this.n, this.F);
    }
    
    protected BaseAdapter a(final List list) {
        return this.F = new os(list);
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        this.B();
        bn.c(2130968991);
        bn.e(true);
        if (kg.a((Context)this)) {
            bn.d(false);
            bn.a(4);
        }
        return bn;
    }
    
    protected void a(final int currentItem) {
        super.a(currentItem);
        this.l.setCurrentItem(currentItem);
        this.F.a(currentItem);
    }
    
    public void a(final int n, final int n2) {
        if (this.t()) {
            this.I.setTranslationY((float)n);
            if (this.H.getHeight() != 0) {
                this.J.a(-n);
                return;
            }
            this.aq.sendMessage(this.aq.obtainMessage(2, n, n2));
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        final com.twitter.library.service.aa aa = (com.twitter.library.service.aa)y.l().b();
        final Session a = this.T().a(y);
        switch (n) {
            default: {
                super.a(n, y);
                break;
            }
            case 11: {
                if (!aa.a()) {
                    break;
                }
                final pl pl = (pl)y;
                if (this.B != null && pl.a == this.y) {
                    this.l(this.B.friendship = pl.e);
                    return;
                }
                break;
            }
            case 4: {
                if (!aa.a()) {
                    this.j(4);
                    return;
                }
                this.at = false;
                this.Y();
            }
            case 8: {
                if (a == null) {
                    break;
                }
                final com.twitter.internal.android.service.x l = ((pb)y).l();
                boolean b = false;
                if (l != null) {
                    final boolean a2 = ((com.twitter.library.service.aa)l.b()).a();
                    b = false;
                    if (a2) {
                        b = true;
                    }
                }
                if (!b) {
                    this.U = com.twitter.library.api.z.b(this.U, 1);
                    return;
                }
                if (!this.B.isProtected && this.aC != null) {
                    this.aC.n();
                    return;
                }
                break;
            }
            case 10: {
                if (a == null) {
                    break;
                }
                if (!aa.a()) {
                    this.U = com.twitter.library.api.z.a(this.U, 1);
                    if (!y.isCancelled()) {
                        Toast.makeText((Context)this, 2131298058, 1).show();
                        return;
                    }
                    break;
                }
                else {
                    if (this.aC != null) {
                        this.aC.a();
                        return;
                    }
                    break;
                }
                break;
            }
            case 7: {
                final l f = aa.f();
                if (f != null && f.a == 200) {
                    Toast.makeText((Context)this, 2131297157, 1).show();
                    return;
                }
                Toast.makeText((Context)this, 2131297156, 1).show();
            }
            case 5: {
                if (!aa.a() && ((od)y).a == this.y) {
                    this.n();
                    return;
                }
                break;
            }
            case 6: {
                if (aa.a() || ((od)y).a != this.y) {
                    Toast.makeText((Context)this, 2131298080, 1).show();
                    return;
                }
                if (com.twitter.library.api.z.e(this.U)) {
                    this.n();
                    return;
                }
                break;
            }
            case 14: {
                final boolean g = com.twitter.library.api.z.g(this.U);
                if (aa.a()) {
                    int n2;
                    if (g) {
                        n2 = 2131298086;
                    }
                    else {
                        n2 = 2131298084;
                    }
                    Toast.makeText((Context)this, (CharSequence)this.getString(n2, new Object[] { this.B.c() }), 0).show();
                    return;
                }
                Toast.makeText((Context)this, 2131296784, 1).show();
                if (g) {
                    this.k(512);
                    return;
                }
                this.j(512);
            }
            case 2: {
                if (aa.a()) {
                    this.ak();
                    return;
                }
                break;
            }
            case 12: {
                final ab p2 = y.P();
                if (p2 == null) {
                    break;
                }
                final String e = p2.e;
                final boolean g2 = PushService.g((Context)this, e);
                final boolean i = com.twitter.library.api.z.i(this.U);
                if (aa.a() && (g2 || !i)) {
                    this.h(i);
                    return;
                }
                if (aa.c() == 1001 || !g2) {
                    com.twitter.android.client.x.a((Context)this).a(e, !g2);
                    this.h(i);
                    return;
                }
                Toast.makeText((Context)this, 2131296784, 1).show();
                if (i) {
                    this.k(16);
                    return;
                }
                this.j(16);
            }
            case 15: {
                if (aa.a()) {
                    this.a(this.ab = ((pu)y).e());
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        final long y = this.y;
        final long g = this.U().g();
        final PromotedContent aa = this.aa;
        switch (n) {
            case 12: {
                if (n2 == -1) {
                    this.ap();
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == -1) {
                    this.at();
                    return;
                }
                if (n2 == -2) {
                    this.a(this.a(":user:block_dialog:cancel"), y, aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    return;
                }
                break;
            }
            case 3: {
                if (n2 == -1) {
                    this.a(new od((Context)this, this.U(), y, aa, 3), 4);
                    this.a(this.a(":user:unblock_dialog:unblock"), y, aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    this.k(4);
                    return;
                }
                if (n2 == -2) {
                    this.a(this.a(":user:unblock_dialog:cancel"), y, aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    return;
                }
                break;
            }
            case 14: {
                if (n2 == -1) {
                    this.aq();
                    return;
                }
                break;
            }
            case 6: {
                if (n2 == -2) {
                    this.ar();
                    return;
                }
                if (n2 == -3) {
                    this.av();
                    return;
                }
                break;
            }
            case 1: {
                if (n2 == -1) {
                    this.ar();
                    return;
                }
                if (n2 == -3) {
                    this.av();
                    return;
                }
                break;
            }
            case 9: {
                if (n2 == -1) {
                    this.av();
                    return;
                }
                break;
            }
            case 4: {
                if (n2 == -1) {
                    final od od = new od((Context)this, this.U(), this.y, this.aa, 2);
                    od.i = "spam";
                    od.f = true;
                    this.a(od, 6);
                    this.j(4);
                    this.a(this.a(":::report_as_spam"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    return;
                }
                break;
            }
            case 13: {
                if (n2 == -1) {
                    this.a(this.a("::device_follow_prompt:accept"), y, aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    this.aw();
                    return;
                }
                if (n2 == -2) {
                    this.a(this.a("::device_follow_prompt:dismiss"), y, aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                    return;
                }
                break;
            }
            case 10: {
                if (n2 == -1) {
                    this.ao();
                    return;
                }
                this.G().a(g, this.a(":user:mute_dialog:cancel"));
            }
            case 11: {
                if (n2 == -1) {
                    this.G().a(g, this.a(":user:muted_button:unmute_user"));
                    this.aE.b();
                    return;
                }
                this.G().a(g, this.a(":user:muted_button:cancel"));
            }
        }
    }
    
    protected void a(final Drawable backgroundDrawable) {
        this.H.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void a(final Bundle bundle, final com.twitter.library.client.d d) {
        super.a(bundle, d);
        this.ag();
        boolean b;
        if (this.getResources().getConfiguration().orientation == 2) {
            b = true;
        }
        else {
            b = false;
        }
        if (b && kg.a((Context)this)) {
            final LoggedOutBar loggedOutBar = (LoggedOutBar)this.findViewById(2131887160);
            loggedOutBar.setVisibility(0);
            loggedOutBar.setDefaultOnClickListener(this);
            this.a(loggedOutBar);
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            case 4: {
                if (cursor == null || !cursor.moveToFirst()) {
                    this.ak.setVisibility(8);
                    this.an.setVisibility(0);
                    this.aj.a(0, 0);
                    return;
                }
                if (!com.twitter.android.profiles.ah.a(this.A, this.B)) {
                    break;
                }
                final int count = cursor.getCount();
                if (count > 0) {
                    this.ak.setVisibility(0);
                    this.an.setVisibility(8);
                    this.aj.a(0, count);
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final ad ad) {
        this.B = ad.a();
        this.A = ad.b();
        this.U = ad.d();
        this.Z = ad.c();
    }
    
    @Override
    protected void a(final TwitterUser twitterUser) {
        super.a(twitterUser);
        String m;
        if (!TextUtils.isEmpty((CharSequence)this.B.c())) {
            m = this.B.c();
        }
        else {
            m = this.B.username;
        }
        this.M = m;
        this.ar.a(twitterUser);
        this.aD.a(twitterUser, this.A);
        this.l(twitterUser.friendship);
        this.d(this.B);
        this.am();
        com.twitter.android.profiles.x.a((Context)this, this.N, this.O, twitterUser.verified, twitterUser.isTranslator, twitterUser.isProtected);
        this.H.setOnClickListener((View$OnClickListener)this);
        this.c(this.ae == null);
        this.I.setOnClickListener((View$OnClickListener)this);
        this.M().setOnClickListener((View$OnClickListener)this);
        this.ac();
        this.ab();
        this.aj();
        this.ae();
        if (this.X && this.aC != null) {
            this.aC.n();
            this.X = false;
        }
        this.ax();
    }
    
    void a(final String s, final int n) {
        if (s != null) {
            this.b(s, n);
        }
        else if (this.A) {
            this.al();
        }
    }
    
    public void a(final String q, final Bitmap bitmap) {
        if (bitmap != null) {
            this.Q = q;
            this.b(bitmap);
            return;
        }
        this.Q = null;
        this.x.b();
        this.H.setDefaultDrawable((Drawable)new ColorDrawable(this.s()));
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951648, toolBar);
        return true;
    }
    
    public boolean a(final jx jx) {
        int a = 1;
        final int a2 = jx.a();
        final long g = this.U().g();
        switch (a2) {
            default: {
                a = (super.a(jx) ? 1 : 0);
                break;
            }
            case 2131887461: {
                if (this.B != null) {
                    bq.a((Context)this, this.B.c(), this.B.username, this.B.profileDescription);
                    final com.twitter.android.client.c g2 = this.G();
                    final String[] array = new String[5];
                    array[0] = com.twitter.android.profiles.ah.a(this.A);
                    array[a] = null;
                    array[2] = "user";
                    array[3] = null;
                    array[4] = "share";
                    g2.a(g, array);
                    return a != 0;
                }
                return super.a(jx);
            }
            case 2131887462:
            case 2131887463: {
                final boolean g3 = com.twitter.library.api.z.g(this.U);
                if (!g3) {
                    this.j(512);
                }
                else {
                    this.k(512);
                }
                final py py = new py((Context)this, this.U(), this.B);
                int n = 0;
                if (!g3) {
                    n = a;
                }
                this.a(py.a(4, (boolean)(n != 0)), 14);
                return a != 0;
            }
            case 2131887465: {
                com.twitter.android.profiles.ah.a(this, this.y, g);
                this.a(this.a(":::add_to_list"), this.y, this.aa, com.twitter.android.profiles.ah.b(this.B), this.ai);
                return a != 0;
            }
            case 2131887467: {
                final com.twitter.android.client.c g4 = this.G();
                final String[] array2 = new String[a];
                array2[0] = this.a(":user:unmute_dialog:open");
                g4.a(g, array2);
                final com.twitter.android.client.c g5 = this.G();
                final String[] array3 = new String[a];
                array3[0] = this.a(":user:unmute_dialog:unmute_user");
                g5.a(g, array3);
                this.aE.b();
                return a != 0;
            }
            case 2131887452: {
                final com.twitter.android.client.c g6 = this.G();
                final String[] array4 = new String[a];
                array4[0] = this.a(":user:mute_dialog:open");
                g6.a(g, array4);
                if (!bd.a((Context)this, this.z, this.U, 10, this.getSupportFragmentManager(), null)) {
                    this.ao();
                    return a != 0;
                }
                break;
            }
            case 2131887400: {
                final com.twitter.android.client.c g7 = this.G();
                final String[] array5 = new String[a];
                array5[0] = this.a(":user:block_dialog:impression");
                g7.a(g, array5);
                bd.a((Context)this, this.z, 2, this.getSupportFragmentManager());
                return a != 0;
            }
            case 2131887468: {
                final com.twitter.android.client.c g8 = this.G();
                final String[] array6 = new String[a];
                array6[0] = this.a(":user:unblock_dialog:impression");
                g8.a(g, array6);
                bd.b((Context)this, this.z, 3, this.getSupportFragmentManager());
                return a != 0;
            }
            case 2131887469: {
                com.twitter.android.profiles.ah.a(this, this.B, this.U);
                return a != 0;
            }
            case 2131887466: {
                com.twitter.android.profiles.ah.a((Context)this, this.y);
                return a != 0;
            }
            case 2131887464: {
                com.twitter.android.profiles.ah.a((Context)this);
                return a != 0;
            }
            case 2131886126: {
                this.setResult(-1, new Intent().putExtra("user_id", this.y).putExtra("friendship", this.U));
                return super.a(jx);
            }
            case 2131887470: {
                this.startActivity(AdsCompanionWebViewActivity.a((Context)this));
                return super.a(jx);
            }
        }
        return a != 0;
    }
    
    protected int b(final Resources resources) {
        if (this.B != null && this.B.profileLinkColor != 0) {
            return this.B.profileLinkColor;
        }
        return this.S;
    }
    
    protected String b() {
        if (this.B == null) {
            return this.z;
        }
        return this.B.c();
    }
    
    protected void b(final int n) {
        super.b(n);
        this.ag = true;
        this.ah = null;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Session u = this.U();
        this.aA = u.e();
        (this.ax = com.twitter.android.metrics.d.a(u.g(), this.F(), true)).i();
        final Resources resources = this.getResources();
        super.b(bundle, bn);
        this.au = 0;
        this.c(3.0f);
        this.a(this.ap = new oq(this, null));
        this.aq = new or(this);
        if (this.A) {
            ProfileEmptyAvatarOverlay.b(this);
        }
        final Intent intent = this.getIntent();
        this.ai = (TwitterScribeAssociation)intent.getParcelableExtra("association");
        this.ad = PreferenceManager.getDefaultSharedPreferences((Context)this);
        boolean b;
        if (!TextUtils.isEmpty((CharSequence)this.z) || this.y != 0L) {
            b = true;
        }
        else {
            b = false;
        }
        while (true) {
            Label_1165: {
                if (b) {
                    break Label_1165;
                }
                final Uri data = intent.getData();
                if (data == null) {
                    break Label_1165;
                }
                int n;
                if ("com.twitter.android.action.USER_SHOW".equals(intent.getAction()) || "com.twitter.android.action.USER_SHOW_TYPEAHEAD".equals(intent.getAction())) {
                    this.z = data.getLastPathSegment();
                    n = 1;
                }
                else {
                    if ("twitter".equals(data.getScheme()) || this.y != 0L) {
                        break Label_1165;
                    }
                    new op(this, null).execute((Object[])new Uri[] { data });
                    n = 1;
                }
                final Bundle extras = intent.getExtras();
                if (extras != null) {
                    this.aa = (PromotedContent)extras.getSerializable("pc");
                }
                if (bundle != null) {
                    if (bundle.containsKey("state_friendship_cache")) {
                        this.Z = (FriendshipCache)bundle.getSerializable("state_friendship_cache");
                    }
                    else {
                        this.Z = new FriendshipCache(6);
                    }
                    this.U = bundle.getInt("state_friendship", 0);
                    this.X = bundle.getBoolean("state_fr", false);
                    this.ae = (TwitterUser)bundle.getParcelable("state_user");
                    this.am = bundle.getInt("state_fetch_flags", 0);
                    this.at = bundle.getBoolean("should_hide_blocker_interstitial", false);
                    this.ab = (CardInstanceData)bundle.getSerializable("state_profile_spotlight");
                }
                else {
                    kg.b(this, "profile");
                    this.Z = new FriendshipCache(6);
                    this.U = 0;
                    this.X = false;
                    this.as = true;
                    if (intent.hasExtra("start_page")) {
                        this.af = Uri.parse(intent.getStringExtra("start_page"));
                    }
                }
                (this.aD = new ad((Context)this, this.ae, this.A, this.Z)).a(this);
                if (n == 0) {
                    Toast.makeText((Context)this, 2131298068, 1).show();
                    if (App.a() || App.b() || App.c()) {
                        ErrorReporter.a(new com.twitter.errorreporter.a().a("intent_extras", intent.getExtras()).a("intent_data", intent.getData()).a(new IllegalStateException("Insufficient arguments to launch ProfileActivity.")));
                    }
                    this.finish();
                    return;
                }
                final SearchSuggestionController h = this.H();
                if (this.y != u.g()) {
                    h.a("profile");
                }
                else {
                    h.a("me");
                }
                this.W = intent.getStringExtra("reason");
                final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)this).inflate(2130968997, (ViewGroup)null);
                linearLayout.setOnClickListener((View$OnClickListener)this);
                this.R = linearLayout;
                this.G = new v((View)linearLayout);
                this.N = (ImageView)linearLayout.findViewById(2131886198);
                this.O = (ImageView)linearLayout.findViewById(2131887174);
                (this.H = (HeaderImageView)linearLayout.findViewById(2131887194)).a(this, (Set)this.getLastCustomNonConfigurationInstance(), this.s());
                this.I = this.c(resources);
                this.J = new a(this.I, this.H, this.p);
                this.an = linearLayout.findViewById(2131887191);
                this.ao = (ViewGroup)linearLayout.findViewById(2131887190);
                this.ar = new t((Context)this, this, (RelativeLayout)linearLayout.findViewById(2131886713), this.A);
                this.L = (TweetStatView)linearLayout.findViewById(2131887185);
                this.K = (TweetStatView)linearLayout.findViewById(2131887186);
                this.av = linearLayout.findViewById(2131887179);
                this.aw = linearLayout.findViewById(2131886925);
                this.setHeaderView((View)linearLayout);
                this.P = resources.getDimension(2131558869) + this.p + ((TextView)linearLayout.findViewById(2131886307)).getTextSize();
                final View viewById = this.m.findViewById(2131887177);
                if (this.X()) {
                    (this.aC = new com.twitter.android.profiles.e(this, this.T(), this.aD, this.ai, viewById)).a(this);
                    this.aC.a(bundle);
                }
                this.aA();
                if (this.ae != null) {
                    this.a(this.ae);
                }
                if ((this.ae == null || (0x40 & this.am) != 0x0 || this.b(this.ae)) && (this.y != 0L || this.z != null)) {
                    this.z();
                }
                this.ae = null;
                this.S = resources.getColor(2131689634);
                AccountManager.get((Context)this).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, true);
                this.az = true;
                this.aI = (bundle != null && Build$VERSION.SDK_INT >= 21);
                (this.aE = new com.twitter.android.profiles.s(this, this.aD, u, (Context)this, new qb((Context)this))).a(this);
                return;
            }
            int n = b ? 1 : 0;
            continue;
        }
    }
    
    protected List d() {
        if (this.au == 1) {
            final ArrayList<gm> list = new ArrayList<gm>(3);
            list.add(this.a(ProfileActivity.a, 0));
            list.add(this.a(ProfileActivity.b, 1));
            list.add(this.a(ProfileActivity.c, 2));
            return list;
        }
        final ArrayList<gm> list2 = new ArrayList<gm>(1);
        switch (this.au) {
            default: {
                return list2;
            }
            case 2: {
                list2.add(this.a(ProfileActivity.e, 0));
                return list2;
            }
            case 3: {
                list2.add(this.a(ProfileActivity.f, 0));
                return list2;
            }
            case 4: {
                list2.add(this.a(ProfileActivity.d, 0));
                return list2;
            }
        }
    }
    
    protected void f_() {
        if (this.l != null) {
            ((ot)this.l.getAdapter()).e();
        }
        if (this.aC != null) {
            this.aC.q();
        }
        super.f_();
    }
    
    public FriendshipCache g() {
        return this.Z;
    }
    
    public ad h() {
        return this.aD;
    }
    
    protected int i() {
        return this.j();
    }
    
    protected int j() {
        return (int)this.P;
    }
    
    public void k() {
        this.a(false, false);
    }
    
    public void l() {
        this.aL.setVisibility(8);
        this.a(true, false);
    }
    
    protected String l_() {
        if (this.y != this.U().g() && !this.V) {
            return '@' + this.z + ' ';
        }
        return super.l_();
    }
    
    public void m() {
        this.aL.setVisibility(0);
        this.a(false, true);
    }
    
    void n() {
        this.getSupportLoaderManager().initLoader(5, null, new om(this, this));
    }
    
    public void onAccountsUpdated(final Account[] array) {
        if (!TextUtils.isEmpty((CharSequence)this.aA) && !CollectionUtils.c(array)) {
            final int length = array.length;
            int i = 0;
            boolean b = true;
            while (i < length) {
                if (array[i].name.equals(this.aA)) {
                    b = false;
                }
                ++i;
            }
            if (b) {
                this.aB = true;
                this.aA = null;
            }
        }
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 != 0) {
            switch (n) {
                default: {}
                case 1: {
                    final com.twitter.android.lists.c a = com.twitter.android.lists.c.a(intent);
                    this.a(new na(this.getApplicationContext(), this.U(), this.U().g(), a.b, a.a, 4), 7);
                }
                case 4: {
                    if (-1 == n2 && intent != null) {
                        this.d(this.B);
                        this.am();
                        if (intent.getBooleanExtra("remove_header", false)) {
                            this.B.profileHeaderImageUrl = null;
                        }
                        this.ae();
                        this.az();
                        this.am |= 0x40;
                        return;
                    }
                    break;
                }
                case 3: {
                    if (n2 != 1) {
                        break;
                    }
                    final Account a2 = ((UserAccount)intent.getParcelableExtra("account")).a;
                    if (!a2.name.equals(this.U().e())) {
                        this.T().d(a2.name);
                        cm.a();
                        final Session u = this.U();
                        this.a(u.g(), u.e());
                        return;
                    }
                    break;
                }
                case 2: {
                    if (-1 != n2 || intent == null) {
                        break;
                    }
                    final long longExtra = intent.getLongExtra("user_id", 0L);
                    if (longExtra > 0L && intent.hasExtra("friendship")) {
                        final int intExtra = intent.getIntExtra("friendship", 0);
                        if (!this.Z.a(longExtra, intExtra)) {
                            this.Z.b(longExtra, intExtra);
                            this.az();
                        }
                        this.az();
                        return;
                    }
                    break;
                }
                case 5: {
                    switch (n2) {
                        default: {
                            return;
                        }
                        case 1: {
                            this.as();
                            return;
                        }
                        case 2: {
                            this.aE.a();
                            return;
                        }
                        case 3: {
                            this.au();
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public void onBackPressed() {
        this.setResult(-1, new Intent().putExtra("user_id", this.y).putExtra("friendship", this.U));
        super.onBackPressed();
    }
    
    public void onButtonBarItemClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887167: {
                if (kg.a((Context)this)) {
                    kg.a(this, 4, this.M);
                    return;
                }
                this.aq();
            }
            case 2131887168: {
                if (com.twitter.library.api.z.i(this.U)) {
                    this.m(6);
                    return;
                }
                this.m(1);
            }
            case 2131887169: {
                this.m(12);
            }
            case 2131887170: {
                this.G().a(this.U().g(), this.a(":user:blocked_button:click"));
                this.G().a(this.U().g(), this.a(":user:unblock_dialog:impression"));
                bd.b((Context)this, this.z, 3, this.getSupportFragmentManager());
            }
            case 2131887172: {
                this.a(new py((Context)this, this.U(), this.B).a(2, false), 13);
                this.k(256);
                if (!this.ad.getBoolean("lifeline_unfollow_dialog_shown", false)) {
                    this.m(8);
                    this.ad.edit().putBoolean("lifeline_unfollow_dialog_shown", true).apply();
                }
                else {
                    Toast.makeText((Context)this, (CharSequence)this.getString(2131298075, new Object[] { this.B.c() }), 1).show();
                }
                this.ar.a();
            }
            case 2131887171: {
                this.a(this.y, this.aa);
                this.j(256);
                if (!this.ad.getBoolean("lifeline_follow_dialog_shown", false)) {
                    this.m(7);
                    this.ad.edit().putBoolean("lifeline_follow_dialog_shown", true).apply();
                }
                this.ar.b();
            }
            case 2131887162: {
                this.al();
            }
            case 2131887173: {
                this.startActivityForResult(new Intent((Context)this, (Class)AccountsDialogActivity.class).putExtra("AccountsDialogActivity_account_name", this.U().e()), 3);
            }
            case 2131887163: {
                this.aw();
            }
            case 2131887165: {
                this.m(9);
            }
            case 2131887164: {
                this.G().a(this.U().g(), this.a("::message:click"));
                com.twitter.android.profiles.ah.a((Context)this, this.B);
            }
        }
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887142: {
                this.D();
            }
            case 2131887185: {
                if (kg.a((Context)this)) {
                    kg.a(this, 5, this.M);
                    return;
                }
                this.startActivity(this.an());
            }
            case 2131887186: {
                if (kg.a((Context)this)) {
                    kg.a(this, 6, this.M);
                    return;
                }
                this.startActivity(com.twitter.android.util.v.a((Context)this, this.U().g(), this.B, null));
            }
            case 2131886644: {
                this.a(this.B.profileImageUrl, 2);
            }
            case 2131887194: {
                this.a(this.Q, 1);
            }
            case 2131887187: {
                com.twitter.android.commerce.util.e.a((Context)this, this.y, this.a(":commerce:button:click"), this.B, this.aa, this.ai);
            }
        }
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                return null;
            }
            case 4: {
                final long g = this.U().g();
                return new CursorLoader((Context)this, com.twitter.library.provider.ae.a(ContentUris.withAppendedId(be.t, g), g), com.twitter.android.provider.l.a, null, null, null);
            }
        }
    }
    
    protected void onDestroy() {
        if (this.ah != null) {
            this.ah.cancel(true);
            this.ah = null;
        }
        this.b(this.ap);
        if (this.az) {
            AccountManager.get((Context)this).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
        }
        if (this.aC != null) {
            this.aC.p();
        }
        super.onDestroy();
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (adapterView.getId() == 2131887189) {
            this.startActivity((Intent)adapterView.getItemAtPosition(n));
            return;
        }
        super.onItemClick(adapterView, view, n, n2);
    }
    
    public void onLoaderReset(final Loader loader) {
        loader.getId();
    }
    
    protected void onPause() {
        com.crashlytics.android.d.a("profile_user", null);
        super.onPause();
    }
    
    protected void onRestart() {
        super.onRestart();
        if (this.H != null) {
            this.H.e();
        }
    }
    
    protected void onResume() {
        super.onResume();
        if (this.aB) {
            this.a(this.y, this.z);
        }
    }
    
    public Object onRetainCustomNonConfigurationInstance() {
        if (this.isChangingConfigurations()) {
            return this.H.getSavedBitmaps();
        }
        return super.onRetainCustomNonConfigurationInstance();
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state_fetch_flags", this.am);
        bundle.putInt("state_friendship", this.U);
        if (this.aC != null) {
            this.aC.b(bundle);
            bundle.putBoolean("state_fr", this.aC.k());
        }
        if (!this.Z.a()) {
            bundle.putSerializable("state_friendship_cache", (Serializable)this.Z);
        }
        if (this.ab != null) {
            bundle.putSerializable("state_profile_spotlight", (Serializable)this.ab);
        }
        if (this.B != null) {
            this.B.friendship = this.U;
            bundle.putParcelable("state_user", (Parcelable)this.B);
        }
        else if (this.ae != null) {
            bundle.putParcelable("state_user", (Parcelable)this.ae);
        }
        bundle.putBoolean("should_hide_blocker_interstitial", this.at);
    }
    
    protected void onStop() {
        if (this.H != null) {
            this.H.f();
        }
        super.onStop();
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (this.aI && this.au == 1 && this.F.b() == 1) {
            this.b(-1, 1);
        }
        if (this.aI) {
            this.aI = false;
            if (this.m.getHeight() != this.aG) {
                this.L_();
            }
        }
        if (b) {
            this.ax();
        }
    }
    
    public void p() {
        this.G.a(true);
        this.al.setVisibility(8);
    }
    
    public void q() {
        this.at = true;
        this.Y();
        this.G().a(this.U().g(), this.a("blocker_interstitial:::click"), null);
    }
    
    protected Intent q_() {
        Intent intent;
        if (this.ac) {
            intent = this.W();
        }
        else {
            intent = super.q_();
        }
        if (intent != null) {
            intent.addFlags(536870912);
        }
        return intent;
    }
    
    public void setHeaderView(final View headerView) {
        if (this.t()) {
            final ViewParent parent = this.M().getParent();
            if (parent instanceof RelativeLayout) {
                final RelativeLayout relativeLayout = (RelativeLayout)parent;
                relativeLayout.addView((View)this.I, relativeLayout.indexOfChild((View)this.r) + 1);
            }
            super.setHeaderView(headerView);
        }
    }
}
