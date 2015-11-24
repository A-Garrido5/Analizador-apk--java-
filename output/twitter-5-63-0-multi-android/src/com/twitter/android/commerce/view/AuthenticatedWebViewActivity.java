// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterWebViewActivity;

public class AuthenticatedWebViewActivity extends TwitterWebViewActivity
{
    public static Intent a(final Context context, final String s) {
        return new Intent(context, (Class)AuthenticatedWebViewActivity.class).putExtra("web_view_url", s);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.b(true);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.a(this.getIntent().getStringExtra("web_view_url"));
    }
}
