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
import android.net.Uri$Builder;
import android.content.Context;
import com.twitter.library.network.ae;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.library.client.Session;
import android.webkit.WebView;
import android.view.View;
import android.view.View$OnClickListener;

class bx implements View$OnClickListener
{
    final /* synthetic */ TwitterWebViewActivity a;
    
    bx(final TwitterWebViewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.b.setVisibility(8);
        this.a.a.reload();
    }
}
