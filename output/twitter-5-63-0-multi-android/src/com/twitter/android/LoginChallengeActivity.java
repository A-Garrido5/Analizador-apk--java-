// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.account.m;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import com.twitter.library.client.bh;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.os.Handler;
import com.twitter.android.client.TwitterFragmentActivity;

public class LoginChallengeActivity extends TwitterFragmentActivity
{
    String a;
    private final kp b;
    private int c;
    private float d;
    private int e;
    private Handler f;
    private LoginVerificationRequiredResponse g;
    private String h;
    private String i;
    private Session j;
    private String k;
    
    public LoginChallengeActivity() {
        this.b = new kp(this);
    }
    
    private void h() {
        this.G().a(this.U().g(), "login_challenge::::cancel");
        if (this.j != null) {
            this.j.a(Session$LoginStatus.a);
        }
    }
    
    private void i() {
        this.c = com.twitter.library.featureswitch.d.a("login_challenge_polling_interval", 0);
        if (this.c == 0) {
            this.c = 2;
        }
        this.c *= (int)1000L;
        this.d = com.twitter.library.featureswitch.d.a("login_challenge_polling_backoff", 0.0f);
        if (this.d == 0.0f) {
            this.d = 1.2f;
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969205);
        bn.a(false);
        bn.d(false);
        bn.b(false);
        return bn;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131886126) {
            this.h();
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.i();
        if (bundle == null) {
            this.G().a(this.U().g(), "login_challenge::::impression");
            final Intent intent = this.getIntent();
            this.g = (LoginVerificationRequiredResponse)intent.getParcelableExtra("login_challenge_required_response");
            this.h = intent.getStringExtra("username");
            this.i = intent.getStringExtra("session_id");
        }
        else {
            this.k = bundle.getString("url");
            this.a = bundle.getString("reqId");
            this.T().a(this.a, this.b);
            this.i = bundle.getString("session_id");
            this.g = (LoginVerificationRequiredResponse)bundle.getParcelable("login_challenge_required_response");
            this.h = bundle.getString("username");
        }
        if (this.g == null) {
            this.finish();
        }
        this.f = new Handler();
        final WebView webView = (WebView)this.findViewById(2131886971);
        final WebSettings settings = webView.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        webView.setWebViewClient((WebViewClient)new kn(this));
        if (this.k == null) {
            this.k = this.g.d;
        }
        this.k = com.twitter.library.api.account.m.a((Context)this, this.k);
        webView.loadUrl(this.k = zl.a(this.getResources().getConfiguration().locale, this.k));
    }
    
    @Override
    public void onBackPressed() {
        this.h();
        super.onBackPressed();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.T().e(this.a);
    }
    
    public void onResume() {
        super.onResume();
        final az t = this.T();
        this.j = t.c(this.i);
        if (this.j == null) {
            this.j = t.a(this.h);
            this.i = this.j.c();
        }
        this.e = this.c;
        this.f.postDelayed((Runnable)new ko(this, null), (long)this.e);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putString("url", this.k);
        bundle.putString("reqId", this.a);
        bundle.putString("session_id", this.i);
        bundle.putParcelable("login_challenge_required_response", (Parcelable)this.g);
        bundle.putSerializable("username", (Serializable)this.h);
        super.onSaveInstanceState(bundle);
    }
}
