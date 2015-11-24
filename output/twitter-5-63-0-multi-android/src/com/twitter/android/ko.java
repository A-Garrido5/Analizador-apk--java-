// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.account.m;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import com.twitter.library.client.bh;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.os.Handler;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.bd;

class ko implements Runnable
{
    final /* synthetic */ LoginChallengeActivity a;
    
    private ko(final LoginChallengeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.isFinishing()) {
            return;
        }
        this.a.a = this.a.T().a(this.a.j, this.a.g.a, this.a.g.b, this.a.b);
    }
}
