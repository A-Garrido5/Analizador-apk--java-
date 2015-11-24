// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.n;
import com.twitter.android.client.am;
import com.twitter.android.client.bh;
import java.util.Iterator;
import android.webkit.WebSettings;
import android.content.res.Resources;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import com.twitter.android.util.bl;
import android.webkit.WebViewClient;
import android.content.DialogInterface$OnCancelListener;
import android.app.ProgressDialog;
import android.app.Activity;
import com.twitter.android.widget.TurnOffReadabilityFragment;
import android.preference.PreferenceManager;
import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Intent;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.t;
import android.content.Context;
import com.twitter.library.network.ae;
import java.util.Map;
import android.net.Uri;
import com.twitter.library.network.OAuthToken;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.client.az;
import com.twitter.internal.android.widget.ToolBar;
import android.webkit.WebView;
import com.twitter.internal.android.widget.aq;
import com.twitter.android.client.TwitterFragmentActivity;

public class WebViewActivity extends TwitterFragmentActivity implements aq
{
    protected WebView a;
    protected boolean b;
    private String c;
    private ToolBar d;
    
    public WebViewActivity() {
        this.b = true;
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        toolBar.a(2131887418).b(false);
        toolBar.a(2131887417).b(false);
        return super.a(toolBar);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.b(6);
        bn.e(true);
        bn.c(2130969205);
        bn.d(false);
        return bn;
    }
    
    Map a(final OAuthToken oAuthToken, final Uri uri, final boolean b, final Map map) {
        final HashMap a = ae.a((Context)this).a(com.twitter.library.util.bn.a(uri.toString()));
        if (oAuthToken != null && b) {
            a.put("Authorization", new t(oAuthToken).a(HttpOperation$RequestMethod.a, com.twitter.library.util.bn.a(uri.toString()), null, 0L));
            if (map != null) {
                a.putAll(map);
            }
        }
        return a;
    }
    
    @Override
    public void a(final Bundle bundle, final Intent intent) {
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar d) {
        super.a(jv, this.d = d);
        if (this.c != null) {
            jv.a(2131951646, d);
            final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)this).inflate(2130968882, (ViewGroup)null);
            final jx jx = new jx(d, false);
            jx.a((View)linearLayout);
            jx.c(2);
            final ArrayList<jx> list = new ArrayList<jx>();
            list.add(jx);
            d.a(list);
        }
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887459: {
                this.G().a(this.T().b().g(), "settings::::disable_quick_read");
                PreferenceManager.getDefaultSharedPreferences((Context)this).edit().putBoolean("readability_mode", false).apply();
                TurnOffReadabilityFragment.a(this.c, this).show(this.getSupportFragmentManager(), null);
                return true;
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Resources resources = this.getResources();
        final Intent intent = this.getIntent();
        final Uri data = intent.getData();
        final Bundle extras = intent.getExtras();
        final OAuthToken oAuthToken = (OAuthToken)intent.getParcelableExtra("token");
        final HashMap hashMap = (HashMap)intent.getSerializableExtra("headers");
        final HashMap hashMap2 = (HashMap)intent.getSerializableExtra("com.twitter.android.EXTRA_POST_PARAMS");
        ProgressDialog show;
        if (com.twitter.android.client.c.a((Context)this).k()) {
            show = ProgressDialog.show((Context)this, (CharSequence)"", (CharSequence)this.getString(2131297168), true, true, (DialogInterface$OnCancelListener)new zi(this));
        }
        else {
            show = null;
        }
        this.a = (WebView)this.findViewById(2131886971);
        final WebSettings settings = this.a.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(extras == null || !extras.getBoolean("set_disable_javascript"));
        settings.setAllowFileAccess(false);
        this.a.setWebViewClient((WebViewClient)new zj(this, show, resources, oAuthToken, hashMap));
        if (bundle == null) {
            if (hashMap2 == null) {
                this.M().d();
                this.Q();
                this.b = false;
                this.c = data.toString();
                com.twitter.library.util.bn.a(this.a, data.toString(), this.a(oAuthToken, data, bl.a(this.c), hashMap));
                return;
            }
            this.b = true;
            final ArrayList<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
            for (final Map.Entry<String, V> entry : hashMap2.entrySet()) {
                final String s = entry.getKey();
                final String c = (String)entry.getValue();
                list.add(new BasicNameValuePair(s, c));
                if ("url".equals(s.trim())) {
                    this.c = c;
                }
            }
            this.G().a(this.T().b().g(), "quick_read::::impression");
            com.twitter.library.util.bn.a(this.a, data.toString(), com.twitter.library.util.bn.a(list).getBytes());
        }
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a.restoreState(bundle);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (!this.b) {
            this.d.d();
            return;
        }
        this.d.c();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.saveState(bundle);
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
    
    public void openBrowser(final View view) {
        this.G().a(this.T().b().g(), "quick_read::::open_in_browser");
        final zk zk = new zk((Context)this, this.c);
        if (bh.a((Context)this).g()) {
            am.a((Context)this, zk);
            return;
        }
        zk.a();
    }
}
