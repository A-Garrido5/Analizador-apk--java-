// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import com.twitter.internal.android.service.c;
import com.twitter.library.api.account.o;
import com.twitter.library.client.as;
import android.text.TextUtils;
import android.view.View;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.az;
import android.content.Intent;
import android.accounts.Account;
import com.twitter.library.util.a;
import com.twitter.library.network.OAuthToken;
import android.widget.EditText;
import android.accounts.AccountManager;

public class AuthenticatorActivity extends BaseAccountAuthenticatorActivity
{
    Boolean a;
    private AccountManager b;
    private String c;
    private String d;
    private EditText e;
    
    private void b(final OAuthToken oAuthToken) {
        final Account account = new Account(this.d, com.twitter.library.util.a.a);
        final AccountManager b = this.b;
        b.setAuthToken(account, "com.twitter.android.oauth.token", oAuthToken.b);
        b.setAuthToken(account, "com.twitter.android.oauth.token.secret", oAuthToken.a);
    }
    
    void a(final OAuthToken oAuthToken) {
        this.b(oAuthToken);
        final Intent intent = new Intent();
        intent.putExtra("authAccount", this.d);
        intent.putExtra("accountType", com.twitter.library.util.a.a);
        if (this.c != null) {
            if (this.c.equals("com.twitter.android.oauth.token")) {
                intent.putExtra("authtoken", oAuthToken.b);
            }
            else if (this.c.equals("com.twitter.android.oauth.token.secret")) {
                intent.putExtra("authtoken", oAuthToken.a);
            }
        }
        this.setAccountAuthenticatorResult(intent.getExtras());
        this.setResult(-1, intent);
        final Session b = az.a((Context)this).b();
        if (b.d()) {
            b.a(oAuthToken);
        }
        this.finish();
    }
    
    void a(final OAuthToken oAuthToken, final boolean b) {
        this.b(oAuthToken);
        final Intent intent = new Intent();
        intent.putExtra("booleanResult", b);
        this.setAccountAuthenticatorResult(intent.getExtras());
        this.setResult(-1, intent);
        this.finish();
    }
    
    public void onClickHandler(final View view) {
        final String string = this.e.getText().toString();
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        this.showDialog(1);
        as.a((Context)this).a(new o((Context)this, az.a((Context)this).b(), this.d, string).a(new ai(this)));
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(3);
        this.setContentView(2130968858);
        this.getWindow().setFeatureDrawableResource(3, 17301543);
        this.b = AccountManager.get((Context)this);
        final Intent intent = this.getIntent();
        this.d = intent.getStringExtra("username");
        this.c = intent.getStringExtra("auth_token_type");
        this.a = intent.getBooleanExtra("confirm_credentials", false);
        if (TextUtils.isEmpty((CharSequence)this.d)) {
            Toast.makeText((Context)this, 2131296362, 0).show();
            this.finish();
            return;
        }
        ((TextView)this.findViewById(2131886909)).setText((CharSequence)this.d);
        this.e = (EditText)this.findViewById(2131886910);
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage(this.getText(2131296355));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        ScribeService.a((Context)this, new TwitterScribeLog(0L).b(new String[] { "login_dialog::::show" }));
    }
}
