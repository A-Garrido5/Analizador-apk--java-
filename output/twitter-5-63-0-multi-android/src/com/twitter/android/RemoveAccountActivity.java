// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.client.ay;
import android.os.Bundle;
import android.content.Intent;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.android.client.TwitterPreferenceActivity;

public class RemoveAccountActivity extends TwitterPreferenceActivity
{
    AccountAuthenticatorResponse a;
    String b;
    boolean c;
    private ps d;
    
    private void b() {
        this.finish();
        if (this.c) {
            this.moveTaskToBack(true);
        }
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1) {
            this.b();
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.a = null;
        this.c = false;
        this.setTitle((CharSequence)(this.b = intent.getStringExtra("RemoveAccountActivity_account_name")));
        if (intent.hasExtra("authenticator_response")) {
            this.a = (AccountAuthenticatorResponse)intent.getParcelableExtra("authenticator_response");
        }
        if (intent.hasExtra("from_system_settings")) {
            this.c = intent.getBooleanExtra("from_system_settings", false);
        }
        this.d = new ps(this);
        this.l().a(this.d);
        this.startActivityForResult(new Intent((Context)this, (Class)RemoveAccountDialogActivity.class).putExtra("RemoveAccountDialogActivity_account_name", this.b), 1);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.l().b(this.d);
    }
}
