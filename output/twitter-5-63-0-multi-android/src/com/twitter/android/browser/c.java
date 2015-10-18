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
import android.content.Context;
import com.twitter.library.scribe.WebsiteAssetsLog;
import com.twitter.library.util.bn;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.android.client.b;

class c extends b
{
    final /* synthetic */ com.twitter.android.browser.b a;
    
    c(final com.twitter.android.browser.b a, final ProgressBar progressBar) {
        this.a = a;
        super(progressBar);
    }
    
    public void onReceivedTitle(final WebView webView, final String s) {
        super.onReceivedTitle(webView, s);
        if (!bn.e(s)) {
            this.a.f.a(s);
            this.a.f.b(this.a.b);
        }
    }
}
