// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.webkit.WebSettings;
import android.webkit.CookieManager;
import android.webkit.WebViewClient;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.net.Uri$Builder;
import com.twitter.library.api.account.m;
import android.text.TextUtils;
import android.content.Context;
import java.util.Locale;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.twitter.library.network.af;

class nf extends af
{
    final /* synthetic */ PasswordResetActivity a;
    
    nf(final PasswordResetActivity a) {
        this.a = a;
    }
    
    @Override
    protected boolean a(final WebView webView, final Uri uri) {
        if (this.a.b) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", uri).setFlags(268468224));
        }
        else {
            this.a.setResult(-1, new Intent((String)null, uri));
        }
        this.a.finish();
        return true;
    }
}
