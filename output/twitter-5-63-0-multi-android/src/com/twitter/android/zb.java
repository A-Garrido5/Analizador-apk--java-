// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.client.bh;
import android.text.TextWatcher;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.os.Handler;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import com.twitter.android.widget.ProgressDialogFragment;
import android.view.View$OnClickListener;
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
import android.content.Context;
import android.widget.Toast;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.Session;
import com.twitter.library.client.bd;

class zb implements bd
{
    final /* synthetic */ VerifyLoginActivity a;
    
    public zb(final VerifyLoginActivity a) {
        this.a = a;
    }
    
    private void a(final boolean b) {
        if (!b && this.a.b != null) {
            this.a.b.dismiss();
        }
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final int[] array, final boolean b) {
        if (this.a.isFinishing()) {
            return;
        }
        this.a(b);
        String s = null;
        if (n == 2) {
            final String string = this.a.getString(2131297928);
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)this.a.getIntent().getParcelableExtra("accountAuthenticatorResponse");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(400, string);
            }
            s = string;
        }
        else {
            int n3;
            if (array == null || array.length == 0) {
                n3 = 0;
            }
            else {
                n3 = array[0];
            }
            if (b && n3 != 241 && n3 != 88) {
                this.a.j = Math.round(1.2 * this.a.j);
                this.a.d.postDelayed((Runnable)new za(this.a, null), this.a.j);
                return;
            }
            if (!b) {
                if (this.a.i == 2) {
                    this.a.a("native_login:push_verification:backup_code", n2, n3);
                }
                else {
                    this.a.a("native_login:sms_verification:login_code", n2, n3);
                }
            }
            else {
                this.a.a("native_login:push_verification:polling", n2, n3);
            }
            switch (n3) {
                default: {
                    s = this.a.getString(2131297188);
                    break;
                }
                case 32: {
                    s = this.a.getString(2131298156);
                    break;
                }
                case 241: {
                    s = this.a.getString(2131297200);
                    break;
                }
                case 236: {
                    s = this.a.getString(2131298156);
                    break;
                }
            }
        }
        Toast.makeText((Context)this.a, (CharSequence)s, 1).show();
        this.a.setResult(0);
        this.a.G().a(this.a.U().g(), "login::::failure");
        this.a.finish();
    }
    
    @Override
    public void a(final Session session, final String s, final boolean b) {
        if (this.a.isFinishing()) {
            return;
        }
        final c a = this.a.G();
        final long g = this.a.U().g();
        final VerifyLoginActivity a2 = this.a;
        kq.a(a2, session, true, s, this.a.T());
        kq.a(a2, false, g, a);
        this.a(b);
        if (this.a.i == 2 && !b) {
            this.a.G().a(g, "native_login:push_verification:backup_code::success");
        }
        else if (this.a.i == 2) {
            this.a.G().a(g, "native_login:push_verification:polling::success");
        }
        else {
            this.a.G().a(g, "native_login:sms_verification:login_code::success");
        }
        final Intent intent = this.a.getIntent();
        final Intent intent2 = (Intent)intent.getParcelableExtra("android.intent.extra.INTENT");
        if (intent2 != null) {
            this.a.startActivity(intent2);
        }
        else if (intent.getBooleanExtra("start_main", false)) {
            MainActivity.a(a2, null);
        }
        this.a.setResult(-1, new Intent().putExtra("AbsFragmentActivity_account_name", session.e()).putExtra("session", (Parcelable)session).putExtra("user", s));
        Toast.makeText((Context)a2, 2131297199, 1).show();
        as.a((Context)a2).a(ab.a((Context)a2, session), (z)null);
        this.a.finish();
    }
}
