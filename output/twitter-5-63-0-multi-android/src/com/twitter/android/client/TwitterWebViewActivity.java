// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.Intent;
import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebChromeClient;
import android.widget.ProgressBar;
import android.webkit.WebViewClient;
import android.view.View$OnClickListener;
import android.net.Uri$Builder;
import android.content.Context;
import com.twitter.library.network.ae;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.library.client.Session;
import android.view.View;
import android.webkit.WebView;

public abstract class TwitterWebViewActivity extends TwitterFragmentActivity
{
    private WebView a;
    private View b;
    private boolean c;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969019);
        bn.b(false);
        bn.a(false);
        bn.d(true);
        return bn;
    }
    
    protected void a(final WebView webView, final String s) {
    }
    
    public void a(final String s) {
        if (this.c) {
            final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
            final ae a = ae.a((Context)this);
            if (a.c()) {
                buildUpon.appendQueryParameter("dtab_local", a.d());
            }
            this.a.loadUrl(buildUpon.toString());
            return;
        }
        final Uri$Builder buildUpon2 = Uri.parse("https://twitter.com/account/authenticate_web_view").buildUpon();
        buildUpon2.appendQueryParameter("redirect_url", s);
        com.twitter.library.util.bn.a(this.a, buildUpon2.toString(), this.U().h());
    }
    
    protected boolean a(final WebView webView, final Uri uri) {
        return false;
    }
    
    @SuppressLint({ "SetJavaScriptEnabled" })
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.a = (WebView)this.findViewById(2131886971);
        final WebSettings settings = this.a.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setUserAgentString(settings.getUserAgentString() + " " + ae.a((Context)this).h.toString());
        (this.b = this.findViewById(2131887233)).setOnClickListener((View$OnClickListener)new bx(this));
        this.a.setWebViewClient((WebViewClient)new by(this));
        if (this.h()) {
            final ProgressBar progressBar = (ProgressBar)this.findViewById(2131887199);
            progressBar.setVisibility(0);
            this.a.setWebChromeClient((WebChromeClient)new b(progressBar));
        }
    }
    
    protected void b(final WebView webView, final String s) {
    }
    
    protected boolean b(final WebView webView, final Uri uri) {
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        this.finish();
        return true;
    }
    
    protected boolean h() {
        return false;
    }
    
    public void i() {
        this.a.reload();
    }
    
    public boolean j() {
        return this.a.canGoBack();
    }
    
    public void k() {
        this.a.goBack();
    }
}
