// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.android.geo.GeoTagState;
import com.twitter.android.AccountsDialogActivity;
import java.io.Serializable;
import com.twitter.android.provider.SuggestionsProvider;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.accounts.Account;
import com.twitter.android.DraftsActivity;
import com.twitter.android.UserAccount;
import android.os.Parcelable;
import com.twitter.android.MediaTagActivity;
import com.twitter.library.api.geo.GeoTag;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.account.ab;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.cm;
import com.twitter.library.api.TwitterUser;
import android.graphics.Rect;
import android.animation.ObjectAnimator;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.model.EditableImage;
import android.widget.Toast;
import com.twitter.library.scribe.ScribeSection;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.scribe.ScribeSectionSegmentedVideo;
import com.twitter.library.media.model.EditableSegmentedVideo;
import com.twitter.library.scribe.ScribeSectionImportedVideo;
import com.twitter.library.util.bj;
import com.twitter.android.media.widget.af;
import android.view.View$OnLongClickListener;
import com.twitter.library.widget.ad;
import com.twitter.android.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Handler;
import android.os.Looper;
import com.twitter.library.client.App;
import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import com.twitter.library.util.p;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.az;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.DraftTweet;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import com.twitter.library.media.model.MediaType;
import android.support.v4.app.Fragment;
import android.content.res.Resources;
import java.util.concurrent.Future;
import com.twitter.util.concurrent.h;
import java.util.concurrent.Callable;
import com.twitter.library.provider.f;
import android.os.AsyncTask;
import com.twitter.android.geo.e;
import android.support.v4.app.FragmentActivity;
import android.view.View$OnClickListener;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewStub;
import com.twitter.android.widget.y;
import com.twitter.android.widget.ag;
import android.text.TextWatcher;
import com.twitter.android.gh;
import android.os.Bundle;
import com.twitter.android.AttachMediaListener;
import android.net.Uri;
import android.content.Context;
import android.widget.ProgressBar;
import android.app.Activity;
import com.twitter.library.featureswitch.d;
import java.util.LinkedHashMap;
import com.twitter.android.widget.DraggableDrawerLayout;
import com.twitter.android.widget.ToggleImageButton;
import android.widget.ImageButton;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.android.media.widget.MediaAttachmentsView;
import java.util.HashMap;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.Tweet;
import android.view.animation.Animation;
import com.twitter.android.i;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.ac;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.client.as;
import com.twitter.android.nativecards.c;
import com.twitter.android.EditImageFragment;
import java.util.regex.Pattern;
import android.animation.Animator;
import com.twitter.library.client.Session;
import com.twitter.android.widget.ComposerSelectionFragment;
import com.twitter.android.widget.ComposerPoiFragment;
import com.twitter.android.widget.GalleryGridFragment;
import com.twitter.android.PhotoSelectFragment;
import com.twitter.android.widget.RevealClipFrameLayout;
import com.twitter.library.view.QuoteView;
import com.twitter.android.nativecards.CardPreviewView;
import com.twitter.ui.widget.TwitterButton;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.co;
import com.twitter.android.widget.bn;
import com.twitter.android.gi;
import com.twitter.android.bd;
import com.twitter.android.client.TwitterFragmentActivity;

public class ComposerActivity extends TwitterFragmentActivity implements bd, gi, bn, co, a
{
    static final /* synthetic */ boolean e;
    private static final String f;
    private TextView A;
    private Button B;
    private View F;
    private View G;
    private FrameLayout[] H;
    private View[] I;
    private ImageView J;
    private TwitterButton K;
    private TwitterButton L;
    private CardPreviewView M;
    private QuoteView N;
    private RevealClipFrameLayout O;
    private PhotoSelectFragment P;
    private GalleryGridFragment Q;
    private ComposerPoiFragment R;
    private ComposerSelectionFragment S;
    private Session T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private long Z;
    bb a;
    private Animator aA;
    private View aB;
    private TextView aC;
    private Pattern aD;
    private TextView aE;
    private EditImageFragment aF;
    private c aG;
    private as aa;
    private QuotedTweetData ab;
    private boolean ac;
    private int ad;
    private long ae;
    private ao af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private int am;
    private boolean an;
    private ac ao;
    private Runnable ap;
    private EditableMedia aq;
    private i ar;
    private boolean as;
    private int at;
    private ba au;
    private int av;
    private int aw;
    private Animation ax;
    private Animation ay;
    private boolean az;
    Tweet b;
    long c;
    PromotedContent d;
    private final HashMap g;
    private final aq h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private TweetBox o;
    private ComposerScrollView p;
    private MediaAttachmentsView q;
    private UserImageView r;
    private TextView s;
    private TextView t;
    private View u;
    private ImageButton v;
    private ToggleImageButton w;
    private ImageButton x;
    private TextView y;
    private DraggableDrawerLayout z;
    
    static {
        e = !ComposerActivity.class.desiredAssertionStatus();
        f = Integer.toString(140);
    }
    
    public ComposerActivity() {
        this.g = new LinkedHashMap(4);
        this.h = new aq(this, null);
        this.V = -1;
        this.W = -1;
        this.Z = -1L;
        this.ad = 0;
        this.af = null;
        this.at = 0;
        this.i = com.twitter.library.featureswitch.d.a("typeahead_button_triggering_android_2405", new String[] { "to_button" });
        this.j = com.twitter.library.featureswitch.d.a("rtwc_compose_android_2874", "blocking_tweet", "not_blocking_tweet");
        this.k = com.twitter.library.featureswitch.d.a("rtwc_compose_android_2874", new String[] { "not_blocking_tweet" });
        this.l = gr.a();
        this.m = com.twitter.library.featureswitch.d.e("composer_reachability_android_3069");
        this.n = com.twitter.library.featureswitch.d.a("composer_reachability_android_3069", new String[] { "reachability_with_replies" });
    }
    
    private void A() {
        this.M = (CardPreviewView)this.findViewById(2131886566);
        this.aG = com.twitter.android.nativecards.d.a().a(this, this.M);
        this.M.setController(this.aG);
        this.M.setProgressBar((ProgressBar)this.findViewById(2131886579));
    }
    
    private void X() {
        this.aG.a(this.o.getText(), !this.g.isEmpty() || this.ab != null);
    }
    
    private void Y() {
        if (this.ai) {
            this.z.a(false);
            this.V = 1;
            this.ai = false;
        }
        this.o.findViewById(2131886560).setFocusableInTouchMode(false);
        this.ai();
        this.Z();
    }
    
    private void Z() {
        if (this.G.findViewById(2131886575).getVisibility() == 0) {
            this.au.a("record_video_tooltip", this.getSupportFragmentManager());
            this.r();
        }
    }
    
    private void a(final Uri uri, final boolean b, final AttachMediaListener attachMediaListener) {
        this.q.setVisibility(0);
        this.P.a(uri, b, attachMediaListener);
        this.af();
    }
    
    private void a(final Bundle bundle) {
        int int1;
        if (bundle != null) {
            int1 = bundle.getInt("editing_media");
        }
        else {
            int1 = 0;
        }
        if (int1 != 0) {
            this.O.setVisibility(0);
            this.aF = (EditImageFragment)this.getSupportFragmentManager().findFragmentByTag("image_edit");
            if (this.aF != null) {
                final EditImageFragment af = this.aF;
                gh gh;
                if (int1 == 2) {
                    gh = this.q;
                }
                else {
                    gh = this.Q;
                }
                af.a(gh);
                this.aF.a(this);
            }
        }
    }
    
