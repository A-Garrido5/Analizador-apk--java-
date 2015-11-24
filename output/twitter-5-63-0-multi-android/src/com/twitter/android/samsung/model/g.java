// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import com.twitter.library.network.OAuthToken;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import java.io.IOException;
import com.twitter.library.api.bh;
import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.twitter.library.util.a;

@Deprecated
public class g
{
    public static final String a;
    
    static {
        a = com.twitter.library.util.a.a;
    }
    
    public static int a(final Context context) {
        return AccountManager.get(context).getAccountsByType(g.a).length;
    }
    
    public static Account a(final Context context, final String s) {
        for (final Account account : AccountManager.get(context).getAccountsByType(g.a)) {
            if (account.name.equals(s)) {
                return account;
            }
        }
        return null;
    }
    
    public static TwitterUser a(final AccountManager accountManager, final Account account) {
        try {
            return bh.b(accountManager.getUserData(account, "account_user_info"));
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static AccountManagerFuture b(final Context context, final String s) {
        final AccountManager value = AccountManager.get(context);
        final Account[] accountsByType = value.getAccountsByType(g.a);
        final int length = accountsByType.length;
        int n = 0;
        AccountManagerFuture removeAccount;
        while (true) {
            removeAccount = null;
            if (n >= length) {
                break;
            }
            final Account account = accountsByType[n];
            if (account.name.equals(s)) {
                removeAccount = value.removeAccount(account, (AccountManagerCallback)null, (Handler)null);
                break;
            }
            ++n;
        }
        return removeAccount;
    }
    
    public static OAuthToken b(final AccountManager accountManager, final Account account) {
        final String peekAuthToken = accountManager.peekAuthToken(account, "com.twitter.android.oauth.token");
        final String peekAuthToken2 = accountManager.peekAuthToken(account, "com.twitter.android.oauth.token.secret");
        if (peekAuthToken != null && peekAuthToken2 != null) {
            return new OAuthToken(peekAuthToken, peekAuthToken2);
        }
        return null;
    }
}
