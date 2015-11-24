// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.webkit.WebSettings;
import com.twitter.library.api.account.m;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import com.twitter.library.client.bh;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.az;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.os.Handler;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.c;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import android.app.Activity;
import com.twitter.library.client.Session$LoginStatus;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.Session;
import com.twitter.library.client.bd;

class kp implements bd
{
    final /* synthetic */ LoginChallengeActivity a;
    
    public kp(final LoginChallengeActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final int[] array, final boolean b) {
        if (this.a.isFinishing()) {
            return;
        }
        final long g = this.a.U().g();
        String string2;
        if (n == 2) {
            final String string = this.a.getString(2131297928);
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)this.a.getIntent().getParcelableExtra("accountAuthenticatorResponse");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(400, string);
            }
            string2 = string;
        }
        else {
            if (array == null || !CollectionUtils.a(array, 88)) {
                this.a.e = Math.round(this.a.e * this.a.d);
                this.a.f.postDelayed((Runnable)new ko(this.a, null), (long)this.a.e);
                return;
            }
            string2 = this.a.getString(2131297031);
            this.a.G().a(g, "login_challenge::::rate_limit");
        }
        Toast.makeText((Context)this.a, (CharSequence)string2, 1).show();
        session.a(Session$LoginStatus.a);
        this.a.setResult(0);
        this.a.G().a(g, "login::::failure");
        this.a.finish();
    }
    
    @Override
    public void a(final Session session, final String s, final boolean b) {
        if (this.a.isFinishing()) {
            return;
        }
        final c i = this.a.G();
        final long g = this.a.U().g();
        kq.a(this.a, session, true, s, this.a.T());
        kq.a(this.a, false, g, i);
        i.a(g, "login_challenge::::success");
        final Intent intent = this.a.getIntent();
        final Intent intent2 = (Intent)intent.getParcelableExtra("android.intent.extra.INTENT");
        if (intent2 != null) {
            this.a.startActivity(intent2);
        }
        else if (intent.getBooleanExtra("start_main", false)) {
            MainActivity.a(this.a, null);
        }
        this.a.setResult(-1, new Intent().putExtra("AbsFragmentActivity_account_name", session.e()).putExtra("session", (Parcelable)session).putExtra("user", s));
        as.a((Context)this.a).a(ab.a((Context)this.a, session), (z)null);
        this.a.finish();
    }
}
