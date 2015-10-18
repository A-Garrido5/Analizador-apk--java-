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
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings$PluginState;
import android.os.Bundle;
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
import com.twitter.library.api.PromotedEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class e implements View$OnTouchListener
{
    final /* synthetic */ b a;
    
    e(final b a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            this.a.g.a(PromotedEvent.aC);
            this.a.g.a("scroll");
            this.a.c.setOnTouchListener((View$OnTouchListener)null);
        }
        return false;
    }
}
