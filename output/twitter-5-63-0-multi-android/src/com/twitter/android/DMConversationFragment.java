// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.library.provider.al;
import android.support.v4.content.CursorLoader;
import com.twitter.android.client.x;
import java.util.HashSet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.res.Resources;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.model.MediaType;
import android.app.Activity;
import com.twitter.library.api.conversations.v;
import android.text.TextUtils;
import com.twitter.library.api.conversations.ai;
import com.twitter.library.api.conversations.bg;
import com.twitter.library.platform.d;
import android.view.KeyEvent;
import com.twitter.util.f;
import com.twitter.library.api.conversations.DMMessageEntry;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.media.manager.j;
import java.util.List;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.conversations.au;
import com.twitter.library.api.conversations.s;
import android.support.v4.content.Loader;
import com.twitter.library.client.Session;
import com.twitter.library.api.conversations.bb;
import android.content.DialogInterface;
import com.twitter.library.api.conversations.ag;
import java.util.Set;
import com.twitter.library.api.conversations.aw;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.conversations.ad;
import com.twitter.library.api.conversations.af;
import com.twitter.android.dialog.RateLimitDialogFragmentActivity;
import com.twitter.library.api.conversations.bd;
import com.twitter.library.service.aa;
import android.view.LayoutInflater;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.bc;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.ListAdapter;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;
import android.database.Cursor;
import com.twitter.library.widget.ae;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView$OnItemLongClickListener;
import com.twitter.library.util.bj;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.content.Intent;
import android.widget.Toast;
import com.twitter.library.api.conversations.av;
import com.twitter.android.metrics.c;
import java.util.UUID;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.view.u;
import android.text.SpannableStringBuilder;
import com.twitter.library.media.manager.k;
import com.twitter.library.service.y;
import com.twitter.library.widget.PageableListView;
import android.content.Context;
import com.twitter.library.api.conversations.w;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import com.twitter.library.view.QuoteView;
import android.app.ProgressDialog;
import com.twitter.android.composer.TweetBox;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.twitter.library.media.widget.MediaImageView;
import android.net.Uri;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.aq;
import android.view.View;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.library.media.util.a;
import com.twitter.android.composer.bo;
import com.twitter.android.client.aj;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;

public class DMConversationFragment extends TwitterListFragment implements View$OnClickListener, AttachMediaListener, aj, bo, cs, dr, pz, a, b, e
{
    private String A;
    private boolean B;
    private boolean C;
    private long[] D;
    private boolean E;
    private QuotedTweetData F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private View L;
    private boolean M;
    private final com.twitter.library.client.aq N;
    private boolean O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    PromptDialogFragment a;
    private yf b;
    private long c;
    private String d;
    private String e;
    private PhotoSelectFragment f;
    private EditableMedia g;
    private Uri h;
    private Uri i;
    private boolean j;
    private MediaImageView k;
    private RelativeLayout l;
    private ImageView m;
    private Button n;
    private TextView o;
    private TweetBox p;
    private ProgressDialog q;
    private QuoteView r;
    private ViewGroup s;
    private LinearLayout t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    public DMConversationFragment() {
        this.c = -1L;
        this.C = false;
        this.N = new com.twitter.library.client.aq(new dk(this), 30000L);
    }
    
    private void B() {
        final w w = new w((Context)this.getActivity(), this.aF(), this.d);
        ((PageableListView)this.Y()).a(true);
        this.u = true;
        this.a(w, 7, 0);
    }
    
    private void F() {
        this.p.a("", null);
        this.G();
        this.H();
    }
    
    private void G() {
        if (this.F != null) {
            this.m.setVisibility(8);
            return;
        }
        this.k.a((k)null);
        this.m.setVisibility(0);
        this.m.setImageResource(2130838844);
        this.l.setVisibility(8);
        this.p.f();
        this.p.i();
    }
    
    private void H() {
        this.s.setVisibility(8);
        this.r.setVisibility(8);
        this.r.a();
        this.F = null;
        this.p.i();
    }
    
