// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import com.twitter.android.client.n;
import com.twitter.android.client.bh;
import android.widget.Toast;
import com.twitter.library.util.bq;
import com.twitter.internal.android.widget.ToolBar;
import android.view.Window;
import com.twitter.android.client.bn;
import com.twitter.android.client.am;
import android.annotation.TargetApi;
import android.webkit.WebSettings;
import android.net.Uri;
import android.view.View$OnTouchListener;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings$PluginState;
import android.os.Bundle;
import com.twitter.library.api.PromotedEvent;
import android.webkit.WebResourceResponse;
import com.twitter.android.composer.au;
import android.content.Intent;
import com.twitter.android.DMActivity;
import java.util.Map;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.ProgressBar;
import android.webkit.WebView;
import com.twitter.library.scribe.WebsiteAssetsLog;

public class b
{
    WebsiteAssetsLog a;
    private String b;
    private WebView c;
    private ProgressBar d;
    private g e;
    private h f;
    private i g;
    private Context h;
    private c i;
    private long j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    
    b(final h f, final c i, final i g) {
        this.f = f;
        this.g = g;
        this.h = f.j();
        this.i = i;
    }
    
    private WebsiteAssetsLog a(final Tweet tweet) {
        if (tweet != null && tweet.m()) {
            final CardInstanceData w = tweet.W();
            if (w != null) {
                final vc u = w.u();
                if (u != null) {
                    final Map a = vz.a("_card_data", u);
                    String s = null;
                    if (a != null) {
                        s = a.get("card_url");
                    }
                    final Map a2 = vk.a("_card_data", u);
                    int intValue;
                    if (a2 != null) {
                        intValue = a2.get("card_id");
                    }
                    else {
                        intValue = 0;
                    }
                    return new WebsiteAssetsLog(wb.a("website_url", u), wb.a("website_dest_url", u), wb.a("website_assets", u), s, intValue, tweet.j.impressionId);
                }
            }
        }
        return null;
    }
    
    private void g() {
        this.f.a(new Intent(this.h, (Class)DMActivity.class).putExtra("start_compose", true).putExtra("android.intent.extra.TEXT", "\n" + this.b).putExtra("keyboard_open", true));
    }
    
    private void h() {
        this.f.a(au.a(this.h).a('\n' + this.b, null).p());
    }
    
    WebResourceResponse a(final String s) {
        if (this.a != null) {
            final String b = com.twitter.android.browser.j.b(s);
            if (!"javascript".equals(b)) {
                this.a.a(s, 0L, 0L, b, false);
            }
        }
        return null;
    }
    
    protected void a() {
        if (this.k) {
            return;
        }
        this.g.a(System.currentTimeMillis() - this.j);
        this.g.a(PromotedEvent.aD);
        this.g.a("dismiss", this.e.c(this.b), this.m);
        this.k = true;
    }
    
    protected void a(final Bundle bundle) {
        bundle.putString("url", this.b);
    }
    
    @TargetApi(11)
    public void a(final Bundle bundle, final Intent intent) {
        final Uri data = intent.getData();
        if (bundle == null) {
            this.b = data.toString();
        }
        else {
            this.b = bundle.getString("url");
        }
        this.e = this.i.b();
        final Tweet tweet = (Tweet)intent.getParcelableExtra("tweet");
        this.n = (tweet != null && tweet.m());
        this.a = this.a(tweet);
        final WebSettings settings = this.c.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setPluginState(WebSettings$PluginState.OFF);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setUserAgentString(com.twitter.android.browser.j.a(this.h));
        if (this.f.i()) {
            settings.setDisplayZoomControls(false);
        }
        this.c.setWebChromeClient((WebChromeClient)new com.twitter.android.browser.c(this, this.d));
        this.c.setWebViewClient((WebViewClient)new d(this));
        this.c.setOnTouchListener((View$OnTouchListener)new e(this));
        final k b = this.e.b(this.b);
        if (b != null) {
            this.m = true;
            final String c = b.c();
            this.c.loadDataWithBaseURL(c, b.d(), b.b(), b.a(), c);
        }
        else {
            this.c.loadUrl(this.b);
        }
        this.g.a("native_browser_open", this.e.c(this.b), this.m);
    }
    
    public void a(final WebView c, final ProgressBar d) {
        this.c = c;
        this.d = d;
    }
    
    void a(final WebView webView, final String b) {
        if (this.j == 0L) {
            this.j = System.currentTimeMillis();
        }
        if (!this.l) {
            this.g.a();
        }
        this.b = b;
        this.d.setVisibility(0);
        if (am.b(this.h, this.b)) {
            webView.stopLoading();
            am.a(this.h, this.b, this.i.a().b().g());
            this.f.l();
        }
    }
    
    public void a(final bn bn, final Window window) {
        window.requestFeature(2);
        bn.b(12);
        bn.e(true);
        bn.c(2130968906);
        bn.d(false);
        bn.b(false);
        bn.a(false);
    }
    
    protected void a(final jv jv, final ToolBar toolBar) {
        this.f.a(2131297168);
        jv.a(2131951643, toolBar);
    }
    
    public boolean a(final jx jx) {
        switch (jx.a()) {
            default: {
                return true;
            }
            case 2131887453: {
                this.h();
                this.g.a("share_via_tweet");
                break;
            }
            case 2131887454: {
                this.g();
                this.g.a("share_tweet_privately");
                break;
            }
            case 2131887455: {
                bq.b(this.h, this.b);
                Toast.makeText(this.h, 2131296728, 1).show();
                this.g.a("copy_link");
                break;
            }
            case 2131887456: {
                this.openBrowser();
                this.g.a("open_in_browser");
                break;
            }
            case 2131886231: {
                bq.a(this.h, this.b);
                this.g.a("share");
                break;
            }
        }
        return false;
    }
    
    protected void b() {
        this.c.stopLoading();
        this.c.destroy();
    }
    
    void c() {
        if (this.c.canGoBack()) {
            this.c.goBack();
            return;
        }
        this.f.h();
    }
    
    void d() {
        this.f.h();
    }
    
    void e() {
        if (!this.l) {
            this.l = true;
            this.g.a(this.e.c(this.b), this.m);
            if (this.a != null) {
                this.g.a(this.a);
            }
        }
        this.d.setVisibility(8);
    }
    
    void f() {
        this.openBrowser();
        this.c();
    }
    
    void openBrowser() {
        final f f = new f(this.h, this.b);
        if (bh.a(this.h).g()) {
            am.a(this.h, f);
            return;
        }
        f.a();
    }
}
