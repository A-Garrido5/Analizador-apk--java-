// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class af extends WebViewClient
{
    protected boolean a(final WebView webView, final Uri uri) {
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }
    
    protected boolean a(final WebView webView, final String s, final Uri uri) {
        return false;
    }
    
    protected boolean b(final WebView webView, final String s, final Uri uri) {
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        final Uri parse = Uri.parse(s);
        final Context context = webView.getContext();
        final String string = context.getString(lg.twitter_authority);
        final String string2 = context.getString(lg.twitter_support_authority);
        final String host = parse.getHost();
        final boolean b = host != null && (host.equals(string) || host.endsWith("." + string));
        if ("twitter".equals(parse.getScheme())) {
            return this.a(webView, parse);
        }
        if (string2.equals(host)) {
            return this.b(webView, s, parse);
        }
        if (!b) {
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
            return true;
        }
        return this.a(webView, s, parse);
    }
}