    private void I() {
        if (!this.x) {
            final LinearLayout t = this.t;
            int visibility;
            if (this.z) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            t.setVisibility(visibility);
            if (!this.z) {
                this.Y().removeFooterView(this.L);
                this.M = false;
                return;
            }
            final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)this.getString(2131296866));
            text.append((CharSequence)" ");
            final int length = text.length();
            text.append((CharSequence)this.getString(2131297130));
            final int color = this.getResources().getColor(2131689600);
            text.setSpan((Object)new dp(this, color, color, true), length, text.length(), 33);
            final TextView textView = (TextView)this.L.findViewById(2131886631);
            com.twitter.library.view.u.a(textView);
            textView.setText((CharSequence)text);
            if (!this.M) {
                this.Y().addFooterView(this.L, (Object)null, false);
            }
            this.M = true;
        }
    }
    
    private void K() {
        final com.twitter.android.client.c aw = this.aw();
        final long g = this.aF().g();
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { "messages:thread:::send_dm" });
        if (this.F != null) {
            final long statusId = this.F.statusId;
            String impressionId;
            if (this.F.promotedContent == null) {
                impressionId = null;
            }
            else {
                impressionId = this.F.promotedContent.impressionId;
            }
            aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { "messages:share_tweet_conversation:::send_tweet_dm" })).a(this.d, statusId, impressionId));
            twitterScribeLog.a(this.d, statusId, impressionId);
        }
        aw.a(twitterScribeLog);
        final String trim = this.p.getText().trim();
        this.n(true);
        this.i = this.h;
        if (this.h != null && this.g == null) {
            return;
        }
        final String string = UUID.randomUUID().toString();
        com.twitter.android.metrics.c.a(string, this.av()).i();
        this.a(new av((Context)this.getActivity(), this.aF(), this.d, string, trim, this.g, this.F), 8, 0);
        if (this.G) {
            Toast.makeText((Context)this.getActivity(), 2131297666, 0).show();
            final FragmentActivity activity = this.getActivity();
            activity.setResult(-1, (Intent)null);
            activity.finish();
            return;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.F();
        this.H = true;
    }
    
    private void L() {
        this.startActivity(new Intent((Context)this.getActivity(), (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298284))));
    }
    
    private boolean M() {
        return this.e(2);
    }
    
    private boolean N() {
        return this.e(8);
    }
    
    private void O() {
        this.p.a(false);
        this.getActivity().finish();
    }
    
    private void a(final long n, final int n2) {
        if (this.j || n2 == 3) {
            ((PromptDialogFragment)PromptDialogFragment.b(776).c(2131296804).d(2131297461).h(2131297563).j(2131296445).a(new dq(this, n))).a(this.getActivity().getSupportFragmentManager());
            this.j = false;
        }
    }
    
    private void a(final Bundle bundle) {
        (this.p = (TweetBox)this.getView().findViewById(2131886559)).setImeActionLabel(this.getText(2131297457));
        this.p.setHintText(this.getString(2131297462));
        this.p.setTweetBoxListener(this);
        if (bundle.containsKey("android.intent.extra.TEXT")) {
            this.p.a(bundle.getString("android.intent.extra.TEXT"), null);
        }
        if (this.F != null) {
            this.r.setDisplaySensitiveMedia(true);
            this.r.setQuoteData(this.F);
            this.r.setRenderRtl(bj.e);
            this.r.setVisibility(0);
            this.s.setVisibility(0);
            this.p.setQuote(this.F);
        }
        if (this.Q) {
            this.p.setMaxChars(this.P);
        }
        this.p.setAttachmentsUseSecureUrls(true);
        this.p.a(this.B);
    }
    
    private void a(final k k) {
        this.l.setVisibility(0);
        this.m.setImageResource(2130838845);
        this.p.i();
        this.k.a(k);
    }
    
    private void a(final PageableListView pageableListView) {
        if (this.F == null) {
            pageableListView.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)new dm(this, pageableListView));
            pageableListView.setOnItemClickListener((AdapterView$OnItemClickListener)new dn(this, pageableListView, this));
        }
        this.L = View.inflate((Context)this.getActivity(), 2130968725, (ViewGroup)null);
        pageableListView.a();
        pageableListView.a(false);
        pageableListView.setAdapter(this.W);
        pageableListView.setOnPageScrollListener(new do(this));
    }
    
    private static long[] a(final Cursor cursor, final int n, final long n2) {
        if (cursor == null) {
            return null;
        }
        final int position = cursor.getPosition();
        final ArrayList<Long> list = new ArrayList<Long>();
        try {
            if (cursor.moveToFirst()) {
                list.add(cursor.getLong(n));
                while (cursor.moveToNext()) {
                    list.add(cursor.getLong(n));
                }
            }
        }
        finally {
            cursor.moveToPosition(position);
        }
        cursor.moveToPosition(position);
        list.remove(n2);
        return CollectionUtils.c(list);
    }
    
    private void d(final int n) {
        if (this.Q) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setVisibility(0);
        this.o.setText((CharSequence)String.valueOf(n));
    }
    
    private void d(final boolean w) {
        this.w = w;
        this.ar();
    }
    
    private void e(final long c) {
        final PromptDialogFragment e = PromptDialogFragment.b(770).c(2131297882).e(2131361814);
        e.setTargetFragment(this, 0);
        this.c = c;
        e.a(this.getActivity().getSupportFragmentManager());
    }
    
    private void e(final boolean b) {
        if (!((ll)this.W).isEmpty()) {
            if (!b) {
                this.Y().setSelection(-1 + this.Y().getCount());
                return;
            }
            this.Y().smoothScrollToPosition(-1 + this.Y().getCount());
        }
    }
    
    private boolean e(final int n) {
        final ListView y = this.Y();
        return y.getLastVisiblePosition() >= y.getCount() - y.getHeaderViewsCount() - y.getFooterViewsCount() - n;
    }
    
    private void h(final long n) {
        this.n(true);
        this.a(new bc((Context)this.getActivity(), this.aF(), n), 3, 0);
    }
    
    private void n(final boolean v) {
        this.v = v;
    }
    
    public void A() {
        int n;
        if (ak.f()) {
            if (this.x) {
                n = 2131297246;
            }
            else {
                n = 2131297247;
            }
        }
        else {
            n = 2131297245;
        }
        final PromptDialogFragment j = PromptDialogFragment.b(779).d(n).h(2131298158).j(2131297303);
        j.a((b)this);
        j.setTargetFragment(this, 0);
        j.a(this.getActivity().getSupportFragmentManager());
    }
    
    public boolean E_() {
        return this.H && this.F == null;
    }
    
    public void F_() {
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968718, viewGroup);
    }
    
    @Override
    public void a(final int n, final y y) {
        int n2 = 2131296817;
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        Label_0096: {
            switch (n) {
                case 3:
                case 8: {
                    final bd bd = (bd)y;
                    if (!bd.b()) {
                        com.twitter.android.metrics.c.a(bd.an_(), this.av()).a(aa.a());
                    }
                    if (aa.a()) {
                        final String e = bd.e();
                        if (e != null) {
                            this.a(e);
                        }
                        final aw a = ((bd)y).a;
                        if (!a.a.isEmpty()) {
                            int n3;
                            if (a.a().isEmpty()) {
                                n3 = n2;
                            }
                            else {
                                n3 = 2131296818;
                            }
                            Toast.makeText(this.an, n3, 0).show();
                            return;
                        }
                        break;
                    }
                    else {
                        final Set f = bd.f();
                        final int c = aa.c();
                        final long g = bd.g();
                        switch (c) {
                            default: {
                                if (g != -1L) {
                                    this.a(g, n);
                                    return;
                                }
                                break Label_0096;
                            }
                            case 403: {
                                if (f.contains(349)) {
                                    Toast.makeText(this.an, 2131296842, 0).show();
                                    this.z = true;
                                    this.I();
                                    return;
                                }
                                if (f.contains(150)) {
                                    Toast.makeText(this.an, 2131296843, 0).show();
                                    this.z = true;
                                    this.I();
                                    return;
                                }
                                if (f.contains(226)) {
                                    Toast.makeText(this.an, 2131296822, 0).show();
                                    return;
                                }
                                if (f.contains(344)) {
                                    RateLimitDialogFragmentActivity.a((Context)this.getActivity());
                                    return;
                                }
                                Toast.makeText(this.an, 2131296836, 0).show();
                                return;
                            }
                            case 404: {
                                Toast.makeText(this.an, 2131296840, 0).show();
                                return;
                            }
                            case 420:
                            case 429: {
                                Toast.makeText(this.an, 2131296841, 0).show();
                                return;
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    if (!aa.a()) {
                        Toast.makeText(this.an, 2131297275, 0).show();
                        return;
                    }
                    break;
                }
                case 4: {
                    if (aa.a()) {
                        Toast.makeText(this.an, 2131297244, 0).show();
                        return;
                    }
                    break;
                }
                case 5: {
                    if (aa.a()) {
                        Toast.makeText(this.an, 2131297240, 0).show();
                        return;
                    }
                    break;
                }
                case 7: {
                    final PageableListView pageableListView = (PageableListView)this.Y();
                    pageableListView.a(false);
                    if (aa.a()) {
                        if (!((w)y).e()) {
                            pageableListView.setOnPageScrollListener(null);
                        }
                    }
                    else {
                        if (aa.c() == 401 && this.J) {
                            Toast.makeText(this.an, 2131296827, 0).show();
                            final FragmentActivity activity = this.getActivity();
                            if (activity != null) {
                                if (activity instanceof DMActivity) {
                                    ((DMActivity)activity).g_();
                                }
                                activity.finish();
                            }
                        }
                        pageableListView.setOnPageScrollListener(null);
                    }
                    this.u = false;
                    return;
                }
                case 9: {
                    if (aa.a()) {
                        this.d(true);
                        Toast.makeText(this.an, 2131296857, 0).show();
                        return;
                    }
                    break;
                }
                case 10: {
                    if (aa.a()) {
                        this.d(false);
                        Toast.makeText(this.an, 2131296856, 0).show();
                        return;
                    }
                    break;
                }
                case 11: {
                    final com.twitter.library.api.conversations.a a2 = (com.twitter.library.api.conversations.a)y;
                    if (this.q != null) {
                        this.q.hide();
                    }
                    if (aa.a()) {
                        final com.twitter.library.api.conversations.b a3 = a2.a;
                        if (a3.a.isEmpty()) {
                            n2 = -1;
                        }
                        else if (!a3.a().isEmpty()) {
                            n2 = 2131296818;
                        }
                    }
                    else if (403 == aa.c()) {
                        if (CollectionUtils.a(a2.f(), 344)) {
                            RateLimitDialogFragmentActivity.a((Context)this.getActivity());
                            n2 = -1;
                        }
                    }
                    else if (420 == aa.c() || 429 == aa.c()) {
                        n2 = 2131296819;
                    }
                    if (n2 != -1) {
                        Toast.makeText(this.an, n2, 0).show();
                        return;
                    }
                    break;
                }
                case 14: {
                    final af af = (af)y;
                    if (!aa.a()) {
                        break;
                    }
                    final ag a4 = af.a;
                    if (CollectionUtils.a((Collection)a4.c)) {
                        break;
                    }
                    final ad ad = a4.a.get(a4.c.get(0).userId);
                    if (ad != null && ad.a) {
                        this.z = false;
                        this.I();
                        return;
                    }
                    break;
                }
                case 15: {
                    if (aa.a()) {
                        this.m(1);
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n) {
        if (n == 779) {
            this.O();
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        final com.twitter.android.client.c aw = this.aw();
        final Session af = this.aF();
        final long g = af.g();
        switch (n) {
            case 769: {
                final FragmentActivity activity = this.getActivity();
                if (DeleteConversationDialog.a(n2)) {
                    this.p.a(false);
                    if (activity instanceof DMActivity) {
                        ((DMActivity)activity).g_();
                    }
                    this.getActivity().finish();
                    return;
                }
                break;
            }
            case 770: {
                if (this.c >= 0L) {
                    switch (n2) {
                        case 0: {
                            aw.a(g, "messages:thread:message:spam:report_as_spam");
                            this.a(new bb((Context)this.getActivity(), af, this.c, "spam"), 4, 0);
                            break;
                        }
                        case 1: {
                            aw.a(g, "messages:thread:message:abusive:report_as_spam");
                            this.a(new bb((Context)this.getActivity(), af, this.c, "abuse"), 5, 0);
                            final PromptDialogFragment j = PromptDialogFragment.b(771).d(2131297242).h(2131298158).j(2131297303);
                            j.setTargetFragment(this, 0);
                            j.a(this.getActivity().getSupportFragmentManager());
                            break;
                        }
                    }
                }
                this.c = -1L;
            }
            case 771: {
                if (n2 == -1) {
                    this.L();
                    return;
                }
                break;
            }
            case 777: {
                if (n2 == 0) {
                    this.f.a(false, 1);
                    this.I = true;
                    return;
                }
                if (n2 == 1) {
                    this.f.b();
                    this.I = true;
                    return;
                }
                break;
            }
            case 779: {
                if (n2 == -1) {
                    this.L();
                }
                this.O();
            }
        }
    }
    
    public void a(final Intent intent, final int n, final Bundle bundle) {
        this.startActivityForResult(intent, n);
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        final FragmentActivity activity = this.getActivity();
        switch (loader.getId()) {
            case 0: {
                final boolean m = this.M();
                super.a(loader, cursor);
                if (((ll)this.W).isEmpty()) {
                    this.g(false);
                    if (!com.twitter.library.api.conversations.s.a(this.d) && !this.E && !this.u) {
                        this.B();
                        this.E = true;
                    }
                }
                else {
                    ix.a("dm:conversation_load", ir.b(), ih.m).j();
                    this.a(new com.twitter.library.api.conversations.au((Context)activity, this.aF(), this.d, true), 6, 0);
                    if (m) {
                        this.e(false);
                    }
                    else if (this.v) {
                        this.n(false);
                        this.e(false);
                    }
                    this.H = true;
                }
                this.ar();
            }
            case 1: {
                final com.twitter.library.provider.c c = (com.twitter.library.provider.c)cursor;
                if (!cursor.moveToNext()) {
                    break;
                }
                this.d(!c.k());
                ((TwitterFragmentActivity)activity).b(c.g());
                this.x = c.h();
                this.y = (c.l() && !ak.a(this.aF().j()));
                if (this.S) {
                    ((dz)this.W).a(this.x);
                }
                else {
                    ((cx)this.W).a(this.x);
                }
                this.ar();
                this.A = c.e();
                final List b = c.b();
                if (!this.R && !b.isEmpty()) {
                    this.a(new qb((Context)this.getActivity(), this.aF()).a(b), 15, 0);
                    this.R = true;
                }
                else {
                    activity.setTitle((CharSequence)c.f());
                }
                this.z = c.j();
                if (this.O) {
                    break;
                }
                this.I();
                this.O = true;
                if (this.z) {
                    this.a(new af((Context)this.getActivity(), this.aF(), new long[] { c.i() }), 14, 0);
                    return;
                }
                break;
            }
            case 2: {
                this.D = a(cursor, 0, this.aF().g());
                if (this.b != null && this.D != null) {
                    this.b.a(this.D);
                    this.C = true;
                }
                this.ar();
            }
        }
    }
    
    public void a(final AttachMediaListener$MediaAttachFailure attachMediaListener$MediaAttachFailure, final Uri uri) {
        this.I = false;
        if (attachMediaListener$MediaAttachFailure == AttachMediaListener$MediaAttachFailure.c) {
            if (this.h == null) {
                this.l.setVisibility(8);
            }
            return;
        }
        this.h = null;
        if (this.g != null) {
            this.g.g();
        }
        this.g = null;
        this.a(com.twitter.library.media.manager.j.a(""));
    }
    
    public void a(final yf b) {
        this.b = b;
    }
    
    @Override
    protected void a(final ToolBar toolBar) {
        boolean b = true;
        super.a(toolBar);
        final boolean b2 = this.F != null && b;
        final boolean b3 = this.W != null && ((ll)this.W).getCount() > 0 && b;
        final jx a = toolBar.a(2131887425);
        a.b(b3 && !b2 && b);
        a.d(2131297277);
        final boolean x = this.x;
        final boolean a2 = com.twitter.library.api.conversations.s.a(this.d);
        int n;
        if (this.w) {
            n = 2131296881;
        }
        else {
            n = 2131296882;
        }
        toolBar.a(2131887421).b(!this.z && !b2 && this.D != null && !a2 && b);
        toolBar.a(2131887422).b(!b2 && x && this.C && !a2 && b);
        toolBar.a(2131887423).b(!b2 && x && !a2 && b);
        toolBar.a(2131887424).b(!b2 && !a2 && b).d(n).d(this.w);
        final jx a3 = toolBar.a(2131887426);
        if (b2 || a2 || !ak.f()) {
            b = false;
        }
        a3.b(b);
    }
    
    @Override
    protected void a(final com.twitter.refresh.widget.a a, final boolean b) {
        final long b2 = a.b;
        if (b2 > 0L) {
            final int a2 = this.a(b2);
            final ListView y = this.Y();
            if (this.M()) {
                this.e(true);
                return;
            }
            if (a2 >= y.getHeaderViewsCount() || !b) {
                this.b(a2, a.c);
            }
        }
    }
    
    public void a(final String s) {
        if (!s.equals(this.d)) {
            this.e = s;
            this.d = s;
            this.A_();
            this.m(1);
            this.m(2);
        }
    }
    
    @Override
    protected void a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951633, toolBar);
        this.k(false);
    }
    
    public boolean a(final int n) {
        final Cursor cursor = (Cursor)((ll)this.W).getItem(n);
        final int int1 = cursor.getInt(5);
        final long long1 = cursor.getLong(1);
        DMMessageDialog a;
        if (com.twitter.library.provider.aj.d.contains(int1)) {
            final DMMessageEntry dmMessageEntry = (DMMessageEntry)com.twitter.util.f.a(cursor.getBlob(8));
            final boolean b = int1 == 1;
            int n2;
            if (b) {
                n2 = 775;
            }
            else {
                n2 = 772;
            }
            a = DMMessageDialog.a(n2, b, long1, dmMessageEntry, this);
        }
        else {
            a = null;
        }
        if (a != null) {
            a.setTargetFragment(this, 0);
            a.a(this.getActivity().getSupportFragmentManager());
            return true;
        }
        return false;
    }
    
    public boolean a(final KeyEvent keyEvent) {
        return false;
    }
    
    public boolean a(final EditableMedia editableMedia) {
        this.h = editableMedia.c();
        return true;
    }
    
    public boolean a(final com.twitter.library.platform.d d, final long n) {
        return n == this.aF().g() && this.e != null && this.e.equals(d.i);
    }
    
    @Override
    public boolean a(final jx jx) {
        final FragmentActivity activity = this.getActivity();
        final com.twitter.android.client.c aw = this.aw();
        final long g = this.aF().g();
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887425: {
                final DeleteConversationDialog a = DeleteConversationDialog.a(769, this.x, this.y, this.d, "thread");
                a.setTargetFragment(this, 0);
                a.a(activity.getSupportFragmentManager());
                return true;
            }
            case 2131887424: {
                if (jx.o()) {
                    aw.a(g, "messages:thread::thread:mute_dm_thread");
                    this.a(new bg((Context)activity, this.aF(), this.d, true), 10, 0);
                    return true;
                }
                aw.a(g, "messages:thread::thread:unmute_dm_thread");
                this.a(new bg((Context)activity, this.aF(), this.d, false), 9, 0);
                return true;
            }
            case 2131887423: {
                aw.a(g, "messages:thread::thread:edit_name");
                final UpdateConversationNameDialog a2 = UpdateConversationNameDialog.a(this.A, this.d);
                a2.setTargetFragment(this, 0);
                a2.a(activity.getSupportFragmentManager());
                return true;
            }
            case 2131887422: {
                aw.a(g, "messages:thread::thread:view_participants");
                this.p.a(false);
                this.b.b();
                return true;
            }
            case 2131887421: {
                if (this.D == null || this.D.length < ak.a()) {
                    aw.a(g, "messages:thread::thread:add_participants");
                    this.startActivityForResult(new Intent((Context)this.getActivity(), (Class)DMAddParticipantsActivity.class).putExtra("preselected_items", this.D), 1);
                    return true;
                }
                Toast.makeText((Context)this.getActivity(), (CharSequence)this.getString(2131296880), 0).show();
                return true;
            }
            case 2131887426: {
                final ReportConversationDialog a3 = ReportConversationDialog.a(778, this.x, this.d, "thread", this);
                a3.setTargetFragment(this, 0);
                a3.a(activity.getSupportFragmentManager());
                return true;
            }
        }
    }
    
    public void a_(final long n) {
        final Session af = this.aF();
        this.aw().a(af.g(), "messages:thread:rtf_message::report_as_spam");
        this.a(new bb((Context)this.getActivity(), af, n, "spam"), 4, 0);
    }
    
    public void b(final long n) {
        final Session af = this.aF();
        this.aw().a(af.g(), "messages:thread:rtf_message::report_as_ok");
        this.a(new bb((Context)this.getActivity(), af, n, "not_spam"), 12, 0);
    }
    
    public void b(final EditableMedia g) {
        this.l.setVisibility(0);
        this.I = false;
        final Uri h = this.h;
        this.h = null;
        if (this.g != null && !this.g.a(g)) {
            this.g.g();
        }
        this.g = g;
        this.a(g.b(this.an));
        this.p.e();
        if (h != null && this.i == h) {
            this.K();
        }
    }
    
    public void b(final boolean b) {
    }
    
    public boolean b(final int n) {
        final Cursor cursor = (Cursor)((ll)this.W).getItem(n);
        final int int1 = cursor.getInt(5);
        final long long1 = cursor.getLong(1);
        DMTweetDialog a;
        if (com.twitter.library.provider.aj.d.contains(int1)) {
            final DMMessageEntry dmMessageEntry = (DMMessageEntry)com.twitter.util.f.a(cursor.getBlob(8));
            final boolean b = int1 == 1;
            int n2;
            if (b) {
                n2 = 774;
            }
            else {
                n2 = 773;
            }
            a = DMTweetDialog.a(n2, b, long1, dmMessageEntry, this);
        }
        else {
            a = null;
        }
        if (a != null) {
            a.setTargetFragment(this, 0);
            a.a(this.getActivity().getSupportFragmentManager());
            return true;
        }
        return false;
    }
    
    public void c(final int n) {
        this.d(this.P - n);
        this.n.setEnabled(this.p.k());
    }
    
    public void c(final long n) {
        this.h(n);
    }
    
    public void d(final long n) {
        this.e(n);
    }
    
    void e() {
        this.a(new ai(this.an, this.aF()), 13, 0);
    }
    
    @Override
    protected int j() {
        return 0;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final Resources resources = this.getResources();
        final Bundle bundle2 = new Bundle();
        if (bundle == null) {
            final Bundle arguments = this.getArguments();
            if (arguments != null) {
                bundle2.putAll(arguments);
            }
        }
        else {
            bundle2.putAll(bundle);
        }
        final String string = bundle2.getString("extra_title");
        final String string2 = bundle2.getString("extra_subtitle");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.getActivity().setTitle((CharSequence)string);
        }
        else {
            this.getActivity().setTitle(2131297168);
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            ((TwitterFragmentActivity)this.getActivity()).b(string2);
        }
        this.c = bundle2.getLong("report_entry_id");
        final long[] longArray = bundle2.getLongArray("user_ids");
        final String string3 = bundle2.getString("conversation_id");
        this.e = string3;
        this.d = string3;
        if (longArray != null && longArray.length != 0) {
            this.a(new v((Context)this.getActivity(), this.aF(), this.d, longArray));
        }
        this.q();
        final QuotedTweetData f = (QuotedTweetData)bundle2.get("quoted_tweet");
        if (f != null) {
            this.G = true;
            this.F = f;
        }
        else {
            this.G = bundle2.getBoolean("sharing_tweet");
        }
        final com.twitter.android.client.c aw = this.aw();
        final long g = this.aF().g();
        if (this.F != null) {
            aw.a(g, "messages:share_tweet_conversation:::impression");
        }
        else {
            aw.a(g, "messages:thread:::impression");
        }
        if (this.S) {
            final FragmentActivity activity = this.getActivity();
            final TwitterScribeAssociation z = this.Z;
            final QuotedTweetData f2 = this.F;
            cs cs = null;
            if (f2 == null) {
                cs = this;
            }
            this.W = (ListAdapter)new dz(activity, aw, z, resources, cs);
        }
        else {
            final FragmentActivity activity2 = this.getActivity();
            final TwitterScribeAssociation z2 = this.Z;
            final QuotedTweetData f3 = this.F;
            cs cs2 = null;
            if (f3 == null) {
                cs2 = this;
            }
            this.W = (ListAdapter)new cx(activity2, aw, z2, resources, cs2);
        }
        this.a((PageableListView)this.Y());
        this.j = bundle2.getBoolean("error_dialog", true);
        this.x = bundle2.getBoolean("is_group_convo", false);
        this.y = bundle2.getBoolean("is_trust_only", false);
        this.f = PhotoSelectFragment.a(this.getActivity(), this, "dm_composition", MediaType.f, this.aF());
        this.k = (MediaImageView)this.getView().findViewById(2131886886);
        this.l = (RelativeLayout)this.getView().findViewById(2131886885);
        this.m = (ImageView)this.getView().findViewById(2131886884);
        if (this.F != null) {
            this.m.setVisibility(8);
        }
        else {
            this.m.setOnClickListener((View$OnClickListener)this);
            this.B = bundle2.getBoolean("keyboard_open", false);
        }
        this.getView().findViewById(2131886887).setOnClickListener((View$OnClickListener)this);
        this.r = (QuoteView)this.getView().findViewById(2131886946);
        this.s = (ViewGroup)this.getView().findViewById(2131886945);
        this.t = (LinearLayout)this.getView().findViewById(2131886944);
        (this.n = (Button)this.getView().findViewById(2131886596)).setText(2131297457);
        this.n.setEnabled(false);
        this.n.setOnClickListener((View$OnClickListener)this);
        this.o = (TextView)this.getView().findViewById(2131886578);
        this.d(this.P);
        this.a(bundle2);
        this.g = (EditableMedia)bundle2.getParcelable("media_item");
        this.h = (Uri)bundle2.getParcelable("media_uri");
        final boolean boolean1 = bundle2.getBoolean("is_from_other_app");
        if (this.h != null && boolean1) {
            this.f.a(this.h, false, this);
        }
        this.J = bundle2.getBoolean("from_ext_url");
        this.getView().getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new dl(this, resources.getDisplayMetrics().heightPixels - resources.getDimensionPixelSize(2131558941)));
        if (bundle2.getBoolean("read_only")) {
            this.z = true;
            this.I();
        }
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.f.a(n, n2, intent, this);
        if (n == 1 && n2 == -1) {
            final long[] longArrayExtra = intent.getLongArrayExtra("user_ids");
            if (longArrayExtra != null && longArrayExtra.length > 0) {
                final FragmentActivity activity = this.getActivity();
                final HashSet set = new HashSet(CollectionUtils.a(longArrayExtra));
                if (!this.x) {
                    set.addAll(CollectionUtils.a(this.D));
                    final Intent intent2 = new Intent((Context)activity, (Class)DMActivity.class);
                    intent2.putExtra("user_ids", CollectionUtils.c(set));
                    this.startActivity(intent2);
                    activity.finish();
                    return;
                }
                (this.q = new ProgressDialog((Context)activity)).setProgressStyle(0);
                this.q.setIndeterminate(true);
                this.q.setCancelable(true);
                this.q.show();
                this.a(new com.twitter.library.api.conversations.a((Context)activity, this.aF(), this.d, set), 11, 0);
            }
        }
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131886884) {
            PromptDialogFragment.b(777).e(2131361798).a((e)this).a(this.getActivity().getSupportFragmentManager());
        }
        else {
            if (id == 2131886887) {
                if (this.g != null) {
                    this.g.g();
                    this.g = null;
                }
                this.h = null;
                this.G();
                return;
            }
            if (2131886596 == id) {
                this.K();
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.j(true);
        com.twitter.android.client.x.a((Context)this.getActivity()).a(this);
        this.P = ak.b();
        this.Q = ak.d();
        this.S = ak.c();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final long g = this.aF().g();
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(Uri.withAppendedPath(com.twitter.library.provider.ai.a, this.d), g), com.twitter.library.api.conversations.x.a, null, null, null);
            }
            case 1: {
                return new dy((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.al.a, g), com.twitter.library.api.conversations.aa.a, "conversation_id=?", new String[] { this.d }, null, g, this.d);
            }
            case 2: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(Uri.withAppendedPath(com.twitter.library.provider.ak.a, this.d), g), new String[] { "user_id" }, null, null, null);
            }
        }
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        com.twitter.android.client.x.a((Context)this.getActivity()).b(this);
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.e = null;
        if (this.a != null) {
            this.a.dismiss();
            this.a = null;
        }
        this.N.a();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.e = this.d;
        if (this.h != null && !this.k.a()) {
            this.l.setVisibility(0);
            this.k.a((k)null);
        }
        if (this.g != null && !this.I) {
            final EditableMedia g = this.g;
            this.g = null;
            this.f.a(g, this);
        }
        if (com.twitter.library.featureswitch.d.f("dm_polling_enabled")) {
            this.N.a(30000L);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("android.intent.extra.TEXT", this.p.getText());
        bundle.putBoolean("error_dialog", this.j);
        bundle.putParcelable("media_uri", (Parcelable)this.h);
        bundle.putParcelable("media_item", (Parcelable)this.g);
        bundle.putSerializable("quoted_tweet", (Serializable)this.F);
        bundle.putSerializable("sharing_tweet", (Serializable)this.G);
        bundle.putString("conversation_id", this.d);
        bundle.putBoolean("is_group_convo", this.x);
        bundle.putBoolean("read_only", this.z);
        bundle.putBoolean("is_trust_only", this.y);
        bundle.putLong("report_entry_id", this.c);
        final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.getActivity();
        if (!TextUtils.isEmpty(twitterFragmentActivity.getTitle())) {
            bundle.putString("extra_title", twitterFragmentActivity.getTitle().toString());
        }
        if (!TextUtils.isEmpty(twitterFragmentActivity.E())) {
            bundle.putString("extra_subtitle", twitterFragmentActivity.E().toString());
        }
    }
    
    @Override
    protected void q() {
        super.q();
        final LoaderManager loaderManager = this.getLoaderManager();
        loaderManager.initLoader(1, null, this);
        loaderManager.initLoader(2, null, this);
    }
    
    public boolean r() {
        return this.p.c() || this.t();
    }
    
    public boolean s() {
        return (com.twitter.library.api.conversations.s.a(this.d) || !this.x) && this.T() != null && ((ll)this.W).isEmpty();
    }
    
    public boolean t() {
        return this.g != null;
    }
    
    public void v() {
    }
    
    public void w() {
        this.K();
    }
    
    public int y() {
        return 4;
    }
    
    public void z() {
        this.O();
    }
}
