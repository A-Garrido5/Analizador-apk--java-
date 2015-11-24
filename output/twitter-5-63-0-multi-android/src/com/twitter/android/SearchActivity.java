// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.twitter.library.widget.SlidingUpPanelLayout;
import java.io.Serializable;
import com.twitter.library.client.Session$LoginStatus;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.av;
import android.widget.CompoundButton;
import android.support.v4.app.FragmentActivity;
import java.util.Collection;
import com.twitter.library.widget.aj;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.concurrent.h;
import com.twitter.library.util.bq;
import com.twitter.library.experiments.a;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.events.b;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import android.text.SpannableString;
import android.app.AlertDialog;
import android.view.InflateException;
import android.view.ViewStub;
import com.twitter.library.service.y;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import android.view.View;
import com.twitter.library.featureswitch.d;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.util.q;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.network.ae;
import com.twitter.library.client.Session;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.bg;
import com.twitter.android.geo.c;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.RelativeLayout;
import java.util.HashMap;
import com.twitter.android.geo.e;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.support.v4.app.FragmentManager$OnBackStackChangedListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class SearchActivity extends TwitterFragmentActivity implements FragmentManager$OnBackStackChangedListener, LoaderManager$LoaderCallbacks, View$OnClickListener, ViewTreeObserver$OnGlobalLayoutListener, CompoundButton$OnCheckedChangeListener, RadioGroup$OnCheckedChangeListener, e, rp
{
    private static final HashMap j;
    private RelativeLayout A;
    private Switch B;
    private TextView F;
    private DockLayout G;
    private c H;
    SearchFragment a;
    qz b;
    int c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    private bg k;
    private TwitterScribeAssociation l;
    private HashMap m;
    private HashMap n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private SlidingPanel w;
    private RadioGroup x;
    private RadioButton y;
    private RadioButton z;
    
    static {
        (j = new HashMap(10)).put("com.twitter.android.action.USER_SHOW", 1);
        SearchActivity.j.put("com.twitter.android.action.USER_SHOW_TYPEAHEAD", 2);
        SearchActivity.j.put("com.twitter.android.action.USER_SHOW_SEARCH_SUGGESTION", 3);
        SearchActivity.j.put("com.twitter.android.action.SEARCH", 4);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_RECENT", 5);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_TYPEAHEAD_TOPIC", 6);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_QUERY_SAVED", 7);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_TREND", 8);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_QUERY_ONECLICK", 9);
        SearchActivity.j.put("com.twitter.android.action.SEARCH_TAKEOVER", 10);
    }
    
    private String a(final az az) {
        return "Thanks for submitting a bad search!\n\n" + "What (user, tweet, image, etc): \n\n" + "Expected results: \n\n" + "Actual results: \n\n\n\n" + "-------------------------\n\n" + "Request URL:\n" + this.a.K() + "\n\n" + az.b() + "\n\n" + ae.a((Context)this).h;
    }
    
    private void a(final Intent intent, boolean popBackStackImmediate) {
        final Integer n = SearchActivity.j.get(intent.getAction());
        final String stringExtra = intent.getStringExtra("query");
        if (stringExtra == null) {
            return;
        }
        stringExtra.trim();
        boolean b = false;
        Label_0135: {
            if (n != null) {
                final String stringExtra2 = intent.getStringExtra("user_query");
                final int intExtra = intent.getIntExtra("search_suggestion_position", -1);
                final long longExtra = intent.getLongExtra("search_suggestion_id", -1L);
                final TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)intent.getParcelableExtra("source_association");
                switch (n) {
                    case 1: {
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "go_to_user", "click"), stringExtra2, stringExtra);
                        this.startActivity(new Intent((Context)this, (Class)ProfileActivity.class).putExtra("screen_name", stringExtra).putExtra("association", (Parcelable)this.l).putExtra("expanded_search", true));
                        this.finish();
                        return;
                    }
                    case 2: {
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "typeahead", "profile_click"), stringExtra2, stringExtra, intent, intExtra, longExtra);
                        this.startActivity(new Intent((Context)this, (Class)ProfileActivity.class).putExtra("screen_name", stringExtra).putExtra("association", (Parcelable)this.l).putExtra("expanded_search", true));
                        this.finish();
                        return;
                    }
                    case 3: {
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "user", "click"), stringExtra2, stringExtra);
                        this.startActivity(new Intent((Context)this, (Class)ProfileActivity.class).putExtra("screen_name", stringExtra).putExtra("association", (Parcelable)this.l).putExtra("expanded_search", true));
                        this.finish();
                        return;
                    }
                    case 4: {
                        intent.putExtra("q_source", "typed_query").putExtra("scribe_context", "search_box");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", null, "search"), stringExtra2, stringExtra);
                        b = false;
                        break Label_0135;
                    }
                    case 5: {
                        intent.putExtra("q_source", "recent_search_click").putExtra("scribe_context", "typeahead_recent_search");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "recent", "search"), stringExtra2, stringExtra);
                        b = false;
                        break Label_0135;
                    }
                    case 6: {
                        intent.putExtra("q_source", "typeahead_click").putExtra("scribe_context", "typeahead");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "typeahead", "search"), stringExtra2, stringExtra, intent, intExtra, longExtra);
                        b = false;
                        break Label_0135;
                    }
                    case 7: {
                        intent.putExtra("q_source", "saved_search_click").putExtra("scribe_context", "typeahead_saved_search");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "saved_search", "search"), stringExtra2, stringExtra, intent, intExtra, longExtra);
                        b = true;
                        break Label_0135;
                    }
                    case 8: {
                        intent.putExtra("q_source", "typed_query").putExtra("scribe_context", "typeahead_cluster");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "cluster", "search"), stringExtra2, stringExtra);
                        b = false;
                        break Label_0135;
                    }
                    case 9: {
                        this.h = !stringExtra.equals(intent.getStringExtra("query_name").trim());
                        intent.putExtra("q_source", "taoc").putExtra("terminal", this.h).putExtra("scribe_context", "typeahead_oneclick_search");
                        this.a(TwitterScribeLog.a(twitterScribeAssociation, "search_box", "typeahead_concierge", "search"), stringExtra2, stringExtra);
                        this.d = intent.getBooleanExtra("follows", false);
                        this.e = intent.getBooleanExtra("near", false);
                        b = false;
                        break Label_0135;
                    }
                }
            }
            b = false;
        }
        int intExtra2;
        if (intent.getData() == null) {
            intExtra2 = intent.getIntExtra("search_type", 0);
            if (!intent.hasExtra("q_source")) {
                intent.putExtra("q_source", "typed_query");
            }
        }
        else {
            intExtra2 = 0;
        }
        if (!intent.getExtras().containsKey("search_id")) {
            final long nextLong = com.twitter.util.q.a.nextLong();
            this.n.put(new ra(stringExtra, intExtra2, intent.getBooleanExtra("follows", false), intent.getBooleanExtra("near", false), intent.getBooleanExtra("recent", false)).hashCode(), nextLong);
            intent.putExtra("search_id", nextLong);
            this.k.i(nextLong);
        }
        intent.putExtra("search_type", intExtra2);
        SearchFragment searchFragment;
        if (intExtra2 == 3 && !intent.getBooleanExtra("photo_list", false)) {
            searchFragment = new SearchPhotosFragment();
        }
        else {
            searchFragment = new SearchResultsFragment();
        }
        final Bundle arguments = new Bundle();
        arguments.putInt("empty_title", 2131297635);
        arguments.putInt("empty_desc", 2131297636);
        searchFragment.setArguments(arguments);
        searchFragment.a(this.getIntent());
        searchFragment.h(true);
        searchFragment.b(b);
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        if (!intent.getBooleanExtra("in_back_stack", true)) {
            supportFragmentManager.removeOnBackStackChangedListener(this);
            popBackStackImmediate = supportFragmentManager.popBackStackImmediate();
            supportFragmentManager.addOnBackStackChangedListener(this);
        }
        final FragmentTransaction replace = supportFragmentManager.beginTransaction().setTransition(4097).replace(2131886399, searchFragment, "search_fragment");
        if (popBackStackImmediate) {
            replace.addToBackStack(null);
        }
        replace.commit();
    }
    
    private void a(final SearchFragment searchFragment) {
        boolean b = true;
        this.c = searchFragment.t();
        this.d = searchFragment.N();
        this.e = searchFragment.M();
        if (!(searchFragment instanceof SearchPhotosFragment) && this.c != (b ? 1 : 0) && this.c != 4) {
            b = false;
        }
        this.f(b);
        this.b.a(this.c, this.d, this.e);
        this.r = searchFragment.Q();
        this.a(searchFragment.L(), searchFragment.H(), this.c, searchFragment.P(), searchFragment);
    }
    
    private void a(final SearchFragment searchFragment, final boolean b) {
        boolean c = true;
        if (!b) {
            this.f(false);
            this.w.d();
        }
        if (this.f) {
            final boolean g = this.g;
            boolean b2 = false;
            int n = 0;
            Label_0082: {
                switch (this.c) {
                    case 0: {
                        if (g) {
                            this.c = (c ? 1 : 0);
                            b2 = c;
                            n = 0;
                            break Label_0082;
                        }
                        break;
                    }
                    case 1: {
                        if (!g) {
                            this.c = 0;
                            b2 = false;
                            n = 0;
                            break Label_0082;
                        }
                        break;
                    }
                    case 3: {
                        n = (g ? 1 : 0);
                        b2 = false;
                        break Label_0082;
                    }
                    case 5: {
                        if (g) {
                            this.c = 4;
                            b2 = false;
                            n = 0;
                            break Label_0082;
                        }
                        break;
                    }
                    case 4: {
                        if (!g) {
                            this.c = 5;
                            b2 = false;
                            n = 0;
                            break Label_0082;
                        }
                        break;
                    }
                }
                n = 0;
                b2 = false;
            }
            final String i = searchFragment.I();
            final String h = searchFragment.H();
            final int hashCode = new ra(i, this.c, this.d, this.e, b2).hashCode();
            final Intent putExtra = new Intent((Context)this, (Class)SearchActivity.class).putExtra("query", i).putExtra("query_name", h).putExtra("search_type", this.c).putExtra("follows", this.d).putExtra("near", this.e).putExtra("terminal", this.p).putExtra("recent", b2);
            if (n != 0) {
                c = false;
            }
            final Intent putExtra2 = putExtra.putExtra("photo_list", c).putExtra("in_back_stack", false);
            final Long n2 = this.n.get(hashCode);
            if (n2 != null) {
                putExtra2.putExtra("search_id", (long)n2);
            }
            else {
                final long nextLong = com.twitter.util.q.a.nextLong();
                this.n.put(hashCode, nextLong);
                this.k.i(nextLong);
                putExtra2.putExtra("search_id", nextLong);
            }
            this.startActivity(putExtra2);
            this.f = false;
        }
    }
    
    private void a(final String s, String s2, final int n, final boolean b, final SearchFragment a) {
        boolean b2 = true;
        boolean b3 = false;
        int n3 = 0;
        switch (n) {
            default: {
                int n2;
                if (this.d) {
                    n2 = 2131297910;
                }
                else if (this.e) {
                    n2 = 2131297913;
                }
                else {
                    n2 = 0;
                }
                this.y.setText(2131297641);
                this.z.setText(2131297638);
                b3 = true;
                n3 = n2;
                break;
            }
            case 2: {
                this.y.setText(2131297915);
                n3 = 2131297915;
                b3 = false;
                b2 = false;
                break;
            }
            case 3: {
                this.y.setText(2131297640);
                this.z.setText(2131297639);
                n3 = 2131297916;
                b3 = false;
                break;
            }
            case 4:
            case 5: {
                this.y.setText(2131297642);
                this.z.setText(2131297643);
                n3 = 2131297917;
                b3 = false;
                break;
            }
            case 6: {
                this.y.setText(2131297914);
                n3 = 2131297914;
                b3 = false;
                b2 = false;
                break;
            }
        }
        this.u = !b2;
        final ToolBar m = this.M();
        RadioButton radioButton;
        if (this.g) {
            radioButton = this.z;
        }
        else {
            radioButton = this.y;
        }
        boolean b4;
        if (this.h && n == 3) {
            b4 = true;
        }
        else {
            b4 = false;
        }
        this.v = (com.twitter.library.featureswitch.d.f("search_alerts_enabled") && b3 && !b);
        this.t = (!this.v && b2 && (!b || b4));
        if (this.t) {
            this.z.setVisibility(0);
            this.x.setVisibility(0);
            this.G.setTopView((View)this.x);
        }
        else {
            this.z.setVisibility(8);
            this.y.setVisibility(8);
            this.x.setVisibility(8);
        }
        if (this.A != null) {
            if (this.v) {
                this.A.setVisibility(0);
                this.G.setTopView((View)this.A);
            }
            else {
                this.A.setVisibility(8);
            }
        }
        if (this.t || this.v) {
            a.S();
        }
        else {
            a.R();
        }
        if (b) {
            if (!b4) {
                radioButton.setVisibility(8);
            }
            m.setCustomView(null);
            this.setTitle(s2);
            if (n3 != 0 && !this.h) {
                this.i(n3);
            }
            else {
                this.b((CharSequence)null);
            }
        }
        else {
            m.setCustomView((View)this.F);
            this.F.setText((CharSequence)s2);
            this.b((CharSequence)null);
        }
        m.setDisplayShowTitleEnabled(b);
        a.a(new qw(this.getResources(), this.G, (View)this.x, radioButton, a, this.t, this.v));
        if (!TextUtils.isEmpty((CharSequence)s)) {
            s2 = s;
        }
        if (!TextUtils.isEmpty((CharSequence)s2) && (s2.charAt(0) == '#' || s2.charAt(0) == '$')) {
            this.e(this.getResources().getString(2131297985) + " " + s2);
        }
        else {
            this.e(this.getResources().getString(2131296702));
        }
        this.a = a;
        this.p = b;
        this.Q();
    }
    
    private void a(final String s, final String s2, final String s3) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(new String[] { s });
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            ((TwitterScribeLog)twitterScribeLog.c(s2)).e(s3);
        }
        this.G().a(twitterScribeLog);
    }
    
    private void a(final String s, final String s2, final String s3, final Intent intent, final int n, final long n2) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.U().g()).b(new String[] { s });
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            ((TwitterScribeLog)twitterScribeLog.c(s2)).e(s3);
        }
        twitterScribeLog.a(TwitterScribeItem.a(n2, s3, 12, n));
        this.G().a(twitterScribeLog);
    }
    
    private void b(final SearchFragment searchFragment) {
        this.c = searchFragment.t();
        this.d = searchFragment.N();
        this.e = searchFragment.M();
        this.b.a(this.c, this.d, this.e);
    }
    
    private void b(final boolean q) {
        this.q = q;
        final RadioGroup x = this.x;
        int visibility;
        if (!this.p && this.t) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        x.setVisibility(visibility);
        if (this.a != null && !this.t && !this.v) {
            this.a.R();
        }
        this.Q();
    }
    
    private void c(final boolean b) {
        if (b) {
            this.b.a(false);
            this.w.b(2);
            this.w.b();
            return;
        }
        this.w.a(2);
        this.b.a(true);
        this.w.a();
    }
    
    private void e(final boolean checked) {
        if (this.B != null) {
            this.B.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
            this.B.setChecked(checked);
            this.B.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        }
    }
    
    private void f(final boolean g) {
        this.x.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        final RadioButton y = this.y;
        final RadioButton z = this.z;
        if (g) {
            z.setChecked(true);
        }
        else {
            y.setChecked(true);
        }
        y.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        z.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        y.setOnClickListener((View$OnClickListener)null);
        z.setOnClickListener((View$OnClickListener)null);
        y.setVisibility(0);
        z.setVisibility(0);
        this.g = g;
        this.x.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
    }
    
    private void h() {
        final ViewStub viewStub = (ViewStub)this.findViewById(2131886520);
        if (viewStub == null) {
            return;
        }
        try {
            this.A = (RelativeLayout)viewStub.inflate();
            (this.B = (Switch)this.findViewById(2131887265)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        }
        catch (InflateException ex) {
            this.A = null;
            this.B = null;
        }
    }
    
    private AlertDialog i() {
        final String string = this.getString(2131298256);
        final int index = string.indexOf("SpikingHawk");
        final int n = index + "SpikingHawk".length();
        final SpannableString spannableString = new SpannableString((CharSequence)string);
        final qu qu = new qu(this);
        final TextView view = new TextView((Context)this);
        spannableString.setSpan((Object)qu, index, n, 0);
        view.setMovementMethod(LinkMovementMethod.getInstance());
        view.setPadding(30, 15, 30, 15);
        view.setText((CharSequence)spannableString, TextView$BufferType.SPANNABLE);
        view.setTextSize(0, this.getResources().getDimension(2131558415));
        return new AlertDialog$Builder((Context)this).setTitle(2131298257).setPositiveButton(2131298255, (DialogInterface$OnClickListener)new qv(this)).setNegativeButton(2131296390, (DialogInterface$OnClickListener)null).setView((View)view).create();
    }
    
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        final jx a = toolBar.a(2131887418);
        if (this.q && !this.p) {
            toolBar.setCustomView((View)this.F);
        }
        else {
            toolBar.setCustomView(null);
        }
        a.b(this.q && this.p && this.r);
        if (toolBar.a(2131887472) != null) {
            toolBar.a(2131887472).b(this.q && !this.p);
        }
        if (toolBar.a(2131887461) != null) {
            toolBar.a(2131887461).b(this.q && !this.p);
        }
        if (this.U().d()) {
            final SearchFragment a2 = this.a;
            if (a2 != null) {
                final jx a3 = toolBar.a(2131887474);
                final jx a4 = toolBar.a(2131887473);
                final boolean a5 = this.a(a2.I());
                if (!this.p && this.q && !com.twitter.library.featureswitch.d.f("search_alerts_enabled")) {
                    a3.b(a5).c(a5);
                    final jx b = a4.b(!a5);
                    boolean b2 = false;
                    if (!a5) {
                        b2 = true;
                    }
                    b.c(b2);
                    return 1;
                }
                a3.b(false);
                a4.b(false);
                this.e(a5);
            }
        }
        else if (kg.a(this)) {
            toolBar.setDisplayShowHomeAsUpEnabled(false);
            return 1;
        }
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130969088);
        a.e(true);
        a.b(6);
        if (kg.a((Context)this)) {
            a.d(false);
            a.a(4);
        }
        return a;
    }
    
    public void a(final int n, final y y) {
        boolean b = true;
        final aa aa = (aa)y.l().b();
        final boolean a = this.a(this.a.I());
        int n2;
        if (n == 100) {
            n2 = 2131297600;
        }
        else {
            n2 = 2131296788;
        }
        int n3;
        if (n == 100) {
            n3 = 2131297601;
        }
        else {
            n3 = 2131296789;
        }
        switch (n) {
            default: {}
            case 100:
            case 101: {
                if (aa.a()) {
                    Toast.makeText((Context)this, n2, 0).show();
                    return;
                }
                Toast.makeText((Context)this, n3, 0).show();
                if (this.v) {
                    this.e(a);
                    return;
                }
                final ToolBar m = this.M();
                final jx a2 = m.a(2131887474);
                final jx a3 = m.a(2131887473);
                a2.b(a).c(a);
                final jx b2 = a3.b(!a && b);
                if (a) {
                    b = false;
                }
                b2.c(b);
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        this.m.clear();
        if (!cursor.moveToFirst()) {
            return;
        }
        do {
            this.m.put(cursor.getString(2).toLowerCase(), cursor.getLong(3));
        } while (cursor.moveToNext());
        this.Q();
    }
    
    public void a(final boolean e) {
        if (this.e != e) {
            this.e = e;
            this.f = true;
        }
        this.b.a(this.c, this.d, this.e);
    }
    
    public void a(final boolean b, final ListView listView) {
        if (listView != null) {
            if (b) {
                this.a(false, (String)null);
                this.b(false);
                this.d(false);
                listView.setVisibility(8);
                if (this.v && this.A != null) {
                    this.A.setVisibility(8);
                }
            }
            else {
                this.a(true, (String)null);
                this.d(true);
                this.b(true);
                listView.setVisibility(0);
                if (this.v && this.A != null) {
                    this.A.setVisibility(0);
                }
            }
        }
    }
    
    public boolean a(final String s) {
        return this.m.containsKey(s.toLowerCase());
    }
    
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        if (twitterTopic != null && com.twitter.library.featureswitch.d.f("search_ui_event_takeover_enabled")) {
            final String b = twitterTopic.b();
            final int type = twitterTopic.d().type;
            if (com.twitter.android.events.b.a(com.twitter.android.events.b.a(b, type), s2)) {
                final Intent a = uk.a((Context)this, b, type, twitterTopic.e(), s, null, twitterTopic.h(), false, new TopicView$TopicData(twitterTopic));
                a.setAction("com.twitter.android.action.SEARCH_TAKEOVER").putExtra("search_takeover", true).putExtra("event_page_type", s2).putExtra("search_id", n).putExtra("search_src_ref", this.getIntent().getStringExtra("search_src_ref"));
                this.getIntent().setAction("com.twitter.android.action.SEARCH_TAKEOVER");
                this.startActivity(a);
                this.finish();
                this.overridePendingTransition(2131034160, 2131034161);
                this.G().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.T().b().g()).b(new String[] { "search::::takeover" })).a(TwitterScribeItem.a(b, type))).e(s));
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        com.twitter.library.experiments.a.a(false, (Context)this);
        if (!kg.a((Context)this) && com.twitter.library.featureswitch.d.f("search_features_bad_search_report_enabled")) {
            jv.a(2131951653, toolBar);
        }
        if (this.U().d() || kg.a((Context)this)) {
            jv.a(2131951651, toolBar);
        }
        jv.a(2131951658, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final com.twitter.android.client.c g = this.G();
        final long g2 = this.U().g();
        final SearchFragment a = this.a;
        final String i = a.I();
        long longValue = 0L;
        if (this.a(i)) {
            longValue = this.m.get(i.toLowerCase());
        }
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887473: {
                this.a(new com.twitter.library.api.search.c((Context)this, this.U(), i, longValue).g(0), 100);
                jx.b(false).c(false);
                g.a(g2, "search:universal::saved_search:add");
                return true;
            }
            case 2131887474: {
                this.a(new com.twitter.library.api.search.c((Context)this, this.U(), i, longValue).g(1), 101);
                jx.b(false).c(false);
                g.a(g2, "search:universal::saved_search:remove");
                return true;
            }
            case 2131887472: {
                this.b(this.a);
                this.c(this.o);
                g.a(g2, "search:universal:filter_sheet::impression");
                return true;
            }
            case 2131887461: {
                bq.a((Context)this, i, a.H());
                g.a(g2, "search:universal::query:share");
                return true;
            }
            case 2131887475: {
                final az a2 = az.a((Context)this);
                a2.a(this.getResources().getString(2131298246), "Bad search for [" + this.a.I() + "] from Android", this.a(a2)).a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.b).a(new qt(this)));
                return true;
            }
        }
    }
    
    public boolean a(final boolean t, final String s) {
        final boolean p2 = this.p;
        boolean b = false;
        if (!p2) {
            final boolean s2 = this.s;
            b = false;
            if (!s2) {
                this.t = t;
                if ((this.t && this.u) || this.v) {
                    this.t = false;
                }
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.k = bg.a((Context)this, this.U().g());
        final RadioGroup x = (RadioGroup)this.findViewById(2131887262);
        x.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        this.y = (RadioButton)x.findViewById(2131887263);
        this.z = (RadioButton)x.findViewById(2131887264);
        this.x = x;
        if (com.twitter.library.featureswitch.d.f("search_alerts_enabled")) {
            this.h();
        }
        (this.F = (TextView)LayoutInflater.from((Context)this).inflate(2130969096, (ViewGroup)null)).setOnClickListener((View$OnClickListener)this);
        this.getSupportFragmentManager().addOnBackStackChangedListener(this);
        this.l = (TwitterScribeAssociation)new TwitterScribeAssociation().b("search");
        this.H().a(this.l);
        final SlidingPanel w = (SlidingPanel)this.findViewById(2131886629);
        final qz b = new qz(w, (RadioGroup$OnCheckedChangeListener)this);
        b.m.setOnClickListener((View$OnClickListener)this);
        b.n.setOnClickListener((View$OnClickListener)this);
        b.o.setOnClickListener((View$OnClickListener)this);
        this.b = b;
        w.a(3);
        w.setPanelSlideListener(new qy(w, b));
        w.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.w = w;
        this.G = (DockLayout)this.findViewById(2131886401);
        this.getSupportLoaderManager().initLoader(0, null, this);
        this.h = false;
        if (bundle == null) {
            this.m = new HashMap();
            this.n = new HashMap();
            this.a(this.getIntent(), false);
            this.q = true;
            kg.b(this, "search");
        }
        else {
            this.m = (HashMap)bundle.getSerializable("search_saved_queries");
            this.n = (HashMap)bundle.getSerializable("search_ids");
            this.c = bundle.getInt("filter_type");
            this.d = bundle.getBoolean("filter_following");
            this.e = bundle.getBoolean("filter_near");
            this.g = bundle.getBoolean("filter_scope_alt");
            this.z.setChecked(this.g);
            this.i = bundle.getBoolean("state_panel_maximized");
            this.q = bundle.getBoolean("state_show_toolbar_content", true);
        }
        this.t = true;
        this.k.a(this.n.values());
        this.H = new c(this, "search_activity_location_dialog", this);
    }
    
    @Override
    protected String l_() {
        final String l = this.a.L();
        if (l.length() > 0 && (l.charAt(0) == '#' || l.charAt(0) == '$')) {
            return ' ' + l;
        }
        return super.l_();
    }
    
    @Override
    public void onBackStackChanged() {
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() >= 0) {
            this.a((SearchFragment)supportFragmentManager.findFragmentByTag("search_fragment"));
        }
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        if (this.a != null) {
            final String i = this.a.I();
            long longValue = 0L;
            if (this.a(i)) {
                longValue = this.m.get(i.toLowerCase());
            }
            final com.twitter.library.api.search.c c = new com.twitter.library.api.search.c((Context)this, this.U(), i, longValue);
            final com.twitter.android.client.c g = this.G();
            final long g2 = this.U().g();
            if (!b) {
                c.g(1);
                this.a(c, 101);
                g.a(g2, "search:universal::saved_search:remove");
                return;
            }
            if (!this.a.J()) {
                this.i().show();
            }
            c.g(0);
            this.a(c, 100);
            g.a(g2, "search:universal::saved_search:add");
        }
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        final SearchFragment a = this.a;
        if (a != null) {
            this.s = true;
            final boolean n2 = a.N();
            final boolean m = a.M();
            final int id = radioGroup.getId();
            if (id == 2131887236) {
                int c;
                if (n == 2131887238) {
                    c = 3;
                }
                else if (n == 2131887239) {
                    c = 5;
                }
                else if (n == 2131887240) {
                    c = 6;
                }
                else if (n == 2131887241) {
                    c = 2;
                }
                else {
                    c = 0;
                }
                if (this.c != c) {
                    this.c = c;
                    this.f = true;
                }
                if (this.w.getPanelState() != 4) {
                    this.a(a, false);
                }
            }
            else if (id == 2131887242) {
                boolean d = false;
                if (n == 2131887244) {
                    d = true;
                }
                if (n2 != d) {
                    this.d = d;
                    this.f = true;
                }
            }
            else if (id == 2131887245) {
                boolean e = false;
                if (n == 2131887247) {
                    e = true;
                }
                if (m != e) {
                    if (e && !sk.a().d()) {
                        this.H.a(1);
                        return;
                    }
                    this.e = e;
                    this.f = true;
                }
            }
            else if (id == 2131887262) {
                boolean g = false;
                if (n == 2131887264) {
                    g = true;
                }
                if (this.g != g) {
                    this.g = g;
                    this.f = true;
                    this.a(this.a, true);
                }
            }
        }
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131887142) {
            this.D();
            this.H().b(this.F.getText());
        }
        else {
            if (id == 2131887248) {
                this.G().a(this.U().g(), "search:universal:filter_sheet:more:click");
                this.c(false);
                return;
            }
            if (id == 2131887250) {
                this.G().a(this.U().g(), "search:universal:filter_sheet::apply");
                this.a(this.a, false);
                return;
            }
            if (id == 2131887251) {
                this.G().a(this.U().g(), "search:universal:filter_sheet::cancel");
                this.w.d();
                this.b(this.a);
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this, com.twitter.library.provider.ae.a(av.a, this.U().g()), qx.a, "type=? AND latitude IS NULL AND longitude IS NULL", new String[] { String.valueOf(6) }, "query_id DESC, time ASC");
    }
    
    @Override
    protected void onDestroy() {
        this.getSupportFragmentManager().removeOnBackStackChangedListener(this);
        if (this.U().b() == Session$LoginStatus.c) {
            this.k.b(this.n.values());
        }
        super.onDestroy();
    }
    
    public void onGlobalLayout() {
        boolean b = true;
        final SlidingPanel w = this.w;
        final int height = w.findViewById(2131887249).getHeight();
        final int panelPreviewHeight = height + w.findViewById(2131887235).getHeight();
        w.setPanelPreviewHeight(panelPreviewHeight);
        this.o = (this.getWindowManager().getDefaultDisplay().getHeight() > height + panelPreviewHeight && b);
        w.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        if (w.getPanelState() != 0) {
            if (this.i || !this.o) {
                b = false;
            }
            this.c(b);
            w.requestLayout();
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.m.clear();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.a(intent, true);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.s = false;
        this.a((SearchFragment)this.getSupportFragmentManager().findFragmentByTag("search_fragment"));
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("search_saved_queries", (Serializable)this.m);
        bundle.putSerializable("search_ids", (Serializable)this.n);
        bundle.putInt("filter_type", this.c);
        bundle.putBoolean("filter_following", this.d);
        bundle.putBoolean("filter_near", this.e);
        bundle.putBoolean("filter_scope_alt", this.g);
        bundle.putBoolean("state_panel_maximized", this.w.getPanelState() == 4);
        bundle.putBoolean("state_show_toolbar_content", this.q);
    }
    
    @Override
    public boolean onSearchRequested() {
        if (this.w.getPanelState() != 0) {
            this.w.d();
        }
        return this.H().e();
    }
    
    protected Intent q_() {
        final Intent intent = this.getIntent();
        final Integer n = SearchActivity.j.get(intent.getAction());
        if (n != null) {
            switch (n) {
                case 1:
                case 2:
                case 3:
                case 10: {
                    return this.W();
                }
            }
        }
        return new Intent(intent.putExtra("in_back_stack", false));
    }
    
    @Override
    protected int[] u_() {
        return new int[] { 0, 0 };
    }
}
