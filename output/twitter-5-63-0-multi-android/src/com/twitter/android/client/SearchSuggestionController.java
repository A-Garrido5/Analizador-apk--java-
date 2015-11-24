// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.view.KeyEvent;
import android.support.v4.content.CursorLoader;
import android.text.Editable;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.ui.dialog.e;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.kg;
import android.os.Parcelable;
import android.net.Uri;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.util.bj;
import com.twitter.library.widget.SearchQueryView;
import android.content.Intent;
import com.twitter.android.SearchActivity;
import android.text.TextUtils;
import android.os.ResultReceiver;
import android.view.View;
import com.twitter.util.t;
import android.widget.TextView;
import com.twitter.android.provider.SuggestionsProvider;
import android.annotation.SuppressLint;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.search.f;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.as;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.preference.PreferenceManager;
import com.twitter.android.mz;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import com.twitter.library.widget.af;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

public class SearchSuggestionController implements LoaderManager$LoaderCallbacks, TextWatcher, View$OnClickListener, TextView$OnEditorActionListener, ad, af
{
    private final c a;
    private final LoaderManager b;
    private final FragmentManager c;
    private final int d;
    private final az e;
    private final ay f;
    private final ba g;
    private final ArrayList h;
    private final SearchSuggestionController$QueryTextUpdateReceiver i;
    private final FragmentActivity j;
    private final Runnable k;
    private final com.twitter.library.client.az l;
    private TwitterScribeAssociation m;
    private PopupEditText n;
    private String o;
    private aw p;
    private jx q;
    private boolean r;
    private be s;
    private String t;
    private boolean u;
    private Drawable[] v;
    private SharedPreferences w;
    
    public SearchSuggestionController(final FragmentActivity j, final int d) {
        this.h = new ArrayList();
        this.i = new SearchSuggestionController$QueryTextUpdateReceiver(new Handler(Looper.getMainLooper()));
        this.k = new au(this);
        this.j = j;
        this.a = com.twitter.android.client.c.a((Context)j);
        this.l = com.twitter.library.client.az.a((Context)j);
        this.b = j.getSupportLoaderManager();
        this.c = j.getSupportFragmentManager();
        this.d = d;
        this.g = new ba((Context)j, (View$OnClickListener)this, new bf(this));
        this.m = (TwitterScribeAssociation)new TwitterScribeAssociation().b("app");
        this.w = PreferenceManager.getDefaultSharedPreferences((Context)this.j);
        this.f = new ay(this);
        this.e = new az(this);
    }
    
    @SuppressLint({ "WrongViewCast" })
    private boolean a(final jx jx) {
        if (this.r) {
            return false;
        }
        final c a = this.a;
        final PopupEditText n = (PopupEditText)jx.e().findViewById(2131887142);
        n.addTextChangedListener((TextWatcher)this);
        n.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        n.setPopupEditTextListener(this);
        n.setAdapter((ListAdapter)this.g);
        n.a(PopupEditText.a, PopupEditText.b, bz.h());
        n.setOnClickListener((View$OnClickListener)this);
        this.n = n;
        this.c(this.n.getText().toString());
        this.u = (this.n.getText().length() > 0);
        this.h();
        this.b.restartLoader(this.d, null, this);
        this.p = new aw();
        as.a((Context)this.j).a(new f((Context)this.j, this.l.b(), 3600000L * com.twitter.library.featureswitch.d.a("saved_searches_ttl_hours", 1)), this.e);
        n.post(this.k);
        a.a(this.l.b().g(), TwitterScribeLog.a(this.m, "search_box", null, "focus_field"));
        this.r = true;
        if (this.s != null) {
            this.s.b();
        }
        return true;
    }
    
