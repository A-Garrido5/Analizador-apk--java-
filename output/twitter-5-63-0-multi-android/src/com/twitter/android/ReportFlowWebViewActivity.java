// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri$Builder;
import android.content.Intent;
import com.twitter.internal.android.widget.ToolBar;
import android.view.View;
import android.net.Uri;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.ToolBar$LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.provider.b;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.android.client.TwitterWebViewActivity;

public class ReportFlowWebViewActivity extends TwitterWebViewActivity
{
    private boolean a;
    private long b;
    
    public ReportFlowWebViewActivity() {
        this.a = false;
    }
    
    private void a(final int result) {
        this.setResult(result);
        this.finish();
    }
    
    private void a(final long n) {
        final bg a = bg.a((Context)this, this.U().g());
        final b b = new b(this.getContentResolver());
        a.a(n, b);
        b.a();
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.b(14);
        return a;
    }
    
    public void a(final WebView webView, final String s) {
        if (s.toLowerCase().startsWith(this.getString(2131298247))) {
            final View inflate = this.getLayoutInflater().inflate(2130969020, (ViewGroup)null, false);
            final ToolBar m = this.M();
            if (m != null) {
                m.a(inflate, new ToolBar$LayoutParams(5));
            }
            inflate.findViewById(2131886249).setOnClickListener((View$OnClickListener)new qa(this));
            this.a = true;
            final Uri parse = Uri.parse(s);
            final String queryParameter = parse.getQueryParameter("action");
            if (queryParameter != null) {
                int n = 0;
                Label_0147: {
                    switch (queryParameter.hashCode()) {
                        case -382454902: {
                            if (queryParameter.equals("unfollow")) {
                                n = 0;
                                break Label_0147;
                            }
                            break;
                        }
                        case 3363353: {
                            if (queryParameter.equals("mute")) {
                                n = 1;
                                break Label_0147;
                            }
                            break;
                        }
                        case 93832333: {
                            if (queryParameter.equals("block")) {
                                n = 2;
                                break Label_0147;
                            }
                            break;
                        }
                        case 96784904: {
                            if (queryParameter.equals("error")) {
                                n = 3;
                                break Label_0147;
                            }
                            break;
                        }
                    }
                    n = -1;
                }
                switch (n) {
                    default: {
                        this.a(-1);
                        break;
                    }
                    case 3: {
                        break;
                    }
                    case 0: {
                        this.a(1);
                    }
                    case 1: {
                        this.a(2);
                    }
                    case 2: {
                        this.a(3);
                    }
                }
            }
            else if (this.b > 0L) {
                final String queryParameter2 = parse.getQueryParameter("report_type");
                if ("annoying".equalsIgnoreCase(queryParameter2) || "spam".equalsIgnoreCase(queryParameter2)) {
                    this.a(this.b);
                }
            }
        }
    }
    
    @Override
    protected boolean a(final WebView webView, final Uri uri) {
        if (uri.toString().toLowerCase().startsWith(this.getString(2131298249))) {
            return false;
        }
        com.twitter.library.util.bn.b((Context)this, uri);
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(this.getString(2131297558));
        final Intent intent = this.getIntent();
        final String value = String.valueOf(this.U().g());
        final String value2 = String.valueOf(intent.getLongExtra("spammer_id", 0L));
        final long longExtra = intent.getLongExtra("status_id", 0L);
        String s;
        if (longExtra > 0L) {
            s = "reporttweet";
        }
        else {
            s = "reportprofile";
        }
        final String value3 = String.valueOf(intent.getBooleanExtra("is_media", false));
        String value4;
        if (longExtra > 0L) {
            value4 = String.valueOf(intent.getBooleanExtra("is_promoted", false));
        }
        else {
            value4 = "false";
        }
        final Uri$Builder buildUpon = Uri.parse(this.getString(2131298248)).buildUpon();
        buildUpon.appendQueryParameter("source", s);
        buildUpon.appendQueryParameter("reporter_user_id", value);
        buildUpon.appendQueryParameter("reported_tweet_id", String.valueOf(longExtra));
        buildUpon.appendQueryParameter("reported_user_id", value2);
        buildUpon.appendQueryParameter("is_media", value3);
        buildUpon.appendQueryParameter("is_promoted", value4);
        this.a(buildUpon.toString());
        this.b = longExtra;
    }
    
    @Override
    protected void g_() {
        if (this.a) {
            this.finish();
            return;
        }
        super.g_();
    }
    
    @Override
    protected boolean h() {
        return true;
    }
    
    @Override
    public void onBackPressed() {
        if (!this.a && this.j()) {
            this.k();
            return;
        }
        super.onBackPressed();
    }
}
