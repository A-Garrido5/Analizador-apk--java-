// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import android.annotation.SuppressLint;
import java.net.URISyntaxException;
import java.net.URI;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import android.net.Uri;
import android.webkit.WebView;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.client.ad;
import android.content.Context;
import com.twitter.android.client.TwitterWebViewActivity;

public class BouncerWebViewActivity extends TwitterWebViewActivity
{
    private boolean a;
    private boolean b;
    
    public BouncerWebViewActivity() {
        this.a = false;
        this.b = false;
    }
    
    public static void a(final Context context, final String s, final boolean b) {
        if (!ad.a().c()) {
            return;
        }
        final Intent intent = new Intent(context, (Class)BouncerWebViewActivity.class);
        intent.putExtra("bounce_location", s);
        intent.putExtra("bouncer_skippable", b);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        if (this.getIntent().getBooleanExtra("bouncer_skippable", false)) {
            a.b(6);
            return a;
        }
        a.b(2);
        return a;
    }
    
    @Override
    protected boolean a(final WebView webView, final Uri uri) {
        if (TextUtils.isEmpty((CharSequence)uri.getPath()) || uri.getPath().equalsIgnoreCase("/")) {
            this.finish();
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951618, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887402: {
                this.G().a(this.T().b().g(), "bouncer:::sign_out:click");
                this.startActivityForResult(new Intent((Context)this, (Class)RemoveAccountDialogActivity.class).putExtra("RemoveAccountDialogActivity_account_name", this.U().e()), 1);
                return true;
            }
            case 2131887401: {
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.getString(2131298179))));
                return true;
            }
        }
    }
    
    @SuppressLint({ "SetJavaScriptEnabled" })
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final Intent intent = this.getIntent();
        this.b = intent.getBooleanExtra("bouncer_skippable", false);
        String s = intent.getStringExtra("bounce_location");
        if (s == null) {
            s = this.getString(2131298191);
        }
        try {
            this.a(new URI(this.getString(2131298288)).resolve(s).toString());
        }
        catch (URISyntaxException ex) {
            this.finish();
        }
    }
    
    @Override
    protected boolean b(final WebView webView, final Uri uri) {
        this.finish();
        return true;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
                break;
            }
            case 1: {
                if (n2 != -1) {
                    break;
                }
                if (intent.getBooleanExtra("is_last", false)) {
                    DispatchActivity.a(this);
                    return;
                }
                this.finish();
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.b) {
            super.onBackPressed();
            return;
        }
        final Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        this.startActivity(intent);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        if (this.a) {
            this.i();
        }
        this.a = true;
    }
}
