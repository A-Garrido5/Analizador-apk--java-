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
import android.os.Bundle;
import com.twitter.library.client.Session;
import android.view.View;
import android.graphics.Bitmap;
import com.twitter.library.util.bn;
import android.net.Uri;
import android.webkit.WebView;
import com.twitter.library.network.af;

class by extends af
{
    final /* synthetic */ TwitterWebViewActivity a;
    
    by(final TwitterWebViewActivity a) {
        this.a = a;
    }
    
    @Override
    protected boolean a(final WebView webView, final Uri uri) {
        return this.a.b(webView, uri);
    }
    
    @Override
    protected boolean a(final WebView webView, final String s, final Uri uri) {
        final boolean a = this.a.a(webView, uri);
        if (a || this.a.c) {
            return a;
        }
        if ("https://twitter.com/account/authenticate_web_view".equalsIgnoreCase(bn.a(uri).toString())) {
            bn.a(this.a.a, uri.toString(), this.a.U().h());
            return true;
        }
        this.a.c = true;
        this.a.a(s);
        return true;
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        this.a.a(webView, s);
    }
    
    public void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
        if (!"about:blank".equalsIgnoreCase(s)) {
            this.a.b.setVisibility(8);
        }
        this.a.b(webView, s);
    }
    
    public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        this.a.a.loadDataWithBaseURL((String)null, "", "text/html", "UTF-8", s2);
        this.a.b.setVisibility(0);
    }
}
