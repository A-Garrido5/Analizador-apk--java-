// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.ToolBar;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.ToolBar$LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterWebViewActivity;

public class AdsCompanionWebViewActivity extends TwitterWebViewActivity
{
    public static Intent a(final Context context) {
        return new Intent(context, (Class)AdsCompanionWebViewActivity.class).setData(Uri.parse(context.getString(2131298168)));
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.b(14);
        bn.b(false);
        return bn;
    }
    
    @Override
    protected void a(final WebView webView, final String s) {
        this.setTitle(webView.getTitle());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final View inflate = this.getLayoutInflater().inflate(2130968592, (ViewGroup)null, false);
        final ToolBar m = this.M();
        if (m != null) {
            m.a(inflate, new ToolBar$LayoutParams(5));
        }
        inflate.findViewById(2131886249).setOnClickListener((View$OnClickListener)new ag(this));
        final Uri data = this.getIntent().getData();
        this.setTitle(2131296308);
        this.a(data.toString());
    }
    
    @Override
    protected void g_() {
        if (this.j()) {
            this.k();
            return;
        }
        super.g_();
    }
    
    @Override
    public void onBackPressed() {
        if (this.j()) {
            this.k();
            return;
        }
        super.onBackPressed();
    }
}
