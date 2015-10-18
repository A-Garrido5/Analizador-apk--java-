// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.android.autocomplete.a;
import com.twitter.android.client.bz;
import android.text.Editable;
import android.content.Intent;
import android.widget.Toast;
import android.text.TextUtils;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.conversations.ak;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.Session;
import android.os.Bundle;
import java.util.HashSet;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import java.util.Collection;
import com.twitter.library.api.conversations.af;
import java.util.Collections;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import com.twitter.util.k;
import com.twitter.library.api.conversations.ad;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.autocomplete.c;

public class DMComposeFragment extends SelectionFragment implements c
{
    private String k;
    private boolean l;
    private boolean m;
    private QuotedTweetData n;
    private boolean o;
    private boolean p;
    
    public DMComposeFragment() {
        super(new cu((ct)null));
    }
    
    private void a(final TwitterUser twitterUser, final ad ad) {
        if (ad.a) {
            this.a(twitterUser.userId, com.twitter.util.k.a(twitterUser.name), twitterUser);
            return;
        }
        new AlertDialog$Builder((Context)this.getActivity()).setMessage(2131296842).setNeutralButton(2131297362, (DialogInterface$OnClickListener)null).create().show();
    }
    
    private void b(final String s) {
        final af af = new af((Context)this.getActivity(), this.j(), Collections.singletonList(s));
        this.k = af.b;
        as.a((Context)this.getActivity()).a(af, new cv(this, null));
    }
    
    private int c(final long n) {
        final HashSet<Long> set = new HashSet<Long>(this.e());
        if (this.i != null) {
            set.addAll((Collection<?>)this.i);
        }
        if (n != -1L) {
            set.add(n);
        }
        set.remove(this.j().g());
        return set.size();
    }
    
    private void h() {
        this.k = "";
    }
    
    private Bundle i() {
        Bundle arguments = this.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            this.setArguments(arguments);
        }
        return arguments;
    }
    
    private Session j() {
        return this.c.b();
    }
    
    private void k() {
        this.p = (this.c(-1L) > 0);
        this.d.b();
    }
    
    private void l() {
        this.m = !CollectionUtils.a((Collection)this.e());
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof TwitterFragmentActivity) {
            ((TwitterFragmentActivity)activity).Q();
        }
    }
    
    @Override
    public int a() {
        return -1 + ak.a();
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View a = super.a(layoutInflater, 2130968716, viewGroup);
        final int color = this.getResources().getColor(2131689557);
        final int argb = Color.argb(127, Color.red(color), Color.green(color), Color.blue(color));
        a.findViewById(2131886593).setBackgroundColor(argb);
        a.findViewById(2131886630).setBackgroundColor(argb);
        this.d.setQueryTransformer(this);
        return a;
    }
    
    public String a(final String s) {
        return cy.a(s, this.p || this.l || (TextUtils.isEmpty((CharSequence)s) && !this.o));
    }
    
    @Override
    protected void a(final long n, final String s, final Object o) {
        if (this.c(n) <= this.a()) {
            if (!this.i.contains(n)) {
                super.a(n, s, o);
            }
            this.l();
            this.k();
            return;
        }
        Toast.makeText((Context)this.getActivity(), (CharSequence)this.getResources().getString(2131296880), 0).show();
    }
    
    public void a(final Intent intent) {
        final Bundle i = this.i();
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            i.putAll(extras);
        }
    }
    
    public boolean a(final String s, final long n, final Object o) {
        final long g = this.j().g();
        String s2;
        if (o instanceof TwitterUser) {
            final TwitterUser twitterUser = (TwitterUser)o;
            s2 = "user_list:user";
            this.a(n, com.twitter.util.k.a(twitterUser.name), o);
        }
        else if (o instanceof String) {
            this.b((String)o);
            s2 = "typeahead:query";
        }
        else if (o instanceof cw) {
            ((DMActivity)this.getActivity()).a(((cw)o).a);
            s2 = "user_list:conversation";
        }
        else {
            s2 = null;
        }
        if (s2 != null) {
            String s3;
            if (this.o) {
                s3 = "share_tweet_user_select";
            }
            else {
                s3 = "compose";
            }
            this.b.a(g, "messages", s3, s2, "select");
        }
        return true;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        super.afterTextChanged(editable);
        this.k();
        this.l();
    }
    
    public boolean b() {
        return this.d != null && !TextUtils.isEmpty((CharSequence)this.d.getText());
    }
    
    public boolean c() {
        return this.m;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final FragmentActivity activity = this.getActivity();
        if (this.l) {
            activity.setTitle(2131296816);
        }
        else if (this.o) {
            activity.setTitle(2131296854);
        }
        else {
            activity.setTitle(2131296853);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final Session j = this.j();
        final com.twitter.library.client.k k = new com.twitter.library.client.k((Context)activity, j.e(), "dm");
        if (86400000L + k.getLong("followers_timestamp", 0L) < currentTimeMillis) {
            k.a().a("followers_timestamp", currentTimeMillis).apply();
            as.a((Context)activity).a(new oy((Context)activity, j, 1).c(400));
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        this.l = arguments.getBoolean("add_participants");
        this.n = (QuotedTweetData)arguments.get("quoted_tweet");
        this.o = (this.n != null);
        final boolean boolean1 = arguments.getBoolean("is_from_other_app");
        final long g = this.j().g();
        String s;
        if (this.o) {
            s = "share_tweet_user_select";
        }
        else {
            s = "compose";
        }
        String s2;
        if (boolean1) {
            s2 = "external_share";
        }
        else {
            s2 = "";
        }
        this.b.a(g, "messages", s, "", s2, "impression");
        final FragmentActivity activity = this.getActivity();
        this.f = new cy((Context)activity, new dj((Context)activity, this.j(), bz.h(), "compose_message"), g);
        this.g = new ck((Context)activity, this);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        final Session j = this.j();
        if (this.o && j != null && j.f() != null && j.f().followersCount == 0) {
            ShareTweetEmptyOverlay.a(this.n, this);
        }
    }
    
    @Override
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.h();
    }
}
