// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.n;
import com.twitter.android.client.am;
import com.twitter.android.client.bh;
import java.util.Iterator;
import android.webkit.WebSettings;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import com.twitter.android.widget.TurnOffReadabilityFragment;
import android.preference.PreferenceManager;
import java.util.Collection;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.t;
import com.twitter.library.network.ae;
import android.os.Bundle;
import com.twitter.library.client.az;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.internal.android.widget.aq;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.c;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import android.content.Intent;
import com.twitter.library.util.bn;
import java.util.Map;
import android.net.Uri;
import com.twitter.android.util.bl;
import android.view.View;
import android.content.Context;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.featureswitch.d;
import android.webkit.WebView;
import java.util.HashMap;
import com.twitter.library.network.OAuthToken;
import android.content.res.Resources;
import android.app.ProgressDialog;
import android.webkit.WebViewClient;

class zj extends WebViewClient
{
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ Resources b;
    final /* synthetic */ OAuthToken c;
    final /* synthetic */ HashMap d;
    final /* synthetic */ WebViewActivity e;
    
    zj(final WebViewActivity e, final ProgressDialog a, final Resources b, final OAuthToken c, final HashMap d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onLoadResource(final WebView webView, final String s) {
        final String url = webView.getUrl();
        final String g = com.twitter.library.featureswitch.d.g("readability_v2_proxy_uri");
        if (url != null && url.startsWith(g) && !s.startsWith(g) && this.a != null && this.a.isShowing()) {
            this.a.dismiss();
        }
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        if (this.a != null && this.a.isShowing()) {
            this.a.dismiss();
        }
    }
    
    public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        this.e.G().a(this.e.T().b().g(), "quick_read::::redirect");
        if (!TelephonyUtil.c((Context)this.e)) {
            webView.loadData("<h2>" + this.e.getString(2131297513) + "</h2><p>" + this.e.getString(2131297514) + "</p><ul><li>" + this.e.getString(2131297512) + "</li></ul>", "text/html", "UTF-8");
            return;
        }
        this.e.openBrowser(null);
        this.e.finish();
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        int n = 1;
        final boolean a = bl.a(s);
        final Uri parse = Uri.parse(s);
        if (a || this.b.getString(2131298285).equals(parse.getAuthority())) {
            bn.a(this.e.a, s, this.e.a(this.c, parse, a, this.d));
            n = 0;
        }
        else {
            this.e.startActivity(new Intent("android.intent.action.VIEW", parse));
            if (s != null) {
                while (true) {
                    try {
                        final String host = new URL(s).toURI().getHost();
                        if (host == null || "t.co".equalsIgnoreCase(host)) {
                            final c d = this.e.G();
                            final long g = this.e.T().b().g();
                            final String[] array = new String[n];
                            array[0] = "quick_read::::redirect";
                            d.a(g, array);
                            this.e.finish();
                            return n != 0;
                        }
                    }
                    catch (URISyntaxException ex) {
                        final String host = null;
                        continue;
                    }
                    catch (MalformedURLException ex2) {
                        final String host = null;
                        continue;
                    }
                    break;
                }
            }
        }
        return n != 0;
    }
}
