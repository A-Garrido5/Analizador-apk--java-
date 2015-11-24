// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Arrays;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.twitter.library.api.UserSettings;
import android.content.ContentResolver;
import android.os.Bundle;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.api.TwitterUser;
import java.io.IOException;
import com.twitter.library.api.bh;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.content.Context;
import com.twitter.library.client.App;

public abstract class a
{
    public static final String a;
    private static boolean b;
    
    static {
        a = App.a(".auth.login");
    }
    
    public static Account a(final Context context, final long n) {
        final AccountManager value = AccountManager.get(context);
        for (final Account account : value.getAccountsByType(com.twitter.library.util.a.a)) {
            try {
                final String userData = value.getUserData(account, "account_user_info");
                if (userData != null) {
                    final TwitterUser b = bh.b(userData);
                    if (b != null && b.userId == n) {
                        return account;
                    }
                }
            }
            catch (IOException ex) {}
        }
        return null;
    }
    
    public static Account a(final Context context, final String s) {
        for (final Account account : AccountManager.get(context).getAccountsByType(com.twitter.library.util.a.a)) {
            if (account.name.equalsIgnoreCase(s)) {
                return account;
            }
        }
        return null;
    }
    
    public static Account a(final Context context, final String s, final OAuthToken oAuthToken, final String s2) {
        final AccountManager value = AccountManager.get(context);
        Account a = a(context, s);
        if (a == null) {
            a = new Account(s, com.twitter.library.util.a.a);
            if (!value.addAccountExplicitly(a, (String)null, (Bundle)null)) {
                return null;
            }
        }
        value.setPassword(a, (String)null);
        value.setUserData(a, "account_user_info", s2);
        value.setAuthToken(a, "com.twitter.android.oauth.token", oAuthToken.b);
        value.setAuthToken(a, "com.twitter.android.oauth.token.secret", oAuthToken.a);
        return a;
    }
    
    public static Account a(final String s) {
        return new Account(s, com.twitter.library.util.a.a);
    }
    
    public static TwitterUser a(final AccountManager accountManager, final Account account) {
        try {
            final String userData = accountManager.getUserData(account, "account_user_info");
            TwitterUser b = null;
            if (userData != null) {
                b = bh.b(userData);
            }
            return b;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static void a(final Account account, final String s, final boolean b) {
        if (account != null && !com.twitter.library.util.a.b) {
            ContentResolver.setSyncAutomatically(account, s, b);
        }
    }
    
    public static void a(final Context context, final String s, final TwitterUser twitterUser) {
        final AccountManager value = AccountManager.get(context);
        final Account a = a(context, s);
        if (a != null) {
            final String userData = value.getUserData(a, "account_user_info");
            final String a2 = bh.a(twitterUser);
            if (a2 != null && !a2.equals(userData)) {
                value.setUserData(a, "account_user_info", a2);
            }
        }
    }
    
    public static void a(final Context context, final String s, final TwitterUser twitterUser, final UserSettings userSettings) {
        final Account a = a(context, s);
        if (a != null) {
            final AccountManager value = AccountManager.get(context);
            if (twitterUser != null) {
                value.setUserData(a, "account_user_info", bh.a(twitterUser));
            }
            if (userSettings != null) {
                value.setUserData(a, "account_settings", userSettings.toString());
            }
        }
    }
    
    public static boolean a(final Context context, final String s, final String s2) {
        final Account a = a(context, s);
        return a != null && ContentResolver.getSyncAutomatically(a, s2);
    }
    
    public static Account[] a(final AccountManager accountManager) {
        return accountManager.getAccountsByType(com.twitter.library.util.a.a);
    }
    
    public static Account[] a(final Context context) {
        return a(AccountManager.get(context));
    }
    
    public static int b(final Context context) {
        return AccountManager.get(context).getAccountsByType(com.twitter.library.util.a.a).length;
    }
    
    public static AccountManagerFuture b(final Context context, final String s) {
        final AccountManager value = AccountManager.get(context);
        final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
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
    
    public static long[] c(final Context context) {
        int n = 0;
        final AccountManager value = AccountManager.get(context);
        final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
        final long[] array = new long[accountsByType.length];
        for (int length = accountsByType.length, i = 0; i < length; ++i) {
            final TwitterUser a = a(value, accountsByType[i]);
            if (a != null) {
                array[n] = a.a();
                ++n;
            }
        }
        if (accountsByType.length > n) {
            return Arrays.copyOf(array, n);
        }
        return array;
    }
}
