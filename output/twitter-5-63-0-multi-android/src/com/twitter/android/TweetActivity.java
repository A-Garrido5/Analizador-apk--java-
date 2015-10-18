// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import com.twitter.android.widget.RelatedTweetsFeedbackDialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper$DesignTreatment;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.composer.bo;
import android.os.Parcelable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.util.bq;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.provider.bf;
import com.twitter.android.composer.au;
import com.twitter.library.api.timeline.ah;
import android.content.ContentUris;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;
import com.twitter.android.composer.bh;
import android.content.DialogInterface;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.text.TextUtils;
import com.twitter.android.util.bd;
import java.util.Collections;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.ca;
import com.twitter.library.provider.DraftTweet;
import android.widget.Toast;
import com.twitter.library.provider.ae;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.media.model.MediaType;
import com.twitter.android.util.bg;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.android.client.c;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Bundle;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import java.util.List;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.media.manager.k;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import com.twitter.android.widget.GalleryGridFragment;
import android.view.View;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.service.z;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.android.composer.TweetBox;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import com.twitter.library.api.EntityScribeContent;
import android.widget.RelativeLayout;
import com.twitter.library.provider.Tweet;
import android.net.Uri;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.ui.dialog.e;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.er;
import com.twitter.android.widget.co;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public class TweetActivity extends ActivityWithProgress implements LoaderManager$LoaderCallbacks, View$OnClickListener, AttachMediaListener, co, er, wk, wn, a, e
{
    private MediaImageView A;
    private EditableMedia B;
    private boolean F;
    private long G;
    private int H;
    private int I;
    private String J;
    private TwitterScribeItem K;
    private long L;
    private boolean M;
    private boolean N;
    private boolean O;
    private long P;
    private Uri Q;
    private Tweet R;
    private RelativeLayout S;
    private boolean T;
    private EntityScribeContent U;
    Session c;
    as d;
    Tweet e;
    TweetFragment f;
    TweetBox g;
    TextView h;
    Button i;
    z j;
    private long k;
    private boolean l;
    private boolean m;
    private Uri n;
    private String o;
    private String[] p;
    private boolean q;
    private TwitterScribeAssociation r;
    private String s;
    private int t;
    private String u;
    private PhotoSelectFragment v;
    private View w;
    private GalleryGridFragment x;
    private RelativeLayout y;
    private ImageView z;
    
    public TweetActivity() {
        this.N = false;
        this.O = false;
        this.P = -1L;
    }
    
    private GalleryGridFragment A() {
        final Resources resources = this.getResources();
        final boolean a = gr.a();
        int n;
        if (a) {
            n = resources.getColor(2131689483);
        }
        else {
            n = resources.getColor(2131689515);
        }
        final GalleryGridFragment b = GalleryGridFragment.b(n, resources.getColor(2131689634), resources.getDimensionPixelSize(2131558587), false, 0, a);
        this.getSupportFragmentManager().beginTransaction().add(2131887292, b, "gallery").commit();
        return b;
    }
    
    private void X() {
        this.w.setVisibility(8);
        this.y.setVisibility(8);
        this.z.setVisibility(0);
        this.A.a((k)null);
        if (this.B != null) {
            this.B.g();
            this.B = null;
        }
        this.g.f();
    }
    
    private void Y() {
        this.a(new oe((Context)this, this.c).a(this.e.C), 4);
    }
    
    private void Z() {
        this.a(new of((Context)this, this.c).a(this.e.C), 5);
    }
    
    private void a(final long n, final List list, final Set set) {
        this.a(new i((Context)this, this.c, n, this.c.g(), list, set), 3);
    }
    
    private void a(final Bundle bundle) {
        if (bundle != null) {
            final EditableMedia editableMedia = (EditableMedia)bundle.getParcelable("editable_media");
            if (editableMedia != null) {
                this.v.a(editableMedia, this);
            }
            this.x = (GalleryGridFragment)this.getSupportFragmentManager().findFragmentByTag("gallery");
        }
        if (this.x == null) {
            this.x = this.A();
        }
    }
    
    private void a(final String s, final int n, final int n2, final int n3) {
        this.a(s, this.getString(n), n2);
        this.S.setOnClickListener((View$OnClickListener)new vr(this, s, n3));
    }
    
    private void a(final String s, final String text, final int imageResource) {
        this.G().a(this.U().g(), "tweet:notification_landing", s, ":impression");
        this.N = true;
        this.S.setVisibility(0);
        ((TypefacesTextView)this.S.findViewById(2131887358)).setText((CharSequence)text);
        ((ImageView)this.findViewById(2131887357)).setImageResource(imageResource);
    }
    
    private void b(final View view) {
        this.m = (view.getRootView().getHeight() - view.getHeight() > this.getResources().getDimensionPixelSize(2131558941));
        this.f.r();
        if (this.m) {
            if (this.w != null && this.w.isShown()) {
                this.w.setVisibility(8);
            }
        }
        else if (this.F) {
            this.w.setVisibility(0);
            this.F = false;
        }
    }
    
    private static String[] b(final Uri uri) {
        final List pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() > 0 && "status_groups_retweets_view".equals(pathSegments.get(0))) {
            return Tweet.b;
        }
        return Tweet.a;
    }
    
    private void c(final ToolBar toolBar) {
        final Session u = this.U();
        if (u.d()) {
            final jx a = toolBar.a(2131887471);
            if (a != null) {
                a.b(this.e != null && ag.a(com.twitter.library.media.util.q.a(this.e, Size.a), u.g()));
            }
        }
    }
    
    private void k() {
        final LayoutInflater layoutInflater = this.getLayoutInflater();
        final View inflate = layoutInflater.inflate(2130968781, (ViewGroup)null);
        final View inflate2 = layoutInflater.inflate(2130968782, (ViewGroup)null);
        inflate.setOnClickListener((View$OnClickListener)new vo(this));
        inflate2.setOnClickListener((View$OnClickListener)new vp(this));
        final ImageView imageView = (ImageView)inflate.findViewById(2131886127);
        final ImageView imageView2 = (ImageView)inflate2.findViewById(2131886127);
        View[] array;
        if (gr.a()) {
            inflate.setBackgroundColor(this.getResources().getColor(2131689630));
            imageView.setImageResource(2130837678);
            inflate2.setBackgroundColor(this.getResources().getColor(2131689630));
            imageView2.setImageResource(2130837680);
            if (gr.e()) {
                final View inflate3 = layoutInflater.inflate(2130968783, (ViewGroup)null);
                inflate3.setOnClickListener((View$OnClickListener)new vq(this));
                array = new View[] { inflate2, inflate3, inflate };
            }
            else {
                array = new View[] { inflate2, inflate };
            }
        }
        else {
            inflate.setBackgroundColor(this.getResources().getColor(2131689516));
            inflate2.setBackgroundColor(this.getResources().getColor(2131689516));
            imageView.setImageResource(2130838840);
            imageView2.setImageResource(2130838846);
            array = new View[] { inflate, inflate2 };
        }
        this.x.a(array);
        this.x.a(this);
    }
    
    private void l() {
        if (!com.twitter.library.featureswitch.d.f("vit_show_push_notif_context_enabled")) {
            this.N = false;
            return;
        }
        final Uri data = this.getIntent().getData();
        final String b = bg.b(data);
        if (!bg.a(b)) {
            this.N = false;
            return;
        }
        this.S = (RelativeLayout)this.findViewById(2131887309);
        switch (b) {
            default: {
                this.N = false;
                this.S.setVisibility(8);
            }
            case "r": {
                this.a("vit_retweet_spike", 2131298137, 2130838681, 12);
            }
            case "f": {
                this.a("vit_favorite_spike", 2131298124, 2130838674, 11);
            }
            case "e": {
                this.P = bg.a(data);
                if (this.P != -1L) {
                    this.N = true;
                }
                this.S.setVisibility(8);
            }
        }
    }
    
    private void m() {
        if (this.R == null) {
            this.N = false;
            return;
        }
        this.a("vit_tweet_embedded", this.getString(2131298138, new Object[] { this.R.L }), 2130839286);
        this.S.setOnClickListener((View$OnClickListener)new vs(this));
    }
    
    private void n() {
        this.findViewById(2131886947).setClickable(true);
        this.findViewById(2131887293).setBackgroundDrawable(this.getResources().getDrawable(2130837692));
        this.A = (MediaImageView)this.findViewById(2131886886);
        this.y = (RelativeLayout)this.findViewById(2131886885);
        this.z = (ImageView)this.findViewById(2131886884);
        this.w = this.findViewById(2131887291);
        this.v = PhotoSelectFragment.a(this, this, "reply_composition", MediaType.g, this.U());
        ((ImageView)this.findViewById(2131886887)).setOnClickListener((View$OnClickListener)new vt(this));
        this.z.setOnClickListener((View$OnClickListener)new vu(this));
        this.A.setOnClickListener((View$OnClickListener)new vm(this));
    }
    
    private void p() {
        final TweetBox g = this.g;
        g.setImeActionLabel(this.getText(2131297456));
        if (this.e != null) {
            g.setHintText(this.getResources().getString(2131296705, new Object[] { this.e.a() }));
            g.setRepliedTweet(this.e);
        }
    }
    
    private void q() {
        this.g.a(false);
        this.g.a("", null);
        this.g.clearFocus();
        this.p();
        this.X();
        this.l = false;
        this.findViewById(2131887106).setVisibility(8);
    }
    
    private void r() {
        this.a(new pe((Context)this, this.U(), this.e.C, this.e.j).c(-1));
    }
    
    private void s() {
        this.G().a(this.c.g(), "tweet", null, Tweet.b(this.e), "block_dialog", "block");
        this.t();
    }
    
    private void t() {
        this.a(new od((Context)this, this.U(), this.e.C, this.e.j, 1), 6);
    }
    
    private void u() {
        if (this.e != null) {
            this.n = ae.a(this.e.E, this.c.g());
            this.T = true;
            this.getSupportLoaderManager().initLoader(0, null, this);
        }
        else {
            final Uri data = this.getIntent().getData();
            if (data == null) {
                this.x();
                return;
            }
            final String type = this.getContentResolver().getType(data);
            if ("twitter".equals(data.getScheme())) {
                long long1;
                try {
                    String s = data.getQueryParameter("status_id");
                    if (s == null) {
                        s = data.getQueryParameter("id");
                    }
                    long1 = Long.parseLong(s);
                    if (long1 < 0L) {
                        throw new NumberFormatException();
                    }
                }
                catch (NumberFormatException ex) {
                    this.x();
                    return;
                }
                this.n = ae.a(long1, this.c.g());
                this.getSupportLoaderManager().initLoader(0, null, this);
                if (this.P != -1L) {
                    this.Q = ae.a(this.P, this.c.g());
                    this.getSupportLoaderManager().initLoader(4, null, this);
                }
            }
            else {
                if ("vnd.android.cursor.item/vnd.twitter.android.statuses".equals(type)) {
                    this.n = data;
                    this.getSupportLoaderManager().initLoader(0, null, this);
                    return;
                }
                this.x();
            }
        }
    }
    
    private void x() {
        Toast.makeText((Context)this, 2131298001, 1).show();
        this.finish();
    }
    
    private void y() {
        if (this.e == null || this.f.q == null) {
            Toast.makeText((Context)this, 2131298001, 1).show();
        }
        else {
            ca.a(this.getApplicationContext(), this.c, (DraftTweet)new com.twitter.library.provider.e().a(this.g.getText()).a(this.z()).b(this.f.q.Q).a(this.e.j).f());
            this.f.w();
            this.G().a(new TwitterScribeLog(this.c.g()).g().b(new String[] { "tweet:composition:::send_reply" }));
            this.g.a(false);
            this.B = null;
            if (!kg.a((Context)this)) {
                this.q();
            }
        }
    }
    
    private List z() {
        if (this.B != null) {
            return Collections.singletonList(this.B);
        }
        return null;
    }
    
    public int a(final ToolBar toolBar) {
        boolean b = true;
        final Session u = this.U();
        final long g = u.g();
        final boolean b2 = this.e != null && this.e.C != g && b;
        final boolean b3 = this.e != null && com.twitter.library.api.z.e(this.e.r) && b;
        final jx a = toolBar.a(2131887452);
        if (a != null) {
            a.h(10);
            final boolean a2 = bd.a(this.e);
            if (b2 && !a2 && !b3) {
                if (this.e != null && com.twitter.library.api.z.d(this.e.r) && b) {
                    a.a(this.getString(2131298028));
                }
                else {
                    a.a(this.getString(2131297283));
                }
                a.b(b);
            }
            else {
                a.b(false);
            }
        }
        final jx a3 = toolBar.a(2131887400);
        if (a3 != null) {
            a3.h(11);
            int n;
            if (b3) {
                n = 2131298089;
            }
            else {
                n = 2131296376;
            }
            a3.d(n);
            a3.b(b2);
        }
        final jx a4 = toolBar.a(2131887469);
        if (a4 != null) {
            a4.h(12);
            int n2;
            if (this.e != null && this.e.m() && b) {
                n2 = 2131297553;
            }
            else {
                n2 = 2131297552;
            }
            a4.d(n2);
            a4.b(!kg.a((Context)this) && b2 && b);
        }
        this.c(toolBar);
        if (u.d()) {
            final boolean b4 = this.e != null && !this.e.P && com.twitter.library.featureswitch.d.f("custom_timelines_curate_enabled") && b;
            toolBar.a(2131887415).b(b4);
            final jx a5 = toolBar.a(2131887416);
            if (!b4 || TextUtils.isEmpty((CharSequence)this.u)) {
                b = false;
            }
            a5.b(b);
        }
        final jx a6 = toolBar.a(2131886226);
        if (a6 != null) {
            a6.h(13);
        }
        return super.a(toolBar);
    }
    
    public View a(final View view) {
        return view.findViewById(2131886241);
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        if (kg.a((Context)this)) {
            a.c(2130969164);
            a.d(false);
            a.a(4);
            return a;
        }
        a.c(2130969159);
        return a;
    }
    
    public void a(final int n, final y y) {
        if (this.M) {
            final aa aa = (aa)y.l().b();
            switch (n) {
                case 10:
                case 11: {
                    break;
                }
                default: {}
                case 0: {
                    if (aa.a()) {
                        this.getSupportLoaderManager().restartLoader(0, null, this);
                        return;
                    }
                    Toast.makeText((Context)this, 2131298001, 1).show();
                    this.finish();
                }
                case 1: {
                    if (aa.a()) {
                        Toast.makeText((Context)this, 2131296307, 1).show();
                        return;
                    }
                    Toast.makeText((Context)this, 2131296306, 1).show();
                }
                case 2: {
                    if (aa.a()) {
                        Toast.makeText((Context)this, 2131297550, 1).show();
                        this.finish();
                        return;
                    }
                    Toast.makeText((Context)this, 2131297548, 1).show();
                }
                case 3: {
                    if (this.e.Q == ((i)y).b()) {
                        int n2;
                        if (aa.a()) {
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
                case 4: {
                    if (aa.a()) {
                        this.finish();
                        return;
                    }
                    break;
                }
                case 5: {
                    if (aa.a()) {
                        this.e.r = com.twitter.library.api.z.b(this.e.r, 8192);
                        this.Q();
                        return;
                    }
                    break;
                }
                case 6: {
                    if (aa.a()) {
                        this.finish();
                        return;
                    }
                    break;
                }
                case 7: {
                    if (aa.a()) {
                        this.e.r = com.twitter.library.api.z.b(this.e.r, 4);
                        this.Q();
                        return;
                    }
                    break;
                }
                case 8: {
                    if (aa.a()) {
                        this.getSupportLoaderManager().restartLoader(4, null, this);
                        return;
                    }
                    this.G().a(this.U().g(), "tweet:notification_landing:vit_tweet_embedded::error");
                    Toast.makeText((Context)this, 2131298001, 1).show();
                    this.finish();
                }
                case 9: {
                    String s;
                    if (((aa)((com.twitter.library.api.search.e)y).l().b()).a()) {
                        s = "Feedback registered successfully. Thanks!";
                    }
                    else {
                        s = "There was error registering your feedback. Sorry!";
                    }
                    Toast.makeText((Context)this, (CharSequence)s, 1).show();
                }
            }
        }
    }
    
    public void a(final int title, final boolean b) {
        if (b) {
            this.setTitle(title);
            return;
        }
        this.setTitle(2131297985);
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        final String b = Tweet.b(this.e);
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.d.a(new bh(this.getApplicationContext(), this.c, (DraftTweet)new com.twitter.library.provider.e().a(this.g.getText()).b(this.e.D).a(this.z()).a(this.e.j).f(), false));
                    this.setResult(0);
                    this.G().a(this.c.g(), "tweet", "composition", "cancel_reply_sheet", "save_draft", "click");
                    this.finish();
                    return;
                }
                if (n2 == -3) {
                    this.setResult(0);
                    this.G().a(this.c.g(), "tweet", "composition", "cancel_reply_sheet", "dont_save", "click");
                    this.finish();
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == -1) {
                    this.a(new com.twitter.library.api.timeline.y((Context)this, this.c, this.u, this.e.D, this.e.j).g(2), 2);
                    this.G().a(this.c.g(), this.r.a(), this.r.b(), b, null, "remove_from_timeline");
                    return;
                }
                break;
            }
            case 3: {
                if (n2 == -1) {
                    this.M().a(2131887471).b(false);
                    this.a(this.e.Q, com.twitter.library.media.util.q.f(this.e.G.media), Collections.singleton(this.c.g()));
                    this.G().a(new TwitterScribeLog(this.c.g()).b(new String[] { "tweet::tweet:remove_my_media_tag:click" }));
                    return;
                }
                break;
            }
            case 4: {
                if (n2 == -1) {
                    this.G().a(this.c.g(), "tweet", null, b, "mute_dialog", "mute_user");
                    this.Y();
                    return;
                }
                this.G().a(this.c.g(), "tweet", null, b, "mute_dialog", "cancel");
            }
            case 5: {
                if (n2 == -1) {
                    this.s();
                    return;
                }
                this.G().a(this.c.g(), "tweet", null, b, "block_dialog", "cancel");
            }
            case 6: {
                if (n2 == -1) {
                    this.G().a(this.c.g(), "tweet", null, b, "unblock_dialog", "unblock");
                    this.a(new od((Context)this, this.U(), this.e.C, this.e.j, 3), 7);
                    return;
                }
                this.G().a(this.c.g(), "tweet", null, b, "unblock_dialog", "cancel");
            }
        }
    }
    
    public void a(final Intent intent, final int n, final Bundle bundle) {
        ActivityCompat.startActivityForResult(this, intent, n, bundle);
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final Session c = this.c;
        if (loader.getId() == 0) {
            if (this.e == null || this.T) {
                Tweet a = null;
                if (cursor != null) {
                    final boolean moveToFirst = cursor.moveToFirst();
                    a = null;
                    if (moveToFirst) {
                        a = new ad(cursor).a();
                        if (a.C == 0L && TextUtils.isEmpty((CharSequence)a.F)) {
                            ErrorReporter.a(new com.twitter.errorreporter.a().a("tweet.statusId", a.D).a("tweet.groupType", a.aa).a("tweet.content", a.y).a("activity.uri", this.n.toString()).a(new IllegalStateException("UserId of tweet is 0 and UserName is empty")));
                            a = null;
                        }
                    }
                }
                if (a != null) {
                    a.a(this.U);
                    this.f.e(a.D);
                    this.f.a(a, c, this.s, this.t, this.H, this.I, this.J, this.G, this.K, this.L, this.N);
                    this.T = false;
                    this.e = a;
                    this.Q();
                    if (!kg.a((Context)this)) {
                        this.p();
                    }
                }
                else {
                    if (!this.q) {
                        this.a(new ah((Context)this, this.c, ContentUris.parseId(this.n)), 0);
                        this.q = true;
                        return;
                    }
                    Toast.makeText((Context)this, 2131298001, 1).show();
                    this.finish();
                }
            }
            else if (cursor != null && cursor.moveToFirst()) {
                (this.e = new ad(cursor).a()).a(this.U);
                if (this.f != null) {
                    this.f.a(this.e);
                    this.f.B();
                }
            }
        }
        else if (loader.getId() == 4) {
            if (cursor != null && cursor.moveToFirst()) {
                this.R = new ad(cursor).a();
                this.m();
                return;
            }
            if (!this.O) {
                this.O = true;
                this.a(new ah((Context)this, this.c, ContentUris.parseId(this.Q)), 8);
                this.G().a(this.U().g(), "tweet:notification_landing:vit_tweet_embedded::loading");
                return;
            }
            this.G().a(this.U().g(), "tweet:notification_landing:vit_tweet_embedded::error");
            Toast.makeText((Context)this, 2131298001, 1).show();
            this.finish();
        }
    }
    
    public void a(final AttachMediaListener$MediaAttachFailure attachMediaListener$MediaAttachFailure, final Uri uri) {
    }
    
    public void a(final EditableMedia editableMedia, final View view) {
        this.v.a(editableMedia, null, this);
    }
    
    public void a(final Tweet tweet) {
        if (!kg.a((Context)this)) {
            final com.twitter.android.composer.au a = com.twitter.android.composer.au.a((Context)this).a(tweet).a(this.c.e()).a(this.g.getText(), this.g.getSelection());
            if (this.v != null) {
                this.v.a();
            }
            this.q();
            a.a(this, 104);
        }
    }
    
    public void a(final String s, final String s2, final Bundle bundle) {
        this.a(new com.twitter.library.api.search.e((Context)this, this.U(), this.e.D, 0L, "should", s, s2), 9);
    }
    
    public void a(final boolean b) {
    }
    
    public boolean a(final EditableMedia editableMedia) {
        return true;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        if (kg.a(this)) {
            toolBar.setDisplayShowHomeAsUpEnabled(false);
        }
        final Tweet e = this.e;
        int ab = 0;
        if (e != null) {
            ab = this.e.ab;
        }
        if (this.U().d()) {
            jv.a(2131951628, toolBar);
            jv.a(2131951649, toolBar);
            if (bf.a(ab)) {
                jv.a(2131951642, toolBar);
            }
            if (bf.b(ab)) {
                jv.a(2131951617, toolBar);
            }
            if (bf.c(ab)) {
                jv.a(2131951650, toolBar);
            }
        }
        jv.a(2131951626, toolBar);
        return true;
    }
    
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131886126) {
            if ((this.g != null && this.g.c()) || this.B != null) {
                this.h();
                return true;
            }
        }
        else if (a == 2131887471) {
            PromptDialogFragment.b(3).d(2131297547).h(2131297362).j(2131296445).a(this).a(this.getSupportFragmentManager());
        }
        else {
            if (a == 2131887415) {
                this.startActivityForResult(new Intent((Context)this, (Class)AddToCollectionActivity.class).setAction("android.intent.action.PICK").putExtra("user_id", this.U().g()), 103);
                return true;
            }
            if (a == 2131887416) {
                PromptDialogFragment.b(2).c(2131297546).d(2131297549).h(2131298158).j(2131297303).a(this).a(this.getSupportFragmentManager());
            }
            else {
                if (a == 2131887452) {
                    final boolean d = com.twitter.library.api.z.d(this.e.r);
                    final String af = this.e.af();
                    final String f = this.e.F;
                    if (d) {
                        this.G().a(this.c.g(), "tweet", null, af, "unmute_dialog", "open");
                        this.G().a(this.c.g(), "tweet", null, af, "unmute_dialog", "unmute_user");
                        this.Z();
                    }
                    else {
                        this.G().a(new TwitterScribeLog(this.c.g()).b(new String[] { "tweet::tweet:mute_dialog:open" }));
                        if (!bd.a((Context)this, f, this.e.r, 4, this.getSupportFragmentManager(), null)) {
                            this.G().a(this.c.g(), "tweet", null, af, "mute_dialog", "mute_user");
                            this.Y();
                        }
                    }
                    return true;
                }
                if (a == 2131887400) {
                    final boolean e = com.twitter.library.api.z.e(this.e.r);
                    final String af2 = this.e.af();
                    if (e) {
                        this.G().a(this.c.g(), "tweet", null, af2, "unblock_dialog", "impression");
                        bd.b((Context)this, this.e.F, 6, this.getSupportFragmentManager());
                    }
                    else {
                        this.G().a(this.c.g(), "tweet", null, af2, "block_dialog", "impression");
                        bd.a((Context)this, this.e.F, 5, this.getSupportFragmentManager());
                    }
                }
                else {
                    if (a == 2131887469) {
                        long n;
                        if (this.e.g) {
                            n = this.e.C;
                        }
                        else {
                            n = this.e.f;
                        }
                        this.startActivityForResult(new Intent((Context)this, (Class)ReportFlowWebViewActivity.class).putExtra("spammer_id", n).putExtra("status_id", this.e.Q).putExtra("friendship", this.e.r).putExtra("is_media", this.e.i()).putExtra("is_promoted", this.e.m()), 101);
                        return true;
                    }
                    if (a == 2131887413) {
                        this.G().a(this.c.g(), "tweet", null, this.e.af(), "link", "copy");
                        bq.b((Context)this, this.e.ai());
                        Toast.makeText((Context)this, 2131296728, 0).show();
                        return true;
                    }
                }
            }
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final Intent intent = this.getIntent();
        this.M = true;
        com.twitter.library.metrics.e.b("tweet:focal:complete", this.F(), ih.n).i();
        com.twitter.library.metrics.e.b("tweet:complete", this.F(), ih.n).i();
        this.H().a("tweet");
        final View viewById = this.findViewById(2131886399);
        viewById.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new vl(this, viewById));
        this.s = intent.getStringExtra("reason");
        this.t = intent.getIntExtra("reason_icon_id", 0);
        this.h = (TextView)this.findViewById(2131886578);
        this.i = (Button)this.findViewById(2131886596);
        this.U = (EntityScribeContent)intent.getSerializableExtra("tw_scribe_content");
        if (this.i != null) {
            this.i.setOnClickListener((View$OnClickListener)this);
        }
        this.G = intent.getLongExtra("activity_row_id", -1L);
        this.K = (TwitterScribeItem)intent.getParcelableExtra("scribe_item");
        this.L = intent.getLongExtra("magic_rec_id", -1L);
        this.H = intent.getIntExtra("social_context_type", -1);
        this.I = intent.getIntExtra("social_context_user_count", -1);
        this.J = intent.getStringExtra("social_context_user_name");
        this.r = (TwitterScribeAssociation)intent.getParcelableExtra("association");
        final int intExtra = intent.getIntExtra("type", -1);
        final long longExtra = intent.getLongExtra("tag", -1L);
        if (intExtra != -1) {
            if (longExtra != -1L) {
                this.o = "type=? AND tag=?";
                this.p = new String[] { String.valueOf(intExtra), String.valueOf(longExtra) };
            }
            else {
                this.o = "type=?";
                this.p = new String[] { String.valueOf(intExtra) };
            }
        }
        this.g = (TweetBox)this.findViewById(2131886559);
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        TweetFragment f = (TweetFragment)supportFragmentManager.findFragmentByTag("tweet_fragment");
        if (f == null) {
            f = new TweetFragment();
            beginTransaction.add(2131886241, f, "tweet_fragment");
            f.getArguments().putParcelable("source_association", (Parcelable)this.r);
        }
        beginTransaction.commit();
        this.f = f;
        this.u = intent.getStringExtra("timeline_id");
        if ("cat_autodevicefollow.".equalsIgnoreCase(intent.getStringExtra("routed_from"))) {
            this.G().a(new TwitterScribeLog(this.U().g()).b(new String[] { "tweet:notification_landing::device_follow:impression" }));
        }
        this.l();
        if (this.g != null) {
            this.g.setTweetBoxListener(new vn(this));
        }
        this.a(0, false);
        final c g = this.G();
        final Session u = this.U();
        this.d = as.a(this.getApplicationContext());
        this.a(this.j = new vv(this, null));
        if (bundle != null) {
            this.e = (Tweet)bundle.getParcelable("t");
            this.R = (Tweet)bundle.getParcelable("c");
            if (this.R != null) {
                this.m();
            }
            this.l = bundle.getBoolean("sticky", false);
        }
        else {
            kg.b(this, "tweet");
            this.e = (Tweet)intent.getParcelableExtra("tw");
            g.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(u.g()).a(this.getApplicationContext(), this.e, this.r, null).b(new String[] { ScribeLog.a("tweet:", Tweet.b(this.e), ":impression") })).c(new String[] { intent.getStringExtra("ref_event") })).a(this.r)).a(this.K));
        }
        if (this.e != null) {
            this.f.e(this.e.D);
        }
        if (this.l) {
            this.findViewById(2131887106).setVisibility(0);
        }
        this.f.a((wk)this);
        if (RelatedTweetsExperimentHelper.f() == RelatedTweetsExperimentHelper$DesignTreatment.c) {
            this.f.a((wn)this);
        }
        if (!kg.a((Context)this)) {
            this.p();
            this.n();
            this.a(bundle);
            this.k();
        }
    }
    
    public void b(final EditableMedia b) {
        this.g.e();
        if (this.B != null && !this.B.a(b)) {
            b.g();
        }
        this.B = b;
        this.w.setVisibility(8);
        this.y.setVisibility(0);
        this.A.a(b.b(this.getApplicationContext()));
        this.z.setVisibility(8);
    }
    
    public void c(final EditableMedia editableMedia) {
        int n;
        if (editableMedia.e() == MediaType.d) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.v.a(editableMedia, null, this);
            return;
        }
        this.v.a(editableMedia, this);
    }
    
    boolean c_(final Uri uri) {
        try {
            ContentUris.parseId(uri);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public void h() {
        PromptDialogFragment.b(1).c(2131297463).d(2131297460).h(2131297597).i(2131296810).j(2131296445).a(this).a(this.getSupportFragmentManager());
    }
    
    public void i() {
        final RelatedTweetsFeedbackDialogFragment relatedTweetsFeedbackDialogFragment = new RelatedTweetsFeedbackDialogFragment((Context)this, null, 2131361826);
        relatedTweetsFeedbackDialogFragment.a(this);
        relatedTweetsFeedbackDialogFragment.show(this.getSupportFragmentManager(), null);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        Label_0048: {
            switch (0xFFFF & n) {
                case 101: {
                    switch (n2) {
                        default: {
                            break Label_0048;
                        }
                        case -1: {
                            this.setResult(10);
                            this.finish();
                            break Label_0048;
                        }
                        case 1: {
                            this.r();
                            this.setResult(10);
                            this.finish();
                            break Label_0048;
                        }
                        case 2: {
                            this.Y();
                            this.setResult(10);
                            this.finish();
                            break Label_0048;
                        }
                        case 3: {
                            this.t();
                            this.setResult(10);
                            this.finish();
                            break Label_0048;
                        }
                    }
                    break;
                }
                case 103: {
                    if (-1 == n2) {
                        this.a(new com.twitter.library.api.timeline.y((Context)this, this.c, intent.getStringExtra("result_timeline_id"), this.e.D, this.e.j).g(1), 1);
                        this.G().a(this.c.g(), this.r.a(), this.r.b(), this.e.af(), null, "add_to_timeline");
                        break;
                    }
                    break;
                }
                case 3: {
                    if (10 == n2) {
                        this.setResult(10);
                        this.finish();
                        break;
                    }
                    if (1 == n2 && intent.hasExtra("status_id")) {
                        this.f.d(intent.getLongExtra("status_id", 0L));
                        break;
                    }
                    break;
                }
                case 1: {
                    if (intent != null && intent.hasExtra("deleted") && this.e != null && this.e.Q == intent.getLongExtra("deleted", 0L)) {
                        this.finish();
                        break;
                    }
                    break;
                }
            }
        }
        super.onActivityResult(n, n2, intent);
        if (this.v != null) {
            this.v.a(n, n2, intent, this);
        }
    }
    
    public void onBackPressed() {
        if (this.w != null && this.w.isShown()) {
            this.w.setVisibility(8);
            return;
        }
        if ((this.g != null && this.g.c()) || this.B != null) {
            this.h();
            return;
        }
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        this.y();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        if (n == 0) {
            if (!this.c_(this.n)) {
                this.x();
                return null;
            }
            return new CursorLoader((Context)this, this.n, b(this.n), this.o, this.p, null);
        }
        else {
            if (n != 4) {
                this.x();
                return null;
            }
            if (!this.c_(this.Q)) {
                this.x();
                return null;
            }
            return new CursorLoader((Context)this, this.Q, b(this.Q), null, null, null);
        }
    }
    
    public void onDestroy() {
        this.M = false;
        super.onDestroy();
        this.b(this.j);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    protected void onPause() {
        super.onPause();
        this.G().a(((TwitterScribeLog)new TwitterScribeLog(this.c.g()).b(new String[] { "tweet::::navigate" })).a(System.currentTimeMillis() - this.k));
    }
    
    public void onResume() {
        super.onResume();
        this.k = System.currentTimeMillis();
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("t", (Parcelable)this.e);
        bundle.putParcelable("editable_media", (Parcelable)this.B);
        bundle.putBoolean("sticky", this.l);
        if (this.R != null) {
            bundle.putParcelable("c", (Parcelable)this.R);
        }
    }
    
    public void onStart() {
        super.onStart();
        if (this.c == null) {
            this.c = this.U();
            this.u();
        }
    }
    
    public void w() {
    }
    
    public void y_() {
    }
}
