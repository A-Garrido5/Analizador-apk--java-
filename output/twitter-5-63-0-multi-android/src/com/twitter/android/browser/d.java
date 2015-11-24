// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.webkit.WebResourceResponse;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class d extends WebViewClient
{
    final /* synthetic */ b a;
    
    d(final b a) {
        this.a = a;
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        this.a.e();
    }
    
    public void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
        this.a.a(webView, s);
    }
    
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.a.f();
    }
    
    public WebResourceResponse shouldInterceptRequest(final WebView webView, final String s) {
        return this.a.a(s);
    }
}