    private void a(final TweetBox tweetBox, final int n) {
        this.Q.a((View[])this.ab());
        this.Q.b(this.aa());
        this.Q.a(this);
        final ComposerSelectionFragment s = this.S;
        tweetBox.setTextWatcher((TextWatcher)new l(this, tweetBox, s));
        if (com.twitter.util.c.g((Context)this)) {
            tweetBox.setSuggestionsEnabled(false);
        }
        else if (this.i) {
            tweetBox.setSuggestionsEnabled(false);
            s.a(new w(this));
        }
        this.R.a(new ah(this));
    }
    
    private void a(final ComposerPoiFragment composerPoiFragment) {
        this.F = ((ViewStub)this.findViewById(2131886553)).inflate().findViewById(2131886587);
        this.G = ((ViewStub)this.findViewById(2131886589)).inflate();
        final ImageButton x = (ImageButton)this.G.findViewById(2131886575);
        final Resources resources = this.getResources();
        x.setImageDrawable(resources.getDrawable(2130837686));
        this.ax = AnimationUtils.loadAnimation((Context)this, 2131034135);
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2131034137);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new ai(this, x, resources, AnimationUtils.loadAnimation((Context)this, 2131034136)));
        this.ay = loadAnimation;
        x.setOnClickListener((View$OnClickListener)new aj(this, this.G()));
        this.x = x;
        this.r = (UserImageView)this.findViewById(2131886584);
        this.s = (TextView)this.findViewById(2131886586);
        this.t = (TextView)this.findViewById(2131886585);
        Object o = this.findViewById(2131886288);
        if (o == null) {
            o = this.r;
        }
        ((View)o).setOnClickListener((View$OnClickListener)new ak(this));
        this.findViewById(2131886582).setOnClickListener((View$OnClickListener)new al(this));
        final com.twitter.android.geo.c c = new com.twitter.android.geo.c(this, "composer_activity_location_dialog", new am(this, composerPoiFragment));
        c.a(composerPoiFragment);
        (this.w = (ToggleImageButton)this.findViewById(2131886574)).setOnClickListener((View$OnClickListener)new b(this, composerPoiFragment, c));
        (this.y = (TextView)this.findViewById(2131886578)).setText((CharSequence)ComposerActivity.f);
        (this.B = (Button)this.findViewById(2131886577)).setOnClickListener((View$OnClickListener)new com.twitter.android.composer.c(this));
        this.u = this.findViewById(2131886588);
        if (this.u != null) {
            this.u.setOnClickListener((View$OnClickListener)new com.twitter.android.composer.d(this));
            final com.twitter.util.concurrent.i a = new com.twitter.util.concurrent.b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new com.twitter.android.composer.e(this, com.twitter.library.provider.f.a((Context)this, this.T.g()))).a();
            a.a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.b).a(new com.twitter.android.composer.f(this)));
            this.a(a);
        }
        (this.v = (ImageButton)this.findViewById(2131886576)).setOnClickListener((View$OnClickListener)new g(this));
    }
    
    private void a(final Session session) {
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.Q = (GalleryGridFragment)supportFragmentManager.findFragmentByTag("gallery");
        if (this.Q == null) {
            final Resources resources = this.getResources();
            int n;
            if (this.l) {
                n = resources.getColor(2131689483);
            }
            else {
                n = resources.getColor(2131689637);
            }
            int n2;
            if (this.l) {
                n2 = resources.getColor(2131689637);
            }
            else {
                n2 = resources.getColor(2131689634);
            }
            beginTransaction.add(2131886572, this.Q = GalleryGridFragment.b(n, n2, 0, com.twitter.media.filters.g.a((Context)this), 0, this.l), "gallery");
        }
        this.S = (ComposerSelectionFragment)supportFragmentManager.findFragmentByTag("user_select");
        if (this.S == null) {
            beginTransaction.add(2131886572, this.S = new ComposerSelectionFragment(), "user_select");
        }
        this.R = (ComposerPoiFragment)supportFragmentManager.findFragmentByTag("location_fragment_tag");
        if (this.R == null) {
            beginTransaction.add(2131886572, this.R = new ComposerPoiFragment(), "location_fragment_tag");
        }
        beginTransaction.commit();
        this.P = PhotoSelectFragment.a(this, this, "composition", MediaType.g, session);
        supportFragmentManager.executePendingTransactions();
    }
    
    private void a(final EditableMedia editableMedia, final AttachMediaListener attachMediaListener) {
        this.q.setVisibility(0);
        this.b(editableMedia);
        this.P.a(editableMedia, attachMediaListener);
        this.af();
    }
    
    private void a(final DraftTweet draftTweet, final Tweet tweet, final Uri uri, final int[] array, final boolean b) {
        this.ae = draftTweet.draftId;
        int ad;
        if (this.ae > 0L) {
            ad = 2;
        }
        else {
            ad = 0;
        }
        this.ad = ad;
        this.o.a(draftTweet.statusText, array);
        final an an = new an(this, b);
        if (!CollectionUtils.a((Collection)draftTweet.media)) {
            final Iterator<EditableMedia> iterator = (Iterator<EditableMedia>)draftTweet.media.iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next(), an);
            }
        }
        if (uri != null) {
            this.a(uri, com.twitter.library.media.util.aq.a(), an);
        }
        this.ab = draftTweet.quotedData;
        if (this.j && draftTweet.quotedData != null) {
            this.N.setQuoteData(draftTweet.quotedData);
            this.N.setVisibility(0);
            this.o.setQuote(draftTweet.quotedData);
            this.o.setHintText(this.getString(2131296701));
            this.x.setImageDrawable(this.getResources().getDrawable(2130837686));
            this.g(false);
        }
        this.c = draftTweet.repliedTweetId;
        this.d = draftTweet.promotedContent;
        this.aG.a(draftTweet.cardUrl);
        this.a(tweet);
        int n;
        if (this.c > 0L) {
            n = 2131297456;
        }
        else {
            n = 2131297464;
        }
        this.o.setImeActionLabel(this.getText(n));
        if (this.c > 0L && this.b == null) {
            final com.twitter.util.concurrent.i a = com.twitter.library.util.p.a((Context)this, com.twitter.library.provider.ae.a(ContentUris.withAppendedId(com.twitter.library.provider.az.d, this.c), this.T.g()), Tweet.a);
            a.a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.a).a(new q(this)));
            this.a(a);
        }
        this.X();
    }
    
    private void a(final dt dt, final String s) {
        if (dt.b == 1 || dt.b == 2) {
            String s2;
            if (dt.b == 2) {
                s2 = "hashtag";
            }
            else {
                s2 = "username";
            }
            this.G().a(new TwitterScribeLog(this.T.g()).b("", "composition", "autocomplete_dropdown", s2, s));
        }
    }
    
    private void a(final List list) {
        boolean b;
        if (list != null && list.size() > 0) {
            b = true;
        }
        else {
            b = false;
        }
        final CharSequence a = com.twitter.library.media.util.ag.a((Context)this, list, 0);
        if (b) {
            this.L.setText(a);
            this.d(0);
        }
        else {
            this.d(8);
        }
        if (b) {
            this.c(8);
            return;
        }
        this.K.setText(this.getResources().getQuantityText(2131427335, this.g.size()));
        this.c(0);
    }
    
    private View[] aa() {
        if (!gr.d()) {
            return null;
        }
        if (this.I != null) {
            return this.I;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final View inflate = layoutInflater.inflate(2130968777, (ViewGroup)null);
        final View inflate2 = layoutInflater.inflate(2130968778, (ViewGroup)null);
        inflate.setOnClickListener((View$OnClickListener)new com.twitter.android.composer.s(this));
        inflate2.setOnClickListener((View$OnClickListener)new t(this));
        return this.I = new View[] { inflate, inflate2 };
    }
    
    private FrameLayout[] ab() {
        if (this.H != null) {
            return this.H;
        }
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final ArrayList<FrameLayout> list = new ArrayList<FrameLayout>();
        FrameLayout frameLayout3;
        if (!gr.d()) {
            final FrameLayout frameLayout = (FrameLayout)layoutInflater.inflate(2130968782, (ViewGroup)null);
            frameLayout.setOnClickListener((View$OnClickListener)new u(this));
            list.add(frameLayout);
            if (gr.e()) {
                final FrameLayout frameLayout2 = (FrameLayout)layoutInflater.inflate(2130968783, (ViewGroup)null);
                frameLayout2.setOnClickListener((View$OnClickListener)new v(this));
                list.add(frameLayout2);
                frameLayout3 = frameLayout;
            }
            else {
                frameLayout3 = frameLayout;
            }
        }
        else {
            frameLayout3 = null;
        }
        final FrameLayout frameLayout4 = (FrameLayout)layoutInflater.inflate(2130968781, (ViewGroup)null);
        frameLayout4.setOnClickListener((View$OnClickListener)new x(this));
        list.add(frameLayout4);
        if (this.l) {
            final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2131034168);
            final Animation loadAnimation2 = AnimationUtils.loadAnimation((Context)this, 2131034169);
            for (final FrameLayout frameLayout5 : list) {
                frameLayout5.setBackgroundColor(this.getResources().getColor(2131689630));
                frameLayout5.setOnTouchListener((View$OnTouchListener)new z(this, new GestureDetector((Context)this, (GestureDetector$OnGestureListener)new com.twitter.android.composer.y(this, frameLayout5, loadAnimation, loadAnimation2)), frameLayout5));
            }
            ((ImageView)frameLayout4.findViewById(2131886127)).setImageResource(2130837678);
            if (frameLayout3 != null) {
                final ImageView imageView = (ImageView)frameLayout3.findViewById(2131886127);
                imageView.setImageResource(2130837680);
                imageView.setContentDescription((CharSequence)this.getResources().getString(2131296395));
            }
        }
        else {
            final Iterator<FrameLayout> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                ((View)iterator2.next()).setBackgroundDrawable(this.getResources().getDrawable(2130837580));
            }
        }
        return this.H = list.toArray(new FrameLayout[list.size()]);
    }
    
    private void ac() {
        if (this.T.g() != this.Z) {
            this.T().c(this.T().b(this.Z));
        }
    }
    
    private boolean ad() {
        return (this.b != null && this.b.C == this.T.g()) || (this.aD != null && this.aD.matcher(this.o.getText()).find());
    }
    
    private void ae() {
        if (this.aF != null) {
            this.getSupportFragmentManager().beginTransaction().remove(this.aF).commit();
            this.O.setVisibility(8);
            this.aF = null;
        }
    }
    
    private void af() {
        final boolean c = this.P.c();
        if (c) {
            this.al = false;
        }
        else if (this.q.getMediaCount() == 0) {
            this.q.b();
        }
        final Button b = this.B;
        boolean enabled = false;
        if (!c) {
            final boolean y = this.Y;
            enabled = false;
            if (y) {
                enabled = true;
            }
        }
        b.setEnabled(enabled);
    }
    
    private boolean ag() {
        final Iterator<EditableMedia> iterator = this.g.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().e() != MediaType.b) {
                return false;
            }
        }
        return this.g.size() < 4;
    }
    
    private void ah() {
        final boolean ag = this.ag();
        this.Q.b(!ag);
        this.Q.c(!this.g.isEmpty());
        for (final FrameLayout frameLayout : this.ab()) {
            if (ag) {
                frameLayout.setForeground((Drawable)null);
                frameLayout.setClickable(true);
            }
            else if (frameLayout.getForeground() == null) {
                frameLayout.setForeground(this.getResources().getDrawable(2131689627));
                frameLayout.setClickable(false);
            }
        }
    }
    
    private void ai() {
        int n = 1;
        final int drawerState = this.z.getDrawerState();
        if (drawerState == 2) {
            n = 0;
        }
        else if (!this.m && (this.z.a() || (drawerState != 0 && (!this.z.c() || this.V == 4)))) {
            n = 0;
        }
        final View g = this.G;
        int visibility = 0;
        if (n == 0) {
            visibility = 8;
        }
        g.setVisibility(visibility);
    }
    
    private void aj() {
        this.ak();
        switch (this.ad) {
            case 2:
            case 3: {
                if (this.ae > 0L) {
                    b(this.ae, this.getApplicationContext(), this.T, this.aa);
                    this.ae = 0L;
                    return;
                }
                break;
            }
            case 1: {
                this.ad = 0;
            }
        }
    }
    
    private void ak() {
        if (this.af != null) {
            if (App.a()) {
                if (this.ad != 1) {
                    throw new IllegalStateException("mFirstDraftSaver set but mDraftSaveState is " + this.ad);
                }
                if (this.ae > 0L) {
                    throw new IllegalStateException("mFirstDraftSaver set but mDraftId is not 0: " + this.ae);
                }
            }
            this.af.a();
            this.af = null;
            this.ad = 0;
        }
    }
    
    private boolean al() {
        return this.getResources().getConfiguration().hardKeyboardHidden == 1;
    }
    
    private void am() {
        if (!this.an) {
            this.an = true;
            if (this.aq != null) {
                this.a(this.aq, true);
                this.aq = null;
            }
            if (this.ao != null) {
                com.twitter.library.client.p.a().b(this.ao);
                this.ao = null;
            }
            if (this.ap != null) {
                new Handler(Looper.getMainLooper()).removeCallbacks(this.ap);
                this.ap = null;
            }
        }
    }
    
    private static void b(final long n, final Context context, final Session session, final as as) {
        as.a(new bc(context, session, n, false));
    }
    
    private void b(final Uri uri) {
        final EditableMedia editableMedia = this.g.remove(uri);
        if (editableMedia != null) {
            editableMedia.g();
        }
        this.Q.a(uri);
        this.ah();
    }
    
    private void b(final Bundle bundle) {
        (this.au = ba.a((Context)this, this.getSupportFragmentManager(), bundle)).a(new r(this));
    }
    
    private void b(final View view) {
        final View viewById = this.findViewById(16908290);
        viewById.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new com.twitter.android.composer.h(this, viewById));
        final DraggableDrawerLayout z = (DraggableDrawerLayout)this.findViewById(2131886550);
        (this.z = z).a(false);
        z.setDrawerLayoutListener(this);
        this.ar = new i((Context)this, (View)z, new com.twitter.android.composer.i(this));
        final TweetBox o = (TweetBox)this.findViewById(2131886559);
        (this.o = o).setTweetBoxListener(new com.twitter.android.composer.j(this));
        final ComposerScrollView p = (ComposerScrollView)this.findViewById(2131886554);
        (this.p = p).setObservableScrollViewListener(new k(this, view, p, o));
        final View child = p.getChildAt(0);
        child.setOnClickListener((View$OnClickListener)new m(this, o));
        child.setOnLongClickListener((View$OnLongClickListener)new n(this, o));
        (this.q = (MediaAttachmentsView)this.findViewById(2131886563)).setActionListener(new o(this));
        this.K = (TwitterButton)this.findViewById(2131886564);
        this.av = this.K.getVisibility();
        this.L = (TwitterButton)this.findViewById(2131886565);
        this.aw = this.L.getVisibility();
        this.J = (ImageView)this.findViewById(2131886569);
        (this.A = (TextView)this.findViewById(2131886570)).setOnClickListener((View$OnClickListener)new com.twitter.android.composer.p(this));
        (this.N = (QuoteView)this.findViewById(2131886562)).setDisplaySensitiveMedia(true);
        this.N.setRenderRtl(bj.e);
        this.O = (RevealClipFrameLayout)this.findViewById(2131886590);
        this.aB = this.findViewById(2131886557);
        this.aC = (TextView)this.aB.findViewById(2131886558);
        this.aE = (TextView)this.findViewById(2131886556);
    }
    
    private void b(final EditableMedia editableMedia) {
        final EditableMedia editableMedia2 = this.g.put(editableMedia.c(), editableMedia);
        if (editableMedia2 != null && !editableMedia2.a(editableMedia)) {
            editableMedia2.g();
        }
        this.Q.b(editableMedia);
        this.ah();
    }
    
    private void b(final EditableMedia editableMedia, final View view) {
        this.P.a(editableMedia, view, new an(this, true));
        this.af();
    }
    
    private void b(final List list) {
        if (!list.isEmpty()) {
            final EditableMedia editableMedia = list.get(0);
            ScribeSection scribeSection = null;
            switch (com.twitter.android.composer.ag.a[editableMedia.e().ordinal()]) {
                default: {
                    scribeSection = null;
                    break;
                }
                case 2: {
                    scribeSection = new ScribeSectionImportedVideo().a("(multiple):composition:video:trim:send_video_tweet");
                    break;
                }
                case 3: {
                    scribeSection = new ScribeSectionSegmentedVideo((EditableSegmentedVideo)editableMedia).a("(multiple):composition:video:segment:send_video_tweet");
                    break;
                }
            }
            if (scribeSection != null) {
                EventReporter.a(new TwitterScribeLog(this.T.g()).a(scribeSection));
            }
        }
    }
    
    private boolean b(final EditableMedia editableMedia, final boolean b) {
        if (this.g.containsKey(editableMedia.c())) {
            if (b) {
                Toast.makeText((Context)this, (CharSequence)this.getString(2131297459), 0).show();
            }
        }
        else if (this.g.size() < 4) {
            this.b(editableMedia);
            return true;
        }
        return false;
    }
    
    private void c(final int av) {
        this.av = av;
        this.r();
    }
    
    private void c(final View view) {
        if (view.getRootView().getHeight() - view.getHeight() > this.getResources().getDimensionPixelSize(2131558941)) {
            this.Y();
        }
        else if (this.V == 1) {
            this.V = -1;
        }
    }
    
    private void d(final int aw) {
        this.aw = aw;
        this.r();
    }
    
    private void d(final EditableMedia editableMedia) {
        final Collection values = this.g.values();
        final boolean b = editableMedia.e() != MediaType.b;
        ArrayList<EditableImage> list = null;
        for (final EditableMedia editableMedia2 : values) {
            if (editableMedia2.b(editableMedia)) {
                break;
            }
            if (b || editableMedia2.e() != MediaType.b) {
                ArrayList<EditableImage> list2;
                if (list == null) {
                    list2 = new ArrayList<EditableImage>(-1 + values.size());
                }
                else {
                    list2 = list;
                }
                list2.add((EditableImage)editableMedia2);
                list = list2;
            }
            else {
                if (!(editableMedia2 instanceof EditableImage)) {
                    continue;
                }
                ((EditableImage)editableMedia).tags = ((EditableImage)editableMedia2).tags;
            }
        }
        if (list != null) {
            final Iterator<EditableImage> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.a(iterator2.next().c(), false);
            }
        }
        this.ah();
        this.b(editableMedia);
    }
    
    private void f(final boolean b) {
        this.ak();
        final bh bh = new bh(this.getApplicationContext(), this.T, this.j(), b);
        if (this.ad == 0) {
            if (this.ae > 0L) {
                ErrorReporter.a(new IllegalStateException("mDraftSaveState and mDraftId out of sync. Unsaved with draft id > 0"));
            }
            this.af = new ao(this, this.T, this.aa);
            this.ad = 1;
            bh.a(this.af);
        }
        this.aa.a(bh);
    }
    
    private void g(final boolean b) {
        if (b) {
            this.x.setEnabled(true);
            this.x.setAlpha(1.0f);
            return;
        }
        this.x.setEnabled(false);
        this.x.setAlpha(0.3f);
    }
    
    @Override
    public com.twitter.android.client.bn a(final Bundle bundle, final com.twitter.android.client.bn bn) {
        int n;
        if (this.m) {
            n = 2131492980;
        }
        else {
            n = 2131492979;
        }
        this.getTheme().applyStyle(n, false);
        int n2;
        if (this.l) {
            n2 = 2131493020;
        }
        else {
            n2 = 2131493019;
        }
        this.getTheme().applyStyle(n2, false);
        bn.c(2130968693);
        bn.b(false);
        bn.a(false);
        bn.c(false);
        bn.e(true);
        return bn;
    }
    
    @Override
    public void a(final float n) {
        if (this.V == 2) {
            this.Q.a(n);
        }
    }
    
    void a(final int n) {
        final int n2 = 140 - n;
        final Resources resources = this.getResources();
        final TextView y = this.y;
        int n3;
        if (n2 >= 0) {
            n3 = 2131689591;
        }
        else {
            n3 = 2131689610;
        }
        y.setTextColor(resources.getColor(n3));
        this.y.setText((CharSequence)Integer.toString(n2));
        this.Y = this.o.b(!com.twitter.library.featureswitch.d.a("rtwc_compose_android_2874", new String[] { "blocking_tweet" }));
        this.ai();
        this.B.setEnabled(this.Y && !this.P.c());
        this.t();
        this.u();
        if (this.k && this.ab != null) {
            final Button b = this.B;
            int n4;
            if (!TextUtils.isEmpty((CharSequence)this.o.getText())) {
                n4 = 2131297464;
            }
            else {
                n4 = 2131298004;
            }
            b.setText((CharSequence)resources.getString(n4));
        }
        if (n > 0 && this.ad == 0) {
            this.f(false);
        }
        if (n != 0) {
            this.al = false;
            return;
        }
        if (this.ad()) {
            this.o.setHintText(this.getResources().getString(2131296705, new Object[] { this.b.a() }));
            return;
        }
        if (this.g.size() > 0 || (this.ab != null && this.j)) {
            this.o.setHintText(this.getResources().getString(2131296701));
            return;
        }
        this.o.setHintText(this.getResources().getString(2131296702));
    }
    
    void a(final int n, final boolean b) {
        this.a(n, b, false);
    }
    
    void a(int n, final boolean b, final boolean b2) {
        boolean b3 = true;
        if (this.V == n || this.z.a()) {
            return;
        }
        if (!this.ak) {
            this.W = n;
            return;
        }
        if ((n == (b3 ? 1 : 0) && this.al()) || (n != 2 && this.O.getVisibility() == 0)) {
            n = 0;
        }
        if (n == (b3 ? 1 : 0) && this.z.getDrawerState() == 2) {
            if (!this.z.b()) {
                this.as = b3;
                this.z.a(b, false);
                return;
            }
            this.z.a(b);
        }
        final FragmentTransaction beginTransaction = this.getSupportFragmentManager().beginTransaction();
        switch (n) {
            case 2: {
                beginTransaction.hide(this.R);
                beginTransaction.hide(this.S);
                beginTransaction.show(this.Q);
                break;
            }
            case 3: {
                beginTransaction.hide(this.Q);
                beginTransaction.hide(this.S);
                beginTransaction.show(this.R);
                break;
            }
            case 4: {
                beginTransaction.hide(this.Q);
                beginTransaction.hide(this.R);
                beginTransaction.show(this.S);
                break;
            }
            case 0:
            case 1: {
                beginTransaction.hide(this.Q);
                beginTransaction.hide(this.R);
                beginTransaction.hide(this.S);
                break;
            }
        }
        beginTransaction.commit();
        this.V = n;
        this.z.setExtendDrawerInUpState(false);
        this.z.setDrawerDraggable(false);
        this.z.setDraggableBelowUpPosition(b3);
        this.z.setDispatchDragToChildren(false);
        this.z.setLocked(false);
        this.z.setFullScreenHeaderView(null);
        switch (n) {
            case 1: {
                this.ai = b3;
                this.o.a(b3);
                break;
            }
            case 2: {
                this.o.a(false);
                this.Q.a(this.z);
                this.z.a(b, b2);
                this.q.d();
                break;
            }
            case 3: {
                this.ai = false;
                this.o.a(false);
                this.z.setLocked(b3);
                this.z.a(b, b2);
                break;
            }
            case 4: {
                final TweetBox o = this.o;
                if (b2) {
                    b3 = false;
                }
                o.a(b3);
                this.S.a(this.z);
                this.z.a(b, b2);
                if (!b2) {
                    this.o.g();
                    break;
                }
                this.S.b();
                this.S.a(this.o.getTokenAtCursor());
                break;
            }
            case 0: {
                this.z.a(b);
                this.o.a(false);
                break;
            }
        }
        this.al = false;
    }
    
    @Override
    public void a(final Intent intent, final int n, final Bundle bundle) {
        ActivityCompat.startActivityForResult(this, intent, n, bundle);
    }
    
    void a(final Uri uri, final boolean b) {
        final EditableMedia editableMedia = this.g.get(uri);
        String s = null;
        if (editableMedia != null) {
            switch (com.twitter.android.composer.ag.a[editableMedia.e().ordinal()]) {
                default: {
                    s = "";
                    break;
                }
                case 1: {
                    s = "photo";
                    break;
                }
                case 2:
                case 3: {
                    s = "video";
                    break;
                }
            }
        }
        else {
            s = "";
        }
        if (!s.isEmpty()) {
            this.G().a(new TwitterScribeLog(this.T.g()).b(":composition::", s, ":dismiss"));
        }
        this.P.a(uri);
        this.b(uri);
        this.q.a(uri, b);
        if (this.q.getMediaCount() == 0) {
            this.c(8);
            this.d(8);
            this.o.f();
            if (b && this.aA != null && this.V != 2) {
                final int measuredHeight = this.q.getMeasuredHeight();
                final ObjectAnimator objectAnimator = (ObjectAnimator)this.aA.clone();
                objectAnimator.setFloatValues(new float[] { -measuredHeight });
                objectAnimator.start();
            }
            else {
                this.q.b();
            }
            if (this.x.isEnabled()) {
                this.x.startAnimation(this.ay);
                return;
            }
            this.g(true);
        }
    }
    
    @Override
    public void a(final EditableImage editableImage, final String s) {
        if (this.g.containsKey(editableImage.c()) || this.ag()) {
            com.twitter.android.composer.av.a(editableImage, s);
            if (!this.g.containsKey(editableImage.c())) {
                com.twitter.android.composer.av.c();
            }
            this.a(editableImage, true);
            if (this.V == 2) {
                this.Q.b(editableImage);
            }
            this.q.e();
        }
        this.ae();
    }
    
    @Override
    public void a(final EditableMedia editableMedia) {
        this.q.a(editableMedia);
        String s;
        if (this.aF.b() == this.Q) {
            s = "gallery";
        }
        else {
            s = "image_attachment";
        }
        com.twitter.android.composer.av.a(s);
    }
    
    @Override
    public void a(final EditableMedia editableMedia, View view) {
        final Uri c = editableMedia.c();
        if (this.g.size() < 4 || this.g.containsKey(c)) {
            if (!this.l || !(editableMedia instanceof EditableImage)) {
                if (!this.l) {
                    view = null;
                }
                this.b(editableMedia, view);
                return;
            }
            gh gh;
            if (this.g.size() == 4) {
                gh = this.q;
            }
            else {
                gh = this.Q;
            }
            if (gh == this.q) {
                this.q.setSelectedImage(this.g.get(editableMedia.c()));
            }
            this.aF = EditImageFragment.a(gh, this, view, this.O, "composer");
            if (this.aF != null) {
                this.getSupportFragmentManager().beginTransaction().add(this.O.getId(), this.aF, "image_edit").commit();
            }
        }
    }
    
    void a(final EditableMedia aq, final boolean b) {
        if (this.am != 0 && !this.an) {
            this.aq = aq;
        }
        else {
            if (aq.mediaFile.type == MediaType.d) {
                this.z.a(true);
            }
            this.d(aq);
            this.q.setVisibility(0);
            this.q.a(aq, b);
            this.o.e();
            final TwitterUser f = this.T.f();
            if (!ComposerActivity.e && f == null) {
                throw new AssertionError();
            }
            if (!(aq instanceof EditableImage)) {
                this.c(8);
                this.d(8);
            }
            else if (!f.isProtected || f.followersCount > 0) {
                this.a(((EditableImage)aq).tags);
                final com.twitter.android.composer.ae ae = new com.twitter.android.composer.ae(this);
                this.K.setOnClickListener((View$OnClickListener)ae);
                this.L.setOnClickListener((View$OnClickListener)ae);
                this.K.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new com.twitter.android.composer.af(this, (View)this.K.getParent(), new Rect(), this.getResources().getDimensionPixelSize(2131558771)));
            }
            this.af();
            this.ai();
            this.o.setHintText(this.getResources().getString(2131296701));
            if (this.q.getMediaCount() == 1) {
                if (aq.e() == MediaType.b) {
                    this.x.setImageDrawable(this.getResources().getDrawable(2130837687));
                    this.x.startAnimation(this.ax);
                    return;
                }
                this.g(false);
            }
        }
    }
    
    void a(final Tweet tweet) {
        this.b = tweet;
        this.o.setRepliedTweet(tweet);
        if (tweet != null) {
            this.c = tweet.D;
            this.d = tweet.j;
        }
        if (tweet != null) {
            this.aD = Pattern.compile("(?:^|\\s)@" + tweet.F + "(?:\\s|$)", 2);
            if (this.n) {
                this.aC.setText((CharSequence)this.getString(2131296704, new Object[] { tweet.a() }));
                this.aE.setText((CharSequence)this.getString(2131296703, new Object[] { tweet.F, tweet.y }));
            }
        }
        else {
            this.aD = null;
        }
        if (this.n) {
            this.u();
        }
    }
    
    void a(final String s) {
        final com.twitter.library.client.az t = this.T();
        Session t2 = t.b();
        if (!s.equalsIgnoreCase(t2.e())) {
            t2 = t.b(s);
            t.c(t2);
        }
        this.T = t2;
        final TwitterUser f = t2.f();
        if (!ComposerActivity.e && f == null) {
            throw new AssertionError();
        }
        this.r.a(f);
        if (this.t != null) {
            this.t.setText((CharSequence)f.name);
        }
        if (this.s != null) {
            this.s.setText((CharSequence)('@' + f.username));
        }
        this.h();
        cm.a();
        if (f.isLifelineInstitution && com.twitter.library.featureswitch.d.f("legacy_deciders_lifeline_alerts_enabled")) {
            this.b(this.U);
            this.v.setVisibility(0);
            return;
        }
        if (this.U) {
            this.b(false);
            this.v.setVisibility(8);
            return;
        }
        this.z();
    }
    
    void a(final String s, final dt dt) {
        this.o.a(s);
        this.a(dt, "select");
    }
    
    void a(final ln ln, final dt dt) {
        if (this.z.getDrawerState() != 2) {
            if (ln.a() > 0) {
                if (this.V != 4) {
                    this.a(dt, "show");
                }
                this.a(4, true, false);
            }
            else if (this.V == 4) {
                this.a(1, true);
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
        boolean locked = true;
        final int drawerState = this.z.getDrawerState();
        final DraggableDrawerLayout z = this.z;
        if (drawerState == (locked ? 1 : 0) || ((this.O.getVisibility() != 0 || this.V != 2) && b)) {
            locked = false;
        }
        z.setLocked(locked);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        toolBar.setDisplayShowHomeAsUpEnabled(false);
        final boolean a = super.a(jv, toolBar);
        boolean b = false;
        if (a) {
            final boolean b2 = toolBar.b();
            b = false;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void ao_() {
        this.ae();
        com.twitter.android.composer.av.a();
    }
    
    @Override
    public String b() {
        return this.R.c();
    }
    
    @Override
    public void b(final int n) {
        if (n == 0) {
            this.V = 0;
        }
        boolean b;
        if (n == 2) {
            b = true;
        }
        else {
            b = false;
        }
        this.B.setClickable(!b);
        if (this.V != 1 && this.as && !b) {
            this.a(1, false);
        }
        this.as = false;
        this.ai();
        this.R.b(n);
        if (this.V == 2 && this.O.getVisibility() == 0) {
            this.z.setLocked(true);
        }
        if (this.V == 4 && b) {
            final dt tokenAtCursor = this.o.getTokenAtCursor();
            this.z.setLocked(true);
            this.S.a(tokenAtCursor);
            this.S.b();
            if (tokenAtCursor != null) {
                this.a(tokenAtCursor, "full_screen");
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle, final com.twitter.android.client.bn bn) {
        ix.a("composer:complete", this.F(), ih.m).i();
        this.ak = false;
        final com.twitter.android.composer.au a = com.twitter.android.composer.au.a(this);
        this.a = a.b();
        this.aa = com.twitter.library.client.as.a((Context)this);
        final String f = a.f();
        Session t;
        if (bundle == null && !TextUtils.isEmpty((CharSequence)f)) {
            t = this.T().b(f);
        }
        else {
            t = this.U();
        }
        this.T = t;
        this.Z = t.g();
        Uri l;
        int[] array;
        Tweet h;
        DraftTweet b;
        if (bundle != null) {
            final DraftTweet draftTweet = (DraftTweet)bundle.getSerializable("draft_tweet");
            final Tweet tweet = (Tweet)bundle.getParcelable("replied_tweet");
            l = null;
            this.ag = bundle.getBoolean("loaded_from_draft");
            this.ac = bundle.getBoolean("tweet_posted");
            this.W = bundle.getInt("current_drawer");
            this.X = bundle.getInt("current_drawer_state");
            this.aj = bundle.getBoolean("show_link_hint", true);
            this.am = bundle.getInt("launch_camera_mode");
            this.U = bundle.getBoolean("lifeline_alert");
            array = bundle.getIntArray("selection");
            h = tweet;
            b = draftTweet;
        }
        else {
            b = a.b((Context)this, this.j);
            h = a.h();
            l = a.l();
            this.ag = (b.draftId != 0L);
            this.ac = false;
            final int a2 = a.a();
            int b2;
            if (a2 == 3) {
                b2 = a.b(1);
            }
            else {
                b2 = 0;
            }
            this.am = b2;
            if (this.am != 0) {
                this.W = 0;
            }
            else {
                int w;
                if (a2 == 2) {
                    w = 2;
                }
                else {
                    w = 1;
                }
                this.W = w;
            }
            this.aj = true;
            this.al = true;
            this.U = false;
            array = a.c();
            this.G().a(this.Z, ":composition:::impression", a.m());
        }
        this.a(t);
        this.a(this.R);
        this.b(this.F);
        this.a(this.o, this.W);
        this.b(bundle);
        this.A();
        this.a(b, h, l, array, bundle == null);
        this.ai();
        this.a(t.e());
        final ay a3 = com.twitter.android.composer.ay.a();
        if (!a3.b() || bundle == null) {
            if (!this.o.k()) {
                a3.a(false);
            }
            else {
                a3.c();
            }
        }
        final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)this.findViewById(2131886568), "translationY", new float[] { 0.0f, 1.0f }).setDuration(450L);
        ((Animator)setDuration).setInterpolator((TimeInterpolator)new DecelerateInterpolator(2.0f));
        ((Animator)setDuration).addListener((Animator$AnimatorListener)new com.twitter.android.composer.a(this));
        this.aA = (Animator)setDuration;
        this.a(bundle);
    }
    
    void b(final boolean u) {
        this.U = u;
        if (u) {
            this.G().a(this.U().g(), "composition:lifeline_alerts:::select");
            this.v.setImageResource(2130838851);
            this.o.setAlertHashtag(true);
        }
        else {
            this.v.setImageResource(2130838850);
            this.o.setAlertHashtag(false);
        }
        this.z();
    }
    
    @Override
    public void c(final EditableMedia editableMedia) {
        if (this.g.containsKey(editableMedia.c())) {
            this.a(editableMedia.c(), false);
        }
        else if (editableMedia.e() == MediaType.d) {
            this.a(editableMedia, (View)null);
        }
        else if (this.b(editableMedia, false)) {
            this.a(editableMedia, new an(this, true));
            if (this.g.size() == 1 && (!gr.c() || !(editableMedia instanceof EditableImage))) {
                this.a(0, true);
                return;
            }
        }
        this.az = true;
    }
    
    void c(final boolean b) {
        this.o.a(b);
        if (b) {
            this.V = 1;
        }
    }
    
    void e(final boolean b) {
        int n;
        if (b || this.o.getCount() > 140) {
            n = 1;
        }
        else {
            n = 0;
        }
        final TextView y = this.y;
        int visibility = 0;
        if (n == 0) {
            visibility = 8;
        }
        y.setVisibility(visibility);
    }
    
    @Override
    public void finish() {
        super.finish();
        if (this.R != null) {
            this.R.a(this.ag, this.at);
        }
        this.overridePendingTransition(2131034154, 2131034155);
        final long o = com.twitter.android.composer.au.a(this).o();
        if (o != 0L) {
            int n;
            if (this.ac) {
                n = -1;
            }
            else {
                n = 0;
            }
            com.twitter.android.card.w.a().a(o, n);
        }
    }
    
    @Override
    protected void g_() {
        if (this.l()) {
            this.showDialog(514);
            return;
        }
        this.setResult(0);
        super.g_();
    }
    
    void h() {
        final UserSettings j = this.T.j();
        if (!this.J().c()) {
            this.w.setVisibility(8);
            if (j == null) {
                com.twitter.library.client.as.a((Context)this).a(com.twitter.library.api.account.ab.a((Context)this, this.T), (com.twitter.library.service.z)null);
            }
        }
        else if (j != null) {
            this.w.setVisibility(0);
        }
    }
    
    void i() {
        this.ac = true;
        final Context applicationContext = this.getApplicationContext();
        final com.twitter.android.client.c g = this.G();
        final Session t = this.T;
        final DraftTweet j = this.j();
        final boolean b = this.k && this.ab != null && TextUtils.isEmpty((CharSequence)this.o.getText());
        if (b) {
            this.aj();
            this.ad = 3;
            this.a.a(applicationContext, t, this.ab.statusId, this.ab.statusId, this.ab.promotedContent);
        }
        else {
            this.ak();
            this.a.a(applicationContext, t, j);
        }
        String s;
        if (this.ag) {
            s = "drafts:composition";
        }
        else {
            s = "composition:";
        }
        String s2;
        if (this.ad()) {
            s2 = "send_reply";
        }
        else if (b) {
            s2 = "retweet";
        }
        else if (this.ab != null) {
            s2 = "send_quote_tweet";
        }
        else {
            s2 = "send_tweet";
        }
        final long g2 = t.g();
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(g2).g().b("", s, "", s2);
        final long c = com.twitter.android.composer.ay.a().c();
        if (c != -1L) {
            twitterScribeLog.b(c);
        }
        g.a(twitterScribeLog);
        com.twitter.android.composer.av.a(j.media, this.ag, this.ad());
        this.b(j.media);
        if (j.geoTag != null) {
            g.a(g2, "", s, "", "geotag");
        }
        this.at = 1;
        final Intent intent = this.getIntent();
        this.setResult(-1, new Intent().putExtra("android.intent.extra.RETURN_RESULT", intent.getStringExtra("android.intent.extra.RETURN_RESULT")).putExtra("extra_is_retweet", b));
        final Intent intent2 = (Intent)intent.getParcelableExtra("android.intent.extra.INTENT");
        if (intent2 != null) {
            intent2.setFlags(67108864);
            this.d(intent2);
        }
        this.finish();
    }
    
    public DraftTweet j() {
        GeoTag f = this.R.b().f();
        if (!bg.a((Context)this, sk.a(), this.w, this.A, f, this.R.e(), this.U)) {
            f = null;
        }
        final Collection<?> values = (Collection<?>)this.g.values();
        List list;
        if (!values.isEmpty()) {
            list = new ArrayList(values);
        }
        else {
            list = null;
        }
        final com.twitter.library.provider.e a = new com.twitter.library.provider.e().a(this.ae).a(this.o.getText()).a(list).b(this.c).a(f).a(this.d);
        final boolean j = this.j;
        QuotedTweetData ab = null;
        if (j) {
            ab = this.ab;
        }
        return (DraftTweet)a.a(ab).b(this.aG.b()).f();
    }
    
    void k() {
        if (this.U) {
            this.G().a(this.U().g(), "composition:lifeline_alerts:::impression");
            this.showDialog(515);
            return;
        }
        this.i();
    }
    
    protected boolean l() {
        return !this.ac && (this.o.c() || !this.g.isEmpty() || this.ag);
    }
    
    void m() {
        if (this.V != 1) {
            this.G().a(new TwitterScribeLog(this.T.g()).b(new String[] { ":composition::text_view:focus_field" }));
            this.a(1, true);
        }
    }
    
    void n() {
        this.startActivityForResult(new Intent((Context)this, (Class)MediaTagActivity.class).putExtra("editable_image", (Parcelable)CollectionUtils.b((Iterable)this.g.values())), 513);
        this.G().a(this.U().g(), ":composition::media_tag_prompt:click");
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        this.P.a(n, n2, intent, new an(this, true));
        switch (n) {
            case 257: {
                if (intent == null) {
                    break;
                }
                this.a(0, false);
                if (intent.getData() != null) {
                    this.a(0, false);
                    return;
                }
                break;
            }
            case 258: {
                if (n2 == -1) {
                    this.a(this.am = 0, false);
                    this.ap = new com.twitter.android.composer.ab(this);
                    new Handler(Looper.getMainLooper()).postDelayed(this.ap, 1000L);
                    return;
                }
                if (this.am != 0) {
                    this.am = 0;
                    this.finish();
                    return;
                }
                break;
            }
            case 513: {
                if (n2 == -1 && intent != null) {
                    final List tags = (List)intent.getSerializableExtra("photo_tags");
                    final Iterator<EditableMedia> iterator = this.g.values().iterator();
                    while (iterator.hasNext()) {
                        ((EditableImage)iterator.next()).tags = tags;
                    }
                    this.a(tags);
                    return;
                }
                break;
            }
            case 514: {
                if (n2 != 1 || intent == null) {
                    break;
                }
                final Account a = ((UserAccount)intent.getParcelableExtra("account")).a;
                if (!a.name.equals(this.T.e())) {
                    this.ar.a(a);
                    return;
                }
                break;
            }
            case 261: {
                if (n2 == -1 && intent != null) {
                    this.a(0, false);
                    return;
                }
                break;
            }
            case 515: {
                if (n2 == -1 && intent != null) {
                    final DraftTweet a2 = DraftsActivity.a(intent);
                    if (a2 != null) {
                        this.ag = true;
                        this.a(a2, null, null, null, false);
                    }
                }
                this.a(1, true);
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.aF != null && this.O.getVisibility() == 0) {
            this.aF.c();
            return;
        }
        int n;
        if (this.al || this.V == 0 || this.V == -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            if (!this.l()) {
                this.ac();
                super.onBackPressed();
                return;
            }
            if (!this.g.isEmpty() || !this.o.getText().isEmpty()) {
                this.showDialog(513);
                return;
            }
            this.showDialog(516);
        }
        else {
            if (this.V == 2) {
                this.w();
                return;
            }
            final int drawerState = this.z.getDrawerState();
            int n2 = 0;
            if (drawerState == 2) {
                n2 = 1;
            }
            this.a(n2, true);
        }
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 513:
            case 514:
            case 516: {
                final com.twitter.android.composer.ac ac = new com.twitter.android.composer.ac(this, n);
                final AlertDialog$Builder setNegativeButton = new AlertDialog$Builder((Context)this).setTitle(2131297463).setMessage((CharSequence)this.getString(2131297460)).setNeutralButton(2131296810, (DialogInterface$OnClickListener)ac).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null);
                if (n != 516) {
                    setNegativeButton.setPositiveButton(2131297597, (DialogInterface$OnClickListener)ac);
                }
                return (Dialog)setNegativeButton.create();
            }
            case 515: {
                final com.twitter.android.composer.ad ad = new com.twitter.android.composer.ad(this);
                return (Dialog)new AlertDialog$Builder((Context)this).setCancelable(false).setTitle(2131297135).setMessage(2131297134).setPositiveButton(2131297133, (DialogInterface$OnClickListener)ad).setNegativeButton(2131296445, (DialogInterface$OnClickListener)ad).create();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.R != null) {
            this.R.a((y)null);
        }
        if (this.o != null) {
            this.o.setTweetBoxListener(null);
        }
        if (this.S != null) {
            this.S.a((ag)null);
        }
        SuggestionsProvider.b();
        SuggestionsProvider.c();
        if (this.ap != null) {
            new Handler(Looper.getMainLooper()).removeCallbacks(this.ap);
            this.ap = null;
        }
        if (this.aG != null) {
            this.aG.c();
        }
    }
    
    @Override
    protected void onPause() {
        this.b(this.h);
        this.ak = false;
        if (this.V == 2) {
            final View viewById = this.o.findViewById(2131886560);
            viewById.setFocusableInTouchMode(true);
            viewById.requestFocus();
        }
        super.onPause();
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.F.setVisibility(8);
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.w.setToggledOn(this.R.b().c());
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a(this.h);
        if (this.am != 0) {
            if (this.ao == null) {
                final com.twitter.library.client.p a = com.twitter.library.client.p.a();
                a.a(this.ao = new aa(this, a));
            }
            this.P.a(true, this.am);
        }
    }
    
    @Override
    protected void onResumeFragments() {
        this.ak = true;
        super.onResumeFragments();
        final boolean al = this.al;
        if (this.W != -1) {
            if (this.W != 4 || this.X != 1 || !this.z.b()) {
                this.a(this.W, false, this.X == 2 || this.W == 2);
            }
            else {
                this.a(1, false);
            }
            this.X = -1;
            this.W = -1;
        }
        this.al = al;
        this.e(this.o.hasFocus());
        ix.a("composer:complete", this.F(), ih.m).j();
        if ((this.z.b() && this.V == 1) || this.al()) {
            this.Z();
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.ak();
        bundle.putSerializable("draft_tweet", (Serializable)this.j());
        bundle.putParcelable("replied_tweet", (Parcelable)this.b);
        bundle.putBoolean("loaded_from_draft", this.ag);
        bundle.putBoolean("tweet_posted", this.ac);
        bundle.putInt("current_drawer", this.V);
        bundle.putInt("current_drawer_state", this.z.getDrawerState());
        bundle.putBoolean("show_link_hint", this.aj);
        bundle.putInt("launch_camera_mode", this.am);
        bundle.putBoolean("lifeline_alert", this.U);
        bundle.putIntArray("selection", this.o.getSelection());
        final EditImageFragment af = this.aF;
        int n = 0;
        if (af != null) {
            if (this.aF.b() == this.Q) {
                n = 1;
            }
            else {
                final gh b = this.aF.b();
                final MediaAttachmentsView q = this.q;
                n = 0;
                if (b == q) {
                    n = 2;
                }
            }
        }
        bundle.putInt("editing_media", n);
        this.au.a(bundle);
    }
    
    @Override
    protected void onStop() {
        this.ak();
        if (this.ad == 2) {
            if (this.l()) {
                this.f(false);
            }
            else if (!this.ac) {
                this.aj();
                this.ad = 0;
            }
        }
        super.onStop();
    }
    
    void p() {
        this.startActivityForResult(new Intent((Context)this, (Class)AccountsDialogActivity.class).putExtra("AccountsDialogActivity_account_name", this.T.e()), 514);
    }
    
    void q() {
        final int size = this.g.size();
        if (size == 1 && EditableMedia.a(new ArrayList(this.g.values())) == MediaType.b) {
            this.G().a(new TwitterScribeLog(this.T.g()).b(new String[] { ":composition::photo:send_photo_tweet" }));
        }
        else if (size > 1) {
            this.G().a(((TwitterScribeLog)new TwitterScribeLog(this.T.g()).b(new String[] { ":composition::multiphoto:send_photo_tweet" })).a((long)size));
        }
        this.c(false);
        this.k();
    }
    
    void r() {
        if (this.au.a()) {
            this.K.setVisibility(8);
            this.L.setVisibility(8);
            return;
        }
        this.K.setVisibility(this.av);
        this.L.setVisibility(this.aw);
    }
    
    void s() {
        if (this.V != 2) {
            this.az = (this.V == 0);
            this.a(2, true, true);
        }
        else if (this.z.getDrawerState() != 2) {
            this.z.a(true, true);
        }
    }
    
    void t() {
        if (this.u != null) {
            boolean b;
            if (!this.o.j()) {
                b = true;
            }
            else {
                b = false;
            }
            final View u = this.u;
            int visibility = 0;
            Label_0057: {
                if (!b && !this.ag && this.ah) {
                    final boolean ad = this.ad();
                    visibility = 0;
                    if (!ad) {
                        break Label_0057;
                    }
                }
                visibility = 4;
            }
            u.setVisibility(visibility);
        }
    }
    
    void u() {
        if (this.n && this.c != 0L) {
            final boolean ad = this.ad();
            final View ab = this.aB;
            int visibility = 0;
            if (!ad) {
                visibility = 4;
            }
            ab.setVisibility(visibility);
            this.p.setHeaderVisible(ad);
            return;
        }
        this.aB.setVisibility(8);
        this.p.setHeaderVisible(false);
    }
    
    @Override
    public boolean v() {
        return false;
    }
    
    @Override
    public void w() {
        int n;
        if (this.az) {
            n = 0;
        }
        else {
            n = 1;
        }
        this.a(n, true);
        this.az = false;
        this.q.c();
    }
    
    @Override
    public void x() {
        this.as = true;
        this.ai();
    }
    
    void y() {
        if (this.V == 4) {
            this.a(1, true);
        }
    }
    
    void z() {
        final GeoTagState b = this.R.b();
        String fullName;
        if (b.c()) {
            fullName = b.e().fullName;
        }
        else {
            fullName = null;
        }
        final TwitterUser f = this.T.f();
        final TextView a = this.A;
        final ImageView j = this.J;
        if (this.U && f != null) {
            final String name = f.name;
            String text;
            if (fullName != null) {
                text = this.getString(2131297137, new Object[] { name, fullName });
            }
            else {
                text = this.getString(2131297136, new Object[] { name });
            }
            a.setText((CharSequence)text);
            a.setVisibility(0);
            j.setImageResource(2130838722);
            j.setVisibility(0);
        }
        else if (fullName != null) {
            a.setText((CharSequence)fullName);
            a.setVisibility(0);
            j.setImageResource(2130839383);
            j.setVisibility(0);
        }
        else {
            a.setText((CharSequence)"");
            a.setVisibility(8);
            j.setVisibility(8);
        }
        this.o.i();
    }
}
