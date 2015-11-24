// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import com.twitter.library.util.a;
import android.accounts.AccountManager;
import com.twitter.android.RemoveAccountActivity;
import com.twitter.library.api.account.p;
import com.twitter.android.AuthenticatorActivity;
import android.accounts.Account;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.LoginActivity;
import android.os.Bundle;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.accounts.AbstractAccountAuthenticator;

public class d extends AbstractAccountAuthenticator
{
    private final Context a;
    
    public d(final Context a) {
        super(a);
        this.a = a;
    }
    
    public Bundle addAccount(final AccountAuthenticatorResponse accountAuthenticatorResponse, final String s, final String s2, final String[] array, final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", (Parcelable)new Intent(this.a, (Class)LoginActivity.class).putExtra("add_account", true).putExtra("accountAuthenticatorResponse", (Parcelable)accountAuthenticatorResponse));
        return bundle2;
    }
    
    public Bundle confirmCredentials(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final Bundle bundle) {
        final Intent intent = new Intent(this.a, (Class)AuthenticatorActivity.class);
        intent.putExtra("username", account.name);
        intent.putExtra("confirm_credentials", true);
        intent.putExtra("accountAuthenticatorResponse", (Parcelable)accountAuthenticatorResponse);
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", (Parcelable)intent);
        return bundle2;
    }
    
    public Bundle editProperties(final AccountAuthenticatorResponse accountAuthenticatorResponse, final String s) {
        throw new UnsupportedOperationException();
    }
    
    public Bundle getAccountRemovalAllowed(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account) {
        if (p.f(this.a, account.name)) {
            this.a.startActivity(new Intent(this.a, (Class)RemoveAccountActivity.class).putExtra("RemoveAccountActivity_account_name", account.name).putExtra("authenticator_response", (Parcelable)accountAuthenticatorResponse).putExtra("from_system_settings", true).setFlags(268435456));
            return null;
        }
        final Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", true);
        return bundle;
    }
    
    public Bundle getAuthToken(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String s, final Bundle bundle) {
        if (!s.equals("com.twitter.android.oauth.token") && !s.equals("com.twitter.android.oauth.token.secret")) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "invalid authTokenType");
            return bundle2;
        }
        final String peekAuthToken = AccountManager.get(this.a).peekAuthToken(account, s);
        if (peekAuthToken != null) {
            final Bundle bundle3 = new Bundle();
            bundle3.putString("authAccount", account.name);
            bundle3.putString("accountType", com.twitter.library.util.a.a);
            bundle3.putString("authtoken", peekAuthToken);
            return bundle3;
        }
        final Intent intent = new Intent(this.a, (Class)AuthenticatorActivity.class);
        intent.putExtra("accountAuthenticatorResponse", (Parcelable)accountAuthenticatorResponse);
        intent.putExtra("username", account.name);
        intent.putExtra("auth_token_type", s);
        final Bundle bundle4 = new Bundle();
        bundle4.putParcelable("intent", (Parcelable)intent);
        return bundle4;
    }
    
    public String getAuthTokenLabel(final String s) {
        return this.a.getString(2131296321);
    }
    
    public Bundle hasFeatures(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String[] array) {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }
    
    public Bundle updateCredentials(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String s, final Bundle bundle) {
        final Intent intent = new Intent(this.a, (Class)AuthenticatorActivity.class);
        intent.putExtra("username", account.name);
        intent.putExtra("auth_token_type", s);
        intent.putExtra("confirm_credentials", false);
        intent.putExtra("accountAuthenticatorResponse", (Parcelable)accountAuthenticatorResponse);
        final Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", (Parcelable)intent);
        return bundle2;
    }
}
