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
import com.twitter.library.client.bh;
import android.os.Bundle;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.os.Handler;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.Map;
import com.twitter.library.util.bn;
import com.twitter.library.client.bd;
import android.text.TextUtils;
import android.net.Uri;
import android.webkit.WebView;
import com.twitter.library.network.af;

class kn extends af
{
    final /* synthetic */ LoginChallengeActivity a;
    
    kn(final LoginChallengeActivity a) {
        this.a = a;
    }
    
    @Override
    protected boolean a(final WebView webView, final String s, final Uri uri) {
        final String lastPathSegment = uri.getLastPathSegment();
        final String queryParameter = uri.getQueryParameter("over_limit");
        if (!TextUtils.isEmpty((CharSequence)lastPathSegment) && "success".equals(lastPathSegment)) {
            this.a.a = this.a.T().a(this.a.j, this.a.g.a, this.a.g.b, this.a.b);
            this.a.k = s;
            bn.a(webView, s, (Map)null);
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)queryParameter) && "true".equals(queryParameter)) {
            this.a.G().a(this.a.U().g(), "login_challenge::::limit_exceeded");
            this.a.k = s;
            bn.a(webView, s, (Map)null);
            return true;
        }
        this.a.k = s;
        bn.a(webView, s, (Map)null);
        return true;
    }
    
    public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        this.a.G().a(this.a.U().g(), "login_challenge:webview:::failure");
    }
}
