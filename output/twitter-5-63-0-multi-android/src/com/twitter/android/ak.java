// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.library.service.AuthTokenService;
import android.accounts.Account;
import android.content.Context;
import android.widget.Toast;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Intent;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.service.j;

class ak implements j
{
    final /* synthetic */ AuthorizeAppActivity a;
    
    public ak(final AuthorizeAppActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n, final OAuthToken oAuthToken, final String s, final long n2) {
        this.a.i();
        switch (n) {
            default: {
                this.a.a(2131296290);
            }
            case 200: {
                if (oAuthToken != null) {
                    this.a.setResult(-1, new Intent().putExtra("tk", oAuthToken.b).putExtra("ts", oAuthToken.a).putExtra("screen_name", s).putExtra("user_id", n2));
                }
                this.a.finish();
            }
            case 401:
            case 403: {
                this.a.a(2131296363);
            }
        }
    }
}
