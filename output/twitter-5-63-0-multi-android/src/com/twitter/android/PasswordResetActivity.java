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
import android.net.Uri;
import android.content.Context;
import java.util.Locale;
import android.webkit.WebView;
import com.twitter.android.client.TwitterFragmentActivity;

public class PasswordResetActivity extends TwitterFragmentActivity
{
    private WebView a;
    private boolean b;
    
    public PasswordResetActivity() {
        this.b = false;
    }
    
    static String a(final String s, final String s2, final Locale locale, final Context context) {
        Uri$Builder uri$Builder;
        if (s == null) {
            uri$Builder = Uri.parse("https://twitter.com/account/begin_password_reset").buildUpon();
        }
        else {
            uri$Builder = Uri.parse(s).buildUpon();
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            uri$Builder.appendQueryParameter("account_identifier", s2);
        }
        return zl.a(locale, m.a(context, uri$Builder.toString()));
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969205);
        bn.a(false);
        bn.d(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.a = (WebView)this.findViewById(2131886971);
        final WebSettings settings = this.a.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        this.a.setWebViewClient((WebViewClient)new nf(this));
        if (bundle == null) {
            CookieManager.getInstance().removeAllCookie();
            final String stringExtra = this.getIntent().getStringExtra("init_url");
            final String stringExtra2 = this.getIntent().getStringExtra("account_id");
            final Locale locale = this.getResources().getConfiguration().locale;
            this.b = (stringExtra != null);
            this.a.loadUrl(a(stringExtra, stringExtra2, locale, (Context)this));
            return;
        }
        this.b = bundle.getBoolean("launched_from_url");
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a.restoreState(bundle);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.saveState(bundle);
        bundle.putBoolean("launched_from_url", this.b);
    }
}
