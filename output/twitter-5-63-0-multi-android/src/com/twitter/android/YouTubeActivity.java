// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.UserView;
import com.twitter.library.service.y;
import com.twitter.library.widget.ActionButton;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import android.app.Activity;
import com.google.android.youtube.player.k;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.am;
import com.twitter.library.scribe.TwitterScribeLog;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.e;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.library.widget.UserSocialView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.api.UrlEntity;
import android.widget.LinearLayout;
import com.google.android.youtube.player.d;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class YouTubeActivity extends TwitterFragmentActivity implements View$OnClickListener, d
{
    private String a;
    private long b;
    private long c;
    private LinearLayout d;
    private UrlEntity e;
    private String f;
    private String g;
    private Session h;
    private c i;
    private Tweet j;
    
    private void a(final long userId, final String s, final String s2, final boolean verified, final String userImageUrl, final int style) {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from((Context)this).inflate(2130968807, (ViewGroup)this.d, false);
        groupedRowView.setStyle(style);
        final UserSocialView userSocialView = (UserSocialView)groupedRowView.getChildAt(0);
        userSocialView.setUserImageUrl(userImageUrl);
        userSocialView.setUserId(userId);
        userSocialView.a(s, s2);
        userSocialView.setVerified(verified);
        userSocialView.l.setOnClickListener((View$OnClickListener)this);
        userSocialView.setOnClickListener((View$OnClickListener)this);
        this.d.addView((View)groupedRowView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
    }
    
    private void a(final String text) {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from((Context)this).inflate(2130968808, (ViewGroup)this.d, false);
        groupedRowView.setStyle(1);
        groupedRowView.a();
        ((TextView)groupedRowView.findViewById(2131886291)).setText((CharSequence)text);
        this.d.addView((View)groupedRowView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
    }
    
    private void h() {
        final TextView textView = (TextView)this.findViewById(2131887396);
        final TextView textView2 = (TextView)this.findViewById(2131887397);
        if (this.f != null) {
            textView.setText((CharSequence)this.f);
            textView.setVisibility(0);
        }
        if (this.g != null) {
            textView2.setText((CharSequence)this.g);
            textView2.setVisibility(0);
        }
    }
    
    private void i() {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from((Context)this).inflate(2130968808, (ViewGroup)this.d, false);
        groupedRowView.setStyle(3);
        this.d.addView((View)groupedRowView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, 1));
        this.a(this.getString(2131297798));
        this.a(this.j.f, this.j.z, this.j.a(), this.j.V, this.j.B, 3);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969225);
        return bn;
    }
    
    public void a(final e e, final YouTubeInitializationResult youTubeInitializationResult) {
        this.i.a(new TwitterScribeLog(this.c).b(new String[] { "tweet::tweet::open_link_youtube_in_app_error" }));
        am.a((Context)this, null, this.e, this.c, null, null, null, null);
        this.finish();
    }
    
    public void a(final e e, final com.google.android.youtube.player.c c, final boolean b) {
        if (!b) {
            c.a(this.a);
        }
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131886126) {
            super.onBackPressed();
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.h = az.a((Context)this).b();
        this.c = this.h.g();
        this.i = com.twitter.android.client.c.a((Context)this);
        this.a = intent.getStringExtra("video_id");
        this.c(intent);
        if (this.a != null) {
            while (true) {
                while (true) {
                    int n = 0;
                    Label_0575: {
                        try {
                            final String string = this.getPackageManager().getApplicationInfo(this.getPackageName(), 128).metaData.getString("com.google.android.youtube.player.ApiKey");
                            final String a = com.twitter.library.featureswitch.d.a("in_app_youtube_player_android_2413");
                            n = -1;
                            switch (a.hashCode()) {
                                case -1967431081: {
                                    if (a.equals("youtube_fullscreen")) {
                                        n = 0;
                                    }
                                    break Label_0575;
                                }
                                case -87820250: {
                                    if (a.equals("youtube_embedded")) {
                                        n = 1;
                                    }
                                    break Label_0575;
                                }
                                default: {
                                    break Label_0575;
                                }
                            }
                            this.b = intent.getLongExtra("tweet_id", -1L);
                            this.startActivity(com.google.android.youtube.player.k.a(this, string, this.a));
                            this.finish();
                            this.i.a(((TwitterScribeLog)new TwitterScribeLog(this.c).b(new String[] { "tweet::tweet::open_link_youtube_in_app" })).a(TwitterScribeItem.a(this.b, this.a)));
                            return;
                        }
                        catch (PackageManager$NameNotFoundException ex) {
                            this.i.a(((TwitterScribeLog)new TwitterScribeLog(this.c).b(new String[] { "tweet::tweet::api_key_error" })).a(TwitterScribeItem.d("com.google.android.youtube.player.ApiKey")));
                            am.a((Context)this, null, this.e, this.c, null, null, null, null);
                            this.finish();
                            return;
                        }
                        catch (NullPointerException ex2) {
                            this.i.a(((TwitterScribeLog)new TwitterScribeLog(this.c).b(new String[] { "tweet::tweet::api_key_error" })).a(TwitterScribeItem.d("com.google.android.youtube.player.ApiKey")));
                            am.a((Context)this, null, this.e, this.c, null, null, null, null);
                            this.finish();
                            return;
                        }
                        break;
                    }
                    switch (n) {
                        case 0: {
                            continue;
                        }
                        case 1: {
                            goto Label_0309;
                            goto Label_0309;
                        }
                    }
                    break;
                }
            }
        }
        this.i.a(new TwitterScribeLog(this.c).b(new String[] { "tweet::tweet::open_link_youtube_in_app_error" }));
        am.a((Context)this, null, this.e, this.c, null, null, null, null);
        this.finish();
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887398: {
                am.a((Context)this, null, this.e, this.c, null, null, null, null);
            }
            case 2131886080: {
                final ActionButton actionButton = (ActionButton)view;
                if (actionButton.isChecked()) {
                    this.j.r = 0;
                    this.a(new pe((Context)this, this.h, this.j.C, this.j.j));
                }
                else {
                    this.j.r = 1;
                    this.a(new pb((Context)this, this.h, this.j.C, this.j.j));
                }
                actionButton.toggle();
            }
            case 2131887335: {
                final UserView userView = (UserView)view;
                ProfileActivity.a((Context)this, userView.getUserId(), (String)userView.getUserName(), null, null);
            }
        }
    }
}
