// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.widget.ProgressBar;
import android.webkit.WebView;
import com.twitter.internal.android.widget.ToolBar;
import android.net.Uri;
import android.content.Intent;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.client.as;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class BrowserActivity extends TwitterFragmentActivity implements h
{
    private b a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        (this.a = new b(this, this.G(), new i((Context)this, this.G(), this.k(), (Tweet)this.getIntent().getParcelableExtra("tweet"), new wp((Context)this, as.a((Context)this), az.a((Context)this))))).a(bn, this.getWindow());
        return bn;
    }
    
    @Override
    public void a(final int title) {
        this.setTitle(title);
    }
    
    @Override
    public void a(final Intent intent) {
        this.startActivity(intent);
    }
    
    @Override
    protected void a(final Uri uri) {
        this.a.d();
    }
    
    @Override
    public void a(final String title) {
        this.setTitle(title);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        this.a.a(jv, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (this.a.a(jx)) {
            super.a(jx);
        }
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.a.a((WebView)this.findViewById(2131886971), (ProgressBar)this.findViewById(2131887199));
        this.a.a(bundle, this.getIntent());
    }
    
    @Override
    public void b(final String s) {
        this.b(s);
    }
    
    @Override
    public void h() {
        super.onBackPressed();
    }
    
    @Override
    public boolean i() {
        return this.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }
    
    @Override
    public Context j() {
        return (Context)this;
    }
    
    public long k() {
        return this.U().g();
    }
    
    @Override
    public void l() {
        this.finish();
    }
    
    @Override
    public void onBackPressed() {
        this.a.c();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.a.b();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.a.a();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.a(bundle);
    }
}
