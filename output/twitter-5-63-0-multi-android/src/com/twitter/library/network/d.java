// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.util.ArrayList;
import java.util.List;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.content.Context;

public class d implements b
{
    private final Context a;
    
    d(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    private Account[] d() {
        final AccountManager value = AccountManager.get(this.a);
        if (value != null) {
            return value.getAccountsByType("com.google");
        }
        return new Account[0];
    }
    
    @Override
    public String a() {
        final String c = this.c();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            try {
                return com.google.android.gms.auth.d.a(this.a, c, "audience:server:client_id:695118608688-pm7k6hvatrgesugmkcti68kndb9e3tu6.apps.googleusercontent.com");
            }
            catch (Exception ex) {
                final String string = ae.a(this.a).h.toString();
                ScribeService.a(this.a, ((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(0L).a(ex, 2, null, string)).b(new String[] { "google_auth_token::::error" })).b(string));
            }
        }
        return null;
    }
    
    @Override
    public List b() {
        final Account[] d = this.d();
        final ArrayList list = new ArrayList<String>(d.length);
        for (int length = d.length, i = 0; i < length; ++i) {
            list.add(d[i].name);
        }
        return list;
    }
    
    @Override
    public String c() {
        final Account[] d = this.d();
        final int length = d.length;
        String name = null;
        if (length > 0) {
            name = d[0].name;
        }
        return name;
    }
}