    private boolean b(final jx jx) {
        if (!this.r) {
            return false;
        }
        SuggestionsProvider.a();
        this.n.removeTextChangedListener((TextWatcher)this);
        jx.e().clearFocus();
        this.i.a(this.o).a((TextView)this.n);
        com.twitter.util.t.a((Context)this.j, (View)this.n, false, this.i);
        this.i();
        this.r = false;
        if (this.s != null) {
            this.s.a();
        }
        return true;
    }
    
    private void c(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && SuggestionsProvider.a(s) == null) {
            as.a((Context)this.j).a(new com.twitter.library.api.search.z((Context)this.j, this.l.b(), s, 0, 0, "search_box"), this.f);
        }
    }
    
    private boolean f() {
        final String trim = this.n.getText().toString().trim();
        if (!TextUtils.isEmpty((CharSequence)trim) && !"#".equals(trim)) {
            this.j.startActivity(new Intent((Context)this.j, (Class)SearchActivity.class).setAction("com.twitter.android.action.SEARCH").putExtra("user_query", trim).putExtra("query", trim).putExtra("query_name", trim).putExtra("q_source", "typed_query"));
            return true;
        }
        return false;
    }
    
    private void g() {
        final SearchQueryView searchQueryView = (SearchQueryView)this.q.e();
        searchQueryView.setOnClearClickListener(this);
        searchQueryView.setContentDescription((CharSequence)this.j.getString(2131296421));
        this.v = searchQueryView.getCompoundDrawables();
    }
    
    private void h() {
        if (bj.e) {
            final PopupEditText n = this.n;
            final boolean u = this.u;
            Drawable drawable = null;
            if (u) {
                drawable = this.v[0];
            }
            n.setCompoundDrawablesWithIntrinsicBounds(drawable, this.v[1], this.v[2], this.v[3]);
            return;
        }
        final PopupEditText n2 = this.n;
        final Drawable drawable2 = this.v[0];
        final Drawable drawable3 = this.v[1];
        final boolean u2 = this.u;
        Drawable drawable4 = null;
        if (u2) {
            drawable4 = this.v[2];
        }
        n2.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, this.v[3]);
    }
    
    private void i() {
        if (!this.h.isEmpty()) {
            this.a.a(((TwitterScribeLog)new TwitterScribeLog(this.l.b().g()).b(new String[] { TwitterScribeLog.a(this.m, "search_box", "typeahead", "results") })).b(this.h));
            this.h.clear();
        }
    }
    
    public void I_() {
    }
    
    public SearchSuggestionController a(final TwitterScribeAssociation m) {
        if (m != null) {
            this.m = m;
        }
        return this;
    }
    
    public SearchSuggestionController a(final String s) {
        this.m.b(s);
        return this;
    }
    
    void a() {
        final Loader loader = this.b.getLoader(this.d);
        if (loader != null) {
            loader.onContentChanged();
        }
    }
    
    public void a(final int n) {
        final Cursor cursor = (Cursor)this.g.getItem(n);
        final int int1 = cursor.getInt(1);
        final String string = cursor.getString(4);
        final String string2 = cursor.getString(6);
        Uri parse;
        if (string2 != null) {
            parse = Uri.parse(string2);
        }
        else {
            parse = null;
        }
        final String string3 = cursor.getString(3);
        final String string4 = cursor.getString(2);
        final long long1 = cursor.getLong(11);
        this.o = string3;
        final Intent putExtra = new Intent((Context)this.j, (Class)SearchActivity.class).setAction(string).setData(parse).putExtra("user_query", this.o).putExtra("query", string3).putExtra("search_suggestion_position", n).putExtra("source_association", (Parcelable)this.m);
        if (long1 > 0L) {
            putExtra.putExtra("search_suggestion_id", long1);
        }
        kg.a(false, (Context)this.j, putExtra);
        switch (int1) {
            default: {}
            case 6:
            case 7: {
                putExtra.putExtra("query_name", string4).putExtra("search_type", 2);
                this.j.startActivity(putExtra);
            }
            case 9: {
                final int int2 = cursor.getInt(8);
                final boolean b = cursor.getInt(9) == 1;
                final boolean b2 = cursor.getInt(10) == 1;
                putExtra.putExtra("query", string3);
                putExtra.putExtra("query_name", string4);
                putExtra.putExtra("search_type", int2);
                putExtra.putExtra("near", b);
                putExtra.putExtra("follows", b2);
                this.j.startActivity(putExtra);
            }
            case 2: {
                final int int3 = cursor.getInt(8);
                putExtra.putExtra("query_name", string4);
                putExtra.putExtra("search_type", int3);
                this.j.startActivity(putExtra);
            }
            case 3:
            case 4:
            case 5:
            case 8: {
                putExtra.putExtra("query_name", string4);
                this.j.startActivity(putExtra);
            }
            case 1: {
                this.j.startActivity(putExtra);
            }
        }
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final Bundle bundle) {
        if (bundle != null) {
            this.t = bundle.getString("search_topic");
            final PromptDialogFragment promptDialogFragment = (PromptDialogFragment)this.j.getSupportFragmentManager().findFragmentByTag("TAG_CLEAR_RECENT_SEARCH_DIALOG");
            if (promptDialogFragment != null && this.t != null) {
                promptDialogFragment.a(new ax(this, this.t));
            }
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        this.g.a(this.o);
        this.g.swapCursor(cursor);
    }
    
    public void a(final be s) {
        this.s = s;
    }
    
    public void a(final ToolBar toolBar) {
        final jx a = toolBar.a(2131887418);
        a.a(new av(this));
        this.q = a;
        this.g();
    }
    
    public void a(final CharSequence charSequence) {
        this.c(charSequence.toString());
        this.b.restartLoader(this.d, null, this);
    }
    
    public void a(final CharSequence text, final boolean b) {
        if (this.n != null) {
            this.n.setText(text);
            this.a(text);
            if (b) {
                this.n.setSelection(text.length());
            }
        }
    }
    
    public boolean a(final SearchQueryView searchQueryView) {
        if (TextUtils.isEmpty((CharSequence)searchQueryView.getText())) {
            this.c();
        }
        else {
            searchQueryView.setText((CharSequence)null);
        }
        return false;
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean u = editable.length() > 0;
        if (u != this.u) {
            this.u = u;
            this.h();
        }
    }
    
    public SearchSuggestionController b(final String s) {
        this.m.c(s);
        return this;
    }
    
    public void b(final Bundle bundle) {
        bundle.putString("search_topic", this.t);
    }
    
    public void b(final CharSequence charSequence) {
        this.a(charSequence, false);
    }
    
    public boolean b() {
        return this.r;
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public boolean c() {
        return this.r && this.q != null && this.q.g();
    }
    
    public boolean e() {
        return !this.r && this.q != null && this.q.f();
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131887142) {
            final PopupEditText popupEditText = (PopupEditText)view;
            com.twitter.util.t.a((Context)this.j, (View)popupEditText, true);
            popupEditText.a();
        }
        else {
            if (id == 2131887232) {
                final String t = (String)view.getTag();
                final String string = this.j.getString(2131297519, new Object[] { t });
                this.t = t;
                PromptDialogFragment.b(1).c(2131297520).b(string).h(2131298158).j(2131297303).a(new ax(this, t)).show(this.c, "TAG_CLEAR_RECENT_SEARCH_DIALOG");
                return;
            }
            if (id == 2131887252) {
                this.a(view.getTag() + " ", true);
            }
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final String string = this.n.getText().toString();
        this.o = string;
        Uri uri;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            uri = SuggestionsProvider.i.buildUpon().appendPath(string).build();
        }
        else {
            uri = SuggestionsProvider.i;
        }
        return new CursorLoader((Context)this.j, uri, null, null, null, null);
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        return textView.getId() == 2131887142 && (n == 3 || (keyEvent != null && 66 == keyEvent.getKeyCode())) && this.f();
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        this.g.a(null);
        this.g.swapCursor(null);
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
